package org.eclipse.jdt.internal.jarinjarloader;

import java.net.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.jar.*;
import java.util.*;

public class JarRsrcLoader
{
    private static Class a;
    
    public static void main(final String[] array) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
        final a b = b();
        URL.setURLStreamHandlerFactory(new d(Thread.currentThread().getContextClassLoader()));
        final URL[] array2 = new URL[b.b.length];
        for (int i = 0; i < b.b.length; ++i) {
            final String s;
            if ((s = b.b[i]).endsWith("/")) {
                array2[i] = new URL("rsrc:".concat(String.valueOf(s)));
            }
            else {
                array2[i] = new URL("jar:rsrc:" + s + "!/");
            }
        }
        final URLClassLoader contextClassLoader = new URLClassLoader(array2, a());
        Thread.currentThread().setContextClassLoader(contextClassLoader);
        Class.forName(b.a, true, contextClassLoader).getMethod("main", array.getClass()).invoke(null, array);
    }
    
    private static ClassLoader a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
        try {
            Class a;
            if ((a = JarRsrcLoader.a) == null) {
                try {
                    a = (JarRsrcLoader.a = Class.forName("java.lang.ClassLoader"));
                }
                catch (ClassNotFoundException ex) {
                    throw new NoClassDefFoundError(ex.getMessage());
                }
            }
            return (ClassLoader)a.getMethod("getPlatformClassLoader", (Class[])null).invoke(null, (Object[])null);
        }
        catch (NoSuchMethodException ex2) {
            return null;
        }
    }
    
    private static a b() throws IOException {
        final Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources("META-INF/MANIFEST.MF");
        while (resources.hasMoreElements()) {
            try {
                final InputStream openStream;
                if ((openStream = resources.nextElement().openStream()) == null) {
                    continue;
                }
                final a a = new a((byte)0);
                final Attributes mainAttributes = new Manifest(openStream).getMainAttributes();
                a.a = mainAttributes.getValue("Rsrc-Main-Class");
                String value;
                if ((value = mainAttributes.getValue("Rsrc-Class-Path")) == null) {
                    value = "";
                }
                a.b = a(value);
                if (a.a != null && !a.a.trim().equals("")) {
                    return a;
                }
                continue;
            }
            catch (Exception ex) {}
        }
        System.err.println("Missing attributes for JarRsrcLoader in Manifest (Rsrc-Main-Class, Rsrc-Class-Path)");
        return null;
    }
    
    private static String[] a(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList<String> list = new ArrayList<String>();
        int n;
        for (int i = 0; i < s.length(); i = n + 1) {
            if ((n = s.indexOf(32, i)) == -1) {
                n = s.length();
            }
            if (n > i) {
                list.add(s.substring(i, n));
            }
        }
        final ArrayList<String> list2 = list;
        return (String[])list2.toArray((Object[])new String[list2.size()]);
    }
}

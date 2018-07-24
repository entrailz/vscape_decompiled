package uwotm8;

import javax.sound.midi.*;
import java.applet.*;
import java.net.*;
import java.io.*;

public final class al implements Runnable
{
    private static String j;
    private final int k = 524288;
    private static Sequencer l;
    private static Sequence m;
    private static Synthesizer n;
    public static int a;
    public static RandomAccessFile b;
    public static final RandomAccessFile[] c;
    public static boolean d;
    public static Applet e;
    private static boolean o;
    private static int p;
    private static InetAddress q;
    private static int r;
    private static int s;
    private static Runnable t;
    private static String u;
    public static String f;
    private static String v;
    private static String w;
    private static byte[] x;
    private static String y;
    public static int g;
    public static boolean h;
    public static String i;
    
    static {
        al.j = "/.vscape2/";
        al.l = null;
        al.m = null;
        al.n = null;
        al.b = null;
        c = new RandomAccessFile[6];
        al.e = null;
        al.s = 1;
        al.t = null;
        al.u = null;
        al.f = null;
        al.v = null;
        al.w = null;
        al.x = null;
        al.y = null;
        al.h = true;
    }
    
    public static String a() {
        if (new File(String.valueOf(System.getProperty("user.home")) + al.j).exists()) {
            return String.valueOf(System.getProperty("user.home")) + al.j;
        }
        new File(String.valueOf(System.getProperty("user.home")) + al.j).mkdir();
        return String.valueOf(System.getProperty("user.home")) + al.j;
    }
    
    public static void a(final InetAddress q) {
        al.p = (int)(Math.random() * 9.9999999E7);
        if (al.o) {
            try {
                Thread.sleep(500L);
            }
            catch (Exception ex) {}
            al.o = false;
        }
        al.r = 0;
        al.t = null;
        al.u = null;
        al.w = null;
        al.v = null;
        al.q = q;
        final Thread thread;
        (thread = new Thread(new al())).setDaemon(true);
        thread.start();
        while (!al.o) {
            try {
                Thread.sleep(50L);
            }
            catch (Exception ex2) {}
        }
    }
    
    @Override
    public final void run() {
        al.o = true;
        final String a;
        c(a = a());
        try {
            al.b = new RandomAccessFile(String.valueOf(a) + "main_file_cache.dat", "rw");
            for (int i = 0; i < 6; ++i) {
                al.c[i] = new RandomAccessFile(String.valueOf(a) + "main_file_cache.idx" + i, "rw");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        while (al.p == al.p) {
            if (al.t != null) {
                final Thread thread;
                (thread = new Thread(al.t)).setDaemon(true);
                thread.start();
                thread.setPriority(al.s);
                al.t = null;
            }
            else if (al.u != null) {
                try {
                    al.f = InetAddress.getByName(al.u).getHostName();
                }
                catch (Exception ex2) {
                    al.f = "unknown";
                }
                al.u = null;
            }
            try {
                Thread.sleep(50L);
            }
            catch (Exception ex3) {}
        }
    }
    
    private static int c(final String s) {
        try {
            final File file;
            if (!(file = new File(String.valueOf(s) + "uid.dat")).exists() || file.length() < 4L) {
                final DataOutputStream dataOutputStream;
                (dataOutputStream = new DataOutputStream(new FileOutputStream(String.valueOf(s) + "uid.dat"))).writeInt((int)(Math.random() * 9.9999999E7));
                dataOutputStream.close();
            }
        }
        catch (Exception ex) {}
        try {
            final DataInputStream dataInputStream;
            final int int1 = (dataInputStream = new DataInputStream(new FileInputStream(String.valueOf(s) + "uid.dat"))).readInt();
            dataInputStream.close();
            return int1 + 1;
        }
        catch (Exception ex2) {
            return 0;
        }
    }
    
    public static synchronized void a(final String s) {
        al.f = s;
        al.u = s;
    }
    
    public static void b(final String s) {
        System.out.println("Error: ".concat(String.valueOf(s)));
    }
}

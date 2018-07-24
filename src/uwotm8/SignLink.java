package uwotm8;

import javax.sound.midi.*;
import java.applet.*;
import java.net.*;
import java.io.*;

public final class SignLink implements Runnable
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
        SignLink.j = "/.vscape2/";
        SignLink.l = null;
        SignLink.m = null;
        SignLink.n = null;
        SignLink.b = null;
        c = new RandomAccessFile[6];
        SignLink.e = null;
        SignLink.s = 1;
        SignLink.t = null;
        SignLink.u = null;
        SignLink.f = null;
        SignLink.v = null;
        SignLink.w = null;
        SignLink.x = null;
        SignLink.y = null;
        SignLink.h = true;
    }
    
    public static String getLocalCacheDirectory() {
        if (new File(String.valueOf(System.getProperty("user.home")) + SignLink.j).exists()) {
            return String.valueOf(System.getProperty("user.home")) + SignLink.j;
        }
        new File(String.valueOf(System.getProperty("user.home")) + SignLink.j).mkdir();
        return String.valueOf(System.getProperty("user.home")) + SignLink.j;
    }
    
    public static void a(final InetAddress q) {
        SignLink.p = (int)(Math.random() * 9.9999999E7);
        if (SignLink.o) {
            try {
                Thread.sleep(500L);
            }
            catch (Exception ex) {}
            SignLink.o = false;
        }
        SignLink.r = 0;
        SignLink.t = null;
        SignLink.u = null;
        SignLink.w = null;
        SignLink.v = null;
        SignLink.q = q;
        final Thread thread;
        (thread = new Thread(new SignLink())).setDaemon(true);
        thread.start();
        while (!SignLink.o) {
            try {
                Thread.sleep(50L);
            }
            catch (Exception ex2) {}
        }
    }
    
    @Override
    public final void run() {
        SignLink.o = true;
        final String a;
        c(a = getLocalCacheDirectory());
        try {
            SignLink.b = new RandomAccessFile(String.valueOf(a) + "main_file_cache.dat", "rw");
            for (int i = 0; i < 6; ++i) {
                SignLink.c[i] = new RandomAccessFile(String.valueOf(a) + "main_file_cache.idx" + i, "rw");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        while (SignLink.p == SignLink.p) {
            if (SignLink.t != null) {
                final Thread thread;
                (thread = new Thread(SignLink.t)).setDaemon(true);
                thread.start();
                thread.setPriority(SignLink.s);
                SignLink.t = null;
            }
            else if (SignLink.u != null) {
                try {
                    SignLink.f = InetAddress.getByName(SignLink.u).getHostName();
                }
                catch (Exception ex2) {
                    SignLink.f = "unknown";
                }
                SignLink.u = null;
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
        SignLink.f = s;
        SignLink.u = s;
    }
    
    public static void b(final String s) {
        System.out.println("Error: ".concat(String.valueOf(s)));
    }
}

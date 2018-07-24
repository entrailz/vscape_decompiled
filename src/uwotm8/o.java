package uwotm8;

import java.util.*;

public final class o extends Rasterizer2D
{
    private byte[][] b;
    private int[] c;
    private int[] d;
    private int[] e;
    private int[] p;
    private int[] q;
    public int a;
    private Random r;
    private boolean s;
    
    public o(final boolean b, final String s, final Archive g) {
        this.b = new byte[256][];
        this.c = new int[256];
        this.d = new int[256];
        this.e = new int[256];
        this.p = new int[256];
        this.q = new int[256];
        this.r = new Random();
        this.s = false;
        System.out.println(s);
        final Buffer i = new Buffer(g.b(String.valueOf(s) + ".dat"));
        final Buffer j;
        (j = new Buffer(g.b("index.dat"))).b = i.g() + 4;
        final int e;
        if ((e = j.e()) > 0) {
            final Buffer k = j;
            k.b += 3 * (e - 1);
        }
        for (int l = 0; l < 256; ++l) {
            this.e[l] = j.e();
            this.p[l] = j.e();
            final int[] c = this.c;
            final int n = l;
            final int g2 = j.g();
            c[n] = g2;
            final int n2 = g2;
            final int[] d = this.d;
            final int n3 = l;
            final int g3 = j.g();
            d[n3] = g3;
            final int a = g3;
            final int e2 = j.e();
            final int n4 = n2 * a;
            this.b[l] = new byte[n4];
            if (e2 == 0) {
                for (int n5 = 0; n5 < n4; ++n5) {
                    this.b[l][n5] = i.f();
                }
            }
            else if (e2 == 1) {
                for (int n6 = 0; n6 < n2; ++n6) {
                    for (int n7 = 0; n7 < a; ++n7) {
                        this.b[l][n6 + n7 * n2] = i.f();
                    }
                }
            }
            if (a > this.a && l < 128) {
                this.a = a;
            }
            this.e[l] = 1;
            this.q[l] = n2 + 2;
            byte b2 = 0;
            for (int n8 = a / 7; n8 < a; ++n8) {
                b2 += this.b[l][n8 * n2];
            }
            if (b2 <= a / 7) {
                final int[] q = this.q;
                final int n9 = l;
                --q[n9];
                this.e[l] = 0;
            }
            byte b3 = 0;
            for (int n10 = a / 7; n10 < a; ++n10) {
                b3 += this.b[l][n2 - 1 + n10 * n2];
            }
            if (b3 <= a / 7) {
                final int[] q2 = this.q;
                final int n11 = l;
                --q2[n11];
            }
        }
        if (b) {
            this.q[32] = this.q[73];
            return;
        }
        this.q[32] = this.q[105];
    }
    
    public final void a(final String s, final int n, final int n2, final int n3) {
        this.b(n2, s, n3, 507 - this.b(s));
    }
    
    public final void a(final int n, final String s, final int n2, final int n3) {
        this.b(n, s, n2, n3 - this.b(s) / 2);
    }
    
    public final void a(final int n, final int n2, final String s, final int n3, final boolean b) {
        this.a(b, n2 - this.a(s) / 2, n, s, n3);
    }
    
    public final void b(final int n, final int n2, final String s, final int n3, final boolean b) {
        this.a(false, n2, 255, s, n3);
    }
    
    public final int a(final String s) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '@' && i + 4 < s.length() && s.charAt(i + 4) == '@') {
                i += 4;
            }
            else {
                int char1;
                if ((char1 = s.charAt(i)) > 255) {
                    char1 = 32;
                }
                n += this.q[char1];
            }
        }
        return n;
    }
    
    public final int b(final String s) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            int char1;
            if ((char1 = s.charAt(i)) > 255) {
                char1 = 32;
            }
            n += this.q[char1];
        }
        return n;
    }
    
    public final void b(final int n, final String s, int n2, int n3) {
        if (s == null) {
            return;
        }
        n2 -= this.a;
        for (int i = 0; i < s.length(); ++i) {
            int char1;
            if ((char1 = s.charAt(i)) > 255) {
                char1 = 32;
            }
            if (char1 != 32) {
                this.a(this.b[char1], n3 + this.e[char1], n2 + this.p[char1], this.c[char1], this.d[char1], n);
            }
            n3 += this.q[char1];
        }
    }
    
    public final void a(final int n, final String s, int n2, final int n3, int n4) {
        if (s == null) {
            return;
        }
        n2 -= this.b(s) / 2;
        n4 -= this.a;
        for (int i = 0; i < s.length(); ++i) {
            int char1;
            if ((char1 = s.charAt(i)) > 255) {
                char1 = 32;
            }
            if (char1 != 32) {
                this.a(this.b[char1], n2 + this.e[char1], n4 + this.p[char1] + (int)(Math.sin(i / 2.0 + n3 / 5.0) * 5.0), this.c[char1], this.d[char1], n);
            }
            n2 += this.q[char1];
        }
    }
    
    public final void b(int n, final String s, final int n2, int n3, final int n4) {
        if (s == null) {
            return;
        }
        n -= this.b(s) / 2;
        n3 -= this.a;
        for (int i = 0; i < s.length(); ++i) {
            int char1;
            if ((char1 = s.charAt(i)) > 255) {
                char1 = 32;
            }
            if (char1 != 32) {
                this.a(this.b[char1], n + this.e[char1] + (int)(Math.sin(i / 5.0 + n2 / 5.0) * 5.0), n3 + this.p[char1] + (int)(Math.sin(i / 3.0 + n2 / 5.0) * 5.0), this.c[char1], this.d[char1], n4);
            }
            n += this.q[char1];
        }
    }
    
    public final void a(int i, final String s, final int n, int n2, int n3, final int n4) {
        if (s == null) {
            return;
        }
        double n5;
        if ((n5 = 7.0 - i / 8.0) < 0.0) {
            n5 = 0.0;
        }
        n3 -= this.b(s) / 2;
        n2 -= this.a;
        int char1;
        for (i = 0; i < s.length(); ++i) {
            if ((char1 = s.charAt(i)) > 255) {
                char1 = 32;
            }
            if (char1 != 32) {
                this.a(this.b[char1], n3 + this.e[char1], n2 + this.p[char1] + (int)(Math.sin(i / 1.5 + n) * n5), this.c[char1], this.d[char1], n4);
            }
            n3 += this.q[char1];
        }
    }
    
    public final void a(final boolean b, int n, int n2, final String s, int n3) {
        this.s = false;
        final int n4 = n;
        if (s == null) {
            return;
        }
        n3 -= this.a;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '@' && i + 4 < s.length() && s.charAt(i + 4) == '@') {
                final int c;
                if ((c = this.c(s.substring(i + 1, i + 4))) != -1) {
                    n2 = c;
                }
                i += 4;
            }
            else {
                int char1;
                if ((char1 = s.charAt(i)) > 255) {
                    char1 = 32;
                }
                if (char1 != 32) {
                    if (b) {
                        this.a(this.b[char1], n + this.e[char1] + 1, n3 + this.p[char1] + 1, this.c[char1], this.d[char1], 0);
                    }
                    this.a(this.b[char1], n + this.e[char1], n3 + this.p[char1], this.c[char1], this.d[char1], n2);
                }
                n += this.q[char1];
            }
        }
        if (this.s) {
            uwotm8.Rasterizer2D.c(n3 + (int)(this.a * 0.7), 8388608, n - n4, n4);
        }
    }
    
    private int c(final String s) {
        if (s.equals("369")) {
            return 3368601;
        }
        if (s.equals("mon")) {
            return 65408;
        }
        if (s.equals("red")) {
            return 16711680;
        }
        if (s.equals("gre")) {
            return 65280;
        }
        if (s.equals("blu")) {
            return 255;
        }
        if (s.equals("ind")) {
            return 4809928;
        }
        if (s.equals("yel")) {
            return 16776960;
        }
        if (s.equals("cya")) {
            return 65535;
        }
        if (s.equals("mag")) {
            return 16711935;
        }
        if (s.equals("vio")) {
            return 7999717;
        }
        if (s.equals("whi")) {
            return 16777215;
        }
        if (s.equals("bla")) {
            return 0;
        }
        if (s.equals("lre")) {
            return 16748608;
        }
        if (s.equals("dre")) {
            return 8388608;
        }
        if (s.equals("dbl")) {
            return 128;
        }
        if (s.equals("or1")) {
            return 16756736;
        }
        if (s.equals("or2")) {
            return 16740352;
        }
        if (s.equals("or3")) {
            return 16723968;
        }
        if (s.equals("dor")) {
            return 9724672;
        }
        if (s.equals("gr1")) {
            return 12648192;
        }
        if (s.equals("gr2")) {
            return 8453888;
        }
        if (s.equals("gr3")) {
            return 4259584;
        }
        if (s.equals("glo")) {
            return 8270336;
        }
        if (s.equals("str")) {
            this.s = true;
        }
        if (s.equals("end")) {
            this.s = false;
        }
        return -1;
    }
    
    private void a(final byte[] array, int k, int i, int n, int n2, final int n3) {
        int n4 = k + i * uwotm8.o.g;
        int n5 = uwotm8.o.g - n;
        int n6 = 0;
        int n7 = 0;
        if (i < uwotm8.o.i) {
            final int n8 = uwotm8.o.i - i;
            n2 -= n8;
            i = uwotm8.o.i;
            n7 = 0 + n8 * n;
            n4 += n8 * uwotm8.o.g;
        }
        if (i + n2 >= uwotm8.o.j) {
            n2 -= i + n2 - uwotm8.o.j;
        }
        if (k < uwotm8.o.k) {
            final int n9 = uwotm8.o.k - k;
            n -= n9;
            k = uwotm8.o.k;
            n7 += n9;
            n4 += n9;
            n6 = n9 + 0;
            n5 += n9;
        }
        if (k + n >= uwotm8.o.l) {
            final int n10 = k + n - uwotm8.o.l;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            a(uwotm8.o.f, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    private static void a(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, int i, final int n5, final int n6) {
        final int n7 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        int j;
        int k;
        for (i = -i; i < 0; ++i) {
            for (j = n7; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n5;
            n2 += n6;
        }
    }
}

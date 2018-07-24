package uwotm8;

import com.runescape.*;

public final class r extends p
{
    public static boolean a;
    public static boolean b;
    private static boolean y;
    public static boolean c;
    public static int d;
    public static int e;
    public static int p;
    private static int[] z;
    public static final int[] q;
    public static int[] r;
    public static int[] s;
    public static int[] t;
    private static int A;
    public static k[] u;
    private static boolean[] B;
    private static int[] C;
    private static int D;
    private static int[][] E;
    private static int[][] F;
    public static int[] v;
    public static int w;
    public static int[] x;
    private static int[][] G;
    
    static {
        uwotm8.r.a = true;
        uwotm8.r.c = true;
        uwotm8.r.u = new k[51];
        uwotm8.r.B = new boolean[51];
        uwotm8.r.C = new int[51];
        uwotm8.r.F = new int[51][];
        uwotm8.r.v = new int[51];
        uwotm8.r.x = new int[65536];
        uwotm8.r.G = new int[51][];
        uwotm8.r.z = new int[512];
        q = new int[2048];
        uwotm8.r.r = new int[2048];
        uwotm8.r.s = new int[2048];
        for (int i = 1; i < 512; ++i) {
            uwotm8.r.z[i] = 32768 / i;
        }
        for (int j = 1; j < 2048; ++j) {
            uwotm8.r.q[j] = 65536 / j;
        }
        for (int k = 0; k < 2048; ++k) {
            uwotm8.r.r[k] = (int)(65536.0 * Math.sin(k * 0.0030679615));
            uwotm8.r.s[k] = (int)(65536.0 * Math.cos(k * 0.0030679615));
        }
    }
    
    public static void a() {
        uwotm8.r.z = null;
        uwotm8.r.z = null;
        uwotm8.r.r = null;
        uwotm8.r.s = null;
        uwotm8.r.t = null;
        uwotm8.r.u = null;
        uwotm8.r.B = null;
        uwotm8.r.C = null;
        uwotm8.r.E = null;
        uwotm8.r.F = null;
        uwotm8.r.v = null;
        uwotm8.r.x = null;
        uwotm8.r.G = null;
    }
    
    public static void b() {
        uwotm8.r.t = new int[uwotm8.p.h];
        for (int i = 0; i < uwotm8.p.h; ++i) {
            uwotm8.r.t[i] = uwotm8.p.g * i;
        }
        uwotm8.r.e = uwotm8.p.g / 2;
        uwotm8.r.p = uwotm8.p.h / 2;
    }
    
    public static void a(final int n, final int n2) {
        uwotm8.r.t = new int[n2];
        for (int i = 0; i < n2; ++i) {
            uwotm8.r.t[i] = n * i;
        }
        uwotm8.r.e = n / 2;
        uwotm8.r.p = n2 / 2;
    }
    
    public static void c() {
        uwotm8.r.E = null;
        for (int i = 0; i < 51; ++i) {
            uwotm8.r.F[i] = null;
        }
    }
    
    public static void d() {
        if (uwotm8.r.E == null) {
            uwotm8.r.D = 20;
            if (uwotm8.r.a) {
                uwotm8.r.E = new int[uwotm8.r.D][16384];
            }
            else {
                uwotm8.r.E = new int[uwotm8.r.D][65536];
            }
            for (int i = 0; i < 51; ++i) {
                uwotm8.r.F[i] = null;
            }
        }
    }
    
    public static void a(final G_1 g) {
        uwotm8.r.A = 0;
        for (int i = 0; i < 51; ++i) {
            try {
                uwotm8.r.u[i] = new k(g, String.valueOf(i), 0);
                if (uwotm8.r.a && uwotm8.r.u[i].e == 128) {
                    uwotm8.r.u[i].a();
                }
                else {
                    uwotm8.r.u[i].b();
                }
                ++uwotm8.r.A;
            }
            catch (Exception ex) {}
        }
    }
    
    public static int a(final int n) {
        if (uwotm8.r.C[n] != 0) {
            return uwotm8.r.C[n];
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        final int length = uwotm8.r.G[n].length;
        for (int i = 0; i < length; ++i) {
            n2 += (uwotm8.r.G[n][i] >> 16 & 0xFF);
            n3 += (uwotm8.r.G[n][i] >> 8 & 0xFF);
            n4 += (uwotm8.r.G[n][i] & 0xFF);
        }
        int a;
        if ((a = a((n2 / length << 16) + (n3 / length << 8) + n4 / length, 1.4)) == 0) {
            a = 1;
        }
        return uwotm8.r.C[n] = a;
    }
    
    public static void b(final int n) {
        if (uwotm8.r.F[n] == null) {
            return;
        }
        uwotm8.r.E[uwotm8.r.D++] = uwotm8.r.F[n];
        uwotm8.r.F[n] = null;
    }
    
    public static void a(double n) {
        n += Math.random() * 0.03 - 0.015;
        int n2 = 0;
        for (int i = 0; i < 512; ++i) {
            final double n3 = i / 8 / 64.0 + 0.0078125;
            final double n4 = (i & 0x7) / 8.0 + 0.0625;
            for (int j = 0; j < 128; ++j) {
                double n8;
                double n7;
                double n6;
                final double n5 = n6 = (n7 = (n8 = j / 128.0));
                if (n4 != 0.0) {
                    double n9;
                    if (n5 < 0.5) {
                        n9 = n5 * (n4 + 1.0);
                    }
                    else {
                        n9 = n5 + n4 - n5 * n4;
                    }
                    final double n10 = n5 * 2.0 - n9;
                    double n11;
                    if ((n11 = n3 + 0.3333333333333333) > 1.0) {
                        --n11;
                    }
                    final double n12 = n3;
                    double n13;
                    if ((n13 = n3 - 0.3333333333333333) < 0.0) {
                        ++n13;
                    }
                    if (n11 * 6.0 < 1.0) {
                        n8 = n10 + (n9 - n10) * 6.0 * n11;
                    }
                    else if (n11 * 2.0 < 1.0) {
                        n8 = n9;
                    }
                    else if (n11 * 3.0 < 2.0) {
                        n8 = n10 + (n9 - n10) * (0.6666666666666666 - n11) * 6.0;
                    }
                    else {
                        n8 = n10;
                    }
                    if (n12 * 6.0 < 1.0) {
                        n7 = n10 + (n9 - n10) * 6.0 * n12;
                    }
                    else if (n12 * 2.0 < 1.0) {
                        n7 = n9;
                    }
                    else if (n12 * 3.0 < 2.0) {
                        n7 = n10 + (n9 - n10) * (0.6666666666666666 - n12) * 6.0;
                    }
                    else {
                        n7 = n10;
                    }
                    if (n13 * 6.0 < 1.0) {
                        n6 = n10 + (n9 - n10) * 6.0 * n13;
                    }
                    else if (n13 * 2.0 < 1.0) {
                        n6 = n9;
                    }
                    else if (n13 * 3.0 < 2.0) {
                        n6 = n10 + (n9 - n10) * (0.6666666666666666 - n13) * 6.0;
                    }
                    else {
                        n6 = n10;
                    }
                }
                int a;
                if ((a = a(((int)(n8 * 256.0) << 16) + ((int)(n7 * 256.0) << 8) + (int)(n6 * 256.0), n)) == 0) {
                    a = 1;
                }
                uwotm8.r.x[n2++] = a;
            }
        }
        for (int k = 0; k < 51; ++k) {
            if (uwotm8.r.u[k] != null) {
                final int[] b = uwotm8.r.u[k].b;
                uwotm8.r.G[k] = new int[b.length];
                for (int l = 0; l < b.length; ++l) {
                    uwotm8.r.G[k][l] = a(b[l], n);
                    if ((uwotm8.r.G[k][l] & 0xF8F8FF) == 0x0 && l != 0) {
                        uwotm8.r.G[k][l] = 1;
                    }
                }
            }
        }
        for (int n14 = 0; n14 < 51; ++n14) {
            b(n14);
        }
    }
    
    private static int a(int n, final double n2) {
        final double n3 = (n >> 16) / 256.0;
        final double n4 = (n >> 8 & 0xFF) / 256.0;
        final double n5 = (n & 0xFF) / 256.0;
        final double pow = Math.pow(n3, n2);
        final double pow2 = Math.pow(n4, n2);
        final double pow3 = Math.pow(n5, n2);
        n = (int)(pow * 256.0);
        return (n << 16) + ((int)(pow2 * 256.0) << 8) + (int)(pow3 * 256.0);
    }
    
    public static void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        final int n10 = n;
        final int n11 = n2;
        final int n12 = n3;
        final int n13 = n4;
        final int n14 = n5;
        final int n15 = n6;
        final int n16 = n7;
        final int n17 = n8;
        n9 = n9;
        n8 = n17;
        n7 = n16;
        n6 = n15;
        n5 = n14;
        n4 = n13;
        n3 = n12;
        n2 = n11;
        n = n10;
        int n18 = 0;
        int n19 = 0;
        if (n2 != n) {
            n18 = (n5 - n4 << 16) / (n2 - n);
            n19 = (n8 - n7 << 15) / (n2 - n);
        }
        int n20 = 0;
        int n21 = 0;
        if (n3 != n2) {
            n20 = (n6 - n5 << 16) / (n3 - n2);
            n21 = (n9 - n8 << 15) / (n3 - n2);
        }
        int n22 = 0;
        int n23 = 0;
        if (n3 != n) {
            n22 = (n4 - n6 << 16) / (n - n3);
            n23 = (n7 - n9 << 15) / (n - n3);
        }
        if (n <= n2 && n <= n3) {
            if (n < uwotm8.p.j) {
                if (n2 > uwotm8.p.j) {
                    n2 = uwotm8.p.j;
                }
                if (n3 > uwotm8.p.j) {
                    n3 = uwotm8.p.j;
                }
                if (n2 < n3) {
                    n4 = (n6 = n4 << 16);
                    n7 = (n9 = n7 << 15);
                    if (n < 0) {
                        n6 -= n22 * n;
                        n4 -= n18 * n;
                        n9 -= n23 * n;
                        n7 -= n19 * n;
                        n = 0;
                    }
                    n5 <<= 16;
                    n8 <<= 15;
                    if (n2 < 0) {
                        n5 -= n20 * n2;
                        n8 -= n21 * n2;
                        n2 = 0;
                    }
                    if ((n != n2 && n22 < n18) || (n == n2 && n22 > n20)) {
                        n3 -= n2;
                        n2 -= n;
                        n = uwotm8.r.t[n];
                        while (--n2 >= 0) {
                            a(uwotm8.p.f, n, n6 >> 16, n4 >> 16, n9 >> 7, n7 >> 7);
                            n6 += n22;
                            n4 += n18;
                            n9 += n23;
                            n7 += n19;
                            n += uwotm8.p.g;
                        }
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, n, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                            n6 += n22;
                            n5 += n20;
                            n9 += n23;
                            n8 += n21;
                            n += uwotm8.p.g;
                        }
                        return;
                    }
                    n3 -= n2;
                    n2 -= n;
                    n = uwotm8.r.t[n];
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n, n4 >> 16, n6 >> 16, n7 >> 7, n9 >> 7);
                        n6 += n22;
                        n4 += n18;
                        n9 += n23;
                        n7 += n19;
                        n += uwotm8.p.g;
                    }
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                        n6 += n22;
                        n5 += n20;
                        n9 += n23;
                        n8 += n21;
                        n += uwotm8.p.g;
                    }
                }
                else {
                    n4 = (n5 = n4 << 16);
                    n7 = (n8 = n7 << 15);
                    if (n < 0) {
                        n5 -= n22 * n;
                        n4 -= n18 * n;
                        n8 -= n23 * n;
                        n7 -= n19 * n;
                        n = 0;
                    }
                    n6 <<= 16;
                    n9 <<= 15;
                    if (n3 < 0) {
                        n6 -= n20 * n3;
                        n9 -= n21 * n3;
                        n3 = 0;
                    }
                    if ((n != n3 && n22 < n18) || (n == n3 && n20 > n18)) {
                        n2 -= n3;
                        n3 -= n;
                        n = uwotm8.r.t[n];
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, n, n5 >> 16, n4 >> 16, n8 >> 7, n7 >> 7);
                            n5 += n22;
                            n4 += n18;
                            n8 += n23;
                            n7 += n19;
                            n += uwotm8.p.g;
                        }
                        while (--n2 >= 0) {
                            a(uwotm8.p.f, n, n6 >> 16, n4 >> 16, n9 >> 7, n7 >> 7);
                            n6 += n20;
                            n4 += n18;
                            n9 += n21;
                            n7 += n19;
                            n += uwotm8.p.g;
                        }
                        return;
                    }
                    n2 -= n3;
                    n3 -= n;
                    n = uwotm8.r.t[n];
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n, n4 >> 16, n5 >> 16, n7 >> 7, n8 >> 7);
                        n5 += n22;
                        n4 += n18;
                        n8 += n23;
                        n7 += n19;
                        n += uwotm8.p.g;
                    }
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n, n4 >> 16, n6 >> 16, n7 >> 7, n9 >> 7);
                        n6 += n20;
                        n4 += n18;
                        n9 += n21;
                        n7 += n19;
                        n += uwotm8.p.g;
                    }
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 < uwotm8.p.j) {
                if (n3 > uwotm8.p.j) {
                    n3 = uwotm8.p.j;
                }
                if (n > uwotm8.p.j) {
                    n = uwotm8.p.j;
                }
                if (n3 < n) {
                    n5 = (n4 = n5 << 16);
                    n8 = (n7 = n8 << 15);
                    if (n2 < 0) {
                        n4 -= n18 * n2;
                        n5 -= n20 * n2;
                        n7 -= n19 * n2;
                        n8 -= n21 * n2;
                        n2 = 0;
                    }
                    n6 <<= 16;
                    n9 <<= 15;
                    if (n3 < 0) {
                        n6 -= n22 * n3;
                        n9 -= n23 * n3;
                        n3 = 0;
                    }
                    if ((n2 != n3 && n18 < n20) || (n2 == n3 && n18 > n22)) {
                        n -= n3;
                        n3 -= n2;
                        n2 = uwotm8.r.t[n2];
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, n2, n4 >> 16, n5 >> 16, n7 >> 7, n8 >> 7);
                            n4 += n18;
                            n5 += n20;
                            n7 += n19;
                            n8 += n21;
                            n2 += uwotm8.p.g;
                        }
                        while (--n >= 0) {
                            a(uwotm8.p.f, n2, n4 >> 16, n6 >> 16, n7 >> 7, n9 >> 7);
                            n4 += n18;
                            n6 += n22;
                            n7 += n19;
                            n9 += n23;
                            n2 += uwotm8.p.g;
                        }
                        return;
                    }
                    n -= n3;
                    n3 -= n2;
                    n2 = uwotm8.r.t[n2];
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n2, n5 >> 16, n4 >> 16, n8 >> 7, n7 >> 7);
                        n4 += n18;
                        n5 += n20;
                        n7 += n19;
                        n8 += n21;
                        n2 += uwotm8.p.g;
                    }
                    while (--n >= 0) {
                        a(uwotm8.p.f, n2, n6 >> 16, n4 >> 16, n9 >> 7, n7 >> 7);
                        n4 += n18;
                        n6 += n22;
                        n7 += n19;
                        n9 += n23;
                        n2 += uwotm8.p.g;
                    }
                }
                else {
                    n5 = (n6 = n5 << 16);
                    n8 = (n9 = n8 << 15);
                    if (n2 < 0) {
                        n6 -= n18 * n2;
                        n5 -= n20 * n2;
                        n9 -= n19 * n2;
                        n8 -= n21 * n2;
                        n2 = 0;
                    }
                    n4 <<= 16;
                    n7 <<= 15;
                    if (n < 0) {
                        n4 -= n22 * n;
                        n7 -= n23 * n;
                        n = 0;
                    }
                    if (n18 < n20) {
                        n3 -= n;
                        n -= n2;
                        n2 = uwotm8.r.t[n2];
                        while (--n >= 0) {
                            a(uwotm8.p.f, n2, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                            n6 += n18;
                            n5 += n20;
                            n9 += n19;
                            n8 += n21;
                            n2 += uwotm8.p.g;
                        }
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, n2, n4 >> 16, n5 >> 16, n7 >> 7, n8 >> 7);
                            n4 += n22;
                            n5 += n20;
                            n7 += n23;
                            n8 += n21;
                            n2 += uwotm8.p.g;
                        }
                        return;
                    }
                    n3 -= n;
                    n -= n2;
                    n2 = uwotm8.r.t[n2];
                    while (--n >= 0) {
                        a(uwotm8.p.f, n2, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                        n6 += n18;
                        n5 += n20;
                        n9 += n19;
                        n8 += n21;
                        n2 += uwotm8.p.g;
                    }
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n2, n5 >> 16, n4 >> 16, n8 >> 7, n7 >> 7);
                        n4 += n22;
                        n5 += n20;
                        n7 += n23;
                        n8 += n21;
                        n2 += uwotm8.p.g;
                    }
                }
            }
        }
        else if (n3 < uwotm8.p.j) {
            if (n > uwotm8.p.j) {
                n = uwotm8.p.j;
            }
            if (n2 > uwotm8.p.j) {
                n2 = uwotm8.p.j;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 16);
                n9 = (n8 = n9 << 15);
                if (n3 < 0) {
                    n5 -= n20 * n3;
                    n6 -= n22 * n3;
                    n8 -= n21 * n3;
                    n9 -= n23 * n3;
                    n3 = 0;
                }
                n4 <<= 16;
                n7 <<= 15;
                if (n < 0) {
                    n4 -= n18 * n;
                    n7 -= n19 * n;
                    n = 0;
                }
                if (n20 < n22) {
                    n2 -= n;
                    n -= n3;
                    n3 = uwotm8.r.t[n3];
                    while (--n >= 0) {
                        a(uwotm8.p.f, n3, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                        n5 += n20;
                        n6 += n22;
                        n8 += n21;
                        n9 += n23;
                        n3 += uwotm8.p.g;
                    }
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n3, n5 >> 16, n4 >> 16, n8 >> 7, n7 >> 7);
                        n5 += n20;
                        n4 += n18;
                        n8 += n21;
                        n7 += n19;
                        n3 += uwotm8.p.g;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = uwotm8.r.t[n3];
                while (--n >= 0) {
                    a(uwotm8.p.f, n3, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                    n5 += n20;
                    n6 += n22;
                    n8 += n21;
                    n9 += n23;
                    n3 += uwotm8.p.g;
                }
                while (--n2 >= 0) {
                    a(uwotm8.p.f, n3, n4 >> 16, n5 >> 16, n7 >> 7, n8 >> 7);
                    n5 += n20;
                    n4 += n18;
                    n8 += n21;
                    n7 += n19;
                    n3 += uwotm8.p.g;
                }
            }
            else {
                n6 = (n4 = n6 << 16);
                n9 = (n7 = n9 << 15);
                if (n3 < 0) {
                    n4 -= n20 * n3;
                    n6 -= n22 * n3;
                    n7 -= n21 * n3;
                    n9 -= n23 * n3;
                    n3 = 0;
                }
                n5 <<= 16;
                n8 <<= 15;
                if (n2 < 0) {
                    n5 -= n18 * n2;
                    n8 -= n19 * n2;
                    n2 = 0;
                }
                if (n20 < n22) {
                    n -= n2;
                    n2 -= n3;
                    n3 = uwotm8.r.t[n3];
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n3, n4 >> 16, n6 >> 16, n7 >> 7, n9 >> 7);
                        n4 += n20;
                        n6 += n22;
                        n7 += n21;
                        n9 += n23;
                        n3 += uwotm8.p.g;
                    }
                    while (--n >= 0) {
                        a(uwotm8.p.f, n3, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                        n5 += n18;
                        n6 += n22;
                        n8 += n19;
                        n9 += n23;
                        n3 += uwotm8.p.g;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = uwotm8.r.t[n3];
                while (--n2 >= 0) {
                    a(uwotm8.p.f, n3, n6 >> 16, n4 >> 16, n9 >> 7, n7 >> 7);
                    n4 += n20;
                    n6 += n22;
                    n7 += n21;
                    n9 += n23;
                    n3 += uwotm8.p.g;
                }
                while (--n >= 0) {
                    a(uwotm8.p.f, n3, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                    n5 += n18;
                    n6 += n22;
                    n8 += n19;
                    n9 += n23;
                    n3 += uwotm8.p.g;
                }
            }
        }
    }
    
    private static void a(final int[] array, int n, int n2, int n3, int n4, int n5) {
        if (uwotm8.r.c) {
            int n7;
            int n8;
            if (uwotm8.r.b) {
                int n6;
                if (n3 - n2 > 3) {
                    n6 = (n5 - n4) / (n3 - n2);
                }
                else {
                    n6 = 0;
                }
                if (n3 > uwotm8.p.m) {
                    n3 = uwotm8.p.m;
                }
                if (n2 < 0) {
                    n4 -= n2 * n6;
                    n2 = 0;
                }
                if (n2 >= n3) {
                    return;
                }
                n += n2;
                n7 = n3 - n2 >> 2;
                n8 = n6 << 2;
            }
            else {
                if (n2 >= n3) {
                    return;
                }
                n += n2;
                if ((n7 = n3 - n2 >> 2) > 0) {
                    n8 = (n5 - n4) * uwotm8.r.z[n7] >> 15;
                }
                else {
                    n8 = 0;
                }
            }
            if (uwotm8.r.d == 0) {
                while (--n7 >= 0) {
                    n5 = uwotm8.r.x[n4 >> 8];
                    n4 += n8;
                    array[n++] = n5;
                    array[n++] = n5;
                    array[n++] = n5;
                    array[n++] = n5;
                }
                int n9;
                if ((n9 = (n3 - n2 & 0x3)) > 0) {
                    n5 = uwotm8.r.x[n4 >> 8];
                    do {
                        array[n++] = n5;
                    } while (--n9 > 0);
                }
            }
            else {
                final int d = uwotm8.r.d;
                final int n10 = 256 - uwotm8.r.d;
                while (--n7 >= 0) {
                    n5 = uwotm8.r.x[n4 >> 8];
                    n4 += n8;
                    n5 = ((n5 & 0xFF00FF) * n10 >> 8 & 0xFF00FF) + ((n5 & 0xFF00) * n10 >> 8 & 0xFF00);
                    array[n++] = n5 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
                    array[n++] = n5 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
                    array[n++] = n5 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
                    array[n++] = n5 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
                }
                int n11;
                if ((n11 = (n3 - n2 & 0x3)) > 0) {
                    n5 = (((n5 = uwotm8.r.x[n4 >> 8]) & 0xFF00FF) * n10 >> 8 & 0xFF00FF) + ((n5 & 0xFF00) * n10 >> 8 & 0xFF00);
                    do {
                        array[n++] = n5 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
                    } while (--n11 > 0);
                }
            }
            return;
        }
        if (n2 >= n3) {
            return;
        }
        final int n12 = (n5 - n4) / (n3 - n2);
        if (uwotm8.r.b) {
            if (n3 > uwotm8.p.m) {
                n3 = uwotm8.p.m;
            }
            if (n2 < 0) {
                n4 -= n2 * n12;
                n2 = 0;
            }
            if (n2 >= n3) {
                return;
            }
        }
        n += n2;
        int n13 = n3 - n2;
        if (uwotm8.r.d == 0) {
            do {
                array[n++] = uwotm8.r.x[n4 >> 8];
                n4 += n12;
            } while (--n13 > 0);
            return;
        }
        final int d2 = uwotm8.r.d;
        final int n14 = 256 - uwotm8.r.d;
        do {
            n5 = uwotm8.r.x[n4 >> 8];
            n4 += n12;
            n5 = ((n5 & 0xFF00FF) * n14 >> 8 & 0xFF00FF) + ((n5 & 0xFF00) * n14 >> 8 & 0xFF00);
            array[n++] = n5 + ((array[n] & 0xFF00FF) * d2 >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d2 >> 8 & 0xFF00);
        } while (--n13 > 0);
    }
    
    public static void a(int n, int n2, int n3, int n4, int n5, int n6, final int n7) {
        int n8 = 0;
        if (n2 != n) {
            n8 = (n5 - n4 << 16) / (n2 - n);
        }
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 16) / (n3 - n2);
        }
        int n10 = 0;
        if (n3 != n) {
            n10 = (n4 - n6 << 16) / (n - n3);
        }
        if (n <= n2 && n <= n3) {
            if (n >= uwotm8.p.j) {
                return;
            }
            if (n2 > uwotm8.p.j) {
                n2 = uwotm8.p.j;
            }
            if (n3 > uwotm8.p.j) {
                n3 = uwotm8.p.j;
            }
            if (n2 < n3) {
                n4 = (n6 = n4 << 16);
                if (n < 0) {
                    n6 -= n10 * n;
                    n4 -= n8 * n;
                    n = 0;
                }
                n5 <<= 16;
                if (n2 < 0) {
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                if ((n != n2 && n10 < n8) || (n == n2 && n10 > n9)) {
                    n3 -= n2;
                    n2 -= n;
                    n = uwotm8.r.t[n];
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n, n7, n6 >> 16, n4 >> 16);
                        n6 += n10;
                        n4 += n8;
                        n += uwotm8.p.g;
                    }
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n, n7, n6 >> 16, n5 >> 16);
                        n6 += n10;
                        n5 += n9;
                        n += uwotm8.p.g;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = uwotm8.r.t[n];
                while (--n2 >= 0) {
                    a(uwotm8.p.f, n, n7, n4 >> 16, n6 >> 16);
                    n6 += n10;
                    n4 += n8;
                    n += uwotm8.p.g;
                }
                while (--n3 >= 0) {
                    a(uwotm8.p.f, n, n7, n5 >> 16, n6 >> 16);
                    n6 += n10;
                    n5 += n9;
                    n += uwotm8.p.g;
                }
            }
            else {
                n4 = (n5 = n4 << 16);
                if (n < 0) {
                    n5 -= n10 * n;
                    n4 -= n8 * n;
                    n = 0;
                }
                n6 <<= 16;
                if (n3 < 0) {
                    n6 -= n9 * n3;
                    n3 = 0;
                }
                if ((n != n3 && n10 < n8) || (n == n3 && n9 > n8)) {
                    n2 -= n3;
                    n3 -= n;
                    n = uwotm8.r.t[n];
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n, n7, n5 >> 16, n4 >> 16);
                        n5 += n10;
                        n4 += n8;
                        n += uwotm8.p.g;
                    }
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n, n7, n6 >> 16, n4 >> 16);
                        n6 += n9;
                        n4 += n8;
                        n += uwotm8.p.g;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = uwotm8.r.t[n];
                while (--n3 >= 0) {
                    a(uwotm8.p.f, n, n7, n4 >> 16, n5 >> 16);
                    n5 += n10;
                    n4 += n8;
                    n += uwotm8.p.g;
                }
                while (--n2 >= 0) {
                    a(uwotm8.p.f, n, n7, n4 >> 16, n6 >> 16);
                    n6 += n9;
                    n4 += n8;
                    n += uwotm8.p.g;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= uwotm8.p.j) {
                return;
            }
            if (n3 > uwotm8.p.j) {
                n3 = uwotm8.p.j;
            }
            if (n > uwotm8.p.j) {
                n = uwotm8.p.j;
            }
            if (n3 < n) {
                n5 = (n4 = n5 << 16);
                if (n2 < 0) {
                    n4 -= n8 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                if (n3 < 0) {
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                if ((n2 != n3 && n8 < n9) || (n2 == n3 && n8 > n10)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = uwotm8.r.t[n2];
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n2, n7, n4 >> 16, n5 >> 16);
                        n4 += n8;
                        n5 += n9;
                        n2 += uwotm8.p.g;
                    }
                    while (--n >= 0) {
                        a(uwotm8.p.f, n2, n7, n4 >> 16, n6 >> 16);
                        n4 += n8;
                        n6 += n10;
                        n2 += uwotm8.p.g;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = uwotm8.r.t[n2];
                while (--n3 >= 0) {
                    a(uwotm8.p.f, n2, n7, n5 >> 16, n4 >> 16);
                    n4 += n8;
                    n5 += n9;
                    n2 += uwotm8.p.g;
                }
                while (--n >= 0) {
                    a(uwotm8.p.f, n2, n7, n6 >> 16, n4 >> 16);
                    n4 += n8;
                    n6 += n10;
                    n2 += uwotm8.p.g;
                }
            }
            else {
                n5 = (n6 = n5 << 16);
                if (n2 < 0) {
                    n6 -= n8 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n4 <<= 16;
                if (n < 0) {
                    n4 -= n10 * n;
                    n = 0;
                }
                if (n8 < n9) {
                    n3 -= n;
                    n -= n2;
                    n2 = uwotm8.r.t[n2];
                    while (--n >= 0) {
                        a(uwotm8.p.f, n2, n7, n6 >> 16, n5 >> 16);
                        n6 += n8;
                        n5 += n9;
                        n2 += uwotm8.p.g;
                    }
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, n2, n7, n4 >> 16, n5 >> 16);
                        n4 += n10;
                        n5 += n9;
                        n2 += uwotm8.p.g;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = uwotm8.r.t[n2];
                while (--n >= 0) {
                    a(uwotm8.p.f, n2, n7, n5 >> 16, n6 >> 16);
                    n6 += n8;
                    n5 += n9;
                    n2 += uwotm8.p.g;
                }
                while (--n3 >= 0) {
                    a(uwotm8.p.f, n2, n7, n5 >> 16, n4 >> 16);
                    n4 += n10;
                    n5 += n9;
                    n2 += uwotm8.p.g;
                }
            }
        }
        else {
            if (n3 >= uwotm8.p.j) {
                return;
            }
            if (n > uwotm8.p.j) {
                n = uwotm8.p.j;
            }
            if (n2 > uwotm8.p.j) {
                n2 = uwotm8.p.j;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 16);
                if (n3 < 0) {
                    n5 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n4 <<= 16;
                if (n < 0) {
                    n4 -= n8 * n;
                    n = 0;
                }
                if (n9 < n10) {
                    n2 -= n;
                    n -= n3;
                    n3 = uwotm8.r.t[n3];
                    while (--n >= 0) {
                        a(uwotm8.p.f, n3, n7, n5 >> 16, n6 >> 16);
                        n5 += n9;
                        n6 += n10;
                        n3 += uwotm8.p.g;
                    }
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n3, n7, n5 >> 16, n4 >> 16);
                        n5 += n9;
                        n4 += n8;
                        n3 += uwotm8.p.g;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = uwotm8.r.t[n3];
                while (--n >= 0) {
                    a(uwotm8.p.f, n3, n7, n6 >> 16, n5 >> 16);
                    n5 += n9;
                    n6 += n10;
                    n3 += uwotm8.p.g;
                }
                while (--n2 >= 0) {
                    a(uwotm8.p.f, n3, n7, n4 >> 16, n5 >> 16);
                    n5 += n9;
                    n4 += n8;
                    n3 += uwotm8.p.g;
                }
            }
            else {
                n6 = (n4 = n6 << 16);
                if (n3 < 0) {
                    n4 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n5 <<= 16;
                if (n2 < 0) {
                    n5 -= n8 * n2;
                    n2 = 0;
                }
                if (n9 < n10) {
                    n -= n2;
                    n2 -= n3;
                    n3 = uwotm8.r.t[n3];
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, n3, n7, n4 >> 16, n6 >> 16);
                        n4 += n9;
                        n6 += n10;
                        n3 += uwotm8.p.g;
                    }
                    while (--n >= 0) {
                        a(uwotm8.p.f, n3, n7, n5 >> 16, n6 >> 16);
                        n5 += n8;
                        n6 += n10;
                        n3 += uwotm8.p.g;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = uwotm8.r.t[n3];
                while (--n2 >= 0) {
                    a(uwotm8.p.f, n3, n7, n6 >> 16, n4 >> 16);
                    n4 += n9;
                    n6 += n10;
                    n3 += uwotm8.p.g;
                }
                while (--n >= 0) {
                    a(uwotm8.p.f, n3, n7, n6 >> 16, n5 >> 16);
                    n5 += n8;
                    n6 += n10;
                    n3 += uwotm8.p.g;
                }
            }
        }
    }
    
    private static void a(final int[] array, int n, int n2, int n3, int m) {
        if (uwotm8.r.b) {
            if (m > uwotm8.p.m) {
                m = uwotm8.p.m;
            }
            if (n3 < 0) {
                n3 = 0;
            }
        }
        if (n3 >= m) {
            return;
        }
        n += n3;
        int n4 = m - n3 >> 2;
        if (uwotm8.r.d == 0) {
            while (--n4 >= 0) {
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
            }
            int n5 = m - n3 & 0x3;
            while (--n5 >= 0) {
                array[n++] = n2;
            }
            return;
        }
        final int d = uwotm8.r.d;
        final int n6 = 256 - uwotm8.r.d;
        n2 = ((n2 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n6 >> 8 & 0xFF00);
        while (--n4 >= 0) {
            array[n++] = n2 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
            array[n++] = n2 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
            array[n++] = n2 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
            array[n++] = n2 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
        }
        int n7 = m - n3 & 0x3;
        while (--n7 >= 0) {
            array[n++] = n2 + ((array[n] & 0xFF00FF) * d >> 8 & 0xFF00FF) + ((array[n] & 0xFF00) * d >> 8 & 0xFF00);
        }
    }
    
    public static void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19) {
        final int n20 = n;
        final int n21 = n2;
        final int n22 = n3;
        final int n23 = n4;
        final int n24 = n5;
        final int n25 = n6;
        final int n26 = n7;
        final int n27 = n8;
        final int n28 = n9;
        final int n29 = n10;
        final int n30 = n11;
        final int n31 = n12;
        final int n32 = n13;
        final int n33 = n14;
        final int n34 = n15;
        final int n35 = n16;
        final int n36 = n17;
        final int n37 = n18;
        n19 = n19;
        n18 = n37;
        n17 = n36;
        n16 = n35;
        n15 = n34;
        n14 = n33;
        n13 = n32;
        n12 = n31;
        n11 = n30;
        n10 = n29;
        n9 = n28;
        n8 = n27;
        n7 = n26;
        n6 = n25;
        n5 = n24;
        n4 = n23;
        n3 = n22;
        n2 = n21;
        n = n20;
        final int n38 = n19;
        uwotm8.r.v[n38] = uwotm8.r.w++;
        int[] array;
        if (uwotm8.r.F[n38] != null) {
            array = uwotm8.r.F[n38];
        }
        else {
            int[] array2;
            if (uwotm8.r.D > 0) {
                array2 = uwotm8.r.E[--uwotm8.r.D];
                uwotm8.r.E[uwotm8.r.D] = null;
            }
            else {
                int n39 = 0;
                int n40 = -1;
                for (int i = 0; i < uwotm8.r.A; ++i) {
                    if (uwotm8.r.F[i] != null && (uwotm8.r.v[i] < n39 || n40 == -1)) {
                        n39 = uwotm8.r.v[i];
                        n40 = i;
                    }
                }
                array2 = uwotm8.r.F[n40];
                uwotm8.r.F[n40] = null;
            }
            uwotm8.r.F[n38] = array2;
            final k k = uwotm8.r.u[n38];
            final int[] array3 = uwotm8.r.G[n38];
            if (uwotm8.r.a) {
                uwotm8.r.B[n38] = false;
                for (int j = 0; j < 4096; ++j) {
                    final int[] array4 = array2;
                    final int n41 = j;
                    final int n42 = array3[k.a[j]] & 0xF8F8FF;
                    array4[n41] = n42;
                    final int n43;
                    if ((n43 = n42) == 0) {
                        uwotm8.r.B[n38] = true;
                    }
                    final int[] array5 = array2;
                    final int n44 = j + 4096;
                    final int n45 = n43;
                    array5[n44] = (n45 - (n45 >>> 3) & 0xF8F8FF);
                    final int[] array6 = array2;
                    final int n46 = j + 8192;
                    final int n47 = n43;
                    array6[n46] = (n47 - (n47 >>> 2) & 0xF8F8FF);
                    final int[] array7 = array2;
                    final int n48 = j + 12288;
                    final int n49 = n43;
                    array7[n48] = (n49 - (n49 >>> 2) - (n43 >>> 3) & 0xF8F8FF);
                }
            }
            else {
                if (k.c == 64) {
                    for (int l = 0; l < 128; ++l) {
                        for (int n50 = 0; n50 < 128; ++n50) {
                            array2[n50 + (l << 7)] = array3[k.a[(n50 >> 1) + (l >> 1 << 6)]];
                        }
                    }
                }
                else {
                    for (int n51 = 0; n51 < 16384; ++n51) {
                        array2[n51] = array3[k.a[n51]];
                    }
                }
                uwotm8.r.B[n38] = false;
                for (int n52 = 0; n52 < 16384; ++n52) {
                    final int[] array8 = array2;
                    final int n53 = n52;
                    array8[n53] &= 0xF8F8FF;
                    final int n54;
                    if ((n54 = array2[n52]) == 0) {
                        uwotm8.r.B[n38] = true;
                    }
                    final int[] array9 = array2;
                    final int n55 = n52 + 16384;
                    final int n56 = n54;
                    array9[n55] = (n56 - (n56 >>> 3) & 0xF8F8FF);
                    final int[] array10 = array2;
                    final int n57 = n52 + 32768;
                    final int n58 = n54;
                    array10[n57] = (n58 - (n58 >>> 2) & 0xF8F8FF);
                    final int[] array11 = array2;
                    final int n59 = n52 + 49152;
                    final int n60 = n54;
                    array11[n59] = (n60 - (n60 >>> 2) - (n54 >>> 3) & 0xF8F8FF);
                }
            }
            array = array2;
        }
        final int[] array12 = array;
        uwotm8.r.y = !uwotm8.r.B[n19];
        n11 = n10 - n11;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n12 -= n10;
        n15 -= n13;
        n18 -= n16;
        n19 = n12 * n13 - n15 * n10 << ((Client.l == 9) ? 14 : 15);
        final int n61 = n15 * n16 - n18 * n13 << 8;
        final int n62 = n18 * n10 - n12 * n16 << 5;
        final int n63 = n11 * n13 - n14 * n10 << ((Client.l == 9) ? 14 : 15);
        n13 = n14 * n16 - n17 * n13 << 8;
        n10 = n17 * n10 - n11 * n16 << 5;
        n16 = n14 * n12 - n11 * n15 << ((Client.l == 9) ? 14 : 15);
        n14 = n17 * n15 - n14 * n18 << 8;
        n11 = n11 * n18 - n17 * n12 << 5;
        n12 = 0;
        n15 = 0;
        if (n2 != n) {
            n12 = (n5 - n4 << 16) / (n2 - n);
            n15 = (n8 - n7 << 16) / (n2 - n);
        }
        n17 = 0;
        n18 = 0;
        if (n3 != n2) {
            n17 = (n6 - n5 << 16) / (n3 - n2);
            n18 = (n9 - n8 << 16) / (n3 - n2);
        }
        int n64 = 0;
        int n65 = 0;
        if (n3 != n) {
            n64 = (n4 - n6 << 16) / (n - n3);
            n65 = (n7 - n9 << 16) / (n - n3);
        }
        if (n <= n2 && n <= n3) {
            if (n < uwotm8.p.j) {
                if (n2 > uwotm8.p.j) {
                    n2 = uwotm8.p.j;
                }
                if (n3 > uwotm8.p.j) {
                    n3 = uwotm8.p.j;
                }
                if (n2 < n3) {
                    n4 = (n6 = n4 << 16);
                    n7 = (n9 = n7 << 16);
                    if (n < 0) {
                        n6 -= n64 * n;
                        n4 -= n12 * n;
                        n9 -= n65 * n;
                        n7 -= n15 * n;
                        n = 0;
                    }
                    n5 <<= 16;
                    n8 <<= 16;
                    if (n2 < 0) {
                        n5 -= n17 * n2;
                        n8 -= n18 * n2;
                        n2 = 0;
                    }
                    final int n66 = n - uwotm8.r.p;
                    n19 += n62 * n66;
                    int n67 = n63 + n10 * n66;
                    n16 += n11 * n66;
                    if ((n != n2 && n64 < n12) || (n == n2 && n64 > n17)) {
                        n3 -= n2;
                        n2 -= n;
                        n = uwotm8.r.t[n];
                        while (--n2 >= 0) {
                            a(uwotm8.p.f, array12, n, n6 >> 16, n4 >> 16, n9 >> 8, n7 >> 8, n19, n67, n16, n61, n13, n14);
                            n6 += n64;
                            n4 += n12;
                            n9 += n65;
                            n7 += n15;
                            n += uwotm8.p.g;
                            n19 += n62;
                            n67 += n10;
                            n16 += n11;
                        }
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, array12, n, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n19, n67, n16, n61, n13, n14);
                            n6 += n64;
                            n5 += n17;
                            n9 += n65;
                            n8 += n18;
                            n += uwotm8.p.g;
                            n19 += n62;
                            n67 += n10;
                            n16 += n11;
                        }
                        return;
                    }
                    n3 -= n2;
                    n2 -= n;
                    n = uwotm8.r.t[n];
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, array12, n, n4 >> 16, n6 >> 16, n7 >> 8, n9 >> 8, n19, n67, n16, n61, n13, n14);
                        n6 += n64;
                        n4 += n12;
                        n9 += n65;
                        n7 += n15;
                        n += uwotm8.p.g;
                        n19 += n62;
                        n67 += n10;
                        n16 += n11;
                    }
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, array12, n, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n19, n67, n16, n61, n13, n14);
                        n6 += n64;
                        n5 += n17;
                        n9 += n65;
                        n8 += n18;
                        n += uwotm8.p.g;
                        n19 += n62;
                        n67 += n10;
                        n16 += n11;
                    }
                }
                else {
                    n4 = (n5 = n4 << 16);
                    n7 = (n8 = n7 << 16);
                    if (n < 0) {
                        n5 -= n64 * n;
                        n4 -= n12 * n;
                        n8 -= n65 * n;
                        n7 -= n15 * n;
                        n = 0;
                    }
                    n6 <<= 16;
                    n9 <<= 16;
                    if (n3 < 0) {
                        n6 -= n17 * n3;
                        n9 -= n18 * n3;
                        n3 = 0;
                    }
                    final int n68 = n - uwotm8.r.p;
                    n19 += n62 * n68;
                    int n69 = n63 + n10 * n68;
                    n16 += n11 * n68;
                    if ((n != n3 && n64 < n12) || (n == n3 && n17 > n12)) {
                        n2 -= n3;
                        n3 -= n;
                        n = uwotm8.r.t[n];
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, array12, n, n5 >> 16, n4 >> 16, n8 >> 8, n7 >> 8, n19, n69, n16, n61, n13, n14);
                            n5 += n64;
                            n4 += n12;
                            n8 += n65;
                            n7 += n15;
                            n += uwotm8.p.g;
                            n19 += n62;
                            n69 += n10;
                            n16 += n11;
                        }
                        while (--n2 >= 0) {
                            a(uwotm8.p.f, array12, n, n6 >> 16, n4 >> 16, n9 >> 8, n7 >> 8, n19, n69, n16, n61, n13, n14);
                            n6 += n17;
                            n4 += n12;
                            n9 += n18;
                            n7 += n15;
                            n += uwotm8.p.g;
                            n19 += n62;
                            n69 += n10;
                            n16 += n11;
                        }
                        return;
                    }
                    n2 -= n3;
                    n3 -= n;
                    n = uwotm8.r.t[n];
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, array12, n, n4 >> 16, n5 >> 16, n7 >> 8, n8 >> 8, n19, n69, n16, n61, n13, n14);
                        n5 += n64;
                        n4 += n12;
                        n8 += n65;
                        n7 += n15;
                        n += uwotm8.p.g;
                        n19 += n62;
                        n69 += n10;
                        n16 += n11;
                    }
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, array12, n, n4 >> 16, n6 >> 16, n7 >> 8, n9 >> 8, n19, n69, n16, n61, n13, n14);
                        n6 += n17;
                        n4 += n12;
                        n9 += n18;
                        n7 += n15;
                        n += uwotm8.p.g;
                        n19 += n62;
                        n69 += n10;
                        n16 += n11;
                    }
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 < uwotm8.p.j) {
                if (n3 > uwotm8.p.j) {
                    n3 = uwotm8.p.j;
                }
                if (n > uwotm8.p.j) {
                    n = uwotm8.p.j;
                }
                if (n3 < n) {
                    n5 = (n4 = n5 << 16);
                    n8 = (n7 = n8 << 16);
                    if (n2 < 0) {
                        n4 -= n12 * n2;
                        n5 -= n17 * n2;
                        n7 -= n15 * n2;
                        n8 -= n18 * n2;
                        n2 = 0;
                    }
                    n6 <<= 16;
                    n9 <<= 16;
                    if (n3 < 0) {
                        n6 -= n64 * n3;
                        n9 -= n65 * n3;
                        n3 = 0;
                    }
                    final int n70 = n2 - uwotm8.r.p;
                    n19 += n62 * n70;
                    int n71 = n63 + n10 * n70;
                    n16 += n11 * n70;
                    if ((n2 != n3 && n12 < n17) || (n2 == n3 && n12 > n64)) {
                        n -= n3;
                        n3 -= n2;
                        n2 = uwotm8.r.t[n2];
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, array12, n2, n4 >> 16, n5 >> 16, n7 >> 8, n8 >> 8, n19, n71, n16, n61, n13, n14);
                            n4 += n12;
                            n5 += n17;
                            n7 += n15;
                            n8 += n18;
                            n2 += uwotm8.p.g;
                            n19 += n62;
                            n71 += n10;
                            n16 += n11;
                        }
                        while (--n >= 0) {
                            a(uwotm8.p.f, array12, n2, n4 >> 16, n6 >> 16, n7 >> 8, n9 >> 8, n19, n71, n16, n61, n13, n14);
                            n4 += n12;
                            n6 += n64;
                            n7 += n15;
                            n9 += n65;
                            n2 += uwotm8.p.g;
                            n19 += n62;
                            n71 += n10;
                            n16 += n11;
                        }
                        return;
                    }
                    n -= n3;
                    n3 -= n2;
                    n2 = uwotm8.r.t[n2];
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, array12, n2, n5 >> 16, n4 >> 16, n8 >> 8, n7 >> 8, n19, n71, n16, n61, n13, n14);
                        n4 += n12;
                        n5 += n17;
                        n7 += n15;
                        n8 += n18;
                        n2 += uwotm8.p.g;
                        n19 += n62;
                        n71 += n10;
                        n16 += n11;
                    }
                    while (--n >= 0) {
                        a(uwotm8.p.f, array12, n2, n6 >> 16, n4 >> 16, n9 >> 8, n7 >> 8, n19, n71, n16, n61, n13, n14);
                        n4 += n12;
                        n6 += n64;
                        n7 += n15;
                        n9 += n65;
                        n2 += uwotm8.p.g;
                        n19 += n62;
                        n71 += n10;
                        n16 += n11;
                    }
                }
                else {
                    n5 = (n6 = n5 << 16);
                    n8 = (n9 = n8 << 16);
                    if (n2 < 0) {
                        n6 -= n12 * n2;
                        n5 -= n17 * n2;
                        n9 -= n15 * n2;
                        n8 -= n18 * n2;
                        n2 = 0;
                    }
                    n4 <<= 16;
                    n7 <<= 16;
                    if (n < 0) {
                        n4 -= n64 * n;
                        n7 -= n65 * n;
                        n = 0;
                    }
                    final int n72 = n2 - uwotm8.r.p;
                    n19 += n62 * n72;
                    int n73 = n63 + n10 * n72;
                    n16 += n11 * n72;
                    if (n12 < n17) {
                        n3 -= n;
                        n -= n2;
                        n2 = uwotm8.r.t[n2];
                        while (--n >= 0) {
                            a(uwotm8.p.f, array12, n2, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n19, n73, n16, n61, n13, n14);
                            n6 += n12;
                            n5 += n17;
                            n9 += n15;
                            n8 += n18;
                            n2 += uwotm8.p.g;
                            n19 += n62;
                            n73 += n10;
                            n16 += n11;
                        }
                        while (--n3 >= 0) {
                            a(uwotm8.p.f, array12, n2, n4 >> 16, n5 >> 16, n7 >> 8, n8 >> 8, n19, n73, n16, n61, n13, n14);
                            n4 += n64;
                            n5 += n17;
                            n7 += n65;
                            n8 += n18;
                            n2 += uwotm8.p.g;
                            n19 += n62;
                            n73 += n10;
                            n16 += n11;
                        }
                        return;
                    }
                    n3 -= n;
                    n -= n2;
                    n2 = uwotm8.r.t[n2];
                    while (--n >= 0) {
                        a(uwotm8.p.f, array12, n2, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n19, n73, n16, n61, n13, n14);
                        n6 += n12;
                        n5 += n17;
                        n9 += n15;
                        n8 += n18;
                        n2 += uwotm8.p.g;
                        n19 += n62;
                        n73 += n10;
                        n16 += n11;
                    }
                    while (--n3 >= 0) {
                        a(uwotm8.p.f, array12, n2, n5 >> 16, n4 >> 16, n8 >> 8, n7 >> 8, n19, n73, n16, n61, n13, n14);
                        n4 += n64;
                        n5 += n17;
                        n7 += n65;
                        n8 += n18;
                        n2 += uwotm8.p.g;
                        n19 += n62;
                        n73 += n10;
                        n16 += n11;
                    }
                }
            }
        }
        else if (n3 < uwotm8.p.j) {
            if (n > uwotm8.p.j) {
                n = uwotm8.p.j;
            }
            if (n2 > uwotm8.p.j) {
                n2 = uwotm8.p.j;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 16);
                n9 = (n8 = n9 << 16);
                if (n3 < 0) {
                    n5 -= n17 * n3;
                    n6 -= n64 * n3;
                    n8 -= n18 * n3;
                    n9 -= n65 * n3;
                    n3 = 0;
                }
                n4 <<= 16;
                n7 <<= 16;
                if (n < 0) {
                    n4 -= n12 * n;
                    n7 -= n15 * n;
                    n = 0;
                }
                final int n74 = n3 - uwotm8.r.p;
                n19 += n62 * n74;
                int n75 = n63 + n10 * n74;
                n16 += n11 * n74;
                if (n17 < n64) {
                    n2 -= n;
                    n -= n3;
                    n3 = uwotm8.r.t[n3];
                    while (--n >= 0) {
                        a(uwotm8.p.f, array12, n3, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n19, n75, n16, n61, n13, n14);
                        n5 += n17;
                        n6 += n64;
                        n8 += n18;
                        n9 += n65;
                        n3 += uwotm8.p.g;
                        n19 += n62;
                        n75 += n10;
                        n16 += n11;
                    }
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, array12, n3, n5 >> 16, n4 >> 16, n8 >> 8, n7 >> 8, n19, n75, n16, n61, n13, n14);
                        n5 += n17;
                        n4 += n12;
                        n8 += n18;
                        n7 += n15;
                        n3 += uwotm8.p.g;
                        n19 += n62;
                        n75 += n10;
                        n16 += n11;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = uwotm8.r.t[n3];
                while (--n >= 0) {
                    a(uwotm8.p.f, array12, n3, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n19, n75, n16, n61, n13, n14);
                    n5 += n17;
                    n6 += n64;
                    n8 += n18;
                    n9 += n65;
                    n3 += uwotm8.p.g;
                    n19 += n62;
                    n75 += n10;
                    n16 += n11;
                }
                while (--n2 >= 0) {
                    a(uwotm8.p.f, array12, n3, n4 >> 16, n5 >> 16, n7 >> 8, n8 >> 8, n19, n75, n16, n61, n13, n14);
                    n5 += n17;
                    n4 += n12;
                    n8 += n18;
                    n7 += n15;
                    n3 += uwotm8.p.g;
                    n19 += n62;
                    n75 += n10;
                    n16 += n11;
                }
            }
            else {
                n6 = (n4 = n6 << 16);
                n9 = (n7 = n9 << 16);
                if (n3 < 0) {
                    n4 -= n17 * n3;
                    n6 -= n64 * n3;
                    n7 -= n18 * n3;
                    n9 -= n65 * n3;
                    n3 = 0;
                }
                n5 <<= 16;
                n8 <<= 16;
                if (n2 < 0) {
                    n5 -= n12 * n2;
                    n8 -= n15 * n2;
                    n2 = 0;
                }
                final int n76 = n3 - uwotm8.r.p;
                n19 += n62 * n76;
                int n77 = n63 + n10 * n76;
                n16 += n11 * n76;
                if (n17 < n64) {
                    n -= n2;
                    n2 -= n3;
                    n3 = uwotm8.r.t[n3];
                    while (--n2 >= 0) {
                        a(uwotm8.p.f, array12, n3, n4 >> 16, n6 >> 16, n7 >> 8, n9 >> 8, n19, n77, n16, n61, n13, n14);
                        n4 += n17;
                        n6 += n64;
                        n7 += n18;
                        n9 += n65;
                        n3 += uwotm8.p.g;
                        n19 += n62;
                        n77 += n10;
                        n16 += n11;
                    }
                    while (--n >= 0) {
                        a(uwotm8.p.f, array12, n3, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n19, n77, n16, n61, n13, n14);
                        n5 += n12;
                        n6 += n64;
                        n8 += n15;
                        n9 += n65;
                        n3 += uwotm8.p.g;
                        n19 += n62;
                        n77 += n10;
                        n16 += n11;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = uwotm8.r.t[n3];
                while (--n2 >= 0) {
                    a(uwotm8.p.f, array12, n3, n6 >> 16, n4 >> 16, n9 >> 8, n7 >> 8, n19, n77, n16, n61, n13, n14);
                    n4 += n17;
                    n6 += n64;
                    n7 += n18;
                    n9 += n65;
                    n3 += uwotm8.p.g;
                    n19 += n62;
                    n77 += n10;
                    n16 += n11;
                }
                while (--n >= 0) {
                    a(uwotm8.p.f, array12, n3, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n19, n77, n16, n61, n13, n14);
                    n5 += n12;
                    n6 += n64;
                    n8 += n15;
                    n9 += n65;
                    n3 += uwotm8.p.g;
                    n19 += n62;
                    n77 += n10;
                    n16 += n11;
                }
            }
        }
    }
    
    private static void a(final int[] array, final int[] array2, int n, int n2, int m, int n3, int n4, int n5, int n6, int n7, final int n8, final int n9, final int n10) {
        int n11 = 0;
        int n12 = 0;
        if (n2 >= m) {
            return;
        }
        int n13;
        if (uwotm8.r.b) {
            n4 = (n4 - n3) / (m - n2);
            if (m > uwotm8.p.m) {
                m = uwotm8.p.m;
            }
            if (n2 < 0) {
                n3 -= n2 * n4;
                n2 = 0;
            }
            if (n2 >= m) {
                return;
            }
            n13 = m - n2 >> 3;
            n4 <<= 12;
        }
        else if (m - n2 > 7) {
            n13 = m - n2 >> 3;
            n4 = (n4 - n3) * uwotm8.r.z[n13] >> 6;
        }
        else {
            n13 = 0;
            n4 = 0;
        }
        n3 <<= 9;
        n += n2;
        if (uwotm8.r.a) {
            int n14 = 0;
            int n15 = 0;
            final int n16 = n2 - uwotm8.r.e;
            n5 += (n8 >> 3) * n16;
            n6 += (n9 >> 3) * n16;
            final int n17;
            if ((n17 = (n7 += (n10 >> 3) * n16) >> 12) != 0) {
                n11 = n5 / n17;
                n12 = n6 / n17;
                if (n11 < 0) {
                    n11 = 0;
                }
                else if (n11 > 4032) {
                    n11 = 4032;
                }
            }
            n5 += n8;
            n6 += n9;
            final int n18;
            if ((n18 = (n7 += n10) >> 12) != 0) {
                n14 = n5 / n18;
                n15 = n6 / n18;
                if (n14 < 7) {
                    n14 = 7;
                }
                else if (n14 > 4032) {
                    n14 = 4032;
                }
            }
            int n19 = n14 - n11 >> 3;
            int n20 = n15 - n12 >> 3;
            int n21 = n11 + ((n3 & 0x600000) >> 3);
            int n22 = n3 >> 23;
            if (uwotm8.r.y) {
                while (n13-- > 0) {
                    array[n++] = array2[(n12 & 0xFC0) + (n21 >> 6)] >>> n22;
                    final int n23 = n21 + n19;
                    final int n24 = n12 + n20;
                    array[n++] = array2[(n24 & 0xFC0) + (n23 >> 6)] >>> n22;
                    final int n25 = n23 + n19;
                    final int n26 = n24 + n20;
                    array[n++] = array2[(n26 & 0xFC0) + (n25 >> 6)] >>> n22;
                    final int n27 = n25 + n19;
                    final int n28 = n26 + n20;
                    array[n++] = array2[(n28 & 0xFC0) + (n27 >> 6)] >>> n22;
                    final int n29 = n27 + n19;
                    final int n30 = n28 + n20;
                    array[n++] = array2[(n30 & 0xFC0) + (n29 >> 6)] >>> n22;
                    final int n31 = n29 + n19;
                    final int n32 = n30 + n20;
                    array[n++] = array2[(n32 & 0xFC0) + (n31 >> 6)] >>> n22;
                    final int n33 = n31 + n19;
                    final int n34 = n32 + n20;
                    array[n++] = array2[(n34 & 0xFC0) + (n33 >> 6)] >>> n22;
                    array[n++] = array2[(n34 + n20 & 0xFC0) + (n33 + n19 >> 6)] >>> n22;
                    final int n35 = n14;
                    n12 = n15;
                    n5 += n8;
                    n6 += n9;
                    final int n36;
                    if ((n36 = (n7 += n10) >> 12) != 0) {
                        n14 = n5 / n36;
                        n15 = n6 / n36;
                        if (n14 < 7) {
                            n14 = 7;
                        }
                        else if (n14 > 4032) {
                            n14 = 4032;
                        }
                    }
                    n19 = n14 - n35 >> 3;
                    n20 = n15 - n12 >> 3;
                    n3 += n4;
                    n21 = n35 + ((n3 & 0x600000) >> 3);
                    n22 = n3 >> 23;
                }
                int n37 = m - n2 & 0x7;
                while (n37-- > 0) {
                    array[n++] = array2[(n12 & 0xFC0) + (n21 >> 6)] >>> n22;
                    n21 += n19;
                    n12 += n20;
                }
                return;
            }
            while (n13-- > 0) {
                final int n38;
                if ((n38 = array2[(n12 & 0xFC0) + (n21 >> 6)] >>> n22) != 0) {
                    array[n] = n38;
                }
                ++n;
                final int n39 = n21 + n19;
                final int n40 = n12 + n20;
                final int n41;
                if ((n41 = array2[(n40 & 0xFC0) + (n39 >> 6)] >>> n22) != 0) {
                    array[n] = n41;
                }
                ++n;
                final int n42 = n39 + n19;
                final int n43 = n40 + n20;
                final int n44;
                if ((n44 = array2[(n43 & 0xFC0) + (n42 >> 6)] >>> n22) != 0) {
                    array[n] = n44;
                }
                ++n;
                final int n45 = n42 + n19;
                final int n46 = n43 + n20;
                final int n47;
                if ((n47 = array2[(n46 & 0xFC0) + (n45 >> 6)] >>> n22) != 0) {
                    array[n] = n47;
                }
                ++n;
                final int n48 = n45 + n19;
                final int n49 = n46 + n20;
                final int n50;
                if ((n50 = array2[(n49 & 0xFC0) + (n48 >> 6)] >>> n22) != 0) {
                    array[n] = n50;
                }
                ++n;
                final int n51 = n48 + n19;
                final int n52 = n49 + n20;
                final int n53;
                if ((n53 = array2[(n52 & 0xFC0) + (n51 >> 6)] >>> n22) != 0) {
                    array[n] = n53;
                }
                ++n;
                final int n54 = n51 + n19;
                final int n55 = n52 + n20;
                final int n56;
                if ((n56 = array2[(n55 & 0xFC0) + (n54 >> 6)] >>> n22) != 0) {
                    array[n] = n56;
                }
                ++n;
                final int n57;
                if ((n57 = array2[(n55 + n20 & 0xFC0) + (n54 + n19 >> 6)] >>> n22) != 0) {
                    array[n] = n57;
                }
                ++n;
                final int n58 = n14;
                n12 = n15;
                n5 += n8;
                n6 += n9;
                final int n59;
                if ((n59 = (n7 += n10) >> 12) != 0) {
                    n14 = n5 / n59;
                    n15 = n6 / n59;
                    if (n14 < 7) {
                        n14 = 7;
                    }
                    else if (n14 > 4032) {
                        n14 = 4032;
                    }
                }
                n19 = n14 - n58 >> 3;
                n20 = n15 - n12 >> 3;
                n3 += n4;
                n21 = n58 + ((n3 & 0x600000) >> 3);
                n22 = n3 >> 23;
            }
            int n60 = m - n2 & 0x7;
            while (n60-- > 0) {
                final int n61;
                if ((n61 = array2[(n12 & 0xFC0) + (n21 >> 6)] >>> n22) != 0) {
                    array[n] = n61;
                }
                ++n;
                n21 += n19;
                n12 += n20;
            }
        }
        else {
            int n62 = 0;
            int n63 = 0;
            final int n64 = n2 - uwotm8.r.e;
            n5 += (n8 >> 3) * n64;
            n6 += (n9 >> 3) * n64;
            final int n65;
            if ((n65 = (n7 += (n10 >> 3) * n64) >> 14) != 0) {
                n11 = n5 / n65;
                n12 = n6 / n65;
                if (n11 < 0) {
                    n11 = 0;
                }
                else if (n11 > 16256) {
                    n11 = 16256;
                }
            }
            n5 += n8;
            n6 += n9;
            final int n66;
            if ((n66 = (n7 += n10) >> 14) != 0) {
                n62 = n5 / n66;
                n63 = n6 / n66;
                if (n62 < 7) {
                    n62 = 7;
                }
                else if (n62 > 16256) {
                    n62 = 16256;
                }
            }
            int n67 = n62 - n11 >> 3;
            int n68 = n63 - n12 >> 3;
            int n69 = n11 + (n3 & 0x600000);
            int n70 = n3 >> 23;
            if (uwotm8.r.y) {
                while (n13-- > 0) {
                    array[n++] = array2[(n12 & 0x3F80) + (n69 >> 7)] >>> n70;
                    final int n71 = n69 + n67;
                    final int n72 = n12 + n68;
                    array[n++] = array2[(n72 & 0x3F80) + (n71 >> 7)] >>> n70;
                    final int n73 = n71 + n67;
                    final int n74 = n72 + n68;
                    array[n++] = array2[(n74 & 0x3F80) + (n73 >> 7)] >>> n70;
                    final int n75 = n73 + n67;
                    final int n76 = n74 + n68;
                    array[n++] = array2[(n76 & 0x3F80) + (n75 >> 7)] >>> n70;
                    final int n77 = n75 + n67;
                    final int n78 = n76 + n68;
                    array[n++] = array2[(n78 & 0x3F80) + (n77 >> 7)] >>> n70;
                    final int n79 = n77 + n67;
                    final int n80 = n78 + n68;
                    array[n++] = array2[(n80 & 0x3F80) + (n79 >> 7)] >>> n70;
                    final int n81 = n79 + n67;
                    final int n82 = n80 + n68;
                    array[n++] = array2[(n82 & 0x3F80) + (n81 >> 7)] >>> n70;
                    array[n++] = array2[(n82 + n68 & 0x3F80) + (n81 + n67 >> 7)] >>> n70;
                    final int n83 = n62;
                    n12 = n63;
                    n5 += n8;
                    n6 += n9;
                    final int n84;
                    if ((n84 = (n7 += n10) >> 14) != 0) {
                        n62 = n5 / n84;
                        n63 = n6 / n84;
                        if (n62 < 7) {
                            n62 = 7;
                        }
                        else if (n62 > 16256) {
                            n62 = 16256;
                        }
                    }
                    n67 = n62 - n83 >> 3;
                    n68 = n63 - n12 >> 3;
                    n3 += n4;
                    n69 = n83 + (n3 & 0x600000);
                    n70 = n3 >> 23;
                }
                int n85 = m - n2 & 0x7;
                while (n85-- > 0) {
                    array[n++] = array2[(n12 & 0x3F80) + (n69 >> 7)] >>> n70;
                    n69 += n67;
                    n12 += n68;
                }
                return;
            }
            while (n13-- > 0) {
                final int n86;
                if ((n86 = array2[(n12 & 0x3F80) + (n69 >> 7)] >>> n70) != 0) {
                    array[n] = n86;
                }
                ++n;
                final int n87 = n69 + n67;
                final int n88 = n12 + n68;
                final int n89;
                if ((n89 = array2[(n88 & 0x3F80) + (n87 >> 7)] >>> n70) != 0) {
                    array[n] = n89;
                }
                ++n;
                final int n90 = n87 + n67;
                final int n91 = n88 + n68;
                final int n92;
                if ((n92 = array2[(n91 & 0x3F80) + (n90 >> 7)] >>> n70) != 0) {
                    array[n] = n92;
                }
                ++n;
                final int n93 = n90 + n67;
                final int n94 = n91 + n68;
                final int n95;
                if ((n95 = array2[(n94 & 0x3F80) + (n93 >> 7)] >>> n70) != 0) {
                    array[n] = n95;
                }
                ++n;
                final int n96 = n93 + n67;
                final int n97 = n94 + n68;
                final int n98;
                if ((n98 = array2[(n97 & 0x3F80) + (n96 >> 7)] >>> n70) != 0) {
                    array[n] = n98;
                }
                ++n;
                final int n99 = n96 + n67;
                final int n100 = n97 + n68;
                final int n101;
                if ((n101 = array2[(n100 & 0x3F80) + (n99 >> 7)] >>> n70) != 0) {
                    array[n] = n101;
                }
                ++n;
                final int n102 = n99 + n67;
                final int n103 = n100 + n68;
                final int n104;
                if ((n104 = array2[(n103 & 0x3F80) + (n102 >> 7)] >>> n70) != 0) {
                    array[n] = n104;
                }
                ++n;
                final int n105;
                if ((n105 = array2[(n103 + n68 & 0x3F80) + (n102 + n67 >> 7)] >>> n70) != 0) {
                    array[n] = n105;
                }
                ++n;
                final int n106 = n62;
                n12 = n63;
                n5 += n8;
                n6 += n9;
                final int n107;
                if ((n107 = (n7 += n10) >> 14) != 0) {
                    n62 = n5 / n107;
                    n63 = n6 / n107;
                    if (n62 < 7) {
                        n62 = 7;
                    }
                    else if (n62 > 16256) {
                        n62 = 16256;
                    }
                }
                n67 = n62 - n106 >> 3;
                n68 = n63 - n12 >> 3;
                n3 += n4;
                n69 = n106 + (n3 & 0x600000);
                n70 = n3 >> 23;
            }
            int n108 = m - n2 & 0x7;
            while (n108-- > 0) {
                final int n109;
                if ((n109 = array2[(n12 & 0x3F80) + (n69 >> 7)] >>> n70) != 0) {
                    array[n] = n109;
                }
                ++n;
                n69 += n67;
                n12 += n68;
            }
        }
    }
}

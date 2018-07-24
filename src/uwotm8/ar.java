package uwotm8;

final class ar
{
    private am c;
    private am d;
    private am e;
    private am f;
    private am g;
    private am h;
    private am i;
    private am j;
    private final int[] k;
    private final int[] l;
    private final int[] m;
    private int n;
    private int o;
    private an p;
    private am q;
    int a;
    int b;
    private static int[] r;
    private static int[] s;
    private static int[] t;
    private static final int[] u;
    private static final int[] v;
    private static final int[] w;
    private static final int[] x;
    private static final int[] y;
    
    static {
        u = new int[5];
        v = new int[5];
        w = new int[5];
        x = new int[5];
        y = new int[5];
    }
    
    public static void a() {
        ar.s = new int[32768];
        for (int i = 0; i < 32768; ++i) {
            if (Math.random() > 0.5) {
                ar.s[i] = 1;
            }
            else {
                ar.s[i] = -1;
            }
        }
        ar.t = new int[32768];
        for (int j = 0; j < 32768; ++j) {
            final int[] t = ar.t;
            final int n = j;
            t[n] = (int)(Math.sin(n / 5215.1903) * 16384.0);
        }
        ar.r = new int[220500];
    }
    
    public final int[] a(final int n, int i) {
        for (int j = 0; j < n; ++j) {
            ar.r[j] = 0;
        }
        if (i < 10) {
            return ar.r;
        }
        final double n2 = n / (i + 0.0);
        this.c.a();
        this.d.a();
        i = 0;
        int n3 = 0;
        int n4 = 0;
        if (this.e != null) {
            this.e.a();
            this.f.a();
            i = (int)((this.e.b - this.e.a) * 32.768 / n2);
            n3 = (int)(this.e.a * 32.768 / n2);
        }
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        if (this.g != null) {
            this.g.a();
            this.h.a();
            n5 = (int)((this.g.b - this.g.a) * 32.768 / n2);
            n6 = (int)(this.g.a * 32.768 / n2);
        }
        for (int k = 0; k < 5; ++k) {
            if (this.k[k] != 0) {
                ar.u[k] = 0;
                ar.v[k] = (int)(this.m[k] * n2);
                ar.w[k] = (this.k[k] << 14) / 100;
                ar.x[k] = (int)((this.c.b - this.c.a) * 32.768 * Math.pow(1.0057929410678534, this.l[k]) / n2);
                ar.y[k] = (int)(this.c.a * 32.768 / n2);
            }
        }
        for (int l = 0; l < n; ++l) {
            int a = this.c.a(n);
            int a2 = this.d.a(n);
            if (this.e != null) {
                final int a3 = this.e.a(n);
                a += a(this.f.a(n), n4, this.e.c) >> 1;
                n4 += (a3 * i >> 16) + n3;
            }
            if (this.g != null) {
                final int a4 = this.g.a(n);
                a2 = a2 * ((a(this.h.a(n), n7, this.g.c) >> 1) + 32768) >> 15;
                n7 += (a4 * n5 >> 16) + n6;
            }
            for (int n8 = 0; n8 < 5; ++n8) {
                final int n9;
                if (this.k[n8] != 0 && (n9 = l + ar.v[n8]) < n) {
                    final int[] r = ar.r;
                    final int n10 = n9;
                    r[n10] += a(a2 * ar.w[n8] >> 15, ar.u[n8], this.c.c);
                    final int[] u = ar.u;
                    final int n11 = n8;
                    u[n11] += (a * ar.x[n8] >> 16) + ar.y[n8];
                }
            }
        }
        if (this.i != null) {
            this.i.a();
            this.j.a();
            int n12 = 0;
            boolean b = true;
            for (int n13 = 0; n13 < n; ++n13) {
                final int a5 = this.i.a(n);
                final int a6 = this.j.a(n);
                if (b) {
                    i = this.i.a + ((this.i.b - this.i.a) * a5 >> 8);
                }
                else {
                    i = this.i.a + ((this.i.b - this.i.a) * a6 >> 8);
                }
                n12 += 256;
                if (n12 >= i) {
                    n12 = 0;
                    b = !b;
                }
                if (b) {
                    ar.r[n13] = 0;
                }
            }
        }
        if (this.n > 0 && this.o > 0) {
            int n15;
            for (int n14 = n15 = (int)(this.n * n2); n15 < n; ++n15) {
                final int[] r2 = ar.r;
                final int n16 = n15;
                r2[n16] += ar.r[n15 - n14] * this.o / 100;
            }
        }
        if (this.p.a[0] > 0 || this.p.a[1] > 0) {
            this.q.a();
            int n17 = this.q.a(n + 1);
            int n18 = this.p.a(0, n17 / 65536.0f);
            int n19 = this.p.a(1, n17 / 65536.0f);
            if (n >= n18 + n19) {
                int n20 = 0;
                int n21;
                if ((n21 = n19) > n - n18) {
                    n21 = n - n18;
                }
                while (n20 < n21) {
                    i = ar.r[n20 + n18] * an.c >> 16;
                    for (int n22 = 0; n22 < n18; ++n22) {
                        i += ar.r[n20 + n18 - 1 - n22] * an.b[0][n22] >> 16;
                    }
                    for (int n23 = 0; n23 < n20; ++n23) {
                        i -= ar.r[n20 - 1 - n23] * an.b[1][n23] >> 16;
                    }
                    ar.r[n20] = i;
                    n17 = this.q.a(n + 1);
                    ++n20;
                }
                int n24 = 128;
                while (true) {
                    if (n24 > n - n18) {
                        n24 = n - n18;
                    }
                    while (n20 < n24) {
                        int n25 = ar.r[n20 + n18] * an.c >> 16;
                        for (i = 0; i < n18; ++i) {
                            n25 += ar.r[n20 + n18 - 1 - i] * an.b[0][i] >> 16;
                        }
                        for (i = 0; i < n19; ++i) {
                            n25 -= ar.r[n20 - 1 - i] * an.b[1][i] >> 16;
                        }
                        ar.r[n20] = n25;
                        n17 = this.q.a(n + 1);
                        ++n20;
                    }
                    if (n20 >= n - n18) {
                        break;
                    }
                    n18 = this.p.a(0, n17 / 65536.0f);
                    n19 = this.p.a(1, n17 / 65536.0f);
                    n24 += 128;
                }
                while (n20 < n) {
                    int n26 = 0;
                    for (i = n20 + n18 - n; i < n18; ++i) {
                        n26 += ar.r[n20 + n18 - 1 - i] * an.b[0][i] >> 16;
                    }
                    for (i = 0; i < n19; ++i) {
                        n26 -= ar.r[n20 - 1 - i] * an.b[1][i] >> 16;
                    }
                    ar.r[n20] = n26;
                    ++n20;
                }
            }
        }
        for (int n27 = 0; n27 < n; ++n27) {
            if (ar.r[n27] < -32768) {
                ar.r[n27] = -32768;
            }
            if (ar.r[n27] > 32767) {
                ar.r[n27] = 32767;
            }
        }
        return ar.r;
    }
    
    private static int a(final int n, final int n2, final int n3) {
        if (n3 == 1) {
            if ((n2 & 0x7FFF) < 16384) {
                return n;
            }
            return -n;
        }
        else {
            if (n3 == 2) {
                return ar.t[n2 & 0x7FFF] * n >> 14;
            }
            if (n3 == 3) {
                return ((n2 & 0x7FFF) * n >> 14) - n;
            }
            if (n3 == 4) {
                return ar.s[n2 / 2607 & 0x7FFF] * n;
            }
            return 0;
        }
    }
    
    public final void a(final I_1 i) {
        (this.c = new am()).a(i);
        (this.d = new am()).a(i);
        if (i.e() != 0) {
            --i.b;
            (this.e = new am()).a(i);
            (this.f = new am()).a(i);
        }
        if (i.e() != 0) {
            --i.b;
            (this.g = new am()).a(i);
            (this.h = new am()).a(i);
        }
        if (i.e() != 0) {
            --i.b;
            (this.i = new am()).a(i);
            (this.j = new am()).a(i);
        }
        int q;
        for (int n = 0; n < 10 && (q = i.q()) != 0; ++n) {
            this.k[n] = q;
            this.l[n] = i.p();
            this.m[n] = i.q();
        }
        this.n = i.q();
        this.o = i.q();
        this.a = i.g();
        this.b = i.g();
        this.p = new an();
        this.q = new am();
        this.p.a(i, this.q);
    }
    
    public ar() {
        this.k = new int[5];
        this.l = new int[5];
        this.m = new int[5];
        this.o = 100;
        this.a = 500;
    }
}

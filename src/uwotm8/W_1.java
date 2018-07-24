package uwotm8;

import com.runescape.*;

public final class W_1
{
    private boolean d;
    public static boolean a;
    private final int e;
    private final int f;
    private final int g;
    private final int[][][] h;
    private final Q_1[][][] i;
    private int j;
    private int k;
    private final v[] l;
    private final int[][][] m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static v[] D;
    private static final int[] E;
    private static final int[] F;
    private static final int[] G;
    private static final int[] H;
    private static boolean I;
    private static int J;
    private static int K;
    public static int b;
    public static int c;
    private static final int L;
    private static int[] M;
    private static T_1[][] N;
    private static int O;
    private static final T_1[] P;
    private static M_1 Q;
    private static final int[] R;
    private static final int[] S;
    private static final int[] T;
    private static final int[] U;
    private static final int[] V;
    private static final int[] W;
    private static final int[] X;
    private static final int[] Y;
    private final int[] Z;
    private final int[] aa;
    private int ab;
    private final int[][] ac;
    private final int[][] ad;
    private static boolean[][][][] ae;
    private static boolean[][] af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static int al;
    
    static {
        uwotm8.W_1.a = true;
        uwotm8.W_1.D = new v[100];
        E = new int[] { 53, -53, -53, 53 };
        F = new int[] { -53, -53, 53, 53 };
        G = new int[] { -45, 45, 45, -45 };
        H = new int[] { 45, 45, -45, -45 };
        uwotm8.W_1.b = -1;
        uwotm8.W_1.c = -1;
        P = new T_1[500];
        uwotm8.W_1.Q = new M_1();
        R = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        S = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
        T = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        U = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
        V = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
        W = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
        X = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
        Y = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };
        uwotm8.W_1.ae = new boolean[8][32][51][51];
        L = 4;
        uwotm8.W_1.M = new int[4];
        uwotm8.W_1.N = new T_1[4][500];
    }
    
    public W_1(final int[][][] h) {
        this.ac = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
        this.ad = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
        this.d = true;
        this.l = new v[5000];
        this.Z = new int[10000];
        this.aa = new int[10000];
        this.e = 4;
        this.f = 104;
        this.g = 104;
        this.i = new Q_1[4][104][104];
        this.m = new int[4][105][105];
        this.h = h;
        this.b();
    }
    
    public static void a() {
        uwotm8.W_1.D = null;
        uwotm8.W_1.M = null;
        uwotm8.W_1.N = null;
        uwotm8.W_1.Q = null;
        uwotm8.W_1.ae = null;
        uwotm8.W_1.af = null;
    }
    
    public final void b() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    this.i[i][j][k] = null;
                }
            }
        }
        for (int l = 0; l < 4; ++l) {
            for (int n = 0; n < uwotm8.W_1.M[l]; ++n) {
                uwotm8.W_1.N[l][n] = null;
            }
            uwotm8.W_1.M[l] = 0;
        }
        for (int n2 = 0; n2 < this.k; ++n2) {
            this.l[n2] = null;
        }
        this.k = 0;
        for (int n3 = 0; n3 < uwotm8.W_1.D.length; ++n3) {
            uwotm8.W_1.D[n3] = null;
        }
    }
    
    public final void a(final int j) {
        this.j = j;
        for (int i = 0; i < 104; ++i) {
            for (int k = 0; k < 104; ++k) {
                if (this.i[j][i][k] == null) {
                    this.i[j][i][k] = new Q_1(j, i, k);
                }
            }
        }
    }
    
    public final void a(final int n, final int n2) {
        final Q_1 w = this.i[0][n2][n];
        for (int i = 0; i < 3; ++i) {
            final Q_1[] array = this.i[i][n2];
            final Q_1 q = this.i[i + 1][n2][n];
            array[n] = q;
            final Q_1 q2;
            if ((q2 = q) != null) {
                final Q_1 q3 = q2;
                --q3.a;
                for (int j = 0; j < q2.k; ++j) {
                    final v v;
                    if (((v = q2.l[j]).m >> 29 & 0x3) == 0x2 && v.g == n2 && v.i == n) {
                        final v v2 = v;
                        --v2.a;
                    }
                }
            }
        }
        if (this.i[0][n2][n] == null) {
            this.i[0][n2][n] = new Q_1(0, n2, n);
        }
        this.i[0][n2][n].w = w;
        this.i[3][n2][n] = null;
    }
    
    public static void a(final int n, final int f, final int k, final int g, final int i, final int j, final int h, final int e) {
        final T_1 t;
        (t = new T_1()).a = f / 128;
        t.b = g / 128;
        t.c = h / 128;
        t.d = i / 128;
        t.e = e;
        t.f = f;
        t.g = g;
        t.h = h;
        t.i = i;
        t.j = j;
        t.k = k;
        uwotm8.W_1.N[n][uwotm8.W_1.M[n]++] = t;
    }
    
    public final void a(final int n, final int n2, final int n3, final int o) {
        if (this.i[n][n2][n3] != null) {
            this.i[n][n2][n3].o = o;
        }
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, int i, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19) {
        if (n4 == 0) {
            final V_1 e = new V_1(n10, n11, n12, n13, -1, n18, false);
            for (i = n; i >= 0; --i) {
                if (this.i[i][n2][n3] == null) {
                    this.i[i][n2][n3] = new Q_1(i, n2, n3);
                }
            }
            this.i[n][n2][n3].e = e;
            return;
        }
        if (n4 == 1) {
            final V_1 e2 = new V_1(n14, n15, n16, n17, n5, n19, n6 == n7 && n6 == n8 && n6 == n9);
            for (i = n; i >= 0; --i) {
                if (this.i[i][n2][n3] == null) {
                    this.i[i][n2][n3] = new Q_1(i, n2, n3);
                }
            }
            this.i[n][n2][n3].e = e2;
            return;
        }
        final U_1 f = new U_1(n3, n14, n13, n8, n5, n16, i, n10, n18, n12, n9, n7, n6, n4, n17, n15, n11, n2, n19);
        for (i = n; i >= 0; --i) {
            if (this.i[i][n2][n3] == null) {
                this.i[i][n2][n3] = new Q_1(i, n2, n3);
            }
        }
        this.i[n][n2][n3].f = f;
    }
    
    public final void a(final int n, final int a, final int n2, final A d, final byte f, final int e, final int n3) {
        if (d == null) {
            return;
        }
        final Z_1 i;
        (i = new Z_1()).d = d;
        i.b = (n3 << 7) + 64;
        i.c = (n2 << 7) + 64;
        i.a = a;
        i.e = e;
        i.f = f;
        if (this.i[n][n3][n2] == null) {
            this.i[n][n3][n2] = new Q_1(n, n3, n2);
        }
        this.i[n][n3][n2].i = i;
    }
    
    public final void a(final int n, int n2, final A e, int i, final A f, final A d, final int n3, final int n4) {
        final R_1 j;
        (j = new R_1()).d = d;
        j.b = (n << 7) + 64;
        j.c = (n4 << 7) + 64;
        j.a = i;
        j.g = n2;
        j.e = e;
        j.f = f;
        n2 = 0;
        final Q_1 q;
        if ((q = this.i[n3][n][n4]) != null) {
            int t;
            for (i = 0; i < q.k; ++i) {
                if (q.l[i].e instanceof D_1 && (t = ((D_1)q.l[i].e).t) > n2) {
                    n2 = t;
                }
            }
        }
        j.h = n2;
        if (this.i[n3][n][n4] == null) {
            this.i[n3][n][n4] = new Q_1(n3, n, n4);
        }
        this.i[n3][n][n4].j = j;
    }
    
    public final void a(int i, final A f, final int h, final int n, final byte j, final int n2, final A g, final int a, final int e, final int n3) {
        if (f == null && g == null) {
            return;
        }
        final ab g2;
        (g2 = new ab()).h = h;
        g2.i = j;
        g2.b = (n2 << 7) + 64;
        g2.c = (n << 7) + 64;
        g2.a = a;
        g2.f = f;
        g2.g = g;
        g2.d = i;
        g2.e = e;
        for (i = n3; i >= 0; --i) {
            if (this.i[i][n2][n] == null) {
                this.i[i][n2][n] = new Q_1(i, n2, n);
            }
        }
        this.i[n3][n2][n].g = g2;
    }
    
    public final void a(int i, final int n, final int e, final int n2, final int n3, final int a, final A f, final int n4, final byte h, final int n5, final int d) {
        if (f == null) {
            return;
        }
        final ac h2;
        (h2 = new ac()).g = i;
        h2.h = h;
        h2.b = (n4 << 7) + 64 + n3;
        h2.c = (n << 7) + 64 + n5;
        h2.a = a;
        h2.f = f;
        h2.d = d;
        h2.e = e;
        for (i = n2; i >= 0; --i) {
            if (this.i[i][n4][n] == null) {
                this.i[i][n4][n] = new Q_1(i, n4, n);
            }
        }
        this.i[n2][n4][n].h = h2;
    }
    
    public final boolean a(final int n, final byte b, final int n2, final int n3, final A a, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return a == null || this.a(n5, n8, n7, n4, n3, (n8 << 7) + n4 * 64, (n7 << 7) + n3 * 64, n2, a, n6, false, n, b);
    }
    
    public final boolean a(final int n, final int n2, final int n3, final int n4, final int n5, int n6, final int n7, final A a, final boolean b) {
        if (a == null) {
            return true;
        }
        int n8 = n7 - n6;
        int n9 = n5 - n6;
        int n10 = n7 + n6;
        n6 += n5;
        if (b) {
            if (n2 > 640 && n2 < 1408) {
                n6 += 128;
            }
            if (n2 > 1152 && n2 < 1920) {
                n10 += 128;
            }
            if (n2 > 1664 || n2 < 384) {
                n9 -= 128;
            }
            if (n2 > 128 && n2 < 896) {
                n8 -= 128;
            }
        }
        final int n11 = n8 / 128;
        final int n12 = n9 / 128;
        final int n13 = n10 / 128;
        n6 /= 128;
        return this.a(n, n11, n12, n13 - n11 + 1, n6 - n12 + 1, n7, n5, n3, a, n2, true, n4, (byte)0);
    }
    
    public final boolean a(final int n, final int n2, final A a, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        return a == null || this.a(n, n7, n10, n8 - n7 + 1, n4 - n10 + 1, n5, n2, n6, a, n3, true, n9, (byte)0);
    }
    
    private boolean a(final int a, final int g, final int i, final int n, final int n2, int c, int j, final int b, final A e, final int f, final boolean b2, final int m, final byte n3) {
        for (int k = g; k < g + n; ++k) {
            for (int l = i; l < i + n2; ++l) {
                if (k < 0 || l < 0 || k >= 104 || l >= 104) {
                    return false;
                }
                final Q_1 q;
                if ((q = this.i[a][k][l]) != null && q.k >= 5) {
                    return false;
                }
            }
        }
        final v v;
        (v = new v()).m = m;
        v.n = n3;
        v.a = a;
        v.c = c;
        v.d = j;
        v.b = b;
        v.e = e;
        v.f = f;
        v.g = g;
        v.i = i;
        v.h = g + n - 1;
        v.j = i + n2 - 1;
        for (int n4 = g; n4 < g + n; ++n4) {
            for (int n5 = i; n5 < i + n2; ++n5) {
                c = 0;
                if (n4 > g) {
                    ++c;
                }
                if (n4 < g + n - 1) {
                    c += 4;
                }
                if (n5 > i) {
                    c += 8;
                }
                if (n5 < i + n2 - 1) {
                    c += 2;
                }
                for (j = a; j >= 0; --j) {
                    if (this.i[j][n4][n5] == null) {
                        this.i[j][n4][n5] = new Q_1(j, n4, n5);
                    }
                }
                final Q_1 q3;
                final Q_1 q2 = q3 = this.i[a][n4][n5];
                q2.l[q3.k] = v;
                q3.m[q3.k] = c;
                final Q_1 q4 = q3;
                q4.n |= c;
                final Q_1 q5 = q3;
                ++q5.k;
            }
        }
        if (b2) {
            this.l[this.k++] = v;
        }
        return true;
    }
    
    public final void c() {
        for (int i = 0; i < this.k; ++i) {
            this.a(this.l[i]);
            this.l[i] = null;
        }
        this.k = 0;
    }
    
    private void a(final v v) {
        for (int i = v.g; i <= v.h; ++i) {
            for (int j = v.i; j <= v.j; ++j) {
                final Q_1 q;
                if ((q = this.i[v.a][i][j]) != null) {
                    for (int k = 0; k < q.k; ++k) {
                        if (q.l[k] == v) {
                            final Q_1 q2 = q;
                            --q2.k;
                            for (int l = k; l < q.k; ++l) {
                                final int n = l;
                                final v[] m = q.l;
                                m[n] = m[l + 1];
                                final int n2 = l;
                                final int[] m2 = q.m;
                                m2[n2] = m2[l + 1];
                            }
                            q.l[q.k] = null;
                            break;
                        }
                    }
                    q.n = 0;
                    for (int n3 = 0; n3 < q.k; ++n3) {
                        final Q_1 q3 = q;
                        q3.n |= q.m[n3];
                    }
                }
            }
        }
    }
    
    public final void b(int n, final int n2, int n3, final int n4) {
        final Q_1 q;
        if ((q = this.i[n4][n3][n]) == null) {
            return;
        }
        final ac h;
        if ((h = q.h) != null) {
            n3 = (n3 << 7) + 64;
            n = (n << 7) + 64;
            h.b = n3 + (h.b - n3) * n2 / 16;
            h.c = n + (h.c - n) * n2 / 16;
        }
    }
    
    public final void a(final int n, final int n2, final int n3, final byte b) {
        final Q_1 q;
        if ((q = this.i[n2][n][n3]) != null) {
            q.g = null;
        }
    }
    
    public final void a(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n2][n3][n]) != null) {
            q.h = null;
        }
    }
    
    public final void b(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) == null) {
            return;
        }
        for (int i = 0; i < q.k; ++i) {
            final v v;
            if (((v = q.l[i]).m >> 29 & 0x3) == 0x2 && v.g == n2 && v.i == n3) {
                this.a(v);
                return;
            }
        }
    }
    
    public final void c(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n3][n2]) == null) {
            return;
        }
        q.i = null;
    }
    
    public final void d(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) != null) {
            q.j = null;
        }
    }
    
    public final ab e(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) == null) {
            return null;
        }
        return q.g;
    }
    
    public final ac f(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n3][n][n2]) == null) {
            return null;
        }
        return q.h;
    }
    
    public final v g(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n3][n][n2]) == null) {
            return null;
        }
        for (int i = 0; i < q.k; ++i) {
            final v v;
            if (((v = q.l[i]).m >> 29 & 0x3) == 0x2 && v.g == n && v.i == n2) {
                return v;
            }
        }
        return null;
    }
    
    public final Z_1 h(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n3][n2][n]) == null || q.i == null) {
            return null;
        }
        return q.i;
    }
    
    public final int i(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) == null || q.g == null) {
            return 0;
        }
        return q.g.h;
    }
    
    public final int j(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) == null || q.h == null) {
            return 0;
        }
        return q.h.g;
    }
    
    public final int k(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) == null) {
            return 0;
        }
        for (int i = 0; i < q.k; ++i) {
            final v v;
            if (((v = q.l[i]).m >> 29 & 0x3) == 0x2 && v.g == n2 && v.i == n3) {
                return v.m;
            }
        }
        return 0;
    }
    
    public final int l(final int n, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][n2][n3]) == null || q.i == null) {
            return 0;
        }
        return q.i.e;
    }
    
    public final int c(final int n, int i, final int n2, final int n3) {
        final Q_1 q;
        if ((q = this.i[n][i][n2]) == null) {
            return -1;
        }
        if (q.g != null && q.g.h == n3) {
            return q.g.i & 0xFF;
        }
        if (q.h != null && q.h.g == n3) {
            return q.h.h & 0xFF;
        }
        if (q.i != null && q.i.e == n3) {
            return q.i.f & 0xFF;
        }
        for (i = 0; i < q.k; ++i) {
            if (q.l[i].m == n3) {
                return q.l[i].n & 0xFF;
            }
        }
        return -1;
    }
    
    public final void m(int n, int i, int j) {
        n = (int)Math.sqrt(5100.0);
        n = n * 768 >> 8;
        int k;
        Q_1 q;
        ab g;
        int l;
        v v;
        Z_1 m;
        int n2;
        int n3;
        D_1 d;
        int n4;
        D_1 d2;
        int n5;
        int n6;
        Q_1 q2;
        Q_1 q3;
        Q_1 q4;
        Q_1 q5;
        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 104; ++j) {
                for (k = 0; k < 104; ++k) {
                    if ((q = this.i[i][j][k]) != null) {
                        if ((g = q.g) != null && g.f != null && g.f.aC != null) {
                            this.a(i, 1, 1, j, k, (D_1)g.f);
                            if (g.g != null && g.g.aC != null) {
                                this.a(i, 1, 1, j, k, (D_1)g.g);
                                this.a((D_1)g.f, (D_1)g.g, 0, 0, 0, false);
                                ((D_1)g.g).a(80, n, -50, -10, -50);
                            }
                            ((D_1)g.f).a(80, n, -50, -10, -50);
                        }
                        for (l = 0; l < q.k; ++l) {
                            if ((v = q.l[l]) != null && v.e != null && v.e.aC != null) {
                                this.a(i, v.h - v.g + 1, v.j - v.i + 1, j, k, (D_1)v.e);
                                ((D_1)v.e).a(80, n, -50, -10, -50);
                            }
                        }
                        if ((m = q.i) != null && m.d.aC != null) {
                            n2 = j;
                            n3 = i;
                            d = (D_1)m.d;
                            n4 = k;
                            d2 = d;
                            n5 = n3;
                            n6 = n2;
                            if (n6 < 104 && (q2 = this.i[n5][n6 + 1][n4]) != null && q2.i != null && q2.i.d.aC != null) {
                                this.a(d2, (D_1)q2.i.d, 128, 0, 0, true);
                            }
                            if (n4 < 104 && (q3 = this.i[n5][n6][n4 + 1]) != null && q3.i != null && q3.i.d.aC != null) {
                                this.a(d2, (D_1)q3.i.d, 0, 0, 128, true);
                            }
                            if (n6 < 104 && n4 < 104 && (q4 = this.i[n5][n6 + 1][n4 + 1]) != null && q4.i != null && q4.i.d.aC != null) {
                                this.a(d2, (D_1)q4.i.d, 128, 0, 128, true);
                            }
                            if (n6 < 104 && n4 > 0 && (q5 = this.i[n5][n6 + 1][n4 - 1]) != null && q5.i != null && q5.i.d.aC != null) {
                                this.a(d2, (D_1)q5.i.d, 128, 0, -128, true);
                            }
                            ((D_1)m.d).a(80, n, -50, -10, -50);
                        }
                    }
                }
            }
        }
    }
    
    private void a(final int n, final int n2, final int n3, final int n4, final int n5, final D_1 d) {
        boolean b = true;
        int n6 = n4;
        final int n7 = n4 + n2;
        final int n8 = n5 - 1;
        final int n9 = n5 + n3;
        for (int i = n; i <= n + 1; ++i) {
            if (i != 4) {
                for (int j = n6; j <= n7; ++j) {
                    if (j >= 0 && j < 104) {
                        for (int k = n8; k <= n9; ++k) {
                            final Q_1 q;
                            if (k >= 0 && k < 104 && (!b || j >= n7 || k >= n9 || (k < n5 && j != n4)) && (q = this.i[i][j][k]) != null) {
                                final int n10 = (this.h[i][j][k] + this.h[i][j + 1][k] + this.h[i][j][k + 1] + this.h[i][j + 1][k + 1]) / 4 - (this.h[n][n4][n5] + this.h[n][n4 + 1][n5] + this.h[n][n4][n5 + 1] + this.h[n][n4 + 1][n5 + 1]) / 4;
                                final ab g;
                                if ((g = q.g) != null && g.f != null && g.f.aC != null) {
                                    this.a(d, (D_1)g.f, (j - n4 << 7) + (1 - n2 << 6), n10, (k - n5 << 7) + (1 - n3 << 6), b);
                                }
                                if (g != null && g.g != null && g.g.aC != null) {
                                    this.a(d, (D_1)g.g, (j - n4 << 7) + (1 - n2 << 6), n10, (k - n5 << 7) + (1 - n3 << 6), b);
                                }
                                for (int l = 0; l < q.k; ++l) {
                                    final v v;
                                    if ((v = q.l[l]) != null && v.e != null && v.e.aC != null) {
                                        this.a(d, (D_1)v.e, (v.g - n4 << 7) + (v.h - v.g + 1 - n2 << 6), n10, (v.i - n5 << 7) + (v.j - v.i + 1 - n3 << 6), b);
                                    }
                                }
                            }
                        }
                    }
                }
                --n6;
                b = false;
            }
        }
    }
    
    private void a(final D_1 d, final D_1 d2, final int n, final int n2, final int n3, final boolean b) {
        ++this.ab;
        int n4 = 0;
        final int[] c = d2.c;
        final int b2 = d2.b;
        for (int i = 0; i < d.b; ++i) {
            final F_1 f = d.aC[i];
            final F_1 f2;
            final int n5;
            final int n6;
            final int n7;
            if ((f2 = d.x[i]).d != 0 && (n5 = d.d[i] - n2) <= d2.q && (n6 = d.c[i] - n) >= d2.l && n6 <= d2.m && (n7 = d.e[i] - n3) >= d2.o && n7 <= d2.n) {
                for (int j = 0; j < b2; ++j) {
                    final F_1 f3 = d2.aC[j];
                    final F_1 f4 = d2.x[j];
                    if (n6 == c[j] && n7 == d2.e[j] && n5 == d2.d[j] && f4.d != 0) {
                        final F_1 f5 = f;
                        f5.a += f4.a;
                        final F_1 f6 = f;
                        f6.b += f4.b;
                        final F_1 f7 = f;
                        f7.c += f4.c;
                        final F_1 f8 = f;
                        f8.d += f4.d;
                        final F_1 f9 = f3;
                        f9.a += f2.a;
                        final F_1 f10 = f3;
                        f10.b += f2.b;
                        final F_1 f11 = f3;
                        f11.c += f2.c;
                        final F_1 f12 = f3;
                        f12.d += f2.d;
                        ++n4;
                        this.Z[i] = this.ab;
                        this.aa[j] = this.ab;
                    }
                }
            }
        }
        if (n4 < 3 || !b) {
            return;
        }
        for (int k = 0; k < d.f; ++k) {
            if (this.Z[d.g[k]] == this.ab && this.Z[d.h[k]] == this.ab && this.Z[d.i[k]] == this.ab) {
                d.j[k] = -1;
            }
        }
        for (int l = 0; l < d2.f; ++l) {
            if (this.aa[d2.g[l]] == this.ab && this.aa[d2.h[l]] == this.ab && this.aa[d2.i[l]] == this.ab) {
                d2.j[l] = -1;
            }
        }
    }
    
    public final void a(final int[] array, int n, int n2, int i, int m) {
        final Q_1 q;
        if ((q = this.i[n2][i][m]) == null) {
            return;
        }
        final V_1 e;
        if ((e = q.e) != null) {
            if ((n2 = e.g) == 0) {
                return;
            }
            for (i = 0; i < 4; ++i) {
                array[n + 1] = (array[n] = n2);
                array[n + 3] = (array[n + 2] = n2);
                n += 512;
            }
        }
        else {
            final U_1 f;
            if ((f = q.f) == null) {
                return;
            }
            i = f.l;
            m = f.m;
            final int n3 = f.n;
            n2 = f.o;
            final int[] array2 = this.ac[i];
            final int[] array3 = this.ad[m];
            int n4 = 0;
            if (n3 != 0) {
                for (int j = 0; j < 4; ++j) {
                    array[n] = ((array2[array3[n4++]] != 0) ? n2 : n3);
                    array[n + 1] = ((array2[array3[n4++]] != 0) ? n2 : n3);
                    array[n + 2] = ((array2[array3[n4++]] != 0) ? n2 : n3);
                    array[n + 3] = ((array2[array3[n4++]] != 0) ? n2 : n3);
                    n += 512;
                }
                return;
            }
            for (int k = 0; k < 4; ++k) {
                if (array2[array3[n4++]] != 0) {
                    array[n] = n2;
                }
                if (array2[array3[n4++]] != 0) {
                    array[n + 1] = n2;
                }
                if (array2[array3[n4++]] != 0) {
                    array[n + 2] = n2;
                }
                if (array2[array3[n4++]] != 0) {
                    array[n + 3] = n2;
                }
                n += 512;
            }
        }
    }
    
    public static void a(final int n, int i, int j, int k, final int[] array) {
        uwotm8.W_1.ai = 0;
        uwotm8.W_1.aj = 0;
        uwotm8.W_1.ak = j;
        uwotm8.W_1.al = k;
        uwotm8.W_1.ag = j / 2;
        uwotm8.W_1.ah = k / 2;
        final boolean[][][][] array2 = new boolean[9][32][53][53];
        int n2;
        int l;
        int n3;
        int n4;
        int n5;
        boolean b;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        boolean b2;
        int n16;
        int n17;
        for (i = 128; i <= 384; i += 32) {
            for (j = 0; j < 2048; j += 64) {
                uwotm8.W_1.z = uwotm8.D_1.D[i];
                uwotm8.W_1.A = uwotm8.D_1.E[i];
                uwotm8.W_1.B = uwotm8.D_1.D[j];
                uwotm8.W_1.C = uwotm8.D_1.E[j];
                k = (i - 128) / 32;
                n2 = j / 64;
                for (l = -26; l <= 26; ++l) {
                    for (n3 = -26; n3 <= 26; ++n3) {
                        n4 = l << 7;
                        n5 = n3 << 7;
                        b = false;
                        for (n6 = -500; n6 <= 800; n6 += 128) {
                            n7 = array[k] + n6;
                            n8 = n5;
                            n9 = n4;
                            n10 = n8;
                            n11 = n7;
                            n12 = n10 * uwotm8.W_1.B + n9 * uwotm8.W_1.C >> 16;
                            n13 = n10 * uwotm8.W_1.C - n9 * uwotm8.W_1.B >> 16;
                            n14 = n11 * uwotm8.W_1.z + n13 * uwotm8.W_1.A >> 16;
                            n15 = n11 * uwotm8.W_1.A - n13 * uwotm8.W_1.z >> 16;
                            if (n14 < 50 || n14 > 3500) {
                                b2 = false;
                            }
                            else {
                                n16 = uwotm8.W_1.ag + (n12 << Client.l) / n14;
                                n17 = uwotm8.W_1.ah + (n15 << Client.l) / n14;
                                b2 = (n16 >= 0 && n16 <= uwotm8.W_1.ak && n17 >= 0 && n17 <= uwotm8.W_1.al);
                            }
                            if (b2) {
                                b = true;
                                break;
                            }
                        }
                        array2[k][n2][l + 25 + 1][n3 + 25 + 1] = b;
                    }
                }
            }
        }
        int n18;
        boolean b3;
        int n19;
        int n20;
        for (i = 0; i < 8; ++i) {
            for (j = 0; j < 32; ++j) {
                for (k = -25; k < 25; ++k) {
                    for (n18 = -25; n18 < 25; ++n18) {
                        b3 = false;
                    Label_0605:
                        for (n19 = -1; n19 <= 1; ++n19) {
                            for (n20 = -1; n20 <= 1; ++n20) {
                                if (array2[i][j][k + n19 + 25 + 1][n18 + n20 + 25 + 1]) {
                                    b3 = true;
                                    break Label_0605;
                                }
                                if (array2[i][(j + 1) % 31][k + n19 + 25 + 1][n18 + n20 + 25 + 1]) {
                                    b3 = true;
                                    break Label_0605;
                                }
                                if (array2[i + 1][j][k + n19 + 25 + 1][n18 + n20 + 25 + 1]) {
                                    b3 = true;
                                    break Label_0605;
                                }
                                if (array2[i + 1][(j + 1) % 31][k + n19 + 25 + 1][n18 + n20 + 25 + 1]) {
                                    b3 = true;
                                    break Label_0605;
                                }
                            }
                        }
                        uwotm8.W_1.ae[i][j][k + 25][n18 + 25] = b3;
                    }
                }
            }
        }
    }
    
    public static void b(final int k, final int j) {
        uwotm8.W_1.I = true;
        uwotm8.W_1.J = j;
        uwotm8.W_1.K = k;
        uwotm8.W_1.b = -1;
        uwotm8.W_1.c = -1;
    }
    
    public final void a(int i, int y, int j, int k, int o, int l) {
        if (i < 0) {
            i = 0;
        }
        else if (i >= 13312) {
            i = 13311;
        }
        if (y < 0) {
            y = 0;
        }
        else if (y >= 13312) {
            y = 13311;
        }
        ++uwotm8.W_1.p;
        uwotm8.W_1.z = uwotm8.D_1.D[l];
        uwotm8.W_1.A = uwotm8.D_1.E[l];
        uwotm8.W_1.B = uwotm8.D_1.D[j];
        uwotm8.W_1.C = uwotm8.D_1.E[j];
        uwotm8.W_1.af = uwotm8.W_1.ae[(l - 128) / 32][j / 64];
        uwotm8.W_1.w = i;
        uwotm8.W_1.x = k;
        uwotm8.W_1.y = y;
        uwotm8.W_1.u = i / 128;
        uwotm8.W_1.v = y / 128;
        uwotm8.W_1.o = o;
        if ((uwotm8.W_1.q = uwotm8.W_1.u - 25) < 0) {
            uwotm8.W_1.q = 0;
        }
        if ((uwotm8.W_1.s = uwotm8.W_1.v - 25) < 0) {
            uwotm8.W_1.s = 0;
        }
        if ((uwotm8.W_1.r = uwotm8.W_1.u + 25) > 104) {
            uwotm8.W_1.r = 104;
        }
        if ((uwotm8.W_1.t = uwotm8.W_1.v + 25) > 104) {
            uwotm8.W_1.t = 104;
        }
        i = uwotm8.W_1.M[uwotm8.W_1.o];
        final T_1[] array = uwotm8.W_1.N[uwotm8.W_1.o];
        uwotm8.W_1.O = 0;
        T_1 t;
        int n;
        int n2;
        int n3;
        boolean b;
        int n4;
        T_1 t2;
        T_1 t3;
        T_1 t4;
        T_1 t5;
        int n5;
        int n6;
        int n7;
        boolean b2;
        int n8;
        T_1 t6;
        T_1 t7;
        T_1 t8;
        T_1 t9;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        boolean b3;
        int n14;
        int n15;
        T_1 t10;
        T_1 t11;
        T_1 t12;
        T_1 t13;
        for (j = 0; j < i; ++j) {
            if ((t = array[j]).e == 1) {
                if ((n = t.a - uwotm8.W_1.u + 25) >= 0 && n <= 50) {
                    if ((n2 = t.c - uwotm8.W_1.v + 25) < 0) {
                        n2 = 0;
                    }
                    if ((n3 = t.d - uwotm8.W_1.v + 25) > 50) {
                        n3 = 50;
                    }
                    b = false;
                    while (n2 <= n3) {
                        if (uwotm8.W_1.af[n][n2++]) {
                            b = true;
                            break;
                        }
                    }
                    if (b) {
                        if ((n4 = uwotm8.W_1.w - t.f) > 32) {
                            t.l = 1;
                        }
                        else {
                            if (n4 >= -32) {
                                continue;
                            }
                            t.l = 2;
                            n4 = -n4;
                        }
                        t2 = t;
                        t2.o = (t2.h - uwotm8.W_1.y << 8) / n4;
                        t3 = t;
                        t3.p = (t3.i - uwotm8.W_1.y << 8) / n4;
                        t4 = t;
                        t4.q = (t4.j - uwotm8.W_1.x << 8) / n4;
                        t5 = t;
                        t5.r = (t5.k - uwotm8.W_1.x << 8) / n4;
                        uwotm8.W_1.P[uwotm8.W_1.O++] = t;
                    }
                }
            }
            else if (t.e == 2) {
                if ((n5 = t.c - uwotm8.W_1.v + 25) >= 0 && n5 <= 50) {
                    if ((n6 = t.a - uwotm8.W_1.u + 25) < 0) {
                        n6 = 0;
                    }
                    if ((n7 = t.b - uwotm8.W_1.u + 25) > 50) {
                        n7 = 50;
                    }
                    b2 = false;
                    while (n6 <= n7) {
                        if (uwotm8.W_1.af[n6++][n5]) {
                            b2 = true;
                            break;
                        }
                    }
                    if (b2) {
                        if ((n8 = uwotm8.W_1.y - t.h) > 32) {
                            t.l = 3;
                        }
                        else {
                            if (n8 >= -32) {
                                continue;
                            }
                            t.l = 4;
                            n8 = -n8;
                        }
                        t6 = t;
                        t6.m = (t6.f - uwotm8.W_1.w << 8) / n8;
                        t7 = t;
                        t7.n = (t7.g - uwotm8.W_1.w << 8) / n8;
                        t8 = t;
                        t8.q = (t8.j - uwotm8.W_1.x << 8) / n8;
                        t9 = t;
                        t9.r = (t9.k - uwotm8.W_1.x << 8) / n8;
                        uwotm8.W_1.P[uwotm8.W_1.O++] = t;
                    }
                }
            }
            else if (t.e == 4 && (n9 = t.j - uwotm8.W_1.x) > 128) {
                if ((n10 = t.c - uwotm8.W_1.v + 25) < 0) {
                    n10 = 0;
                }
                if ((n11 = t.d - uwotm8.W_1.v + 25) > 50) {
                    n11 = 50;
                }
                if (n10 <= n11) {
                    if ((n12 = t.a - uwotm8.W_1.u + 25) < 0) {
                        n12 = 0;
                    }
                    if ((n13 = t.b - uwotm8.W_1.u + 25) > 50) {
                        n13 = 50;
                    }
                    b3 = false;
                Label_0931:
                    for (n14 = n12; n14 <= n13; ++n14) {
                        for (n15 = n10; n15 <= n11; ++n15) {
                            if (uwotm8.W_1.af[n14][n15]) {
                                b3 = true;
                                break Label_0931;
                            }
                        }
                    }
                    if (b3) {
                        t.l = 5;
                        t10 = t;
                        t10.m = (t10.f - uwotm8.W_1.w << 8) / n9;
                        t11 = t;
                        t11.n = (t11.g - uwotm8.W_1.w << 8) / n9;
                        t12 = t;
                        t12.o = (t12.h - uwotm8.W_1.y << 8) / n9;
                        t13 = t;
                        t13.p = (t13.i - uwotm8.W_1.y << 8) / n9;
                        uwotm8.W_1.P[uwotm8.W_1.O++] = t;
                    }
                }
            }
        }
        uwotm8.W_1.n = 0;
        Q_1[][] array2;
        Q_1 q;
        Q_1 q2;
        for (i = this.j; i < 4; ++i) {
            array2 = this.i[i];
            for (j = uwotm8.W_1.q; j < uwotm8.W_1.r; ++j) {
                for (l = uwotm8.W_1.s; l < uwotm8.W_1.t; ++l) {
                    if ((q = array2[j][l]) != null) {
                        if (q.o > o || (!uwotm8.W_1.af[j - uwotm8.W_1.u + 25][l - uwotm8.W_1.v + 25] && this.h[i][j][l] - k < 2000)) {
                            q.p = false;
                            q.q = false;
                            q.s = 0;
                        }
                        else {
                            q.p = true;
                            q.q = true;
                            q2 = q;
                            q2.r = (q2.k > 0);
                            ++uwotm8.W_1.n;
                        }
                    }
                }
            }
        }
        Q_1[][] array3;
        int n16;
        int n17;
        Q_1 q3;
        Q_1 q4;
        Q_1 q5;
        Q_1 q6;
        for (i = this.j; i < 4; ++i) {
            array3 = this.i[i];
            for (j = -25; j <= 0; ++j) {
                l = uwotm8.W_1.u + j;
                n16 = uwotm8.W_1.u - j;
                if (l >= uwotm8.W_1.q || n16 < uwotm8.W_1.r) {
                    for (k = -25; k <= 0; ++k) {
                        o = uwotm8.W_1.v + k;
                        n17 = uwotm8.W_1.v - k;
                        if (l >= uwotm8.W_1.q) {
                            if (o >= uwotm8.W_1.s && (q3 = array3[l][o]) != null && q3.p) {
                                this.a(q3, true);
                            }
                            if (n17 < uwotm8.W_1.t && (q4 = array3[l][n17]) != null && q4.p) {
                                this.a(q4, true);
                            }
                        }
                        if (n16 < uwotm8.W_1.r) {
                            if (o >= uwotm8.W_1.s && (q5 = array3[n16][o]) != null && q5.p) {
                                this.a(q5, true);
                            }
                            if (n17 < uwotm8.W_1.t && (q6 = array3[n16][n17]) != null && q6.p) {
                                this.a(q6, true);
                            }
                        }
                        if (uwotm8.W_1.n == 0) {
                            uwotm8.W_1.I = false;
                            return;
                        }
                    }
                }
            }
        }
        Q_1[][] array4;
        int n18;
        int n19;
        Q_1 q7;
        Q_1 q8;
        Q_1 q9;
        Q_1 q10;
        for (i = this.j; i < 4; ++i) {
            array4 = this.i[i];
            for (j = -25; j <= 0; ++j) {
                l = uwotm8.W_1.u + j;
                n18 = uwotm8.W_1.u - j;
                if (l >= uwotm8.W_1.q || n18 < uwotm8.W_1.r) {
                    for (k = -25; k <= 0; ++k) {
                        o = uwotm8.W_1.v + k;
                        n19 = uwotm8.W_1.v - k;
                        if (l >= uwotm8.W_1.q) {
                            if (o >= uwotm8.W_1.s && (q7 = array4[l][o]) != null && q7.p) {
                                this.a(q7, false);
                            }
                            if (n19 < uwotm8.W_1.t && (q8 = array4[l][n19]) != null && q8.p) {
                                this.a(q8, false);
                            }
                        }
                        if (n18 < uwotm8.W_1.r) {
                            if (o >= uwotm8.W_1.s && (q9 = array4[n18][o]) != null && q9.p) {
                                this.a(q9, false);
                            }
                            if (n19 < uwotm8.W_1.t && (q10 = array4[n18][n19]) != null && q10.p) {
                                this.a(q10, false);
                            }
                        }
                        if (uwotm8.W_1.n == 0) {
                            uwotm8.W_1.I = false;
                            return;
                        }
                    }
                }
            }
        }
        uwotm8.W_1.I = false;
    }
    
    private void a(Q_1 q, boolean b) {
        uwotm8.W_1.Q.a(q);
        while ((q = (Q_1)uwotm8.W_1.Q.a()) != null) {
            if (q.q) {
                final int b2 = q.b;
                final int c = q.c;
                final int a = q.a;
                final int d = q.d;
                final Q_1[][] array = this.i[a];
                if (q.p) {
                    if (b) {
                        final Q_1 q2;
                        final Q_1 q3;
                        final Q_1 q4;
                        final Q_1 q5;
                        if ((a > 0 && (q2 = this.i[a - 1][b2][c]) != null && q2.q) || (b2 <= uwotm8.W_1.u && b2 > uwotm8.W_1.q && (q3 = array[b2 - 1][c]) != null && q3.q && (q3.p || (q.n & 0x1) == 0x0)) || (b2 >= uwotm8.W_1.u && b2 < uwotm8.W_1.r - 1 && (q4 = array[b2 + 1][c]) != null && q4.q && (q4.p || (q.n & 0x4) == 0x0)) || (c <= uwotm8.W_1.v && c > uwotm8.W_1.s && (q5 = array[b2][c - 1]) != null && q5.q && (q5.p || (q.n & 0x8) == 0x0))) {
                            continue;
                        }
                        final Q_1 q6;
                        if (c >= uwotm8.W_1.v && c < uwotm8.W_1.t - 1 && (q6 = array[b2][c + 1]) != null && q6.q) {
                            if (q6.p) {
                                continue;
                            }
                            if ((q.n & 0x2) == 0x0) {
                                continue;
                            }
                        }
                    }
                    else {
                        b = true;
                    }
                    q.p = false;
                    if (q.w != null) {
                        final Q_1 w;
                        if ((w = q.w).e != null) {
                            if (!this.n(0, b2, c)) {
                                this.a(w.e, 0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, b2, c);
                            }
                        }
                        else if (w.f != null && !this.n(0, b2, c)) {
                            this.a(b2, uwotm8.W_1.z, uwotm8.W_1.B, w.f, uwotm8.W_1.A, c, uwotm8.W_1.C);
                        }
                        final ab g;
                        if ((g = w.g) != null) {
                            g.f.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, g.b - uwotm8.W_1.w, g.a - uwotm8.W_1.x, g.c - uwotm8.W_1.y, g.h);
                        }
                        for (int i = 0; i < w.k; ++i) {
                            final v v;
                            if ((v = w.l[i]) != null) {
                                v.e.a(v.f, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, v.c - uwotm8.W_1.w, v.b - uwotm8.W_1.x, v.d - uwotm8.W_1.y, v.m);
                            }
                        }
                    }
                    boolean b3 = false;
                    if (q.e != null) {
                        if (!this.n(d, b2, c)) {
                            b3 = true;
                            this.a(q.e, d, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, b2, c);
                        }
                    }
                    else if (q.f != null && !this.n(d, b2, c)) {
                        b3 = true;
                        this.a(b2, uwotm8.W_1.z, uwotm8.W_1.B, q.f, uwotm8.W_1.A, c, uwotm8.W_1.C);
                    }
                    int n = 0;
                    int n2 = 0;
                    final ab g2 = q.g;
                    final ac h = q.h;
                    if (g2 != null || h != null) {
                        if (uwotm8.W_1.u == b2) {
                            ++n;
                        }
                        else if (uwotm8.W_1.u < b2) {
                            n += 2;
                        }
                        if (uwotm8.W_1.v == c) {
                            n += 3;
                        }
                        else if (uwotm8.W_1.v > c) {
                            n += 6;
                        }
                        n2 = uwotm8.W_1.R[n];
                        q.v = uwotm8.W_1.T[n];
                    }
                    if (g2 != null) {
                        if ((g2.d & uwotm8.W_1.S[n]) != 0x0) {
                            if (g2.d == 16) {
                                q.s = 3;
                                q.t = uwotm8.W_1.U[n];
                                q.u = 3 - q.t;
                            }
                            else if (g2.d == 32) {
                                q.s = 6;
                                q.t = uwotm8.W_1.V[n];
                                q.u = 6 - q.t;
                            }
                            else if (g2.d == 64) {
                                q.s = 12;
                                q.t = uwotm8.W_1.W[n];
                                q.u = 12 - q.t;
                            }
                            else {
                                q.s = 9;
                                q.t = uwotm8.W_1.X[n];
                                q.u = 9 - q.t;
                            }
                        }
                        else {
                            q.s = 0;
                        }
                        if ((g2.d & n2) != 0x0 && !this.d(d, b2, c, g2.d)) {
                            g2.f.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, g2.b - uwotm8.W_1.w, g2.a - uwotm8.W_1.x, g2.c - uwotm8.W_1.y, g2.h);
                        }
                        if ((g2.e & n2) != 0x0 && !this.d(d, b2, c, g2.e)) {
                            g2.g.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, g2.b - uwotm8.W_1.w, g2.a - uwotm8.W_1.x, g2.c - uwotm8.W_1.y, g2.h);
                        }
                    }
                    if (h != null && !this.e(d, b2, c, h.f.aD)) {
                        if ((h.d & n2) != 0x0) {
                            h.f.a(h.e, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, h.b - uwotm8.W_1.w, h.a - uwotm8.W_1.x, h.c - uwotm8.W_1.y, h.g);
                        }
                        else if ((h.d & 0x300) != 0x0) {
                            final int n3 = h.b - uwotm8.W_1.w;
                            final int n4 = h.a - uwotm8.W_1.x;
                            final int n5 = h.c - uwotm8.W_1.y;
                            final int e;
                            int n6;
                            if ((e = h.e) == 1 || e == 2) {
                                n6 = -n3;
                            }
                            else {
                                n6 = n3;
                            }
                            int n7;
                            if (e == 2 || e == 3) {
                                n7 = -n5;
                            }
                            else {
                                n7 = n5;
                            }
                            if ((h.d & 0x100) != 0x0 && n7 < n6) {
                                h.f.a((e << 9) + 256, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, n3 + uwotm8.W_1.E[e], n4, n5 + uwotm8.W_1.F[e], h.g);
                            }
                            if ((h.d & 0x200) != 0x0 && n7 > n6) {
                                h.f.a((e << 9) + 1280 & 0x7FF, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, n3 + uwotm8.W_1.G[e], n4, n5 + uwotm8.W_1.H[e], h.g);
                            }
                        }
                    }
                    if (b3) {
                        final Z_1 j;
                        if ((j = q.i) != null) {
                            j.d.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, j.b - uwotm8.W_1.w, j.a - uwotm8.W_1.x, j.c - uwotm8.W_1.y, j.e);
                        }
                        final R_1 k;
                        if ((k = q.j) != null && k.h == 0) {
                            if (k.e != null) {
                                k.e.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, k.b - uwotm8.W_1.w, k.a - uwotm8.W_1.x, k.c - uwotm8.W_1.y, k.g);
                            }
                            if (k.f != null) {
                                k.f.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, k.b - uwotm8.W_1.w, k.a - uwotm8.W_1.x, k.c - uwotm8.W_1.y, k.g);
                            }
                            if (k.d != null) {
                                k.d.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, k.b - uwotm8.W_1.w, k.a - uwotm8.W_1.x, k.c - uwotm8.W_1.y, k.g);
                            }
                        }
                    }
                    final int n8;
                    if ((n8 = q.n) != 0) {
                        final Q_1 q7;
                        if (b2 < uwotm8.W_1.u && (n8 & 0x4) != 0x0 && (q7 = array[b2 + 1][c]) != null && q7.q) {
                            uwotm8.W_1.Q.a(q7);
                        }
                        final Q_1 q8;
                        if (c < uwotm8.W_1.v && (n8 & 0x2) != 0x0 && (q8 = array[b2][c + 1]) != null && q8.q) {
                            uwotm8.W_1.Q.a(q8);
                        }
                        final Q_1 q9;
                        if (b2 > uwotm8.W_1.u && (n8 & 0x1) != 0x0 && (q9 = array[b2 - 1][c]) != null && q9.q) {
                            uwotm8.W_1.Q.a(q9);
                        }
                        final Q_1 q10;
                        if (c > uwotm8.W_1.v && (n8 & 0x8) != 0x0 && (q10 = array[b2][c - 1]) != null && q10.q) {
                            uwotm8.W_1.Q.a(q10);
                        }
                    }
                }
                if (q.s != 0) {
                    boolean b4 = true;
                    for (int l = 0; l < q.k; ++l) {
                        if (q.l[l].l != uwotm8.W_1.p && (q.m[l] & q.s) == q.t) {
                            b4 = false;
                            break;
                        }
                    }
                    if (b4) {
                        final ab g3 = q.g;
                        if (!this.d(d, b2, c, g3.d)) {
                            g3.f.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, g3.b - uwotm8.W_1.w, g3.a - uwotm8.W_1.x, g3.c - uwotm8.W_1.y, g3.h);
                        }
                        q.s = 0;
                    }
                }
                if (q.r) {
                    try {
                        final int m = q.k;
                        q.r = false;
                        int n9 = 0;
                    Label_2398:
                        for (int n10 = 0; n10 < m; ++n10) {
                            final v v2;
                            if ((v2 = q.l[n10]).l != uwotm8.W_1.p) {
                                for (int g4 = v2.g; g4 <= v2.h; ++g4) {
                                    for (int i2 = v2.i; i2 <= v2.j; ++i2) {
                                        final Q_1 q11;
                                        if ((q11 = array[g4][i2]).p) {
                                            q.r = true;
                                            continue Label_2398;
                                        }
                                        if (q11.s != 0) {
                                            int n11 = 0;
                                            if (g4 > v2.g) {
                                                ++n11;
                                            }
                                            if (g4 < v2.h) {
                                                n11 += 4;
                                            }
                                            if (i2 > v2.i) {
                                                n11 += 8;
                                            }
                                            if (i2 < v2.j) {
                                                n11 += 2;
                                            }
                                            if ((n11 & q11.s) == q.u) {
                                                q.r = true;
                                                continue Label_2398;
                                            }
                                        }
                                    }
                                }
                                uwotm8.W_1.D[n9++] = v2;
                                int n12 = uwotm8.W_1.u - v2.g;
                                final int n13;
                                if ((n13 = v2.h - uwotm8.W_1.u) > n12) {
                                    n12 = n13;
                                }
                                final int n14 = uwotm8.W_1.v - v2.i;
                                final int n15;
                                if ((n15 = v2.j - uwotm8.W_1.v) > n14) {
                                    v2.k = n12 + n15;
                                }
                                else {
                                    v2.k = n12 + n14;
                                }
                            }
                        }
                        while (n9 > 0) {
                            int k2 = -50;
                            int n16 = -1;
                            for (int n17 = 0; n17 < n9; ++n17) {
                                final v v3;
                                if ((v3 = uwotm8.W_1.D[n17]).l != uwotm8.W_1.p) {
                                    if (v3.k > k2) {
                                        k2 = v3.k;
                                        n16 = n17;
                                    }
                                    else if (v3.k == k2) {
                                        final int n18 = v3.c - uwotm8.W_1.w;
                                        final int n19 = v3.d - uwotm8.W_1.y;
                                        final int n20 = uwotm8.W_1.D[n16].c - uwotm8.W_1.w;
                                        final int n21 = uwotm8.W_1.D[n16].d - uwotm8.W_1.y;
                                        final int n22 = n18;
                                        final int n23 = n22 * n22;
                                        final int n24 = n19;
                                        final int n25 = n23 + n24 * n24;
                                        final int n26 = n20;
                                        final int n27 = n26 * n26;
                                        final int n28 = n21;
                                        if (n25 > n27 + n28 * n28) {
                                            n16 = n17;
                                        }
                                    }
                                }
                            }
                            if (n16 == -1) {
                                break;
                            }
                            final v v4;
                            (v4 = uwotm8.W_1.D[n16]).l = uwotm8.W_1.p;
                            if (!this.b(d, v4.g, v4.h, v4.i, v4.j, v4.e.aD)) {
                                v4.e.a(v4.f, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, v4.c - uwotm8.W_1.w, v4.b - uwotm8.W_1.x, v4.d - uwotm8.W_1.y, v4.m);
                            }
                            for (int g5 = v4.g; g5 <= v4.h; ++g5) {
                                for (int i3 = v4.i; i3 <= v4.j; ++i3) {
                                    final Q_1 q12;
                                    if ((q12 = array[g5][i3]).s != 0) {
                                        uwotm8.W_1.Q.a(q12);
                                    }
                                    else if ((g5 != b2 || i3 != c) && q12.q) {
                                        uwotm8.W_1.Q.a(q12);
                                    }
                                }
                            }
                        }
                        if (q.r) {
                            continue;
                        }
                    }
                    catch (Exception ex) {
                        q.r = false;
                    }
                }
                final Q_1 q13;
                final Q_1 q14;
                final Q_1 q15;
                final Q_1 q16;
                if (!q.q || q.s != 0 || (b2 <= uwotm8.W_1.u && b2 > uwotm8.W_1.q && (q13 = array[b2 - 1][c]) != null && q13.q) || (b2 >= uwotm8.W_1.u && b2 < uwotm8.W_1.r - 1 && (q14 = array[b2 + 1][c]) != null && q14.q) || (c <= uwotm8.W_1.v && c > uwotm8.W_1.s && (q15 = array[b2][c - 1]) != null && q15.q) || (c >= uwotm8.W_1.v && c < uwotm8.W_1.t - 1 && (q16 = array[b2][c + 1]) != null && q16.q)) {
                    continue;
                }
                q.q = false;
                --uwotm8.W_1.n;
                final R_1 j2;
                if ((j2 = q.j) != null && j2.h != 0) {
                    if (j2.e != null) {
                        j2.e.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, j2.b - uwotm8.W_1.w, j2.a - uwotm8.W_1.x - j2.h, j2.c - uwotm8.W_1.y, j2.g);
                    }
                    if (j2.f != null) {
                        j2.f.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, j2.b - uwotm8.W_1.w, j2.a - uwotm8.W_1.x - j2.h, j2.c - uwotm8.W_1.y, j2.g);
                    }
                    if (j2.d != null) {
                        j2.d.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, j2.b - uwotm8.W_1.w, j2.a - uwotm8.W_1.x - j2.h, j2.c - uwotm8.W_1.y, j2.g);
                    }
                }
                if (q.v != 0) {
                    final ac h2;
                    if ((h2 = q.h) != null && !this.e(d, b2, c, h2.f.aD)) {
                        if ((h2.d & q.v) != 0x0) {
                            h2.f.a(h2.e, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, h2.b - uwotm8.W_1.w, h2.a - uwotm8.W_1.x, h2.c - uwotm8.W_1.y, h2.g);
                        }
                        else if ((h2.d & 0x300) != 0x0) {
                            final int n29 = h2.b - uwotm8.W_1.w;
                            final int n30 = h2.a - uwotm8.W_1.x;
                            final int n31 = h2.c - uwotm8.W_1.y;
                            final int e2;
                            int n32;
                            if ((e2 = h2.e) == 1 || e2 == 2) {
                                n32 = -n29;
                            }
                            else {
                                n32 = n29;
                            }
                            int n33;
                            if (e2 == 2 || e2 == 3) {
                                n33 = -n31;
                            }
                            else {
                                n33 = n31;
                            }
                            if ((h2.d & 0x100) != 0x0 && n33 >= n32) {
                                h2.f.a((e2 << 9) + 256, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, n29 + uwotm8.W_1.E[e2], n30, n31 + uwotm8.W_1.F[e2], h2.g);
                            }
                            if ((h2.d & 0x200) != 0x0 && n33 <= n32) {
                                h2.f.a((e2 << 9) + 1280 & 0x7FF, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, n29 + uwotm8.W_1.G[e2], n30, n31 + uwotm8.W_1.H[e2], h2.g);
                            }
                        }
                    }
                    final ab g6;
                    if ((g6 = q.g) != null) {
                        if ((g6.e & q.v) != 0x0 && !this.d(d, b2, c, g6.e)) {
                            g6.g.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, g6.b - uwotm8.W_1.w, g6.a - uwotm8.W_1.x, g6.c - uwotm8.W_1.y, g6.h);
                        }
                        if ((g6.d & q.v) != 0x0 && !this.d(d, b2, c, g6.d)) {
                            g6.f.a(0, uwotm8.W_1.z, uwotm8.W_1.A, uwotm8.W_1.B, uwotm8.W_1.C, g6.b - uwotm8.W_1.w, g6.a - uwotm8.W_1.x, g6.c - uwotm8.W_1.y, g6.h);
                        }
                    }
                }
                final Q_1 q17;
                if (a < 3 && (q17 = this.i[a + 1][b2][c]) != null && q17.q) {
                    uwotm8.W_1.Q.a(q17);
                }
                final Q_1 q18;
                if (b2 < uwotm8.W_1.u && (q18 = array[b2 + 1][c]) != null && q18.q) {
                    uwotm8.W_1.Q.a(q18);
                }
                final Q_1 q19;
                if (c < uwotm8.W_1.v && (q19 = array[b2][c + 1]) != null && q19.q) {
                    uwotm8.W_1.Q.a(q19);
                }
                final Q_1 q20;
                if (b2 > uwotm8.W_1.u && (q20 = array[b2 - 1][c]) != null && q20.q) {
                    uwotm8.W_1.Q.a(q20);
                }
                final Q_1 q21;
                if (c <= uwotm8.W_1.v || (q21 = array[b2][c - 1]) == null || !q21.q) {
                    continue;
                }
                uwotm8.W_1.Q.a(q21);
            }
        }
    }
    
    private void a(final V_1 v, int n, int n2, int n3, int n4, int n5, final int n6, final int n7) {
        final int n9;
        final int n8 = n9 = (n6 << 7) - uwotm8.W_1.w;
        final int n11;
        final int n10 = n11 = (n7 << 7) - uwotm8.W_1.y;
        final int n13;
        final int n12 = n13 = n9 + 128;
        final int n15;
        final int n14 = n15 = n11 + 128;
        final int n16 = this.h[n][n6][n7] - uwotm8.W_1.x;
        final int n17 = this.h[n][n6 + 1][n7] - uwotm8.W_1.x;
        final int n18 = this.h[n][n6 + 1][n7 + 1] - uwotm8.W_1.x;
        n = this.h[n][n6][n7 + 1] - uwotm8.W_1.x;
        final int n19 = n11 * n4 + n9 * n5 >> 16;
        final int n20 = n11 * n5 - n9 * n4 >> 16;
        final int n21 = n19;
        final int n22 = n16 * n3 - n20 * n2 >> 16;
        final int n23 = n16 * n2 + n20 * n3 >> 16;
        final int n24 = n22;
        if (n23 < 50) {
            return;
        }
        final int n25 = n10 * n4 + n13 * n5 >> 16;
        final int n26 = n10 * n5 - n13 * n4 >> 16;
        final int n27 = n25;
        final int n28 = n17 * n3 - n26 * n2 >> 16;
        final int n29 = n17 * n2 + n26 * n3 >> 16;
        final int n30 = n28;
        if (n29 < 50) {
            return;
        }
        final int n31 = n15 * n4 + n12 * n5 >> 16;
        final int n32 = n15 * n5 - n12 * n4 >> 16;
        final int n33 = n31;
        final int n34 = n18 * n3 - n32 * n2 >> 16;
        final int n35 = n18 * n2 + n32 * n3 >> 16;
        final int n36 = n34;
        if (n35 < 50) {
            return;
        }
        final int n37 = n14 * n4 + n8 * n5 >> 16;
        final int n38 = n14 * n5 - n8 * n4 >> 16;
        final int n39 = n37;
        final int n40 = n * n3 - n38 * n2 >> 16;
        final int n41 = n * n2 + n38 * n3 >> 16;
        n = n40;
        if (n41 < 50) {
            return;
        }
        n2 = uwotm8.r.e + (n21 << Client.l) / n23;
        n3 = uwotm8.r.p + (n24 << Client.l) / n23;
        n4 = uwotm8.r.e + (n27 << Client.l) / n29;
        n5 = uwotm8.r.p + (n30 << Client.l) / n29;
        final int n42 = uwotm8.r.e + (n33 << Client.l) / n35;
        final int n43 = uwotm8.r.p + (n36 << Client.l) / n35;
        final int n44 = uwotm8.r.e + (n39 << Client.l) / n41;
        final int n45 = uwotm8.r.p + (n << Client.l) / n41;
        uwotm8.r.d = 0;
        if ((n42 - n44) * (n5 - n45) - (n43 - n45) * (n4 - n44) > 0) {
            uwotm8.r.b = (n42 < 0 || n44 < 0 || n4 < 0 || n42 > uwotm8.p.m || n44 > uwotm8.p.m || n4 > uwotm8.p.m);
            if (uwotm8.W_1.I && b(uwotm8.W_1.J, uwotm8.W_1.K, n43, n45, n5, n42, n44, n4)) {
                uwotm8.W_1.b = n6;
                uwotm8.W_1.c = n7;
            }
            if (v.e == -1) {
                if (v.c != 12345678) {
                    uwotm8.r.a(n43, n45, n5, n42, n44, n4, v.c, v.d, v.b);
                }
            }
            else if (!uwotm8.W_1.a) {
                if (v.f) {
                    uwotm8.r.a(n43, n45, n5, n42, n44, n4, v.c, v.d, v.b, n21, n27, n39, n24, n30, n, n23, n29, n41, v.e);
                }
                else {
                    uwotm8.r.a(n43, n45, n5, n42, n44, n4, v.c, v.d, v.b, n33, n39, n27, n36, n, n30, n35, n41, n29, v.e);
                }
            }
            else {
                final int n46 = uwotm8.W_1.Y[v.e];
                uwotm8.r.a(n43, n45, n5, n42, n44, n4, c(n46, v.c), c(n46, v.d), c(n46, v.b));
            }
        }
        if ((n2 - n4) * (n45 - n5) - (n3 - n5) * (n44 - n4) > 0) {
            uwotm8.r.b = (n2 < 0 || n4 < 0 || n44 < 0 || n2 > uwotm8.p.m || n4 > uwotm8.p.m || n44 > uwotm8.p.m);
            if (uwotm8.W_1.I && b(uwotm8.W_1.J, uwotm8.W_1.K, n3, n5, n45, n2, n4, n44)) {
                uwotm8.W_1.b = n6;
                uwotm8.W_1.c = n7;
            }
            if (v.e == -1) {
                if (v.a != 12345678) {
                    uwotm8.r.a(n3, n5, n45, n2, n4, n44, v.a, v.b, v.d);
                }
            }
            else {
                if (!uwotm8.W_1.a) {
                    uwotm8.r.a(n3, n5, n45, n2, n4, n44, v.a, v.b, v.d, n21, n27, n39, n24, n30, n, n23, n29, n41, v.e);
                    return;
                }
                final int n47 = uwotm8.W_1.Y[v.e];
                uwotm8.r.a(n3, n5, n45, n2, n4, n44, c(n47, v.a), c(n47, v.b), c(n47, v.d));
            }
        }
    }
    
    private void a(final int b, int n, int n2, final U_1 u, int n3, final int c, int n4) {
        for (int length = u.a.length, i = 0; i < length; ++i) {
            final int n5 = u.a[i] - uwotm8.W_1.w;
            final int n6 = u.b[i] - uwotm8.W_1.x;
            final int n8;
            final int n7 = (n8 = u.c[i] - uwotm8.W_1.y) * n2 + n5 * n4 >> 16;
            final int n9 = n8 * n4 - n5 * n2 >> 16;
            final int n10 = n7;
            final int n11 = n6 * n3 - n9 * n >> 16;
            final int n12 = n6 * n + n9 * n3 >> 16;
            final int n13 = n11;
            if (n12 < 50) {
                return;
            }
            if (u.j != null) {
                uwotm8.U_1.r[i] = n10;
                uwotm8.U_1.s[i] = n13;
                uwotm8.U_1.t[i] = n12;
            }
            uwotm8.U_1.p[i] = uwotm8.r.e + (n10 << Client.l) / n12;
            uwotm8.U_1.q[i] = uwotm8.r.p + (n13 << Client.l) / n12;
        }
        uwotm8.r.d = 0;
        for (int length2 = u.g.length, j = 0; j < length2; ++j) {
            final int n14 = u.g[j];
            final int n15 = u.h[j];
            final int n16 = u.i[j];
            final int n17 = uwotm8.U_1.p[n14];
            n = uwotm8.U_1.p[n15];
            n2 = uwotm8.U_1.p[n16];
            n3 = uwotm8.U_1.q[n14];
            n4 = uwotm8.U_1.q[n15];
            final int n18 = uwotm8.U_1.q[n16];
            if ((n17 - n) * (n18 - n4) - (n3 - n4) * (n2 - n) > 0) {
                uwotm8.r.b = (n17 < 0 || n < 0 || n2 < 0 || n17 > uwotm8.p.m || n > uwotm8.p.m || n2 > uwotm8.p.m);
                if (uwotm8.W_1.I && b(uwotm8.W_1.J, uwotm8.W_1.K, n3, n4, n18, n17, n, n2)) {
                    uwotm8.W_1.b = b;
                    uwotm8.W_1.c = c;
                }
                if (u.j == null || u.j[j] == -1) {
                    if (u.d[j] != 12345678) {
                        uwotm8.r.a(n3, n4, n18, n17, n, n2, u.d[j], u.e[j], u.f[j]);
                    }
                }
                else if (!uwotm8.W_1.a) {
                    if (u.k) {
                        uwotm8.r.a(n3, n4, n18, n17, n, n2, u.d[j], u.e[j], u.f[j], uwotm8.U_1.r[0], uwotm8.U_1.r[1], uwotm8.U_1.r[3], uwotm8.U_1.s[0], uwotm8.U_1.s[1], uwotm8.U_1.s[3], uwotm8.U_1.t[0], uwotm8.U_1.t[1], uwotm8.U_1.t[3], u.j[j]);
                    }
                    else {
                        uwotm8.r.a(n3, n4, n18, n17, n, n2, u.d[j], u.e[j], u.f[j], uwotm8.U_1.r[n14], uwotm8.U_1.r[n15], uwotm8.U_1.r[n16], uwotm8.U_1.s[n14], uwotm8.U_1.s[n15], uwotm8.U_1.s[n16], uwotm8.U_1.t[n14], uwotm8.U_1.t[n15], uwotm8.U_1.t[n16], u.j[j]);
                    }
                }
                else {
                    final int n19 = uwotm8.W_1.Y[u.j[j]];
                    uwotm8.r.a(n3, n4, n18, n17, n, n2, c(n19, u.d[j]), c(n19, u.e[j]), c(n19, u.f[j]));
                }
            }
        }
    }
    
    private static int c(final int n, int n2) {
        if ((n2 = (n2 = 127 - n2) * (n & 0x7F) / 160) < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    private static boolean b(int n, final int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n2 < n3 && n2 < n4 && n2 < n5) {
            return false;
        }
        if (n2 > n3 && n2 > n4 && n2 > n5) {
            return false;
        }
        if (n < n6 && n < n7 && n < n8) {
            return false;
        }
        if (n > n6 && n > n7 && n > n8) {
            return false;
        }
        final int n9 = (n2 - n3) * (n7 - n6) - (n - n6) * (n4 - n3);
        n3 = (n2 - n5) * (n6 - n8) - (n - n8) * (n3 - n5);
        n = (n2 - n4) * (n8 - n7) - (n - n7) * (n5 - n4);
        return n9 * n > 0 && n * n3 > 0;
    }
    
    private boolean n(final int n, final int n2, final int n3) {
        final int n4;
        if ((n4 = this.m[n][n2][n3]) == -uwotm8.W_1.p) {
            return false;
        }
        if (n4 == uwotm8.W_1.p) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (o(n5 + 1, this.h[n][n2][n3], n6 + 1) && o(n5 + 128 - 1, this.h[n][n2 + 1][n3], n6 + 1) && o(n5 + 128 - 1, this.h[n][n2 + 1][n3 + 1], n6 + 128 - 1) && o(n5 + 1, this.h[n][n2][n3 + 1], n6 + 128 - 1)) {
            this.m[n][n2][n3] = uwotm8.W_1.p;
            return true;
        }
        this.m[n][n2][n3] = -uwotm8.W_1.p;
        return false;
    }
    
    private boolean d(final int n, int n2, int n3, final int n4) {
        if (!this.n(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        n3 = (n2 = this.h[n][n2][n3] - 1) - 120;
        final int n7 = n2 - 230;
        final int n8 = n2 - 238;
        if (n4 < 16) {
            if (n4 == 1) {
                if (n5 > uwotm8.W_1.w) {
                    if (!o(n5, n2, n6)) {
                        return false;
                    }
                    if (!o(n5, n2, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!o(n5, n3, n6)) {
                        return false;
                    }
                    if (!o(n5, n3, n6 + 128)) {
                        return false;
                    }
                }
                return o(n5, n7, n6) && o(n5, n7, n6 + 128);
            }
            if (n4 == 2) {
                if (n6 < uwotm8.W_1.y) {
                    if (!o(n5, n2, n6 + 128)) {
                        return false;
                    }
                    if (!o(n5 + 128, n2, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!o(n5, n3, n6 + 128)) {
                        return false;
                    }
                    if (!o(n5 + 128, n3, n6 + 128)) {
                        return false;
                    }
                }
                return o(n5, n7, n6 + 128) && o(n5 + 128, n7, n6 + 128);
            }
            if (n4 == 4) {
                if (n5 < uwotm8.W_1.w) {
                    if (!o(n5 + 128, n2, n6)) {
                        return false;
                    }
                    if (!o(n5 + 128, n2, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!o(n5 + 128, n3, n6)) {
                        return false;
                    }
                    if (!o(n5 + 128, n3, n6 + 128)) {
                        return false;
                    }
                }
                return o(n5 + 128, n7, n6) && o(n5 + 128, n7, n6 + 128);
            }
            if (n4 == 8) {
                if (n6 > uwotm8.W_1.y) {
                    if (!o(n5, n2, n6)) {
                        return false;
                    }
                    if (!o(n5 + 128, n2, n6)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!o(n5, n3, n6)) {
                        return false;
                    }
                    if (!o(n5 + 128, n3, n6)) {
                        return false;
                    }
                }
                return o(n5, n7, n6) && o(n5 + 128, n7, n6);
            }
        }
        if (!o(n5 + 64, n8, n6 + 64)) {
            return false;
        }
        if (n4 == 16) {
            return o(n5, n7, n6 + 128);
        }
        if (n4 == 32) {
            return o(n5 + 128, n7, n6 + 128);
        }
        if (n4 == 64) {
            return o(n5 + 128, n7, n6);
        }
        if (n4 == 128) {
            return o(n5, n7, n6);
        }
        System.out.println("Warning unsupported wall type");
        return true;
    }
    
    private boolean e(final int n, final int n2, final int n3, final int n4) {
        if (!this.n(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        return o(n5 + 1, this.h[n][n2][n3] - n4, n6 + 1) && o(n5 + 128 - 1, this.h[n][n2 + 1][n3] - n4, n6 + 1) && o(n5 + 128 - 1, this.h[n][n2 + 1][n3 + 1] - n4, n6 + 128 - 1) && o(n5 + 1, this.h[n][n2][n3 + 1] - n4, n6 + 128 - 1);
    }
    
    private boolean b(int n, int n2, int n3, final int n4, final int n5, final int n6) {
        if (n2 == n3 && n4 == n5) {
            if (!this.n(n, n2, n4)) {
                return false;
            }
            final int n7 = n2 << 7;
            final int n8 = n4 << 7;
            return o(n7 + 1, this.h[n][n2][n4] - n6, n8 + 1) && o(n7 + 128 - 1, this.h[n][n2 + 1][n4] - n6, n8 + 1) && o(n7 + 128 - 1, this.h[n][n2 + 1][n4 + 1] - n6, n8 + 128 - 1) && o(n7 + 1, this.h[n][n2][n4 + 1] - n6, n8 + 128 - 1);
        }
        else {
            for (int i = n2; i <= n3; ++i) {
                for (int j = n4; j <= n5; ++j) {
                    if (this.m[n][i][j] == -uwotm8.W_1.p) {
                        return false;
                    }
                }
            }
            final int n9 = (n2 << 7) + 1;
            final int n10 = (n4 << 7) + 2;
            n = this.h[n][n2][n4] - n6;
            if (!o(n9, n, n10)) {
                return false;
            }
            if (!o(n2 = (n3 << 7) - 1, n, n10)) {
                return false;
            }
            n3 = (n5 << 7) - 1;
            return o(n9, n, n3) && o(n2, n, n3);
        }
    }
    
    private static boolean o(final int n, final int n2, final int n3) {
        for (int i = 0; i < uwotm8.W_1.O; ++i) {
            final T_1 t;
            if ((t = uwotm8.W_1.P[i]).l == 1) {
                final int n4;
                if ((n4 = t.f - n) > 0) {
                    final int n5 = t.h + (t.o * n4 >> 8);
                    final int n6 = t.i + (t.p * n4 >> 8);
                    final int n7 = t.j + (t.q * n4 >> 8);
                    final int n8 = t.k + (t.r * n4 >> 8);
                    if (n3 >= n5 && n3 <= n6 && n2 >= n7 && n2 <= n8) {
                        return true;
                    }
                }
            }
            else if (t.l == 2) {
                final int n9;
                if ((n9 = n - t.f) > 0) {
                    final int n10 = t.h + (t.o * n9 >> 8);
                    final int n11 = t.i + (t.p * n9 >> 8);
                    final int n12 = t.j + (t.q * n9 >> 8);
                    final int n13 = t.k + (t.r * n9 >> 8);
                    if (n3 >= n10 && n3 <= n11 && n2 >= n12 && n2 <= n13) {
                        return true;
                    }
                }
            }
            else if (t.l == 3) {
                final int n14;
                if ((n14 = t.h - n3) > 0) {
                    final int n15 = t.f + (t.m * n14 >> 8);
                    final int n16 = t.g + (t.n * n14 >> 8);
                    final int n17 = t.j + (t.q * n14 >> 8);
                    final int n18 = t.k + (t.r * n14 >> 8);
                    if (n >= n15 && n <= n16 && n2 >= n17 && n2 <= n18) {
                        return true;
                    }
                }
            }
            else if (t.l == 4) {
                final int n19;
                if ((n19 = n3 - t.h) > 0) {
                    final int n20 = t.f + (t.m * n19 >> 8);
                    final int n21 = t.g + (t.n * n19 >> 8);
                    final int n22 = t.j + (t.q * n19 >> 8);
                    final int n23 = t.k + (t.r * n19 >> 8);
                    if (n >= n20 && n <= n21 && n2 >= n22 && n2 <= n23) {
                        return true;
                    }
                }
            }
            else {
                final int n24;
                if (t.l == 5 && (n24 = n2 - t.j) > 0) {
                    final int n25 = t.f + (t.m * n24 >> 8);
                    final int n26 = t.g + (t.n * n24 >> 8);
                    final int n27 = t.h + (t.o * n24 >> 8);
                    final int n28 = t.i + (t.p * n24 >> 8);
                    if (n >= n25 && n <= n26 && n3 >= n27 && n3 <= n28) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

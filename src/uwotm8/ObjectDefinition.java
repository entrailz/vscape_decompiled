package uwotm8;

import com.runescape.*;

public final class ObjectDefinition
{
    public static int a;
    private int C;
    public boolean b;
    private byte D;
    private int E;
    public String c;
    private int F;
    private static final Model[] G;
    private byte H;
    public int d;
    private int I;
    public int e;
    private int[] J;
    private int K;
    public int f;
    private boolean L;
    public static boolean g;
    private static Buffer M;
    public int h;
    private static int[] N;
    public boolean i;
    public int j;
    public int[] k;
    private int O;
    public int l;
    public boolean m;
    public boolean n;
    public static Client o;
    private boolean P;
    public boolean p;
    public int q;
    private boolean Q;
    private static int R;
    private int S;
    public int[] r;
    public int s;
    public int t;
    public int[] u;
    public byte[] v;
    public boolean w;
    public boolean x;
    public static Cache y;
    public int z;
    private static ObjectDefinition[] T;
    private int U;
    private int[] V;
    public static Cache A;
    public String[] B;
    
    static {
        G = new Model[4];
        uwotm8.ObjectDefinition.y = new Cache(30);
        uwotm8.ObjectDefinition.A = new Cache(500);
    }
    
    public static ObjectDefinition decode(final int h) {
        if (h > uwotm8.ObjectDefinition.N.length) {
            return null;
        }
        for (int i = 0; i < 20; ++i) {
            if (uwotm8.ObjectDefinition.T[i].h == h) {
                return uwotm8.ObjectDefinition.T[i];
            }
        }
        uwotm8.ObjectDefinition.R = (uwotm8.ObjectDefinition.R + 1) % 20;
        final ObjectDefinition j = uwotm8.ObjectDefinition.T[uwotm8.ObjectDefinition.R];
        try {
            uwotm8.ObjectDefinition.M.b = uwotm8.ObjectDefinition.N[h];
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        j.h = h;
        final ObjectDefinition k;
        (k = j).r = null;
        k.u = null;
        k.c = null;
        k.v = null;
        k.V = null;
        k.J = null;
        k.d = 1;
        k.l = 1;
        k.p = true;
        k.i = true;
        k.w = false;
        k.m = false;
        k.Q = false;
        k.n = false;
        k.z = -1;
        k.t = 16;
        k.D = 0;
        k.H = 0;
        k.B = null;
        k.e = -1;
        k.j = -1;
        k.L = false;
        k.x = true;
        k.K = 128;
        k.S = 128;
        k.F = 128;
        k.q = 0;
        k.E = 0;
        k.I = 0;
        k.U = 0;
        k.b = false;
        k.P = false;
        k.O = -1;
        k.s = -1;
        k.f = -1;
        k.k = null;
        k.C = 2;
        final ObjectDefinition l = j;
        final Buffer m = uwotm8.ObjectDefinition.M;
        final ObjectDefinition j2 = l;
        int e = -1;
        int e2;
        while ((e2 = m.e()) != 0) {
            if (e2 == 1) {
                final int e3;
                if ((e3 = m.e()) > 0) {
                    if (j2.r == null) {
                        j2.u = new int[e3];
                        j2.r = new int[e3];
                        for (int n = 0; n < e3; ++n) {
                            j2.r[n] = m.g();
                            j2.u[n] = m.e();
                        }
                    }
                    else {
                        final Buffer i2 = m;
                        i2.b += e3 * 3;
                    }
                }
            }
            else if (e2 == 2) {
                j2.c = m.l();
            }
            else if (e2 == 3) {
                j2.v = m.m();
            }
            else if (e2 == 5) {
                final int e4;
                if ((e4 = m.e()) > 0) {
                    if (j2.r == null) {
                        j2.u = null;
                        j2.r = new int[e4];
                        for (int n2 = 0; n2 < e4; ++n2) {
                            j2.r[n2] = m.g();
                        }
                    }
                    else {
                        final Buffer i3 = m;
                        i3.b += e4 << 1;
                    }
                }
            }
            else if (e2 == 14) {
                j2.d = m.e();
            }
            else if (e2 == 15) {
                j2.l = m.e();
            }
            else if (e2 == 17) {
                j2.p = false;
                j2.C = 0;
            }
            else if (e2 == 18) {
                j2.i = false;
            }
            else if (e2 == 19) {
                if ((e = m.e()) == 1) {
                    j2.w = true;
                }
            }
            else if (e2 == 21) {
                j2.m = true;
            }
            else if (e2 == 22) {
                j2.Q = true;
            }
            else if (e2 == 23) {
                j2.n = true;
            }
            else if (e2 == 24) {
                j2.z = m.g();
                if (j2.z == 65535) {
                    j2.z = -1;
                }
            }
            else if (e2 == 27) {
                j2.C = 1;
            }
            if (e2 == 28) {
                j2.t = m.e();
            }
            else if (e2 == 29) {
                j2.D = m.f();
            }
            else if (e2 == 39) {
                j2.H = m.f();
            }
            else if (e2 >= 30 && e2 < 39) {
                if (j2.B == null) {
                    j2.B = new String[5];
                }
                j2.B[e2 - 30] = m.l();
                if (!j2.B[e2 - 30].equalsIgnoreCase("hidden")) {
                    continue;
                }
                j2.B[e2 - 30] = null;
            }
            else if (e2 == 40) {
                final int e5 = m.e();
                j2.V = new int[e5];
                j2.J = new int[e5];
                for (int n3 = 0; n3 < e5; ++n3) {
                    j2.V[n3] = m.g();
                    j2.J[n3] = m.g();
                }
            }
            else if (e2 == 60) {
                j2.e = m.g();
            }
            else if (e2 == 62) {
                j2.L = true;
            }
            else if (e2 == 64) {
                j2.x = false;
            }
            else if (e2 == 65) {
                j2.K = m.g();
            }
            else if (e2 == 66) {
                j2.S = m.g();
            }
            else if (e2 == 67) {
                j2.F = m.g();
            }
            else if (e2 == 68) {
                j2.j = m.g();
            }
            else if (e2 == 69) {
                j2.q = m.e();
            }
            else if (e2 == 70) {
                j2.E = m.h();
            }
            else if (e2 == 71) {
                j2.I = m.h();
            }
            else if (e2 == 72) {
                j2.U = m.h();
            }
            else if (e2 == 73) {
                j2.b = true;
            }
            else if (e2 == 74) {
                j2.P = true;
            }
            else if (e2 == 75) {
                j2.O = m.e();
            }
            else {
                if (e2 != 77) {
                    continue;
                }
                j2.s = m.g();
                if (j2.s == 65535) {
                    j2.s = -1;
                }
                j2.f = m.g();
                if (j2.f == 65535) {
                    j2.f = -1;
                }
                final int e6 = m.e();
                j2.k = new int[e6 + 1];
                for (int n4 = 0; n4 <= e6; ++n4) {
                    j2.k[n4] = m.g();
                    if (j2.k[n4] == 65535) {
                        j2.k[n4] = -1;
                    }
                }
            }
        }
        if (e == -1) {
            final ObjectDefinition j3 = j2;
            j3.w = (j3.r != null && (j2.u == null || j2.u[0] == 10));
            if (j2.B != null) {
                j2.w = true;
            }
        }
        if (j2.P) {
            j2.p = false;
            j2.i = false;
        }
        if (j2.O == -1) {
            final ObjectDefinition j4 = j2;
            j4.O = (j4.p ? 1 : 0);
        }
        return j;
    }
    
    public static void dispose() {
    	uwotm8.ObjectDefinition.A = null;
    	uwotm8.ObjectDefinition.y = null;
    	uwotm8.ObjectDefinition.N = null;
    	uwotm8.ObjectDefinition.T = null;
    	uwotm8.ObjectDefinition.M = null;
    }
    
    public static void init(final Archive g) {
    	uwotm8.ObjectDefinition.M = new Buffer(g.getEntry("loc.dat"));
        final Buffer i;
        uwotm8.ObjectDefinition.N = new int[uwotm8.ObjectDefinition.a = (i = new Buffer(g.getEntry("loc.idx"))).g()];
        int n = 2;
        for (int j = 0; j < uwotm8.ObjectDefinition.a; ++j) {
        	uwotm8.ObjectDefinition.N[j] = n;
            n += i.g();
        }
        uwotm8.ObjectDefinition.T = new ObjectDefinition[20];
        for (int k = 0; k < 20; ++k) {
        	uwotm8.ObjectDefinition.T[k] = new ObjectDefinition();
        }
    }
    
    public final Model modelAt(int n, int n2, final int n3, final int n4, final int n5, final int n6, int i) {
        final int n7 = n;
        final int n8 = i;
        n = n2;
        final int n9 = n8;
        i = n7;
        Model d = null;
        Model d3 = null;
        Model d2 = null;
        Label_0755: {
            long n10;
            if (this.u == null) {
                if (i != 10) {
                    d2 = (d3 = null);
                    break Label_0755;
                }
                n10 = (this.h << 6) + n + (n9 + 1 << 32);
                final Model d4;
                if ((d4 = (Model)uwotm8.ObjectDefinition.y.get(n10)) != null) {
                    d2 = (d3 = d4);
                    break Label_0755;
                }
                if (this.r == null) {
                    d2 = (d3 = null);
                    break Label_0755;
                }
                final boolean b = this.L ^ n > 3;
                i = this.r.length;
                for (int j = 0; j < i; ++j) {
                    int n11 = this.r[j];
                    if (b) {
                        n11 += 65536;
                    }
                    if ((d = (Model)uwotm8.ObjectDefinition.A.get(n11)) == null) {
                        if ((d = uwotm8.Model.a(n11 & 0xFFFF)) == null) {
                            d2 = (d3 = null);
                            break Label_0755;
                        }
                        if (b) {
                            d.f();
                        }
                        uwotm8.ObjectDefinition.A.put(d, n11);
                    }
                    if (i > 1) {
                        uwotm8.ObjectDefinition.G[j] = d;
                    }
                }
                if (i > 1) {
                    d = new Model(i, uwotm8.ObjectDefinition.G);
                }
            }
            else {
                int n12 = -1;
                for (int k = 0; k < this.u.length; ++k) {
                    if (this.u[k] == i) {
                        n12 = k;
                        break;
                    }
                }
                if (n12 == -1) {
                    d2 = (d3 = null);
                    break Label_0755;
                }
                n10 = (this.h << 6) + (n12 << 3) + n + (n9 + 1 << 32);
                final Model d5;
                if ((d5 = (Model)uwotm8.ObjectDefinition.y.get(n10)) != null) {
                    d2 = (d3 = d5);
                    break Label_0755;
                }
                i = this.r[n12];
                final boolean b2;
                if (b2 = (this.L ^ n > 3)) {
                    i += 65536;
                }
                if ((d = (Model)uwotm8.ObjectDefinition.A.get(i)) == null) {
                    if ((d = uwotm8.Model.a(i & 0xFFFF)) == null) {
                        d2 = (d3 = null);
                        break Label_0755;
                    }
                    if (b2) {
                        d.f();
                    }
                    uwotm8.ObjectDefinition.A.put(d, i);
                }
            }
            final boolean b3 = this.K != 128 || this.S != 128 || this.F != 128;
            final boolean b4 = this.E != 0 || this.I != 0 || this.U != 0;
            final Model d6 = new Model(this.V == null, uwotm8.Frame.isValid(n9), n == 0 && n9 == -1 && !b3 && !b4, d);
            if (n9 != -1) {
                d6.d();
                d6.c(n9);
                d6.v = null;
                d6.u = null;
            }
            while (n-- > 0) {
                d6.e();
            }
            if (this.V != null) {
                for (int l = 0; l < this.V.length; ++l) {
                    d6.a(this.V[l], this.J[l]);
                }
            }
            if (b3) {
                d6.b(this.K, this.F, this.S);
            }
            if (b4) {
                d6.a(this.E, this.I, this.U);
            }
            d6.a(64 + this.D, 768 + this.H * 5, -50, -10, -50, !this.Q);
            if (this.O == 1) {
                final Model d7 = d6;
                d7.t = d7.aD;
            }
            uwotm8.ObjectDefinition.y.put(d6, n10);
            d2 = (d3 = d6);
        }
        Model d8 = d3;
        if (d2 == null) {
            return null;
        }
        if (this.m || this.Q) {
            d8 = new Model(this.m, this.Q, d8);
        }
        if (this.m) {
            n2 = (n3 + n4 + n5 + n6) / 4;
            int n13;
            int n14;
            int n15;
            int n16;
            int[] d9;
            int n17;
            for (i = 0; i < d8.b; ++i) {
                n13 = d8.c[i];
                n14 = d8.e[i];
                n15 = n3 + (n4 - n3) * (n13 + 64) / 128;
                n16 = n15 + (n6 + (n5 - n6) * (n13 + 64) / 128 - n15) * (n14 + 64) / 128;
                d9 = d8.d;
                n17 = i;
                d9[n17] += n16 - n2;
            }
            final Model d10;
            (d10 = d8).aD = 0;
            d10.q = 0;
            int q;
            for (i = 0; i < d10.b; ++i) {
                if (-(q = d10.d[i]) > d10.aD) {
                    d10.aD = -q;
                }
                if (q > d10.q) {
                    d10.q = q;
                }
            }
            final Model d11 = d10;
            d11.s = (int)(Math.sqrt(d11.p * d10.p + d10.aD * d10.aD) + 0.99);
            final Model d12 = d10;
            d12.r = d12.s + (int)(Math.sqrt(d10.p * d10.p + d10.q * d10.q) + 0.99);
        }
        return d8;
    }
    
    private ObjectDefinition() {
        this.C = 2;
        this.h = -1;
    }
}

package uwotm8;

public final class g
{
    public static g[] a;
    private int i;
    private int j;
    private int k;
    public Animation b;
    private final int[] l;
    private final int[] m;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public static J_1 h;
    
    static {
    	uwotm8.g.h = new J_1(30);
    }
    
    public static void a(final G_1 g) {
        final I_1 i;
        final int g2 = (i = new I_1(g.b("spotanim.dat"))).g();
        if (uwotm8.g.a == null) {
        	uwotm8.g.a = new g[g2];
        }
        for (int j = 0; j < g2; ++j) {
            if (uwotm8.g.a[j] == null) {
            	uwotm8.g.a[j] = new g();
            }
            uwotm8.g.a[j].i = j;
            final g g3 = uwotm8.g.a[j];
            final I_1 k = i;
            final g g4 = g3;
            int e;
            while ((e = k.e()) != 0) {
                if (e == 1) {
                    g4.j = k.g();
                }
                else if (e == 2) {
                    g4.k = k.g();
                    if (uwotm8.Animation.a == null) {
                        continue;
                    }
                    g4.b = uwotm8.Animation.a[g4.k];
                }
                else if (e == 4) {
                    g4.c = k.g();
                }
                else if (e == 5) {
                    g4.d = k.g();
                }
                else if (e == 6) {
                    g4.e = k.g();
                }
                else if (e == 7) {
                    g4.f = k.e();
                }
                else if (e == 8) {
                    g4.g = k.e();
                }
                else if (e == 40) {
                    for (int e2 = k.e(), l = 0; l < e2; ++l) {
                        g4.l[l] = k.g();
                        g4.m[l] = k.g();
                    }
                }
                else {
                    System.out.println("Error unrecognised spotanim config code: ".concat(String.valueOf(e)));
                }
            }
        }
    }
    
    public final D_1 a() {
        final D_1 d;
        if ((d = (D_1)uwotm8.g.h.a(this.i)) != null) {
            return d;
        }
        final D_1 a;
        if ((a = D_1.a(this.j)) == null) {
            return null;
        }
        for (int i = 0; i < 6; ++i) {
            if (this.l[0] != 0) {
                a.a(this.l[i], this.m[i]);
            }
        }
        uwotm8.g.h.a(a, this.i);
        return a;
    }
    
    private g() {
        this.k = -1;
        this.l = new int[6];
        this.m = new int[6];
        this.c = 128;
        this.d = 128;
    }
}

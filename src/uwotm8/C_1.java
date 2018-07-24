package uwotm8;

public final class C_1
{
    public static int a;
    public static C_1[] b;
    public int c;
    private int[] e;
    private final int[] f;
    private final int[] g;
    private final int[] h;
    public boolean d;
    
    public static void a(final G_1 g) {
        final I_1 i;
        C_1.a = (i = new I_1(g.b("idk.dat"))).g();
        if (C_1.b == null) {
        	C_1.b = new C_1[C_1.a];
        }
        for (int j = 0; j < C_1.a; ++j) {
            if (C_1.b[j] == null) {
            	C_1.b[j] = new C_1();
            }
            final C_1 c = C_1.b[j];
            final I_1 k = i;
            final C_1 c2 = c;
            int e;
            while ((e = k.e()) != 0) {
                if (e == 1) {
                    c2.c = k.e();
                }
                else if (e == 2) {
                    final int e2 = k.e();
                    c2.e = new int[e2];
                    for (int l = 0; l < e2; ++l) {
                        c2.e[l] = k.g();
                    }
                }
                else if (e == 3) {
                    c2.d = true;
                }
                else if (e >= 40 && e < 50) {
                    c2.f[e - 40] = k.g();
                }
                else if (e >= 50 && e < 60) {
                    c2.g[e - 50] = k.g();
                }
                else if (e >= 60 && e < 70) {
                    c2.h[e - 60] = k.g();
                }
                else {
                    System.out.println("Error unrecognised config code: ".concat(String.valueOf(e)));
                }
            }
        }
    }
    
    public final boolean a() {
        if (this.e == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < this.e.length; ++i) {
            if (!D_1.b(this.e[i])) {
                b = false;
            }
        }
        return b;
    }
    
    public final D_1 b() {
        if (this.e == null) {
            return null;
        }
        final D_1[] array = new D_1[this.e.length];
        for (int i = 0; i < this.e.length; ++i) {
            array[i] = D_1.a(this.e[i]);
        }
        D_1 d;
        if (array.length == 1) {
            d = array[0];
        }
        else {
            d = new D_1(array.length, array);
        }
        for (int n = 0; n < 6 && this.f[n] != 0; ++n) {
            d.a(this.f[n], this.g[n]);
        }
        return d;
    }
    
    public final boolean c() {
        boolean b = true;
        for (int i = 0; i < 5; ++i) {
            if (this.h[i] != -1 && !D_1.b(this.h[i])) {
                b = false;
            }
        }
        return b;
    }
    
    public final D_1 d() {
        final D_1[] array = new D_1[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            if (this.h[i] != -1) {
                array[n++] = D_1.a(this.h[i]);
            }
        }
        final D_1 d = new D_1(n, array);
        for (int n2 = 0; n2 < 6 && this.f[n2] != 0; ++n2) {
            d.a(this.f[n2], this.g[n2]);
        }
        return d;
    }
    
    private C_1() {
        this.h = new int[] { -1, -1, -1, -1, -1 };
        this.c = -1;
        this.f = new int[6];
        this.g = new int[6];
        this.d = false;
    }
}

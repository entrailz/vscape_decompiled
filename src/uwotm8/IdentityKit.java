package uwotm8;

public final class IdentityKit
{
    public static int a;
    public static IdentityKit[] b;
    public int c;
    private int[] e;
    private final int[] f;
    private final int[] g;
    private final int[] h;
    public boolean d;
    
    public static void init(final Archive g) {
        final Buffer i;
        IdentityKit.a = (i = new Buffer(g.getEntry("idk.dat"))).g();
        if (IdentityKit.b == null) {
        	IdentityKit.b = new IdentityKit[IdentityKit.a];
        }
        for (int j = 0; j < IdentityKit.a; ++j) {
            if (IdentityKit.b[j] == null) {
            	IdentityKit.b[j] = new IdentityKit();
            }
            final IdentityKit c = IdentityKit.b[j];
            final Buffer k = i;
            final IdentityKit c2 = c;
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
    
    public final boolean bodyLoaded() {
        if (this.e == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < this.e.length; ++i) {
            if (!Model.b(this.e[i])) {
                b = false;
            }
        }
        return b;
    }
    
    public final Model bodyModel() {
        if (this.e == null) {
            return null;
        }
        final Model[] array = new Model[this.e.length];
        for (int i = 0; i < this.e.length; ++i) {
            array[i] = Model.a(this.e[i]);
        }
        Model d;
        if (array.length == 1) {
            d = array[0];
        }
        else {
            d = new Model(array.length, array);
        }
        for (int n = 0; n < 6 && this.f[n] != 0; ++n) {
            d.a(this.f[n], this.g[n]);
        }
        return d;
    }
    
    public final boolean loaded() {
        boolean b = true;
        for (int i = 0; i < 5; ++i) {
            if (this.h[i] != -1 && !Model.b(this.h[i])) {
                b = false;
            }
        }
        return b;
    }
    
    public final Model headModel() {
        final Model[] array = new Model[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            if (this.h[i] != -1) {
                array[n++] = Model.a(this.h[i]);
            }
        }
        final Model d = new Model(n, array);
        for (int n2 = 0; n2 < 6 && this.f[n2] != 0; ++n2) {
            d.a(this.f[n2], this.g[n2]);
        }
        return d;
    }
    
    private IdentityKit() {
        this.h = new int[] { -1, -1, -1, -1, -1 };
        this.c = -1;
        this.f = new int[6];
        this.g = new int[6];
        this.d = false;
    }
}

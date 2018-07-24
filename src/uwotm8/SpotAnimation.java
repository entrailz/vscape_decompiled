package uwotm8;

public final class SpotAnimation
{
    public static SpotAnimation[] a;
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
    public static Cache h;
    
    static {
    	uwotm8.SpotAnimation.h = new Cache(30);
    }
    
    public static void init(final Archive g) {
        final Buffer i;
        final int g2 = (i = new Buffer(g.getEntry("spotanim.dat"))).g();
        if (uwotm8.SpotAnimation.a == null) {
        	uwotm8.SpotAnimation.a = new SpotAnimation[g2];
        }
        for (int j = 0; j < g2; ++j) {
            if (uwotm8.SpotAnimation.a[j] == null) {
            	uwotm8.SpotAnimation.a[j] = new SpotAnimation();
            }
            uwotm8.SpotAnimation.a[j].i = j;
            final SpotAnimation g3 = uwotm8.SpotAnimation.a[j];
            final Buffer k = i;
            final SpotAnimation g4 = g3;
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
    
    public final Model getModel() {
        final Model d;
        if ((d = (Model)uwotm8.SpotAnimation.h.get(this.i)) != null) {
            return d;
        }
        final Model a;
        if ((a = Model.a(this.j)) == null) {
            return null;
        }
        for (int i = 0; i < 6; ++i) {
            if (this.l[0] != 0) {
                a.a(this.l[i], this.m[i]);
            }
        }
        uwotm8.SpotAnimation.h.put(a, this.i);
        return a;
    }
    
    private SpotAnimation() {
        this.k = -1;
        this.l = new int[6];
        this.m = new int[6];
        this.c = 128;
        this.d = 128;
    }
}

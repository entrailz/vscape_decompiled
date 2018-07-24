package uwotm8;

public final class Projectile extends Renderable
{
    public final int a;
    public final int b;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private boolean o;
    private final int p;
    private final int q;
    private final int r;
    public final int c;
    public double d;
    public double e;
    public double f;
    private final int s;
    private final int t;
    public final int g;
    private final SpotAnimation u;
    private int v;
    private int w;
    public int h;
    private int x;
    public final int i;
    
    public final void trackTarget(final int n, final int n2, final int n3, final int n4) {
        if (!this.o) {
            final double n5 = n4 - this.p;
            final double n6 = n2 - this.q;
            final double n7 = n5;
            final double n8 = n7 * n7;
            final double n9 = n6;
            final double sqrt = Math.sqrt(n8 + n9 * n9);
            this.d = this.p + n5 * this.t / sqrt;
            this.e = this.q + n6 * this.t / sqrt;
            this.f = this.r;
        }
        final double n10 = this.b + 1 - n;
        this.j = (n4 - this.d) / n10;
        this.k = (n2 - this.e) / n10;
        this.l = Math.sqrt(this.j * this.j + this.k * this.k);
        if (!this.o) {
            this.m = -this.l * Math.tan(this.s * 0.02454369);
        }
        final double n11 = 2.0 * (n3 - this.f - this.m * n10);
        final double n12 = n10;
        this.n = n11 / (n12 * n12);
    }
    
    public final Model getRotatedModel() {
        final Model a;
        if ((a = this.u.getModel()) == null) {
            return null;
        }
        int n = -1;
        if (this.u.b != null) {
            n = this.u.b.c[this.v];
        }
        final Model d = new Model(true, uwotm8.Frame.isValid(n), false, a);
        if (n != -1) {
            d.d();
            d.c(n);
            d.v = null;
            d.u = null;
        }
        if (this.u.c != 128 || this.u.d != 128) {
            d.b(this.u.c, this.u.c, this.u.d);
        }
        final Model d2 = d;
        final int x = this.x;
        final Model d3 = d2;
        final int n2 = Model.D[x];
        final int n3 = Model.E[x];
        for (int i = 0; i < d3.b; ++i) {
            final int n4 = d3.d[i] * n3 - d3.e[i] * n2 >> 16;
            d3.e[i] = d3.d[i] * n2 + d3.e[i] * n3 >> 16;
            d3.d[i] = n4;
        }
        d.a(64 + this.u.f, 850 + this.u.g, -30, -50, -30, true);
        return d;
    }
    
    public Projectile(final int s, final int c, final int a, final int b, final int t, final int i, final int r, final int q, final int p11, final int g, final int n) {
        this.o = false;
        this.u = uwotm8.SpotAnimation.a[n];
        this.i = i;
        this.p = p11;
        this.q = q;
        this.r = r;
        this.a = a;
        this.b = b;
        this.s = s;
        this.t = t;
        this.g = g;
        this.c = c;
        this.o = false;
    }
    
    public final void move(final int n) {
        this.o = true;
        this.d += this.j * n;
        this.e += this.k * n;
        this.f += this.m * n + 0.5 * this.n * n * n;
        this.m += this.n * n;
        this.h = ((int)(Math.atan2(this.j, this.k) * 325.949) + 1024 & 0x7FF);
        this.x = ((int)(Math.atan2(this.m, this.l) * 325.949) & 0x7FF);
        if (this.u.b != null) {
            this.w += n;
            while (this.w > this.u.b.duration(this.v)) {
                this.w -= this.u.b.duration(this.v) + 1;
                ++this.v;
                if (this.v >= this.u.b.b) {
                    this.v = 0;
                }
            }
        }
    }
}

package uwotm8;

public final class t extends A
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    private final g g;
    private int h;
    private int i;
    
    public t(final int a, final int n, final int n2, final int n3, final int d, final int c, final int b) {
        this.f = false;
        this.g = uwotm8.g.a[n3];
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = n + n2;
        this.f = false;
    }
    
    public final D_1 a() {
        final D_1 a;
        if ((a = this.g.a()) == null) {
            return null;
        }
        final int n = this.g.b.c[this.h];
        final D_1 d = new D_1(true, uwotm8.e.b(n), false, a);
        if (!this.f) {
            d.d();
            d.c(n);
            d.v = null;
            d.u = null;
        }
        if (this.g.c != 128 || this.g.d != 128) {
            d.b(this.g.c, this.g.c, this.g.d);
        }
        if (this.g.e != 0) {
            if (this.g.e == 90) {
                d.e();
            }
            if (this.g.e == 180) {
                d.e();
                d.e();
            }
            if (this.g.e == 270) {
                d.e();
                d.e();
                d.e();
            }
        }
        d.a(64 + this.g.f, 850 + this.g.g, -30, -50, -30, true);
        return d;
    }
    
    public final void a(final int n) {
        this.i += n;
        while (this.i > this.g.b.a(this.h)) {
            this.i -= this.g.b.a(this.h) + 1;
            ++this.h;
            if (this.h >= this.g.b.b && (this.h < 0 || this.h >= this.g.b.b)) {
                this.h = 0;
                this.f = true;
            }
        }
    }
}

package uwotm8;

public final class am
{
    private int d;
    private int[] e;
    private int[] f;
    int a;
    int b;
    int c;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    public final void a(final I_1 i) {
        this.c = i.e();
        this.a = i.j();
        this.b = i.j();
        this.b(i);
    }
    
    public final void b(final I_1 i) {
        this.d = i.e();
        this.e = new int[this.d];
        this.f = new int[this.d];
        for (int j = 0; j < this.d; ++j) {
            this.e[j] = i.g();
            this.f[j] = i.g();
        }
    }
    
    final void a() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }
    
    final int a(final int n) {
        if (this.k >= this.g) {
            this.j = this.f[this.h++] << 15;
            if (this.h >= this.d) {
                this.h = this.d - 1;
            }
            this.g = (int)(this.e[this.h] / 65536.0 * n);
            if (this.g > this.k) {
                this.i = ((this.f[this.h] << 15) - this.j) / (this.g - this.k);
            }
        }
        this.j += this.i;
        ++this.k;
        return this.j - this.i >> 15;
    }
}

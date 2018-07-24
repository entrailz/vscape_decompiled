package uwotm8;

public class u extends A
{
    private int ad = -1;
    public final int[] a;
    public final int[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final int[] m;
    public final int[] n;
    public final int[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final boolean[] Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    
    public final void a(final int n, final int n2, final boolean b) {
        if (this.y != -1 && uwotm8.Animation.a[this.y].m == 1) {
            this.y = -1;
        }
        if (!b) {
            final int n3 = n - this.a[0];
            final int n4 = n2 - this.b[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -8 && n4 <= 8) {
                if (this.x < 9) {
                    ++this.x;
                }
                for (int i = this.x; i > 0; --i) {
                    final int n5 = i;
                    final int[] a = this.a;
                    a[n5] = a[i - 1];
                    final int n6 = i;
                    final int[] b2 = this.b;
                    b2[n6] = b2[i - 1];
                    final int n7 = i;
                    final boolean[] y = this.Y;
                    y[n7] = y[i - 1];
                }
                this.a[0] = n;
                this.b[0] = n2;
                this.Y[0] = false;
                return;
            }
        }
        this.x = 0;
        this.N = 0;
        this.d = 0;
        this.a[0] = n;
        this.b[0] = n2;
        this.V = (this.a[0] << 7) + (this.L << 6);
        this.W = (this.b[0] << 7) + (this.L << 6);
    }
    
    public final void b() {
        this.x = 0;
        this.N = 0;
    }
    
    public final void a(final int n, final int n2, final int n3) {
        for (int i = 0; i < 4; ++i) {
            if (this.o[i] <= n3) {
                this.m[i] = n2;
                this.n[i] = n;
                this.o[i] = n3 + 70;
                return;
            }
        }
    }
    
    public final void a(final boolean b, int i) {
        int n = this.a[0];
        int n2 = this.b[0];
        if (i == 0) {
            --n;
            ++n2;
        }
        if (i == 1) {
            ++n2;
        }
        if (i == 2) {
            ++n;
            ++n2;
        }
        if (i == 3) {
            --n;
        }
        if (i == 4) {
            ++n;
        }
        if (i == 5) {
            --n;
            --n2;
        }
        if (i == 6) {
            --n2;
        }
        if (i == 7) {
            ++n;
            --n2;
        }
        if (this.y != -1 && uwotm8.Animation.a[this.y].m == 1) {
            this.y = -1;
        }
        if (this.x < 9) {
            ++this.x;
        }
        int n3;
        int[] a;
        int n4;
        int[] b2;
        int n5;
        boolean[] y;
        for (i = this.x; i > 0; --i) {
            n3 = i;
            a = this.a;
            a[n3] = a[i - 1];
            n4 = i;
            b2 = this.b;
            b2[n4] = b2[i - 1];
            n5 = i;
            y = this.Y;
            y[n5] = y[i - 1];
        }
        this.a[0] = n;
        this.b[0] = n2;
        this.Y[0] = b;
    }
    
    public boolean c() {
        return false;
    }
    
    u() {
        this.a = new int[10];
        this.b = new int[10];
        this.c = -1;
        this.e = 32;
        this.f = -1;
        this.h = 200;
        this.j = -1;
        this.k = -1;
        this.m = new int[4];
        this.n = new int[4];
        this.o = new int[4];
        this.p = -1;
        this.s = -1;
        this.y = -1;
        this.E = -1000;
        this.H = 100;
        this.L = 1;
        this.M = false;
        this.Y = new boolean[10];
        this.Z = -1;
        this.aa = -1;
        this.ab = -1;
        this.ac = -1;
    }
}

package uwotm8;

public final class an
{
    final int[] a;
    private final int[][][] d;
    private final int[][][] e;
    private final int[] f;
    private static final float[][] g;
    static final int[][] b;
    private static float h;
    static int c;
    
    static {
        g = new float[2][8];
        b = new int[2][8];
    }
    
    private float a(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.e[n][0][n2] + n3 * (this.e[n][1][n2] - this.e[n][0][n2])) * 0.001525879f) / 20.0f);
    }
    
    private float a(float n, final int n2, final int n3) {
        n = (n = (n = this.d[n3][0][n2] + n * (this.d[n3][1][n2] - this.d[n3][0][n2])) * 1.220703E-4f);
        return (n = 32.7032f * (float)Math.pow(2.0, n)) * 3.141593f / 11025.0f;
    }
    
    public final int a(final int n, final float n2) {
        if (n == 0) {
            an.c = (int)((an.h = (float)Math.pow(0.1, (this.f[0] + (this.f[1] - this.f[0]) * n2) * 0.003051758f / 20.0f)) * 65536.0f);
        }
        if (this.a[n] == 0) {
            return 0;
        }
        final float a = this.a(n, 0, n2);
        an.g[n][0] = -2.0f * a * (float)Math.cos(this.a(n2, 0, n));
        final float[] array = an.g[n];
        final int n3 = 1;
        final float n4 = a;
        array[n3] = n4 * n4;
        for (int i = 1; i < this.a[n]; ++i) {
            final float a2 = this.a(n, i, n2);
            final float n5 = -2.0f * a2 * (float)Math.cos(this.a(n2, i, n));
            final float n6 = a2;
            final float n7 = n6 * n6;
            an.g[n][(i << 1) + 1] = an.g[n][(i << 1) - 1] * n7;
            an.g[n][i << 1] = an.g[n][(i << 1) - 1] * n5 + an.g[n][(i << 1) - 2] * n7;
            for (int j = (i << 1) - 1; j >= 2; --j) {
                final float[] array2 = an.g[n];
                final int n8 = j;
                array2[n8] += an.g[n][j - 1] * n5 + an.g[n][j - 2] * n7;
            }
            final float[] array3 = an.g[n];
            final int n9 = 1;
            array3[n9] += an.g[n][0] * n5 + n7;
            final float[] array4 = an.g[n];
            final int n10 = 0;
            array4[n10] += n5;
        }
        if (n == 0) {
            for (int k = 0; k < this.a[0] << 1; ++k) {
                final float[] array5 = an.g[0];
                final int n11 = k;
                array5[n11] *= an.h;
            }
        }
        for (int l = 0; l < this.a[n] << 1; ++l) {
            an.b[n][l] = (int)(an.g[n][l] * 65536.0f);
        }
        return this.a[n] << 1;
    }
    
    public final void a(final I_1 i, final am am) {
        final int e = i.e();
        this.a[0] = e >> 4;
        this.a[1] = (e & 0xF);
        if (e != 0) {
            this.f[0] = i.g();
            this.f[1] = i.g();
            final int e2 = i.e();
            for (int j = 0; j < 2; ++j) {
                for (int k = 0; k < this.a[j]; ++k) {
                    this.d[j][0][k] = i.g();
                    this.e[j][0][k] = i.g();
                }
            }
            for (int l = 0; l < 2; ++l) {
                for (int n = 0; n < this.a[l]; ++n) {
                    if ((e2 & 1 << (l << 2) << n) != 0x0) {
                        this.d[l][1][n] = i.g();
                        this.e[l][1][n] = i.g();
                    }
                    else {
                        this.d[l][1][n] = this.d[l][0][n];
                        this.e[l][1][n] = this.e[l][0][n];
                    }
                }
            }
            if (e2 != 0 || this.f[1] != this.f[0]) {
                am.b(i);
            }
        }
        else {
            this.f[0] = (this.f[1] = 0);
        }
    }
    
    public an() {
        this.a = new int[2];
        this.d = new int[2][2][4];
        this.e = new int[2][2][4];
        this.f = new int[2];
    }
}

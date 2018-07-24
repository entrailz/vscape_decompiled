package uwotm8;

public class Rasterizer2D extends CacheableNode
{
    public static int[] f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    
    public static void a(final int h, final int g, final int[] f) {
        Rasterizer2D.f = f;
        Rasterizer2D.g = g;
        b(Rasterizer2D.h = h, 0, g, 0);
    }
    
    public static void a(int i, int j, int k, final int n, int n2) {
        if (k < Rasterizer2D.k) {
            n2 = 16 - (Rasterizer2D.k - k);
            k = Rasterizer2D.k;
        }
        if (j < Rasterizer2D.i) {
            i -= Rasterizer2D.i - j;
            j = Rasterizer2D.i;
        }
        if (k + n2 > Rasterizer2D.l) {
            n2 = Rasterizer2D.l - k;
        }
        if (j + i > Rasterizer2D.j) {
            i = Rasterizer2D.j - j;
        }
        final int n3 = Rasterizer2D.g - n2;
        j = k + j * Rasterizer2D.g;
        for (i = -i; i < 0; ++i) {
            for (k = -n2; k < 0; ++k) {
                Rasterizer2D.f[j++] = n;
            }
            j += n3;
        }
    }
    
    public static void a(int k, int i, int n, final int n2) {
        if (i >= Rasterizer2D.i && i < Rasterizer2D.j) {
            if (k < Rasterizer2D.k) {
                n -= Rasterizer2D.k - k;
                k = Rasterizer2D.k;
            }
            if (k + n > Rasterizer2D.l) {
                n = Rasterizer2D.l - k;
            }
            k += i * Rasterizer2D.g;
            for (i = 0; i < n; ++i) {
                Rasterizer2D.f[k + i] = n2;
            }
        }
    }
    
    public static void e() {
        Rasterizer2D.k = 0;
        Rasterizer2D.i = 0;
        Rasterizer2D.l = Rasterizer2D.g;
        Rasterizer2D.j = Rasterizer2D.h;
        Rasterizer2D.m = Rasterizer2D.l;
        Rasterizer2D.n = Rasterizer2D.l / 2;
    }
    
    public static void b(int h, int k, int g, int i) {
        if (k < 0) {
            k = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if (g > Rasterizer2D.g) {
            g = Rasterizer2D.g;
        }
        if (h > Rasterizer2D.h) {
            h = Rasterizer2D.h;
        }
        Rasterizer2D.k = k;
        Rasterizer2D.i = i;
        Rasterizer2D.l = g;
        Rasterizer2D.j = h;
        Rasterizer2D.m = Rasterizer2D.l;
        Rasterizer2D.n = Rasterizer2D.l / 2;
        Rasterizer2D.o = Rasterizer2D.j / 2;
    }
    
    public static void f() {
        for (int n = Rasterizer2D.g * Rasterizer2D.h, i = 0; i < n; ++i) {
            Rasterizer2D.f[i] = 0;
        }
    }
    
    public static void a(int n, int i, int n2, int n3, int n4, int j) {
        if (j < Rasterizer2D.k) {
            n2 -= Rasterizer2D.k - j;
            j = Rasterizer2D.k;
        }
        if (i < Rasterizer2D.i) {
            n3 -= Rasterizer2D.i - i;
            i = Rasterizer2D.i;
        }
        if (j + n2 > Rasterizer2D.l) {
            n2 = Rasterizer2D.l - j;
        }
        if (i + n3 > Rasterizer2D.j) {
            n3 = Rasterizer2D.j - i;
        }
        final int n5 = 256 - n4;
        final int n6 = (n >> 16 & 0xFF) * n4;
        final int n7 = (n >> 8 & 0xFF) * n4;
        n = (n & 0xFF) * n4;
        n4 = Rasterizer2D.g - n2;
        i = j + i * Rasterizer2D.g;
        int k;
        for (j = 0; j < n3; ++j) {
            for (k = -n2; k < 0; ++k) {
                Rasterizer2D.f[i++] = (n6 + (Rasterizer2D.f[i] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.f[i] >> 8 & 0xFF) * n5 >> 8 << 8) + (n + (Rasterizer2D.f[i] & 0xFF) * n5 >> 8);
            }
            i += n4;
        }
    }
    
    public static void b(int i, int j, int k, final int n, int n2) {
        if (k < Rasterizer2D.k) {
            n2 -= Rasterizer2D.k - k;
            k = Rasterizer2D.k;
        }
        if (j < Rasterizer2D.i) {
            i -= Rasterizer2D.i - j;
            j = Rasterizer2D.i;
        }
        if (k + n2 > Rasterizer2D.l) {
            n2 = Rasterizer2D.l - k;
        }
        if (j + i > Rasterizer2D.j) {
            i = Rasterizer2D.j - j;
        }
        final int n3 = Rasterizer2D.g - n2;
        j = k + j * Rasterizer2D.g;
        for (i = -i; i < 0; ++i) {
            for (k = -n2; k < 0; ++k) {
                Rasterizer2D.f[j++] = n;
            }
            j += n3;
        }
    }
    
    public static void c(final int n, final int n2, final int n3, final int n4, final int n5) {
        c(n5, n4, n2, n);
        c(n5 + n3 - 1, n4, n2, n);
        d(n5, n4, n3, n);
        d(n5, n4, n3, n + n2 - 1);
    }
    
    public static void b(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        d(n4, n5, n, n3, n6);
        d(n4, n5, n + n2 - 1, n3, n6);
        if (n2 >= 3) {
            e(n4, n6, n3, n + 1, n2 - 2);
            e(n4, n6 + n5 - 1, n3, n + 1, n2 - 2);
        }
    }
    
    public static void c(int n, final int n2, int n3, int i) {
        if (n < Rasterizer2D.i || n >= Rasterizer2D.j) {
            return;
        }
        if (i < Rasterizer2D.k) {
            n3 -= Rasterizer2D.k - i;
            i = Rasterizer2D.k;
        }
        if (i + n3 > Rasterizer2D.l) {
            n3 = Rasterizer2D.l - i;
        }
        n = i + n * Rasterizer2D.g;
        for (i = 0; i < n3; ++i) {
            Rasterizer2D.f[n + i] = n2;
        }
    }
    
    private static void d(int n, int n2, int n3, int i, int k) {
        if (n3 < Rasterizer2D.i || n3 >= Rasterizer2D.j) {
            return;
        }
        if (k < Rasterizer2D.k) {
            n2 -= Rasterizer2D.k - k;
            k = Rasterizer2D.k;
        }
        if (k + n2 > Rasterizer2D.l) {
            n2 = Rasterizer2D.l - k;
        }
        final int n4 = 256 - i;
        final int n5 = (n >> 16 & 0xFF) * i;
        final int n6 = (n >> 8 & 0xFF) * i;
        n = (n & 0xFF) * i;
        n3 = k + n3 * Rasterizer2D.g;
        for (i = 0; i < n2; ++i) {
            k = (Rasterizer2D.f[n3] >> 16 & 0xFF) * n4;
            k = (n5 + k >> 8 << 16) + (n6 + (Rasterizer2D.f[n3] >> 8 & 0xFF) * n4 >> 8 << 8) + (n + (Rasterizer2D.f[n3] & 0xFF) * n4 >> 8);
            Rasterizer2D.f[n3++] = k;
        }
    }
    
    public static void d(int i, final int n, int n2, int j) {
        if (j < Rasterizer2D.k || j >= Rasterizer2D.l) {
            return;
        }
        if (i < Rasterizer2D.i) {
            n2 -= Rasterizer2D.i - i;
            i = Rasterizer2D.i;
        }
        if (i + n2 > Rasterizer2D.j) {
            n2 = Rasterizer2D.j - i;
        }
        i = j + i * Rasterizer2D.g;
        for (j = 0; j < n2; ++j) {
            Rasterizer2D.f[i + j * Rasterizer2D.g] = n;
        }
    }
    
    private static void e(int n, int n2, int i, int j, int n3) {
        if (n2 < Rasterizer2D.k || n2 >= Rasterizer2D.l) {
            return;
        }
        if (j < Rasterizer2D.i) {
            n3 -= Rasterizer2D.i - j;
            j = Rasterizer2D.i;
        }
        if (j + n3 > Rasterizer2D.j) {
            n3 = Rasterizer2D.j - j;
        }
        final int n4 = 256 - i;
        final int n5 = (n >> 16 & 0xFF) * i;
        final int n6 = (n >> 8 & 0xFF) * i;
        n = (n & 0xFF) * i;
        n2 += j * Rasterizer2D.g;
        for (i = 0; i < n3; ++i) {
            j = (Rasterizer2D.f[n2] >> 16 & 0xFF) * n4;
            j = (n5 + j >> 8 << 16) + (n6 + (Rasterizer2D.f[n2] >> 8 & 0xFF) * n4 >> 8 << 8) + (n + (Rasterizer2D.f[n2] & 0xFF) * n4 >> 8);
            Rasterizer2D.f[n2] = j;
            n2 += Rasterizer2D.g;
        }
    }
}

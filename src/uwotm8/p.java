package uwotm8;

public class p extends N_1
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
        p.f = f;
        p.g = g;
        b(p.h = h, 0, g, 0);
    }
    
    public static void a(int i, int j, int k, final int n, int n2) {
        if (k < p.k) {
            n2 = 16 - (p.k - k);
            k = p.k;
        }
        if (j < p.i) {
            i -= p.i - j;
            j = p.i;
        }
        if (k + n2 > p.l) {
            n2 = p.l - k;
        }
        if (j + i > p.j) {
            i = p.j - j;
        }
        final int n3 = p.g - n2;
        j = k + j * p.g;
        for (i = -i; i < 0; ++i) {
            for (k = -n2; k < 0; ++k) {
                p.f[j++] = n;
            }
            j += n3;
        }
    }
    
    public static void a(int k, int i, int n, final int n2) {
        if (i >= p.i && i < p.j) {
            if (k < p.k) {
                n -= p.k - k;
                k = p.k;
            }
            if (k + n > p.l) {
                n = p.l - k;
            }
            k += i * p.g;
            for (i = 0; i < n; ++i) {
                p.f[k + i] = n2;
            }
        }
    }
    
    public static void e() {
        p.k = 0;
        p.i = 0;
        p.l = p.g;
        p.j = p.h;
        p.m = p.l;
        p.n = p.l / 2;
    }
    
    public static void b(int h, int k, int g, int i) {
        if (k < 0) {
            k = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if (g > p.g) {
            g = p.g;
        }
        if (h > p.h) {
            h = p.h;
        }
        p.k = k;
        p.i = i;
        p.l = g;
        p.j = h;
        p.m = p.l;
        p.n = p.l / 2;
        p.o = p.j / 2;
    }
    
    public static void f() {
        for (int n = p.g * p.h, i = 0; i < n; ++i) {
            p.f[i] = 0;
        }
    }
    
    public static void a(int n, int i, int n2, int n3, int n4, int j) {
        if (j < p.k) {
            n2 -= p.k - j;
            j = p.k;
        }
        if (i < p.i) {
            n3 -= p.i - i;
            i = p.i;
        }
        if (j + n2 > p.l) {
            n2 = p.l - j;
        }
        if (i + n3 > p.j) {
            n3 = p.j - i;
        }
        final int n5 = 256 - n4;
        final int n6 = (n >> 16 & 0xFF) * n4;
        final int n7 = (n >> 8 & 0xFF) * n4;
        n = (n & 0xFF) * n4;
        n4 = p.g - n2;
        i = j + i * p.g;
        int k;
        for (j = 0; j < n3; ++j) {
            for (k = -n2; k < 0; ++k) {
                p.f[i++] = (n6 + (p.f[i] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (p.f[i] >> 8 & 0xFF) * n5 >> 8 << 8) + (n + (p.f[i] & 0xFF) * n5 >> 8);
            }
            i += n4;
        }
    }
    
    public static void b(int i, int j, int k, final int n, int n2) {
        if (k < p.k) {
            n2 -= p.k - k;
            k = p.k;
        }
        if (j < p.i) {
            i -= p.i - j;
            j = p.i;
        }
        if (k + n2 > p.l) {
            n2 = p.l - k;
        }
        if (j + i > p.j) {
            i = p.j - j;
        }
        final int n3 = p.g - n2;
        j = k + j * p.g;
        for (i = -i; i < 0; ++i) {
            for (k = -n2; k < 0; ++k) {
                p.f[j++] = n;
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
        if (n < p.i || n >= p.j) {
            return;
        }
        if (i < p.k) {
            n3 -= p.k - i;
            i = p.k;
        }
        if (i + n3 > p.l) {
            n3 = p.l - i;
        }
        n = i + n * p.g;
        for (i = 0; i < n3; ++i) {
            p.f[n + i] = n2;
        }
    }
    
    private static void d(int n, int n2, int n3, int i, int k) {
        if (n3 < p.i || n3 >= p.j) {
            return;
        }
        if (k < p.k) {
            n2 -= p.k - k;
            k = p.k;
        }
        if (k + n2 > p.l) {
            n2 = p.l - k;
        }
        final int n4 = 256 - i;
        final int n5 = (n >> 16 & 0xFF) * i;
        final int n6 = (n >> 8 & 0xFF) * i;
        n = (n & 0xFF) * i;
        n3 = k + n3 * p.g;
        for (i = 0; i < n2; ++i) {
            k = (p.f[n3] >> 16 & 0xFF) * n4;
            k = (n5 + k >> 8 << 16) + (n6 + (p.f[n3] >> 8 & 0xFF) * n4 >> 8 << 8) + (n + (p.f[n3] & 0xFF) * n4 >> 8);
            p.f[n3++] = k;
        }
    }
    
    public static void d(int i, final int n, int n2, int j) {
        if (j < p.k || j >= p.l) {
            return;
        }
        if (i < p.i) {
            n2 -= p.i - i;
            i = p.i;
        }
        if (i + n2 > p.j) {
            n2 = p.j - i;
        }
        i = j + i * p.g;
        for (j = 0; j < n2; ++j) {
            p.f[i + j * p.g] = n;
        }
    }
    
    private static void e(int n, int n2, int i, int j, int n3) {
        if (n2 < p.k || n2 >= p.l) {
            return;
        }
        if (j < p.i) {
            n3 -= p.i - j;
            j = p.i;
        }
        if (j + n3 > p.j) {
            n3 = p.j - j;
        }
        final int n4 = 256 - i;
        final int n5 = (n >> 16 & 0xFF) * i;
        final int n6 = (n >> 8 & 0xFF) * i;
        n = (n & 0xFF) * i;
        n2 += j * p.g;
        for (i = 0; i < n3; ++i) {
            j = (p.f[n2] >> 16 & 0xFF) * n4;
            j = (n5 + j >> 8 << 16) + (n6 + (p.f[n2] >> 8 & 0xFF) * n4 >> 8 << 8) + (n + (p.f[n2] & 0xFF) * n4 >> 8);
            p.f[n2] = j;
            n2 += p.g;
        }
    }
}

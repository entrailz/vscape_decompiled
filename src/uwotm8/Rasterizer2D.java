package uwotm8;

public class Rasterizer2D extends CacheableNode
{
    public static int[] pixels;
    public static int width;
    public static int height;
    public static int clipBottom;
    public static int clipTop;
    public static int clipLeft;
    public static int clipRight;
    public static int m;
    public static int centreX;
    public static int o;
    
    public static void init(final int h, final int g, final int[] f) {
        Rasterizer2D.pixels = f;
        Rasterizer2D.width = g;
        setBounds(Rasterizer2D.height = h, 0, g, 0);
    }
    
    public static void fillRectangle(int i, int j, int k, final int n, int n2) {
        if (k < Rasterizer2D.clipLeft) {
            n2 = 16 - (Rasterizer2D.clipLeft - k);
            k = Rasterizer2D.clipLeft;
        }
        if (j < Rasterizer2D.clipBottom) {
            i -= Rasterizer2D.clipBottom - j;
            j = Rasterizer2D.clipBottom;
        }
        if (k + n2 > Rasterizer2D.clipRight) {
            n2 = Rasterizer2D.clipRight - k;
        }
        if (j + i > Rasterizer2D.clipTop) {
            i = Rasterizer2D.clipTop - j;
        }
        final int n3 = Rasterizer2D.width - n2;
        j = k + j * Rasterizer2D.width;
        for (i = -i; i < 0; ++i) {
            for (k = -n2; k < 0; ++k) {
                Rasterizer2D.pixels[j++] = n;
            }
            j += n3;
        }
    }
    
    public static void drawHorizontal_(int k, int i, int n, final int n2) {
        if (i >= Rasterizer2D.clipBottom && i < Rasterizer2D.clipTop) {
            if (k < Rasterizer2D.clipLeft) {
                n -= Rasterizer2D.clipLeft - k;
                k = Rasterizer2D.clipLeft;
            }
            if (k + n > Rasterizer2D.clipRight) {
                n = Rasterizer2D.clipRight - k;
            }
            k += i * Rasterizer2D.width;
            for (i = 0; i < n; ++i) {
                Rasterizer2D.pixels[k + i] = n2;
            }
        }
    }
    
    public static void setDefaultBounds() {
        Rasterizer2D.clipLeft = 0;
        Rasterizer2D.clipBottom = 0;
        Rasterizer2D.clipRight = Rasterizer2D.width;
        Rasterizer2D.clipTop = Rasterizer2D.height;
        Rasterizer2D.m = Rasterizer2D.clipRight;
        Rasterizer2D.centreX = Rasterizer2D.clipRight / 2;
    }
    
    public static void setBounds(int h, int k, int g, int i) {
        if (k < 0) {
            k = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if (g > Rasterizer2D.width) {
            g = Rasterizer2D.width;
        }
        if (h > Rasterizer2D.height) {
            h = Rasterizer2D.height;
        }
        Rasterizer2D.clipLeft = k;
        Rasterizer2D.clipBottom = i;
        Rasterizer2D.clipRight = g;
        Rasterizer2D.clipTop = h;
        Rasterizer2D.m = Rasterizer2D.clipRight;
        Rasterizer2D.centreX = Rasterizer2D.clipRight / 2;
        Rasterizer2D.o = Rasterizer2D.clipTop / 2;
    }
    
    public static void reset() {
        for (int n = Rasterizer2D.width * Rasterizer2D.height, i = 0; i < n; ++i) {
            Rasterizer2D.pixels[i] = 0;
        }
    }
    
    public static void fillRectangle(int n, int i, int n2, int n3, int n4, int j) {
        if (j < Rasterizer2D.clipLeft) {
            n2 -= Rasterizer2D.clipLeft - j;
            j = Rasterizer2D.clipLeft;
        }
        if (i < Rasterizer2D.clipBottom) {
            n3 -= Rasterizer2D.clipBottom - i;
            i = Rasterizer2D.clipBottom;
        }
        if (j + n2 > Rasterizer2D.clipRight) {
            n2 = Rasterizer2D.clipRight - j;
        }
        if (i + n3 > Rasterizer2D.clipTop) {
            n3 = Rasterizer2D.clipTop - i;
        }
        final int n5 = 256 - n4;
        final int n6 = (n >> 16 & 0xFF) * n4;
        final int n7 = (n >> 8 & 0xFF) * n4;
        n = (n & 0xFF) * n4;
        n4 = Rasterizer2D.width - n2;
        i = j + i * Rasterizer2D.width;
        int k;
        for (j = 0; j < n3; ++j) {
            for (k = -n2; k < 0; ++k) {
                Rasterizer2D.pixels[i++] = (n6 + (Rasterizer2D.pixels[i] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.pixels[i] >> 8 & 0xFF) * n5 >> 8 << 8) + (n + (Rasterizer2D.pixels[i] & 0xFF) * n5 >> 8);
            }
            i += n4;
        }
    }
    
//    public static void fillRectangle(int i, int j, int k, final int n, int n2) {
//        if (k < Rasterizer2D.clipLeft) {
//            n2 -= Rasterizer2D.clipLeft - k;
//            k = Rasterizer2D.clipLeft;
//        }
//        if (j < Rasterizer2D.clipBottom) {
//            i -= Rasterizer2D.clipBottom - j;
//            j = Rasterizer2D.clipBottom;
//        }
//        if (k + n2 > Rasterizer2D.clipRight) {
//            n2 = Rasterizer2D.clipRight - k;
//        }
//        if (j + i > Rasterizer2D.clipTop) {
//            i = Rasterizer2D.clipTop - j;
//        }
//        final int n3 = Rasterizer2D.width - n2;
//        j = k + j * Rasterizer2D.width;
//        for (i = -i; i < 0; ++i) {
//            for (k = -n2; k < 0; ++k) {
//                Rasterizer2D.pixels[j++] = n;
//            }
//            j += n3;
//        }
//    }
    
    public static void drawRectangle(final int n, final int n2, final int n3, final int n4, final int n5) {
        drawHorizontal(n5, n4, n2, n);
        drawHorizontal(n5 + n3 - 1, n4, n2, n);
        drawVertical(n5, n4, n3, n);
        drawVertical(n5, n4, n3, n + n2 - 1);
    }
    
    public static void drawRectangle(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        drawHorizontal(n4, n5, n, n3, n6);
        drawHorizontal(n4, n5, n + n2 - 1, n3, n6);
        if (n2 >= 3) {
            drawVertical(n4, n6, n3, n + 1, n2 - 2);
            drawVertical(n4, n6 + n5 - 1, n3, n + 1, n2 - 2);
        }
    }
    
    public static void drawHorizontal(int n, final int n2, int n3, int i) {
        if (n < Rasterizer2D.clipBottom || n >= Rasterizer2D.clipTop) {
            return;
        }
        if (i < Rasterizer2D.clipLeft) {
            n3 -= Rasterizer2D.clipLeft - i;
            i = Rasterizer2D.clipLeft;
        }
        if (i + n3 > Rasterizer2D.clipRight) {
            n3 = Rasterizer2D.clipRight - i;
        }
        n = i + n * Rasterizer2D.width;
        for (i = 0; i < n3; ++i) {
            Rasterizer2D.pixels[n + i] = n2;
        }
    }
    
    private static void drawHorizontal(int n, int n2, int n3, int i, int k) {
        if (n3 < Rasterizer2D.clipBottom || n3 >= Rasterizer2D.clipTop) {
            return;
        }
        if (k < Rasterizer2D.clipLeft) {
            n2 -= Rasterizer2D.clipLeft - k;
            k = Rasterizer2D.clipLeft;
        }
        if (k + n2 > Rasterizer2D.clipRight) {
            n2 = Rasterizer2D.clipRight - k;
        }
        final int n4 = 256 - i;
        final int n5 = (n >> 16 & 0xFF) * i;
        final int n6 = (n >> 8 & 0xFF) * i;
        n = (n & 0xFF) * i;
        n3 = k + n3 * Rasterizer2D.width;
        for (i = 0; i < n2; ++i) {
            k = (Rasterizer2D.pixels[n3] >> 16 & 0xFF) * n4;
            k = (n5 + k >> 8 << 16) + (n6 + (Rasterizer2D.pixels[n3] >> 8 & 0xFF) * n4 >> 8 << 8) + (n + (Rasterizer2D.pixels[n3] & 0xFF) * n4 >> 8);
            Rasterizer2D.pixels[n3++] = k;
        }
    }
    
    public static void drawVertical(int i, final int n, int n2, int j) {
        if (j < Rasterizer2D.clipLeft || j >= Rasterizer2D.clipRight) {
            return;
        }
        if (i < Rasterizer2D.clipBottom) {
            n2 -= Rasterizer2D.clipBottom - i;
            i = Rasterizer2D.clipBottom;
        }
        if (i + n2 > Rasterizer2D.clipTop) {
            n2 = Rasterizer2D.clipTop - i;
        }
        i = j + i * Rasterizer2D.width;
        for (j = 0; j < n2; ++j) {
            Rasterizer2D.pixels[i + j * Rasterizer2D.width] = n;
        }
    }
    
    private static void drawVertical(int n, int n2, int i, int j, int n3) {
        if (n2 < Rasterizer2D.clipLeft || n2 >= Rasterizer2D.clipRight) {
            return;
        }
        if (j < Rasterizer2D.clipBottom) {
            n3 -= Rasterizer2D.clipBottom - j;
            j = Rasterizer2D.clipBottom;
        }
        if (j + n3 > Rasterizer2D.clipTop) {
            n3 = Rasterizer2D.clipTop - j;
        }
        final int n4 = 256 - i;
        final int n5 = (n >> 16 & 0xFF) * i;
        final int n6 = (n >> 8 & 0xFF) * i;
        n = (n & 0xFF) * i;
        n2 += j * Rasterizer2D.width;
        for (i = 0; i < n3; ++i) {
            j = (Rasterizer2D.pixels[n2] >> 16 & 0xFF) * n4;
            j = (n5 + j >> 8 << 16) + (n6 + (Rasterizer2D.pixels[n2] >> 8 & 0xFF) * n4 >> 8 << 8) + (n + (Rasterizer2D.pixels[n2] & 0xFF) * n4 >> 8);
            Rasterizer2D.pixels[n2] = j;
            n2 += Rasterizer2D.width;
        }
    }
}

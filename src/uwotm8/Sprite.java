package uwotm8;

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public final class Sprite extends Rasterizer2D implements Cloneable
{
    private String p;
    public int[] a;
    public int b;
    public int c;
    private int q;
    private int r;
    public int d;
    public int e;
    
    public Sprite(final int n, final int n2) {
        this.p = String.valueOf(SignLink.a()) + "sprites/";
        this.a = new int[n * n2];
        this.d = n;
        this.b = n;
        this.e = n2;
        this.c = n2;
        final boolean b = false;
        this.r = (b ? 1 : 0);
        this.q = (b ? 1 : 0);
    }
    
    public Sprite(final String s) {
        this.p = String.valueOf(SignLink.a()) + "sprites/";
        try {
            final Image image = Toolkit.getDefaultToolkit().getImage(String.valueOf(this.p) + s + ".png");
            final ImageIcon imageIcon = new ImageIcon(image);
            this.b = imageIcon.getIconWidth();
            this.c = imageIcon.getIconHeight();
            this.d = this.b;
            this.e = this.c;
            this.q = 0;
            this.r = 0;
            this.a = new int[this.b * this.c];
            new PixelGrabber(image, 0, 0, this.b, this.c, this.a, 0, this.b).grabPixels();
            this.d(255, 0, 255);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public final void a(int k, int i, int n) {
        n = n;
        k += this.q;
        i += this.r;
        int n2 = k + i * uwotm8.Rasterizer2D.g;
        int n3 = 0;
        int c = this.c;
        int b = this.b;
        int n4 = uwotm8.Rasterizer2D.g - b;
        int n5 = 0;
        if (i < uwotm8.Rasterizer2D.i) {
            final int n6 = uwotm8.Rasterizer2D.i - i;
            c -= n6;
            i = uwotm8.Rasterizer2D.i;
            n3 = 0 + n6 * b;
            n2 += n6 * uwotm8.Rasterizer2D.g;
        }
        if (i + c > uwotm8.Rasterizer2D.j) {
            c -= i + c - uwotm8.Rasterizer2D.j;
        }
        if (k < uwotm8.Rasterizer2D.k) {
            final int n7 = uwotm8.Rasterizer2D.k - k;
            b -= n7;
            k = uwotm8.Rasterizer2D.k;
            n3 += n7;
            n2 += n7;
            n5 = n7 + 0;
            n4 += n7;
        }
        if (k + b > uwotm8.Rasterizer2D.l) {
            final int n8 = k + b - uwotm8.Rasterizer2D.l;
            b -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (b > 0 && c > 0) {
            this.a(b, c, this.a, uwotm8.Rasterizer2D.f, n2, n, n3, n5, n4);
        }
    }
    
    private void a(final int n, int n2, final int[] array, final int[] array2, int n3, int n4, int n5, final int n6, final int n7) {
        final int n8 = n4;
        for (int i = -n2; i < 0; ++i) {
            for (int j = -n; j < 0; ++j) {
                n4 = (this.a[n5] >> 24 & n8 - 1);
                int n9;
                if ((n9 = 256 - n4) > 256) {
                    n4 = 0;
                }
                if (n8 == 0) {
                    n9 = 256;
                    n4 = 0;
                }
                if ((n2 = array[n5++]) != 0) {
                    final int n10 = array2[n3];
                    array2[n3++] = ((n2 & 0xFF00FF) * n4 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n2 & 0xFF00) * n4 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n7;
            n5 += n6;
        }
    }
    
    public final void a(int k, int i) {
        k += this.q;
        i += this.r;
        int n = k + i * uwotm8.Rasterizer2D.g;
        int n2 = 0;
        int c = this.c;
        int b = this.b;
        int n3 = uwotm8.Rasterizer2D.g - b;
        int n4 = 0;
        if (i < uwotm8.Rasterizer2D.i) {
            final int n5 = uwotm8.Rasterizer2D.i - i;
            c -= n5;
            i = uwotm8.Rasterizer2D.i;
            n2 = 0 + n5 * b;
            n += n5 * uwotm8.Rasterizer2D.g;
        }
        if (i + c > uwotm8.Rasterizer2D.j) {
            c -= i + c - uwotm8.Rasterizer2D.j;
        }
        if (k < uwotm8.Rasterizer2D.k) {
            final int n6 = uwotm8.Rasterizer2D.k - k;
            b -= n6;
            k = uwotm8.Rasterizer2D.k;
            n2 += n6;
            n += n6;
            n4 = n6 + 0;
            n3 += n6;
        }
        if (k + b > uwotm8.Rasterizer2D.l) {
            final int n7 = k + b - uwotm8.Rasterizer2D.l;
            b -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (b > 0 && c > 0) {
            final int n8 = b;
            final int n9 = c;
            final int[] f = uwotm8.Rasterizer2D.f;
            final int[] a = this.a;
            final int n10 = n;
            final int n11 = n2;
            final int n12 = n3;
            final int n13 = n4;
            final int n14 = n12;
            int n15 = n11;
            int n16 = n10;
            final int[] array = a;
            final int[] array2 = f;
            final int n17 = n9;
            i = n8;
            for (int j = -n17; j < 0; ++j) {
                for (int l = -i; l < 0; ++l) {
                    final int n18 = this.a[n15] >>> 24;
                    final int n19 = 256 - n18;
                    final int n20;
                    if ((n20 = array[n15++]) != 0 && n20 != 16777215) {
                        final int n21 = array2[n16];
                        array2[n16++] = ((n20 & 0xFF00FF) * n18 + (n21 & 0xFF00FF) * n19 & 0xFF00FF00) + ((n20 & 0xFF00) * n18 + (n21 & 0xFF00) * n19 & 0xFF0000) >> 8;
                    }
                    else {
                        ++n16;
                    }
                }
                n16 += n14;
                n15 += n13;
            }
        }
    }
    
    private void d(int i, final int n, final int n2) {
        for (i = 0; i < this.a.length; ++i) {
            if ((this.a[i] >> 16 & 0xFF) == 0xFF && (this.a[i] >> 8 & 0xFF) == 0x0 && (this.a[i] & 0xFF) == 0xFF) {
                this.a[i] = 0;
            }
        }
    }
    
    public Sprite(final Archive g, final String s, int i) {
        this.p = String.valueOf(SignLink.a()) + "sprites/";
        final Buffer j = new Buffer(g.b(String.valueOf(s) + ".dat"));
        final Buffer k;
        (k = new Buffer(g.b("index.dat"))).b = j.g();
        this.d = k.g();
        this.e = k.g();
        final int e;
        final int[] array = new int[e = k.e()];
        for (int l = 0; l < e - 1; ++l) {
            array[l + 1] = k.i();
            if (array[l + 1] == 0) {
                array[l + 1] = 1;
            }
        }
        for (int n = 0; n < i; ++n) {
            final Buffer m = k;
            m.b += 2;
            final Buffer i2 = j;
            i2.b += k.g() * k.g();
            final Buffer i3 = k;
            ++i3.b;
        }
        this.q = k.e();
        this.r = k.e();
        this.b = k.g();
        this.c = k.g();
        final int e2 = k.e();
        final int n2 = this.b * this.c;
        this.a = new int[n2];
        if (e2 == 0) {
            for (i = 0; i < n2; ++i) {
                this.a[i] = array[j.e()];
            }
            this.d(255, 0, 255);
            return;
        }
        if (e2 == 1) {
            int n3;
            for (i = 0; i < this.b; ++i) {
                for (n3 = 0; n3 < this.c; ++n3) {
                    this.a[i + n3 * this.b] = array[j.e()];
                }
            }
        }
        this.d(255, 0, 255);
    }
    
    public final void b(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.a.length; ++i) {
            final int n4;
            if ((n4 = this.a[i]) != 0) {
                int n5;
                if ((n5 = (n4 >> 16 & 0xFF) + n) <= 0) {
                    n5 = 1;
                }
                else if (n5 > 255) {
                    n5 = 255;
                }
                int n6;
                if ((n6 = (n4 >> 8 & 0xFF) + n2) <= 0) {
                    n6 = 1;
                }
                else if (n6 > 255) {
                    n6 = 255;
                }
                int n7;
                if ((n7 = (n4 & 0xFF) + n3) <= 0) {
                    n7 = 1;
                }
                else if (n7 > 255) {
                    n7 = 255;
                }
                this.a[i] = (n5 << 16) + (n6 << 8) + n7;
            }
        }
    }
    
    public final void a() {
        final int[] a = new int[this.d * this.e];
        for (int i = 0; i < this.c; ++i) {
            for (int j = 0; j < this.b; ++j) {
                a[(i + this.r) * this.d + (j + this.q)] = this.a[i * this.b + j];
            }
        }
        this.a = a;
        this.b = this.d;
        this.c = this.e;
        this.q = 0;
        this.r = 0;
    }
    
    public final void b(int k, int i) {
        k += this.q;
        i += this.r;
        int n = k + i * uwotm8.Rasterizer2D.g;
        int n2 = 0;
        int c = this.c;
        int b = this.b;
        int n3 = uwotm8.Rasterizer2D.g - b;
        int n4 = 0;
        if (i < uwotm8.Rasterizer2D.i) {
            final int n5 = uwotm8.Rasterizer2D.i - i;
            c -= n5;
            i = uwotm8.Rasterizer2D.i;
            n2 = 0 + n5 * b;
            n += n5 * uwotm8.Rasterizer2D.g;
        }
        if (i + c > uwotm8.Rasterizer2D.j) {
            c -= i + c - uwotm8.Rasterizer2D.j;
        }
        if (k < uwotm8.Rasterizer2D.k) {
            final int n6 = uwotm8.Rasterizer2D.k - k;
            b -= n6;
            k = uwotm8.Rasterizer2D.k;
            n2 += n6;
            n += n6;
            n4 = n6 + 0;
            n3 += n6;
        }
        if (k + b > uwotm8.Rasterizer2D.l) {
            final int n7 = k + b - uwotm8.Rasterizer2D.l;
            b -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (b > 0 && c > 0) {
            final int n8 = n;
            final int n9 = b;
            final int n10 = c;
            final int n11 = n4;
            final int n12 = n2;
            final int n13 = n3;
            final int[] a = this.a;
            final int[] f = uwotm8.Rasterizer2D.f;
            final int[] array = a;
            final int n14 = n13;
            int n15 = n12;
            final int n16 = n11;
            final int n17 = n10;
            i = n9;
            k = n8;
            final int n18 = -(i >> 2);
            i = -(i & 0x3);
            for (int j = -n17; j < 0; ++j) {
                for (int l = n18; l < 0; ++l) {
                    f[k++] = array[n15++];
                    f[k++] = array[n15++];
                    f[k++] = array[n15++];
                    f[k++] = array[n15++];
                }
                for (int n19 = i; n19 < 0; ++n19) {
                    f[k++] = array[n15++];
                }
                k += n14;
                n15 += n16;
            }
        }
    }
    
    public final void c(int k, int i) {
        k += this.q;
        i += this.r;
        int n = k + i * uwotm8.Rasterizer2D.g;
        int n2 = 0;
        int c = this.c;
        int b = this.b;
        int n3 = uwotm8.Rasterizer2D.g - b;
        int n4 = 0;
        if (i < uwotm8.Rasterizer2D.i) {
            final int n5 = uwotm8.Rasterizer2D.i - i;
            c -= n5;
            i = uwotm8.Rasterizer2D.i;
            n2 = 0 + n5 * b;
            n += n5 * uwotm8.Rasterizer2D.g;
        }
        if (i + c > uwotm8.Rasterizer2D.j) {
            c -= i + c - uwotm8.Rasterizer2D.j;
        }
        if (k < uwotm8.Rasterizer2D.k) {
            final int n6 = uwotm8.Rasterizer2D.k - k;
            b -= n6;
            k = uwotm8.Rasterizer2D.k;
            n2 += n6;
            n += n6;
            n4 = n6 + 0;
            n3 += n6;
        }
        if (k + b > uwotm8.Rasterizer2D.l) {
            final int n7 = k + b - uwotm8.Rasterizer2D.l;
            b -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (b > 0 && c > 0) {
            final int n8 = n2;
            final int n9 = b;
            final int[] f = uwotm8.Rasterizer2D.f;
            final int[] a = this.a;
            final int n10 = n4;
            final int n11 = c;
            final int n12 = n3;
            final int n13 = 128;
            int n14 = n;
            k = n13;
            final int n15 = n12;
            final int n16 = n11;
            final int n17 = n10;
            final int[] array = a;
            final int[] array2 = f;
            i = n9;
            k = n8;
            for (int j = -n16; j < 0; ++j) {
                for (int l = -i; l < 0; ++l) {
                    final int n18;
                    if ((n18 = array[k++]) != 0) {
                        final int n19 = array2[n14];
                        array2[n14++] = (((n18 & 0xFF00FF) << 7) + ((n19 & 0xFF00FF) << 7) & 0xFF00FF00) + (((n18 & 0xFF00) << 7) + ((n19 & 0xFF00) << 7) & 0xFF0000) >> 8;
                    }
                    else {
                        ++n14;
                    }
                }
                n14 += n15;
                k += n17;
            }
        }
    }
    
    public final void d(int k, int i) {
        k += this.q;
        i += this.r;
        int n = k + i * uwotm8.Rasterizer2D.g;
        int n2 = 0;
        int c = this.c;
        int b = this.b;
        int n3 = uwotm8.Rasterizer2D.g - b;
        int n4 = 0;
        if (i < uwotm8.Rasterizer2D.i) {
            final int n5 = uwotm8.Rasterizer2D.i - i;
            c -= n5;
            i = uwotm8.Rasterizer2D.i;
            n2 = 0 + n5 * b;
            n += n5 * uwotm8.Rasterizer2D.g;
        }
        if (i + c > uwotm8.Rasterizer2D.j) {
            c -= i + c - uwotm8.Rasterizer2D.j;
        }
        if (k < uwotm8.Rasterizer2D.k) {
            final int n6 = uwotm8.Rasterizer2D.k - k;
            b -= n6;
            k = uwotm8.Rasterizer2D.k;
            n2 += n6;
            n += n6;
            n4 = n6 + 0;
            n3 += n6;
        }
        if (k + b > uwotm8.Rasterizer2D.l) {
            final int n7 = k + b - uwotm8.Rasterizer2D.l;
            b -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (b > 0 && c > 0) {
            a(uwotm8.Rasterizer2D.f, this.a, n2, n, b, c, n3, n4);
        }
    }
    
    public final void c(int k, int i, int n) {
        final int n2 = this.b + 2;
        final int n3 = this.c + 2;
        final int[] array = new int[n2 * n3];
        for (int j = 0; j < this.b; ++j) {
            for (int l = 0; l < this.c; ++l) {
                if (this.a[j + l * this.b] != 0) {
                    array[j + 1 + (l + 1) * n2] = this.a[j + l * this.b];
                }
            }
        }
        for (int n4 = 0; n4 < n2; ++n4) {
            for (int n5 = 0; n5 < n3; ++n5) {
                if (array[n4 + n5 * n2] == 0) {
                    if (n4 < n2 - 1 && array[n4 + 1 + n5 * n2] > 0 && array[n4 + 1 + n5 * n2] != 16777215) {
                        array[n4 + n5 * n2] = n;
                    }
                    if (n4 > 0 && array[n4 - 1 + n5 * n2] > 0 && array[n4 - 1 + n5 * n2] != 16777215) {
                        array[n4 + n5 * n2] = n;
                    }
                    if (n5 < n3 - 1 && array[n4 + (n5 + 1) * n2] > 0 && array[n4 + (n5 + 1) * n2] != 16777215) {
                        array[n4 + n5 * n2] = n;
                    }
                    if (n5 > 0 && array[n4 + (n5 - 1) * n2] > 0 && array[n4 + (n5 - 1) * n2] != 16777215) {
                        array[n4 + n5 * n2] = n;
                    }
                }
            }
        }
        --k;
        --i;
        k += this.q;
        i += this.r;
        int n6 = k + i * uwotm8.Rasterizer2D.g;
        int n7 = 0;
        n = n3;
        int n8 = n2;
        int n9 = uwotm8.Rasterizer2D.g - n8;
        int n10 = 0;
        if (i < uwotm8.Rasterizer2D.i) {
            final int n11 = uwotm8.Rasterizer2D.i - i;
            n -= n11;
            i = uwotm8.Rasterizer2D.i;
            n7 = 0 + n11 * n8;
            n6 += n11 * uwotm8.Rasterizer2D.g;
        }
        if (i + n > uwotm8.Rasterizer2D.j) {
            n -= i + n - uwotm8.Rasterizer2D.j;
        }
        if (k < uwotm8.Rasterizer2D.k) {
            final int n12 = uwotm8.Rasterizer2D.k - k;
            n8 -= n12;
            k = uwotm8.Rasterizer2D.k;
            n7 += n12;
            n6 += n12;
            n10 = n12 + 0;
            n9 += n12;
        }
        if (k + n8 > uwotm8.Rasterizer2D.l) {
            final int n13 = k + n8 - uwotm8.Rasterizer2D.l;
            n8 -= n13;
            n10 += n13;
            n9 += n13;
        }
        if (n8 > 0 && n > 0) {
            a(uwotm8.Rasterizer2D.f, array, n7, n6, n8, n, n9, n10);
        }
    }
    
    private static void a(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                if ((n4 = array2[n++]) != 0 && n4 != -1) {
                    array[n2++] = n4;
                }
                else {
                    ++n2;
                }
                if ((n4 = array2[n++]) != 0 && n4 != -1) {
                    array[n2++] = n4;
                }
                else {
                    ++n2;
                }
                if ((n4 = array2[n++]) != 0 && n4 != -1) {
                    array[n2++] = n4;
                }
                else {
                    ++n2;
                }
                if ((n4 = array2[n++]) != 0 && n4 != -1) {
                    array[n2++] = n4;
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                if ((n4 = array2[n++]) != 0 && n4 != -1) {
                    array[n2++] = n4;
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    public final void a(final int n, int n2, final int[] array, int n3, final int[] array2, int n4, int i, int j, int n5, int n6) {
        try {
            n5 = -n5 / 2;
            final int n7 = -n / 2;
            final int n8 = (int)(Math.sin(n2 / 326.11) * 65536.0);
            n2 = (int)(Math.cos(n2 / 326.11) * 65536.0);
            final int n9 = n8 * n3 >> 8;
            n2 = n2 * n3 >> 8;
            n3 = (n6 << 16) + (n7 * n9 + n5 * n2);
            n4 = (n4 << 16) + (n7 * n2 - n5 * n9);
            n5 = j + i * uwotm8.Rasterizer2D.g;
            int n10;
            int n11;
            for (i = 0; i < n; ++i) {
                j = array2[i];
                n6 = n5 + j;
                n10 = n3 + n2 * j;
                n11 = n4 - n9 * j;
                for (j = -array[i]; j < 0; ++j) {
                    uwotm8.Rasterizer2D.f[n6++] = this.a[(n10 >> 16) + (n11 >> 16) * this.b];
                    n10 += n2;
                    n11 -= n9;
                }
                n3 += n9;
                n4 += n2;
                n5 += uwotm8.Rasterizer2D.g;
            }
        }
        catch (Exception ex) {}
    }
    
    public final void a(int i, final double n, int j) {
        try {
            final int n2 = (int)(Math.sin(n) * 65536.0);
            final int n3 = (int)(Math.cos(n) * 65536.0);
            final int n4 = n2 << 8 >> 8;
            final int n5 = n3 << 8 >> 8;
            int n6 = 983040 + (n4 * -10 + n5 * -10);
            int n7 = 983040 + (n5 * -10 - n4 * -10);
            int n8 = j + i * uwotm8.Rasterizer2D.g;
            int n9;
            int n10;
            int n11;
            int n12;
            for (i = 0; i < 20; ++i) {
                n9 = n8;
                n10 = n6;
                n11 = n7;
                for (j = -20; j < 0; ++j) {
                    if ((n12 = this.a[(n10 >> 16) + (n11 >> 16) * this.b]) != 0) {
                        uwotm8.Rasterizer2D.f[n9++] = n12;
                    }
                    else {
                        ++n9;
                    }
                    n10 += n5;
                    n11 -= n4;
                }
                n6 += n4;
                n7 += n5;
                n8 += uwotm8.Rasterizer2D.g;
            }
        }
        catch (Exception ex) {}
    }
    
    public Sprite(final byte[] array) {
        this.p = String.valueOf(SignLink.a()) + "sprites/";
        try {
            final Image image = Toolkit.getDefaultToolkit().createImage(array);
            final ImageIcon imageIcon = new ImageIcon(image);
            this.b = imageIcon.getIconWidth();
            this.c = imageIcon.getIconHeight();
            this.d = this.b;
            this.e = this.c;
            this.q = 0;
            this.r = 0;
            this.a = new int[this.b * this.c];
            new PixelGrabber(image, 0, 0, this.b, this.c, this.a, 0, this.b).grabPixels();
            this.d(255, 0, 255);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public final void b() {
        final int[] a = new int[this.b * this.c];
        int n = 0;
        for (int i = 0; i < this.c; ++i) {
            for (int j = this.b - 1; j >= 0; --j) {
                a[n++] = this.a[j + i * this.b];
            }
        }
        this.a = a;
        this.q = this.d - this.b - this.q;
    }
    
    public final void c() {
        final int[] a = new int[this.b * this.c];
        int n = 0;
        for (int i = this.c - 1; i >= 0; --i) {
            for (int j = 0; j < this.b; ++j) {
                a[n++] = this.a[j + i * this.b];
            }
        }
        this.a = a;
        this.r = this.e - this.c - this.r;
    }
    
    public final Sprite d() {
        final Sprite n;
        (n = new Sprite(this.b, this.c)).a = this.a;
        n.b = this.b;
        n.c = this.c;
        n.q = this.q;
        n.r = this.r;
        n.d = this.d;
        n.e = this.e;
        return n;
    }
}

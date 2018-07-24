package uwotm8;

public final class IndexedImage extends Rasterizer2D
{
    public byte[] a;
    public final int[] b;
    public int c;
    public int d;
    private int p;
    private int q;
    public int e;
    private int r;
    
    public IndexedImage(final Archive g, final String s, int i) {
        final Buffer j = new Buffer(g.b(String.valueOf(s) + ".dat"));
        final Buffer k;
        (k = new Buffer(g.b("index.dat"))).b = j.g();
        this.e = k.g();
        this.r = k.g();
        final int e = k.e();
        this.b = new int[e];
        for (int l = 0; l < e - 1; ++l) {
            this.b[l + 1] = k.i();
        }
        for (int n = 0; n < i; ++n) {
            final Buffer m = k;
            m.b += 2;
            final Buffer i2 = j;
            i2.b += k.g() * k.g();
            final Buffer i3 = k;
            ++i3.b;
        }
        this.p = k.e();
        this.q = k.e();
        this.c = k.g();
        this.d = k.g();
        final int e2 = k.e();
        final int n2 = this.c * this.d;
        this.a = new byte[n2];
        if (e2 == 0) {
            for (i = 0; i < n2; ++i) {
                this.a[i] = j.f();
            }
            return;
        }
        if (e2 == 1) {
            int n3;
            for (i = 0; i < this.c; ++i) {
                for (n3 = 0; n3 < this.d; ++n3) {
                    this.a[i + n3 * this.c] = j.f();
                }
            }
        }
    }
    
    public final void a() {
        this.e /= 2;
        this.r /= 2;
        final byte[] a = new byte[this.e * this.r];
        int n = 0;
        for (int i = 0; i < this.d; ++i) {
            for (int j = 0; j < this.c; ++j) {
                a[(j + this.p >> 1) + (i + this.q >> 1) * this.e] = this.a[n++];
            }
        }
        this.a = a;
        this.c = this.e;
        this.d = this.r;
        this.p = 0;
        this.q = 0;
    }
    
    public final void b() {
        if (this.c == this.e && this.d == this.r) {
            return;
        }
        final byte[] a = new byte[this.e * this.r];
        int n = 0;
        for (int i = 0; i < this.d; ++i) {
            for (int j = 0; j < this.c; ++j) {
                a[j + this.p + (i + this.q) * this.e] = this.a[n++];
            }
        }
        this.a = a;
        this.c = this.e;
        this.d = this.r;
        this.p = 0;
        this.q = 0;
    }
    
    public final void a(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.b.length; ++i) {
            int n4;
            if ((n4 = (this.b[i] >> 16 & 0xFF) + n) < 0) {
                n4 = 0;
            }
            else if (n4 > 255) {
                n4 = 255;
            }
            int n5;
            if ((n5 = (this.b[i] >> 8 & 0xFF) + n2) < 0) {
                n5 = 0;
            }
            else if (n5 > 255) {
                n5 = 255;
            }
            int n6;
            if ((n6 = (this.b[i] & 0xFF) + n3) < 0) {
                n6 = 0;
            }
            else if (n6 > 255) {
                n6 = 255;
            }
            this.b[i] = (n4 << 16) + (n5 << 8) + n6;
        }
    }
    
    public final void a(int i, int j) {
        i += this.p;
        j += this.q;
        int n = i + j * uwotm8.Rasterizer2D.g;
        int n2 = 0;
        int d = this.d;
        int c = this.c;
        int n3 = uwotm8.Rasterizer2D.g - c;
        int n4 = 0;
        if (j < uwotm8.Rasterizer2D.i) {
            final int n5 = uwotm8.Rasterizer2D.i - j;
            d -= n5;
            j = uwotm8.Rasterizer2D.i;
            n2 = 0 + n5 * c;
            n += n5 * uwotm8.Rasterizer2D.g;
        }
        if (j + d > uwotm8.Rasterizer2D.j) {
            d -= j + d - uwotm8.Rasterizer2D.j;
        }
        if (i < uwotm8.Rasterizer2D.k) {
            final int n6 = uwotm8.Rasterizer2D.k - i;
            c -= n6;
            i = uwotm8.Rasterizer2D.k;
            n2 += n6;
            n += n6;
            n4 = n6 + 0;
            n3 += n6;
        }
        if (i + c > uwotm8.Rasterizer2D.l) {
            final int n7 = i + c - uwotm8.Rasterizer2D.l;
            c -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (c > 0 && d > 0) {
            final int n8 = d;
            final int[] f = uwotm8.Rasterizer2D.f;
            final byte[] a = this.a;
            final int n9 = n3;
            final int n10 = n;
            final int n11 = c;
            final int n12 = n2;
            final int[] b = this.b;
            final int n13 = n4;
            final int[] array = b;
            int n14 = n12;
            final int n15 = n11;
            int n16 = n10;
            final int n17 = n9;
            final byte[] array2 = a;
            final int[] array3 = f;
            i = n8;
            final int n18 = -(n15 >> 2);
            final int n19 = -(n15 & 0x3);
            int k;
            byte b2;
            byte b3;
            byte b4;
            byte b5;
            int l;
            byte b6;
            for (i = -i; i < 0; ++i) {
                for (k = n18; k < 0; ++k) {
                    if ((b2 = array2[n14++]) != 0) {
                        array3[n16++] = array[b2 & 0xFF];
                    }
                    else {
                        ++n16;
                    }
                    if ((b3 = array2[n14++]) != 0) {
                        array3[n16++] = array[b3 & 0xFF];
                    }
                    else {
                        ++n16;
                    }
                    if ((b4 = array2[n14++]) != 0) {
                        array3[n16++] = array[b4 & 0xFF];
                    }
                    else {
                        ++n16;
                    }
                    if ((b5 = array2[n14++]) != 0) {
                        array3[n16++] = array[b5 & 0xFF];
                    }
                    else {
                        ++n16;
                    }
                }
                for (l = n19; l < 0; ++l) {
                    if ((b6 = array2[n14++]) != 0) {
                        array3[n16++] = array[b6 & 0xFF];
                    }
                    else {
                        ++n16;
                    }
                }
                n16 += n17;
                n14 += n13;
            }
        }
    }
}

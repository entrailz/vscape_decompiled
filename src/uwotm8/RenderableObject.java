package uwotm8;

import com.runescape.*;

public final class RenderableObject extends Renderable
{
    private int b;
    private final int[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private Animation j;
    private int k;
    public static Client a;
    private final int l;
    private final int m;
    private final int n;
    
    private ObjectDefinition b() {
        int n = -1;
        if (this.d != -1) {
            try {
                final VariableBits aj;
                final int b = (aj = uwotm8.VariableBits.a[this.d]).b;
                final int c = aj.c;
                n = (RenderableObject.a.A[b] >> c & Client.ad[aj.d - c]);
            }
            catch (Exception ex) {}
        }
        else if (this.e != -1) {
            n = RenderableObject.a.A[this.e];
        }
        if (n < 0 || n >= this.c.length || this.c[n] == -1) {
            return null;
        }
        return uwotm8.ObjectDefinition.a(this.c[n]);
    }
    
    public final Model a() {
        int n = -1;
        if (this.j != null) {
            int i;
            if ((i = Client.R - this.k) > 100 && this.j.e > 0) {
                i = 100;
            }
            while (i > this.j.a(this.b)) {
                i -= this.j.a(this.b);
                ++this.b;
                if (this.b >= this.j.b) {
                    this.b -= this.j.e;
                    if (this.b < 0 || this.b >= this.j.b) {
                        this.j = null;
                        break;
                    }
                    continue;
                }
            }
            this.k = Client.R - i;
            if (this.j != null) {
                n = this.j.c[this.b];
            }
        }
        ObjectDefinition j;
        if (this.c != null) {
            j = this.b();
        }
        else {
            j = uwotm8.ObjectDefinition.a(this.l);
        }
        if (j == null) {
            return null;
        }
        return j.a(this.m, this.n, this.f, this.g, this.h, this.i, n);
    }
    
    public RenderableObject(final int l, final int n, final int m, final int g, final int h, final int f, final int i, final int n2, final boolean b) {
        this.l = l;
        this.m = m;
        this.n = n;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        if (n2 != -1) {
            this.j = uwotm8.Animation.a[n2];
            this.b = 0;
            this.k = Client.R;
            if (b && this.j.e != -1) {
                this.b = (int)(Math.random() * this.j.b);
                this.k -= (int)(Math.random() * this.j.a(this.b));
            }
        }
        final ObjectDefinition a;
        if ((a = uwotm8.ObjectDefinition.a(this.l)) != null) {
            this.d = a.s;
            this.e = a.f;
            this.c = a.k;
            return;
        }
        this.d = -1;
        this.e = -1;
        this.c = null;
    }
}

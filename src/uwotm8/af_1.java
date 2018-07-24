package uwotm8;

import com.runescape.*;
import java.net.*;
import java.io.*;
import java.util.zip.*;

public final class af_1 extends ag implements Runnable
{
    private int b;
    private final M_1 c;
    private int d;
    private String e;
    private int f;
    private long g;
    private int[] h;
    private final byte[] i;
    private int j;
    private final byte[][] k;
    private Client l;
    private final M_1 m;
    private int n;
    private int o;
    private int[] p;
    public int a;
    private int[] q;
    private int r;
    private boolean s;
    private OutputStream t;
    private boolean u;
    private final M_1 v;
    private final byte[] w;
    private final O_1 x;
    private InputStream y;
    private Socket z;
    private final int[][] A;
    private int B;
    private int C;
    private final M_1 D;
    private ae E;
    private final M_1 F;
    private int[] G;
    private int H;
    
    public af_1() {
        this.b = 0;
        this.c = new M_1();
        this.e = "";
        this.i = new byte[500];
        this.k = new byte[4][];
        this.m = new M_1();
        this.s = true;
        this.u = false;
        this.v = new M_1();
        this.w = new byte[465000];
        this.x = new O_1();
        this.A = new int[4][];
        this.D = new M_1();
        this.F = new M_1();
    }
    
    private void f() {
        try {
            final int available = this.y.available();
            if (this.o == 0 && available >= 6) {
                this.u = true;
                for (int i = 0; i < 6; i += this.y.read(this.i, i, 6 - i)) {}
                final int n = this.i[0] & 0xFF;
                final int n2 = ((this.i[1] & 0xFF) << 8) + (this.i[2] & 0xFF);
                final int n3 = ((this.i[3] & 0xFF) << 8) + (this.i[4] & 0xFF);
                final int n4 = this.i[5] & 0xFF;
                this.E = null;
                for (ae e = (ae)this.c.b(); e != null; e = (ae)this.c.d()) {
                    if (e.a == n && e.c == n2) {
                        this.E = e;
                    }
                    if (this.E != null) {
                        e.e = 0;
                    }
                }
                if (this.E != null) {
                    this.H = 0;
                    if (n3 == 0) {
                        al.b("Rej: " + n + "," + n2);
                        this.E.b = null;
                        if (this.E.d) {
                            final M_1 v = this.v;
                            synchronized (this.v) {
                                this.v.a(this.E);
                            }
                        }
                        else {
                            this.E.D();
                        }
                        this.E = null;
                    }
                    else {
                        if (this.E.b == null && n4 == 0) {
                            this.E.b = new byte[n3];
                        }
                        if (this.E.b == null && n4 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.n = n4 * 500;
                this.o = 500;
                if (this.o > n3 - n4 * 500) {
                    this.o = n3 - n4 * 500;
                }
            }
            if (this.o > 0 && available >= this.o) {
                this.u = true;
                byte[] array = this.i;
                int n5 = 0;
                if (this.E != null) {
                    array = this.E.b;
                    n5 = this.n;
                }
                for (int j = 0; j < this.o; j += this.y.read(array, j + n5, this.o - j)) {}
                if (this.o + this.n >= array.length && this.E != null) {
                    if (this.l.z[0] != null) {
                        this.l.z[this.E.a + 1].a(array.length, array, this.E.c);
                    }
                    if (!this.E.d && this.E.a == 3) {
                        this.E.d = true;
                        this.E.a = 93;
                    }
                    if (this.E.d) {
                        final M_1 v2 = this.v;
                        synchronized (this.v) {
                            this.v.a(this.E);
                        }
                    }
                    else {
                        this.E.D();
                    }
                }
                this.o = 0;
            }
        }
        catch (IOException ex) {
            try {
                this.z.close();
            }
            catch (Exception ex2) {}
            this.z = null;
            this.y = null;
            this.t = null;
            this.o = 0;
        }
    }
    
    public final void a() {
        for (int i = 0; i < this.h.length; ++i) {
            try {
                final FileOutputStream fileOutputStream;
                (fileOutputStream = new FileOutputStream(new File("Configs/mapdata/" + this.h[i] + ".gz"))).write(this.l.z[4].a(this.h[i]));
                fileOutputStream.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        for (int j = 0; j < this.q.length; ++j) {
            try {
                final FileOutputStream fileOutputStream2;
                (fileOutputStream2 = new FileOutputStream(new File("Configs/mapdata/" + this.q[j] + ".gz"))).write(this.l.z[4].a(this.q[j]));
                fileOutputStream2.close();
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public final void a(final G_1 g, final Client l) {
        final byte[] b = g.b("map_index");
        final I_1 i = new I_1(b);
        final int n = b.length / 6;
        this.G = new int[n];
        this.q = new int[n];
        this.h = new int[n];
        for (int j = 0; j < n; ++j) {
            this.G[j] = i.g();
            this.q[j] = i.g();
            this.h[j] = i.g();
            ++this.b;
        }
        final byte[] b2 = g.b("midi_index");
        final I_1 k = new I_1(b2);
        final int length = b2.length;
        this.p = new int[length];
        for (int n2 = 0; n2 < length; ++n2) {
            this.p[n2] = k.e();
        }
        this.l = l;
        this.s = true;
        this.l.a(this, 2);
    }
    
    public final int b() {
        final O_1 x = this.x;
        synchronized (this.x) {
            return this.x.d();
        }
    }
    
    public final void c() {
        this.s = false;
    }
    
    private void a(final ae ae) {
        try {
            if (this.z == null) {
                final long currentTimeMillis;
                if ((currentTimeMillis = System.currentTimeMillis()) - this.g < 4000L) {
                    return;
                }
                this.g = currentTimeMillis;
                final int x = Client.x;
                this.z = Client.a(43594);
                this.y = this.z.getInputStream();
                (this.t = this.z.getOutputStream()).write(15);
                for (int i = 0; i < 8; ++i) {
                    this.y.read();
                }
                this.H = 0;
            }
            this.i[0] = (byte)ae.a;
            this.i[1] = (byte)(ae.c >> 8);
            this.i[2] = (byte)ae.c;
            if (ae.d) {
                this.i[3] = 2;
            }
            else if (!Client.Q) {
                this.i[3] = 1;
            }
            else {
                this.i[3] = 0;
            }
            this.t.write(this.i, 0, 4);
            this.f = 0;
            this.a = -10000;
        }
        catch (IOException ex) {
            try {
                this.z.close();
            }
            catch (Exception ex2) {}
            this.z = null;
            this.y = null;
            this.t = null;
            this.o = 0;
            ++this.a;
        }
    }
    
    public final void a(final int a, final int c) {
        final O_1 x = this.x;
        synchronized (this.x) {
            for (ae ae = (ae)this.x.b(); ae != null; ae = (ae)this.x.c()) {
                if (ae.a == a && ae.c == c) {
                    return;
                }
            }
            final ae ae2;
            (ae2 = new ae()).a = a;
            ae2.c = c;
            ae2.d = true;
            final M_1 f = this.F;
            synchronized (this.F) {
                this.F.a(ae2);
            }
            this.x.a(ae2);
        }
    }
    
    @Override
    public final void run() {
        try {
            while (this.s) {
                ++this.j;
                int n = 20;
                if (this.d == 0 && this.l.z[0] != null) {
                    n = 50;
                }
                try {
                    Thread.sleep(n);
                }
                catch (Exception ex2) {}
                this.u = true;
                for (int n2 = 0; n2 < 100 && this.u; ++n2) {
                    this.u = false;
                    this.g();
                    this.B = 0;
                    this.C = 0;
                    for (ae ae = (ae)this.c.b(); ae != null; ae = (ae)this.c.d()) {
                        if (ae.d) {
                            ++this.B;
                            System.out.println("Error: model is incomplete or missing  [ type = " + ae.a + "]  [id = " + ae.c + "]");
                        }
                        else {
                            ++this.C;
                        }
                    }
                    while (this.B < 10) {
                        try {
                            final ae ae2;
                            if ((ae2 = (ae)this.D.a()) == null) {
                                break;
                            }
                            if (this.k[ae2.a][ae2.c] != 0) {
                                ++this.r;
                            }
                            this.k[ae2.a][ae2.c] = 0;
                            this.c.a(ae2);
                            ++this.B;
                            this.a(ae2);
                            this.u = true;
                            System.out.println("Error: file is missing  [ type = " + ae2.a + "]  [id = " + ae2.c + "]");
                        }
                        catch (Exception ex3) {}
                    }
                    if (this.B == 0 && n2 >= 5) {
                        break;
                    }
                    this.h();
                    if (this.y != null) {
                        this.f();
                    }
                }
                int n3 = 0;
                for (ae ae3 = (ae)this.c.b(); ae3 != null; ae3 = (ae)this.c.d()) {
                    if (ae3.d) {
                        n3 = 1;
                        final ae ae4 = ae3;
                        ++ae4.e;
                        if (ae3.e > 50) {
                            ae3.e = 0;
                            this.a(ae3);
                        }
                    }
                }
                if (n3 == 0) {
                    for (ae ae5 = (ae)this.c.b(); ae5 != null; ae5 = (ae)this.c.d()) {
                        n3 = 1;
                        final ae ae6 = ae5;
                        ++ae6.e;
                        if (ae5.e > 50) {
                            ae5.e = 0;
                            this.a(ae5);
                        }
                    }
                }
                if (n3 != 0) {
                    ++this.H;
                    if (this.H > 750) {
                        try {
                            this.z.close();
                        }
                        catch (Exception ex4) {}
                        this.z = null;
                        this.y = null;
                        this.t = null;
                        this.o = 0;
                    }
                }
                else {
                    this.H = 0;
                    this.e = "";
                }
                if (Client.Q && this.z != null && this.t != null && (this.d > 0 || this.l.z[0] == null)) {
                    ++this.f;
                    if (this.f <= 500) {
                        continue;
                    }
                    this.f = 0;
                    this.i[0] = 0;
                    this.i[1] = 0;
                    this.i[2] = 0;
                    this.i[3] = 10;
                    try {
                        this.t.write(this.i, 0, 4);
                    }
                    catch (IOException ex5) {
                        this.H = 5000;
                    }
                }
            }
        }
        catch (Exception ex) {
            al.b("od_ex " + ex.getMessage());
        }
    }
    
    public final void b(final int c, final int a) {
        if (this.l.z[0] != null && this.d != 0) {
            final ae ae;
            (ae = new ae()).a = a;
            ae.c = c;
            ae.d = false;
            final M_1 m = this.m;
            synchronized (this.m) {
                this.m.a(ae);
            }
        }
    }
    
    public final ae d() {
        final M_1 v = this.v;
        final ae ae;
        synchronized (this.v) {
            ae = (ae)this.v.a();
        }
        if (ae == null) {
            return null;
        }
        final O_1 x = this.x;
        synchronized (this.x) {
            ae.E();
        }
        if (ae.b == null) {
            return ae;
        }
        int i = 0;
        Label_0212: {
            try {
                final GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(ae.b));
                while (i != 465000) {
                    final int read;
                    if ((read = gzipInputStream.read(this.w, i, 465000 - i)) == -1) {
                        break Label_0212;
                    }
                    i += read;
                }
                throw new RuntimeException("buffer overflow!");
            }
            catch (IOException ex) {
                System.out.println("Failed to unzip model [" + ae.c + "] type = " + ae.a);
                ex.printStackTrace();
                return null;
            }
        }
        ae.b = new byte[i];
        System.arraycopy(this.w, 0, ae.b, 0, i);
        return ae;
    }
    
    public final int a(final int n, int n2, int i) {
        n2 += i << 8;
        i = 0;
        while (i < this.G.length) {
            if (this.G[i] == n2) {
                if (n == 0) {
                    return this.q[i];
                }
                return this.h[i];
            }
            else {
                ++i;
            }
        }
        return -1;
    }
    
    @Override
    public final void a(final int n) {
        this.a(0, n);
    }
    
    public final boolean b(final int n) {
        for (int i = 0; i < this.G.length; ++i) {
            if (this.h[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public final void e() {
        final M_1 m = this.m;
        synchronized (this.m) {
            this.m.f();
        }
    }
    
    private void g() {
        final M_1 f = this.F;
        ae ae;
        synchronized (this.F) {
            ae = (ae)this.F.a();
        }
        while (ae != null) {
            this.u = true;
            byte[] a = null;
            if (this.l.z[0] != null) {
                a = this.l.z[ae.a + 1].a(ae.c);
            }
            final M_1 f2 = this.F;
            synchronized (this.F) {
                if (a == null) {
                    this.D.a(ae);
                }
                else {
                    ae.b = a;
                    final M_1 v = this.v;
                    synchronized (this.v) {
                        this.v.a(ae);
                    }
                }
                ae = (ae)this.F.a();
            }
        }
    }
    
    private void h() {
        while (this.B == 0 && this.C < 10 && this.d != 0) {
            final M_1 m = this.m;
            ae ae;
            synchronized (this.m) {
                ae = (ae)this.m.a();
            }
            while (ae != null) {
                if (this.k[ae.a][ae.c] != 0) {
                    this.k[ae.a][ae.c] = 0;
                    this.c.a(ae);
                    this.a(ae);
                    this.u = true;
                    if (this.r < 0) {
                        ++this.r;
                    }
                    this.e = "Loading extra files - " + this.r * 100 / 0 + "%";
                    ++this.C;
                    if (this.C == 10) {
                        return;
                    }
                }
                final M_1 i = this.m;
                synchronized (this.m) {
                    ae = (ae)this.m.a();
                }
            }
            for (int j = 0; j < 4; ++j) {
                byte[] array;
                for (int length = (array = this.k[j]).length, k = 0; k < length; ++k) {
                    if (array[k] == this.d) {
                        array[k] = 0;
                        final ae ae2;
                        (ae2 = new ae()).a = j;
                        ae2.c = k;
                        ae2.d = false;
                        this.c.a(ae2);
                        this.a(ae2);
                        this.u = true;
                        if (this.r < 0) {
                            ++this.r;
                        }
                        this.e = "Loading extra files - " + this.r * 100 / 0 + "%";
                        ++this.C;
                        if (this.C == 10) {
                            return;
                        }
                    }
                }
            }
            --this.d;
        }
    }
}

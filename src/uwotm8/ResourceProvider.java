package uwotm8;

import com.runescape.*;
import java.net.*;
import java.io.*;
import java.util.zip.*;

public final class ResourceProvider extends ag implements Runnable
{
    private int b;
    private final LinkedList c;
    private int d;
    private String e;
    private int f;
    private long g;
    private int[] h;
    private final byte[] i;
    private int j;
    private final byte[][] k;
    private Client l;
    private final LinkedList m;
    private int n;
    private int o;
    private int[] p;
    public int a;
    private int[] q;
    private int r;
    private boolean s;
    private OutputStream t;
    private boolean u;
    private final LinkedList v;
    private final byte[] w;
    private final Queue x;
    private InputStream y;
    private Socket z;
    private final int[][] A;
    private int B;
    private int C;
    private final LinkedList D;
    private Resource E;
    private final LinkedList F;
    private int[] G;
    private int H;
    
    public ResourceProvider() {
        this.b = 0;
        this.c = new LinkedList();
        this.e = "";
        this.i = new byte[500];
        this.k = new byte[4][];
        this.m = new LinkedList();
        this.s = true;
        this.u = false;
        this.v = new LinkedList();
        this.w = new byte[465000];
        this.x = new Queue();
        this.A = new int[4][];
        this.D = new LinkedList();
        this.F = new LinkedList();
    }
    
    private void respond() {
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
                for (Resource e = (Resource)this.c.getBack(); e != null; e = (Resource)this.c.getPrevious()) {
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
                        SignLink.b("Rej: " + n + "," + n2);
                        this.E.b = null;
                        if (this.E.d) {
                            final LinkedList v = this.v;
                            synchronized (this.v) {
                                this.v.insertBack(this.E);
                            }
                        }
                        else {
                            this.E.unlink();
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
                        this.l.z[this.E.a + 1].put(array.length, array, this.E.c);
                    }
                    if (!this.E.d && this.E.a == 3) {
                        this.E.d = true;
                        this.E.a = 93;
                    }
                    if (this.E.d) {
                        final LinkedList v2 = this.v;
                        synchronized (this.v) {
                            this.v.insertBack(this.E);
                        }
                    }
                    else {
                        this.E.unlink();
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
                (fileOutputStream = new FileOutputStream(new File("Configs/mapdata/" + this.h[i] + ".gz"))).write(this.l.z[4].decompress(this.h[i]));
                fileOutputStream.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        for (int j = 0; j < this.q.length; ++j) {
            try {
                final FileOutputStream fileOutputStream2;
                (fileOutputStream2 = new FileOutputStream(new File("Configs/mapdata/" + this.q[j] + ".gz"))).write(this.l.z[4].decompress(this.q[j]));
                fileOutputStream2.close();
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public final void init(final Archive g, final Client l) {
        final byte[] b = g.getEntry("map_index");
        final Buffer i = new Buffer(b);
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
        final byte[] b2 = g.getEntry("midi_index");
        final Buffer k = new Buffer(b2);
        final int length = b2.length;
        this.p = new int[length];
        for (int n2 = 0; n2 < length; ++n2) {
            this.p[n2] = k.e();
        }
        this.l = l;
        this.s = true;
        this.l.a(this, 2);
    }
    
    public final int getNodeCount() {
        final Queue x = this.x;
        synchronized (this.x) {
            return this.x.getNodeCount();
        }
    }
    
    public final void c() {
        this.s = false;
    }
    
    private void a(final Resource ae) {
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
    
    public final void provide(final int a, final int c) {
        final Queue x = this.x;
        synchronized (this.x) {
            for (Resource ae = (Resource)this.x.reverseGetFirst(); ae != null; ae = (Resource)this.x.reverseGetNext()) {
                if (ae.a == a && ae.c == c) {
                    return;
                }
            }
            final Resource ae2;
            (ae2 = new Resource()).a = a;
            ae2.c = c;
            ae2.d = true;
            final LinkedList f = this.F;
            synchronized (this.F) {
                this.F.insertBack(ae2);
            }
            this.x.insertHead(ae2);
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
                    for (Resource ae = (Resource)this.c.getBack(); ae != null; ae = (Resource)this.c.getPrevious()) {
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
                            final Resource ae2;
                            if ((ae2 = (Resource)this.D.popTail()) == null) {
                                break;
                            }
                            if (this.k[ae2.a][ae2.c] != 0) {
                                ++this.r;
                            }
                            this.k[ae2.a][ae2.c] = 0;
                            this.c.insertBack(ae2);
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
                        this.respond();
                    }
                }
                int n3 = 0;
                for (Resource ae3 = (Resource)this.c.getBack(); ae3 != null; ae3 = (Resource)this.c.getPrevious()) {
                    if (ae3.d) {
                        n3 = 1;
                        final Resource ae4 = ae3;
                        ++ae4.e;
                        if (ae3.e > 50) {
                            ae3.e = 0;
                            this.a(ae3);
                        }
                    }
                }
                if (n3 == 0) {
                    for (Resource ae5 = (Resource)this.c.getBack(); ae5 != null; ae5 = (Resource)this.c.getPrevious()) {
                        n3 = 1;
                        final Resource ae6 = ae5;
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
            SignLink.b("od_ex " + ex.getMessage());
        }
    }
    
    public final void b(final int c, final int a) {
        if (this.l.z[0] != null && this.d != 0) {
            final Resource ae;
            (ae = new Resource()).a = a;
            ae.c = c;
            ae.d = false;
            final LinkedList m = this.m;
            synchronized (this.m) {
                this.m.insertBack(ae);
            }
        }
    }
    
    public final Resource d() {
        final LinkedList v = this.v;
        final Resource ae;
        synchronized (this.v) {
            ae = (Resource)this.v.popTail();
        }
        if (ae == null) {
            return null;
        }
        final Queue x = this.x;
        synchronized (this.x) {
            ae.clear();
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
    public final void provide(final int n) {
        this.provide(0, n);
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
        final LinkedList m = this.m;
        synchronized (this.m) {
            this.m.clear();
        }
    }
    
    private void g() {
        final LinkedList f = this.F;
        Resource ae;
        synchronized (this.F) {
            ae = (Resource)this.F.popTail();
        }
        while (ae != null) {
            this.u = true;
            byte[] a = null;
            if (this.l.z[0] != null) {
                a = this.l.z[ae.a + 1].decompress(ae.c);
            }
            final LinkedList f2 = this.F;
            synchronized (this.F) {
                if (a == null) {
                    this.D.insertBack(ae);
                }
                else {
                    ae.b = a;
                    final LinkedList v = this.v;
                    synchronized (this.v) {
                        this.v.insertBack(ae);
                    }
                }
                ae = (Resource)this.F.popTail();
            }
        }
    }
    
    private void h() {
        while (this.B == 0 && this.C < 10 && this.d != 0) {
            final LinkedList m = this.m;
            Resource ae;
            synchronized (this.m) {
                ae = (Resource)this.m.popTail();
            }
            while (ae != null) {
                if (this.k[ae.a][ae.c] != 0) {
                    this.k[ae.a][ae.c] = 0;
                    this.c.insertBack(ae);
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
                final LinkedList i = this.m;
                synchronized (this.m) {
                    ae = (Resource)this.m.popTail();
                }
            }
            for (int j = 0; j < 4; ++j) {
                byte[] array;
                for (int length = (array = this.k[j]).length, k = 0; k < length; ++k) {
                    if (array[k] == this.d) {
                        array[k] = 0;
                        final Resource ae2;
                        (ae2 = new Resource()).a = j;
                        ae2.c = k;
                        ae2.d = false;
                        this.c.insertBack(ae2);
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

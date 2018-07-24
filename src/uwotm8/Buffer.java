package uwotm8;

import java.math.*;

public final class Buffer extends CacheableNode
{
    public byte[] a;
    public int b;
    public int c;
    private static final int[] e;
    public IsaacCipher d;
    private static int f;
    private static final LinkedList g;
    
    static {
        e = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        g = new LinkedList();
    }
    
    public static Buffer a() {
        synchronized (Buffer.g) {
            Buffer i = null;
            if (Buffer.f > 0) {
                --Buffer.f;
                i = (Buffer)Buffer.g.popTail();
            }
            if (i != null) {
                i.b = 0;
                // monitorexit(I.g)
                return i;
            }
        }
        // monitorexit(I.g)
        final Buffer k;
        (k = new Buffer()).b = 0;
        k.a = new byte[5000];
        return k;
    }
    
    public final int b() {
        this.b += 3;
        return (0xFF & this.a[this.b - 3] << 16) + (0xFF & this.a[this.b - 2] << 8) + (0xFF & this.a[this.b - 1]);
    }
    
    private Buffer() {
    }
    
    public Buffer(final byte[] a) {
        this.a = a;
        this.b = 0;
    }
    
    public final int c() {
        int n = 0;
        int q;
        while ((q = this.q()) == 32767) {
            n += 32767;
        }
        return n + q;
    }
    
    public final String d() {
        final int b = this.b;
        while (this.a[this.b++] != 0) {}
        return new String(this.a, b, this.b - b - 1);
    }
    
    public final void writeOpCode(final int n) {
        this.a[this.b++] = (byte)(n + this.d.getNextKey());
    }
    
    public final void b(final int n) {
        this.a[this.b++] = (byte)n;
    }
    
    public final void c(final int n) {
        this.a[this.b++] = (byte)(n >> 8);
        this.a[this.b++] = (byte)n;
    }
    
    public final void d(final int n) {
        this.a[this.b++] = (byte)n;
        this.a[this.b++] = (byte)(n >> 8);
    }
    
    public final void e(final int n) {
        this.a[this.b++] = -26;
        this.a[this.b++] = 50;
        this.a[this.b++] = 113;
    }
    
    public final void f(final int n) {
        this.a[this.b++] = (byte)(n >> 24);
        this.a[this.b++] = (byte)(n >> 16);
        this.a[this.b++] = (byte)(n >> 8);
        this.a[this.b++] = (byte)n;
    }
    
    public final void g(final int n) {
        this.a[this.b++] = (byte)n;
        this.a[this.b++] = (byte)(n >> 8);
        this.a[this.b++] = (byte)(n >> 16);
        this.a[this.b++] = (byte)(n >> 24);
    }
    
    public final void a(final long n) {
        try {
            this.a[this.b++] = (byte)(n >> 56);
            this.a[this.b++] = (byte)(n >> 48);
            this.a[this.b++] = (byte)(n >> 40);
            this.a[this.b++] = (byte)(n >> 32);
            this.a[this.b++] = (byte)(n >> 24);
            this.a[this.b++] = (byte)(n >> 16);
            this.a[this.b++] = (byte)(n >> 8);
            this.a[this.b++] = (byte)n;
        }
        catch (RuntimeException ex) {
            SignLink.b("14395, 5, " + n + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
    
    public final void a(final String s) {
        System.arraycopy(s.getBytes(), 0, this.a, this.b, s.length());
        this.b += s.length();
        this.a[this.b++] = 10;
    }
    
    public final void a(final byte[] array, final int n, int i) {
        for (i = 0; i < n + 0; ++i) {
            this.a[this.b++] = array[i];
        }
    }
    
    public final void h(final int n) {
        this.a[this.b - n - 1] = (byte)n;
    }
    
    public final int e() {
        return this.a[this.b++] & 0xFF;
    }
    
    public final byte f() {
        return this.a[this.b++];
    }
    
    public final int g() {
        this.b += 2;
        return ((this.a[this.b - 2] & 0xFF) << 8) + (this.a[this.b - 1] & 0xFF);
    }
    
    public final int h() {
        this.b += 2;
        int n;
        if ((n = ((this.a[this.b - 2] & 0xFF) << 8) + (this.a[this.b - 1] & 0xFF)) > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public final int i() {
        this.b += 3;
        return ((this.a[this.b - 3] & 0xFF) << 16) + ((this.a[this.b - 2] & 0xFF) << 8) + (this.a[this.b - 1] & 0xFF);
    }
    
    public final int j() {
        this.b += 4;
        return ((this.a[this.b - 4] & 0xFF) << 24) + ((this.a[this.b - 3] & 0xFF) << 16) + ((this.a[this.b - 2] & 0xFF) << 8) + (this.a[this.b - 1] & 0xFF);
    }
    
    public final long k() {
        return ((this.j() & 0xFFFFFFFFL) << 32) + (this.j() & 0xFFFFFFFFL);
    }
    
    public final String l() {
        final int b = this.b;
        while (this.a[this.b++] != 10) {}
        return new String(this.a, b, this.b - b - 1);
    }
    
    public final byte[] m() {
        final int b = this.b;
        while (this.a[this.b++] != 10) {}
        final byte[] array = new byte[this.b - b - 1];
        final byte[] a = this.a;
        final int n = b;
        final byte[] array2 = array;
        final int n2 = b;
        System.arraycopy(a, n, array2, n2 - n2, this.b - 1 - b);
        return array;
    }
    
    public final void a(final int n, int i, final byte[] array) {
        for (i = 0; i < n + 0; ++i) {
            array[i] = this.a[this.b++];
        }
    }
    
    public final void n() {
        this.c = this.b << 3;
    }
    
    public final int i(int i) {
        int n = this.c >> 3;
        int n2 = 8 - (this.c & 0x7);
        int n3 = 0;
        this.c += i;
        while (i > n2) {
            n3 += (this.a[n++] & Buffer.e[n2]) << i - n2;
            i -= n2;
            n2 = 8;
        }
        int n4;
        if (i == n2) {
            n4 = n3 + (this.a[n] & Buffer.e[n2]);
        }
        else {
            n4 = n3 + (this.a[n] >> n2 - i & Buffer.e[i]);
        }
        return n4;
    }
    
    public final void o() {
        this.b = (this.c + 7) / 8;
    }
    
    public final int p() {
        if ((this.a[this.b] & 0xFF) < 128) {
            return this.e() - 64;
        }
        return this.g() - 49152;
    }
    
    public final int q() {
        if ((this.a[this.b] & 0xFF) < 128) {
            return this.e();
        }
        return this.g() - 32768;
    }
    
    public final void r() {
        final int b = this.b;
        this.b = 0;
        final byte[] array = new byte[b];
        this.a(b, 0, array);
        final byte[] byteArray = new BigInteger(array).modPow(RSAKeys.exponent, RSAKeys.modulus).toByteArray();
        this.b = 0;
        this.b(byteArray.length);
        final byte[] array2 = byteArray;
        this.a(array2, array2.length, 0);
    }
    
    public final void j(final int n) {
        this.a[this.b++] = (byte)(-n);
    }
    
    public final void k(final int n) {
        this.a[this.b++] = (byte)(128 - n);
    }
    
    public final int s() {
        return this.a[this.b++] - 128 & 0xFF;
    }
    
    public final int t() {
        return -this.a[this.b++] & 0xFF;
    }
    
    public final int u() {
        return 128 - this.a[this.b++] & 0xFF;
    }
    
    public final byte v() {
        return (byte)(-this.a[this.b++]);
    }
    
    public final void l(final int n) {
        this.a[this.b++] = (byte)n;
        this.a[this.b++] = (byte)(n >> 8);
    }
    
    public final void m(final int n) {
        this.a[this.b++] = (byte)(n >> 8);
        this.a[this.b++] = (byte)(n + 128);
    }
    
    public final void n(final int n) {
        this.a[this.b++] = (byte)(n + 128);
        this.a[this.b++] = (byte)(n >> 8);
    }
    
    public final int w() {
        this.b += 2;
        return ((this.a[this.b - 1] & 0xFF) << 8) + (this.a[this.b - 2] & 0xFF);
    }
    
    public final int x() {
        this.b += 2;
        return ((this.a[this.b - 2] & 0xFF) << 8) + (this.a[this.b - 1] - 128 & 0xFF);
    }
    
    public final int y() {
        this.b += 2;
        return ((this.a[this.b - 1] & 0xFF) << 8) + (this.a[this.b - 2] - 128 & 0xFF);
    }
    
    public final int z() {
        this.b += 2;
        int n;
        if ((n = ((this.a[this.b - 1] & 0xFF) << 8) + (this.a[this.b - 2] & 0xFF)) > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public final int A() {
        this.b += 2;
        int n;
        if ((n = ((this.a[this.b - 1] & 0xFF) << 8) + (this.a[this.b - 2] - 128 & 0xFF)) > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public final int B() {
        this.b += 4;
        return ((this.a[this.b - 2] & 0xFF) << 24) + ((this.a[this.b - 1] & 0xFF) << 16) + ((this.a[this.b - 4] & 0xFF) << 8) + (this.a[this.b - 3] & 0xFF);
    }
    
    public final int C() {
        this.b += 4;
        return ((this.a[this.b - 3] & 0xFF) << 24) + ((this.a[this.b - 4] & 0xFF) << 16) + ((this.a[this.b - 1] & 0xFF) << 8) + (this.a[this.b - 2] & 0xFF);
    }
    
    public final void a(int i, final byte[] array, final int n) {
        for (i = n + 0 - 1; i >= 0; --i) {
            this.a[this.b++] = (byte)(array[i] + 128);
        }
    }
}

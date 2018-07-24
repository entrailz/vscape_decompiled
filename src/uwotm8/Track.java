package uwotm8;

public final class Track
{
    private static final Track[] b;
    public static final int[] a;
    private static byte[] c;
    private static Buffer d;
    private final Synthesizer[] e;
    private int f;
    private int g;
    
    static {
        b = new Track[5000];
        a = new int[5000];
    }
    
    private Track() {
        this.e = new Synthesizer[10];
    }
    
    public static void a(final Buffer i) {
        Track.c = new byte[441000];
        Track.d = new Buffer(Track.c);
        Synthesizer.a();
        int g;
        while ((g = i.g()) != 65535) {
            Track.b[g] = new Track();
            final Track aq = uwotm8.Track.b[g];
            for (int j = 0; j < 10; ++j) {
                if (i.e() != 0) {
                    --i.b;
                    (aq.e[j] = new Synthesizer()).a(i);
                }
            }
            aq.f = i.g();
            aq.g = i.g();
            final int[] a = uwotm8.Track.a;
            final int n = g;
            final Track aq2 = uwotm8.Track.b[g];
            int n2 = 9999999;
            for (int k = 0; k < 10; ++k) {
                if (aq2.e[k] != null && aq2.e[k].b / 20 < n2) {
                    n2 = aq2.e[k].b / 20;
                }
            }
            if (aq2.f < aq2.g && aq2.f / 20 < n2) {
                n2 = aq2.f / 20;
            }
            int n3;
            if (n2 == 9999999 || n2 == 0) {
                n3 = 0;
            }
            else {
                for (int l = 0; l < 10; ++l) {
                    if (aq2.e[l] != null) {
                        final Synthesizer ar = aq2.e[l];
                        ar.b -= n2 * 20;
                    }
                }
                if (aq2.f < aq2.g) {
                    final Track aq3 = aq2;
                    aq3.f -= n2 * 20;
                    final Track aq4 = aq2;
                    aq4.g -= n2 * 20;
                }
                n3 = n2;
            }
            a[n] = n3;
        }
    }
    
    public static Buffer a(int n, int n2) {
        if (Track.b[n2] != null) {
            final Track aq = uwotm8.Track.b[n2];
            n2 = (n2 = n);
            final Track aq2 = aq;
            int n3 = 0;
            for (int i = 0; i < 10; ++i) {
                if (aq2.e[i] != null && aq2.e[i].a + aq2.e[i].b > n3) {
                    n3 = aq2.e[i].a + aq2.e[i].b;
                }
            }
            int n4;
            if (n3 == 0) {
                n4 = 0;
            }
            else {
                int n5 = n3 * 22050 / 1000;
                int n6 = 22050 * aq2.f / 1000;
                int n7 = 22050 * aq2.g / 1000;
                if (n6 < 0 || n6 > n5 || n7 < 0 || n7 > n5 || n6 >= n7) {
                    n2 = 0;
                }
                int n8 = n5 + (n7 - n6) * (n2 - 1);
                for (int j = 44; j < n8 + 44; ++j) {
                    uwotm8.Track.c[j] = -128;
                }
                for (int k = 0; k < 10; ++k) {
                    if (aq2.e[k] != null) {
                        final int n9 = aq2.e[k].a * 22050 / 1000;
                        final int n10 = aq2.e[k].b * 22050 / 1000;
                        final int n11 = n9;
                        final Synthesizer ar = aq2.e[k];
                        final int[] a = ar.a(n11, ar.a);
                        for (int l = 0; l < n9; ++l) {
                            final byte[] c = uwotm8.Track.c;
                            final int n12 = l + n10 + 44;
                            c[n12] += (byte)(a[l] >> 8);
                        }
                    }
                }
                if (n2 > 1) {
                    n6 += 44;
                    n7 += 44;
                    n5 += 44;
                    n8 += 44;
                    final int n13 = n8 - n5;
                    for (int n14 = n5 - 1; n14 >= n7; --n14) {
                        uwotm8.Track.c[n14 + n13] = uwotm8.Track.c[n14];
                    }
                    for (int n15 = 1; n15 < n2; ++n15) {
                        final int n16 = (n7 - n6) * n15;
                        final int n17 = n6;
                        final byte[] c2 = uwotm8.Track.c;
                        System.arraycopy(c2, n17, c2, n6 + n16, n7 - n6);
                    }
                    n8 -= 44;
                }
                n4 = n8;
            }
            n = n4;
            uwotm8.Track.d.b = 0;
            uwotm8.Track.d.f(1380533830);
            uwotm8.Track.d.g(n + 36);
            uwotm8.Track.d.f(1463899717);
            uwotm8.Track.d.f(1718449184);
            uwotm8.Track.d.g(16);
            uwotm8.Track.d.d(1);
            uwotm8.Track.d.d(1);
            uwotm8.Track.d.g(22050);
            uwotm8.Track.d.g(22050);
            uwotm8.Track.d.d(1);
            uwotm8.Track.d.d(8);
            uwotm8.Track.d.f(1684108385);
            uwotm8.Track.d.g(n);
            final Buffer d = uwotm8.Track.d;
            d.b += n;
            return uwotm8.Track.d;
        }
        return null;
    }
}

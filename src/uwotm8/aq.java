package uwotm8;

public final class aq
{
    private static final aq[] b;
    public static final int[] a;
    private static byte[] c;
    private static I_1 d;
    private final ar[] e;
    private int f;
    private int g;
    
    static {
        b = new aq[5000];
        a = new int[5000];
    }
    
    private aq() {
        this.e = new ar[10];
    }
    
    public static void a(final I_1 i) {
        aq.c = new byte[441000];
        aq.d = new I_1(aq.c);
        ar.a();
        int g;
        while ((g = i.g()) != 65535) {
            aq.b[g] = new aq();
            final aq aq = uwotm8.aq.b[g];
            for (int j = 0; j < 10; ++j) {
                if (i.e() != 0) {
                    --i.b;
                    (aq.e[j] = new ar()).a(i);
                }
            }
            aq.f = i.g();
            aq.g = i.g();
            final int[] a = uwotm8.aq.a;
            final int n = g;
            final aq aq2 = uwotm8.aq.b[g];
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
                        final ar ar = aq2.e[l];
                        ar.b -= n2 * 20;
                    }
                }
                if (aq2.f < aq2.g) {
                    final aq aq3 = aq2;
                    aq3.f -= n2 * 20;
                    final aq aq4 = aq2;
                    aq4.g -= n2 * 20;
                }
                n3 = n2;
            }
            a[n] = n3;
        }
    }
    
    public static I_1 a(int n, int n2) {
        if (aq.b[n2] != null) {
            final aq aq = uwotm8.aq.b[n2];
            n2 = (n2 = n);
            final aq aq2 = aq;
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
                    uwotm8.aq.c[j] = -128;
                }
                for (int k = 0; k < 10; ++k) {
                    if (aq2.e[k] != null) {
                        final int n9 = aq2.e[k].a * 22050 / 1000;
                        final int n10 = aq2.e[k].b * 22050 / 1000;
                        final int n11 = n9;
                        final ar ar = aq2.e[k];
                        final int[] a = ar.a(n11, ar.a);
                        for (int l = 0; l < n9; ++l) {
                            final byte[] c = uwotm8.aq.c;
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
                        uwotm8.aq.c[n14 + n13] = uwotm8.aq.c[n14];
                    }
                    for (int n15 = 1; n15 < n2; ++n15) {
                        final int n16 = (n7 - n6) * n15;
                        final int n17 = n6;
                        final byte[] c2 = uwotm8.aq.c;
                        System.arraycopy(c2, n17, c2, n6 + n16, n7 - n6);
                    }
                    n8 -= 44;
                }
                n4 = n8;
            }
            n = n4;
            uwotm8.aq.d.b = 0;
            uwotm8.aq.d.f(1380533830);
            uwotm8.aq.d.g(n + 36);
            uwotm8.aq.d.f(1463899717);
            uwotm8.aq.d.f(1718449184);
            uwotm8.aq.d.g(16);
            uwotm8.aq.d.d(1);
            uwotm8.aq.d.d(1);
            uwotm8.aq.d.g(22050);
            uwotm8.aq.d.g(22050);
            uwotm8.aq.d.d(1);
            uwotm8.aq.d.d(8);
            uwotm8.aq.d.f(1684108385);
            uwotm8.aq.d.g(n);
            final I_1 d = uwotm8.aq.d;
            d.b += n;
            return uwotm8.aq.d;
        }
        return null;
    }
}

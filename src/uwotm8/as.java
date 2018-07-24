package uwotm8;

public final class as
{
    private static int[] a;
    private static char[][] b;
    private static byte[][][] c;
    private static char[][] d;
    private static char[][] e;
    private static int[] f;
    
    static {
        final String[] array = { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
    }
    
    public static void a(final G_1 g) {
        final I_1 i = new I_1(g.b("fragmentsenc.txt"));
        final I_1 j = new I_1(g.b("badenc.txt"));
        final I_1 k = new I_1(g.b("domainenc.txt"));
        final I_1 l = new I_1(g.b("tldlist.txt"));
        final I_1 m = i;
        final I_1 i2 = j;
        final I_1 i3 = k;
        final I_1 i4 = l;
        final I_1 i5 = i3;
        final I_1 i6 = i2;
        final I_1 i7 = m;
        final I_1 i8;
        final int j2;
        as.b = new char[j2 = (i8 = i6).j()][];
        as.c = new byte[j2][][];
        final I_1 i9 = i8;
        final char[][] b = as.b;
        final byte[][][] c = as.c;
        final char[][] array = b;
        final I_1 i10 = i9;
        for (int n = 0; n < array.length; ++n) {
            final char[] array2 = new char[i10.e()];
            for (int n2 = 0; n2 < array2.length; ++n2) {
                array2[n2] = (char)i10.e();
            }
            array[n] = array2;
            final byte[][] array3 = new byte[i10.e()][2];
            for (int n3 = 0; n3 < array3.length; ++n3) {
                array3[n3][0] = (byte)i10.e();
                array3[n3][1] = (byte)i10.e();
            }
            if (array3.length > 0) {
                c[n] = array3;
            }
        }
        final I_1 i11;
        final char[][] array4 = as.d = new char[(i11 = i5).j()][];
        final I_1 i12 = i11;
        final char[][] array5 = array4;
        for (int n4 = 0; n4 < array5.length; ++n4) {
            final char[] array6 = new char[i12.e()];
            for (int n5 = 0; n5 < array6.length; ++n5) {
                array6[n5] = (char)i12.e();
            }
            array5[n4] = array6;
        }
        final I_1 i13;
        as.a = new int[(i13 = i7).j()];
        for (int n6 = 0; n6 < as.a.length; ++n6) {
            as.a[n6] = i13.g();
        }
        final I_1 i14;
        final int j3;
        as.e = new char[j3 = (i14 = i4).j()][];
        as.f = new int[j3];
        for (int n7 = 0; n7 < j3; ++n7) {
            as.f[n7] = i14.e();
            final char[] array7 = new char[i14.e()];
            for (int n8 = 0; n8 < array7.length; ++n8) {
                array7[n8] = (char)i14.e();
            }
            as.e[n7] = array7;
        }
    }
}

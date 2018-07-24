package uwotm8;

public final class MessageCensor
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
    
    public static void a(final Archive g) {
        final Buffer i = new Buffer(g.getEntry("fragmentsenc.txt"));
        final Buffer j = new Buffer(g.getEntry("badenc.txt"));
        final Buffer k = new Buffer(g.getEntry("domainenc.txt"));
        final Buffer l = new Buffer(g.getEntry("tldlist.txt"));
        final Buffer m = i;
        final Buffer i2 = j;
        final Buffer i3 = k;
        final Buffer i4 = l;
        final Buffer i5 = i3;
        final Buffer i6 = i2;
        final Buffer i7 = m;
        final Buffer i8;
        final int j2;
        MessageCensor.b = new char[j2 = (i8 = i6).j()][];
        MessageCensor.c = new byte[j2][][];
        final Buffer i9 = i8;
        final char[][] b = MessageCensor.b;
        final byte[][][] c = MessageCensor.c;
        final char[][] array = b;
        final Buffer i10 = i9;
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
        final Buffer i11;
        final char[][] array4 = MessageCensor.d = new char[(i11 = i5).j()][];
        final Buffer i12 = i11;
        final char[][] array5 = array4;
        for (int n4 = 0; n4 < array5.length; ++n4) {
            final char[] array6 = new char[i12.e()];
            for (int n5 = 0; n5 < array6.length; ++n5) {
                array6[n5] = (char)i12.e();
            }
            array5[n4] = array6;
        }
        final Buffer i13;
        MessageCensor.a = new int[(i13 = i7).j()];
        for (int n6 = 0; n6 < MessageCensor.a.length; ++n6) {
            MessageCensor.a[n6] = i13.g();
        }
        final Buffer i14;
        final int j3;
        MessageCensor.e = new char[j3 = (i14 = i4).j()][];
        MessageCensor.f = new int[j3];
        for (int n7 = 0; n7 < j3; ++n7) {
            MessageCensor.f[n7] = i14.e();
            final char[] array7 = new char[i14.e()];
            for (int n8 = 0; n8 < array7.length; ++n8) {
                array7[n8] = (char)i14.e();
            }
            MessageCensor.e[n7] = array7;
        }
    }
}

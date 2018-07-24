package uwotm8;

import java.util.*;
import com.runescape.*;

public final class e
{
    private static Hashtable g;
    public f a;
    public int b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    
    static {
    	uwotm8.e.g = new Hashtable();
    }
    
    public static void a(final byte[] array, final int n) {
        final I_1 i;
        (i = new I_1(array)).b = array.length - 12;
        final int j = i.j();
        final int k = i.j();
        final int l = i.j();
        final I_1 m;
        (m = new I_1(array)).b = 0;
        final int b = 0 + (j + 4);
        final I_1 i2;
        (i2 = new I_1(array)).b = b;
        final int b2 = b + k;
        final I_1 i3;
        (i3 = new I_1(array)).b = b2;
        final I_1 i4;
        (i4 = new I_1(array)).b = b2 + l;
        final f a = new f(i4);
        final int j2 = m.j();
        final int[] array2 = new int[500];
        final int[] array3 = new int[500];
        final int[] array4 = new int[500];
        final int[] array5 = new int[500];
        for (int n2 = 0; n2 < j2; ++n2) {
            final int j3 = m.j();
            final e e = new e();
            uwotm8.e.g.put(new Integer((n << 16) + j3), e);
            e.a = a;
            final int e2 = m.e();
            int n3 = -1;
            int b3 = 0;
            for (int n4 = 0; n4 < e2; ++n4) {
                final int e3;
                if ((e3 = i2.e()) > 0) {
                    if (a.a[n4] != 0) {
                        for (int n5 = n4 - 1; n5 > n3; --n5) {
                            if (a.a[n5] == 0) {
                                array2[b3] = n5;
                                array3[b3] = 0;
                                array5[b3] = (array4[b3] = 0);
                                ++b3;
                                break;
                            }
                        }
                    }
                    array2[b3] = n4;
                    int n6 = 0;
                    if (a.a[n4] == 3) {
                        n6 = 128;
                    }
                    if ((e3 & 0x1) != 0x0) {
                        array3[b3] = i3.p();
                    }
                    else {
                        array3[b3] = n6;
                    }
                    if ((e3 & 0x2) != 0x0) {
                        array4[b3] = i3.p();
                    }
                    else {
                        array4[b3] = n6;
                    }
                    if ((e3 & 0x4) != 0x0) {
                        array5[b3] = i3.p();
                    }
                    else {
                        array5[b3] = n6;
                    }
                    n3 = n4;
                    ++b3;
                }
            }
            e.b = b3;
            e.c = new int[b3];
            e.d = new int[b3];
            e.e = new int[b3];
            e.f = new int[b3];
            for (int n7 = 0; n7 < b3; ++n7) {
                e.c[n7] = array2[n7];
                e.d[n7] = array3[n7];
                e.e[n7] = array4[n7];
                e.f[n7] = array5[n7];
            }
        }
    }
    
    public static void a() {
    	uwotm8.e.g = null;
    }
    
    public static e a(final int n) {
        try {
            final int n2 = n >> 16;
            final e e;
            if ((e = (uwotm8.e) uwotm8.e.g.get(n)) == null) {
                Client.k.E.a(1, n2);
                return null;
            }
            return e;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static boolean b(final int n) {
        return n == -1;
    }
}

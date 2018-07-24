package uwotm8;

import java.util.*;
import java.util.zip.*;
import java.io.*;

public final class aB_1
{
    private static Map a;
    
    static {
        aB_1.a = new HashMap();
    }
    
    public static void a() {
        try {
            final I_1 i = new I_1(G_1.a(String.valueOf(al.a()) + "sprites.idx"));
            final I_1 j = new I_1(G_1.a(String.valueOf(al.a()) + "sprites.dat"));
            final DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(i.a)));
            final DataInputStream dataInputStream2 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(j.a)));
            for (int int1 = dataInputStream.readInt(), k = 0; k < int1; ++k) {
                a(dataInputStream, dataInputStream2, null);
            }
            dataInputStream.close();
            dataInputStream2.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void a(final DataInputStream dataInputStream, final DataInputStream dataInputStream2, final aA_1 aa) throws IOException {
        final String utf = dataInputStream.readUTF();
        aA_1 aa3;
        aA_1 aa2;
        if (aa == null) {
            aa2 = (aa3 = new aA_1(utf));
        }
        else {
            final String s = utf;
            if (!aa.a()) {
                if (!aa.a.containsKey(s)) {
                    aa.a.put(s, new aA_1(s, aa));
                }
                aa2 = (aa3 = (aA_1)aa.a.get(s));
            }
            else {
                aa2 = (aa3 = null);
            }
        }
        final aA_1 aa4 = aa3;
        aa2.a(dataInputStream, dataInputStream2);
        if (aa == null && !aa4.a()) {
            for (int int1 = dataInputStream.readInt(), i = 0; i < int1; ++i) {
                a(dataInputStream, dataInputStream2, aa4);
            }
            if (!aB_1.a.containsKey(utf)) {
            	aB_1.a.put(utf, aa4);
            }
        }
    }
    
    private static aA_1 a(final String s) {
        if (aB_1.a.containsKey(s)) {
            return (aA_1) aB_1.a.get(s);
        }
        return null;
    }
    
    public static Sprite a(final String s, final int n) {
        final aA_1 a;
        if ((a = a(s)) != null) {
            return a.a(n);
        }
        return null;
    }
    
    public static Sprite a(String s, String s2, final int n) {
    	aA_1 var3;
        aA_1 var10000 = (var3 = a(s)) != null ? (var3.a.containsKey(s2) ? (aA_1)var3.a.get(s2) : null) : null;
        var3 = var10000;
        return var10000 != null ? var3.a(n) : null;
    }
}

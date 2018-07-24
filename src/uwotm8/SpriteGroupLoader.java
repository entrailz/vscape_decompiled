package uwotm8;

import java.util.*;
import java.util.zip.*;
import java.io.*;

public final class SpriteGroupLoader
{
    private static Map a;
    
    static {
        SpriteGroupLoader.a = new HashMap();
    }
    
    public static void a() {
        try {
            final Buffer i = new Buffer(Archive.a(String.valueOf(SignLink.getLocalCacheDirectory()) + "sprites.idx"));
            final Buffer j = new Buffer(Archive.a(String.valueOf(SignLink.getLocalCacheDirectory()) + "sprites.dat"));
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
    
    private static void a(final DataInputStream dataInputStream, final DataInputStream dataInputStream2, final SpriteGroup aa) throws IOException {
        final String utf = dataInputStream.readUTF();
        SpriteGroup aa3;
        SpriteGroup aa2;
        if (aa == null) {
            aa2 = (aa3 = new SpriteGroup(utf));
        }
        else {
            final String s = utf;
            if (!aa.a()) {
                if (!aa.a.containsKey(s)) {
                    aa.a.put(s, new SpriteGroup(s, aa));
                }
                aa2 = (aa3 = (SpriteGroup)aa.a.get(s));
            }
            else {
                aa2 = (aa3 = null);
            }
        }
        final SpriteGroup aa4 = aa3;
        aa2.a(dataInputStream, dataInputStream2);
        if (aa == null && !aa4.a()) {
            for (int int1 = dataInputStream.readInt(), i = 0; i < int1; ++i) {
                a(dataInputStream, dataInputStream2, aa4);
            }
            if (!SpriteGroupLoader.a.containsKey(utf)) {
            	SpriteGroupLoader.a.put(utf, aa4);
            }
        }
    }
    
    private static SpriteGroup a(final String s) {
        if (SpriteGroupLoader.a.containsKey(s)) {
            return (SpriteGroup) SpriteGroupLoader.a.get(s);
        }
        return null;
    }
    
    public static Sprite a(final String s, final int n) {
        final SpriteGroup a;
        if ((a = a(s)) != null) {
            return a.a(n);
        }
        return null;
    }
    
    public static Sprite a(String s, String s2, final int n) {
    	SpriteGroup var3;
        SpriteGroup var10000 = (var3 = a(s)) != null ? (var3.a.containsKey(s2) ? (SpriteGroup)var3.a.get(s2) : null) : null;
        var3 = var10000;
        return var10000 != null ? var3.a(n) : null;
    }
}

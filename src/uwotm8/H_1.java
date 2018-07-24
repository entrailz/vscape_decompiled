package uwotm8;

import java.util.zip.*;
import java.io.*;

public final class H_1
{
    private static byte[] a;
    
    static {
    	H_1.a = new byte[465000];
    }
    
    public static final byte[] a(byte[] array) {
        if (array == null) {
            return null;
        }
        int i = 0;
        Label_0074: {
            try {
                final GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(array));
                while (i != H_1.a.length) {
                    final GZIPInputStream gzipInputStream2 = gzipInputStream;
                    final int n = i;
                    final byte[] a = H_1.a;
                    final int read;
                    if ((read = gzipInputStream2.read(a, n, a.length - i)) == -1) {
                        break Label_0074;
                    }
                    i += read;
                }
                throw new RuntimeException("buffer overflow!");
            }
            catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }
        array = new byte[i];
        System.arraycopy(H_1.a, 0, array, 0, i);
        return array;
    }
}

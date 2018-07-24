package uwotm8;

import java.io.*;

public final class c
{
    private static final byte[] a;
    private final RandomAccessFile b;
    private final RandomAccessFile c;
    private final int d;
    
    static {
        a = new byte[520];
    }
    
    public c(final RandomAccessFile b, final RandomAccessFile c, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final synchronized byte[] a(final int n) {
        try {
            this.a(this.c, n * 6);
            int read;
            for (int i = 0; i < 6; i += read) {
                if ((read = this.c.read(uwotm8.c.a, i, 6 - i)) == -1) {
                    return null;
                }
            }
            final int n2 = ((uwotm8.c.a[0] & 0xFF) << 16) + ((uwotm8.c.a[1] & 0xFF) << 8) + (uwotm8.c.a[2] & 0xFF);
            int n3;
            if ((n3 = ((uwotm8.c.a[3] & 0xFF) << 16) + ((uwotm8.c.a[4] & 0xFF) << 8) + (uwotm8.c.a[5] & 0xFF)) <= 0 || n3 > this.b.length() / 520L) {
                return null;
            }
            final byte[] array = new byte[n2];
            int j = 0;
            int n4 = 0;
            while (j < n2) {
                if (n3 == 0) {
                    return null;
                }
                this.a(this.b, n3 * 520);
                int k = 0;
                int n5;
                if ((n5 = n2 - j) > 512) {
                    n5 = 512;
                }
                while (k < n5 + 8) {
                    final int read2;
                    if ((read2 = this.b.read(uwotm8.c.a, k, n5 + 8 - k)) == -1) {
                        return null;
                    }
                    k += read2;
                }
                final int n6 = ((uwotm8.c.a[0] & 0xFF) << 8) + (uwotm8.c.a[1] & 0xFF);
                final int n7 = ((uwotm8.c.a[2] & 0xFF) << 8) + (uwotm8.c.a[3] & 0xFF);
                final int n8 = ((uwotm8.c.a[4] & 0xFF) << 16) + ((uwotm8.c.a[5] & 0xFF) << 8) + (uwotm8.c.a[6] & 0xFF);
                final int n9 = uwotm8.c.a[7] & 0xFF;
                if (n6 != n || n7 != n4 || n9 != this.d) {
                    return null;
                }
                if (n8 < 0 || n8 > this.b.length() / 520L) {
                    return null;
                }
                for (int l = 0; l < n5; ++l) {
                    array[j++] = uwotm8.c.a[l + 8];
                }
                n3 = n8;
                ++n4;
            }
            return array;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public final synchronized boolean a(final int n, final byte[] array, final int n2) {
        boolean b;
        if (!(b = this.a(true, n2, n, array))) {
            b = this.a(false, n2, n, array);
        }
        return b;
    }
    
    private synchronized boolean a(boolean b, final int n, final int n2, final byte[] array) {
        try {
            int n3;
            if (b) {
                this.a(this.c, n * 6);
                int read;
                for (int i = 0; i < 6; i += read) {
                    if ((read = this.c.read(uwotm8.c.a, i, 6 - i)) == -1) {
                        return false;
                    }
                }
                if ((n3 = ((uwotm8.c.a[3] & 0xFF) << 16) + ((uwotm8.c.a[4] & 0xFF) << 8) + (uwotm8.c.a[5] & 0xFF)) <= 0 || n3 > this.b.length() / 520L) {
                    return false;
                }
            }
            else if ((n3 = (int)((this.b.length() + 519L) / 520L)) == 0) {
                n3 = 1;
            }
            uwotm8.c.a[0] = (byte)(n2 >> 16);
            uwotm8.c.a[1] = (byte)(n2 >> 8);
            uwotm8.c.a[2] = (byte)n2;
            uwotm8.c.a[3] = (byte)(n3 >> 16);
            uwotm8.c.a[4] = (byte)(n3 >> 8);
            uwotm8.c.a[5] = (byte)n3;
            this.a(this.c, n * 6);
            this.c.write(uwotm8.c.a, 0, 6);
            int n5;
            int n10;
            for (int j = 0, n4 = 0; j < n2; j += n10, n3 = n5, ++n4) {
                n5 = 0;
                if (b) {
                    this.a(this.b, n3 * 520);
                    int n6;
                    int read2;
                    for (n6 = 0; n6 < 8 && (read2 = this.b.read(uwotm8.c.a, n6, 8 - n6)) != -1; n6 += read2) {}
                    if (n6 == 8) {
                        final int n7 = ((uwotm8.c.a[0] & 0xFF) << 8) + (uwotm8.c.a[1] & 0xFF);
                        final int n8 = ((uwotm8.c.a[2] & 0xFF) << 8) + (uwotm8.c.a[3] & 0xFF);
                        n5 = ((uwotm8.c.a[4] & 0xFF) << 16) + ((uwotm8.c.a[5] & 0xFF) << 8) + (uwotm8.c.a[6] & 0xFF);
                        final int n9 = uwotm8.c.a[7] & 0xFF;
                        if (n7 != n || n8 != n4 || n9 != this.d) {
                            return false;
                        }
                        if (n5 < 0 || n5 > this.b.length() / 520L) {
                            return false;
                        }
                    }
                }
                if (n5 == 0) {
                    b = false;
                    if ((n5 = (int)((this.b.length() + 519L) / 520L)) == 0) {
                        ++n5;
                    }
                    if (n5 == n3) {
                        ++n5;
                    }
                }
                if (n2 - j <= 512) {
                    n5 = 0;
                }
                uwotm8.c.a[0] = (byte)(n >> 8);
                uwotm8.c.a[1] = (byte)n;
                uwotm8.c.a[2] = (byte)(n4 >> 8);
                uwotm8.c.a[3] = (byte)n4;
                uwotm8.c.a[4] = (byte)(n5 >> 16);
                uwotm8.c.a[5] = (byte)(n5 >> 8);
                uwotm8.c.a[6] = (byte)n5;
                uwotm8.c.a[7] = (byte)this.d;
                this.a(this.b, n3 * 520);
                this.b.write(uwotm8.c.a, 0, 8);
                if ((n10 = n2 - j) > 512) {
                    n10 = 512;
                }
                this.b.write(array, j, n10);
            }
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    private synchronized void a(final RandomAccessFile randomAccessFile, final int n) {
        try {
            randomAccessFile.seek(n);
        }
        catch (Exception ex) {}
    }
}

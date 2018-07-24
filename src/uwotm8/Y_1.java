package uwotm8;

import java.nio.*;

public final class Y_1
{
    public static Y_1[] a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    private int m;
    private boolean n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    private int u;
    private int v;
    public int l;
    
    private Y_1() {
        this.b = -1;
        this.d = true;
    }
    
    public static void a(final G_1 g) {
        final ByteBuffer wrap;
        final short short1;
        Y_1.a = new Y_1[short1 = (wrap = ByteBuffer.wrap(g.b("flo2.dat"))).getShort()];
        for (short n = 0; n < short1; ++n) {
            if (Y_1.a[n] == null) {
            	Y_1.a[n] = new Y_1();
            }
            final Y_1 y = Y_1.a[n];
            final ByteBuffer byteBuffer = wrap;
            final Y_1 y2 = y;
            byte value;
            while ((value = byteBuffer.get()) != 0) {
                if (value == 1) {
                    y2.c = ((byteBuffer.get() & 0xFF) << 16) + ((byteBuffer.get() & 0xFF) << 8) + (byteBuffer.get() & 0xFF);
                }
                else if (value == 2) {
                    y2.b = (byteBuffer.get() & 0xFF);
                }
                else if (value == 3) {
                    y2.b = (byteBuffer.getShort() & 0xFFFF);
                    if (y2.b != 65535) {
                        continue;
                    }
                    y2.b = -1;
                }
                else {
                    if (value == 4) {
                        continue;
                    }
                    if (value == 5) {
                        y2.d = false;
                    }
                    else {
                        if (value == 6) {
                            continue;
                        }
                        if (value == 7) {
                            y2.e = ((byteBuffer.get() & 0xFF) << 16) + ((byteBuffer.get() & 0xFF) << 8) + (byteBuffer.get() & 0xFF);
                        }
                        else {
                            if (value == 8) {
                                continue;
                            }
                            if (value == 9) {
                                y2.m = (byteBuffer.getShort() & 0xFFFF);
                            }
                            else if (value == 10) {
                                y2.n = false;
                            }
                            else if (value == 11) {
                                y2.o = (byteBuffer.get() & 0xFF);
                            }
                            else if (value == 12) {
                                y2.p = true;
                            }
                            else if (value == 13) {
                                y2.q = ((byteBuffer.get() & 0xFF) << 16) + ((byteBuffer.get() & 0xFF) << 8) + (byteBuffer.get() & 0xFF);
                            }
                            else if (value == 14) {
                                y2.r = (byteBuffer.get() & 0xFF);
                            }
                            else if (value == 15) {
                                y2.s = (byteBuffer.getShort() & 0xFFFF);
                                if (y2.s != 65535) {
                                    continue;
                                }
                                y2.s = -1;
                            }
                            else if (value == 16) {
                                y2.t = (byteBuffer.get() & 0xFF);
                            }
                            else {
                                System.out.println("Error unrecognised config code: ".concat(String.valueOf(value)));
                            }
                        }
                    }
                }
            }
            final Y_1 y3;
            if ((y3 = Y_1.a[n]).e != -1) {
                final Y_1 y4 = y3;
                y4.a(y4.e);
                final Y_1 y5 = y3;
                y5.i = y5.f;
                final Y_1 y6 = y3;
                y6.j = y6.g;
                final Y_1 y7 = y3;
                y7.k = y7.h;
            }
            final Y_1 y8 = y3;
            y8.a(y8.c);
        }
    }
    
    private void a(final int n) {
        final double n2 = (n >> 16 & 0xFF) / 256.0;
        final double n3 = (n >> 8 & 0xFF) / 256.0;
        final double n4 = (n & 0xFF) / 256.0;
        double n5 = n2;
        if (n3 < n5) {
            n5 = n3;
        }
        if (n4 < n5) {
            n5 = n4;
        }
        double n6 = n2;
        if (n3 > n6) {
            n6 = n3;
        }
        if (n4 > n6) {
            n6 = n4;
        }
        double n7 = 0.0;
        double n8 = 0.0;
        final double n9 = (n5 + n6) / 2.0;
        if (n5 != n6) {
            if (n9 < 0.5) {
                n8 = (n6 - n5) / (n6 + n5);
            }
            if (n9 >= 0.5) {
                n8 = (n6 - n5) / (2.0 - n6 - n5);
            }
            if (n2 == n6) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n3 == n6) {
                n7 = 2.0 + (n4 - n2) / (n6 - n5);
            }
            else if (n4 == n6) {
                n7 = 4.0 + (n2 - n3) / (n6 - n5);
            }
        }
        final double n10 = n7 / 6.0;
        this.f = (int)(n10 * 256.0);
        this.g = (int)(n8 * 256.0);
        this.h = (int)(n9 * 256.0);
        if (this.g < 0) {
            this.g = 0;
        }
        else if (this.g > 255) {
            this.g = 255;
        }
        if (this.h < 0) {
            this.h = 0;
        }
        else if (this.h > 255) {
            this.h = 255;
        }
        if (n9 > 0.5) {
            this.v = (int)((1.0 - n9) * n8 * 512.0);
        }
        else {
            this.v = (int)(n9 * n8 * 512.0);
        }
        if (this.v <= 0) {
            this.v = 1;
        }
        this.u = (int)(n10 * this.v);
        this.l = a(this.f, this.g, this.h);
    }
    
    private static int a(int n, int n2, final int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return n = (n / 4 << 10) + (n2 / 32 << 7) + n3 / 2;
    }
}

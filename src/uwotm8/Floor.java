package uwotm8;

public final class Floor
{
    public static Floor[] a;
    private int f;
    private int g;
    private boolean h;
    private int i;
    public int b;
    public int c;
    public int d;
    public int e;
    private int j;
    
    public static void init(final Archive g) {
        final Buffer i;
        final int g2 = (i = new Buffer(g.getEntry("flo.dat"))).g();
        if (Floor.a == null) {
        	Floor.a = new Floor[g2];
        }
        for (int j = 0; j < g2; ++j) {
            if (Floor.a[j] == null) {
            	Floor.a[j] = new Floor();
            }
            final Floor x = Floor.a[j];
            final Buffer k = i;
            final Floor x2 = x;
            int e;
            while ((e = k.e()) != 0) {
                if (e == 1) {
                    x2.f = k.i();
                    final Floor x3 = x2;
                    x3.blend(x3.f);
                }
                else if (e == 2) {
                    x2.g = k.e();
                }
                else {
                    if (e == 3) {
                        continue;
                    }
                    if (e == 5) {
                        x2.h = false;
                    }
                    else if (e == 6) {
                        k.l();
                    }
                    else if (e == 7) {
                        final int l = x2.i;
                        final int b = x2.b;
                        final int c = x2.c;
                        final int d = x2.d;
                        x2.blend(k.i());
                        x2.i = l;
                        x2.b = b;
                        x2.c = c;
                        x2.d = d;
                        x2.e = d;
                    }
                    else {
                        System.out.println("Error unrecognised config code: ".concat(String.valueOf(e)));
                    }
                }
            }
        }
    }
    
    private void blend(int n) {
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
        this.i = (int)(n10 * 256.0);
        this.b = (int)(n8 * 256.0);
        this.c = (int)(n9 * 256.0);
        if (this.b < 0) {
            this.b = 0;
        }
        else if (this.b > 255) {
            this.b = 255;
        }
        if (this.c < 0) {
            this.c = 0;
        }
        else if (this.c > 255) {
            this.c = 255;
        }
        if (n9 > 0.5) {
            this.e = (int)((1.0 - n9) * n8 * 512.0);
        }
        else {
            this.e = (int)(n9 * n8 * 512.0);
        }
        if (this.e <= 0) {
            this.e = 1;
        }
        this.d = (int)(n10 * this.e);
        if ((n = this.i + (int)(Math.random() * 16.0) - 8) < 0) {
            n = 0;
        }
        else if (n > 255) {
            n = 255;
        }
        int n11;
        if ((n11 = this.b + (int)(Math.random() * 48.0) - 24) < 0) {
            n11 = 0;
        }
        else if (n11 > 255) {
            n11 = 255;
        }
        int n12;
        if ((n12 = this.c + (int)(Math.random() * 48.0) - 24) < 0) {
            n12 = 0;
        }
        else if (n12 > 255) {
            n12 = 255;
        }
        this.j = a(n, n11, n12);
    }
    
    private static int a(final int n, int n2, final int n3) {
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
        return (n / 4 << 10) + (n2 / 32 << 7) + n3 / 2;
    }
    
    private Floor() {
        this.g = -1;
        this.h = true;
    }
}

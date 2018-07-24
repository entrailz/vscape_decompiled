package uwotm8;

import com.runescape.*;

public final class m
{
    public static m[][] a;
    private static Archive am;
    private static o[] an;
    private static RSFont[] ao;
    private static final Cache ap;
    private static final Cache aq;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int[] p;
    public int[] q;
    public int[][] r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int[] w;
    public int[] x;
    public boolean y;
    public boolean z;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int[] G;
    public int[] H;
    public Sprite[] I;
    public String[] J;
    public boolean K;
    public int L;
    private int ar;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public String R;
    public String S;
    public int T;
    public int U;
    public int V;
    public int W;
    private int as;
    public Sprite X;
    public Sprite Y;
    private boolean at;
    private boolean au;
    public int Z;
    public int aa;
    private int av;
    private int aw;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public int af;
    public String ag;
    public String ah;
    public int ai;
    public String aj;
    public int ak;
    public int al;
    private String[] ax;
    private String ay;
    private String az;
    
    static {
        ap = new Cache(200);
        aq = new Cache(50);
    }
    
    public static void a(Archive g, final Index c, Archive g2, o[] g3, RSFont[] g4) {
    	 am = g2;
         an = g3;
         ao = g4;
         Buffer var15;
         a = new m[(var15 = new Buffer(g.getEntry("interface.idx"))).g()][];

         for(int var16 = 0; var16 < a.length; ++var16) {
            int var17 = var15.g();
            byte[] var5;
            int var18;
            if ((var18 = var15.g()) > 0 && (var5 = uwotm8.H_1.a(c.decompress(var17))) != null) {
               int var6 = 0;
               int[] var7 = new int[var18];

               for(int var8 = 0; var8 < var18; ++var8) {
                  var7[var8] = var6;
                  var6 += var15.g();
               }

               Buffer var21 = new Buffer(var5);
               a[var16] = new m[var18];

               for(int var19 = 0; var19 < var18; ++var19) {
                  var21.b = var7[var19];
                  a[var16][var19] = new m();
                  a[var16][var19].l = var17;
                  a[var16][var19].o = (var17 << 16) + var19;
                  m var10000 = a[var16][var19];
                  Buffer var9 = var21;
                  m var20 = var10000;

                  try {
                     var20.b = var9.e();
                     var20.c = var9.e();
                     var20.d = var9.g();
                     var20.e = var9.h();
                     var20.f = var9.h();
                     var20.g = var9.g();
                     var20.h = var9.g();
                     var20.k = (byte)var9.e();
                     var20.m = var9.g();
                     if (var20.m == 65535) {
                        var20.m = -1;
                     } else {
                        var20.m += -65536 & var20.o;
                     }

                     var20.n = var9.g();
                     if (var20.n == 65535) {
                        var20.n = -1;
                     }

                     int var10;
                     int var11;
                     if ((var10 = var9.e()) > 0) {
                        var20.p = new int[var10];
                        var20.q = new int[var10];

                        for(var11 = 0; var11 < var10; ++var11) {
                           var20.p[var11] = var9.e();
                           var20.q[var11] = var9.g();
                        }
                     }

                     int var12;
                     if ((var11 = var9.e()) > 0) {
                        var20.r = new int[var11][];

                        for(var10 = 0; var10 < var11; ++var10) {
                           var12 = var9.g();
                           var20.r[var10] = new int[var12];

                           for(int var13 = 0; var13 < var12; ++var13) {
                              var20.r[var10][var13] = var9.j();
                              if (var20.r[var10][var13] == 65535) {
                                 var20.r[var10][var13] = -1;
                              }
                           }
                        }
                     }

                     if (var20.b == 0) {
                        var20.s = var9.g();
                        var20.u = var9.e() == 1;
                        var20.v = var9.e() == 1;
                     }

                     if (var20.b == 1) {
                        var9.g();
                        var9.e();
                     }

                     String var22;
                     if (var20.b == 2) {
                        var20.w = new int[var20.g * var20.h];
                        var20.x = new int[var20.g * var20.h];
                        var20.y = var9.e() == 1;
                        var20.z = var9.e() == 1;
                        var20.A = var9.e() == 1;
                        var20.B = var9.e() == 1;
                        var20.C = var9.e() == 1;
                        var20.D = var9.e() == 1;
                        var20.E = var9.e();
                        var20.F = var9.e();
                        var20.G = new int[20];
                        var20.H = new int[20];
                        var20.I = new Sprite[20];
                        var20.ax = new String[20];

                        for(var10 = 0; var10 < 20; ++var10) {
                           if (var9.e() == 1) {
                              var20.G[var10] = var9.h();
                              var20.H[var10] = var9.h();
                              String var24 = var9.l();
                              var20.ax[var10] = var24;
                              if (am != null && var24.length() > 0) {
                                 var11 = var24.lastIndexOf(",");
                                 var20.I[var10] = a(Integer.parseInt(var24.substring(var11 + 1)), am, var24.substring(0, var11));
                              }
                           }
                        }

                        var20.J = new String[5];

                        for(var10 = 0; var10 < 5; ++var10) {
                           if ((var22 = var9.l()).length() > 0) {
                              var20.J[var10] = var22;
                           } else {
                              var20.J[var10] = null;
                           }
                        }
                     }

                     if (var20.b == 3) {
                        var20.K = var9.e() == 1;
                     }

                     if (var20.b == 4 || var20.b == 1) {
                        var20.L = var9.e();
                        var20.ar = var9.g();
                        if (var20.L == 0) {
                           var20.M = var9.e() == 1;
                        } else if (var20.L == 1) {
                           var20.O = var9.e();
                           var20.P = var9.e();
                           var20.Q = var9.e();
                        }

                        var20.N = var9.e() == 1;
                     }

                     if (var20.b == 4) {
                        var20.R = var9.l();
                        var20.S = var9.l();
                     }

                     if (var20.b == 1 || var20.b == 3 || var20.b == 4) {
                        var20.T = var9.j();
                     }

                     if (var20.b == 3 || var20.b == 4) {
                        var20.U = var9.j();
                        var20.V = var9.j();
                        var20.W = var9.j();
                     }

                     if (var20.b == 5) {
                        var20.as = var9.e();
                        String var23;
                        if (var20.as == 0) {
                           var23 = var9.l();
                           var20.ay = var23;
                           if (am != null && var23.length() > 0) {
                              var12 = var23.lastIndexOf(",");
                              var20.X = a(Integer.parseInt(var23.substring(var12 + 1)), am, var23.substring(0, var12));
                           }

                           var23 = var9.l();
                           var20.az = var23;
                           if (am != null && var23.length() > 0) {
                              var12 = var23.lastIndexOf(",");
                              var20.Y = a(Integer.parseInt(var23.substring(var12 + 1)), am, var23.substring(0, var12));
                           }
                        } else {
                           var23 = var9.l();
                           var20.ay = var23;
                           String var10001;
                           if (var23.length() > 0) {
                              var12 = var23.lastIndexOf(",");
                              var10001 = var23.substring(0, var12);
                              var11 = Integer.parseInt(var23.substring(var12 + 1));
                              var20.X = SpriteGroupLoader.a(var10001, var11);
                           }

                           var23 = var9.l();
                           var20.az = var23;
                           if (am != null && var23.length() > 0) {
                              var12 = var23.lastIndexOf(",");
                              var10001 = var23.substring(0, var12);
                              var11 = Integer.parseInt(var23.substring(var12 + 1));
                              var20.Y = SpriteGroupLoader.a(var10001, var11);
                           }
                        }

                        var20.at = var9.e() == 1;
                        var20.au = var9.e() == 1;
                     }

                     if (var20.b == 6) {
                        var20.Z = 1;
                        var20.aa = var9.g();
                        if (var20.aa == 65535) {
                           var20.aa = -1;
                        }

                        var20.av = 1;
                        var20.aw = var9.g();
                        if (var20.aw == 65535) {
                           var20.aw = -1;
                        }

                        var20.ab = var9.g();
                        if (var20.ab == 65535) {
                           var20.ab = -1;
                        }

                        var20.ac = var9.g();
                        if (var20.ac == 65535) {
                           var20.ac = -1;
                        }

                        var20.ad = var9.g();
                        var20.ae = var9.g();
                        var20.af = var9.g();
                     }

                     if (var20.b == 7) {
                        var20.w = new int[var20.h * var20.g];
                        var20.x = new int[var20.h * var20.g];
                        var20.L = var9.e();
                        var20.ar = var9.g();
                        if (var20.L == 0) {
                           var20.M = var9.e() == 1;
                        } else if (var20.L == 1) {
                           var20.O = var9.e();
                           var20.P = var9.e();
                           var20.Q = var9.e();
                        }

                        var20.N = var9.e() == 1;
                        var20.T = var9.j();
                        var20.E = var9.g();
                        var20.F = var9.g();
                        var20.z = var9.e() == 1;
                        var20.J = new String[5];

                        for(var10 = 0; var10 < 5; ++var10) {
                           if ((var22 = var9.l()).length() > 0) {
                              var20.J[var10] = var22;
                           } else {
                              var20.J[var10] = null;
                           }
                        }
                     }

                     if (var20.b == 8) {
                        var20.R = var9.l();
                        var20.S = var9.l();
                     }

                     if (var20.c == 2 || var20.b == 2) {
                        var20.ag = var9.l();
                        var20.ah = var9.l();
                        var20.ai = var9.g();
                     }

                     if (var20.c == 1 || var20.c == 4 || var20.c == 5 || var20.c == 6) {
                        var20.aj = var9.l();
                        if (var20.aj.length() == 0) {
                           if (var20.c == 1) {
                              var20.aj = "Ok";
                           }

                           if (var20.c == 4) {
                              var20.aj = "Select";
                           }

                           if (var20.c == 5) {
                              var20.aj = "Select";
                           }

                           if (var20.c == 6) {
                              var20.aj = "Continue";
                           }
                        }
                     }
                  } catch (Exception var14) {
                     var14.printStackTrace();
                  }
               }
            }
         }

    }
    
    private static Sprite a(final int n, final Archive g, final String s) {
        final long n2 = (uwotm8.StringUtils.hashSpriteName(s) << 8) + n;
        final Sprite n3;
        if ((n3 = (Sprite)uwotm8.m.ap.get(n2)) != null) {
            return n3;
        }
        Sprite n4;
        try {
            n4 = new Sprite(g, s, n);
            uwotm8.m.ap.put((CacheableNode)n4, n2);
        }
        catch (Exception ex) {
            return null;
        }
        return n4;
    }
    
    public static void a(final boolean b, final Model d) {
        if (b) {
            return;
        }
        uwotm8.m.aq.removeAll();
        if (d != null) {
        	uwotm8.m.aq.put((CacheableNode)d, 327680L);
        }
    }
    
    public final Model a(final int n, final int n2, final boolean b) {
        int n3;
        int n4;
        if (b) {
            n3 = this.av;
            n4 = this.aw;
        }
        else {
            n3 = this.Z;
            n4 = this.aa;
        }
        if (n3 == 0) {
            return null;
        }
        if (n3 == 1 && n4 == -1) {
            return null;
        }
        final int n5 = n3;
        final int n6 = n4;
        final int n7 = n5;
        CacheableNode n8;
        Model d;
        if (n6 == -1) {
            d = (Model)(n8 = null);
        }
        else {
            Model d2;
            if ((d2 = (Model)uwotm8.m.aq.get((long)((n7 << 16) + n6))) == null) {
                if (n7 == 1) {
                    d2 = uwotm8.Model.a(n6);
                }
                if (n7 == 2) {
                    d2 = uwotm8.ActorDefinition.lookup(n6).model();
                }
                if (n7 == 3) {
                    d2 = Client.L.getHeadModel();
                }
                if (n7 == 4) {
                    d2 = uwotm8.ItemDefinition.c(n6).asStack(50);
                }
                if (n7 == 5) {
                    d2 = null;
                }
                if (d2 != null) {
                    uwotm8.m.aq.put((CacheableNode)d2, (long)((n7 << 16) + n6));
                }
            }
            d = (Model)(n8 = (CacheableNode)d2);
        }
        final Model d3 = (Model)n8;
        if (d == null) {
            return null;
        }
        if (n2 == -1 && n == -1 && d3.k == null) {
            return d3;
        }
        final Model d4 = new Model(true, uwotm8.Frame.isValid(n2) & uwotm8.Frame.isValid(n), false, d3);
        if (n2 != -1 || n != -1) {
            d4.d();
        }
        if (n2 != -1) {
            d4.c(n2);
        }
        if (n != -1) {
            d4.c(n);
        }
        d4.a(64, 768, -50, -10, -50, true);
        return d4;
    }
    
    public final Rasterizer2D a() {
        if (this.L == 1) {
            return (Rasterizer2D)uwotm8.m.ao[this.ar];
        }
        return (Rasterizer2D)uwotm8.m.an[this.ar];
    }
    
    public static m a(int n) {
        final int n2 = n >> 16;
        n &= 0xFFFF;
        if (n2 < 0 || n2 >= uwotm8.m.a.length || uwotm8.m.a[n2] == null || n >= uwotm8.m.a[n2].length || uwotm8.m.a[n2][n] == null) {
            return null;
        }
        return uwotm8.m.a[n2][n];
    }
    
    public static m a(final int n, final int n2) {
        if (n < 0 || n >= uwotm8.m.a.length || uwotm8.m.a[n] == null || n2 >= uwotm8.m.a[n].length || uwotm8.m.a[n][n2] == null) {
            return null;
        }
        return uwotm8.m.a[n][n2];
    }
    
    public final void b(final int n, final int n2) {
        final int n3 = this.w[n];
        final int[] w = this.w;
        w[n] = w[n2];
        this.w[n2] = n3;
        final int n4 = this.x[n];
        final int[] x = this.x;
        x[n] = x[n2];
        this.x[n2] = n4;
    }
    
    public m() {
        this.m = -1;
        this.n = -1;
        this.m = -1;
        this.n = -1;
        this.aa = -1;
        this.aw = -1;
        this.ab = -1;
        this.ac = -1;
        this.D = true;
    }
}

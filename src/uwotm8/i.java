package uwotm8;

public final class i {
   private byte y;
   public int a;
   public int[] b;
   public int c = -1;
   public static J_1 d = new J_1(100);
   public static J_1 e = new J_1(50);
   public int[] f;
   public boolean g;
   private int z;
   public int h;
   private int A;
   private int B;
   public int i;
   private int C;
   public String[] j;
   private int D;
   public String k;
   private static i[] E;
   public int l;
   private int F;
   public int m;
   public boolean n;
   public byte[] o;
   private int G;
   private static int H;
   public int p;
   public static boolean q = true;
   private static I_1 I;
   private int J;
   private int K;
   private int L;
   public String[] r;
   public String[] s;
   public int t;
   private int M;
   private int N;
   private int[] O;
   private int P;
   private static int[] Q;
   private int R;
   public int u;
   public int v;
   private int S;
   private int[] T;
   public int w;
   public static int x;
   private int U;
   private byte V;

   public static void a() {
      e = null;
      d = null;
      Q = null;
      E = null;
      I = null;
   }

   public static void a(G_1 var0) {
      I = new I_1(var0.b("obj.dat"));
      I_1 var3;
      Q = new int[(x = (var3 = new I_1(var0.b("obj.idx"))).g()) + 100];
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < x; ++var2) {
         Q[var2] = var1;
         var1 += var3.g();
      }

      E = new i[10];

      for(var2 = 0; var2 < 10; ++var2) {
         E[var2] = new i();
      }

   }

   public final boolean a(int var1) {
      int var2 = this.B;
      int var3 = this.L;
      int var4 = this.K;
      if (var1 == 1) {
         var2 = this.S;
         var3 = this.A;
         var4 = this.z;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!uwotm8.D_1.b(var2)) {
            var5 = false;
         }

         if (var3 != -1 && !uwotm8.D_1.b(var3)) {
            var5 = false;
         }

         if (var4 != -1 && !uwotm8.D_1.b(var4)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final D_1 b(int var1) {
      int var2 = this.B;
      int var3 = this.L;
      int var4 = this.K;
      if (var1 == 1) {
         var2 = this.S;
         var3 = this.A;
         var4 = this.z;
      }

      if (var2 == -1) {
         return null;
      } else {
         D_1 var5 = uwotm8.D_1.a(var2);
         if (var3 != -1) {
            D_1 var7;
            if (var4 != -1) {
               var7 = uwotm8.D_1.a(var3);
               D_1 var8 = uwotm8.D_1.a(var4);
               D_1[] var6 = new D_1[]{var5, var7, var8};
               var5 = new D_1(3, var6);
            } else {
               var7 = uwotm8.D_1.a(var3);
               D_1[] var9 = new D_1[]{var5, var7};
               var5 = new D_1(2, var9);
            }
         }

         if (var1 == 0 && this.V != 0) {
            var5.a(0, this.V, 0);
         }

         if (var1 == 1 && this.y != 0) {
            var5.a(0, this.y, 0);
         }

         if (this.f != null) {
            for(var3 = 0; var3 < this.f.length; ++var3) {
               var5.a(this.f[var3], this.b[var3]);
            }
         }

         return var5;
      }
   }

   public static i c(int var0) {
      for(int var1 = 0; var1 < 10; ++var1) {
         if (E[var1].c == var0) {
            return E[var1];
         }
      }

      H = (H + 1) % 10;
      i var7 = E[H];
      I.b = Q[var0];
      var7.c = var0;
      var7.F = 0;
      var7.k = null;
      var7.o = null;
      var7.f = null;
      var7.b = null;
      var7.p = 2000;
      var7.t = 0;
      var7.v = 0;
      var7.U = 0;
      var7.D = 0;
      var7.P = 0;
      var7.n = false;
      var7.a = 1;
      var7.g = false;
      var7.j = null;
      var7.r = null;
      var7.s = null;
      var7.B = -1;
      var7.L = -1;
      var7.V = 0;
      var7.S = -1;
      var7.A = -1;
      var7.y = 0;
      var7.K = -1;
      var7.z = -1;
      var7.m = -1;
      var7.i = -1;
      var7.u = -1;
      var7.l = -1;
      var7.O = null;
      var7.T = null;
      var7.G = -1;
      var7.h = -1;
      var7.C = 128;
      var7.N = 128;
      var7.M = 128;
      var7.R = 0;
      var7.J = 0;
      var7.w = 0;
      I_1 var2 = I;
      i var6 = var7;

      while(true) {
         int var3;
         while((var3 = var2.e()) != 0) {
            if (var3 == 1) {
               var6.F = var2.g();
            } else if (var3 == 2) {
               var6.k = var2.l();
            } else if (var3 == 3) {
               var6.o = var2.m();
            } else if (var3 == 4) {
               var6.p = var2.g();
            } else if (var3 == 5) {
               var6.t = var2.g();
            } else if (var3 == 6) {
               var6.v = var2.g();
            } else if (var3 == 7) {
               var6.D = var2.g();
               if (var6.D > 32767) {
                  var6.D -= 65536;
               }
            } else if (var3 == 8) {
               var6.P = var2.g();
               if (var6.P > 32767) {
                  var6.P -= 65536;
               }
            } else if (var3 == 10) {
               var2.g();
            } else if (var3 == 11) {
               var6.n = true;
            } else if (var3 == 12) {
               var6.a = var2.j();
            } else if (var3 == 16) {
               var6.g = true;
            } else if (var3 == 23) {
               var6.B = var2.g();
               var6.V = var2.f();
            } else if (var3 == 24) {
               var6.L = var2.g();
            } else if (var3 == 25) {
               var6.S = var2.g();
               var6.y = var2.f();
            } else if (var3 == 26) {
               var6.A = var2.g();
            } else if (var3 >= 30 && var3 < 35) {
               if (var6.j == null) {
                  var6.j = new String[5];
               }

               var6.j[var3 - 30] = var2.l();
               if (var6.j[var3 - 30].equalsIgnoreCase("hidden")) {
                  var6.j[var3 - 30] = null;
               }
            } else if (var3 >= 35 && var3 < 40) {
               if (var6.r == null) {
                  var6.r = new String[5];
               }

               var6.r[var3 - 35] = var2.l();
            } else if (var3 == 40) {
               int var4 = var2.e();
               var6.f = new int[var4];
               var6.b = new int[var4];

               for(int var5 = 0; var5 < var4; ++var5) {
                  var6.f[var5] = var2.g();
                  var6.b[var5] = var2.g();
               }
            } else if (var3 >= 45 && var3 < 50) {
               if (var6.s == null) {
                  var6.s = new String[5];
               }

               var6.s[var3 - 45] = var2.l();
            } else if (var3 == 78) {
               var6.K = var2.g();
            } else if (var3 == 79) {
               var6.z = var2.g();
            } else if (var3 == 90) {
               var6.m = var2.g();
            } else if (var3 == 91) {
               var6.u = var2.g();
            } else if (var3 == 92) {
               var6.i = var2.g();
            } else if (var3 == 93) {
               var6.l = var2.g();
            } else if (var3 == 95) {
               var6.U = var2.g();
            } else if (var3 == 97) {
               var6.G = var2.g();
            } else if (var3 == 98) {
               var6.h = var2.g();
            } else if (var3 >= 100 && var3 < 110) {
               if (var6.O == null) {
                  var6.O = new int[10];
                  var6.T = new int[10];
               }

               var6.O[var3 - 100] = var2.g();
               var6.T[var3 - 100] = var2.g();
            } else if (var3 == 110) {
               var6.C = var2.g();
            } else if (var3 == 111) {
               var6.N = var2.g();
            } else if (var3 == 112) {
               var6.M = var2.g();
            } else if (var3 == 113) {
               var6.R = var2.f();
            } else if (var3 == 114) {
               var6.J = var2.f() * 5;
            } else if (var3 == 115) {
               var6.w = var2.e();
            }
         }

         if (var7.h != -1) {
            i var8 = c(var7.h);
            var7.F = var8.F;
            var7.p = var8.p;
            var7.t = var8.t;
            var7.v = var8.v;
            var7.U = var8.U;
            var7.D = var8.D;
            var7.P = var8.P;
            var7.f = var8.f;
            var7.b = var8.b;
            if (var7.G != -1) {
               i var9 = c(var7.G);
               var7.k = var9.k;
               var7.g = var9.g;
               var7.a = var9.a;
               if (var9.k != null) {
                  String var10 = "a";
                  char var11;
                  if ((var11 = var9.k.charAt(0)) == 'A' || var11 == 'E' || var11 == 'I' || var11 == 'O' || var11 == 'U') {
                     var10 = "an";
                  }

                  var7.o = ("Swap this note at any bank for " + var10 + " " + var9.k + ".").getBytes();
               }
            }

            var7.n = true;
         }

         if (!q && var7.g) {
            var7.k = "Members Object";
            var7.o = "Login to a members' server to use this object.".getBytes();
            var7.j = null;
            var7.r = null;
            var7.w = 0;
         }

         return var7;
      }
   }

   public static Sprite a(int var0, int var1, int var2) {
      if (var2 == 0) {
         Sprite var3;
         if ((var3 = (Sprite)d.a((long)var0)) != null && var3.e != var1 && var3.e != -1) {
            var3.D();
            var3 = null;
         }

         if (var3 != null) {
            return var3;
         }
      }

      i var19;
      if ((var19 = c(var0)).O == null) {
         var1 = -1;
      }

      int var4;
      if (var1 > 1) {
         var4 = -1;

         for(int var5 = 0; var5 < 10; ++var5) {
            if (var1 >= var19.T[var5] && var19.T[var5] != 0) {
               var4 = var19.O[var5];
            }
         }

         if (var4 != -1) {
            var19 = c(var4);
         }
      }

      D_1 var20;
      if ((var20 = var19.d(1)) == null) {
         return null;
      } else {
         Sprite var21 = null;
         if (var19.h != -1 && (var21 = a(var19.G, 10, -1)) == null) {
            return null;
         } else {
            Sprite var6 = new Sprite(32, 32);
            int var7 = uwotm8.r.e;
            int var8 = uwotm8.r.p;
            int[] var9 = uwotm8.r.t;
            int[] var10 = uwotm8.p.f;
            int var11 = uwotm8.p.g;
            int var12 = uwotm8.p.h;
            int var13 = uwotm8.p.k;
            int var14 = uwotm8.p.l;
            int var15 = uwotm8.p.i;
            int var16 = uwotm8.p.j;
            uwotm8.r.c = false;
            uwotm8.p.a(32, 32, var6.a);
            uwotm8.p.b(32, 0, 0, 0, 32);
            uwotm8.r.b();
            int var17 = var19.p;
            if (var2 == -1) {
               var17 = (int)((double)var17 * 1.5D);
            }

            if (var2 > 0) {
               var17 = (int)((double)var17 * 1.04D);
            }

            int var18 = uwotm8.r.r[var19.t] * var17 >> 16;
            var17 = uwotm8.r.s[var19.t] * var17 >> 16;
            var20.a(var19.v, var19.U, var19.t, var19.D, var18 + var20.aD / 2 + var19.P, var17 + var19.P);

            for(var4 = 31; var4 >= 0; --var4) {
               for(var17 = 31; var17 >= 0; --var17) {
                  if (var6.a[var4 + (var17 << 5)] == 0) {
                     if (var4 > 0 && var6.a[var4 - 1 + (var17 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     } else if (var17 > 0 && var6.a[var4 + (var17 - 1 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     } else if (var4 < 31 && var6.a[var4 + 1 + (var17 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     } else if (var17 < 31 && var6.a[var4 + (var17 + 1 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     }
                  }
               }
            }

            if (var2 > 0) {
               for(var4 = 31; var4 >= 0; --var4) {
                  for(var17 = 31; var17 >= 0; --var17) {
                     if (var6.a[var4 + (var17 << 5)] == 0) {
                        if (var4 > 0 && var6.a[var4 - 1 + (var17 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        } else if (var17 > 0 && var6.a[var4 + (var17 - 1 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        } else if (var4 < 31 && var6.a[var4 + 1 + (var17 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        } else if (var17 < 31 && var6.a[var4 + (var17 + 1 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        }
                     }
                  }
               }
            } else if (var2 == 0) {
               for(var4 = 31; var4 >= 0; --var4) {
                  for(var17 = 31; var17 >= 0; --var17) {
                     if (var6.a[var4 + (var17 << 5)] == 0 && var4 > 0 && var17 > 0 && var6.a[var4 - 1 + (var17 - 1 << 5)] > 0) {
                        var6.a[var4 + (var17 << 5)] = 3153952;
                     }
                  }
               }
            }

            if (var19.h != -1) {
               var4 = var21.d;
               var17 = var21.e;
               var21.d = 32;
               var21.e = 32;
               var21.d(0, 0);
               var21.d = var4;
               var21.e = var17;
            }

            if (var2 == 0) {
               d.a(var6, (long)var0);
            }

            uwotm8.p.a(var12, var11, var10);
            uwotm8.p.b(var16, var13, var14, var15);
            uwotm8.r.e = var7;
            uwotm8.r.p = var8;
            uwotm8.r.t = var9;
            uwotm8.r.c = true;
            if (var19.n) {
               var6.d = 33;
            } else {
               var6.d = 32;
            }

            var6.e = var1;
            return var6;
         }
      }
   }

   public final D_1 d(int var1) {
      while(true) {
         int var3;
         if (this.O != null && var1 > 1) {
            int var2 = -1;

            for(var3 = 0; var3 < 10; ++var3) {
               if (var1 >= this.T[var3] && this.T[var3] != 0) {
                  var2 = this.O[var3];
               }
            }

            if (var2 != -1) {
               i var10000 = c(var2);
               var1 = 1;
               //this = var10000;
               continue;
            }
         }

         D_1 var4;
         if ((var4 = (D_1)e.a((long)this.c)) != null) {
            return var4;
         }

         if ((var4 = uwotm8.D_1.a(this.F)) == null) {
            return null;
         }

         if (this.C != 128 || this.N != 128 || this.M != 128) {
            var4.b(this.C, this.M, this.N);
         }

         if (this.f != null) {
            for(var3 = 0; var3 < this.f.length; ++var3) {
               var4.a(this.f[var3], this.b[var3]);
            }
         }

         var4.a(64 + this.R, 768 + this.J, -50, -10, -50, true);
         var4.w = true;
         e.a(var4, (long)this.c);
         return var4;
      }
   }

   public final D_1 e(int var1) {
      while(true) {
         int var3;
         if (this.O != null && var1 > 1) {
            int var2 = -1;

            for(var3 = 0; var3 < 10; ++var3) {
               if (var1 >= this.T[var3] && this.T[var3] != 0) {
                  var2 = this.O[var3];
               }
            }

            if (var2 != -1) {
               i var10000 = c(var2);
               var1 = 1;
               //this = var10000;
               continue;
            }
         }

         D_1 var4;
         if ((var4 = uwotm8.D_1.a(this.F)) == null) {
            return null;
         }

         if (this.f != null) {
            for(var3 = 0; var3 < this.f.length; ++var3) {
               var4.a(this.f[var3], this.b[var3]);
            }
         }

         return var4;
      }
   }
}

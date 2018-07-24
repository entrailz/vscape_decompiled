package uwotm8;

import java.awt.Color;

public final class RSFont extends Rasterizer2D {
   public int a = 0;
   private int b;
   private int c;
   private int[] d = new int[256];
   private int[] e = new int[256];
   private int[] p = new int[256];
   private int[] q = new int[256];
   private byte[][] r = new byte[256][];
   private int[] s = new int[256];
   private static String t = "trans=";
   private static String u = "shad";
   private static String v = "/shad";
   private static String w = "/str";
   private static String x = "col=";
   private static String y = "br";
   private static String z = "str=";
   private static String A = "/col";
   private static String B = "img=";
   private static String C = "/u";
   private static String D = "str";
   private static String E = "shad=";
   private static String F = "/trans";
   private static String G = "u=";
   private static String H = "u";
   private static String[] I = new String[100];
   private static int J = 0;
   private static int K = -1;
   private static int L = -1;
   private static int M = 256;
   private static int N = 0;
   private static int O = -1;
   private static int P = -1;
   private static int Q = 0;
   private static int R = 256;
   private static int S = 0;

   public RSFont(boolean var1, String var2, Archive var3) {
      Buffer var11 = new Buffer(var3.getEntry(var2 + ".dat"));
      Buffer var12;
      (var12 = new Buffer(var3.getEntry("index.dat"))).b = var11.g() + 4;
      int var4;
      if ((var4 = var12.e()) > 0) {
         var12.b += 3 * (var4 - 1);
      }

      var4 = Integer.MAX_VALUE;
      int var5 = Integer.MIN_VALUE;

      for(int var6 = 0; var6 < 256; ++var6) {
         this.p[var6] = var12.e();
         this.d[var6] = var12.e();
         int var7 = this.q[var6] = var12.g();
         int var8 = this.e[var6] = var12.g();
         int var9 = var12.e();
         int var10 = var7 * var8;
         this.r[var6] = new byte[var10];
         if (var9 == 0) {
            for(var9 = 0; var9 < var10; ++var9) {
               this.r[var6][var9] = var11.f();
            }
         } else if (var9 == 1) {
            for(var9 = 0; var9 < var7; ++var9) {
               for(var10 = 0; var10 < var8; ++var10) {
                  this.r[var6][var9 + var10 * var7] = var11.f();
               }
            }
         }

         if (var8 > this.a && var6 < 128) {
            this.a = var8;
         }

         this.p[var6] = 1;
         this.s[var6] = var7 + 2;
         var9 = 0;

         for(var10 = var8 / 7; var10 < var8; ++var10) {
            var9 += this.r[var6][var10 * var7];
         }

         if (var9 <= var8 / 7) {
            --this.s[var6];
            this.p[var6] = 0;
         }

         var9 = 0;

         for(var10 = var8 / 7; var10 < var8; ++var10) {
            var9 += this.r[var6][var7 - 1 + var10 * var7];
         }

         if (var9 <= var8 / 7) {
            --this.s[var6];
         }

         if (this.d[var6] < var4 && var8 != 0) {
            var4 = this.d[var6];
         }

         if (this.d[var6] + var8 > var5) {
            var5 = this.d[var6] + var8;
         }
      }

      if (var1) {
         this.s[32] = this.s[73];
      } else {
         this.s[32] = this.s[105];
      }

      this.b = this.a - var4;
      this.c = var5 - this.a;
   }

   private int a(int var1) {
      return this.s[var1 & 255];
   }

   public final void a(String var1, int var2, int var3) {
      var3 -= this.a;
      int var4 = -1;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6;
         if ((var6 = var1.charAt(var5)) > 'Ã') {
            var6 = ' ';
         }

         if (var6 == '<') {
            var4 = var5;
         } else {
            int var8;
            int var11;
            int var12;
            if (var6 == '>' && var4 != -1) {
               String var7 = var1.substring(var4 + 1, var5);
               var4 = -1;
               if (var7.equals("lt")) {
                  var6 = '<';
               } else {
                  if (!var7.equals("gt")) {
                     if (var7.startsWith(B)) {
                        try {
                           var12 = ((Sprite)null).e;
                           if (R == 256) {
                             // this.b(var2, var3 + this.a - var12);
                           } else {
                             // this.c(var2, var3 + this.a - var12, R);
                           }

                           var2 += ((Sprite)null).d;
                        } catch (Exception var10) {
                           ;
                        }
                     } else {
                        var7 = var7;

                        try {
                           if (var7.startsWith(x)) {
                              String var13;
                              S = (var13 = var7.substring(4)).length() < 6 ? Color.decode(var13).getRGB() : Integer.parseInt(var13, 16);
                           } else if (var7.equals(A)) {
                              S = J;
                           } else if (var7.startsWith(t)) {
                              R = Integer.valueOf(var7.substring(6)).intValue();
                           } else if (var7.equals(F)) {
                              R = M;
                           } else if (var7.startsWith(z)) {
                              L = Integer.valueOf(var7.substring(4)).intValue();
                           } else if (var7.equals(D)) {
                              L = 8388608;
                           } else if (var7.equals(w)) {
                              L = -1;
                           } else if (var7.startsWith(G)) {
                              O = Integer.valueOf(var7.substring(2)).intValue();
                           } else if (var7.equals(H)) {
                              O = 0;
                           } else if (var7.equals(C)) {
                              O = -1;
                           } else if (var7.startsWith(E)) {
                              K = Integer.valueOf(var7.substring(5)).intValue();
                           } else if (var7.equals(u)) {
                              K = 0;
                           } else if (var7.equals(v)) {
                              K = P;
                           } else if (var7.equals(y)) {
                              var8 = M;
                              var11 = P;
                              var12 = J;
                              L = -1;
                              O = -1;
                              P = var11;
                              K = var11;
                              J = var12;
                              S = var12;
                              M = var8;
                              R = var8;
                              Q = 0;
                              N = 0;
                           }
                        } catch (Exception var9) {
                           ;
                        }
                     }
                     continue;
                  }

                  var6 = '>';
               }
            }

            if (var6 == 'Â') {
               var6 = ' ';
            }

            if (var4 == -1) {
               var11 = this.q[var6];
               var8 = this.e[var6];
               if (var6 != ' ') {
                  if (R == 256) {
                     if (K != -1) {
                        this.c(var6, var2 + this.p[var6] + 1, var3 + this.d[var6] + 1, var11, var8, K);
                     }

                     this.c(var6, var2 + this.p[var6], var3 + this.d[var6], var11, var8, S);
                  } else {
                     if (K != -1) {
                        this.a(var6, var2 + this.p[var6] + 1, var3 + this.d[var6] + 1, var11, var8, K, R);
                     }

                     this.a(var6, var2 + this.p[var6], var3 + this.d[var6], var11, var8, S, R);
                  }
               }

               var12 = this.s[var6];
               if (L != -1) {
                  uwotm8.s.drawHorizontal_(var2, var3 + (int)((double)this.a * 0.7D), var12, L);
               }

               if (O != -1) {
                  uwotm8.s.drawHorizontal_(var2, var3 + this.a, var12, O);
               }

               var2 += var12;
            }
         }
      }

   }

   public static void a(int var0, int var1) {
      L = -1;
      O = -1;
      P = var1;
      K = var1;
      J = var0;
      S = var0;
      M = 256;
      R = 256;
      Q = 0;
      N = 0;
   }

   public final int a(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5;
            if ((var5 = var1.charAt(var4)) > 'Ã') {
               var5 = ' ';
            }

            if (var5 == '<') {
               var2 = var4;
            } else {
               if (var5 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var4);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var5 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              var3 += ((Sprite)null).d;
                           } catch (Exception var6) {
                              ;
                           }
                        }
                        continue;
                     }

                     var5 = '>';
                  }
               }

               if (var5 == 'Â') {
                  var5 = ' ';
               }

               if (var2 == -1) {
                  var3 += this.s[var5];
               }
            }
         }

         return var3;
      }
   }

   public final void a(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         a(var4, var5);
         this.a(var1, var2, var3);
      }

   }

   public final void b(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         a(var4, var5);
         this.a(var1, var2 - this.a(var1) / 2, var3);
      }

   }

   public final void a(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 != null) {
         a(var6, var7);
         if (var10 == 0) {
            var10 = this.a;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.b + this.c + var10 && var5 < var10 + var10) {
            var12 = null;
         }

         int var11 = this.a(var1, var12, I);
         if (var9 == 3 && var11 == 1) {
            var9 = 1;
         }

         if (var9 == 0) {
            var3 += this.b;
         } else if (var9 == 1) {
            var3 = var3 + this.b + (var5 - this.b - this.c - (var11 - 1) * var10) / 2;
         } else if (var9 == 2) {
            var3 = var3 + var5 - this.c - (var11 - 1) * var10;
         } else {
            if ((var5 = (var5 - this.b - this.c - (var11 - 1) * var10) / (var11 + 1)) < 0) {
               var5 = 0;
            }

            var3 = var3 + this.b + var5;
            var10 += var5;
         }

         for(var5 = 0; var5 < var11; ++var5) {
            if (var8 == 0) {
               this.a(I[var5], var2, var3);
            } else if (var8 == 1) {
               this.a(I[var5], var2 + (var4 - this.a(I[var5])) / 2, var3);
            } else if (var8 == 2) {
               this.a(I[var5], var2 + var4 - this.a(I[var5]), var3);
            } else if (var5 == var11 - 1) {
               this.a(I[var5], var2, var3);
            } else {
               this.a(I[var5], var2, var3);
               Q = 0;
            }

            var3 += var10;
         }

      }
   }

   private int a(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = -1;
         byte var8 = 0;
         int var9 = 0;
         int var10 = -1;
         StringBuilder var11 = new StringBuilder();

         for(int var12 = 0; var12 < var1.length(); ++var12) {
            char var13;
            if ((var13 = var1.charAt(var12)) > 'Ã') {
               var13 = ' ';
            }

            if (var13 == '<') {
               var10 = var12;
            } else {
               if (var13 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var12);
                  var10 = -1;
                  var11.append('<');
                  var11.append(var16);
                  var11.append('>');
                  if (var16.equals("br")) {
                     var3[var9] = var11.substring(var6, var11.length());
                     ++var9;
                     var6 = var11.length();
                     var4 = 0;
                     var7 = -1;
                  } else if (var16.equals("lt")) {
                     var4 += this.a(60);
                  } else if (var16.equals("gt")) {
                     var4 += this.a(62);
                  } else if (var16.startsWith(B)) {
                     try {
                        var4 += ((Sprite)null).d;
                     } catch (Exception var14) {
                        ;
                     }
                  }

                  var13 = 0;
               }

               if (var10 == -1) {
                  if (var13 != 0) {
                     var11.append(var13);
                     var4 += this.a(var13);
                  }

                  if (var13 == ' ') {
                     var7 = var11.length();
                     var5 = var4;
                     var8 = 1;
                  }

                  if (var2 != null && var4 > var2[var9 < var2.length ? var9 : var2.length - 1] && var7 >= 0) {
                     var3[var9] = var11.substring(var6, var7 - var8);
                     ++var9;
                     var6 = var7;
                     var7 = -1;
                     var4 -= var5;
                  }

                  if (var13 == '-') {
                     var7 = var11.length();
                     var5 = var4;
                     var8 = 0;
                  }
               }
            }
         }

         String var15;
         if ((var15 = var11.toString()).length() > var6) {
            var3[var9++] = var15.substring(var6, var15.length());
         }

         return var9;
      }
   }

   private static void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(var6 = -var6; var6 < 0; ++var6) {
         for(int var10 = -var5; var10 < 0; ++var10) {
            if (var1[var3++] != 0) {
               int var11 = var0[var4];
               var0[var4++] = (((var11 & 16711935) * var9 & -16711936) + ((var11 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * uwotm8.Rasterizer2D.width;
      int var9 = uwotm8.Rasterizer2D.width - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < uwotm8.Rasterizer2D.clipBottom) {
         var12 = uwotm8.Rasterizer2D.clipBottom - var3;
         var5 -= var12;
         var3 = uwotm8.Rasterizer2D.clipBottom;
         var11 = 0 + var12 * var4;
         var8 += var12 * uwotm8.Rasterizer2D.width;
      }

      if (var3 + var5 > uwotm8.Rasterizer2D.clipTop) {
         var5 -= var3 + var5 - uwotm8.Rasterizer2D.clipTop;
      }

      if (var2 < uwotm8.Rasterizer2D.clipLeft) {
         var12 = uwotm8.Rasterizer2D.clipLeft - var2;
         var4 -= var12;
         var2 = uwotm8.Rasterizer2D.clipLeft;
         var11 += var12;
         var8 += var12;
         var10 = var12 + 0;
         var9 += var12;
      }

      if (var2 + var4 > uwotm8.Rasterizer2D.clipRight) {
         var12 = var2 + var4 - uwotm8.Rasterizer2D.clipRight;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         a(uwotm8.Rasterizer2D.pixels, this.r[var1], var6, var11, var8, var4, var5, var9, var10, var7);
      }

   }

   private static void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(var6 = -var6; var6 < 0; ++var6) {
         int var10;
         for(var10 = var9; var10 < 0; ++var10) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var10 = var5; var10 < 0; ++var10) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * uwotm8.Rasterizer2D.width;
      int var8 = uwotm8.Rasterizer2D.width - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < uwotm8.Rasterizer2D.clipBottom) {
         var11 = uwotm8.Rasterizer2D.clipBottom - var3;
         var5 -= var11;
         var3 = uwotm8.Rasterizer2D.clipBottom;
         var10 = 0 + var11 * var4;
         var7 += var11 * uwotm8.Rasterizer2D.width;
      }

      if (var3 + var5 > uwotm8.Rasterizer2D.clipTop) {
         var5 -= var3 + var5 - uwotm8.Rasterizer2D.clipTop;
      }

      if (var2 < uwotm8.Rasterizer2D.clipLeft) {
         var11 = uwotm8.Rasterizer2D.clipLeft - var2;
         var4 -= var11;
         var2 = uwotm8.Rasterizer2D.clipLeft;
         var10 += var11;
         var7 += var11;
         var9 = var11 + 0;
         var8 += var11;
      }

      if (var2 + var4 > uwotm8.Rasterizer2D.clipRight) {
         var11 = var2 + var4 - uwotm8.Rasterizer2D.clipRight;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         a(uwotm8.Rasterizer2D.pixels, this.r[var1], var6, var10, var7, var4, var5, var8, var9);
      }

   }

   public static String rgb(String var0) {
      if (var0.equals("369")) {
         return "336699";
      } else if (var0.equals("mon")) {
         return "00ff80";
      } else if (var0.equals("red")) {
         return "ff0000";
      } else if (var0.equals("gre")) {
         return "65280";
      } else if (var0.equals("blu")) {
         return "255";
      } else if (var0.equals("ind")) {
         return "4964c8";
      } else if (var0.equals("yel")) {
         return "ffff00";
      } else if (var0.equals("cya")) {
         return "65535";
      } else if (var0.equals("mag")) {
         return "ff00ff";
      } else if (var0.equals("vio")) {
         return "7A10E5";
      } else if (var0.equals("whi")) {
         return "ffffff";
      } else if (var0.equals("bla")) {
         return "0";
      } else if (var0.equals("lre")) {
         return "ff9040";
      } else if (var0.equals("dre")) {
         return "800000";
      } else if (var0.equals("dbl")) {
         return "128";
      } else if (var0.equals("or1")) {
         return "ffb000";
      } else if (var0.equals("or2")) {
         return "ff7000";
      } else if (var0.equals("or3")) {
         return "ff3000";
      } else if (var0.equals("dor")) {
         return "946300";
      } else if (var0.equals("gr1")) {
         return "c0ff00";
      } else if (var0.equals("gr2")) {
         return "80ff00";
      } else {
         return var0.equals("gr3") ? "40ff00" : "";
      }
   }
}

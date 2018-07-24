package uwotm8;

import com.runescape.Client;

public final class ActorDefinition {
   public static int a;
   public int b;
   public int c = -1;
   private static int u;
   private int v = -1;
   public int d = -1;
   private int w = -1;
   private static I_1 x;
   public int e = -1;
   private int y = 1834;
   public String f;
   public String[] g;
   public int h = -1;
   public byte i = 1;
   private int[] z;
   private static int[] A;
   private int[] B;
   public int j = -1;
   private int[] C;
   public int k = -1;
   public long l = -1L;
   public int m = 32;
   private static ActorDefinition[] D;
   public static Client n;
   public int o = -1;
   public boolean p = true;
   private int E;
   private int F = 128;
   public boolean q = true;
   public int[] r;
   private byte[] G;
   private int H = 128;
   private int I;
   public boolean s = false;
   private int[] J;
   public static J_1 t = new J_1(30);

   public static ActorDefinition a(int var0) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if (D[var1].l == (long)var0) {
            return D[var1];
         }
      }

      u = (u + 1) % 20;
      ActorDefinition var7 = D[u] = new ActorDefinition();
      x.b = A[var0];
      var7.b = var0;
      var7.l = (long)var0;
      I_1 var2 = x;
      ActorDefinition var6 = var7;

      while(true) {
         while(true) {
            try {
               int var3;
               label236:
               do {
                  while(true) {
                     while(true) {
                        while(true) {
                           while(true) {
                              while(true) {
                                 while(true) {
                                    while(true) {
                                       while(true) {
                                          while(true) {
                                             while(true) {
                                                while(true) {
                                                   while(true) {
                                                      while(true) {
                                                         while(true) {
                                                            while(true) {
                                                               while(true) {
                                                                  while(true) {
                                                                     while(true) {
                                                                        while(true) {
                                                                           while(true) {
                                                                              while(true) {
                                                                                 while(true) {
                                                                                    while((var3 = var2.e()) != 0) {
                                                                                       int var4;
                                                                                       if (var3 != 1) {
                                                                                          if (var3 != 2) {
                                                                                             if (var3 != 3) {
                                                                                                if (var3 != 12) {
                                                                                                   if (var3 != 13) {
                                                                                                      if (var3 != 14) {
                                                                                                         if (var3 != 17) {
                                                                                                            if (var3 < 30 || var3 >= 40) {
                                                                                                               if (var3 != 40) {
                                                                                                                  if (var3 != 60) {
                                                                                                                     if (var3 != 90) {
                                                                                                                        if (var3 != 91) {
                                                                                                                           if (var3 != 92) {
                                                                                                                              if (var3 != 93) {
                                                                                                                                 if (var3 != 95) {
                                                                                                                                    if (var3 != 97) {
                                                                                                                                       if (var3 != 98) {
                                                                                                                                          if (var3 != 99) {
                                                                                                                                             if (var3 != 100) {
                                                                                                                                                if (var3 != 101) {
                                                                                                                                                   if (var3 != 102) {
                                                                                                                                                      if (var3 != 103) {
                                                                                                                                                         if (var3 != 106) {
                                                                                                                                                            continue label236;
                                                                                                                                                         }

                                                                                                                                                         var6.v = var2.g();
                                                                                                                                                         if (var6.v == 65535) {
                                                                                                                                                            var6.v = -1;
                                                                                                                                                         }

                                                                                                                                                         var6.w = var2.g();
                                                                                                                                                         if (var6.w == 65535) {
                                                                                                                                                            var6.w = -1;
                                                                                                                                                         }

                                                                                                                                                         var3 = var2.e();
                                                                                                                                                         var6.r = new int[var3 + 1];

                                                                                                                                                         for(var4 = 0; var4 <= var3; ++var4) {
                                                                                                                                                            var6.r[var4] = var2.g();
                                                                                                                                                            if (var6.r[var4] == 65535) {
                                                                                                                                                               var6.r[var4] = -1;
                                                                                                                                                            }
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         var6.m = var2.g();
                                                                                                                                                      }
                                                                                                                                                   } else {
                                                                                                                                                      var6.j = var2.g();
                                                                                                                                                   }
                                                                                                                                                } else {
                                                                                                                                                   var6.I = var2.f() * 5;
                                                                                                                                                }
                                                                                                                                             } else {
                                                                                                                                                var6.E = var2.f();
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             var6.s = true;
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          var6.F = var2.g();
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       var6.H = var2.g();
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    var6.e = var2.g();
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var6.q = false;
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              var2.g();
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           var2.g();
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var2.g();
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var3 = var2.e();
                                                                                                                     var6.B = new int[var3];

                                                                                                                     for(var4 = 0; var4 < var3; ++var4) {
                                                                                                                        var6.B[var4] = var2.g();
                                                                                                                     }
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var3 = var2.e();
                                                                                                                  var6.C = new int[var3];
                                                                                                                  var6.z = new int[var3];

                                                                                                                  for(var4 = 0; var4 < var3; ++var4) {
                                                                                                                     var6.C[var4] = var2.g();
                                                                                                                     var6.z[var4] = var2.g();
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               if (var6.g == null) {
                                                                                                                  var6.g = new String[5];
                                                                                                               }

                                                                                                               var6.g[var3 - 30] = var2.d();
                                                                                                               if (var6.g[var3 - 30].equalsIgnoreCase("hidden")) {
                                                                                                                  var6.g[var3 - 30] = null;
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            var6.h = var2.g();
                                                                                                            var6.d = var2.g();
                                                                                                            var6.o = var2.g();
                                                                                                            var6.c = var2.g();
                                                                                                         }
                                                                                                      } else {
                                                                                                         var6.h = var2.g();
                                                                                                      }
                                                                                                   } else {
                                                                                                      var6.k = var2.g();
                                                                                                   }
                                                                                                } else {
                                                                                                   var6.i = var2.f();
                                                                                                }
                                                                                             } else {
                                                                                                var6.G = var2.m();
                                                                                             }
                                                                                          } else {
                                                                                             var6.f = var2.d();
                                                                                          }
                                                                                       } else {
                                                                                          var3 = var2.e();
                                                                                          var6.J = new int[var3];

                                                                                          for(var4 = 0; var4 < var3; ++var4) {
                                                                                             var6.J[var4] = var2.g();
                                                                                          }
                                                                                       }
                                                                                    }

                                                                                    return var7;
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               } while(var3 != 107);

               var6.p = false;
            } catch (Exception var5) {
               System.out.println("Error reading values for npc#" + var6.b);
               var5.printStackTrace();
            }
         }
      }
   }

   public final D_1 a() {
      while(this.r != null) {
         ActorDefinition var1;
         if ((var1 = this.b()) == null) {
            return null;
         }

        // this = var1;
      }

      if (this.B == null) {
         return null;
      } else {
         boolean var3 = false;

         int var2;
         for(var2 = 0; var2 < this.B.length; ++var2) {
            if (!uwotm8.D_1.b(this.B[var2])) {
               var3 = true;
            }
         }

         if (var3) {
            return null;
         } else {
            D_1[] var5 = new D_1[this.B.length];

            for(int var4 = 0; var4 < this.B.length; ++var4) {
               var5[var4] = uwotm8.D_1.a(this.B[var4]);
            }

            D_1 var6;
            if (var5.length == 1) {
               var6 = var5[0];
            } else {
               var6 = new D_1(var5.length, var5);
            }

            if (this.C != null) {
               for(var2 = 0; var2 < this.C.length; ++var2) {
                  var6.a(this.C[var2], this.z[var2]);
               }
            }

            return var6;
         }
      }
   }

   public final ActorDefinition b() {
      int var1 = -1;
      if (this.v != -1) {
         VariableBits var4;
         int var2 = (var4 = VariableBits.a[this.v]).b;
         int var3 = var4.c;
         var1 = var4.d;
         var1 = Client.ad[var1 - var3];
         var1 &= n.A[var2] >> var3;
      } else if (this.w != -1) {
         var1 = n.A[this.w];
      }

      return var1 >= 0 && var1 < this.r.length && this.r[var1] != -1 ? a(this.r[var1]) : null;
   }

   public static void a(G_1 var0) {
      x = new I_1(var0.b("npc.dat"));
      I_1 var3;
      A = new int[a = (var3 = new I_1(var0.b("npc.idx"))).g()];
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < a; ++var2) {
         A[var2] = var1;
         var1 += var3.g();
      }

      D = new ActorDefinition[20];

      for(var2 = 0; var2 < 20; ++var2) {
         D[var2] = new ActorDefinition();
      }

      for(var2 = 0; var2 < a; ++var2) {
         a(var2);
      }

   }

   public static void c() {
      t = null;
      A = null;
      D = null;
      x = null;
   }

   public final D_1 a(int var1, int var2, int[] var3) {
      while(this.r != null) {
         ActorDefinition var4;
         if ((var4 = this.b()) == null) {
            return null;
         }

         var2 = var2;
         var1 = var1;
         //this = var4;
      }

      D_1 var6;
      if ((var6 = (D_1)t.a(this.l)) == null) {
         boolean var5 = false;

         for(int var7 = 0; var7 < this.J.length; ++var7) {
            if (!uwotm8.D_1.b(this.J[var7])) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         }

         D_1[] var8 = new D_1[this.J.length];

         int var9;
         for(var9 = 0; var9 < this.J.length; ++var9) {
            var8[var9] = uwotm8.D_1.a(this.J[var9]);
         }

         if (var8.length == 1) {
            var6 = var8[0];
         } else {
            var6 = new D_1(var8.length, var8);
         }

         if (this.C != null) {
            for(var9 = 0; var9 < this.C.length; ++var9) {
               var6.a(this.C[var9], this.z[var9]);
            }
         }

         var6.d();
         var6.a(64 + this.E, 850 + this.I, -30, -50, -30, true);
         t.a(var6, this.l);
      }

      D_1 var10;
      (var10 = uwotm8.D_1.a).a(var6, uwotm8.e.b(var2) & uwotm8.e.b(var1));
      if (var2 != -1 && var1 != -1) {
         var10.a(var3, var1, var2);
      } else if (var2 != -1) {
         var10.c(var2);
      }

      if (this.H != 128 || this.F != 128) {
         var10.b(this.H, this.H, this.F);
      }

      var10.c();
      var10.v = null;
      var10.u = null;
      if (this.i == 1) {
         var10.w = true;
      }

      return var10;
   }
}

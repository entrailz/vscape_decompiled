package uwotm8;

public final class BZip2Decompressor {
   private static final BZip2DecompressionState a = new BZip2DecompressionState();

   public static int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      BZip2DecompressionState var5 = a;
      synchronized(a) {
         a.a = var2;
         a.b = var4;
         a.f = var0;
         a.g = 0;
         a.c = var3;
         a.h = var1;
         a.o = 0;
         a.n = 0;
         a.d = 0;
         a.e = 0;
         a.i = 0;
         a.j = 0;
         a.q = 0;
         BZip2DecompressionState var18 = a;
         boolean var19 = false;
         Object var21 = null;
         BZip2DecompressionState var24 = null;
         Object var6 = null;
         var18.p = 1;
         if (uwotm8.BZip2DecompressionState.x == null) {
            uwotm8.BZip2DecompressionState.x = new int[var18.p * 100000];
         }

         boolean var10000 = true;

         while(var10000 && (byte)a(8, var18) != 23) {
            byte var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            ++var18.q;
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            byte var20 = (byte)a(1, var18);
            var18.m = var20 != 0;
            if (var18.m) {
               System.out.println("PANIC! RANDOMISED BLOCK!");
            }

            var18.r = 0;
            var20 = (byte)a(8, var18);
            var18.r = var18.r << 8 | var20 & 255;
            var20 = (byte)a(8, var18);
            var18.r = var18.r << 8 | var20 & 255;
            var20 = (byte)a(8, var18);
            var18.r = var18.r << 8 | var20 & 255;

            int var23;
            for(var23 = 0; var23 < 16; ++var23) {
               byte var22 = (byte)a(1, var18);
               var18.A[var23] = var22 == 1;
            }

            for(var23 = 0; var23 < 256; ++var23) {
               var18.z[var23] = false;
            }

            for(var23 = 0; var23 < 16; ++var23) {
               if (var18.A[var23]) {
                  for(var3 = 0; var3 < 16; ++var3) {
                     if ((byte)a(1, var18) == 1) {
                        var18.z[(var23 << 4) + var3] = true;
                     }
                  }
               }
            }

            var24 = var18;
            var18.y = 0;

            int var27;
            for(var27 = 0; var27 < 256; ++var27) {
               if (var24.z[var27]) {
                  var24.B[var24.y] = (byte)var27;
                  ++var24.y;
               }
            }

            var23 = var18.y + 2;
            var3 = a(3, var18);
            var4 = a(15, var18);

            int var7;
            for(var27 = 0; var27 < var4; ++var27) {
               for(var7 = 0; (byte)a(1, var18) != 0; ++var7) {
                  ;
               }

               var18.F[var27] = (byte)var7;
            }

            byte[] var28 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var3; var28[var29] = var29++) {
               ;
            }

            byte var8;
            byte var9;
            for(var7 = 0; var7 < var4; ++var7) {
               var8 = var18.F[var7];

               for(var9 = var28[var8]; var8 > 0; --var8) {
                  var28[var8] = var28[var8 - 1];
               }

               var28[0] = var9;
               var18.E[var7] = var9;
            }

            int var31;
            int var32;
            for(var7 = 0; var7 < var3; ++var7) {
               var31 = a(5, var18);

               for(var32 = 0; var32 < var23; ++var32) {
                  while((byte)a(1, var18) != 0) {
                     if ((byte)a(1, var18) == 0) {
                        ++var31;
                     } else {
                        --var31;
                     }
                  }

                  var18.G[var7][var32] = (byte)var31;
               }
            }

            byte var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int[] var26;
            int[] var30;
            for(var7 = 0; var7 < var3; ++var7) {
               var8 = 32;
               var9 = 0;

               for(var4 = 0; var4 < var23; ++var4) {
                  if (var18.G[var7][var4] > var9) {
                     var9 = var18.G[var7][var4];
                  }

                  if (var18.G[var7][var4] < var8) {
                     var8 = var18.G[var7][var4];
                  }
               }

               int[] var47 = var18.H[var7];
               int[] var10001 = var18.I[var7];
               int[] var10002 = var18.J[var7];
               byte[] var10003 = var18.G[var7];
               var13 = var23;
               var12 = var9;
               byte[] var10 = var10003;
               int[] var35 = var10002;
               var30 = var10001;
               var26 = var47;
               var14 = 0;

               for(var15 = var8; var15 <= var12; ++var15) {
                  for(var16 = 0; var16 < var13; ++var16) {
                     if (var10[var16] == var15) {
                        var35[var14] = var16;
                        ++var14;
                     }
                  }
               }

               for(var15 = 0; var15 < 23; ++var15) {
                  var30[var15] = 0;
               }

               for(var15 = 0; var15 < var13; ++var15) {
                  ++var30[var10[var15] + 1];
               }

               for(var15 = 1; var15 < 23; ++var15) {
                  var30[var15] += var30[var15 - 1];
               }

               for(var15 = 0; var15 < 23; ++var15) {
                  var26[var15] = 0;
               }

               var15 = 0;

               for(var16 = var8; var16 <= var12; ++var16) {
                  var15 += var30[var16 + 1] - var30[var16];
                  var26[var16] = var15 - 1;
                  var15 <<= 1;
               }

               for(var16 = var8 + 1; var16 <= var12; ++var16) {
                  var30[var16] = (var26[var16 - 1] + 1 << 1) - var30[var16];
               }

               var18.K[var7] = var8;
            }

            var7 = var18.y + 1;
            var8 = -1;
            boolean var37 = false;

            for(var4 = 0; var4 <= 255; ++var4) {
               var18.u[var4] = 0;
            }

            var4 = 4095;

            int var11;
            int var34;
            for(var34 = 15; var34 >= 0; --var34) {
               for(var11 = 15; var11 >= 0; --var11) {
                  var18.C[var4] = (byte)((var34 << 4) + var11);
                  --var4;
               }

               var18.D[var34] = var4 + 1;
            }

            var34 = 0;
            var31 = var8 + 1;
            byte var38 = 50;
            byte var39 = var18.E[0];
            var23 = var18.K[var39];
            int[] var25 = var18.H[var39];
            var30 = var18.J[var39];
            var26 = var18.I[var39];
            var32 = var38 - 1;
            var11 = var23;

            int var40;
            byte var41;
            for(var40 = a(var23, var18); var40 > var25[var11]; var40 = var40 << 1 | var41) {
               ++var11;
               var41 = (byte)a(1, var18);
            }

            var11 = var30[var40 - var26[var11]];

            while(true) {
               while(var11 != var7) {
                  byte var42;
                  byte var45;
                  if (var11 != 0 && var11 != 1) {
                     if ((var40 = var11 - 1) < 16) {
                        var14 = var18.D[0];

                        for(var41 = var18.C[var14 + var40]; var40 > 3; var40 -= 4) {
                           var11 = var14 + var40;
                           var18.C[var11] = var18.C[var11 - 1];
                           var18.C[var11 - 1] = var18.C[var11 - 2];
                           var18.C[var11 - 2] = var18.C[var11 - 3];
                           var18.C[var11 - 3] = var18.C[var11 - 4];
                        }

                        while(var40 > 0) {
                           var18.C[var14 + var40] = var18.C[var14 + var40 - 1];
                           --var40;
                        }

                        var18.C[var14] = var41;
                     } else {
                        var14 = var40 / 16;
                        var11 = var40 % 16;
                        var15 = var18.D[var14] + var11;

                        for(var41 = var18.C[var15]; var15 > var18.D[var14]; --var15) {
                           var18.C[var15] = var18.C[var15 - 1];
                        }

                        ++var18.D[var14];

                        while(var14 > 0) {
                           --var18.D[var14];
                           var18.C[var18.D[var14]] = var18.C[var18.D[var14 - 1] + 16 - 1];
                           --var14;
                        }

                        --var18.D[0];
                        var18.C[var18.D[0]] = var41;
                        if (var18.D[0] == 0) {
                           var11 = 4095;

                           for(var40 = 15; var40 >= 0; --var40) {
                              for(var14 = 15; var14 >= 0; --var14) {
                                 var18.C[var11] = var18.C[var18.D[var40] + var14];
                                 --var11;
                              }

                              var18.D[var40] = var11 + 1;
                           }
                        }
                     }

                     ++var18.u[var18.B[var41 & 255] & 255];
                     uwotm8.BZip2DecompressionState.x[var34] = var18.B[var41 & 255] & 255;
                     ++var34;
                     if (var32 == 0) {
                        ++var31;
                        var32 = 50;
                        var42 = var18.E[var31];
                        var23 = var18.K[var42];
                        var25 = var18.H[var42];
                        var30 = var18.J[var42];
                        var26 = var18.I[var42];
                     }

                     --var32;
                     var14 = var23;

                     for(var11 = a(var23, var18); var11 > var25[var14]; var11 = var11 << 1 | var45) {
                        ++var14;
                        var45 = (byte)a(1, var18);
                     }

                     var11 = var30[var11 - var26[var14]];
                  } else {
                     var40 = -1;
                     var13 = 1;

                     do {
                        if (var11 == 0) {
                           var40 += var13;
                        } else if (var11 == 1) {
                           var40 += 2 * var13;
                        }

                        var13 <<= 1;
                        if (var32 == 0) {
                           ++var31;
                           var32 = 50;
                           var42 = var18.E[var31];
                           var23 = var18.K[var42];
                           var25 = var18.H[var42];
                           var30 = var18.J[var42];
                           var26 = var18.I[var42];
                        }

                        --var32;
                        var14 = var23;

                        for(var11 = a(var23, var18); var11 > var25[var14]; var11 = var11 << 1 | var45) {
                           ++var14;
                           var45 = (byte)a(1, var18);
                        }
                     } while((var11 = var30[var11 - var26[var14]]) == 0 || var11 == 1);

                     ++var40;
                     var42 = var18.B[var18.C[var18.D[0]] & 255];

                     for(var18.u[var42 & 255] += var40; var40 > 0; --var40) {
                        uwotm8.BZip2DecompressionState.x[var34] = var42 & 255;
                        ++var34;
                     }
                  }
               }

               var18.l = 0;
               var18.k = 0;
               var18.w[0] = 0;

               for(var11 = 1; var11 <= 256; ++var11) {
                  var18.w[var11] = var18.u[var11 - 1];
               }

               for(var11 = 1; var11 <= 256; ++var11) {
                  var18.w[var11] += var18.w[var11 - 1];
               }

               for(var11 = 0; var11 < var34; ++var11) {
                  var12 = (byte)uwotm8.BZip2DecompressionState.x[var11];
                  uwotm8.BZip2DecompressionState.x[var18.w[var12 & 255]] |= var11 << 8;
                  ++var18.w[var12 & 255];
               }

               var18.s = uwotm8.BZip2DecompressionState.x[var18.r] >> 8;
               var18.v = 0;
               var18.s = uwotm8.BZip2DecompressionState.x[var18.s];
               var18.t = (byte)var18.s;
               var18.s >>= 8;
               ++var18.v;
               var18.L = var34;
               byte var33 = var18.k;
               var32 = var18.l;
               var34 = var18.v;
               var11 = var18.t;
               int[] var43 = uwotm8.BZip2DecompressionState.x;
               var13 = var18.s;
               byte[] var44 = var18.f;
               var15 = var18.g;
               var16 = var18.h;
               var23 = var18.h;
               var3 = var18.L + 1;

               label272:
               while(true) {
                  if (var32 > 0) {
                     while(true) {
                        if (var16 == 0) {
                           break label272;
                        }

                        if (var32 == 1) {
                           if (var16 == 0) {
                              var32 = 1;
                              break label272;
                           }

                           var44[var15] = var33;
                           ++var15;
                           --var16;
                           break;
                        }

                        var44[var15] = var33;
                        --var32;
                        ++var15;
                        --var16;
                     }
                  }

                  boolean var36 = true;

                  while(var36) {
                     var36 = false;
                     if (var34 == var3) {
                        var32 = 0;
                        break label272;
                     }

                     var33 = (byte)var11;
                     var8 = (byte)(var13 = var43[var13]);
                     var13 >>= 8;
                     ++var34;
                     if (var8 != var11) {
                        var11 = var8;
                        if (var16 == 0) {
                           var32 = 1;
                           break label272;
                        }

                        var44[var15] = var33;
                        ++var15;
                        --var16;
                        var36 = true;
                     } else if (var34 == var3) {
                        if (var16 == 0) {
                           var32 = 1;
                           break label272;
                        }

                        var44[var15] = var33;
                        ++var15;
                        --var16;
                        var36 = true;
                     }
                  }

                  var32 = 2;
                  var8 = (byte)(var13 = var43[var13]);
                  var13 >>= 8;
                  ++var34;
                  if (var34 != var3) {
                     if (var8 != var11) {
                        var11 = var8;
                     } else {
                        var32 = 3;
                        var29 = (byte)(var13 = var43[var13]);
                        var13 >>= 8;
                        ++var34;
                        if (var34 != var3) {
                           if (var29 != var11) {
                              var11 = var29;
                           } else {
                              var29 = (byte)(var13 = var43[var13]);
                              var13 >>= 8;
                              ++var34;
                              var32 = (var29 & 255) + 4;
                              var11 = (byte)(var13 = var43[var13]);
                              var13 >>= 8;
                              ++var34;
                           }
                        }
                     }
                  }
               }

               var7 = var18.i;
               var18.i += var23 - var16;
               if (var18.i < var7) {
                  ++var18.j;
               }

               var18.k = var33;
               var18.l = var32;
               var18.v = var34;
               var18.t = var11;
               uwotm8.BZip2DecompressionState.x = var43;
               var18.s = var13;
               var18.f = var44;
               var18.g = var15;
               var18.h = var16;
               if (var18.v == var18.L + 1 && var18.l == 0) {
                  var10000 = true;
                  break;
               }

               var10000 = false;
               break;
            }
         }

         return var1 -= a.h;
      }
   }

   private static int a(int var0, BZip2DecompressionState var1) {
      while(var1.o < var0) {
         var1.n = var1.n << 8 | var1.a[var1.b] & 255;
         var1.o += 8;
         ++var1.b;
         --var1.c;
         ++var1.d;
         if (var1.d == 0) {
            ++var1.e;
         }
      }

      int var2 = var1.n >> var1.o - var0 & (1 << var0) - 1;
      var1.o -= var0;
      return var2;
   }
}

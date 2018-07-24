package uwotm8;

public final class MapRegion {
   private final int[] d;
   private final int[] e;
   private final int[] f;
   private final int[] g;
   private final int[] h;
   private final int[][][] i;
   private final byte[][][] j;
   public static int a;
   private final byte[][][] k;
   private final int[][][] l;
   private final byte[][][] m;
   private static final int[] n = new int[]{1, 0, -1, 0};
   private final int[][] o;
   private static final int[] p = new int[]{16, 32, 64, 128};
   private final byte[][][] q;
   private static final int[] r = new int[]{0, -1, 0, 1};
   public static int b = 99;
   private final int s;
   private final int t;
   private final byte[][][] u;
   private final byte[][][] v;
   public static boolean c = true;
   private static final int[] w = new int[]{1, 2, 4, 8};

   public MapRegion(byte[][][] var1, int[][][] var2) {
      b = 99;
      this.s = 104;
      this.t = 104;
      this.i = var2;
      this.v = var1;
      this.q = new byte[4][104][104];
      this.j = new byte[4][104][104];
      this.m = new byte[4][104][104];
      this.u = new byte[4][104][104];
      this.l = new int[4][105][105];
      this.k = new byte[4][105][105];
      this.o = new int[105][105];
      this.d = new int[104];
      this.e = new int[104];
      this.f = new int[104];
      this.g = new int[104];
      this.h = new int[104];
   }

   private static int perlinNoise(int var0, int var1) {
      return ((var0 ^= (var0 += var1 * 57) << 13) * (var0 * var0 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 255;
   }

   public final void a(CollisionMap[] var1, SceneGraph var2) {
      try {
         int var3;
         int var4;
         int var5;
         int var6;
         for(var3 = 0; var3 < 4; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  if ((this.v[var3][var4][var5] & 1) == 1) {
                     var6 = var3;
                     if ((this.v[1][var4][var5] & 2) == 2) {
                        var6 = var3 - 1;
                     }

                     if (var6 >= 0) {
                        var1[var6].block(var5, var4);
                     }
                  }
               }
            }
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var27;
         for(var3 = 0; var3 < 4; ++var3) {
            byte[][] var30 = this.k[var3];
            var8 = (int)Math.sqrt(5100.0D);
            var9 = var8 * 768 >> 8;

            for(var10 = 1; var10 < 103; ++var10) {
               for(var11 = 1; var11 < 103; ++var11) {
                  var12 = this.i[var3][var11 + 1][var10] - this.i[var3][var11 - 1][var10];
                  var8 = this.i[var3][var11][var10 + 1] - this.i[var3][var11][var10 - 1];
                  var13 = (int)Math.sqrt((double)(var12 * var12 + 65536 + var8 * var8));
                  var14 = (var12 << 8) / var13;
                  var15 = 65536 / var13;
                  var16 = (var8 << 8) / var13;
                  var27 = 96 + (var14 * -50 + var15 * -10 + var16 * -50) / var9;
                  var5 = (var30[var11 - 1][var10] >> 2) + (var30[var11 + 1][var10] >> 3) + (var30[var11][var10 - 1] >> 2) + (var30[var11][var10 + 1] >> 3) + (var30[var11][var10] >> 1);
                  this.o[var11][var10] = var27 - var5;
               }
            }

            for(var10 = 0; var10 < 104; ++var10) {
               this.d[var10] = 0;
               this.e[var10] = 0;
               this.f[var10] = 0;
               this.g[var10] = 0;
               this.h[var10] = 0;
            }

            for(var10 = -5; var10 < 109; ++var10) {
               for(var11 = 0; var11 < 104; ++var11) {
                  if ((var12 = var10 + 5) >= 0 && var12 < 104 && (var8 = this.q[var3][var12][var11] & 255) > 0) {
                     Floor var31 = Floor.a[var8 - 1];
                     this.d[var11] += var31.d;
                     this.e[var11] += var31.b;
                     this.f[var11] += var31.c;
                     this.g[var11] += var31.e;
                     ++this.h[var11];
                  }

                  if ((var8 = var10 - 5) >= 0 && var8 < 104 && (var13 = this.q[var3][var8][var11] & 255) > 0) {
                     Floor var32 = Floor.a[var13 - 1];
                     this.d[var11] -= var32.d;
                     this.e[var11] -= var32.b;
                     this.f[var11] -= var32.c;
                     this.g[var11] -= var32.e;
                     --this.h[var11];
                  }
               }

               if (var10 > 0 && var10 < 103) {
                  var11 = 0;
                  var12 = 0;
                  var8 = 0;
                  var13 = 0;
                  var14 = 0;

                  for(var15 = -5; var15 < 109; ++var15) {
                     if ((var16 = var15 + 5) >= 0 && var16 < 104) {
                        var11 += this.d[var16];
                        var12 += this.e[var16];
                        var8 += this.f[var16];
                        var13 += this.g[var16];
                        var14 += this.h[var16];
                     }

                     if ((var27 = var15 - 5) >= 0 && var27 < 104) {
                        var11 -= this.d[var27];
                        var12 -= this.e[var27];
                        var8 -= this.f[var27];
                        var13 -= this.g[var27];
                        var14 -= this.h[var27];
                     }

                     if (var15 > 0 && var15 < 103 && (!c || (this.v[0][var10][var15] & 2) != 0 || (this.v[var3][var10][var15] & 16) == 0 && this.getCollisionPlane(var15, var3, var10) == a)) {
                        if (var3 < b) {
                           b = var3;
                        }

                        var5 = this.q[var3][var10][var15] & 255;
                        var27 = this.j[var3][var10][var15] & 255;
                        if (var5 > 0 || var27 > 0) {
                           var4 = this.i[var3][var10][var15];
                           var6 = this.i[var3][var10 + 1][var15];
                           var7 = this.i[var3][var10 + 1][var15 + 1];
                           var9 = this.i[var3][var10][var15 + 1];
                           var16 = this.o[var10][var15];
                           int var17 = this.o[var10 + 1][var15];
                           int var18 = this.o[var10 + 1][var15 + 1];
                           int var19 = this.o[var10][var15 + 1];
                           int var20 = -1;
                           int var21 = -1;
                           int var22;
                           if (var5 > 0) {
                              var22 = (var11 << 8) / var13;
                              var21 = var12 / var14;
                              int var23 = var8 / var14;
                              var20 = encode(var22, var21, var23);
                              var21 = encode(var22, var21, var23);
                           }

                           if (var3 > 0) {
                              boolean var33 = true;
                              if (var5 == 0 && this.m[var3][var10][var15] != 0) {
                                 var33 = false;
                              }

                              if (var27 > 0 && !Y_1.a[var27 - 1].d) {
                                 var33 = false;
                              }

                              if (var33 && var4 == var6 && var4 == var7 && var4 == var9) {
                                 this.l[var3][var10][var15] |= 2340;
                              }
                           }

                           var22 = 0;
                           if (var20 != -1) {
                              var22 = uwotm8.Rasterizer3D.x[light(var21, 96)];
                           }

                           if (var27 == 0) {
                              var2.a(var3, var10, var15, 0, 0, -1, var4, var6, var7, var9, light(var20, var16), light(var20, var17), light(var20, var18), light(var20, var19), 0, 0, 0, 0, var22, 0);
                           } else {
                              var21 = this.m[var3][var10][var15] + 1;
                              byte var34 = this.u[var3][var10][var15];
                              Y_1 var29;
                              if ((var5 = (var29 = Y_1.a[var27 - 1]).b) == 137) {
                                 var5 = 25;
                              }

                              if (var5 > 50) {
                                 var5 = -1;
                              }

                              int var24;
                              int var25;
                              if (var5 >= 0) {
                                 var25 = uwotm8.Rasterizer3D.a(var5);
                                 var24 = -1;
                              } else if (var29.c == 16711935) {
                                 var25 = 0;
                                 var24 = -2;
                                 var5 = -1;
                              } else if (var29.c == 3355443) {
                                 var25 = uwotm8.Rasterizer3D.x[checkedLight(var29.l, 96)];
                                 var24 = -2;
                                 var5 = -1;
                              } else {
                                 var24 = encode(var29.f, var29.g, var29.h);
                                 var25 = uwotm8.Rasterizer3D.x[checkedLight(var29.l, 96)];
                              }

                              if (var25 == 0 && var29.e != -1) {
                                 var27 = encode(var29.i, var29.j, var29.k);
                                 var25 = uwotm8.Rasterizer3D.x[checkedLight(var27, 96)];
                              }

                              var2.a(var3, var10, var15, var21, var34, var5, var4, var6, var7, var9, light(var20, var16), light(var20, var17), light(var20, var18), light(var20, var19), checkedLight(var24, var16), checkedLight(var24, var17), checkedLight(var24, var18), checkedLight(var24, var19), var22, var25);
                           }
                        }
                     }
                  }
               }
            }

            for(var10 = 1; var10 < 103; ++var10) {
               for(var11 = 1; var11 < 103; ++var11) {
                  var2.setCollisionPlane(var3, var11, var10, this.getCollisionPlane(var10, var3, var11));
               }
            }
         }

         var2.m(-10, -50, -50);

         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if ((this.v[1][var3][var4] & 2) == 2) {
                  var2.a(var4, var3);
               }
            }
         }

         var3 = 1;
         var4 = 2;
         var5 = 4;

         for(var6 = 0; var6 < 4; ++var6) {
            if (var6 > 0) {
               var3 <<= 3;
               var4 <<= 3;
               var5 <<= 3;
            }

            for(var27 = 0; var27 <= var6; ++var27) {
               for(int var28 = 0; var28 <= 104; ++var28) {
                  for(var7 = 0; var7 <= 104; ++var7) {
                     if ((this.l[var27][var7][var28] & var3) != 0) {
                        var8 = var28;
                        var9 = var28;
                        var10 = var27;

                        for(var11 = var27; var8 > 0 && (this.l[var27][var7][var8 - 1] & var3) != 0; --var8) {
                           ;
                        }

                        while(var9 < 104 && (this.l[var27][var7][var9 + 1] & var3) != 0) {
                           ++var9;
                        }

                        label315:
                        while(var10 > 0) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if ((this.l[var10 - 1][var7][var12] & var3) == 0) {
                                 break label315;
                              }
                           }

                           --var10;
                        }

                        label304:
                        while(var11 < var6) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if ((this.l[var11 + 1][var7][var12] & var3) == 0) {
                                 break label304;
                              }
                           }

                           ++var11;
                        }

                        if ((var11 + 1 - var10) * (var9 - var8 + 1) >= 8) {
                           var13 = this.i[var11][var7][var8] - 240;
                           var14 = this.i[var10][var7][var8];
                           SceneGraph.a(var6, var7 << 7, var14, var7 << 7, (var9 << 7) + 128, var13, var8 << 7, 1);

                           for(var15 = var10; var15 <= var11; ++var15) {
                              for(var16 = var8; var16 <= var9; ++var16) {
                                 this.l[var15][var7][var16] &= ~var3;
                              }
                           }
                        }
                     }

                     if ((this.l[var27][var7][var28] & var4) != 0) {
                        var8 = var7;
                        var9 = var7;
                        var10 = var27;

                        for(var11 = var27; var8 > 0 && (this.l[var27][var8 - 1][var28] & var4) != 0; --var8) {
                           ;
                        }

                        while(var9 < 104 && (this.l[var27][var9 + 1][var28] & var4) != 0) {
                           ++var9;
                        }

                        label368:
                        while(var10 > 0) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if ((this.l[var10 - 1][var12][var28] & var4) == 0) {
                                 break label368;
                              }
                           }

                           --var10;
                        }

                        label357:
                        while(var11 < var6) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if ((this.l[var11 + 1][var12][var28] & var4) == 0) {
                                 break label357;
                              }
                           }

                           ++var11;
                        }

                        if ((var11 + 1 - var10) * (var9 - var8 + 1) >= 8) {
                           var13 = this.i[var11][var8][var28] - 240;
                           var14 = this.i[var10][var8][var28];
                           SceneGraph.a(var6, var8 << 7, var14, (var9 << 7) + 128, var28 << 7, var13, var28 << 7, 2);

                           for(var15 = var10; var15 <= var11; ++var15) {
                              for(var16 = var8; var16 <= var9; ++var16) {
                                 this.l[var15][var16][var28] &= ~var4;
                              }
                           }
                        }
                     }

                     if ((this.l[var27][var7][var28] & var5) != 0) {
                        var8 = var7;
                        var9 = var7;
                        var10 = var28;

                        for(var11 = var28; var10 > 0 && (this.l[var27][var7][var10 - 1] & var5) != 0; --var10) {
                           ;
                        }

                        while(var11 < 104 && (this.l[var27][var7][var11 + 1] & var5) != 0) {
                           ++var11;
                        }

                        label421:
                        while(var8 > 0) {
                           for(var12 = var10; var12 <= var11; ++var12) {
                              if ((this.l[var27][var8 - 1][var12] & var5) == 0) {
                                 break label421;
                              }
                           }

                           --var8;
                        }

                        label410:
                        while(var9 < 104) {
                           for(var12 = var10; var12 <= var11; ++var12) {
                              if ((this.l[var27][var9 + 1][var12] & var5) == 0) {
                                 break label410;
                              }
                           }

                           ++var9;
                        }

                        if ((var9 - var8 + 1) * (var11 - var10 + 1) >= 4) {
                           var12 = this.i[var27][var8][var10];
                           SceneGraph.a(var6, var8 << 7, var12, (var9 << 7) + 128, (var11 << 7) + 128, var12, var10 << 7, 4);

                           for(var8 = var8; var8 <= var9; ++var8) {
                              for(var13 = var10; var13 <= var11; ++var13) {
                                 this.l[var27][var8][var13] &= ~var5;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (Exception var26) {
         ;
      }
   }

   private static int c(int var0, int var1) {
      if ((var0 = (int)((double)(interpolatedNoise(var0 + 'ë', var1 + 91923, 4) - 128 + (interpolatedNoise(var0 + 10294, var1 + 'é', 2) - 128 >> 1) + (interpolatedNoise(var0, var1, 1) - 128 >> 2)) * 0.3D) + 35) < 10) {
         var0 = 10;
      } else if (var0 > 60) {
         var0 = 60;
      }

      return var0;
   }

   public static void decode(Buffer var0, ResourceProvider var1) {
      int var2 = -1;

      while(true) {
         int var3;
         ObjectDefinition var6;
         do {
            if ((var3 = var0.c()) == 0) {
               return;
            }
         } while((var6 = uwotm8.ObjectDefinition.decode(var2 += var3)) == null);

         ObjectDefinition var10000 = var6;
         ResourceProvider var4 = var1;
         var6 = var6;
         if (var10000.r != null) {
            for(int var5 = 0; var5 < var6.r.length; ++var5) {
               var4.b(var6.r[var5] & '\uffff', 0);
            }
         }

         while(var0.q() != 0) {
            var0.e();
         }
      }
   }

   public final void a(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var1 + var2; ++var5) {
         for(int var6 = var4; var6 <= var4 + var3; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               this.k[0][var6][var5] = 127;
               if (var6 == var4 && var6 > 0) {
                  this.i[0][var6][var5] = this.i[0][var6 - 1][var5];
               }

               if (var6 == var4 + var3 && var6 < 103) {
                  this.i[0][var6][var5] = this.i[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  this.i[0][var6][var5] = this.i[0][var6][var5 - 1];
               }

               if (var5 == var1 + var2 && var5 < 103) {
                  this.i[0][var6][var5] = this.i[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   private void placeObject(int var1, SceneGraph var2, CollisionMap var3, int var4, int var5, int var6, int var7, int var8) {
      if (c && (this.v[0][var6][var1] & 2) == 0) {
         if ((this.v[var5][var6][var1] & 16) != 0) {
            return;
         }

         if (this.getCollisionPlane(var1, var5, var6) != a) {
            return;
         }
      }

      if (var5 < b) {
         b = var5;
      }

      int var9 = this.i[var5][var6][var1];
      int var10 = this.i[var5][var6 + 1][var1];
      int var11 = this.i[var5][var6 + 1][var1 + 1];
      int var12 = this.i[var5][var6][var1 + 1];
      int var13 = var9 + var10 + var11 + var12 >> 2;
      ObjectDefinition var14;
      if ((var14 = uwotm8.ObjectDefinition.decode(var7)) != null) {
         int var15 = var6 + (var1 << 7) + (var7 << 14) + 1073741824;
         if (!var14.w) {
            var15 += Integer.MIN_VALUE;
         }

         byte var16 = (byte)((var8 << 6) + var4);
         Object var17;
         if (var4 == 22) {
            if (!c || var14.w || var14.b) {
               if (var14.z == -1 && var14.k == null) {
                  var17 = var14.modelAt(22, var8, var9, var10, var11, var12, -1);
               } else {
                  var17 = new RenderableObject(var7, var8, 22, var10, var11, var9, var12, var14.z, true);
               }

               var2.addFloorDecoration(var5, var13, var1, (Renderable)var17, var16, var15, var6);
               if (var14.p && var14.w && var3 != null) {
                  var3.block(var1, var6);
               }

            }
         } else {
            int var18;
            if (var4 != 10 && var4 != 11) {
               if (var4 >= 12) {
                  if (var14.z == -1 && var14.k == null) {
                     var17 = var14.modelAt(var4, var8, var9, var10, var11, var12, -1);
                  } else {
                     var17 = new RenderableObject(var7, var8, var4, var10, var11, var9, var12, var14.z, true);
                  }

                  var2.addObject(var15, var16, var13, 1, (Renderable)var17, 1, var5, 0, var1, var6);
                  if (var4 >= 12 && var4 <= 17 && var4 != 13 && var5 > 0) {
                     this.l[var5][var6][var1] |= 2340;
                  }

                  if (var14.p && var3 != null) {
                     var3.flagObject(var14.i, var14.d, var14.l, var6, var1, var8);
                  }

               } else if (var4 == 0) {
                  if (var14.z == -1 && var14.k == null) {
                     var17 = var14.modelAt(0, var8, var9, var10, var11, var12, -1);
                  } else {
                     var17 = new RenderableObject(var7, var8, 0, var10, var11, var9, var12, var14.z, true);
                  }

                  var2.addWall(w[var8], (Renderable)var17, var15, var1, var16, var6, (Renderable)null, var13, 0, var5);
                  if (var8 == 0) {
                     if (var14.x) {
                        this.k[var5][var6][var1] = 50;
                        this.k[var5][var6][var1 + 1] = 50;
                     }

                     if (var14.n) {
                        this.l[var5][var6][var1] |= 585;
                     }
                  } else if (var8 == 1) {
                     if (var14.x) {
                        this.k[var5][var6][var1 + 1] = 50;
                        this.k[var5][var6 + 1][var1 + 1] = 50;
                     }

                     if (var14.n) {
                        this.l[var5][var6][var1 + 1] |= 1170;
                     }
                  } else if (var8 == 2) {
                     if (var14.x) {
                        this.k[var5][var6 + 1][var1] = 50;
                        this.k[var5][var6 + 1][var1 + 1] = 50;
                     }

                     if (var14.n) {
                        this.l[var5][var6 + 1][var1] |= 585;
                     }
                  } else if (var8 == 3) {
                     if (var14.x) {
                        this.k[var5][var6][var1] = 50;
                        this.k[var5][var6 + 1][var1] = 50;
                     }

                     if (var14.n) {
                        this.l[var5][var6][var1] |= 1170;
                     }
                  }

                  if (var14.p && var3 != null) {
                     var3.flagObject(var1, var8, var6, var4, var14.i);
                  }

                  if (var14.t != 16) {
                     var2.displaceWallDecor(var1, var14.t, var6, var5);
                  }

               } else if (var4 == 1) {
                  if (var14.z == -1 && var14.k == null) {
                     var17 = var14.modelAt(1, var8, var9, var10, var11, var12, -1);
                  } else {
                     var17 = new RenderableObject(var7, var8, 1, var10, var11, var9, var12, var14.z, true);
                  }

                  var2.addWall(p[var8], (Renderable)var17, var15, var1, var16, var6, (Renderable)null, var13, 0, var5);
                  if (var14.x) {
                     if (var8 == 0) {
                        this.k[var5][var6][var1 + 1] = 50;
                     } else if (var8 == 1) {
                        this.k[var5][var6 + 1][var1 + 1] = 50;
                     } else if (var8 == 2) {
                        this.k[var5][var6 + 1][var1] = 50;
                     } else if (var8 == 3) {
                        this.k[var5][var6][var1] = 50;
                     }
                  }

                  if (var14.p && var3 != null) {
                     var3.flagObject(var1, var8, var6, var4, var14.i);
                  }

               } else {
                  int var21;
                  Object var24;
                  if (var4 == 2) {
                     var21 = var8 + 1 & 3;
                     Object var22;
                     if (var14.z == -1 && var14.k == null) {
                        var22 = var14.modelAt(2, var8 + 4, var9, var10, var11, var12, -1);
                        var24 = var14.modelAt(2, var21, var9, var10, var11, var12, -1);
                     } else {
                        var22 = new RenderableObject(var7, var8 + 4, 2, var10, var11, var9, var12, var14.z, true);
                        var24 = new RenderableObject(var7, var21, 2, var10, var11, var9, var12, var14.z, true);
                     }

                     var2.addWall(w[var8], (Renderable)var22, var15, var1, var16, var6, (Renderable)var24, var13, w[var21], var5);
                     if (var14.n) {
                        if (var8 == 0) {
                           this.l[var5][var6][var1] |= 585;
                           this.l[var5][var6][var1 + 1] |= 1170;
                        } else if (var8 == 1) {
                           this.l[var5][var6][var1 + 1] |= 1170;
                           this.l[var5][var6 + 1][var1] |= 585;
                        } else if (var8 == 2) {
                           this.l[var5][var6 + 1][var1] |= 585;
                           this.l[var5][var6][var1] |= 1170;
                        } else if (var8 == 3) {
                           this.l[var5][var6][var1] |= 1170;
                           this.l[var5][var6][var1] |= 585;
                        }
                     }

                     if (var14.p && var3 != null) {
                        var3.flagObject(var1, var8, var6, var4, var14.i);
                     }

                     if (var14.t != 16) {
                        var2.displaceWallDecor(var1, var14.t, var6, var5);
                     }

                  } else if (var4 == 3) {
                     if (var14.z == -1 && var14.k == null) {
                        var17 = var14.modelAt(3, var8, var9, var10, var11, var12, -1);
                     } else {
                        var17 = new RenderableObject(var7, var8, 3, var10, var11, var9, var12, var14.z, true);
                     }

                     var2.addWall(p[var8], (Renderable)var17, var15, var1, var16, var6, (Renderable)null, var13, 0, var5);
                     if (var14.x) {
                        if (var8 == 0) {
                           this.k[var5][var6][var1 + 1] = 50;
                        } else if (var8 == 1) {
                           this.k[var5][var6 + 1][var1 + 1] = 50;
                        } else if (var8 == 2) {
                           this.k[var5][var6 + 1][var1] = 50;
                        } else if (var8 == 3) {
                           this.k[var5][var6][var1] = 50;
                        }
                     }

                     if (var14.p && var3 != null) {
                        var3.flagObject(var1, var8, var6, var4, var14.i);
                     }

                  } else if (var4 == 9) {
                     if (var14.z == -1 && var14.k == null) {
                        var17 = var14.modelAt(var4, var8, var9, var10, var11, var12, -1);
                     } else {
                        var17 = new RenderableObject(var7, var8, var4, var10, var11, var9, var12, var14.z, true);
                     }

                     var2.addObject(var15, var16, var13, 1, (Renderable)var17, 1, var5, 0, var1, var6);
                     if (var14.p && var3 != null) {
                        var3.flagObject(var14.i, var14.d, var14.l, var6, var1, var8);
                     }

                  } else {
                     if (var14.m) {
                        if (var8 == 1) {
                           var21 = var12;
                           var12 = var11;
                           var11 = var10;
                           var10 = var9;
                           var9 = var21;
                        } else if (var8 == 2) {
                           var21 = var12;
                           var12 = var10;
                           var10 = var21;
                           var21 = var11;
                           var11 = var9;
                           var9 = var21;
                        } else if (var8 == 3) {
                           var21 = var12;
                           var12 = var9;
                           var9 = var10;
                           var10 = var11;
                           var11 = var21;
                        }
                     }

                     if (var4 == 4) {
                        if (var14.z == -1 && var14.k == null) {
                           var17 = var14.modelAt(4, 0, var9, var10, var11, var12, -1);
                        } else {
                           var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.z, true);
                        }

                        var2.addWallDecoration(var15, var1, var8 << 9, var5, 0, var13, (Renderable)var17, var6, var16, 0, w[var8]);
                     } else if (var4 == 5) {
                        var21 = 16;
                        ObjectDefinition var23;
                        if ((var18 = var2.getWallKey(var5, var6, var1)) > 0 && (var23 = uwotm8.ObjectDefinition.decode(var18 >> 14 & 32767)) != null) {
                           var21 = var23.t;
                        }

                        if (var14.z == -1 && var14.k == null) {
                           var24 = var14.modelAt(4, 0, var9, var10, var11, var12, -1);
                        } else {
                           var24 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.z, true);
                        }

                        var2.addWallDecoration(var15, var1, var8 << 9, var5, n[var8] * var21, var13, (Renderable)var24, var6, var16, r[var8] * var21, w[var8]);
                     } else if (var4 == 6) {
                        if (var14.z == -1 && var14.k == null) {
                           var17 = var14.modelAt(4, 0, var9, var10, var11, var12, -1);
                        } else {
                           var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.z, true);
                        }

                        var2.addWallDecoration(var15, var1, var8, var5, 0, var13, (Renderable)var17, var6, var16, 0, 256);
                     } else if (var4 == 7) {
                        if (var14.z == -1 && var14.k == null) {
                           var17 = var14.modelAt(4, 0, var9, var10, var11, var12, -1);
                        } else {
                           var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.z, true);
                        }

                        var2.addWallDecoration(var15, var1, var8, var5, 0, var13, (Renderable)var17, var6, var16, 0, 512);
                     } else {
                        if (var4 == 8) {
                           if (var14.z == -1 && var14.k == null) {
                              var17 = var14.modelAt(4, 0, var9, var10, var11, var12, -1);
                           } else {
                              var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.z, true);
                           }

                           var2.addWallDecoration(var15, var1, var8, var5, 0, var13, (Renderable)var17, var6, var16, 0, 768);
                        }

                     }
                  }
               }
            } else {
               if (var14.z == -1 && var14.k == null) {
                  var17 = var14.modelAt(10, var8, var9, var10, var11, var12, -1);
               } else {
                  var17 = new RenderableObject(var7, var8, 10, var10, var11, var9, var12, var14.z, true);
               }

               if (var17 != null) {
                  var18 = 0;
                  if (var4 == 11) {
                     var18 += 256;
                  }

                  int var19;
                  if (var8 != 1 && var8 != 3) {
                     var19 = var14.d;
                     var4 = var14.l;
                  } else {
                     var19 = var14.l;
                     var4 = var14.d;
                  }

                  if (var2.addObject(var15, var16, var13, var4, (Renderable)var17, var19, var5, var18, var1, var6) && var14.x) {
                     Model var20;
                     if (var17 instanceof Model) {
                        var20 = (Model)var17;
                     } else {
                        var20 = var14.modelAt(10, var8, var9, var10, var11, var12, -1);
                     }

                     if (var20 != null) {
                        for(var7 = 0; var7 <= var19; ++var7) {
                           for(var9 = 0; var9 <= var4; ++var9) {
                              if ((var10 = var20.p / 4) > 30) {
                                 var10 = 30;
                              }

                              if (var10 > this.k[var5][var6 + var7][var1 + var9]) {
                                 this.k[var5][var6 + var7][var1 + var9] = (byte)var10;
                              }
                           }
                        }
                     }
                  }
               }

               if (var14.p && var3 != null) {
                  var3.flagObject(var14.i, var14.d, var14.l, var6, var1, var8);
               }

            }
         }
      }
   }

   private static int interpolatedNoise(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      var0 &= var2 - 1;
      int var4 = var1 / var2;
      var1 &= var2 - 1;
      int var5 = smoothNoise(var3, var4);
      int var6 = smoothNoise(var3 + 1, var4);
      int var7 = smoothNoise(var3, var4 + 1);
      var3 = smoothNoise(var3 + 1, var4 + 1);
      var4 = interpolate(var5, var6, var0, var2);
      var0 = interpolate(var7, var3, var0, var2);
      return interpolate(var4, var0, var1, var2);
   }

   private static int encode(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
   }

   public static boolean modelReady(int var0, int var1) {
      ObjectDefinition var3 = uwotm8.ObjectDefinition.decode(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      ObjectDefinition var10000 = var3;
      var1 = var1;
      var3 = var3;
      if (var10000.u == null) {
         if (var3.r == null) {
            return true;
         } else if (var1 != 10) {
            return true;
         } else {
            boolean var4 = true;

            for(var1 = 0; var1 < var3.r.length; ++var1) {
               var4 &= Model.b(var3.r[var1] & '\uffff');
            }

            return var4;
         }
      } else {
         for(int var2 = 0; var2 < var3.u.length; ++var2) {
            if (var3.u[var2] == var1) {
               return Model.b(var3.r[var2] & '\uffff');
            }
         }

         return true;
      }
   }

   public final void decodeConstructedMapData(int var1, int var2, CollisionMap[] var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if (var4 + var10 > 0 && var4 + var10 < 103 && var9 + var11 > 0 && var9 + var11 < 103) {
               var3[var8].a[var4 + var10][var9 + var11] &= -16777217;
            }
         }
      }

      Buffer var17 = new Buffer(var6);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var15 = 0; var15 < 64; ++var15) {
            for(int var16 = 0; var16 < 64; ++var16) {
               if (var11 == var1 && var15 >= var5 && var15 < var5 + 8 && var16 >= var7 && var16 < var7 + 8) {
                  int var10003 = var15 & 7;
                  int var14 = var16 & 7;
                  int var13 = var10003;
                  int var12;
                  int var10001 = var9 + ((var12 = var2 & 3) == 0 ? var14 : (var12 == 1 ? 7 - var13 : (var12 == 2 ? 7 - var14 : var13)));
                  int var10006 = var15 & 7;
                  var14 = var16 & 7;
                  var13 = var10006;
                  this.decodeMapData(var10001, 0, var17, var4 + ((var12 = var2 & 3) == 0 ? var13 : (var12 == 1 ? var14 : (var12 == 2 ? 7 - var13 : 7 - var14))), var8, var2, 0);
               } else {
                  this.decodeMapData(-1, 0, var17, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   public final void decodeRegionMapData(byte[] var1, int var2, int var3, int var4, int var5, CollisionMap[] var6) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var3 + var8 > 0 && var3 + var8 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
                  var6[var7].a[var3 + var8][var2 + var9] &= -16777217;
               }
            }
         }
      }

      Buffer var11 = new Buffer(var1);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               this.decodeMapData(var10 + var2, var5, var11, var9 + var3, var8, 0, var4);
            }
         }
      }

   }

   private void decodeMapData(int var1, int var2, Buffer var3, int var4, int var5, int var6, int var7) {
      try {
         int var8;
         if (var4 >= 0 && var4 < 104 && var1 >= 0 && var1 < 104) {
            this.v[var5][var4][var1] = 0;

            while((var8 = var3.e()) != 0) {
               if (var8 == 1) {
                  if ((var2 = var3.e()) == 1) {
                     var2 = 0;
                  }

                  if (var5 == 0) {
                     this.i[0][var4][var1] = -var2 << 3;
                     return;
                  }

                  this.i[var5][var4][var1] = this.i[var5 - 1][var4][var1] - (var2 << 3);
                  return;
               }

               if (var8 <= 49) {
                  this.j[var5][var4][var1] = var3.f();
                  this.m[var5][var4][var1] = (byte)((var8 - 2) / 4);
                  this.u[var5][var4][var1] = (byte)(var8 - 2 + var6 & 3);
               } else if (var8 <= 81) {
                  this.v[var5][var4][var1] = (byte)(var8 - 49);
               } else {
                  this.q[var5][var4][var1] = (byte)(var8 - 81);
               }
            }

            if (var5 == 0) {
               this.i[0][var4][var1] = -c(var4 + 932731 + var7, var1 + 556238 + var2) << 3;
               return;
            }

            this.i[var5][var4][var1] = this.i[var5 - 1][var4][var1] - 240;
            return;
         }

         while((var8 = var3.e()) != 0) {
            if (var8 == 1) {
               var3.e();
               return;
            }

            if (var8 <= 49) {
               var3.e();
            }
         }
      } catch (Exception var9) {
         ;
      }

   }

   private int getCollisionPlane(int var1, int var2, int var3) {
      if ((this.v[var2][var3][var1] & 8) != 0) {
         return 0;
      } else {
         return var2 > 0 && (this.v[1][var3][var1] & 2) != 0 ? var2 - 1 : var2;
      }
   }

   public final void decodeConstructedLandscapes(CollisionMap[] var1, SceneGraph var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      Buffer var25 = new Buffer(var7);
      int var11 = -1;

      int var12;
      label121:
      while((var12 = var25.c()) != 0) {
         var11 += var12;
         var12 = 0;

         while(true) {
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            ObjectDefinition var18;
            do {
               do {
                  do {
                     do {
                        do {
                           do {
                              if ((var13 = var25.q()) == 0) {
                                 continue label121;
                              }

                              var13 = (var12 += var13 - 1) & 63;
                              var14 = var12 >> 6 & 63;
                              var15 = var12 >> 12;
                              var17 = (var16 = var25.e()) >> 2;
                              var16 &= 3;
                           } while(var15 != var3);
                        } while(var14 < var8);
                     } while(var14 >= var8 + 8);
                  } while(var13 < var5);
               } while(var13 >= var5 + 8);
            } while((var18 = uwotm8.ObjectDefinition.decode(var11)) == null);

            int var10002 = var16 != 0 && var16 != 2 ? var18.d : var18.l;
            int var10003 = var14 & 7;
            int var10004 = var13 & 7;
            int var24 = var16 != 0 && var16 != 2 ? var18.l : var18.d;
            int var23 = var10004;
            int var22 = var10003;
            int var21 = var10002;
            int var20;
            int var19 = var4 + ((var20 = var9 & 3) == 0 ? var22 : (var20 == 1 ? var23 : (var20 == 2 ? 7 - var22 - (var24 - 1) : 7 - var23 - (var21 - 1))));
            int var10001 = var13 & 7;
            var10002 = var16 != 0 && var16 != 2 ? var18.d : var18.l;
            var10004 = var16 != 0 && var16 != 2 ? var18.l : var18.d;
            var24 = var14 & 7;
            var23 = var10004;
            var21 = var10002;
            var20 = var10001;
            var13 = var10 + ((var22 = var9 & 3) == 0 ? var20 : (var22 == 1 ? 7 - var24 - (var23 - 1) : (var22 == 2 ? 7 - var20 - (var21 - 1) : var24)));
            if (var19 > 0 && var13 > 0 && var19 < 103 && var13 < 103) {
               var14 = var15;
               if ((this.v[1][var19][var13] & 2) == 2) {
                  var14 = var15 - 1;
               }

               CollisionMap var26 = null;
               if (var14 >= 0) {
                  var26 = var1[var6];
               }

               this.placeObject(var13, var2, var26, var17, var6, var19, var11, var16 + var9 & 3);
            }
         }
      }

   }

   private static int interpolate(int var0, int var1, int var2, int var3) {
      var2 = 65536 - uwotm8.Rasterizer3D.s[(var2 << 10) / var3] >> 1;
      return (var0 * (65536 - var2) >> 16) + (var1 * var2 >> 16);
   }

   private static int checkedLight(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         return var1 = 127 - var1;
      } else {
         if ((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ï') + var1;
      }
   }

   private static int smoothNoise(int var0, int var1) {
      int var2 = perlinNoise(var0 - 1, var1 - 1) + perlinNoise(var0 + 1, var1 - 1) + perlinNoise(var0 - 1, var1 + 1) + perlinNoise(var0 + 1, var1 + 1);
      int var3 = perlinNoise(var0 - 1, var1) + perlinNoise(var0 + 1, var1) + perlinNoise(var0, var1 - 1) + perlinNoise(var0, var1 + 1);
      var0 = perlinNoise(var0, var1);
      return var2 / 16 + var3 / 8 + var0 / 4;
   }

   private static int light(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         if ((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ï') + var1;
      }
   }

   public static void placeObject(SceneGraph var0, int var1, int var2, int var3, int var4, CollisionMap var5, int[][][] var6, int var7, int var8, int var9) {
      int var10 = var6[var4][var7][var2];
      int var11 = var6[var4][var7 + 1][var2];
      int var12 = var6[var4][var7 + 1][var2 + 1];
      var4 = var6[var4][var7][var2 + 1];
      int var19 = var10 + var11 + var12 + var4 >> 2;
      ObjectDefinition var13;
      if ((var13 = uwotm8.ObjectDefinition.decode(var8)) != null) {
         int var14 = var7 + (var2 << 7) + (var8 << 14) + 1073741824;
         if (!var13.w) {
            var14 += Integer.MIN_VALUE;
         }

         byte var15 = (byte)((var1 << 6) + var3);
         Object var16;
         if (var3 == 22) {
            if (var13.z == -1 && var13.k == null) {
               var16 = var13.modelAt(22, var1, var10, var11, var12, var4, -1);
            } else {
               var16 = new RenderableObject(var8, var1, 22, var11, var12, var10, var4, var13.z, true);
            }

            var0.addFloorDecoration(var9, var19, var2, (Renderable)var16, var15, var14, var7);
            if (var13.p && var13.w) {
               var5.block(var2, var7);
            }

         } else {
            int var17;
            if (var3 != 10 && var3 != 11) {
               if (var3 >= 12) {
                  if (var13.z == -1 && var13.k == null) {
                     var16 = var13.modelAt(var3, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new RenderableObject(var8, var1, var3, var11, var12, var10, var4, var13.z, true);
                  }

                  var0.addObject(var14, var15, var19, 1, (Renderable)var16, 1, var9, 0, var2, var7);
                  if (var13.p) {
                     var5.flagObject(var13.i, var13.d, var13.l, var7, var2, var1);
                  }

               } else if (var3 == 0) {
                  if (var13.z == -1 && var13.k == null) {
                     var16 = var13.modelAt(0, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new RenderableObject(var8, var1, 0, var11, var12, var10, var4, var13.z, true);
                  }

                  var0.addWall(w[var1], (Renderable)var16, var14, var2, var15, var7, (Renderable)null, var19, 0, var9);
                  if (var13.p) {
                     var5.flagObject(var2, var1, var7, var3, var13.i);
                  }

               } else if (var3 == 1) {
                  if (var13.z == -1 && var13.k == null) {
                     var16 = var13.modelAt(1, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new RenderableObject(var8, var1, 1, var11, var12, var10, var4, var13.z, true);
                  }

                  var0.addWall(p[var1], (Renderable)var16, var14, var2, var15, var7, (Renderable)null, var19, 0, var9);
                  if (var13.p) {
                     var5.flagObject(var2, var1, var7, var3, var13.i);
                  }

               } else {
                  int var20;
                  Object var23;
                  if (var3 == 2) {
                     var20 = var1 + 1 & 3;
                     Object var21;
                     if (var13.z == -1 && var13.k == null) {
                        var21 = var13.modelAt(2, var1 + 4, var10, var11, var12, var4, -1);
                        var23 = var13.modelAt(2, var20, var10, var11, var12, var4, -1);
                     } else {
                        var21 = new RenderableObject(var8, var1 + 4, 2, var11, var12, var10, var4, var13.z, true);
                        var23 = new RenderableObject(var8, var20, 2, var11, var12, var10, var4, var13.z, true);
                     }

                     var0.addWall(w[var1], (Renderable)var21, var14, var2, var15, var7, (Renderable)var23, var19, w[var20], var9);
                     if (var13.p) {
                        var5.flagObject(var2, var1, var7, var3, var13.i);
                     }

                  } else if (var3 == 3) {
                     if (var13.z == -1 && var13.k == null) {
                        var16 = var13.modelAt(3, var1, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new RenderableObject(var8, var1, 3, var11, var12, var10, var4, var13.z, true);
                     }

                     var0.addWall(p[var1], (Renderable)var16, var14, var2, var15, var7, (Renderable)null, var19, 0, var9);
                     if (var13.p) {
                        var5.flagObject(var2, var1, var7, var3, var13.i);
                     }

                  } else if (var3 == 9) {
                     if (var13.z == -1 && var13.k == null) {
                        var16 = var13.modelAt(var3, var1, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new RenderableObject(var8, var1, var3, var11, var12, var10, var4, var13.z, true);
                     }

                     var0.addObject(var14, var15, var19, 1, (Renderable)var16, 1, var9, 0, var2, var7);
                     if (var13.p) {
                        var5.flagObject(var13.i, var13.d, var13.l, var7, var2, var1);
                     }

                  } else {
                     if (var13.m) {
                        if (var1 == 1) {
                           var20 = var4;
                           var4 = var12;
                           var12 = var11;
                           var11 = var10;
                           var10 = var20;
                        } else if (var1 == 2) {
                           var20 = var4;
                           var4 = var11;
                           var11 = var20;
                           var20 = var12;
                           var12 = var10;
                           var10 = var20;
                        } else if (var1 == 3) {
                           var20 = var4;
                           var4 = var10;
                           var10 = var11;
                           var11 = var12;
                           var12 = var20;
                        }
                     }

                     if (var3 == 4) {
                        if (var13.z == -1 && var13.k == null) {
                           var16 = var13.modelAt(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.z, true);
                        }

                        var0.addWallDecoration(var14, var2, var1 << 9, var9, 0, var19, (Renderable)var16, var7, var15, 0, w[var1]);
                     } else if (var3 == 5) {
                        var20 = 16;
                        ObjectDefinition var22;
                        if ((var17 = var0.getWallKey(var9, var7, var2)) > 0 && (var22 = uwotm8.ObjectDefinition.decode(var17 >> 14 & 32767)) != null) {
                           var20 = var22.t;
                        }

                        if (var13.z == -1 && var13.k == null) {
                           var23 = var13.modelAt(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var23 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.z, true);
                        }

                        var0.addWallDecoration(var14, var2, var1 << 9, var9, n[var1] * var20, var19, (Renderable)var23, var7, var15, r[var1] * var20, w[var1]);
                     } else if (var3 == 6) {
                        if (var13.z == -1 && var13.k == null) {
                           var16 = var13.modelAt(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.z, true);
                        }

                        var0.addWallDecoration(var14, var2, var1, var9, 0, var19, (Renderable)var16, var7, var15, 0, 256);
                     } else if (var3 == 7) {
                        if (var13.z == -1 && var13.k == null) {
                           var16 = var13.modelAt(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.z, true);
                        }

                        var0.addWallDecoration(var14, var2, var1, var9, 0, var19, (Renderable)var16, var7, var15, 0, 512);
                     } else {
                        if (var3 == 8) {
                           if (var13.z == -1 && var13.k == null) {
                              var16 = var13.modelAt(4, 0, var10, var11, var12, var4, -1);
                           } else {
                              var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.z, true);
                           }

                           var0.addWallDecoration(var14, var2, var1, var9, 0, var19, (Renderable)var16, var7, var15, 0, 768);
                        }

                     }
                  }
               }
            } else {
               if (var13.z == -1 && var13.k == null) {
                  var16 = var13.modelAt(10, var1, var10, var11, var12, var4, -1);
               } else {
                  var16 = new RenderableObject(var8, var1, 10, var11, var12, var10, var4, var13.z, true);
               }

               if (var16 != null) {
                  var17 = 0;
                  if (var3 == 11) {
                     var17 += 256;
                  }

                  int var18;
                  if (var1 != 1 && var1 != 3) {
                     var18 = var13.d;
                     var3 = var13.l;
                  } else {
                     var18 = var13.l;
                     var3 = var13.d;
                  }

                  var0.addObject(var14, var15, var19, var3, (Renderable)var16, var18, var9, var17, var2, var7);
               }

               if (var13.p) {
                  var5.flagObject(var13.i, var13.d, var13.l, var7, var2, var1);
               }

            }
         }
      }
   }

   public static boolean objectsReady(int var0, byte[] var1, int var2) {
      boolean var3 = true;
      Buffer var10 = new Buffer(var1);
      int var4 = -1;

      int var5;
      label65:
      while((var5 = var10.q()) != 0) {
         var4 += var5;
         var5 = 0;
         boolean var6 = false;

         while(true) {
            while(!var6) {
               int var7;
               if ((var7 = var10.q()) == 0) {
                  continue label65;
               }

               var7 = (var5 += var7 - 1) & 63;
               int var8 = var5 >> 6 & 63;
               int var9 = var10.e() >> 2;
               var8 += var0;
               var7 += var2;
               ObjectDefinition var12;
               if (var8 > 0 && var7 > 0 && var8 < 103 && var7 < 103 && (var12 = uwotm8.ObjectDefinition.decode(var4)) != null && (var9 != 22 || !c || var12.w || var12.b)) {
                  ObjectDefinition var11 = var12;
                  boolean var10001;
                  if (var12.r == null) {
                     var10001 = true;
                  } else {
                     var6 = true;

                     for(var7 = 0; var7 < var11.r.length; ++var7) {
                        var6 &= Model.b(var11.r[var7] & '\uffff');
                     }

                     var10001 = var6;
                  }

                  var3 &= var10001;
                  var6 = true;
               }
            }

            if (var10.q() == 0) {
               break;
            }

            var10.e();
         }
      }

      return var3;
   }

   public final void decodeLandscapes(int var1, CollisionMap[] var2, int var3, SceneGraph var4, byte[] var5) {
      Buffer var15 = new Buffer(var5);
      int var6 = -1;

      int var7;
      while((var7 = var15.q()) != 0) {
         var6 += var7;
         var7 = 0;

         int var8;
         while((var8 = var15.q()) != 0) {
            var8 = (var7 += var8 - 1) & 63;
            int var9 = var7 >> 6 & 63;
            int var10 = var7 >> 12;
            int var11;
            int var12 = (var11 = var15.e()) >> 2;
            var11 &= 3;
            var9 += var1;
            var8 += var3;
            if (var9 > 0 && var8 > 0 && var9 < 103 && var8 < 103 && var10 >= 0 && var10 < 4) {
               int var13 = var10;
               if ((this.v[1][var9][var8] & 2) == 2) {
                  var13 = var10 - 1;
               }

               CollisionMap var14 = null;
               if (var13 >= 0) {
                  var14 = var2[var13];
               }

               this.placeObject(var8, var4, var14, var12, var10, var9, var6, var11);
            }
         }
      }

   }
}

package uwotm8;

import com.runescape.Client;

public final class Model extends Renderable {
   private static String F = "Cla";
   private static String G = "at Cl";
   private static String H = "nt";
   private boolean I;
   public static Model a;
   private static int[] J;
   private static int[] K;
   private static int[] L;
   private static int[] M;
   public int b;
   public int[] c;
   public int[] d;
   public int[] e;
   public int f;
   public int[] g;
   public int[] h;
   public int[] i;
   private int[] N;
   private int[] O;
   private int[] P;
   public int[] j;
   private int[] Q;
   private int[] R;
   public int[] k;
   private int S;
   private int T;
   private int[] U;
   private int[] V;
   private int[] W;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   private int[] X;
   private int[] Y;
   public int[][] u;
   public int[][] v;
   public boolean w;
   public F_1[] x;
   private static E_1[] Z;
   private static byte[] aa;
   private static ag ab;
   private static boolean[] ac;
   private static boolean[] ad;
   private static int[] ae;
   private static int[] af;
   private static int[] ag;
   private static int[] ah;
   private static int[] ai;
   private static int[] aj;
   private static int[] ak;
   private static int[][] al;
   private static int[] am;
   private static int[][] an;
   private static int[] ao;
   private static int[] ap;
   private static int[] aq;
   private static int[] ar;
   private static int[] as;
   private static int[] at;
   private static int au;
   private static int av;
   private static int aw;
   public static boolean y;
   public static int z;
   public static int A;
   public static int B;
   public static int[] C;
   public static int[] D;
   public static int[] E;
   private static int[] ax;
   private static int[] ay;

   static {
      (new StringBuilder()).append(F).append("n Ch").append(G).append("ie").append(H).append(" ");
      a = new Model(true);
      J = new int[2500];
      K = new int[2500];
      L = new int[2500];
      M = new int[2500];
      ac = new boolean[8192];
      ad = new boolean[8192];
      ae = new int[8192];
      af = new int[8192];
      ag = new int[8192];
      ah = new int[8192];
      ai = new int[8192];
      aj = new int[8192];
      ak = new int[1600];
      al = new int[1600][512];
      am = new int[12];
      an = new int[12][2500];
      ao = new int[2500];
      ap = new int[2500];
      aq = new int[12];
      ar = new int[10];
      as = new int[10];
      at = new int[10];
      C = new int[1000];
      D = uwotm8.Rasterizer3D.r;
      E = uwotm8.Rasterizer3D.s;
      ax = uwotm8.Rasterizer3D.x;
      ay = uwotm8.Rasterizer3D.q;
   }

   public static void b() {
      Z = null;
      ac = null;
      ad = null;
      af = null;
      ag = null;
      ah = null;
      ai = null;
      aj = null;
      ak = null;
      al = null;
      am = null;
      an = null;
      ao = null;
      ap = null;
      aq = null;
      D = null;
      E = null;
      ax = null;
      ay = null;
   }

   private Model(int var1) {
      byte[] var2;
      int var3;
      int var4;
      Buffer var6;
      Buffer var7;
      Buffer var8;
      Buffer var9;
      Buffer var10;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var18;
      Model var169;
      boolean var171;
      if ((var2 = Z[var1].a)[var2.length - 1] == -1 && var2[var2.length - 2] == -1) {
         var169 = this;
         Buffer var172 = new Buffer(var2);
         var6 = new Buffer(var2);
         var7 = new Buffer(var2);
         var8 = new Buffer(var2);
         var9 = new Buffer(var2);
         var10 = new Buffer(var2);
         Buffer var173 = new Buffer(var2);
         var172.b = var2.length - 23;
         var12 = var172.g();
         var13 = var172.g();
         var14 = var172.e();
         E_1 var174;
         (var174 = Z[var1] = new E_1()).a = var2;
         var174.b = var12;
         var174.c = var13;
         var174.d = var14;
         var16 = var172.e();
         boolean var175 = ~(1 & var16) == -2;
         if ((8 & var16) != 8) {
        	 Model var88 = this;
            Buffer var91 = new Buffer(var2);
            Buffer var92 = new Buffer(var2);
            Buffer var93 = new Buffer(var2);
            Buffer var94 = new Buffer(var2);
            Buffer var95 = new Buffer(var2);
            Buffer var96 = new Buffer(var2);
            Buffer var97 = new Buffer(var2);
            var91.b = var2.length - 23;
            int var98 = var91.g();
            int var99 = var91.g();
            int var100 = var91.e();
            E_1 var101;
            (var101 = Z[var1] = new E_1()).a = var2;
            var101.b = var98;
            var101.c = var99;
            var101.d = var100;
            int var102 = var91.e();
            boolean var103 = ~(1 & var102) == -2;
            int var104 = var91.e();
            int var105 = var91.e();
            int var106 = var91.e();
            int var107 = var91.e();
            int var108 = var91.e();
            int var109 = var91.g();
            int var110 = var91.g();
            int var111 = var91.g();
            int var112 = var91.g();
            int var113 = var91.g();
            int var114 = 0;
            int var115 = 0;
            int var116 = 0;
            byte[] var117 = null;
            byte[] var118 = null;
            byte[] var119 = null;
            byte[] var120 = null;
            byte[] var121 = null;
            byte[] var122 = null;
            byte[] var123 = null;
            int[] var124 = null;
            int[] var125 = null;
            int[] var126 = null;
            short[] var127 = null;
            int var129;
            if (var100 > 0) {
               var118 = new byte[var100];
               var91.b = 0;

               for(var129 = 0; var129 < var100; ++var129) {
                  byte var130;
                  if ((var130 = var118[var129] = var91.f()) == 0) {
                     ++var114;
                  }

                  if (var130 > 0 && var130 <= 3) {
                     ++var115;
                  }

                  if (var130 == 2) {
                     ++var116;
                  }
               }
            }

            int var131 = var129 = var100 + var98;
            if (var102 == 1) {
               var129 += var99;
            }

            int var132 = var129;
            int var133 = var129 += var99;
            if (var104 == 255) {
               var129 += var99;
            }

            int var134 = var129;
            if (var106 == 1) {
               var129 += var99;
            }

            int var135 = var129;
            if (var108 == 1) {
               var129 += var98;
            }

            int var136 = var129;
            if (var105 == 1) {
               var129 += var99;
            }

            int var137 = var129;
            int var138 = var129 += var112;
            if (var107 == 1) {
               var129 += var99 << 1;
            }

            int var139 = var129;
            int var140 = var129 += var113;
            int var141 = var129 += var99 << 1;
            int var142 = var129 += var109;
            int var143 = var129 += var110;
            int var144 = var129 += var111;
            int var145 = var129 += var114 * 6;
            int var146 = var129 += var115 * 6;
            int var147 = var129 += var115 * 6;
            int var148 = var129 += var115;
            int var149 = var129 + var115;
            int[] var150 = new int[var98];
            int[] var151 = new int[var98];
            int[] var152 = new int[var98];
            int[] var153 = new int[var99];
            int[] var154 = new int[var99];
            int[] var155 = new int[var99];
            this.X = new int[var98];
            this.j = new int[var99];
            this.Q = new int[var99];
            this.R = new int[var99];
            this.Y = new int[var99];
            if (var108 == 1) {
               this.X = new int[var98];
            }

            if (var103) {
               this.j = new int[var99];
            }

            if (var104 == 255) {
               this.Q = new int[var99];
            }

            if (var105 == 1) {
               this.R = new int[var99];
            }

            if (var106 == 1) {
               this.Y = new int[var99];
            }

            if (var107 == 1) {
               var127 = new short[var99];
            }

            if (var107 == 1 && var100 > 0) {
               var117 = new byte[var99];
            }

            int[] var128 = new int[var99];
            int[] var156 = null;
            int[] var157 = null;
            int[] var158 = null;
            if (var100 > 0) {
               var156 = new int[var100];
               var157 = new int[var100];
               var158 = new int[var100];
               if (var115 > 0) {
                  var124 = new int[var115];
                  var126 = new int[var115];
                  var125 = new int[var115];
                  var122 = new byte[var115];
                  var123 = new byte[var115];
                  var120 = new byte[var115];
               }

               if (var116 > 0) {
                  var121 = new byte[var116];
                  var119 = new byte[var116];
               }
            }

            var91.b = var100;
            var92.b = var141;
            var93.b = var142;
            var94.b = var143;
            var95.b = var135;
            int var159 = 0;
            int var160 = 0;
            int var161 = 0;

            int var162;
            int var163;
            int var164;
            int var165;
            int var166;
            for(var162 = 0; var162 < var98; ++var162) {
               var163 = var91.e();
               var164 = 0;
               if ((var163 & 1) != 0) {
                  var164 = var92.p();
               }

               var165 = 0;
               if ((var163 & 2) != 0) {
                  var165 = var93.p();
               }

               var166 = 0;
               if ((var163 & 4) != 0) {
                  var166 = var94.p();
               }

               var150[var162] = var159 + var164;
               var151[var162] = var160 + var165;
               var152[var162] = var161 + var166;
               var159 = var150[var162];
               var160 = var151[var162];
               var161 = var152[var162];
               if (var88.X != null) {
                  var88.X[var162] = var95.e();
               }
            }

            var91.b = var140;
            var92.b = var131;
            var93.b = var133;
            var94.b = var136;
            var95.b = var134;
            var96.b = var138;
            var97.b = var139;

            for(var162 = 0; var162 < var99; ++var162) {
               var128[var162] = var91.g();
               if (var102 == 1) {
                  var88.j[var162] = var92.f();
                  if (var88.j[var162] == 2) {
                     var128[var162] = 65535;
                  }

                  var88.j[var162] = 0;
               }

               if (var104 == 255) {
                  var88.Q[var162] = var93.f();
               }

               if (var105 == 1) {
                  var88.R[var162] = var94.f();
                  if (var88.R[var162] < 0) {
                     var88.R[var162] += 256;
                  }
               }

               if (var106 == 1) {
                  var88.Y[var162] = var95.e();
               }

               if (var107 == 1) {
                  var127[var162] = (short)(var96.g() - 1);
               }

               if (var117 != null) {
                  if (var127[var162] != -1) {
                     var117[var162] = (byte)(var97.e() - 1);
                  } else {
                     var117[var162] = -1;
                  }
               }
            }

            var91.b = var137;
            var92.b = var132;
            var162 = 0;
            var163 = 0;
            var164 = 0;
            var165 = 0;

            int var167;
            for(var166 = 0; var166 < var99; ++var166) {
               if ((var167 = var92.e()) == 1) {
                  var165 = var162 = var91.p() + var165;
                  var165 = var163 = var91.p() + var165;
                  var165 = var164 = var91.p() + var165;
                  var153[var166] = var162;
                  var154[var166] = var163;
                  var155[var166] = var164;
               }

               if (var167 == 2) {
                  var163 = var164;
                  var165 = var164 = var91.p() + var165;
                  var153[var166] = var162;
                  var154[var166] = var163;
                  var155[var166] = var164;
               }

               if (var167 == 3) {
                  var162 = var164;
                  var165 = var164 = var91.p() + var165;
                  var153[var166] = var162;
                  var154[var166] = var163;
                  var155[var166] = var164;
               }

               if (var167 == 4) {
                  int var168 = var162;
                  var162 = var163;
                  var163 = var168;
                  var165 = var164 = var91.p() + var165;
                  var153[var166] = var162;
                  var154[var166] = var168;
                  var155[var166] = var164;
               }
            }

            var91.b = var144;
            var92.b = var145;
            var93.b = var146;
            var94.b = var147;
            var95.b = var148;
            var96.b = var149;

            for(var166 = 0; var166 < var100; ++var166) {
               if ((var167 = var118[var166] & 255) == 0) {
                  var156[var166] = var91.g();
                  var157[var166] = var91.g();
                  var158[var166] = var91.g();
               }

               if (var167 == 1) {
                  var156[var166] = var92.g();
                  var157[var166] = var92.g();
                  var158[var166] = var92.g();
                  var124[var166] = var93.g();
                  var126[var166] = var93.g();
                  var125[var166] = var93.g();
                  var122[var166] = var94.f();
                  var123[var166] = var95.f();
                  var120[var166] = var96.f();
               }

               if (var167 == 2) {
                  var156[var166] = var92.g();
                  var157[var166] = var92.g();
                  var158[var166] = var92.g();
                  var124[var166] = var93.g();
                  var126[var166] = var93.g();
                  var125[var166] = var93.g();
                  var122[var166] = var94.f();
                  var123[var166] = var95.f();
                  var120[var166] = var96.f();
                  var121[var166] = var96.f();
                  var119[var166] = var96.f();
               }

               if (var167 == 3) {
                  var156[var166] = var92.g();
                  var157[var166] = var92.g();
                  var158[var166] = var92.g();
                  var124[var166] = var93.g();
                  var126[var166] = var93.g();
                  var125[var166] = var93.g();
                  var122[var166] = var94.f();
                  var123[var166] = var95.f();
                  var120[var166] = var96.f();
               }
            }

            if (var104 != 255) {
               for(var166 = 0; var166 < var99; ++var166) {
                  var88.Q[var166] = var104;
               }
            }

            var88.k = var128;
            var88.b = var98;
            var88.f = var99;
            var88.c = var150;
            var88.d = var151;
            var88.e = var152;
            var88.g = var153;
            var88.h = var154;
            var88.i = var155;
         } else {
            var171 = false;
            var172.b -= 7;
            var3 = var172.e();
            var172.b += 6;
            if (var3 == 15) {
               aa[var1] = 1;
            }

            var4 = var172.e();
            var15 = var172.e();
            var18 = var172.e();
            int var19 = var172.e();
            int var20 = var172.e();
            int var21 = var172.g();
            int var22 = var172.g();
            int var23 = var172.g();
            int var24 = var172.g();
            int var25 = var172.g();
            int var26 = 0;
            int var27 = 0;
            int var28 = 0;
            byte[] var29 = null;
            byte[] var30 = null;
            byte[] var31 = null;
            byte[] var32 = null;
            byte[] var33 = null;
            byte[] var34 = null;
            byte[] var35 = null;
            int[] var36 = null;
            int[] var37 = null;
            int[] var38 = null;
            short[] var39 = null;
            int var40;
            if (var14 > 0) {
               var30 = new byte[var14];
               var172.b = 0;

               for(var40 = 0; var40 < var14; ++var40) {
                  byte var41;
                  if ((var41 = var30[var40] = var172.f()) == 0) {
                     ++var26;
                  }

                  if (var41 > 0 && var41 <= 3) {
                     ++var27;
                  }

                  if (var41 == 2) {
                     ++var28;
                  }
               }
            }

            int var42 = var40 = var14 + var12;
            if (var175) {
               var40 += var13;
            }

            if (var16 == 1) {
               var40 += var13;
            }

            int var43 = var40;
            int var44 = var40 += var13;
            if (var4 == 255) {
               var40 += var13;
            }

            int var45 = var40;
            if (var18 == 1) {
               var40 += var13;
            }

            int var46 = var40;
            if (var20 == 1) {
               var40 += var12;
            }

            int var47 = var40;
            if (var15 == 1) {
               var40 += var13;
            }

            int var48 = var40;
            var24 = var40 += var24;
            if (var19 == 1) {
               var40 += var13 << 1;
            }

            int var49 = var40;
            var25 = var40 += var25;
            int var50 = var40 += var13 << 1;
            var21 = var40 += var21;
            var22 = var40 += var22;
            var23 = var40 += var23;
            var26 = var40 += var26 * 6;
            var40 += var27 * 6;
            byte var64 = 6;
            if (var3 != 14) {
               if (var3 >= 15) {
                  var64 = 9;
               }
            } else {
               var64 = 7;
            }

            int var65 = var40;
            int var66 = var40 += var64 * var27;
            int var67 = var40 += var27;
            int var68 = var40 + var27;
            int[] var69 = new int[var12];
            int[] var70 = new int[var12];
            int[] var71 = new int[var12];
            int[] var72 = new int[var13];
            int[] var73 = new int[var13];
            int[] var74 = new int[var13];
            this.X = new int[var12];
            this.j = new int[var13];
            this.Q = new int[var13];
            this.R = new int[var13];
            this.Y = new int[var13];
            if (var20 == 1) {
               this.X = new int[var12];
            }

            if (var175) {
               this.j = new int[var13];
            }

            if (var4 == 255) {
               this.Q = new int[var13];
            }

            if (var15 == 1) {
               this.R = new int[var13];
            }

            if (var18 == 1) {
               this.Y = new int[var13];
            }

            if (var19 == 1) {
               var39 = new short[var13];
            }

            if (var19 == 1 && var14 > 0) {
               var29 = new byte[var13];
            }

            int[] var176 = new int[var13];
            int[] var75 = null;
            int[] var76 = null;
            int[] var77 = null;
            if (var14 > 0) {
               var75 = new int[var14];
               var76 = new int[var14];
               var77 = new int[var14];
               if (var27 > 0) {
                  var36 = new int[var27];
                  var38 = new int[var27];
                  var37 = new int[var27];
                  var34 = new byte[var27];
                  var35 = new byte[var27];
                  var32 = new byte[var27];
               }

               if (var28 > 0) {
                  var33 = new byte[var28];
                  var31 = new byte[var28];
               }
            }

            var172.b = var14;
            var6.b = var50;
            var7.b = var21;
            var8.b = var22;
            var9.b = var46;
            int var78 = 0;
            int var79 = 0;
            int var80 = 0;

            int var81;
            int var82;
            int var83;
            int var84;
            int var85;
            for(var81 = 0; var81 < var12; ++var81) {
               var82 = var172.e();
               var83 = 0;
               if ((var82 & 1) != 0) {
                  var83 = var6.p();
               }

               var84 = 0;
               if ((var82 & 2) != 0) {
                  var84 = var7.p();
               }

               var85 = 0;
               if ((var82 & 4) != 0) {
                  var85 = var8.p();
               }

               var69[var81] = var78 + var83;
               var70[var81] = var79 + var84;
               var71[var81] = var80 + var85;
               var78 = var69[var81];
               var79 = var70[var81];
               var80 = var71[var81];
               if (var169.X != null) {
                  var169.X[var81] = var9.e();
               }
            }

            var172.b = var25;
            var6.b = var42;
            var7.b = var44;
            var8.b = var47;
            var9.b = var45;
            var10.b = var24;
            var173.b = var49;

            for(var81 = 0; var81 < var13; ++var81) {
               var176[var81] = var172.g();
               if (var16 == 1) {
                  var169.j[var81] = var6.f();
                  if (var169.j[var81] == 2) {
                     var176[var81] = 65535;
                  }

                  var169.j[var81] = 0;
               }

               if (var4 == 255) {
                  var169.Q[var81] = var7.f();
               }

               if (var15 == 1) {
                  var169.R[var81] = var8.f();
                  if (var169.R[var81] < 0) {
                     var169.R[var81] += 256;
                  }
               }

               if (var18 == 1) {
                  var169.Y[var81] = var9.e();
               }

               if (var19 == 1) {
                  var39[var81] = (short)(var10.g() - 1);
               }

               if (var29 != null) {
                  if (var39[var81] != -1) {
                     var29[var81] = (byte)(var173.e() - 1);
                  } else {
                     var29[var81] = -1;
                  }
               }
            }

            var172.b = var48;
            var6.b = var43;
            var81 = 0;
            var82 = 0;
            var83 = 0;
            var84 = 0;

            int var86;
            for(var85 = 0; var85 < var13; ++var85) {
               if ((var86 = var6.e()) == 1) {
                  var84 = var81 = var172.p() + var84;
                  var84 = var82 = var172.p() + var84;
                  var84 = var83 = var172.p() + var84;
                  var72[var85] = var81;
                  var73[var85] = var82;
                  var74[var85] = var83;
               }

               if (var86 == 2) {
                  var82 = var83;
                  var84 = var83 = var172.p() + var84;
                  var72[var85] = var81;
                  var73[var85] = var82;
                  var74[var85] = var83;
               }

               if (var86 == 3) {
                  var81 = var83;
                  var84 = var83 = var172.p() + var84;
                  var72[var85] = var81;
                  var73[var85] = var82;
                  var74[var85] = var83;
               }

               if (var86 == 4) {
                  int var87 = var81;
                  var81 = var82;
                  var82 = var87;
                  var84 = var83 = var172.p() + var84;
                  var72[var85] = var81;
                  var73[var85] = var87;
                  var74[var85] = var83;
               }
            }

            var172.b = var23;
            var6.b = var26;
            var7.b = var65;
            var8.b = var66;
            var9.b = var67;
            var10.b = var68;

            for(var85 = 0; var85 < var14; ++var85) {
               if ((var86 = var30[var85] & 255) == 0) {
                  var75[var85] = var172.g();
                  var76[var85] = var172.g();
                  var77[var85] = var172.g();
               }

               if (var86 == 1) {
                  var75[var85] = var6.g();
                  var76[var85] = var6.g();
                  var77[var85] = var6.g();
                  if (var3 < 15) {
                     var36[var85] = var7.g();
                     if (var3 >= 14) {
                        var38[var85] = var7.b();
                     } else {
                        var38[var85] = var7.g();
                     }

                     var37[var85] = var7.g();
                  } else {
                     var36[var85] = var7.b();
                     var38[var85] = var7.b();
                     var37[var85] = var7.b();
                  }

                  var34[var85] = var8.f();
                  var35[var85] = var9.f();
                  var32[var85] = var10.f();
               }

               if (var86 == 2) {
                  var75[var85] = var6.g();
                  var76[var85] = var6.g();
                  var77[var85] = var6.g();
                  if (var3 >= 15) {
                     var36[var85] = var7.b();
                     var38[var85] = var7.b();
                     var37[var85] = var7.b();
                  } else {
                     var36[var85] = var7.g();
                     if (var3 < 14) {
                        var38[var85] = var7.g();
                     } else {
                        var38[var85] = var7.b();
                     }

                     var37[var85] = var7.g();
                  }

                  var34[var85] = var8.f();
                  var35[var85] = var9.f();
                  var32[var85] = var10.f();
                  var33[var85] = var10.f();
                  var31[var85] = var10.f();
               }

               if (var86 == 3) {
                  var75[var85] = var6.g();
                  var76[var85] = var6.g();
                  var77[var85] = var6.g();
                  if (var3 < 15) {
                     var36[var85] = var7.g();
                     if (var3 < 14) {
                        var38[var85] = var7.g();
                     } else {
                        var38[var85] = var7.b();
                     }

                     var37[var85] = var7.g();
                  } else {
                     var36[var85] = var7.b();
                     var38[var85] = var7.b();
                     var37[var85] = var7.b();
                  }

                  var34[var85] = var8.f();
                  var35[var85] = var9.f();
                  var32[var85] = var10.f();
               }
            }

            if (var4 != 255) {
               for(var85 = 0; var85 < var13; ++var85) {
                  var169.Q[var85] = var4;
               }
            }

            var169.k = var176;
            var169.b = var12;
            var169.f = var13;
            var169.c = var69;
            var169.d = var70;
            var169.e = var71;
            var169.g = var72;
            var169.h = var73;
            var169.i = var74;
         }
      } else {
         var169 = this;
         this.I = true;
         this.w = false;
         E_1 var5 = Z[var1];
         this.b = var5.b;
         this.f = var5.c;
         this.T = var5.d;
         this.c = new int[this.b];
         this.d = new int[this.b];
         this.e = new int[this.b];
         this.g = new int[this.f];
         this.h = new int[this.f];
         this.i = new int[this.f];
         this.U = new int[this.T];
         this.V = new int[this.T];
         this.W = new int[this.T];
         if (var5.i >= 0) {
            this.X = new int[this.b];
         }

         if (var5.m >= 0) {
            this.j = new int[this.f];
         }

         if (var5.n >= 0) {
            this.Q = new int[this.f];
         } else {
            this.S = -var5.n - 1;
         }

         if (var5.o >= 0) {
            this.R = new int[this.f];
         }

         if (var5.p >= 0) {
            this.Y = new int[this.f];
         }

         this.k = new int[this.f];
         (var6 = new Buffer(var5.a)).b = 0;
         (var7 = new Buffer(var5.a)).b = var5.f;
         (var8 = new Buffer(var5.a)).b = var5.g;
         (var9 = new Buffer(var5.a)).b = var5.h;
         (var10 = new Buffer(var5.a)).b = var5.i;
         int var11 = 0;
         var12 = 0;
         var13 = 0;

         int var17;
         for(var14 = 0; var14 < var169.b; ++var14) {
            var15 = var6.e();
            var16 = 0;
            if ((var15 & 1) != 0) {
               var16 = var7.p();
            }

            var17 = 0;
            if ((var15 & 2) != 0) {
               var17 = var8.p();
            }

            var18 = 0;
            if ((var15 & 4) != 0) {
               var18 = var9.p();
            }

            var169.c[var14] = var11 + var16;
            var169.d[var14] = var12 + var17;
            var169.e[var14] = var13 + var18;
            var11 = var169.c[var14];
            var12 = var169.d[var14];
            var13 = var169.e[var14];
            if (var169.X != null) {
               var169.X[var14] = var10.e();
            }
         }

         var6.b = var5.l;
         var7.b = var5.m;
         var8.b = var5.n;
         var9.b = var5.o;
         var10.b = var5.p;

         for(var14 = 0; var14 < var169.f; ++var14) {
            var169.k[var14] = var6.g();
            if (var169.j != null) {
               var169.j[var14] = var7.e();
            }

            if (var169.Q != null) {
               var169.Q[var14] = var8.e();
            }

            if (var169.R != null) {
               var169.R[var14] = var9.e();
            }

            if (var169.Y != null) {
               var169.Y[var14] = var10.e();
            }
         }

         var6.b = var5.j;
         var7.b = var5.k;
         var14 = 0;
         var15 = 0;
         var16 = 0;
         var17 = 0;

         for(var18 = 0; var18 < var169.f; ++var18) {
            if ((var3 = var7.e()) == 1) {
               var17 = var14 = var6.p() + var17;
               var17 = var15 = var6.p() + var17;
               var17 = var16 = var6.p() + var17;
               var169.g[var18] = var14;
               var169.h[var18] = var15;
               var169.i[var18] = var16;
            }

            if (var3 == 2) {
               var15 = var16;
               var17 = var16 = var6.p() + var17;
               var169.g[var18] = var14;
               var169.h[var18] = var15;
               var169.i[var18] = var16;
            }

            if (var3 == 3) {
               var14 = var16;
               var17 = var16 = var6.p() + var17;
               var169.g[var18] = var14;
               var169.h[var18] = var15;
               var169.i[var18] = var16;
            }

            if (var3 == 4) {
               var4 = var14;
               var14 = var15;
               var15 = var4;
               var17 = var16 = var6.p() + var17;
               var169.g[var18] = var14;
               var169.h[var18] = var4;
               var169.i[var18] = var16;
            }
         }

         var6.b = var5.q;

         for(var18 = 0; var18 < var169.T; ++var18) {
            var169.U[var18] = var6.g();
            var169.V[var18] = var6.g();
            var169.W[var18] = var6.g();
         }
      }

      if (aa[var1] == 1) {
         var171 = true;
         var169 = this;

         for(var4 = 0; var4 < var169.b; ++var4) {
            var169.c[var4] /= 4;
            var169.d[var4] /= 4;
            var169.e[var4] /= 4;
         }

         if (this.Q != null) {
            for(var1 = 0; var1 < this.Q.length; ++var1) {
               this.Q[var1] = 10;
            }
         }
      }

   }

   public static void a(int var0, ag var1) {
      Z = new E_1[var0];
      aa = new byte[var0];
      ab = var1;
   }

   public static void a(byte[] var0, int var1) {
      try {
         if (var0 == null) {
            E_1 var14;
            (var14 = Z[var1] = new E_1()).b = 0;
            var14.c = 0;
            var14.d = 0;
         } else {
            Buffer var2;
            (var2 = new Buffer(var0)).b = var0.length - 18;
            E_1 var12;
            (var12 = Z[var1] = new E_1()).a = var0;
            var12.b = var2.g();
            var12.c = var2.g();
            var12.d = var2.e();
            int var11 = var2.e();
            int var3 = var2.e();
            int var4 = var2.e();
            int var5 = var2.e();
            int var6 = var2.e();
            int var7 = var2.g();
            int var8 = var2.g();
            var2.g();
            int var13 = var2.g();
            var12.e = 0;
            int var9 = 0 + var12.b;
            var12.k = var9;
            var9 += var12.c;
            var12.n = var9;
            if (var3 == 255) {
               var9 += var12.c;
            } else {
               var12.n = -var3 - 1;
            }

            var12.p = var9;
            if (var5 == 1) {
               var9 += var12.c;
            } else {
               var12.p = -1;
            }

            var12.m = var9;
            if (var11 == 1) {
               var9 += var12.c;
            } else {
               var12.m = -1;
            }

            var12.i = var9;
            if (var6 == 1) {
               var9 += var12.b;
            } else {
               var12.i = -1;
            }

            var12.o = var9;
            if (var4 == 1) {
               var9 += var12.c;
            } else {
               var12.o = -1;
            }

            var12.j = var9;
            var9 += var13;
            var12.l = var9;
            var9 += var12.c << 1;
            var12.q = var9;
            var9 += var12.d * 6;
            var12.f = var9;
            var9 += var7;
            var12.g = var9;
            var9 += var8;
            var12.h = var9;
         }
      } catch (Exception var10) {
         ;
      }
   }

   public static Model a(int var0) {
      if (Z != null && var0 != -1 && var0 < Z.length) {
         if (Z[var0] == null) {
            ab.a(var0);
            return null;
         } else {
            return new Model(var0);
         }
      } else {
         return null;
      }
   }

   public static boolean b(int var0) {
      if (Z == null) {
         return false;
      } else if (Z[var0] == null) {
         ab.a(var0);
         return false;
      } else {
         return true;
      }
   }

   private Model(boolean var1) {
      this.I = true;
      this.w = false;
   }

   public Model(int var1, Model[] var2) {
      this.I = true;
      this.w = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.b = 0;
      this.f = 0;
      this.T = 0;
      this.S = -1;

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
    	  Model var8;
         if ((var8 = var2[var7]) != null) {
            this.b += var8.b;
            this.f += var8.f;
            this.T += var8.T;
            var3 |= var8.j != null;
            if (var8.Q != null) {
               var4 = true;
            } else {
               if (this.S == -1) {
                  this.S = var8.S;
               }

               if (this.S != var8.S) {
                  var4 = true;
               }
            }

            var5 |= var8.R != null;
            var6 |= var8.Y != null;
         }
      }

      this.c = new int[this.b];
      this.d = new int[this.b];
      this.e = new int[this.b];
      this.X = new int[this.b];
      this.g = new int[this.f];
      this.h = new int[this.f];
      this.i = new int[this.f];
      this.U = new int[this.T];
      this.V = new int[this.T];
      this.W = new int[this.T];
      if (var3) {
         this.j = new int[this.f];
      }

      if (var4) {
         this.Q = new int[this.f];
      }

      if (var5) {
         this.R = new int[this.f];
      }

      if (var6) {
         this.Y = new int[this.f];
      }

      this.k = new int[this.f];
      this.b = 0;
      this.f = 0;
      this.T = 0;
      var7 = 0;

      for(int var12 = 0; var12 < var1; ++var12) {
    	  Model var9;
         if ((var9 = var2[var12]) != null) {
            int var10;
            for(var10 = 0; var10 < var9.f; ++var10) {
               if (var3) {
                  if (var9.j == null) {
                     this.j[this.f] = 0;
                  } else {
                     int var11;
                     if (((var11 = var9.j[var10]) & 2) == 2) {
                        var11 += var7 << 2;
                     }

                     this.j[this.f] = var11;
                  }
               }

               if (var4) {
                  if (var9.Q == null) {
                     this.Q[this.f] = var9.S;
                  } else {
                     this.Q[this.f] = var9.Q[var10];
                  }
               }

               if (var5) {
                  if (var9.R == null) {
                     this.R[this.f] = 0;
                  } else {
                     this.R[this.f] = var9.R[var10];
                  }
               }

               if (var6 && var9.Y != null) {
                  this.Y[this.f] = var9.Y[var10];
               }

               this.k[this.f] = var9.k[var10];
               this.g[this.f] = this.a(var9, var9.g[var10]);
               this.h[this.f] = this.a(var9, var9.h[var10]);
               this.i[this.f] = this.a(var9, var9.i[var10]);
               ++this.f;
            }

            for(var10 = 0; var10 < var9.T; ++var10) {
               this.U[this.T] = this.a(var9, var9.U[var10]);
               this.V[this.T] = this.a(var9, var9.V[var10]);
               this.W[this.T] = this.a(var9, var9.W[var10]);
               ++this.T;
            }

            var7 += var9.T;
         }
      }

   }

   public Model(Model[] var1) {
      this.I = true;
      this.w = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      this.b = 0;
      this.f = 0;
      this.T = 0;
      this.S = -1;

      int var6;
      for(var6 = 0; var6 < 2; ++var6) {
    	  Model var7;
         if ((var7 = var1[var6]) != null) {
            this.b += var7.b;
            this.f += var7.f;
            this.T += var7.T;
            var2 |= var7.j != null;
            if (var7.Q != null) {
               var3 = true;
            } else {
               if (this.S == -1) {
                  this.S = var7.S;
               }

               if (this.S != var7.S) {
                  var3 = true;
               }
            }

            var4 |= var7.R != null;
            var5 |= var7.k != null;
         }
      }

      this.c = new int[this.b];
      this.d = new int[this.b];
      this.e = new int[this.b];
      this.g = new int[this.f];
      this.h = new int[this.f];
      this.i = new int[this.f];
      this.N = new int[this.f];
      this.O = new int[this.f];
      this.P = new int[this.f];
      this.U = new int[this.T];
      this.V = new int[this.T];
      this.W = new int[this.T];
      if (var2) {
         this.j = new int[this.f];
      }

      if (var3) {
         this.Q = new int[this.f];
      }

      if (var4) {
         this.R = new int[this.f];
      }

      if (var5) {
         this.k = new int[this.f];
      }

      this.b = 0;
      this.f = 0;
      this.T = 0;
      var6 = 0;

      for(int var12 = 0; var12 < 2; ++var12) {
    	  Model var8;
         if ((var8 = var1[var12]) != null) {
            int var9 = this.b;

            int var10;
            for(var10 = 0; var10 < var8.b; ++var10) {
               this.c[this.b] = var8.c[var10];
               this.d[this.b] = var8.d[var10];
               this.e[this.b] = var8.e[var10];
               ++this.b;
            }

            for(var10 = 0; var10 < var8.f; ++var10) {
               this.g[this.f] = var8.g[var10] + var9;
               this.h[this.f] = var8.h[var10] + var9;
               this.i[this.f] = var8.i[var10] + var9;
               this.N[this.f] = var8.N[var10];
               this.O[this.f] = var8.O[var10];
               this.P[this.f] = var8.P[var10];
               if (var2) {
                  if (var8.j == null) {
                     this.j[this.f] = 0;
                  } else {
                     int var11;
                     if (((var11 = var8.j[var10]) & 2) == 2) {
                        var11 += var6 << 2;
                     }

                     this.j[this.f] = var11;
                  }
               }

               if (var3) {
                  if (var8.Q == null) {
                     this.Q[this.f] = var8.S;
                  } else {
                     this.Q[this.f] = var8.Q[var10];
                  }
               }

               if (var4) {
                  if (var8.R == null) {
                     this.R[this.f] = 0;
                  } else {
                     this.R[this.f] = var8.R[var10];
                  }
               }

               if (var5 && var8.k != null) {
                  this.k[this.f] = var8.k[var10];
               }

               ++this.f;
            }

            for(var10 = 0; var10 < var8.T; ++var10) {
               this.U[this.T] = var8.U[var10] + var9;
               this.V[this.T] = var8.V[var10] + var9;
               this.W[this.T] = var8.W[var10] + var9;
               ++this.T;
            }

            var6 += var8.T;
         }
      }

      this.c();
   }

   public Model(boolean var1, boolean var2, boolean var3, Model var4) {
      this.I = true;
      this.w = false;
      this.b = var4.b;
      this.f = var4.f;
      this.T = var4.T;
      int var5;
      if (var3) {
         this.c = var4.c;
         this.d = var4.d;
         this.e = var4.e;
      } else {
         this.c = new int[this.b];
         this.d = new int[this.b];
         this.e = new int[this.b];

         for(var5 = 0; var5 < this.b; ++var5) {
            this.c[var5] = var4.c[var5];
            this.d[var5] = var4.d[var5];
            this.e[var5] = var4.e[var5];
         }
      }

      if (var1) {
         this.k = var4.k;
      } else {
         this.k = new int[this.f];

         for(var5 = 0; var5 < this.f; ++var5) {
            this.k[var5] = var4.k[var5];
         }
      }

      if (var2) {
         this.R = var4.R;
      } else {
         this.R = new int[this.f];
         if (var4.R == null) {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.R[var5] = 0;
            }
         } else {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.R[var5] = var4.R[var5];
            }
         }
      }

      this.X = var4.X;
      this.Y = var4.Y;
      this.j = var4.j;
      this.g = var4.g;
      this.h = var4.h;
      this.i = var4.i;
      this.Q = var4.Q;
      this.S = var4.S;
      this.U = var4.U;
      this.V = var4.V;
      this.W = var4.W;
   }

   public Model(boolean var1, boolean var2, Model var3) {
      this.I = true;
      this.w = false;
      this.b = var3.b;
      this.f = var3.f;
      this.T = var3.T;
      int var5;
      if (var1) {
         this.d = new int[this.b];

         for(var5 = 0; var5 < this.b; ++var5) {
            this.d[var5] = var3.d[var5];
         }
      } else {
         this.d = var3.d;
      }

      if (var2) {
         this.N = new int[this.f];
         this.O = new int[this.f];
         this.P = new int[this.f];

         for(var5 = 0; var5 < this.f; ++var5) {
            this.N[var5] = var3.N[var5];
            this.O[var5] = var3.O[var5];
            this.P[var5] = var3.P[var5];
         }

         this.j = new int[this.f];
         if (var3.j == null) {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.j[var5] = 0;
            }
         } else {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.j[var5] = var3.j[var5];
            }
         }

         super.aC = new F_1[this.b];

         for(var5 = 0; var5 < this.b; ++var5) {
            F_1 var6 = super.aC[var5] = new F_1();
            F_1 var4 = var3.aC[var5];
            var6.a = var4.a;
            var6.b = var4.b;
            var6.c = var4.c;
            var6.d = var4.d;
         }

         this.x = var3.x;
      } else {
         this.N = var3.N;
         this.O = var3.O;
         this.P = var3.P;
         this.j = var3.j;
      }

      this.c = var3.c;
      this.e = var3.e;
      this.k = var3.k;
      this.R = var3.R;
      this.Q = var3.Q;
      this.S = var3.S;
      this.g = var3.g;
      this.h = var3.h;
      this.i = var3.i;
      this.U = var3.U;
      this.V = var3.V;
      this.W = var3.W;
      super.aD = var3.aD;
      this.p = var3.p;
      this.s = var3.s;
      this.r = var3.r;
      this.l = var3.l;
      this.n = var3.n;
      this.o = var3.o;
      this.m = var3.m;
   }

   public final void a(Model var1, boolean var2) {
      this.b = var1.b;
      this.f = var1.f;
      this.T = var1.T;
      if (J.length < this.b) {
         J = new int[this.b + 10000];
         K = new int[this.b + 10000];
         L = new int[this.b + 10000];
      }

      this.c = J;
      this.d = K;
      this.e = L;

      int var3;
      for(var3 = 0; var3 < this.b; ++var3) {
         this.c[var3] = var1.c[var3];
         this.d[var3] = var1.d[var3];
         this.e[var3] = var1.e[var3];
      }

      if (var2) {
         this.R = var1.R;
      } else {
         if (M.length < this.f) {
            M = new int[this.f + 100];
         }

         this.R = M;
         if (var1.R == null) {
            for(var3 = 0; var3 < this.f; ++var3) {
               this.R[var3] = 0;
            }
         } else {
            for(var3 = 0; var3 < this.f; ++var3) {
               this.R[var3] = var1.R[var3];
            }
         }
      }

      this.j = var1.j;
      this.k = var1.k;
      this.Q = var1.Q;
      this.S = var1.S;
      this.v = var1.v;
      this.u = var1.u;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.N = var1.N;
      this.O = var1.O;
      this.P = var1.P;
      this.U = var1.U;
      this.V = var1.V;
      this.W = var1.W;
   }

   private final int a(Model var1, int var2) {
      int var3 = -1;
      int var4 = var1.c[var2];
      int var5 = var1.d[var2];
      int var6 = var1.e[var2];

      for(int var7 = 0; var7 < this.b; ++var7) {
         if (var4 == this.c[var7] && var5 == this.d[var7] && var6 == this.e[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.c[this.b] = var4;
         this.d[this.b] = var5;
         this.e[this.b] = var6;
         if (var1.X != null) {
            this.X[this.b] = var1.X[var2];
         }

         var3 = this.b++;
      }

      return var3;
   }

   public final void c() {
      super.aD = 0;
      this.p = 0;
      this.q = 0;

      for(int var1 = 0; var1 < this.b; ++var1) {
         int var2 = this.c[var1];
         int var3 = this.d[var1];
         int var4 = this.e[var1];
         if (-var3 > super.aD) {
            super.aD = -var3;
         }

         if (var3 > this.q) {
            this.q = var3;
         }

         if ((var2 = var2 * var2 + var4 * var4) > this.p) {
            this.p = var2;
         }
      }

      this.p = (int)(Math.sqrt((double)this.p) + 0.99D);
      this.s = (int)(Math.sqrt((double)(this.p * this.p + super.aD * super.aD)) + 0.99D);
      this.r = this.s + (int)(Math.sqrt((double)(this.p * this.p + this.q * this.q)) + 0.99D);
   }

   private void d(int var1) {
      super.aD = 0;
      this.p = 0;
      this.q = 0;
      this.l = 999999;
      this.m = -999999;
      this.n = -99999;
      this.o = 99999;

      for(var1 = 0; var1 < this.b; ++var1) {
         int var2 = this.c[var1];
         int var3 = this.d[var1];
         int var4 = this.e[var1];
         if (var2 < this.l) {
            this.l = var2;
         }

         if (var2 > this.m) {
            this.m = var2;
         }

         if (var4 < this.o) {
            this.o = var4;
         }

         if (var4 > this.n) {
            this.n = var4;
         }

         if (-var3 > super.aD) {
            super.aD = -var3;
         }

         if (var3 > this.q) {
            this.q = var3;
         }

         if ((var2 = var2 * var2 + var4 * var4) > this.p) {
            this.p = var2;
         }
      }

      this.p = (int)Math.sqrt((double)this.p);
      this.s = (int)Math.sqrt((double)(this.p * this.p + super.aD * super.aD));
      this.r = this.s + (int)Math.sqrt((double)(this.p * this.p + this.q * this.q));
   }

   public final void d() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if (this.X != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.b; ++var3) {
            var4 = this.X[var3];
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.u = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.u[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.b; this.u[var4][var1[var4]++] = var3++) {
            var4 = this.X[var3];
         }

         this.X = null;
      }

      if (this.Y != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.f; ++var3) {
            var4 = this.Y[var3];
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.v = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.v[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.f; this.v[var4][var1[var4]++] = var3++) {
            var4 = this.Y[var3];
         }

         this.Y = null;
      }

   }

   public final void c(int var1) {
      if (this.u != null) {
         if (var1 != -1) {
            Frame var5;
            if ((var5 = uwotm8.Frame.a(var1)) != null) {
               FrameBase var2 = var5.a;
               au = 0;
               av = 0;
               aw = 0;

               for(int var3 = 0; var3 < var5.b; ++var3) {
                  int var4 = var5.c[var3];
                  this.a(var2.a[var4], var2.b[var4], var5.d[var3], var5.e[var3], var5.f[var3]);
               }

            }
         }
      }
   }

   public final void a(int[] var1, int var2, int var3) {
      if (var3 != -1) {
         if (var1 != null && var2 != -1) {
            Frame var4;
            if ((var4 = uwotm8.Frame.a(var3)) != null) {
               Frame var9;
               if ((var9 = uwotm8.Frame.a(var2)) == null) {
                  this.c(var3);
               } else {
                  FrameBase var10 = var4.a;
                  au = 0;
                  av = 0;
                  aw = 0;
                  byte var5 = 0;
                  int var11 = var5 + 1;
                  int var6 = var1[0];

                  int var7;
                  int var8;
                  for(var7 = 0; var7 < var4.b; ++var7) {
                     for(var8 = var4.c[var7]; var8 > var6; var6 = var1[var11++]) {
                        ;
                     }

                     if (var8 != var6 || var10.a[var8] == 0) {
                        this.a(var10.a[var8], var10.b[var8], var4.d[var7], var4.e[var7], var4.f[var7]);
                     }
                  }

                  au = 0;
                  av = 0;
                  aw = 0;
                  var5 = 0;
                  var11 = var5 + 1;
                  var6 = var1[0];

                  for(var7 = 0; var7 < var9.b; ++var7) {
                     for(var8 = var9.c[var7]; var8 > var6; var6 = var1[var11++]) {
                        ;
                     }

                     if (var8 == var6 || var10.a[var8] == 0) {
                        this.a(var10.a[var8], var10.b[var8], var9.d[var7], var9.e[var7], var9.f[var7]);
                     }
                  }

               }
            }
         } else {
            this.c(var3);
         }
      }
   }

   private void a(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var10;
      int var11;
      if (var1 == 0) {
         var1 = 0;
         au = 0;
         av = 0;
         aw = 0;

         for(var7 = 0; var7 < var6; ++var7) {
            int var15;
            if ((var15 = var2[var7]) < this.u.length) {
               int[] var16 = this.u[var15];

               for(var10 = 0; var10 < var16.length; ++var10) {
                  var11 = var16[var10];
                  au += this.c[var11];
                  av += this.d[var11];
                  aw += this.e[var11];
                  ++var1;
               }
            }
         }

         if (var1 > 0) {
            au = au / var1 + var3;
            av = av / var1 + var4;
            aw = aw / var1 + var5;
         } else {
            au = var3;
            av = var4;
            aw = var5;
         }
      } else {
         int[] var8;
         int var9;
         if (var1 == 1) {
            for(var1 = 0; var1 < var6; ++var1) {
               if ((var7 = var2[var1]) < this.u.length) {
                  var8 = this.u[var7];

                  for(var9 = 0; var9 < var8.length; ++var9) {
                     var10 = var8[var9];
                     this.c[var10] += var3;
                     this.d[var10] += var4;
                     this.e[var10] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var1 = 0; var1 < var6; ++var1) {
               if ((var7 = var2[var1]) < this.u.length) {
                  var8 = this.u[var7];

                  for(var9 = 0; var9 < var8.length; ++var9) {
                     var10 = var8[var9];
                     this.c[var10] -= au;
                     this.d[var10] -= av;
                     this.e[var10] -= aw;
                     var11 = (var3 & 255) << 3;
                     var7 = (var4 & 255) << 3;
                     int var12;
                     int var13;
                     int var14;
                     if ((var12 = (var5 & 255) << 3) != 0) {
                        var13 = D[var12];
                        var12 = E[var12];
                        var14 = this.d[var10] * var13 + this.c[var10] * var12 >> 16;
                        this.d[var10] = this.d[var10] * var12 - this.c[var10] * var13 >> 16;
                        this.c[var10] = var14;
                     }

                     if (var11 != 0) {
                        var13 = D[var11];
                        var12 = E[var11];
                        var14 = this.d[var10] * var12 - this.e[var10] * var13 >> 16;
                        this.e[var10] = this.d[var10] * var13 + this.e[var10] * var12 >> 16;
                        this.d[var10] = var14;
                     }

                     if (var7 != 0) {
                        var13 = D[var7];
                        var12 = E[var7];
                        var14 = this.e[var10] * var13 + this.c[var10] * var12 >> 16;
                        this.e[var10] = this.e[var10] * var12 - this.c[var10] * var13 >> 16;
                        this.c[var10] = var14;
                     }

                     this.c[var10] += au;
                     this.d[var10] += av;
                     this.e[var10] += aw;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var1 = 0; var1 < var6; ++var1) {
               if ((var7 = var2[var1]) < this.u.length) {
                  var8 = this.u[var7];

                  for(var9 = 0; var9 < var8.length; ++var9) {
                     var10 = var8[var9];
                     this.c[var10] -= au;
                     this.d[var10] -= av;
                     this.e[var10] -= aw;
                     this.c[var10] = this.c[var10] * var3 / 128;
                     this.d[var10] = this.d[var10] * var4 / 128;
                     this.e[var10] = this.e[var10] * var5 / 128;
                     this.c[var10] += au;
                     this.d[var10] += av;
                     this.e[var10] += aw;
                  }
               }
            }

         } else {
            if (var1 == 5 && this.v != null && this.R != null) {
               for(var1 = 0; var1 < var6; ++var1) {
                  if ((var7 = var2[var1]) < this.v.length) {
                     var8 = this.v[var7];

                     for(var9 = 0; var9 < var8.length; ++var9) {
                        var10 = var8[var9];
                        this.R[var10] += var3 << 3;
                        if (this.R[var10] < 0) {
                           this.R[var10] = 0;
                        }

                        if (this.R[var10] > 255) {
                           this.R[var10] = 255;
                        }
                     }
                  }
               }
            }

         }
      }
   }

   public final void e() {
      for(int var1 = 0; var1 < this.b; ++var1) {
         int var2 = this.c[var1];
         this.c[var1] = this.e[var1];
         this.e[var1] = -var2;
      }

   }

   public final void a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.b; ++var4) {
         this.c[var4] += var1;
         this.d[var4] += var2;
         this.e[var4] += var3;
      }

   }

   public final void a(int var1, int var2) {
      for(int var3 = 0; var3 < this.f; ++var3) {
         if (this.k[var3] == var1) {
            this.k[var3] = var2;
         }
      }

   }

   public final void f() {
      int var1;
      for(var1 = 0; var1 < this.b; ++var1) {
         this.e[var1] = -this.e[var1];
      }

      for(var1 = 0; var1 < this.f; ++var1) {
         int var2 = this.g[var1];
         this.g[var1] = this.i[var1];
         this.i[var1] = var2;
      }

   }

   public final void b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.b; ++var4) {
         this.c[var4] = this.c[var4] * var1 / 128;
         this.d[var4] = this.d[var4] * var3 / 128;
         this.e[var4] = this.e[var4] * var2 / 128;
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      var2 = var2 * var7 >> 8;
      if (this.N == null) {
         this.N = new int[this.f];
         this.O = new int[this.f];
         this.P = new int[this.f];
      }

      if (super.aC == null) {
         super.aC = new F_1[this.b];

         for(var7 = 0; var7 < this.b; ++var7) {
            super.aC[var7] = new F_1();
         }
      }

      F_1 var18;
      for(var7 = 0; var7 < this.f; ++var7) {
         if (this.k != null && this.R != null && (this.k[var7] == 65535 || this.k[var7] == 16705)) {
            this.R[var7] = 255;
         }

         int var8 = this.g[var7];
         int var9 = this.h[var7];
         int var10 = this.i[var7];
         int var11 = this.c[var9] - this.c[var8];
         int var12 = this.d[var9] - this.d[var8];
         int var13 = this.e[var9] - this.e[var8];
         int var14 = this.c[var10] - this.c[var8];
         int var15 = this.d[var10] - this.d[var8];
         int var16 = this.e[var10] - this.e[var8];
         int var17 = var12 * var16 - var15 * var13;
         var13 = var13 * var14 - var16 * var11;

         for(var11 = var11 * var15 - var14 * var12; var17 > 8192 || var13 > 8192 || var11 > 8192 || var17 < -8192 || var13 < -8192 || var11 < -8192; var11 >>= 1) {
            var17 >>= 1;
            var13 >>= 1;
         }

         if ((var12 = (int)Math.sqrt((double)(var17 * var17 + var13 * var13 + var11 * var11))) <= 0) {
            var12 = 1;
         }

         var17 = (var17 << 8) / var12;
         var13 = (var13 << 8) / var12;
         var11 = (var11 << 8) / var12;
         if (this.j != null && (this.j[var7] & 1) != 0) {
            var8 = var1 + (var3 * var17 + var4 * var13 + var5 * var11) / (var2 + var2 / 2);
            this.N[var7] = c(this.k[var7], var8, this.j[var7]);
         } else {
            F_1 var10000 = var18 = super.aC[var8];
            var10000.a += var17;
            var18.b += var13;
            var18.c += var11;
            ++var18.d;
            var10000 = var18 = super.aC[var9];
            var10000.a += var17;
            var18.b += var13;
            var18.c += var11;
            ++var18.d;
            var10000 = var18 = super.aC[var10];
            var10000.a += var17;
            var18.b += var13;
            var18.c += var11;
            ++var18.d;
         }
      }

      if (var6) {
         this.a(var1, var2, var3, var4, var5);
      } else {
         this.x = new F_1[this.b];

         for(var7 = 0; var7 < this.b; ++var7) {
            var18 = super.aC[var7];
            F_1 var19;
            (var19 = this.x[var7] = new F_1()).a = var18.a;
            var19.b = var18.b;
            var19.c = var18.c;
            var19.d = var18.d;
         }
      }

      if (var6) {
         this.c();
      } else {
         this.d(21073);
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = 0; var6 < this.f; ++var6) {
         int var7 = this.g[var6];
         int var8 = this.h[var6];
         int var9 = this.i[var6];
         int var10;
         if (this.j == null) {
            var10 = this.k[var6];
            F_1 var11 = super.aC[var7];
            var7 = var1 + (var3 * var11.a + var4 * var11.b + var5 * var11.c) / (var2 * var11.d);
            this.N[var6] = c(var10, var7, 0);
            var11 = super.aC[var8];
            var7 = var1 + (var3 * var11.a + var4 * var11.b + var5 * var11.c) / (var2 * var11.d);
            this.O[var6] = c(var10, var7, 0);
            var11 = super.aC[var9];
            var7 = var1 + (var3 * var11.a + var4 * var11.b + var5 * var11.c) / (var2 * var11.d);
            this.P[var6] = c(var10, var7, 0);
         } else if ((this.j[var6] & 1) == 0) {
            var10 = this.k[var6];
            int var13 = this.j[var6];
            F_1 var12 = super.aC[var7];
            var7 = var1 + (var3 * var12.a + var4 * var12.b + var5 * var12.c) / (var2 * var12.d);
            this.N[var6] = c(var10, var7, var13);
            var12 = super.aC[var8];
            var7 = var1 + (var3 * var12.a + var4 * var12.b + var5 * var12.c) / (var2 * var12.d);
            this.O[var6] = c(var10, var7, var13);
            var12 = super.aC[var9];
            var7 = var1 + (var3 * var12.a + var4 * var12.b + var5 * var12.c) / (var2 * var12.d);
            this.P[var6] = c(var10, var7, var13);
         }
      }

      super.aC = null;
      this.x = null;
      this.X = null;
      this.Y = null;
      if (this.j != null) {
         for(var6 = 0; var6 < this.f; ++var6) {
            if ((this.j[var6] & 2) == 2) {
               return;
            }
         }
      }

      this.k = null;
   }

   private static int c(int var0, int var1, int var2) {
      if (var0 == 65535) {
         return 0;
      } else if ((var2 & 2) == 2) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         return var1 = 127 - var1;
      } else {
         if ((var1 = var1 * (var0 & 127) >> 7) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ï') + var1;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = uwotm8.Rasterizer3D.e;
      int var8 = uwotm8.Rasterizer3D.p;
      int var9 = D[var1];
      int var10 = E[var1];
      int var11 = D[var2];
      int var12 = E[var2];
      int var13 = D[var3];
      var3 = E[var3];
      int var14 = var5 * var13 + var6 * var3 >> 16;

      for(int var15 = 0; var15 < this.b; ++var15) {
         int var16 = this.c[var15];
         int var17 = this.d[var15];
         int var18 = this.e[var15];
         int var19;
         if (var2 != 0) {
            var19 = var17 * var11 + var16 * var12 >> 16;
            var17 = var17 * var12 - var16 * var11 >> 16;
            var16 = var19;
         }

         if (var1 != 0) {
            var19 = var18 * var9 + var16 * var10 >> 16;
            var18 = var18 * var10 - var16 * var9 >> 16;
            var16 = var19;
         }

         var16 += var4;
         var17 += var5;
         var18 += var6;
         var19 = var17 * var3 - var18 * var13 >> 16;
         var18 = var17 * var13 + var18 * var3 >> 16;
         ag[var15] = var18 - var14;
         ae[var15] = var7 + (var16 << 9) / var18;
         af[var15] = var8 + (var19 << 9) / var18;
         if (this.T > 0) {
            ah[var15] = var16;
            ai[var15] = var19;
            aj[var15] = var18;
         }
      }

      try {
         this.a(false, false, 0);
      } catch (Exception var20) {
         ;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var8 * var5 - var6 * var4 >> 16;
      int var11 = var7 * var2 + var10 * var3 >> 16;
      int var12 = this.p * var3 >> 16;
      int var13;
      if ((var13 = var11 + var12) > 50 && var11 < 3500) {
         int var14;
         int var15;
         if ((var15 = (var14 = var8 * var4 + var6 * var5 >> 16) - this.p << Client.l) / var13 < uwotm8.Rasterizer2D.n) {
            int var16;
            if ((var16 = var14 + this.p << Client.l) / var13 > -uwotm8.Rasterizer2D.n) {
               var10 = var7 * var3 - var10 * var2 >> 16;
               int var17 = this.p * var2 >> 16;
               int var18;
               if ((var18 = var10 + var17 << Client.l) / var13 > -uwotm8.Rasterizer2D.o) {
                  var17 += super.aD * var3 >> 16;
                  if ((var17 = var10 - var17 << Client.l) / var13 < uwotm8.Rasterizer2D.o) {
                     int var19 = var12 + (super.aD * var2 >> 16);
                     boolean var20 = false;
                     if (var11 - var19 <= 50) {
                        var20 = true;
                     }

                     boolean var23 = false;
                     if (var9 > 0 && y) {
                        if ((var12 = var11 - var12) <= 50) {
                           var12 = 50;
                        }

                        if (var14 > 0) {
                           var15 /= var13;
                           var16 /= var12;
                        } else {
                           var16 /= var13;
                           var15 /= var12;
                        }

                        if (var10 > 0) {
                           var17 /= var13;
                           var18 /= var12;
                        } else {
                           var18 /= var13;
                           var17 /= var12;
                        }

                        var10 = z - uwotm8.Rasterizer3D.e;
                        var13 = A - uwotm8.Rasterizer3D.p;
                        if (var10 > var15 && var10 < var16 && var13 > var17 && var13 < var18) {
                           if (this.w) {
                              C[B++] = var9;
                           } else {
                              var23 = true;
                           }
                        }
                     }

                     var12 = uwotm8.Rasterizer3D.e;
                     var10 = uwotm8.Rasterizer3D.p;
                     var13 = 0;
                     var14 = 0;
                     if (var1 != 0) {
                        var13 = D[var1];
                        var14 = E[var1];
                     }

                     for(var15 = 0; var15 < this.b; ++var15) {
                        var16 = this.c[var15];
                        var17 = this.d[var15];
                        var18 = this.e[var15];
                        int var21;
                        if (var1 != 0) {
                           var21 = var18 * var13 + var16 * var14 >> 16;
                           var18 = var18 * var14 - var16 * var13 >> 16;
                           var16 = var21;
                        }

                        var16 += var6;
                        var17 += var7;
                        var21 = (var18 += var8) * var4 + var16 * var5 >> 16;
                        var18 = var18 * var5 - var16 * var4 >> 16;
                        var16 = var21;
                        var21 = var17 * var3 - var18 * var2 >> 16;
                        var18 = var17 * var2 + var18 * var3 >> 16;
                        ag[var15] = var18 - var11;
                        if (var18 >= 50) {
                           ae[var15] = var12 + (var16 << Client.l) / var18;
                           af[var15] = var10 + (var21 << Client.l) / var18;
                        } else {
                           ae[var15] = -5000;
                           var20 = true;
                        }

                        if (var20 || this.T > 0) {
                           ah[var15] = var16;
                           ai[var15] = var21;
                           aj[var15] = var18;
                        }
                     }

                     try {
                        this.a(var20, var23, var9);
                     } catch (Exception var22) {
                        ;
                     }
                  }
               }
            }
         }
      }
   }

   private final void a(boolean var1, boolean var2, int var3) {
      int var4;
      for(var4 = 0; var4 < this.r; ++var4) {
         ak[var4] = 0;
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var4 = 0; var4 < this.f; ++var4) {
         if (this.j == null || this.j[var4] != -1) {
            var5 = this.g[var4];
            var6 = this.h[var4];
            var7 = this.i[var4];
            var8 = ae[var5];
            var9 = ae[var6];
            var10 = ae[var7];
            if (var1 && (var8 == -5000 || var9 == -5000 || var10 == -5000)) {
               ad[var4] = true;
            } else {
               if (var2 && a(z, A, af[var5], af[var6], af[var7], var8, var9, var10)) {
                  C[B++] = var3;
                  var2 = false;
               }

               if ((var8 - var9) * (af[var7] - af[var6]) - (af[var5] - af[var6]) * (var10 - var9) <= 0) {
                  continue;
               }

               ad[var4] = false;
               if (var8 >= 0 && var9 >= 0 && var10 >= 0 && var8 <= uwotm8.Rasterizer2D.m && var9 <= uwotm8.Rasterizer2D.m && var10 <= uwotm8.Rasterizer2D.m) {
                  ac[var4] = false;
               } else {
                  ac[var4] = true;
               }
            }

            var11 = (ag[var5] + ag[var6] + ag[var7]) / 3 + this.s;
            al[var11][ak[var11]++] = var4;
         }
      }

      int[] var16;
      if (this.Q == null) {
         for(var4 = this.r - 1; var4 >= 0; --var4) {
            if ((var5 = ak[var4]) > 0) {
               var16 = al[var4];

               for(var7 = 0; var7 < var5; ++var7) {
                  this.e(var16[var7]);
               }
            }
         }

      } else {
         for(var4 = 0; var4 < 12; ++var4) {
            am[var4] = 0;
            aq[var4] = 0;
         }

         for(var4 = this.r - 1; var4 >= 0; --var4) {
            if ((var5 = ak[var4]) > 0) {
               var16 = al[var4];

               for(var7 = 0; var7 < var5; ++var7) {
                  var8 = var16[var7];
                  var9 = this.Q[var8];
                  var10 = am[var9]++;
                  an[var9][var10] = var8;
                  if (var9 < 10) {
                     aq[var9] += var4;
                  } else if (var9 == 10) {
                     ao[var10] = var4;
                  } else {
                     ap[var10] = var4;
                  }
               }
            }
         }

         var4 = 0;
         if (am[1] > 0 || am[2] > 0) {
            var4 = (aq[1] + aq[2]) / (am[1] + am[2]);
         }

         var5 = 0;
         if (am[3] > 0 || am[4] > 0) {
            var5 = (aq[3] + aq[4]) / (am[3] + am[4]);
         }

         var6 = 0;
         if (am[6] > 0 || am[8] > 0) {
            var6 = (aq[6] + aq[8]) / (am[6] + am[8]);
         }

         var7 = 0;
         var8 = am[10];
         int[] var17 = an[10];
         int[] var18 = ao;
         if (var8 == 0) {
            var7 = 0;
            var8 = am[11];
            var17 = an[11];
            var18 = ap;
         }

         if (var8 > 0) {
            var11 = var18[0];
         } else {
            var11 = -1000;
         }

         for(int var13 = 0; var13 < 10; ++var13) {
            while(var13 == 0 && var11 > var4) {
               this.e(var17[var7++]);
               if (var7 == var8 && var17 != an[11]) {
                  var7 = 0;
                  var8 = am[11];
                  var17 = an[11];
                  var18 = ap;
               }

               if (var7 < var8) {
                  var11 = var18[var7];
               } else {
                  var11 = -1000;
               }
            }

            while(var13 == 3 && var11 > var5) {
               this.e(var17[var7++]);
               if (var7 == var8 && var17 != an[11]) {
                  var7 = 0;
                  var8 = am[11];
                  var17 = an[11];
                  var18 = ap;
               }

               if (var7 < var8) {
                  var11 = var18[var7];
               } else {
                  var11 = -1000;
               }
            }

            while(var13 == 5 && var11 > var6) {
               this.e(var17[var7++]);
               if (var7 == var8 && var17 != an[11]) {
                  var7 = 0;
                  var8 = am[11];
                  var17 = an[11];
                  var18 = ap;
               }

               if (var7 < var8) {
                  var11 = var18[var7];
               } else {
                  var11 = -1000;
               }
            }

            int var14 = am[var13];
            int[] var15 = an[var13];

            for(int var12 = 0; var12 < var14; ++var12) {
               this.e(var15[var12]);
            }
         }

         while(var11 != -1000) {
            this.e(var17[var7++]);
            if (var7 == var8 && var17 != an[11]) {
               var7 = 0;
               var17 = an[11];
               var8 = am[11];
               var18 = ap;
            }

            if (var7 < var8) {
               var11 = var18[var7];
            } else {
               var11 = -1000;
            }
         }

      }
   }

   private final void e(int var1) {
      if (ad[var1]) {
         this.f(var1);
      } else {
         int var2 = this.g[var1];
         int var3 = this.h[var1];
         int var4 = this.i[var1];
         uwotm8.Rasterizer3D.b = ac[var1];
         if (this.R == null) {
            uwotm8.Rasterizer3D.d = 0;
         } else {
            uwotm8.Rasterizer3D.d = this.R[var1];
         }

         int var5;
         if (this.j == null) {
            var5 = 0;
         } else {
            var5 = this.j[var1] & 3;
         }

         if (var5 == 0) {
            uwotm8.Rasterizer3D.a(af[var2], af[var3], af[var4], ae[var2], ae[var3], ae[var4], this.N[var1], this.O[var1], this.P[var1]);
         } else if (var5 == 1) {
            uwotm8.Rasterizer3D.a(af[var2], af[var3], af[var4], ae[var2], ae[var3], ae[var4], ax[this.N[var1]]);
         } else {
            int var6;
            int var7;
            if (var5 == 2) {
               var5 = this.j[var1] >> 2;
               var6 = this.U[var5];
               var7 = this.V[var5];
               var5 = this.W[var5];
               uwotm8.Rasterizer3D.a(af[var2], af[var3], af[var4], ae[var2], ae[var3], ae[var4], this.N[var1], this.O[var1], this.P[var1], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
            } else {
               if (var5 == 3) {
                  var5 = this.j[var1] >> 2;
                  var6 = this.U[var5];
                  var7 = this.V[var5];
                  var5 = this.W[var5];
                  uwotm8.Rasterizer3D.a(af[var2], af[var3], af[var4], ae[var2], ae[var3], ae[var4], this.N[var1], this.N[var1], this.N[var1], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
               }

            }
         }
      }
   }

   private final void f(int var1) {
      if (this.k == null || this.k[var1] != 65535) {
         int var2 = uwotm8.Rasterizer3D.e;
         int var3 = uwotm8.Rasterizer3D.p;
         int var4 = 0;
         int var5 = this.g[var1];
         int var6 = this.h[var1];
         int var7 = this.i[var1];
         int var8 = aj[var5];
         int var9 = aj[var6];
         int var10 = aj[var7];
         int var11;
         int var12;
         int var13;
         int var14;
         if (var8 >= 50) {
            ar[0] = ae[var5];
            as[0] = af[var5];
            ++var4;
            at[0] = this.N[var1];
         } else {
            var11 = ah[var5];
            var12 = ai[var5];
            var13 = this.N[var1];
            if (var10 >= 50) {
               var14 = (50 - var8) * ay[var10 - var8];
               ar[0] = var2 + (var11 + ((ah[var7] - var11) * var14 >> 16) << Client.l) / 50;
               as[0] = var3 + (var12 + ((ai[var7] - var12) * var14 >> 16) << Client.l) / 50;
               ++var4;
               at[0] = var13 + ((this.P[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 50) {
               var14 = (50 - var8) * ay[var9 - var8];
               ar[var4] = var2 + (var11 + ((ah[var6] - var11) * var14 >> 16) << Client.l) / 50;
               as[var4] = var3 + (var12 + ((ai[var6] - var12) * var14 >> 16) << Client.l) / 50;
               at[var4++] = var13 + ((this.O[var1] - var13) * var14 >> 16);
            }
         }

         if (var9 >= 50) {
            ar[var4] = ae[var6];
            as[var4] = af[var6];
            at[var4++] = this.O[var1];
         } else {
            var11 = ah[var6];
            var12 = ai[var6];
            var13 = this.O[var1];
            if (var8 >= 50) {
               var14 = (50 - var9) * ay[var8 - var9];
               ar[var4] = var2 + (var11 + ((ah[var5] - var11) * var14 >> 16) << Client.l) / 50;
               as[var4] = var3 + (var12 + ((ai[var5] - var12) * var14 >> 16) << Client.l) / 50;
               at[var4++] = var13 + ((this.N[var1] - var13) * var14 >> 16);
            }

            if (var10 >= 50) {
               var14 = (50 - var9) * ay[var10 - var9];
               ar[var4] = var2 + (var11 + ((ah[var7] - var11) * var14 >> 16) << Client.l) / 50;
               as[var4] = var3 + (var12 + ((ai[var7] - var12) * var14 >> 16) << Client.l) / 50;
               at[var4++] = var13 + ((this.P[var1] - var13) * var14 >> 16);
            }
         }

         if (var10 >= 50) {
            ar[var4] = ae[var7];
            as[var4] = af[var7];
            at[var4++] = this.P[var1];
         } else {
            var11 = ah[var7];
            var12 = ai[var7];
            var13 = this.P[var1];
            if (var9 >= 50) {
               var14 = (50 - var10) * ay[var9 - var10];
               ar[var4] = var2 + (var11 + ((ah[var6] - var11) * var14 >> 16) << Client.l) / 50;
               as[var4] = var3 + (var12 + ((ai[var6] - var12) * var14 >> 16) << Client.l) / 50;
               at[var4++] = var13 + ((this.O[var1] - var13) * var14 >> 16);
            }

            if (var8 >= 50) {
               var14 = (50 - var10) * ay[var8 - var10];
               ar[var4] = var2 + (var11 + ((ah[var5] - var11) * var14 >> 16) << Client.l) / 50;
               as[var4] = var3 + (var12 + ((ai[var5] - var12) * var14 >> 16) << Client.l) / 50;
               at[var4++] = var13 + ((this.N[var1] - var13) * var14 >> 16);
            }
         }

         var11 = ar[0];
         var12 = ar[1];
         var13 = ar[2];
         var14 = as[0];
         var2 = as[1];
         var3 = as[2];
         if ((var11 - var12) * (var3 - var2) - (var14 - var2) * (var13 - var12) > 0) {
            uwotm8.Rasterizer3D.b = false;
            if (var4 == 3) {
               if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > uwotm8.Rasterizer2D.m || var12 > uwotm8.Rasterizer2D.m || var13 > uwotm8.Rasterizer2D.m) {
                  uwotm8.Rasterizer3D.b = true;
               }

               if (this.j == null) {
                  var5 = 0;
               } else {
                  var5 = this.j[var1] & 3;
               }

               if (var5 == 0) {
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, at[0], at[1], at[2]);
               } else if (var5 == 1) {
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, ax[this.N[var1]]);
               } else if (var5 == 2) {
                  var5 = this.j[var1] >> 2;
                  var6 = this.U[var5];
                  var7 = this.V[var5];
                  var5 = this.W[var5];
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, at[0], at[1], at[2], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
               } else if (var5 == 3) {
                  var5 = this.j[var1] >> 2;
                  var6 = this.U[var5];
                  var7 = this.V[var5];
                  var5 = this.W[var5];
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, this.N[var1], this.N[var1], this.N[var1], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
               }
            }

            if (var4 == 4) {
               if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > uwotm8.Rasterizer2D.m || var12 > uwotm8.Rasterizer2D.m || var13 > uwotm8.Rasterizer2D.m || ar[3] < 0 || ar[3] > uwotm8.Rasterizer2D.m) {
                  uwotm8.Rasterizer3D.b = true;
               }

               if (this.j == null) {
                  var5 = 0;
               } else {
                  var5 = this.j[var1] & 3;
               }

               if (var5 == 0) {
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, at[0], at[1], at[2]);
                  uwotm8.Rasterizer3D.a(var14, var3, as[3], var11, var13, ar[3], at[0], at[2], at[3]);
                  return;
               }

               if (var5 == 1) {
                  var5 = ax[this.N[var1]];
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, var5);
                  uwotm8.Rasterizer3D.a(var14, var3, as[3], var11, var13, ar[3], var5);
                  return;
               }

               if (var5 == 2) {
                  var5 = this.j[var1] >> 2;
                  var6 = this.U[var5];
                  var7 = this.V[var5];
                  var5 = this.W[var5];
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, at[0], at[1], at[2], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
                  uwotm8.Rasterizer3D.a(var14, var3, as[3], var11, var13, ar[3], at[0], at[2], at[3], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
                  return;
               }

               if (var5 == 3) {
                  var5 = this.j[var1] >> 2;
                  var6 = this.U[var5];
                  var7 = this.V[var5];
                  var5 = this.W[var5];
                  uwotm8.Rasterizer3D.a(var14, var2, var3, var11, var12, var13, this.N[var1], this.N[var1], this.N[var1], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
                  uwotm8.Rasterizer3D.a(var14, var3, as[3], var11, var13, ar[3], this.N[var1], this.N[var1], this.N[var1], ah[var6], ah[var7], ah[var5], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], this.k[var1]);
               }
            }
         }

      }
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else {
         return var0 <= var5 || var0 <= var6 || var0 <= var7;
      }
   }
}

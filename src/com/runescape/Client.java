package com.runescape;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Desktop.Action;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import uwotm8.A;
import uwotm8.B_1;
import uwotm8.C_1;
import uwotm8.D_1;
import uwotm8.G_1;
import uwotm8.I_1;
import uwotm8.K_1;
import uwotm8.M_1;
import uwotm8.CollisionMap;
import uwotm8.S_1;
import uwotm8.W_1;
import uwotm8.X_1;
import uwotm8.Y_1;
import uwotm8.Z_1;
import uwotm8.aB_1;
import uwotm8.aE_1;
import uwotm8.aF;
import uwotm8.aG_1;
import uwotm8.aH_1;
import uwotm8.aa;
import uwotm8.ab;
import uwotm8.ac;
import uwotm8.ad;
import uwotm8.ae;
import uwotm8.af_1;
import uwotm8.ah;
import uwotm8.ai;
import uwotm8.VariableBits;
import uwotm8.VariableParameter;
import uwotm8.al;
import uwotm8.ao;
import uwotm8.ap;
import uwotm8.aq;
import uwotm8.as;
import uwotm8.at;
import uwotm8.au;
import uwotm8.av;
import uwotm8.StringUtils;
import uwotm8.Settings;
import uwotm8.CacheUpdater;
import uwotm8.c;
import uwotm8.Animation;
import uwotm8.e;
import uwotm8.g;
import uwotm8.ActorDefinition;
import uwotm8.i;
import uwotm8.j;
import uwotm8.k;
import uwotm8.l;
import uwotm8.m;
import uwotm8.Sprite;
import uwotm8.o;
import uwotm8.p;
import uwotm8.q;
import uwotm8.r;
import uwotm8.t;
import uwotm8.u;
import uwotm8.v;
import uwotm8.w;
import uwotm8.Npc;
import uwotm8.y;
import uwotm8.z;

public class Client extends b {
   public static a a;
   public static int b;
   public static int c;
   public static int d;
   private static int aD;
   private static int aE;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   public static int h;
   private int aF;
   private final String[] aG = new String[100];
   private final int[] aH = new int[100];
   public static int i;
   public static int j;
   public static Client k;
   private static final int[] aI;
   private boolean aJ = false;
   private boolean aK = false;
   private int aL = 0;
   private int aM = 0;
   private boolean aN = false;
   private int aO = 0;
   private int aP = 0;
   private int aQ;
   private int aR;
   private int aS;
   private boolean aT;
   private String aU;
   public static int l;
   private boolean aV;
   private static boolean aW;
   private double aX;
   private int aY;
   private int aZ;
   private String ba;
   private final int bb;
   private final int[] bc;
   private final boolean[] bd;
   private int be;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   private Sprite bf;
   private Sprite bg;
   public Sprite r;
   public Sprite s;
   public static aE_1 t;
   private q bh;
   private q bi;
   private int bj;
   private long bk;
   private int[][] bl;
   private int[] bm;
   private M_1[][][] bn;
   private volatile boolean bo;
   private Socket bp;
   private int bq;
   private I_1 br;
   private Npc[] bs;
   private int bt;
   private int[] bu;
   private int bv;
   private int[] bw;
   private int bx;
   private int by;
   private int bz;
   private String bA;
   public int u;
   private I_1 bB;
   private boolean bC;
   private static int bD;
   private static int bE;
   private int bF;
   static int v;
   private int bG;
   private int bH;
   private int bI;
   private int bJ;
   private int bK;
   private int bL;
   private final int[] bM;
   private Sprite bN;
   private Sprite bO;
   private boolean bP;
   private final int[] bQ;
   private final boolean[] bR;
   private long bS;
   private int bT;
   private int bU;
   private at bV;
   private String bW;
   private int bX;
   private boolean bY;
   private int bZ;
   private String ca;
   private final int cb;
   private final int cc;
   private y[] cd;
   private int ce;
   private int[] cf;
   private int cg;
   private int[] ch;
   private I_1[] ci;
   private int cj;
   private int ck;
   private int cl;
   private int cm;
   private int[][] cn;
   private byte[] co;
   private int cp;
   private int cq;
   private int cr;
   private int cs;
   private int ct;
   private int cu;
   private final int[] cv;
   private static int cw;
   private long[] cx;
   private boolean cy;
   private final int[] cz;
   private int[][] cA;
   private Sprite cB;
   private Sprite cC;
   private int cD;
   private int cE;
   private int cF;
   private int cG;
   private int cH;
   private int cI;
   private final int[] cJ;
   private final String[] cK;
   private final String[] cL;
   private final String[] cM;
   private int cN;
   private W_1 cO;
   public Sprite[] w;
   private int cP;
   private int cQ;
   private int cR;
   private int cS;
   private long cT;
   private boolean cU;
   private long[] cV;
   private long[] cW;
   private int[] cX;
   private int cY;
   private static int cZ;
   public static int x;
   private static boolean da;
   private static boolean db;
   private static boolean dc;
   private int dd;
   private int de;
   private final int[] df;
   public final int[] y;
   public final c[] z;
   public int[] A;
   private boolean dg;
   private final int dh;
   private final int[] di;
   private final int[] dj;
   private final int[] dk;
   private final int[] dl;
   private final int[] dm;
   private final int[] dn;
   private final int[] xD;
   private final String[] dp;
   private int dq;
   private boolean dr;
   private int ds;
   private static int dt;
   private Sprite[] du;
   private int dv;
   private int[] dw;
   private final boolean dx;
   private int dy;
   private int dz;
   private int dA;
   private int dB;
   private int dC;
   private ad dD;
   private Sprite dE;
   private Sprite dF;
   public static final int[][] B;
   private String dG;
   private static int dH;
   private int dI;
   private int dJ;
   private int dK;
   private int dL;
   private int dM;
   private int dN;
   private M_1 dO;
   private int dP;
   private int dQ;
   private int dR;
   private boolean dS;
   private int dT;
   private boolean dU;
   private static final int[] dV;
   private int dW;
   private int dX;
   private Sprite dY;
   private Sprite dZ;
   private k ea;
   private k eb;
   private int ec;
   private final int[] ed;
   private boolean ee;
   private Sprite[] ef;
   private int eg;
   private int eh;
   private int ei;
   private int ej;
   private int ek;
   private int el;
   private int em;
   private final int[] en;
   private final int[] eo;
   private int ep;
   private boolean eq;
   private int er;
   private String es;
   private static int et;
   private final int[] eu;
   private G_1 ev;
   public int C;
   private int ew;
   private M_1 ex;
   public final int[] D;
   private m ey;
   private k[] ez;
   private int eA;
   private final int eB;
   private int eC;
   private final int[] eD;
   private int eE;
   private int eF;
   public af_1 E;
   private int eG;
   private int eH;
   private int eI;
   private int[] eJ;
   private int[] eK;
   private Sprite eL;
   private Sprite eM;
   private Sprite eN;
   private Sprite eO;
   private Sprite eP;
   private Sprite eQ;
   private int eR;
   private boolean eS;
   private String[] eT;
   private I_1 eU;
   private int eV;
   private int eW;
   private int eX;
   private int eY;
   private int eZ;
   public static int F;
   private static int fa;
   private int fb;
   public static int G;
   public static int H;
   public static int I;
   private final int[] fc;
   private int[] fd;
   private int[] fe;
   public int[] J;
   private int[] ff;
   private Sprite fg;
   private Sprite[] fh;
   private Sprite[] fi;
   private Sprite[] fj;
   private static int fk;
   private int fl;
   private int fm;
   private int fn;
   private int fo;
   private int fp;
   public static boolean K;
   private int fq;
   private String fr;
   private q fs;
   private q ft;
   private q fu;
   private q fv;
   private q fw;
   private q fx;
   private q fy;
   private q fz;
   private q fA;
   private static int fB;
   private int fC;
   private String fD;
   private Sprite fE;
   private q fF;
   private q fG;
   private q fH;
   public static y L;
   private final String[] fI;
   private final boolean[] fJ;
   private final int[][][] fK;
   public static final int[] M;
   private int fL;
   public int N;
   private static int fM;
   private int fN;
   private int fO;
   private int fP;
   private String fQ;
   private Sprite[] fR;
   private boolean fS;
   private int fT;
   private boolean fU;
   private Sprite[] fV;
   private static boolean fW;
   public static boolean O;
   public static boolean P;
   private int fX;
   private static int fY;
   private static boolean fZ;
   public static boolean Q;
   private boolean ga;
   private boolean gb;
   private boolean gc;
   private boolean gd;
   public static int R;
   private static q ge;
   private q gf;
   private static q gg;
   private static q gh;
   private int gi;
   private ai gj;
   private int gk;
   public static String S;
   public static String T;
   public static boolean U;
   private static int gl;
   private boolean gm;
   private final int[] gn;
   private int go;
   private M_1 gp;
   private static int[] gq;
   private static int[] gr;
   private static int[] gs;
   private byte[][] gt;
   private int gu;
   public int V;
   private int gv;
   private int gw;
   private static int gx;
   public int W;
   private I_1 gy;
   private int gz;
   private int gA;
   private k gB;
   public String[] X;
   private final int[] gC;
   public static final int[] Y;
   private final int[] gD;
   private int gE;
   static int Z;
   private String gF;
   private int gG;
   private int[][][] gH;
   private long gI;
   private int gJ;
   private final k[] gK;
   private long gL;
   public static int aa;
   private int gM;
   public static boolean ab;
   public int ac;
   private static int gN;
   private int gO;
   private boolean gP;
   private int gQ;
   private boolean gR;
   private ao gS;
   private final int[] gT;
   private CollisionMap[] gU;
   public static int[] ad;
   private int[] gV;
   private int[] gW;
   private int[] gX;
   private int gY;
   private final int[] gZ;
   private boolean ha;
   private int hb;
   private int hc;
   private int hd;
   private int he;
   private byte[][] hf;
   public int ae;
   private int hg;
   private final int[] hh;
   private final int[] hi;
   private int hj;
   private final boolean hk;
   private int hl;
   private boolean hm;
   private boolean hn;
   private byte[][][] ho;
   private int hp;
   private int hq;
   private int hr;
   private Sprite hs;
   private int ht;
   private int hu;
   private String hv;
   private String hw;
   private int hx;
   private int hy;
   public o af;
   private o hz;
   private o hA;
   private o hB;
   private o hC;
   private o hD;
   private o hE;
   public l ag;
   public l ah;
   private l hF;
   private l hG;
   private l hH;
   private l hI;
   private l hJ;
   public int ai;
   private int hK;
   private int[] hL;
   private int[] hM;
   private int hN;
   private int hO;
   private int hP;
   private int hQ;
   private String hR;
   public int aj;
   private static int hS;
   private static String hT;
   private int hU;
   private int hV;
   private int hW;
   private int hX;
   private int hY;
   private int hZ;

   static {
      a = com.runescape.a.a;
      b = 1;
      c = 765;
      d = 503;
      aD = 512;
      aE = 334;
      e = true;
      f = true;
      g = false;
      h = 1000;
      j = 100;
      aI = new int[]{0, 3, 14, 2, 16, 13, 1, 15, 10, 4, 17, 7, 5, 12, 11, 6, 9, 8, 20, 18, 19, 22, 21};
      l = 9;
      aW = false;
      cZ = 10;
      da = false;
      db = true;
      B = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
      fa = 0;
      G = 600;
      H = 180;
      I = 900;
      M = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
      S = "";
      T = "";
      U = false;
      Y = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
      hT = "";
      dV = new int[99];
      int var0 = 0;

      int var1;
      for(var1 = 0; var1 < 99; ++var1) {
         int var2 = (int)((double)(var2 = var1 + 1) + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var2;
         dV[var1] = var0 / 4;
      }

      ad = new int[32];
      var0 = 2;

      for(var1 = 0; var1 < 32; ++var1) {
         ad[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static a a() {
      return a;
   }

   private void a(a var1) {
      if (a != var1) {
         a = var1;
         if (var1 == com.runescape.a.a) {
            c = 765;
            d = 503;
            G = uwotm8.Settings.h;
            l = 9;
            g = false;
         } else if (var1 == com.runescape.a.b) {
            c = uwotm8.Settings.d >= 766 ? uwotm8.Settings.d : 766;
            d = uwotm8.Settings.e >= 529 ? uwotm8.Settings.e : 529;
            G = uwotm8.Settings.h;
            l = 10;
         } else if (var1 == com.runescape.a.c) {
            G = uwotm8.Settings.h;
            l = 10;
            c = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            d = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
         }

         if (var1 != com.runescape.a.a) {
            g = true;
         }

         a(var1, c, d);
         l();
         this.b(161, a == com.runescape.a.a ? 0 : 1);
      }

      e = var1 == com.runescape.a.a ? true : e;
      f = var1 == com.runescape.a.a ? true : f;
   }

   public static void a(a var0, int var1, int var2) {
      try {
         aD = var0 == com.runescape.a.a ? 512 : var1;
         aE = var0 == com.runescape.a.a ? 334 : var2;
         c = var1;
         d = var2;
         if (var0 == com.runescape.a.a) {
            k.a(var0 == com.runescape.a.c, var1 * b, var2 * b, var0 == com.runescape.a.b, var0 != com.runescape.a.a);
         } else {
            k.a(var0 == com.runescape.a.c, var1, var2, var0 == com.runescape.a.b, var0 != com.runescape.a.a);
         }

         l();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private static void l() {
      uwotm8.r.a(c, d);
      int[] var10000 = uwotm8.r.t;
      uwotm8.r.a(a == com.runescape.a.a ? (gh != null ? gh.a : 519) : c, a == com.runescape.a.a ? (gh != null ? gh.b : 165) : d);
      gq = uwotm8.r.t;
      uwotm8.r.a(a == com.runescape.a.a ? (ge != null ? ge.a : 249) : c, a == com.runescape.a.a ? (ge != null ? ge.b : 335) : d);
      gr = uwotm8.r.t;
      uwotm8.r.a(aD, aE);
      gs = uwotm8.r.t;
      int[] var0 = new int[9];

      for(int var1 = 0; var1 < 9; ++var1) {
         int var2 = 128 + (var1 << 5) + 15;
         int var3 = 600 + var2 * 3;
         var2 = uwotm8.r.r[var2];
         var0[var1] = var3 * var2 >> 16;
      }

      uwotm8.W_1.a(500, 800, aD, aE, var0);
      if (Q) {
         gg = new q(aD, aE);
      }

   }

   public final boolean b() {
      return e && (super.au > 0 && super.au < 519 && super.av > d - 165 && super.av < d || super.au > c - 220 && super.au < c && super.av > 0 && super.av < 165);
   }

   public final boolean c() {
      if (a != com.runescape.a.a && this.a(c - (c <= h ? 240 : 480), d - (c <= h ? 90 : 37), c, d)) {
         return false;
      } else if (this.m()) {
         return false;
      } else {
         boolean var10000;
         if (f) {
            if (c > h) {
               if (super.au >= c - 420 && super.au <= c && super.av >= d - 37 && super.av <= d || super.au > c - 204 && super.au < c && super.av > d - 37 - 274 && super.av < d) {
                  var10000 = true;
                  return !var10000 && !this.b();
               }
            } else if (super.au >= c - 210 && super.au <= c && super.av >= d - 74 && super.av <= d || super.au > c - 225 && super.au < c && super.av > d - 74 - 274 && super.av < d) {
               var10000 = true;
               return !var10000 && !this.b();
            }
         }

         var10000 = false;
         return !var10000 && !this.b();
      }
   }

   private boolean a(int var1, int var2, int var3, int var4) {
      return super.au >= var1 && super.au <= var3 && super.av >= var2 && super.av <= var4;
   }

   private boolean b(int var1, int var2, int var3, int var4) {
      return super.au >= var1 && super.au < var1 + var3 && super.av >= var2 && super.av < var2 + var4;
   }

   private boolean c(int var1, int var2, int var3, int var4) {
      return super.ax >= var1 && super.ax < var1 + var3 && super.ay >= var2 && super.ay < var2 + var4;
   }

   private boolean m() {
      Point var1;
      int var2 = (var1 = t.b(true)).x + t.c().x;
      int var3 = var1.y + t.c().y;
      return super.au >= var2 && super.au <= var2 + 146 && super.av >= var3 && super.av <= var3 + 151;
   }

   private void n() {
      try {
         if (a == com.runescape.a.a) {
            if (P || K) {
               this.x();
               if (P) {
                  P = false;
               }

               if (K) {
                  K = false;
               }
            }

            if (ab) {
               this.r();
               ab = false;
            }
         } else {
            this.x();
            this.r();
         }

         Client var1 = this;
         if (this.dX == 2) {
            if (a == com.runescape.a.a) {
               this.gf.a();
            }

            if (this.dW == 2) {
               t.a(this, true);
               if (this.bY) {
                  this.e(a == com.runescape.a.a ? 516 : 0, 0);
               }

               if (a == com.runescape.a.a) {
                  this.gf.a();
               }
            } else {
               Point var2;
               int var3 = (var2 = t.b(false)).x + t.c().x;
               int var18 = var2.y + t.c().y;
               int var4 = this.V & 2047;
               int var5 = 48 + L.V / 32;
               int var6 = 464 - L.W / 32;
               this.hs.a(151, var4, this.gT, 256, this.eu, var6, var18, var3, 146, var5);

               for(var18 = 0; var18 < var1.eI; ++var18) {
                  var3 = (var1.eJ[var18] << 2) + 2 - L.V / 32;
                  var4 = (var1.eK[var18] << 2) + 2 - L.W / 32;
                  var1.b(var1.fR[var18], var3, var4);
               }

               var18 = 0;

               while(true) {
                  if (var18 >= 104) {
                     for(var18 = 0; var18 < var1.bt; ++var18) {
                        Npc var19;
                        if ((var19 = var1.bs[var1.bu[var18]]) != null && var19.c()) {
                           ActorDefinition var20 = var19.ad;
                           if (var19.ad.r != null) {
                              var20 = var20.b();
                           }

                           if (var20 != null && var20.q && var20.p) {
                              var5 = var19.V / 32 - L.V / 32;
                              var6 = var19.W / 32 - L.W / 32;
                              var1.b(var1.eM, var5, var6);
                           }
                        }
                     }

                     for(var18 = 0; var18 < var1.ce; ++var18) {
                        y var21;
                        if ((var21 = var1.cd[var1.cf[var18]]) != null && var21.aq) {
                           var4 = var21.V / 32 - L.V / 32;
                           var5 = var21.W / 32 - L.W / 32;
                           boolean var24 = false;
                           boolean var7 = false;

                           for(int var15 = 0; var15 < var1.cl; ++var15) {
                              if (var1.cW[var15] > 0L && uwotm8.StringUtils.a(var1.cW[var15]).equalsIgnoreCase(var21.ai)) {
                                 var7 = true;
                                 break;
                              }
                           }

                           long var26 = uwotm8.StringUtils.a(var21.ai);

                           for(int var8 = 0; var8 < var1.ck; ++var8) {
                              if (var26 == var1.cV[var8] && var1.bm[var8] != 0) {
                                 var24 = true;
                                 break;
                              }
                           }

                           boolean var25 = false;
                           if (L.ah != 0 && var21.ah != 0 && L.ah == var21.ah) {
                              var25 = true;
                           }

                           if (var24) {
                              var1.b(var1.eO, var4, var5);
                           } else if (var7) {
                              var1.b(var1.eQ, var4, var5);
                           } else if (var25) {
                              var1.b(var1.eP, var4, var5);
                           } else {
                              var1.b(var1.eN, var4, var5);
                           }
                        }
                     }

                     if (var1.bF != 0 && R % 20 < 10) {
                        Npc var22;
                        if (var1.bF == 1 && var1.gM >= 0 && var1.gM < var1.bs.length && (var22 = var1.bs[var1.gM]) != null) {
                           var3 = var22.V / 32 - L.V / 32;
                           var4 = var22.W / 32 - L.W / 32;
                           var1.a(var1.bO, var4, var3);
                        }

                        if (var1.bF == 2) {
                           var18 = (var1.cE - var1.eg << 2) + 2 - L.V / 32;
                           var3 = (var1.cF - var1.eh << 2) + 2 - L.W / 32;
                           var1.a(var1.bO, var3, var18);
                        }

                        y var23;
                        if (var1.bF == 10 && var1.cD >= 0 && var1.cD < var1.cd.length && (var23 = var1.cd[var1.cD]) != null) {
                           var3 = var23.V / 32 - L.V / 32;
                           var4 = var23.W / 32 - L.W / 32;
                           var1.a(var1.bO, var4, var3);
                        }
                     }

                     if (var1.hq != 0) {
                        var18 = (var1.hq << 2) + 2 - L.V / 32;
                        var3 = (var1.hr << 2) + 2 - L.W / 32;
                        var1.b(var1.bN, var18, var3);
                     }

                     t.a(var1, false);
                     break;
                  }

                  for(var3 = 0; var3 < 104; ++var3) {
                     if (var1.bn[var1.cu][var18][var3] != null) {
                        var5 = (var18 << 2) + 2 - L.V / 32;
                        var6 = (var3 << 2) + 2 - L.W / 32;
                        var1.b(var1.eL, var5, var6);
                     }
                  }

                  ++var18;
               }
            }

            var1.W();
            if (var1.bY) {
               var1.e(a == com.runescape.a.a ? 516 : 0, 0);
            }

            if (a == com.runescape.a.a) {
               gg.a();
               var1.gf.a(0, var1.ao, 516);
            }
         }

      } catch (Exception var17) {
    	  uwotm8.al.b("Game Frame Drawing, " + var17.toString());
         throw new RuntimeException();
      }
   }

   private static String o() {
      String var0;
      Pattern var1;
      BufferedReader var2;
      String var3;
      String var4;
      Matcher var5;
      Process var15;
      if (!(var0 = System.getProperty("os.name")).startsWith("Linux") && !var0.startsWith("HP-UX")) {
         if (var0.startsWith("Mac")) {
            var15 = null;
            var1 = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");

            try {
               var15 = Runtime.getRuntime().exec("ifconfig");
            } catch (IOException var8) {
               var8.printStackTrace();
            }

            try {
               var15.waitFor();
            } catch (InterruptedException var7) {
               var7.printStackTrace();
            }

            var2 = new BufferedReader(new InputStreamReader(var15.getInputStream()));
            var3 = "";
            var4 = "";

            try {
               while((var3 = var2.readLine()) != null) {
                  var4 = var4 + var3 + "\n";
               }
            } catch (IOException var13) {
               var13.printStackTrace();
            }

            if ((var5 = var1.matcher(var4)).find()) {
               var3 = var5.group(0);
            } else {
               System.out.println("Error parsing output");
            }

            return var3;
         } else {
            var0 = null;
            HashMap var16 = new HashMap();
            Enumeration var17 = null;

            try {
               var17 = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException var10) {
               var10.printStackTrace();
            }

            while(var17.hasMoreElements()) {
               NetworkInterface var18 = (NetworkInterface)var17.nextElement();
               byte[] var19 = null;

               try {
                  var19 = var18.getHardwareAddress();
               } catch (SocketException var9) {
                  var9.printStackTrace();
               }

               if (var19 != null) {
                  StringBuilder var20 = new StringBuilder();

                  for(int var6 = 0; var6 < var19.length; ++var6) {
                     var20.append(String.format("%02X%s", var19[var6], var6 < var19.length - 1 ? "-" : ""));
                  }

                  if (!var20.toString().isEmpty()) {
                     var16.put(var18.getName(), var20.toString());
                  }

                  if (!var20.toString().isEmpty() && var0 == null) {
                     var0 = var18.getName();
                  }
               }
            }

            return var0 != null ? (String)var16.get(var0) : null;
         }
      } else {
         var15 = null;
         var1 = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");

         try {
            var15 = Runtime.getRuntime().exec("ip addr show");
         } catch (IOException var12) {
            var12.printStackTrace();
         }

         try {
            var15.waitFor();
         } catch (InterruptedException var11) {
            var11.printStackTrace();
         }

         var2 = new BufferedReader(new InputStreamReader(var15.getInputStream()));
         var3 = "";
         var4 = "";

         try {
            while((var3 = var2.readLine()) != null) {
               var4 = var4 + var3 + "\n";
            }
         } catch (IOException var14) {
            var14.printStackTrace();
         }

         var4 = var4.replace("00:00:00:00:00:00", "").replace("ff:ff:ff:ff:ff:ff", "");
         if ((var5 = var1.matcher(var4)).find()) {
            var3 = var5.group(0);
         } else {
            System.out.println("Error parsing output");
         }

         return var3;
      }
   }

   private static String e(int var0) {
      String var2;
      for(int var1 = (var2 = String.valueOf(var0)).length() - 3; var1 > 0; var1 -= 3) {
         var2 = var2.substring(0, var1) + "," + var2.substring(var1);
      }

      if (var2.length() > 8) {
         var2 = "@gre@" + var2.substring(0, var2.length() - 8) + "M @whi@(" + var2 + ")";
      } else if (var2.length() > 4) {
         var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
      }

      return " ".concat(String.valueOf(var2));
   }

   private void p() {
      String var1 = null;

      for(int var2 = 0; var2 < 100; ++var2) {
         int var3;
         if (this.cL[var2] != null && ((var3 = this.cJ[var2]) == 3 || var3 == 7)) {
            var1 = this.cK[var2];
            break;
         }
      }

      if (var1 == null) {
         this.a("You haven't received any messages to which you can reply.", 0, "");
      } else {
         if (var1.startsWith("@cr")) {
            var1 = var1.substring(5);
         }

         if (var1.startsWith("@irn")) {
            var1 = var1.substring(5);
         }

         long var5 = uwotm8.StringUtils.a(var1.trim());
         int var6 = -1;

         for(int var4 = 0; var4 < this.ck; ++var4) {
            if (this.cV[var4] == var5) {
               var6 = var4;
               break;
            }
         }

         if (var6 != -1) {
            if (this.bm[var6] > 0) {
               ab = true;
               this.ac = 0;
               this.hn = true;
               this.gF = "";
               this.eC = 3;
               this.cT = this.cV[var6];
               this.fD = "Enter message to send to " + this.eT[var6];
               return;
            }

            this.a("That player is currently offline.", 0, "");
         }

      }
   }

   private boolean f(int var1) {
      if (var1 < 0) {
         return false;
      } else {
         if ((var1 = this.J[var1]) >= 2000) {
            var1 -= 2000;
         }

         return var1 == 337;
      }
   }

   private static String g(int var0) {
      switch(var0) {
      case 1:
         return "@cr1@";
      case 2:
         return "@cr2@";
      case 3:
         return "@cr2@";
      case 4:
         return "@irn@";
      default:
         return "";
      }
   }

   private int a(int var1, int var2, int var3) {
      switch(var1) {
      case 1:
         this.gK[0].a(var2, var3);
         return 15;
      case 2:
         this.gK[1].a(var2, var3);
         return 15;
      case 3:
         this.gK[1].a(var2, var3);
         return 15;
      case 4:
         aB_1.a("chaticons", 0).d(var2, var3);
         return 13;
      default:
         return 0;
      }
   }

   private int d(int var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1 > 0) {
         var5 = 0 + this.a(var1, var3 + 0, var4);
      }

      if (var2 > 0) {
         var5 += this.a(var2, var5 + var3, var4);
      }

      return var5;
   }

   private boolean q() {
      return this.hn || this.ac != 0 || this.bA != null || this.ai != -1 || this.em != -1;
   }

   private void a(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         try {
            var1 = var1.toLowerCase().trim();
            String[] var2 = new String[]{var1};
            if (var1.indexOf(" ") != -1) {
               var2 = var1.split(" ");
            }

            this.aF = 0;
            int var7 = this.ac == 3 ? uwotm8.i.x : (this.ac == 4 ? uwotm8.ActorDefinition.a : uwotm8.j.a);
            int var3 = 0;

            while(true) {
               if (var3 >= var7) {
                  return;
               }

               if (this.aF >= 100) {
                  break;
               }

               label101: {
                  String var4 = null;
                  if (this.ac == 3) {
                     i var5;
                     if ((var5 = uwotm8.i.c(var3)) == null || var5.h != -1 || var5.k == null || var5.k.isEmpty()) {
                        break label101;
                     }

                     var4 = var5.k.toLowerCase();
                  } else if (this.ac == 4) {
                     ActorDefinition var8;
                     if ((var8 = uwotm8.ActorDefinition.a(var3)) == null || var8.f == null || var8.f.isEmpty()) {
                        break label101;
                     }

                     var4 = var8.f.toLowerCase();
                  } else if (this.ac == 5) {
                     j var9;
                     if ((var9 = uwotm8.j.a(var3)) == null || var9.c == null || var9.c.isEmpty()) {
                        break label101;
                     }

                     var4 = var9.c.toLowerCase();
                  }

                  if (var4 != null && !var4.isEmpty()) {
                     int var10 = 0;

                     while(true) {
                        if (var10 >= var2.length) {
                           this.aG[this.aF] = var4;
                           this.aH[this.aF] = var3;
                           ++this.aF;
                           break;
                        }

                        if (var4.indexOf(var2[var10]) == -1) {
                           break;
                        }

                        ++var10;
                     }
                  }
               }

               ++var3;
            }
         } catch (Exception var6) {
            System.out.println("Error searching defs:");
            var6.printStackTrace();
         }

      } else {
         this.aF = 0;
      }
   }

   private void a(Rectangle var1, int var2, int var3) {
      o var4 = this.hz;
      o var5 = this.hz;
      int var15 = this.hz.a;
      uwotm8.p.b(var3 + 20 + 3, var2, (int)var1.getWidth(), var3);
      var3 += var15 - 1;
      this.hF.b("SEARCH NAME: <col=255>" + this.dG + "*</col>", (int)var1.getCenterX(), var3, 0, -1);
      uwotm8.p.c(var3 += 4, g ? 5723991 : 8418912, (int)var1.getWidth() - 12, var2);
      uwotm8.p.b((int)var1.getHeight() + var3, var2, (int)var1.getWidth(), var3);
      if (this.dG.length() == 0) {
         this.hF.b("ENTER SEARCH NAME", (int)var1.getCenterX(), var3 + (int)var1.getCenterY() - 20, 255, -1);
      } else if (this.aF <= 0) {
         this.hF.b("NO SEARCH RESULTS FOR: " + this.dG, (int)var1.getCenterX(), var3 + (int)var1.getCenterY() - 20, 255, -1);
      } else {
         try {
            int var6 = var1.width / 3;
            int var7 = a == com.runescape.a.a ? t.a(true) : 0;
            int var8 = 0;

            int var9;
            for(var9 = 0; var9 < this.aF; ++var9) {
               if (this.aG[var9] != null && !this.aG[var9].isEmpty()) {
                  int var10;
                  if (this.ac == 3) {
                     var10 = var3 + var8 * 34 - i;
                     int var11 = var9 % 3;
                     int var12 = var2 + var6 * var11;
                     if (this.b(var12, var7 + var10, var6, 34)) {
                        uwotm8.p.a(16777215, var10, var6, 34, 64, var12);
                     }

                     Sprite var13;
                     if ((var13 = uwotm8.i.a(this.aH[var9], 64, 0)) != null) {
                        var13.d(var12, var10);
                     } else {
                        uwotm8.p.a(16711680, var10 + 2, 32, 32, 128, var12 + 2);
                     }

                     var10 += 2;
                     var4.a(false, var12 + 34 + 3, 0, this.aG[var9], var10 + var15);
                     var4.a(false, var12 + 34 + 3, 0, "ID #" + this.aH[var9], var10 + (var15 << 1) + 3);
                     if (var9 < this.aF - 1 && var11 >= 2) {
                        ++var8;
                     }
                  } else {
                     var10 = var3 + var9 * (var15 + 6) + var15 + 3 - i;
                     var4.a(false, var2, 0, this.aG[var9] + " - " + this.aH[var9], var10);
                  }
               }
            }

            uwotm8.p.e();
            var9 = (int)var1.getHeight() + 1;
            if (this.ac == 3) {
               if ((j = (var8 + 1) * 34) < (int)var1.getHeight() - 1) {
                  j = (int)var1.getHeight() - 1;
               }

               this.a(var9, i, var3, (int)var1.getWidth(), j);
            } else {
               if ((j = this.aF * (var15 + 6) + 3) < (int)var1.getHeight() - 1) {
                  j = (int)var1.getHeight() - 1;
               }

               this.a(var9, i, var3, (int)var1.getWidth(), j);
            }
         } catch (Exception var14) {
            System.out.println("Error drawing def search:");
            var14.printStackTrace();
         }
      }

      uwotm8.p.e();
   }

   private void a(String var1, String var2, int var3, int var4) {
      this.hA.a(0, var1, var4 + 40, 259);
      this.hA.a(128, var2, var4 + 60, 259);
   }

   private void r() {
      if (a == com.runescape.a.a) {
         gh.a();
      }

      uwotm8.r.t = gq;
      if (this.q()) {
         e = true;
      }

      t.c(this);
      Rectangle var1 = t.b();
      int var2 = t.a(false);
      int var3 = (int)var1.getX();
      int var4 = var2 + (int)var1.getY();
      if (this.hn) {
         this.a(this.fD, this.gF + "*", 259, var4);
      } else if (this.ac == 1) {
         this.a("Enter amount:", this.dG + "*", 259, var4);
      } else if (this.ac == 2) {
         this.a("Enter name:", this.dG + "*", 259, var4);
      } else if (this.ac >= 3 && this.ac <= 5) {
         this.a(var1, var3, var4);
      } else if (this.bA != null) {
         this.a(this.bA, "Click to continue", 259, var4);
      } else if (this.ai != -1) {
         this.a(var3 + 6, var4 + 10, 520, 143, uwotm8.m.a[this.ai], -1, 0);
      } else if (this.em != -1) {
         this.a(var3 + 6, var4 + 10, 520, 143, uwotm8.m.a[this.em], -1, 0);
      } else if (e) {
         o var5 = this.hz;
         o var6 = this.hz;
         int var17 = this.hz.a;
         int var7 = 0;
         uwotm8.p.b((int)var1.getMaxY() + var2, var3, (int)var1.getWidth(), var4);

         int var8;
         String var9;
         for(var8 = 0; var8 < 500; ++var8) {
            if (this.cL[var8] != null) {
               var9 = this.cK[var8];
               String var10 = this.cL[var8];
               int var11 = this.cJ[var8];
               int var12 = this.bc[var8];
               boolean var13 = this.bd[var8];
               int var14 = var4 + (int)var1.getHeight() - var7 * (var17 + 3) - 6 + 1 + F;
               byte var16 = 0;
               if (var9 != null && var9.startsWith("@irn@")) {
                  var9 = var9.substring(5);
                  var16 = 4;
               }

               int var15;
               String var18;
               switch(var11) {
               case 0:
                  if ((this.be == 5 || this.be == 0) && (this.o == 0 || this.o == 1 && var13)) {
                     var5.a(false, var3, 0, var10, var14);
                     ++var7;
                  }
                  break;
               case 1:
               case 2:
                  if ((this.be == 1 || this.be == 0) && (var11 == 1 || this.aj == 0 || this.aj == 1 && this.e(var9))) {
                     var15 = var3 + this.d(var12, var16, var3, var14 - 12);
                     var5.a(false, var15, 0, var9 + ":", var14);
                     var15 += var5.a(var9 + ":") + 2;
                     var5.a(false, var15, 255, var10, var14);
                     ++var7;
                  }
                  break;
               case 3:
               case 7:
                  if ((this.gA == 0 && this.be == 0 || this.be == 2) && (var11 == 7 || this.u == 0 || this.u == 1 && this.e(var9))) {
                     var5.a(false, var3, 0, "From", var14);
                     var15 = (var15 = var3 + var5.a("From ")) + this.d(var12, var16, var15, var14 - 12);
                     var5.a(false, var15, 0, var9 + ":", var14);
                     var15 += var5.a(var9 + ":") + 2;
                     var5.a(false, var15, 8388608, var10, var14);
                     ++var7;
                  }
                  break;
               case 4:
                  if ((this.be == 3 || this.be == 0) && var11 == 4 && (this.ae == 0 || this.ae == 1 && this.e(var9))) {
                     var5.a(false, var3, 8388736, var9 + " " + var10, var14);
                     ++var7;
                  }
                  break;
               case 5:
                  if ((this.gA == 0 && this.be == 0 || this.be == 2) && this.u < 2) {
                     var5.a(false, var3, 8388608, var9 + " " + var10, var14);
                     ++var7;
                  }
                  break;
               case 6:
                  if ((this.gA == 0 && this.be == 0 || this.be == 2) && this.u < 2) {
                     var5.a(false, var3, 0, "To " + var9 + ":", var14);
                     var5.a(false, var3 + var5.a("To :".concat(String.valueOf(var9))) + 2, 8388608, var10, var14);
                     ++var7;
                  }
                  break;
               case 8:
                  if (this.be == 3 || this.be == 0) {
                     var5.a(false, var3, 8270336, var9 + " " + var10, var14);
                     ++var7;
                  }
                  break;
               case 9:
                  if ((this.be == 0 && this.n == 0 || this.be == 9) && (this.n == 0 || this.n == 1)) {
                     var18 = this.cM[var8];
                     var5.a(false, var3, 255, "[", var14);
                     var15 = var3 + 6;
                     var5.a(false, var15, 255, var18, var14);
                     var15 += var5.a(var18);
                     var5.a(false, var15, 255, "]", var14);
                     var15 += 6;
                     var15 += this.d(var12, var16, var15, var14 - 12);
                     var5.a(false, var15, 0, var9 + ":", var14);
                     var15 += var5.a(var9 + ":") + 2;
                     var5.a(false, var15, 8270336, var10, var14);
                     ++var7;
                  }
               case 10:
               case 11:
               case 13:
               case 14:
               case 15:
               default:
                  break;
               case 12:
                  if ((this.be == 5 || this.be == 0) && (this.o == 0 || this.o == 1 && var13)) {
                     var5.a(false, var3, 0, var10 + " @red@" + var9, var14);
                     ++var7;
                  }
                  break;
               case 16:
                  if ((this.be == 16 || this.be == 0 && this.m == 0) && (this.m == 0 || this.m == 1)) {
                     var18 = this.cM[var8];
                     var5.a(false, var3, 0, "[", var14);
                     var15 = var3 + 6;
                     var5.a(false, var15, 255, var18, var14);
                     var15 += var5.a(var18);
                     var5.a(false, var15, 0, "]", var14);
                     var15 += 6;
                     var15 += this.d(var12, var16, var15, var14 - 12);
                     var5.a(false, var15, 0, var9 + ":", var14);
                     var15 += var5.a(var9 + ":") + 2;
                     var5.a(false, var15, 8388608, var10, var14);
                     ++var7;
                  }
               }
            }
         }

         uwotm8.p.e();
         var8 = (int)var1.getHeight();
         if ((Z = var7 * (var17 + 3) + 3) < (int)var1.getHeight() - 1) {
            Z = (int)var1.getHeight() - 1;
         }

         this.a(var8, Z - F - var8, var4, (int)var1.getWidth(), Z);
         if (L != null && L.ai != null) {
            var9 = L.ai;
         } else {
            var9 = uwotm8.StringUtils.c(S);
         }

         var3 = (int)var1.getX();
         uwotm8.p.b((var4 = var2 + (int)var1.getMaxY()) + 20, var3, (int)var1.getWidth(), var4);
         uwotm8.p.c(var4, g ? 5723991 : 8418912, (int)var1.getWidth() - 12, var3);
         var4 += var17;
         var3 += this.d(this.bL, L.aB ? 4 : 0, var3, var4 - 12);
         var5.b(0, var9 + ":", var4, var3);
         var5.b(255, var3 + var5.a(var9 + ":") + 2, this.ca + "*", var4, false);
         uwotm8.p.e();
      }

      if (this.bY) {
         this.e(0, a == com.runescape.a.a ? 338 : 0);
      }

      if (a == com.runescape.a.a) {
         gh.a(338, super.ao, 0);
      }

      gg.a();
      uwotm8.r.t = gs;
   }

   public final void a(Runnable var1, int var2) {
      if (var2 > 10) {
         var2 = 10;
      }

      Applet var10000 = uwotm8.al.e;
      super.a(var1, var2);
   }

   public static Socket a(int var0) throws UnknownHostException, IOException {
      return new Socket(InetAddress.getByName(hT), var0);
   }

   private void s() {
      if (this.eX == 0) {
         int var1 = super.aw;
         if (this.fN == 1 && super.ax >= 516 && super.ay >= 160 && super.ax <= 765 && super.ay <= 205) {
            var1 = 0;
         }

         int var2;
         int var3;
         int var4;
         int var6;
         int var13;
         if (this.bY) {
            if (var1 != 1) {
               var2 = super.au - 4;
               var3 = super.av - 4;
               if (var2 < this.cP - 10 || var2 > this.cP + this.cR + 10 || var3 < this.cQ - 10 || var3 > this.cQ + this.cS + 10) {
                  this.bY = false;
               }
            }

            if (var1 == 1) {
               var2 = this.cP;
               var3 = this.cQ;
               var4 = this.cR;
               var13 = super.ax - 4;
               var1 = super.ay - 4;
               var6 = -1;

               for(int var7 = 0; var7 < this.N; ++var7) {
                  int var8 = var3 + 31 + (this.N - 1 - var7) * 15;
                  if (var13 > var2 && var13 < var2 + var4 && var1 > var8 - 13 && var1 < var8 + 3) {
                     var6 = var7;
                  }
               }

               if (var6 != -1) {
                  this.m(var6);
               }

               this.bY = false;
               return;
            }
         } else {
            if (var1 == 1 && this.N > 0 && ((var2 = this.J[this.N - 1]) >= 700 && var2 <= 705 || var2 == 632 || var2 == 78 || var2 == 867 || var2 == 431 || var2 == 53 || var2 == 74 || var2 == 454 || var2 == 539 || var2 == 493 || var2 == 847 || var2 == 447 || var2 == 1125)) {
               var3 = this.fd[this.N - 1];
               m var5;
               if ((var5 = uwotm8.m.a(var4 = this.fe[this.N - 1])).y || var5.B) {
                  this.ha = false;
                  this.dv = 0;
                  this.eV = var4;
                  this.eW = var3;
                  this.eX = 2;
                  this.eY = super.ax;
                  this.eZ = super.ay;
                  if (var5.l == v) {
                     this.eX = 1;
                  }

                  if (var5.l == this.ai) {
                     this.eX = 3;
                  }

                  return;
               }
            }

            if (var1 == 1 && (this.hl == 1 || this.f(this.N - 1)) && this.N > 2) {
               var1 = 2;
            }

            if (var1 == 1 && this.N > 0) {
               this.m(this.N - 1);
            }

            if (var1 == 2 && this.N > 0) {
               this.V();
            }

            boolean var10;
            if (this.dW == 0 && super.aw == 1) {
               if (this.m()) {
                  Point var9;
                  var3 = (var9 = t.b(true)).x + t.c().x;
                  var4 = var9.y + t.c().y;
                  var13 = super.ax - var3;
                  var3 = super.ay - var4;
                  if (var13 >= 0 && var13 < 146 && var3 >= 0 && var3 < 151) {
                     var10 = true;
                     var10 = false;
                     var10 = false;
                     if (Math.pow((double)(77 - var13), 2.0D) + Math.pow((double)(77 - var3), 2.0D) < Math.pow(77.0D, 2.0D)) {
                        var13 -= 73;
                        var3 -= 77;
                        var6 = this.V & 2047;
                        var2 = uwotm8.r.r[var6];
                        var4 = uwotm8.r.s[var6];
                        var2 = var2 << 8 >> 8;
                        var4 = var4 << 8 >> 8;
                        var6 = var3 * var2 + var13 * var4 >> 11;
                        var2 = var3 * var4 - var13 * var2 >> 11;
                        var4 = L.V + var6 >> 7;
                        var2 = L.W - var2 >> 7;
                        if (this.a(1, 0, 0, 0, L.b[0], 0, 0, var2, L.a[0], true, var4)) {
                           this.gy.b(var13);
                           this.gy.b(var3);
                           this.gy.c(this.V);
                           this.gy.b(57);
                           this.gy.b(0);
                           this.gy.b(0);
                           this.gy.b(89);
                           this.gy.c(L.V);
                           this.gy.c(L.W);
                           this.gy.b(this.ht);
                           this.gy.b(63);
                        }
                     }
                  }
               }

               if (++fB > 1151) {
                  fB = 0;
                  this.gy.writeOpCode(246);
                  this.gy.b(0);
                  var2 = this.gy.b;
                  if ((int)(Math.random() * 2.0D) == 0) {
                     this.gy.b(101);
                  }

                  this.gy.b(197);
                  this.gy.c((int)(Math.random() * 65536.0D));
                  this.gy.b((int)(Math.random() * 256.0D));
                  this.gy.b(67);
                  this.gy.c(14214);
                  if ((int)(Math.random() * 2.0D) == 0) {
                     this.gy.c(29487);
                  }

                  this.gy.c((int)(Math.random() * 65536.0D));
                  if ((int)(Math.random() * 2.0D) == 0) {
                     this.gy.b(220);
                  }

                  this.gy.b(180);
                  this.gy.h(this.gy.b - var2);
               }
            }

            t.b(this);
            t.d(this);
            var10 = a == com.runescape.a.a;
            this.aS = -1;
            if (uwotm8.Settings.j) {
               boolean var11 = uwotm8.Settings.k;
               Point var14 = new Point(248, 18);
               Point var15 = new Point(240, 22);
               Point var12 = new Point(!var11 ? 230 : 75, 122);
               Point var16 = new Point(224, 126);
               if (super.au >= c - (var10 ? var14.x : var15.x) && super.au <= c - ((var10 ? var14.x : var15.x) - 22) && super.av >= (var10 ? var14.y : var15.y) && super.av <= (var10 ? var14.y : var15.y) + 28) {
                  this.aS = 0;
                  return;
               }

               if (super.au >= c - (var10 ? var12.x : var16.x) && super.au <= c - ((var10 ? var12.x : var16.x) - 56) && super.av >= (var10 ? var12.y : var16.y) && super.av <= (var10 ? var12.y : var16.y) + 28) {
                  this.aS = 3;
               }
            }
         }

      }
   }

   private void t() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var7;
      int var8;
      int var16;
      try {
         this.ds = -1;
         this.dr = false;
         this.ex.f();
         this.dO.f();
         uwotm8.r.c();
         u();
         this.cO.b();
         System.gc();

         for(var1 = 0; var1 < 4; ++var1) {
            this.gU[var1].a();
         }

         for(var1 = 0; var1 < 4; ++var1) {
            for(var2 = 0; var2 < 104; ++var2) {
               for(var3 = 0; var3 < 104; ++var3) {
                  this.ho[var1][var2][var3] = 0;
               }
            }
         }

         S_1 var12 = new S_1(this.ho, this.gH);
         var2 = this.gt.length;
         this.gy.writeOpCode(0);
         if (!this.gb) {
            for(var3 = 0; var3 < var2; ++var3) {
               var4 = (this.gV[var3] >> 8 << 6) - this.eg;
               var5 = ((this.gV[var3] & 255) << 6) - this.eh;
               byte[] var6;
               if ((var6 = this.gt[var3]) != null) {
                  var12.a(var6, var5, var4, this.eG - 6 << 3, this.eH - 6 << 3, this.gU);
               }
            }

            for(var3 = 0; var3 < var2; ++var3) {
               var4 = (this.gV[var3] >> 8 << 6) - this.eg;
               var5 = ((this.gV[var3] & 255) << 6) - this.eh;
               if (this.gt[var3] == null && this.eH < 800) {
                  var12.a(var5, 64, 64, var4);
               }
            }

            if (++fk > 160) {
               fk = 0;
               this.gy.writeOpCode(238);
               this.gy.b(96);
            }

            this.gy.writeOpCode(0);

            for(var3 = 0; var3 < var2; ++var3) {
               byte[] var15;
               if ((var15 = this.hf[var3]) != null) {
                  var5 = (this.gV[var3] >> 8 << 6) - this.eg;
                  var16 = ((this.gV[var3] & 255) << 6) - this.eh;
                  var12.a(var5, this.gU, var16, this.cO, var15);
               }
            }
         }

         if (this.gb) {
            var3 = 0;

            label234:
            while(true) {
               int var9;
               int var10;
               if (var3 >= 4) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        if (this.fK[0][var3][var4] == -1) {
                           var12.a(var4 << 3, 8, 8, var3 << 3);
                        }
                     }
                  }

                  this.gy.writeOpCode(0);
                  var3 = 0;

                  while(true) {
                     if (var3 >= 4) {
                        break label234;
                     }

                     for(var4 = 0; var4 < 13; ++var4) {
                        for(var5 = 0; var5 < 13; ++var5) {
                           if ((var16 = this.fK[var3][var4][var5]) != -1) {
                              var7 = var16 >> 24 & 3;
                              var8 = var16 >> 1 & 3;
                              var2 = var16 >> 14 & 1023;
                              var16 = var16 >> 3 & 2047;
                              var9 = (var2 / 8 << 8) + var16 / 8;

                              for(var10 = 0; var10 < this.gV.length; ++var10) {
                                 if (this.gV[var10] == var9 && this.hf[var10] != null) {
                                    var12.a(this.gU, this.cO, var7, var4 << 3, (var16 & 7) << 3, var3, this.hf[var10], (var2 & 7) << 3, var8, var5 << 3);
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     ++var3;
                  }
               }

               for(var4 = 0; var4 < 13; ++var4) {
                  for(var5 = 0; var5 < 13; ++var5) {
                     if ((var16 = this.fK[var3][var4][var5]) != -1) {
                        var7 = var16 >> 14 & 1023;
                        var8 = var16 >> 3 & 2047;
                        var2 = var16 >> 24 & 3;
                        var16 = var16 >> 1 & 3;
                        var9 = (var7 / 8 << 8) + var8 / 8;

                        for(var10 = 0; var10 < this.gV.length; ++var10) {
                           if (this.gV[var10] == var9 && this.gt[var10] != null) {
                              var12.a(var2, var16, this.gU, var4 << 3, (var7 & 7) << 3, this.gt[var10], (var8 & 7) << 3, var3, var5 << 3);
                              break;
                           }
                        }
                     }
                  }
               }

               ++var3;
            }
         }

         this.gy.writeOpCode(0);
         var12.a(this.gU, this.cO);
         gg.a();
         this.gy.writeOpCode(0);
         int var10000 = uwotm8.S_1.b;
         this.cO.a(0);

         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               this.c(var4, var5);
            }
         }

         if (++et > 98) {
            et = 0;
            this.gy.writeOpCode(150);
         }

         Client var13 = this;

         for(aa var14 = (aa)this.gp.b(); var14 != null; var14 = (aa)var13.gp.d()) {
            if (var14.d == -1) {
               var14.l = 0;
               var13.a(var14);
            } else {
               var14.D();
            }
         }
      } catch (Exception var11) {
         ;
      }

      uwotm8.j.A.a();
      if (super.aq != null) {
         this.gy.writeOpCode(210);
         this.gy.f(1057001181);
      }

      System.gc();
      uwotm8.r.d();
      this.E.e();
      var1 = (this.eG - 6) / 8 - 1;
      var2 = (this.eG + 6) / 8 + 1;
      var3 = (this.eH - 6) / 8 - 1;
      var4 = (this.eH + 6) / 8 + 1;
      if (this.fS) {
         var1 = 49;
         var2 = 50;
         var3 = 49;
         var4 = 50;
      }

      for(var5 = var1; var5 <= var2; ++var5) {
         for(var16 = var3; var16 <= var4; ++var16) {
            if (var5 == var1 || var5 == var2 || var16 == var3 || var16 == var4) {
               if ((var7 = this.E.a(0, var16, var5)) != -1) {
                  this.E.b(var7, 3);
               }

               if ((var8 = this.E.a(1, var16, var5)) != -1) {
                  this.E.b(var8, 3);
               }
            }
         }
      }

   }

   private static void u() {
      uwotm8.j.A.a();
      uwotm8.j.y.a();
      uwotm8.ActorDefinition.t.a();
      uwotm8.i.e.a();
      uwotm8.i.d.a();
      uwotm8.y.aj.a();
      uwotm8.g.h.a();
   }

   private void h(int var1) {
      int[] var2 = this.hs.a;
      int var3 = this.hs.a.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         var2[var4] = 0;
      }

      int var5;
      for(var4 = 1; var4 < 103; ++var4) {
         var3 = 24628 + (103 - var4 << 9 << 2);

         for(var5 = 1; var5 < 103; ++var5) {
            if ((this.ho[var1][var5][var4] & 24) == 0) {
               this.cO.a(var2, var3, var1, var5, var4);
            }

            if (var1 < 3 && (this.ho[var1 + 1][var5][var4] & 8) != 0) {
               this.cO.a(var2, var3, var1 + 1, var5, var4);
            }

            var3 += 4;
         }
      }

      Sprite var8 = this.hs;
      uwotm8.p.a(this.hs.c, var8.b, var8.a);

      for(var5 = 1; var5 < 103; ++var5) {
         for(int var9 = 1; var9 < 103; ++var9) {
            if ((this.ho[var1][var9][var5] & 24) == 0) {
               this.b(var5, 16777215, var9, 15597568, var1);
            }

            if (var1 < 3 && (this.ho[var1 + 1][var9][var5] & 8) != 0) {
               this.b(var5, 16777215, var9, 15597568, var1 + 1);
            }
         }
      }

      gg.a();
      this.eI = 0;
      var1 = var1;
      Client var10 = this;

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            j var11;
            if ((var5 = var10.cO.l(var1, var3, var4)) != 0 && (var11 = uwotm8.j.a(var5 >> 14 & 32767)) != null && (var5 = var11.e) >= 0) {
               var10.fR[var10.eI] = var10.ef[var5];
               var10.eJ[var10.eI] = var3;
               var10.eK[var10.eI] = var4;
               ++var10.eI;
            }
         }
      }

   }

   private void c(int var1, int var2) {
      M_1 var3;
      if ((var3 = this.bn[this.cu][var1][var2]) == null) {
         this.cO.d(this.cu, var1, var2);
      } else {
         int var4 = -99999999;
         w var5 = null;

         w var6;
         int var8;
         for(var6 = (w)var3.b(); var6 != null; var6 = (w)var3.d()) {
            i var7;
            var8 = (var7 = uwotm8.i.c(var6.a)).a;
            if (var7.n) {
               var8 *= var6.b + 1;
            }

            if (var8 > var4) {
               var4 = var8;
               var5 = var6;
            }
         }

         var3.b((K_1)var5);
         var6 = null;
         w var9 = null;

         for(w var10 = (w)var3.b(); var10 != null; var10 = (w)var3.d()) {
            if (var10.a != ((w)var5).a && var6 == null) {
               var6 = var10;
            }

            if (var10.a != ((w)var5).a && var10.a != ((w)var6).a && var9 == null) {
               var9 = var10;
            }
         }

         var8 = var1 + (var2 << 7) + 1610612736;
         this.cO.a(var1, var8, (A)var6, this.b(this.cu, (var2 << 7) + 64, (var1 << 7) + 64), (A)var9, (A)var5, this.cu, var2);
      }
   }

   private void a(boolean var1) {
      for(int var2 = 0; var2 < this.bt; ++var2) {
         Npc var3 = this.bs[this.bu[var2]];
         int var4 = 536870912 + (this.bu[var2] << 14);
         if (var3 != null && var3.c() && var3.ad.s == var1) {
            int var5 = var3.V >> 7;
            int var6 = var3.W >> 7;
            if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
               if (var3.L == 1 && (var3.V & 127) == 64 && (var3.W & 127) == 64) {
                  if (this.cA[var5][var6] == this.hu) {
                     continue;
                  }

                  this.cA[var5][var6] = this.hu;
               }

               if (!var3.ad.p) {
                  var4 += Integer.MIN_VALUE;
               }

               this.cO.a(this.cu, var3.X, this.b(this.cu, var3.W, var3.V), var4, var3.W, (var3.L - 1 << 6) + 60, var3.V, var3, var3.M);
            }
         }
      }

   }

   private void a(int var1, m[] var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 != null) {
         for(int var8 = 0; var8 < var2.length; ++var8) {
            m var9;
            if ((var9 = var2[var8]) != null && var9.m == var7) {
               if (var9.v) {
                  if (var9.b == 0 && !this.e(var9)) {
                     continue;
                  }
               } else if (var9.u) {
                  continue;
               }

               int var10 = var9.e + var1;
               int var11 = var9.f + var4 - var6;
               if ((var9.n >= 0 || var9.V != 0) && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                  if (var9.n >= 0) {
                     this.bZ = var2[var9.n].o;
                  } else {
                     this.bZ = var9.o;
                  }
               }

               if (var9.b == 0) {
                  if (var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g + 32 && var5 < var11 + var9.h) {
                     this.a(var10, var2, var3, var11, var5, var9.t, var9.o);
                     if (var9.s > var9.h) {
                        this.a(var10 + var9.g, var9.h, var3, var5, var9, var11, true, var9.s);
                     }
                  }
               } else {
                  if (var9.b == 8 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     this.hX = var9.o;
                  }

                  int var13;
                  int var14;
                  if (var9.c == 1 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     boolean var12 = false;
                     if (var9.d != 0) {
                        var14 = var9.d;
                        boolean var10000;
                        if ((var9.d <= 0 || var14 > 200) && (var14 < 701 || var14 > 900)) {
                           if (var14 >= 401 && var14 <= 500) {
                              this.X[this.N] = "Remove @whi@" + var9.R;
                              this.J[this.N] = 322;
                              ++this.N;
                              var10000 = true;
                           } else {
                              var10000 = false;
                           }
                        } else {
                           if (var14 >= 801) {
                              var14 -= 701;
                           } else if (var14 >= 701) {
                              var14 -= 601;
                           } else if (var14 >= 101) {
                              var14 -= 101;
                           } else {
                              --var14;
                           }

                           this.X[this.N] = "Remove @whi@" + this.eT[var14];
                           this.J[this.N] = 792;
                           ++this.N;
                           this.X[this.N] = "Message @whi@" + this.eT[var14];
                           this.J[this.N] = 639;
                           ++this.N;
                           var10000 = true;
                        }

                        label453: {
                           if (!var10000) {
                              var14 = var9.d;
                              if (var9.d >= 20001 && var14 <= 20101) {
                                 label556: {
                                    var13 = var14 - 20001;
                                    String var20;
                                    if (this.d(L.ai) > 0 && !(var20 = uwotm8.StringUtils.a(this.cW[var13])).isEmpty()) {
                                       if (var20.startsWith("@cc1@") || var20.startsWith("@cc2@") || var20.startsWith("@cc3@")) {
                                          var20 = var20.substring(5);
                                       }

                                       var20 = uwotm8.StringUtils.c(var20);
                                       if (this.cX[var13] >= 2 || var20.equalsIgnoreCase(L.ai)) {
                                          var10000 = true;
                                          break label556;
                                       }

                                       this.X[this.N] = "Ban @whi@".concat(String.valueOf(var20));
                                       this.J[this.N] = 1502;
                                       ++this.N;
                                       this.X[this.N] = "Demote @whi@".concat(String.valueOf(var20));
                                       this.J[this.N] = 1501;
                                       ++this.N;
                                       this.X[this.N] = "Promote @whi@".concat(String.valueOf(var20));
                                       this.J[this.N] = 1500;
                                       ++this.N;
                                    }

                                    var10000 = true;
                                 }
                              } else {
                                 var10000 = false;
                              }

                              if (!var10000) {
                                 var10000 = false;
                                 break label453;
                              }
                           }

                           var10000 = true;
                        }

                        var12 = var10000;
                     }

                     if (!var12) {
                        this.X[this.N] = var9.aj + (this.bL > 1 ? " @gre@(@whi@" + var9.o + "@gre@)" : "");
                        this.J[this.N] = 315;
                        this.fe[this.N] = var9.o;
                        ++this.N;
                     }
                  }

                  if (var9.c == 2 && this.fN == 0 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     String var17 = var9.ag;
                     if (var9.ag.indexOf(" ") != -1) {
                        var17 = var17.substring(0, var17.indexOf(" "));
                     }

                     this.X[this.N] = var17 + " @gre@" + var9.ah + (this.bL > 1 ? " @gre@(@whi@" + var9.o + "@gre@)" : "");
                     this.J[this.N] = 626;
                     this.fe[this.N] = var9.o;
                     ++this.N;
                  }

                  if (var9.c == 3 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     this.X[this.N] = "Close" + (this.bL > 1 ? " @gre@(@whi@" + var9.o + "@gre@)" : "");
                     this.J[this.N] = 200;
                     this.fe[this.N] = var9.o;
                     ++this.N;
                  }

                  if (var9.c == 4 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     this.X[this.N] = var9.aj + (this.bL > 1 ? " @gre@(@whi@" + var9.o + "@gre@)" : "");
                     this.J[this.N] = 169;
                     this.fe[this.N] = var9.o;
                     ++this.N;
                  }

                  if (var9.c == 5 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     this.X[this.N] = var9.aj + (this.bL > 1 ? " @gre@(@whi@" + var9.o + "@gre@)" : "");
                     this.J[this.N] = 646;
                     this.fe[this.N] = var9.o;
                     ++this.N;
                  }

                  if (var9.c == 6 && !this.fU && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.g && var5 < var11 + var9.h) {
                     this.X[this.N] = var9.aj + (this.bL > 1 ? " @gre@(@whi@" + var9.o + "@gre@)" : "");
                     this.J[this.N] = 679;
                     this.fe[this.N] = var9.o;
                     ++this.N;
                  }

                  if (var9.b == 2) {
                     int var18 = 0;

                     for(var13 = 0; var13 < var9.h; ++var13) {
                        for(var14 = 0; var14 < var9.g; ++var14) {
                           int var15 = var10 + var14 * (32 + var9.E);
                           int var16 = var11 + var13 * (32 + var9.F);
                           if (var18 < 20) {
                              var15 += var9.G[var18];
                              var16 += var9.H[var18];
                           }

                           if (var3 >= var15 && var5 >= var16 && var3 < var15 + 32 && var5 < var16 + 32) {
                              this.eE = var18;
                              this.eF = var9.o;
                              if (var9.w[var18] > 0) {
                                 i var19 = uwotm8.i.c(var9.w[var18] - 1);
                                 if (this.hN == 1 && var9.z) {
                                    if (var9.o != this.hP || var18 != this.hO) {
                                       this.X[this.N] = "Use " + this.hR + " with @lre@" + var19.k;
                                       this.J[this.N] = 870;
                                       this.ff[this.N] = var19.c;
                                       this.fd[this.N] = var18;
                                       this.fe[this.N] = var9.o;
                                       ++this.N;
                                    }
                                 } else if (this.fN == 1 && var9.z) {
                                    if ((this.fP & 16) == 16) {
                                       this.X[this.N] = this.fQ + " @lre@" + var19.k;
                                       this.J[this.N] = 543;
                                       this.ff[this.N] = var19.c;
                                       this.fd[this.N] = var18;
                                       this.fe[this.N] = var9.o;
                                       ++this.N;
                                    }
                                 } else {
                                    if (var9.z) {
                                       for(var16 = 4; var16 >= 3; --var16) {
                                          if (var19.r != null && var19.r[var16] != null) {
                                             this.X[this.N] = var19.r[var16] + " @lre@" + var19.k;
                                             if (var16 == 3) {
                                                this.J[this.N] = 493;
                                             }

                                             if (var16 == 4) {
                                                this.J[this.N] = 847;
                                             }

                                             this.ff[this.N] = var19.c;
                                          } else {
                                             if (var16 != 4) {
                                                continue;
                                             }

                                             this.X[this.N] = "Drop @lre@" + var19.k;
                                             this.J[this.N] = 847;
                                             this.ff[this.N] = var19.c;
                                             if (var19.c == 1971) {
                                                this.X[this.N] = "Remove @lre@" + var19.k;
                                             }
                                          }

                                          this.fd[this.N] = var18;
                                          this.fe[this.N] = var9.o;
                                          ++this.N;
                                       }
                                    }

                                    if (var9.A) {
                                       this.X[this.N] = "Use @lre@" + var19.k;
                                       this.J[this.N] = 447;
                                       this.ff[this.N] = var19.c;
                                       this.fd[this.N] = var18;
                                       this.fe[this.N] = var9.o;
                                       ++this.N;
                                    }

                                    if (var9.z && var19.r != null) {
                                       for(var16 = 2; var16 >= 0; --var16) {
                                          if (var19.r[var16] != null) {
                                             this.X[this.N] = var19.r[var16] + " @lre@" + var19.k;
                                             if (var16 == 0) {
                                                this.J[this.N] = 74;
                                             }

                                             if (var16 == 1) {
                                                this.J[this.N] = 454;
                                             }

                                             if (var16 == 2) {
                                                this.J[this.N] = 539;
                                             }

                                             this.ff[this.N] = var19.c;
                                             this.fd[this.N] = var18;
                                             this.fe[this.N] = var9.o;
                                             ++this.N;
                                          }
                                       }
                                    }

                                    if (var19.s != null && (var9.l == 94 || var9.l == 483)) {
                                       for(var16 = 4; var16 >= 0; --var16) {
                                          if (var19.s[var16] != null) {
                                             this.X[this.N] = var19.s[var16] + " @lre@" + var19.k;
                                             if (var16 == 0) {
                                                this.J[this.N] = 700;
                                             }

                                             if (var16 == 1) {
                                                this.J[this.N] = 701;
                                             }

                                             if (var16 == 2) {
                                                this.J[this.N] = 702;
                                             }

                                             if (var16 == 3) {
                                                this.J[this.N] = 703;
                                             }

                                             if (var16 == 4) {
                                                this.J[this.N] = 704;
                                             }

                                             this.ff[this.N] = var19.c;
                                             this.fd[this.N] = var18;
                                             this.fe[this.N] = var9.o;
                                             ++this.N;
                                          }
                                       }
                                    }

                                    if (var9.J != null) {
                                       for(var16 = 4; var16 >= 0; --var16) {
                                          if (var9.J[var16] != null) {
                                             this.X[this.N] = var9.J[var16] + " @lre@" + var19.k;
                                             if (var16 == 0) {
                                                this.J[this.N] = 632;
                                             }

                                             if (var16 == 1) {
                                                this.J[this.N] = 78;
                                             }

                                             if (var16 == 2) {
                                                this.J[this.N] = 867;
                                             }

                                             if (var16 == 3) {
                                                this.J[this.N] = 431;
                                             }

                                             if (var16 == 4) {
                                                this.J[this.N] = 53;
                                             }

                                             this.ff[this.N] = var19.c;
                                             this.fd[this.N] = var18;
                                             this.fe[this.N] = var9.o;
                                             ++this.N;
                                          }
                                       }
                                    }

                                    this.X[this.N] = this.bL < 2 ? "Examine @lre@" + var19.k : "Examine @lre@" + var19.k + " @gre@(@whi@" + (var9.w[var18] - 1) + "@gre@)";
                                    this.J[this.N] = 1125;
                                    this.ff[this.N] = var19.c;
                                    this.fd[this.N] = var18;
                                    this.fe[this.N] = var9.o;
                                    ++this.N;
                                 }
                              }
                           }

                           ++var18;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if (t.d()) {
         this.ea.a(var4, var3);
         this.eb.a(var4, var3 + var1 - 16);
         uwotm8.p.a(var1 - 32, var3 + 16, var4, 2301979, 16);
         if ((var6 = (var1 - 32) * var1 / var5) < 8) {
            var6 = 8;
         }

         var1 = (var1 - 32 - var6) * var2 / (var5 - var1);
         uwotm8.p.a(var6, var3 + 16 + var1, var4, 5063219, 16);
         uwotm8.p.d(var3 + 16 + var1, 7759444, var6, var4);
         uwotm8.p.d(var3 + 16 + var1, 7759444, var6, var4 + 1);
         uwotm8.p.c(var3 + 16 + var1, 7759444, 16, var4);
         uwotm8.p.c(var3 + 17 + var1, 7759444, 16, var4);
         uwotm8.p.d(var3 + 16 + var1, 3353893, var6, var4 + 15);
         uwotm8.p.d(var3 + 17 + var1, 3353893, var6 - 1, var4 + 14);
         uwotm8.p.c(var3 + 15 + var1 + var6, 3353893, 16, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 3353893, 15, var4 + 1);
      } else {
         this.dY.d(var4, var3);
         this.dZ.d(var4, var3 + var1 - 16);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 1, 16);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 4011046, 15);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 3419425, 13);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 3024925, 11);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 2696219, 10);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 2433049, 9);
         uwotm8.p.b(var1 - 32, var3 + 16, var4, 1, 1);
         if ((var6 = (var1 - 32) * var1 / var5) < 8) {
            var6 = 8;
         }

         var1 = (var1 - 32 - var6) * var2 / (var5 - var1);
         uwotm8.p.b(var6, var3 + 16 + var1, var4, 5063219, 16);
         uwotm8.p.d(var3 + 16 + var1, 1, var6, var4);
         uwotm8.p.d(var3 + 16 + var1, 8482897, var6, var4 + 1);
         uwotm8.p.d(var3 + 16 + var1, 7562570, var6, var4 + 2);
         uwotm8.p.d(var3 + 16 + var1, 6970435, var6, var4 + 3);
         uwotm8.p.d(var3 + 16 + var1, 6970435, var6, var4 + 4);
         uwotm8.p.d(var3 + 16 + var1, 6641729, var6, var4 + 5);
         uwotm8.p.d(var3 + 16 + var1, 6641729, var6, var4 + 6);
         uwotm8.p.d(var3 + 16 + var1, 6378814, var6, var4 + 7);
         uwotm8.p.d(var3 + 16 + var1, 6378814, var6, var4 + 8);
         uwotm8.p.d(var3 + 16 + var1, 6115644, var6, var4 + 9);
         uwotm8.p.d(var3 + 16 + var1, 6115644, var6, var4 + 10);
         uwotm8.p.d(var3 + 16 + var1, 5852730, var6, var4 + 11);
         uwotm8.p.d(var3 + 16 + var1, 5852730, var6, var4 + 12);
         uwotm8.p.d(var3 + 16 + var1, 5326389, var6, var4 + 13);
         uwotm8.p.d(var3 + 16 + var1, 4931889, var6, var4 + 14);
         uwotm8.p.c(var3 + 16 + var1, 1, 15, var4);
         uwotm8.p.c(var3 + 17 + var1, 1, 15, var4);
         uwotm8.p.c(var3 + 17 + var1, 6641729, 14, var4);
         uwotm8.p.c(var3 + 17 + var1, 6970435, 13, var4);
         uwotm8.p.c(var3 + 17 + var1, 7167816, 11, var4);
         uwotm8.p.c(var3 + 17 + var1, 7562570, 10, var4);
         uwotm8.p.c(var3 + 17 + var1, 7759947, 7, var4);
         uwotm8.p.c(var3 + 17 + var1, 8088141, 5, var4);
         uwotm8.p.c(var3 + 17 + var1, 8285776, 4, var4);
         uwotm8.p.c(var3 + 17 + var1, 8482897, 3, var4);
         uwotm8.p.c(var3 + 17 + var1, 1, 2, var4);
         uwotm8.p.c(var3 + 18 + var1, 1, 16, var4);
         uwotm8.p.c(var3 + 18 + var1, 5655352, 15, var4);
         uwotm8.p.c(var3 + 18 + var1, 6115644, 14, var4);
         uwotm8.p.c(var3 + 18 + var1, 6444608, 11, var4);
         uwotm8.p.c(var3 + 18 + var1, 6641729, 10, var4);
         uwotm8.p.c(var3 + 18 + var1, 6970435, 7, var4);
         uwotm8.p.c(var3 + 18 + var1, 7233606, 5, var4);
         uwotm8.p.c(var3 + 18 + var1, 7430727, 4, var4);
         uwotm8.p.c(var3 + 18 + var1, 8088141, 3, var4);
         uwotm8.p.c(var3 + 18 + var1, 8482897, 2, var4);
         uwotm8.p.c(var3 + 18 + var1, 1, 1, var4);
         uwotm8.p.c(var3 + 19 + var1, 1, 16, var4);
         uwotm8.p.c(var3 + 19 + var1, 5326389, 15, var4);
         uwotm8.p.c(var3 + 19 + var1, 5655352, 14, var4);
         uwotm8.p.c(var3 + 19 + var1, 6115644, 11, var4);
         uwotm8.p.c(var3 + 19 + var1, 6378814, 9, var4);
         uwotm8.p.c(var3 + 19 + var1, 6641729, 7, var4);
         uwotm8.p.c(var3 + 19 + var1, 6970435, 5, var4);
         uwotm8.p.c(var3 + 19 + var1, 7233606, 4, var4);
         uwotm8.p.c(var3 + 19 + var1, 7562570, 3, var4);
         uwotm8.p.c(var3 + 19 + var1, 8482897, 2, var4);
         uwotm8.p.c(var3 + 19 + var1, 1, 1, var4);
         uwotm8.p.c(var3 + 20 + var1, 1, 16, var4);
         uwotm8.p.c(var3 + 20 + var1, 4931889, 15, var4);
         uwotm8.p.c(var3 + 20 + var1, 5523766, 14, var4);
         uwotm8.p.c(var3 + 20 + var1, 5852730, 13, var4);
         uwotm8.p.c(var3 + 20 + var1, 6115644, 10, var4);
         uwotm8.p.c(var3 + 20 + var1, 6378814, 8, var4);
         uwotm8.p.c(var3 + 20 + var1, 6641729, 6, var4);
         uwotm8.p.c(var3 + 20 + var1, 6970435, 4, var4);
         uwotm8.p.c(var3 + 20 + var1, 7562570, 3, var4);
         uwotm8.p.c(var3 + 20 + var1, 8482897, 2, var4);
         uwotm8.p.c(var3 + 20 + var1, 1, 1, var4);
         uwotm8.p.d(var3 + 16 + var1, 1, var6, var4 + 15);
         uwotm8.p.c(var3 + 15 + var1 + var6, 1, 16, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 1, 15, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 4142890, 14, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 4471853, 10, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 4734511, 9, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 4866095, 7, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 4931889, 4, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 5655352, 3, var4);
         uwotm8.p.c(var3 + 14 + var1 + var6, 1, 2, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 1, 16, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 4471853, 15, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 4931889, 11, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 5326389, 9, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 5523766, 7, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 5655352, 6, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 5852730, 4, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 6444608, 3, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 6970435, 2, var4);
         uwotm8.p.c(var3 + 13 + var1 + var6, 1, 1, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 1, 16, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 4471853, 15, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 4931889, 14, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 5523766, 12, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 5655352, 11, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 5852730, 10, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 6115644, 7, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 6378814, 4, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 7233606, 3, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 8088141, 2, var4);
         uwotm8.p.c(var3 + 12 + var1 + var6, 1, 1, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 1, 16, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 4931889, 15, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 5326389, 14, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 5655352, 13, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 5852730, 11, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 6115644, 9, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 6378814, 7, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 6641729, 5, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 6970435, 4, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 7562570, 3, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 8088141, 2, var4);
         uwotm8.p.c(var3 + 11 + var1 + var6, 1, 1, var4);
      }
   }

   private void a(I_1 var1, int var2) {
      this.bv = 0;
      this.cg = 0;
      I_1 var4 = var1;
      Client var3 = this;
      var1.n();
      int var5;
      int var6;
      if ((var5 = var1.i(8)) < this.bt) {
         for(var6 = var5; var6 < var3.bt; ++var6) {
            var3.bw[var3.bv++] = var3.bu[var6];
         }
      }

      if (var5 > var3.bt) {
    	  uwotm8.al.b(S + " Too many npcs");
         throw new RuntimeException("eek");
      } else {
         var3.bt = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            int var7 = var3.bu[var6];
            Npc var8 = var3.bs[var7];
            if (var4.i(1) == 0) {
               var3.bu[var3.bt++] = var7;
               var8.I = R;
            } else {
               int var9;
               if ((var9 = var4.i(2)) == 0) {
                  var3.bu[var3.bt++] = var7;
                  var8.I = R;
                  var3.ch[var3.cg++] = var7;
               } else if (var9 == 1) {
                  var3.bu[var3.bt++] = var7;
                  var8.I = R;
                  var9 = var4.i(3);
                  var8.a(false, var9);
                  if (var4.i(1) == 1) {
                     var3.ch[var3.cg++] = var7;
                  }
               } else if (var9 == 2) {
                  var3.bu[var3.bt++] = var7;
                  var8.I = R;
                  var9 = var4.i(3);
                  var8.a(true, var9);
                  var9 = var4.i(3);
                  var8.a(true, var9);
                  if (var4.i(1) == 1) {
                     var3.ch[var3.cg++] = var7;
                  }
               } else if (var9 == 3) {
                  var3.bw[var3.bv++] = var7;
               }
            }
         }

         this.a(var2, var1);
         this.b(var1);

         int var10;
         for(var10 = 0; var10 < this.bv; ++var10) {
            int var11 = this.bw[var10];
            if (this.bs[var11].I != R) {
               this.bs[var11].ad = null;
               this.bs[var11] = null;
            }
         }

         if (var1.b != var2) {
        	 uwotm8.al.b(S + " size mismatch in getnpcpos - pos:" + var1.b + " psize:" + var2);
            throw new RuntimeException("eek");
         } else {
            for(var10 = 0; var10 < this.bt; ++var10) {
               if (this.bs[this.bu[var10]] == null) {
            	   uwotm8.al.b(S + " null entry in npc list - pos:" + var10 + " size:" + this.bt);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private void d(int var1, int var2) {
      if (this.q == var1) {
         e = a != com.runescape.a.a ? !e : true;
      } else {
         this.q = var1;
         this.be = var2;
         ab = true;
         e = true;
      }
   }

   private void i(int var1) {
      try {
         int var2 = uwotm8.VariableParameter.a[var1].b;
         int var3 = this.A[var1];
         if (var2 == 0) {
            switch(var1) {
            case 19:
               this.gR = var3 > 0;
               if (this.gS != null && this.gP && this.hp <= 0) {
                  this.gS.a(this.gR);
                  if (!this.gS.a()) {
                     this.gO = this.cY;
                     this.gP = true;
                     this.E.a(2, this.gO);
                     return;
                  }
               }
               break;
            case 161:
               switch(var3) {
               case 1:
                  this.a(com.runescape.a.b);
                  uwotm8.Settings.a();
                  return;
               default:
                  this.a(com.runescape.a.a);
                  uwotm8.Settings.a();
                  return;
               }
            case 162:
            	uwotm8.Settings.g = var3 == 1;
            	uwotm8.Settings.a();
               return;
            case 163:
            	uwotm8.Settings.i = var3 == 0;
            	uwotm8.Settings.a();
               return;
            case 164:
            	uwotm8.Settings.j = var3 == 0;
            	uwotm8.Settings.a();
               return;
            case 165:
            	uwotm8.Settings.l = var3 == 0;
            	uwotm8.Settings.a();
            }

            return;
         }

         if (var2 == 1) {
            if (var3 == 1) {
               this.aX = 0.9D;
            }

            if (var3 == 2) {
               this.aX = 0.8D;
            }

            if (var3 == 3) {
               this.aX = 0.7D;
            }

            if (var3 == 4) {
               this.aX = 0.6D;
            }

            uwotm8.r.a(this.aX);
            uwotm8.i.d.a();
            this.hm = true;
         }

         boolean var5;
         if (var2 == 3 && !aW) {
            var5 = fW;
            if (var3 == 0) {
               if (!fW) {
                  this.hp = 0;
               }

               this.k(256);
               fW = true;
            }

            if (var3 == 1) {
               this.k(192);
               fW = true;
            }

            if (var3 == 2) {
               this.k(128);
               fW = true;
            }

            if (var3 == 3) {
               this.k(64);
               fW = true;
            }

            if (var3 == 4) {
               fW = false;
            }

            if (fW != var5) {
               if (fW) {
                  this.gO = this.cY;
                  this.gP = true;
                  this.E.a(2, this.gO);
               } else {
                  this.B();
               }

               this.hp = 0;
            }
         }

         if (var2 == 4 && !aW) {
        	 uwotm8.ap.a = var3;
            if (var3 == 0) {
               this.bC = true;
               var5 = false;
               uwotm8.al.g = 0;
            }

            if (var3 == 1) {
               this.bC = true;
               var5 = true;
               uwotm8.al.g = -400;
            }

            if (var3 == 2) {
               this.bC = true;
               var5 = true;
               uwotm8.al.g = -800;
            }

            if (var3 == 3) {
               this.bC = true;
               var5 = true;
               uwotm8.al.g = -1200;
            }

            if (var3 == 4) {
               this.bC = false;
            }
         }

         if (var2 == 5) {
            this.hl = var3;
         }

         if (var2 == 6) {
            this.hg = var3;
         }

         if (var2 == 7) {
            this.aT = var3 == 1;
         }

         if (var2 == 8) {
            this.gA = var3;
            ab = true;
         }

         if (var2 == 9) {
            this.cp = var3;
            return;
         }
      } catch (Exception var4) {
         ;
      }

   }

   private void v() {
      try {
         int var1 = 0;

         int var2;
         int var12;
         for(var2 = -1; var2 < this.ce + this.bt; ++var2) {
            Object var3;
            if (var2 == -1) {
               var3 = L;
            } else if (var2 < this.ce) {
               var3 = this.cd[this.cf[var2]];
            } else {
               var3 = this.bs[this.bu[var2 - this.ce]];
            }

            if (var3 != null && ((u)var3).c()) {
               ActorDefinition var4;
               if (var3 instanceof Npc) {
                  var4 = ((Npc)var3).ad;
                  if (((Npc)var3).ad.r != null) {
                     var4 = var4.b();
                  }

                  if (var4 == null) {
                     continue;
                  }
               }

               if (var2 < this.ce) {
                  var12 = 30;
                  y var5;
                  if ((var5 = (y)var3).al >= 0) {
                     this.a((u)var3, ((u)var3).h + 15);
                     if (this.dd >= 0) {
                        if (var5.am < 2) {
                           this.fi[var5.am].d(this.dd - 12, this.de - 30);
                           var12 += 25;
                        }

                        if (var5.al < 7) {
                           this.fh[var5.al].d(this.dd - 12, this.de - var12);
                           var12 += 18;
                        }
                     }
                  }

                  if (var2 >= 0 && this.bF == 10 && this.cD == this.cf[var2]) {
                     this.a((u)var3, ((u)var3).h + 15);
                     if (this.dd >= 0) {
                        this.fj[0].d(this.dd - 12, this.de - var12);
                     }
                  }
               } else {
                  var4 = ((Npc)var3).ad;
                  if (((Npc)var3).ad.j >= 0 && var4.j < this.fh.length) {
                     this.a((u)var3, ((u)var3).h + 15);
                     if (this.dd >= 0) {
                        this.fh[var4.j].d(this.dd - 12, this.de - 30);
                     }
                  }

                  if (this.bF == 1 && this.gM == this.bu[var2 - this.ce] && R % 20 < 10) {
                     this.a((u)var3, ((u)var3).h + 15);
                     if (this.dd >= 0) {
                        this.fj[0].d(this.dd - 12, this.de - 28);
                     }
                  }
               }

               if (((u)var3).g != null && (var2 >= this.ce || this.aj == 0 || this.aj == 3 || this.aj == 1 && this.e(((y)var3).ai))) {
                  this.a((u)var3, ((u)var3).h);
                  if (this.dd >= 0 && var1 < 50) {
                     this.dl[var1] = this.hA.b(((u)var3).g) / 2;
                     this.dk[var1] = this.hA.a;
                     this.di[var1] = this.dd;
                     this.dj[var1] = this.de;
                     this.dm[var1] = ((u)var3).l;
                     this.dn[var1] = ((u)var3).D;
                     this.xD[var1] = ((u)var3).H;
                     this.dp[var1++] = ((u)var3).g;
                     if (this.hg == 0 && ((u)var3).D > 0 && ((u)var3).D <= 3) {
                        this.dk[var1] += 10;
                        this.dj[var1] += 5;
                     }

                     if (this.hg == 0 && ((u)var3).D == 4) {
                        this.dl[var1] = 60;
                     }

                     if (this.hg == 0 && ((u)var3).D == 5) {
                        this.dk[var1] += 5;
                     }
                  }
               }

               if (((u)var3).E > R) {
                  try {
                     this.a((u)var3, ((u)var3).h + 15);
                     if (this.dd >= 0) {
                        if ((var12 = ((u)var3).F * 30 / ((u)var3).G) > 30) {
                           var12 = 30;
                        }

                        uwotm8.p.b(5, this.de - 3, this.dd - 15, 65280, var12);
                        uwotm8.p.b(5, this.de - 3, this.dd - 15 + var12, 16711680, 30 - var12);
                     }
                  } catch (Exception var9) {
                     ;
                  }
               }

               for(var12 = 0; var12 < 4; ++var12) {
                  if (((u)var3).o[var12] > R) {
                     this.a((u)var3, ((u)var3).h / 2);
                     if (this.dd >= 0) {
                        if (var12 == 1) {
                           this.de -= 20;
                        }

                        if (var12 == 2) {
                           this.dd -= 15;
                           this.de -= 10;
                        }

                        if (var12 == 3) {
                           this.dd += 15;
                           this.de -= 10;
                        }

                        this.du[((u)var3).n[var12]].d(this.dd - 12, this.de - 12);
                        this.af.a(0, String.valueOf(((u)var3).m[var12]), this.de + 4, this.dd);
                        this.af.a(16777215, String.valueOf(((u)var3).m[var12]), this.de + 3, this.dd - 1);
                     }
                  }
               }
            }
         }

         for(var2 = 0; var2 < var1; ++var2) {
            int var11 = this.di[var2];
            var12 = this.dj[var2];
            int var13 = this.dl[var2];
            int var6 = this.dk[var2];
            boolean var7 = true;

            while(var7) {
               var7 = false;

               for(int var8 = 0; var8 < var2; ++var8) {
                  if (var12 + 2 > this.dj[var8] - this.dk[var8] && var12 - var6 < this.dj[var8] + 2 && var11 - var13 < this.di[var8] + this.dl[var8] && var11 + var13 > this.di[var8] - this.dl[var8] && this.dj[var8] - this.dk[var8] < var12) {
                     var12 = this.dj[var8] - this.dk[var8];
                     var7 = true;
                  }
               }
            }

            this.dd = this.di[var2];
            this.de = this.dj[var2] = var12;
            String var14 = this.dp[var2];
            if (this.hg == 0) {
               var11 = 16776960;
               if (this.dm[var2] < 6) {
                  var11 = this.df[this.dm[var2]];
               }

               if (this.dm[var2] == 6) {
                  var11 = this.hu % 20 >= 10 ? 16776960 : 16711680;
               }

               if (this.dm[var2] == 7) {
                  var11 = this.hu % 20 >= 10 ? '\uffff' : 255;
               }

               if (this.dm[var2] == 8) {
                  var11 = this.hu % 20 >= 10 ? 8454016 : 'ë';
               }

               if (this.dm[var2] == 9) {
                  if ((var12 = 150 - this.xD[var2]) < 50) {
                     var11 = 16711680 + var12 * 1280;
                  } else if (var12 < 100) {
                     var11 = 16776960 - 327680 * (var12 - 50);
                  } else if (var12 < 150) {
                     var11 = '\uff00' + 5 * (var12 - 100);
                  }
               }

               if (this.dm[var2] == 10) {
                  if ((var12 = 150 - this.xD[var2]) < 50) {
                     var11 = 16711680 + 5 * var12;
                  } else if (var12 < 100) {
                     var11 = 16711935 - 327680 * (var12 - 50);
                  } else if (var12 < 150) {
                     var11 = 255 + 327680 * (var12 - 100) - 5 * (var12 - 100);
                  }
               }

               if (this.dm[var2] == 11) {
                  if ((var12 = 150 - this.xD[var2]) < 50) {
                     var11 = 16777215 - var12 * 327685;
                  } else if (var12 < 100) {
                     var11 = '\uff00' + 327685 * (var12 - 50);
                  } else if (var12 < 150) {
                     var11 = 16777215 - 327680 * (var12 - 100);
                  }
               }

               if (this.dn[var2] == 0) {
                  this.hA.a(0, var14, this.de + 1, this.dd);
                  this.hA.a(var11, var14, this.de, this.dd);
               }

               if (this.dn[var2] == 1) {
                  this.hA.a(0, var14, this.dd, this.hu, this.de + 1);
                  this.hA.a(var11, var14, this.dd, this.hu, this.de);
               }

               if (this.dn[var2] == 2) {
                  this.hA.b(this.dd, var14, this.hu, this.de + 1, 0);
                  this.hA.b(this.dd, var14, this.hu, this.de, var11);
               }

               if (this.dn[var2] == 3) {
                  this.hA.a(150 - this.xD[var2], var14, this.hu, this.de + 1, this.dd, 0);
                  this.hA.a(150 - this.xD[var2], var14, this.hu, this.de, this.dd, var11);
               }

               if (this.dn[var2] == 4) {
                  var12 = this.hA.b(var14);
                  var13 = (150 - this.xD[var2]) * (var12 + 100) / 150;
                  uwotm8.p.b(334, this.dd - 50, this.dd + 50, 0);
                  this.hA.b(0, var14, this.de + 1, this.dd + 50 - var13);
                  this.hA.b(var11, var14, this.de, this.dd + 50 - var13);
                  uwotm8.p.e();
               }

               if (this.dn[var2] == 5) {
                  var12 = 150 - this.xD[var2];
                  var13 = 0;
                  if (var12 < 25) {
                     var13 = var12 - 25;
                  } else if (var12 > 125) {
                     var13 = var12 - 125;
                  }

                  uwotm8.p.b(this.de + 5, 0, 512, this.de - this.hA.a - 1);
                  this.hA.a(0, var14, this.de + 1 + var13, this.dd);
                  this.hA.a(var11, var14, this.de + var13, this.dd);
                  uwotm8.p.e();
               }
            } else {
               this.hA.a(0, var14, this.de + 1, this.dd);
               this.hA.a(16776960, var14, this.de, this.dd);
            }
         }

      } catch (Exception var10) {
         ;
      }
   }

   private void a(long var1) {
      if (var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.ck; ++var3) {
               if (this.cV[var3] == var1) {
                  --this.ck;
                  P = true;

                  for(var3 = var3; var3 < this.ck; ++var3) {
                     this.eT[var3] = this.eT[var3 + 1];
                     this.bm[var3] = this.bm[var3 + 1];
                     this.cV[var3] = this.cV[var3 + 1];
                  }

                  this.gy.writeOpCode(215);
                  this.gy.a(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
        	 uwotm8.al.b("18622, false, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private boolean w() {
      return this.W != -1;
   }

   private void x() {
      if (a == com.runescape.a.a) {
         ge.a();
      }

      uwotm8.r.t = gr;
      if (this.w()) {
         f = true;
      }

      t.a(this);
      if (this.bY) {
         this.e(a == com.runescape.a.a ? 516 : 0, a == com.runescape.a.a ? 168 : 0);
      }

      if (a == com.runescape.a.a) {
         ge.a(168, super.ao, 516);
      }

      gg.a();
      uwotm8.r.t = gs;
   }

   private void y() {
      int var1;
      int var2;
      for(var1 = -1; var1 < this.ce; ++var1) {
         if (var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.cf[var1];
         }

         y var3;
         if ((var3 = this.cd[var2]) != null && var3.H > 0) {
            var3.H = var3.H - 1;
            if (var3.H == 0) {
               var3.g = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bt; ++var1) {
         var2 = this.bu[var1];
         Npc var4;
         if ((var4 = this.bs[var2]) != null && var4.H > 0) {
            var4.H = var4.H - 1;
            if (var4.H == 0) {
               var4.g = null;
            }
         }
      }

   }

   private void e(int var1, int var2) {
      int var3 = this.cP - (var1 - 4);
      int var4 = -var2 + 4 + this.cQ;
      int var5 = this.cR;
      int var6 = this.cS + 1;
      ab = true;
      K = true;
      P = true;
      uwotm8.p.b(var6, var4, var3, 6116423, var5);
      uwotm8.p.b(16, var4 + 1, var3 + 1, 0, var5 - 2);
      uwotm8.p.c(var3 + 1, var5 - 2, var6 - 19, 0, var4 + 18);
      this.hA.b(6116423, "Choose Option", var4 + 14, var3 + 3);
      var1 = super.au - var1;
      var2 = -var2 + super.av;

      for(var6 = 0; var6 < this.N; ++var6) {
         int var7 = var4 + 31 + (this.N - 1 - var6) * 15;
         int var8 = 16777215;
         if (var1 > var3 && var1 < var3 + var5 && var2 > var7 - 13 && var2 < var7 + 3) {
            uwotm8.p.b(15, var7 - 11, var3 + 3, 7301469, this.cR - 6);
            var8 = 16776960;
         }

         this.hF.a(b(this.X[var6]), var3 + 3, var7, var8, 0);
      }

   }

   private static String b(String var0) {
      String var1 = var0;

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         if (var0.charAt(var2) == '@' && var2 + 4 < var0.length() && var0.charAt(var2 + 4) == '@') {
            String var3;
            String var4;
            if (!(var4 = uwotm8.l.b(var3 = var0.substring(var2 + 1, var2 + 4))).equals("")) {
               var1 = var1.replaceAll(var0.substring(var2, var2 + 5), "<col=" + var4 + ">");
            } else if (var3.equals("str")) {
               var1 = var1.replaceAll(var0.substring(var2, var2 + 5), "<str>");
            }
         }
      }

      return var1;
   }

   private void b(long var1) {
      if (var1 != 0L) {
         try {
            if (this.ck >= 200) {
               this.a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", true);
            } else {
               String var3 = uwotm8.StringUtils.c(uwotm8.StringUtils.a(var1));

               int var4;
               for(var4 = 0; var4 < this.ck; ++var4) {
                  if (this.cV[var4] == var1) {
                     this.a(var3 + " is already on your friend list", 0, "", true);
                     return;
                  }
               }

               for(var4 = 0; var4 < this.bj; ++var4) {
                  if (this.cx[var4] == var1) {
                     this.a("Please remove " + var3 + " from your ignore list first", 0, "", true);
                     return;
                  }
               }

               if (!var3.equals(L.ai)) {
                  this.eT[this.ck] = var3;
                  this.cV[this.ck] = var1;
                  this.bm[this.ck] = 0;
                  ++this.ck;
                  P = true;
                  this.gy.writeOpCode(188);
                  this.gy.a(var1);
               }
            }
         } catch (RuntimeException var5) {
        	 uwotm8.al.b("15283, 68, " + var1 + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private int b(int var1, int var2, int var3) {
      int var4 = var3 >> 7;
      int var5 = var2 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         if ((var1 = var1) < 3 && (this.ho[1][var4][var5] & 2) == 2) {
            ++var1;
         }

         var3 &= 127;
         var2 &= 127;
         int var6 = this.gH[var1][var4][var5] * (128 - var3) + this.gH[var1][var4 + 1][var5] * var3 >> 7;
         var1 = this.gH[var1][var4][var5 + 1] * (128 - var3) + this.gH[var1][var4 + 1][var5 + 1] * var3 >> 7;
         return var6 * (128 - var2) + var1 * var2 >> 7;
      } else {
         return 0;
      }
   }

   private static String j(int var0) {
      if (var0 < 100000) {
         return String.valueOf(var0);
      } else {
         return var0 < 10000000 ? var0 / 1000 + "K" : var0 / 1000000 + "M";
      }
   }

   private void z() {
      try {
         if (this.gj != null) {
            this.gj.a();
         }
      } catch (Exception var2) {
         ;
      }

      uwotm8.Settings.a();
      uwotm8.aH_1.b();
      this.S();
      this.h(0, 0);
      this.gj = null;
      Q = false;
      this.bq = 0;
      this.hv = "";
      this.hw = "";
      this.fr = "";
      this.bj = 0;
      this.cl = 0;
      this.aY = 0;
      this.aZ = 1;
      u();
      this.cO.b();

      for(int var1 = 0; var1 < 4; ++var1) {
         this.gU[var1].a();
      }

      System.gc();
      this.B();
      this.cY = -1;
      this.gO = 0;
      this.hp = 0;
      if (O && !aW) {
         this.gQ = 256;
         this.gP = true;
         this.E.a(2, this.gO);
      }

      this.a(com.runescape.a.a);
   }

   private void A() {
      this.ee = true;

      for(int var1 = 0; var1 < 7; ++var1) {
         this.eD[var1] = -1;

         for(int var2 = 0; var2 < uwotm8.C_1.a; ++var2) {
            if (!uwotm8.C_1.b[var2].d && uwotm8.C_1.b[var2].c == var1 + (this.eq ? 0 : 7)) {
               this.eD[var1] = var2;
               break;
            }
         }
      }

   }

   private void a(int var1, I_1 var2) {
      int var3;
      while(var2.c + 21 < var1 << 3 && (var3 = var2.i(14)) != 16383) {
         boolean var4 = false;
         if (this.bs[var3] == null) {
            this.bs[var3] = new Npc();
            var4 = true;
         }

         Npc var5 = this.bs[var3];
         this.bu[this.bt++] = var3;
         var5.I = R;
         int var6;
         if ((var6 = var2.i(5)) > 15) {
            var6 -= 32;
         }

         int var7;
         if ((var7 = var2.i(5)) > 15) {
            var7 -= 32;
         }

         int var8 = var2.i(1);
         var5.ad = uwotm8.ActorDefinition.a(var2.i(14));
         int var9;
         if ((var9 = var2.i(2)) != -1 && var4) {
            int[] var10 = new int[]{1024, 1536, 0, 512};
            var5.X = var5.i = var10[var9];
         }

         if (var2.i(1) == 1) {
            this.ch[this.cg++] = var3;
         }

         var5.L = var5.ad.i;
         var5.e = var5.ad.m;
         var5.Z = var5.ad.h;
         var5.aa = var5.ad.d;
         var5.ab = var5.ad.o;
         var5.ac = var5.ad.c;
         var5.j = var5.ad.k;
         var5.a(L.a[0] + var7, L.b[0] + var6, var8 == 1);
      }

      var2.o();
   }

   public final void d() {
      if (!this.cy) {
         ++R;
         if (!Q) {
            label212: {
               if (super.at == 1 || super.aw == 1) {
                  ++this.gG;
               }

               this.aU = "";
               int var2 = c / 2;
               int var3 = d / 2;
               if (this.b(c - 52, 10, 42, 42)) {
                  this.aU = this.bq == 0 ? "Settings" : "Main Screen";
               }

               if (this.b(c - 104, 10, 42, 42)) {
                  this.aU = (O ? "Mute" : "Un-Mute") + " Title Music";
               }

               int var4;
               if (super.aw == 1) {
                  if (this.c(c - 52, 10, 42, 42)) {
                     this.bq = this.bq != 1 ? 1 : 0;
                     break label212;
                  }

                  if (this.c(c - 104, 10, 42, 42)) {
                     if (!aW) {
                        if (O = !O) {
                           this.gQ = 256;
                           this.gO = 0;
                           this.gP = true;
                           this.E.a(2, this.gO);
                        } else {
                           this.B();
                        }

                        uwotm8.Settings.a();
                     }
                     break label212;
                  }

                  if (this.bq == 0) {
                     var4 = var2 - 145;
                     var2 = var3 - 135;
                     if (this.c(var4 + 35, var2 + 71, 218, 27)) {
                        this.gJ = 0;
                     } else if (this.c(var4 + 35, var2 + 117, 218, 27)) {
                        this.gJ = 1;
                     } else if (this.c(var4 + 35, var2 + 147, 106, 13)) {
                        U = !U;
                        uwotm8.Settings.a();
                     } else if (this.c(var4 + 55, var2 + 174, 179, 25)) {
                        if (Q) {
                           break label212;
                        }

                        if (uwotm8.StringUtils.e(S) && uwotm8.StringUtils.f(T)) {
                           this.ek = 0;
                           this.a(S, T, false);
                           if (!uwotm8.Settings.a.equals(S) || !uwotm8.Settings.b.equals(T)) {
                        	   uwotm8.Settings.a();
                           }

                           this.B();
                        } else {
                           this.hw = "";
                           this.hv = "Invalid username or password.";
                        }
                     }
                  } else if (this.bq == 1) {
                     var4 = var2 - 145;
                     Rectangle var5;
                     var3 = (var5 = new Rectangle(var2 - 138, 88, 276, 150)).y + 30;
                     if (!uwotm8.aF.b(uwotm8.aG_1.a) && this.c((int)var5.getCenterX() - 132, var3, 128, 96)) {
                        uwotm8.aF.a(uwotm8.aG_1.a);
                        t = uwotm8.aF.c();
                        uwotm8.Settings.a();
                     } else if (!uwotm8.aF.b(uwotm8.aG_1.b) && this.c((int)var5.getCenterX() + 4, var3, 128, 96)) {
                        uwotm8.aF.a(uwotm8.aG_1.b);
                        t = uwotm8.aF.c();
                        uwotm8.Settings.a();
                     } else if (this.c(var4 + 85, 244, 106, 13)) {
                        if (b == 1) {
                           b = 2;
                        } else if (b == 2) {
                           b = 1;
                        }

                        a(uwotm8.Settings.c, c, d);
                     }
                  }
               }

               if (this.bq == 0 && (var4 = this.d(-796)) != -1) {
                  boolean var6 = uwotm8.StringUtils.a((char)var4, this.gJ == 1);
                  if (this.gJ == 0) {
                     if (var4 == 8 && S.length() > 0) {
                        S = S.substring(0, S.length() - 1);
                     }

                     if (var4 == 9 || var4 == 10 || var4 == 13) {
                        this.gJ = 1;
                     }

                     if (var6) {
                        S = S + (char)var4;
                     }

                     if (S.length() > 12) {
                        S = S.substring(0, 12);
                     }
                  } else if (this.gJ == 1) {
                     if (var4 == 8 && T.length() > 0) {
                        T = T.substring(0, T.length() - 1);
                     }

                     if (var4 == 9 || var4 == 10 || var4 == 13) {
                        this.gJ = 0;
                     }

                     if (var6) {
                        T = T + (char)var4;
                     }

                     if (T.length() > 20) {
                        T = T.substring(0, 20);
                     }
                  }
               }
            }
         } else {
            this.D();
         }

         this.C();
      }
   }

   private void b(boolean var1) {
      if (L.V >> 7 == this.hq && L.W >> 7 == this.hr) {
         this.hq = 0;
      }

      int var2 = this.ce;
      if (var1) {
         var2 = 1;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         y var4;
         int var5;
         if (var1) {
            var4 = L;
            var5 = 33538048;
         } else {
            var4 = this.cd[this.cf[var3]];
            var5 = this.cf[var3] << 14;
         }

         if (var4 != null && var4.aq) {
            var4.af = this.ce > 200 && !var1 && var4.p == var4.j;
            int var6 = var4.V >> 7;
            int var7 = var4.W >> 7;
            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
               if (var4.au != null && R >= var4.an && R < var4.ao) {
                  var4.af = false;
                  var4.ap = this.b(this.cu, var4.W, var4.V);
                  this.cO.a(this.cu, var4.W, var4, var4.X, var4.az, var4.V, var4.ap, var4.aw, var4.ay, var5, var4.ax);
               } else {
                  if ((var4.V & 127) == 64 && (var4.W & 127) == 64) {
                     if (this.cA[var6][var7] == this.hu) {
                        continue;
                     }

                     this.cA[var6][var7] = this.hu;
                  }

                  var4.ap = this.b(this.cu, var4.W, var4.V);
                  this.cO.a(this.cu, var4.X, var4.ap, var5, var4.W, 60, var4.V, var4, var4.M);
               }
            }
         }
      }

   }

   private boolean a(m var1) {
      int var5 = var1.d;
      if (this.cm == 2) {
         if (var5 == 201) {
            ab = true;
            this.ac = 0;
            this.hn = true;
            this.gF = "";
            this.eC = 1;
            this.fD = "Enter name of friend to add to list";
         }

         if (var5 == 202) {
            ab = true;
            this.ac = 0;
            this.hn = true;
            this.gF = "";
            this.eC = 2;
            this.fD = "Enter name of friend to delete from list";
         }
      }

      if (var5 == 205) {
         this.dN = 250;
         return true;
      } else {
         if (var5 == 501) {
            ab = true;
            this.ac = 0;
            this.hn = true;
            this.gF = "";
            this.eC = 4;
            this.fD = "Enter name of player to add to list";
         }

         if (var5 == 502) {
            ab = true;
            this.ac = 0;
            this.hn = true;
            this.gF = "";
            this.eC = 5;
            this.fD = "Enter name of player to delete from list";
         }

         if (var5 == 550) {
            ab = true;
            this.ac = 0;
            this.hn = true;
            this.gF = "";
            this.eC = 6;
            this.fD = "Enter the name of the chat you wish to join";
         }

         int var2;
         int var3;
         int var4;
         if (var5 >= 300 && var5 <= 313) {
            var2 = (var5 - 300) / 2;
            var3 = var5 & 1;
            if ((var4 = this.eD[var2]) != -1) {
               while(true) {
                  if (var3 == 0) {
                     --var4;
                     if (var4 < 0) {
                        var4 = uwotm8.C_1.a - 1;
                     }
                  }

                  if (var3 == 1) {
                     ++var4;
                     if (var4 >= uwotm8.C_1.a) {
                        var4 = 0;
                     }
                  }

                  if (!uwotm8.C_1.b[var4].d && uwotm8.C_1.b[var4].c == var2 + (this.eq ? 0 : 7)) {
                     this.eD[var2] = var4;
                     this.ee = true;
                     break;
                  }
               }
            }
         }

         if (var5 >= 314 && var5 <= 323) {
            var2 = (var5 - 314) / 2;
            var3 = var5 & 1;
            var4 = this.dw[var2];
            if (var3 == 0) {
               --var4;
               if (var4 < 0) {
                  var4 = B[var2].length - 1;
               }
            }

            if (var3 == 1) {
               ++var4;
               if (var4 >= B[var2].length) {
                  var4 = 0;
               }
            }

            this.dw[var2] = var4;
            this.ee = true;
         }

         if (var5 == 324 && !this.eq) {
            this.eq = true;
            this.A();
         }

         if (var5 == 325 && this.eq) {
            this.eq = false;
            this.A();
         }

         if (var5 != 326) {
            if (var5 == 620) {
               this.ga = !this.ga;
            }

            if (var5 >= 601 && var5 <= 613) {
               this.ac();
               if (this.bW.length() > 0) {
                  this.gy.writeOpCode(218);
                  this.gy.a(uwotm8.StringUtils.a(this.bW));
                  this.gy.b(var5 - 601);
                  this.gy.b(this.ga ? 1 : 0);
               }

               this.bW = "";
               this.ga = false;
            }

            return var5 >= 10000 && var5 <= 10022;
         } else {
            this.gy.writeOpCode(101);
            this.gy.b(this.eq ? 0 : 1);

            for(var2 = 0; var2 < 7; ++var2) {
               this.gy.b(this.eD[var2]);
            }

            for(var2 = 0; var2 < 5; ++var2) {
               this.gy.b(this.dw[var2]);
            }

            return true;
         }
      }
   }

   private void a(I_1 var1) {
      for(int var2 = 0; var2 < this.cg; ++var2) {
         int var3 = this.ch[var2];
         y var4 = this.cd[var3];
         int var5;
         if (((var5 = var1.e()) & 64) != 0) {
            var5 += var1.e() << 8;
         }

         y var7 = var4;
         I_1 var6 = var1;
         Client var18 = this;
         if ((var5 & 1024) != 0) {
            var4.O = var1.u();
            var4.Q = var1.u();
            var4.P = var1.u();
            var4.R = var1.u();
            var4.S = var1.y() + R;
            var4.T = var1.x() + R;
            var4.U = var1.u();
            var4.b();
         }

         int var8;
         if ((var5 & 256) != 0) {
            var4.s = var1.w();
            var8 = var1.j();
            var4.w = var8 >> 16;
            var4.v = R + (var8 & '\uffff');
            var4.t = 0;
            var4.u = 0;
            if (var4.v > R) {
               var4.t = -1;
            }

            if (var4.s == 65535) {
               var4.s = -1;
            }
         }

         int var9;
         int var10;
         if ((var5 & 8) != 0) {
            if ((var8 = var1.w()) == 65535) {
               var8 = -1;
            }

            var9 = var1.t();
            if (var8 == var4.y && var8 != -1) {
               if ((var10 = uwotm8.Animation.a[var8].n) == 1) {
                  var4.z = 0;
                  var4.A = 0;
                  var4.B = var9;
                  var4.C = 0;
               }

               if (var10 == 2) {
                  var4.C = 0;
               }
            } else if (var8 == -1 || var4.y == -1 || uwotm8.Animation.a[var8].h >= uwotm8.Animation.a[var4.y].h) {
               var4.y = var8;
               var4.z = 0;
               var4.A = 0;
               var4.B = var9;
               var4.C = 0;
               var4.N = var4.x;
            }
         }

         if ((var5 & 4) != 0) {
            var4.g = var1.l();
            if (var4.g.charAt(0) == '~') {
               var4.g = var4.g.substring(1);
               this.a(var4.g, 2, var4.ai);
            } else if (var4 == L) {
               this.a(var4.g, 2, var4.ai);
            }

            var4.l = 0;
            var4.D = 0;
            var4.H = 150;
         }

         if ((var5 & 128) != 0) {
            var8 = var1.w();
            var9 = var1.e();
            var10 = var1.t();
            int var11 = var1.b;
            if (var4.ai != null && var4.aq) {
               long var15 = uwotm8.StringUtils.a(var4.ai);
               boolean var12 = false;
               int var13;
               if (var9 <= 1) {
                  for(var13 = 0; var13 < var18.bj; ++var13) {
                     if (var18.cx[var13] == var15) {
                        var12 = true;
                        break;
                     }
                  }
               }

               if (!var12 && var18.hj == 0) {
                  try {
                     var18.br.b = 0;
                     byte[] var14 = var18.br.a;
                     var12 = false;
                     I_1 var22 = var6;

                     for(var13 = var10 + 0 - 1; var13 >= 0; --var13) {
                        var14[var13] = var22.a[var22.b++];
                     }

                     var18.br.b = 0;
                     String var23 = uwotm8.av.a(var10, var18.br);
                     var7.g = var23;
                     var7.l = var8 >> 8;
                     var7.ad = var9;
                     var7.D = var8 & 255;
                     var7.H = 150;
                     var8 = var9 > 0 ? 1 : 2;
                     if (var7.aB) {
                        var18.a(var23, var8, "@irn@" + var7.ai, var9);
                     } else {
                        var18.a(var23, var8, var7.ai, var9);
                     }
                  } catch (Exception var17) {
                	  uwotm8.al.b("cde2");
                  }
               }
            }

            var1.b = var11 + var10;
         }

         if ((var5 & 1) != 0) {
            var4.c = var1.w();
            if (var4.c == 65535) {
               var4.c = -1;
            }
         }

         if ((var5 & 16) != 0) {
            byte[] var20 = new byte[var8 = var1.t()];
            I_1 var21 = new I_1(var20);
            var1.a(var8, 0, var20);
            var18.ci[var3] = var21;
            var4.a(var21);
         }

         if ((var5 & 2) != 0) {
            var4.J = var1.y();
            var4.K = var1.w();
         }

         if ((var5 & 32) != 0) {
            var8 = var1.e();
            var9 = var1.s();
            var4.a(var9, var8, R);
            var4.E = R + 300;
            var4.F = var1.t();
            var4.G = var1.e();
         }

         if ((var5 & 512) != 0) {
            var8 = var1.e();
            var9 = var1.u();
            var4.a(var9, var8, R);
            var4.E = R + 300;
            var4.F = var1.e();
            var4.G = var1.t();
         }
      }

   }

   private void b(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      int var9;
      if ((var2 = this.cO.i(var5, var3, var1)) != 0) {
         var6 = (var4 = this.cO.c(var5, var3, var1, var2)) >> 6 & 3;
         var4 &= 31;
         var7 = 16777215;
         if (var2 > 0) {
            var7 = 15597568;
         }

         int[] var8 = this.hs.a;
         var9 = 24624 + (var3 << 2) + (103 - var1 << 9 << 2);
         j var10;
         if ((var10 = uwotm8.j.a(var2 >> 14 & 32767)) != null && var10.j != -1) {
            k var11;
            if ((var11 = this.ez[var10.j]) != null) {
               var4 = ((var10.d << 2) - var11.c) / 2;
               var6 = ((var10.l << 2) - var11.d) / 2;
               var11.a(48 + (var3 << 2) + var4, 48 + (104 - var1 - var10.l << 2) + var6);
            }
         } else {
            if (var4 == 0 || var4 == 2) {
               if (var6 == 0) {
                  var8[var9] = var7;
                  var8[var9 + 512] = var7;
                  var8[var9 + 1024] = var7;
                  var8[var9 + 1536] = var7;
               } else if (var6 == 1) {
                  var8[var9] = var7;
                  var8[var9 + 1] = var7;
                  var8[var9 + 2] = var7;
                  var8[var9 + 3] = var7;
               } else if (var6 == 2) {
                  var8[var9 + 3] = var7;
                  var8[var9 + 3 + 512] = var7;
                  var8[var9 + 3 + 1024] = var7;
                  var8[var9 + 3 + 1536] = var7;
               } else if (var6 == 3) {
                  var8[var9 + 1536] = var7;
                  var8[var9 + 1536 + 1] = var7;
                  var8[var9 + 1536 + 2] = var7;
                  var8[var9 + 1536 + 3] = var7;
               }
            }

            if (var4 == 3) {
               if (var6 == 0) {
                  var8[var9] = var7;
               } else if (var6 == 1) {
                  var8[var9 + 3] = var7;
               } else if (var6 == 2) {
                  var8[var9 + 3 + 1536] = var7;
               } else if (var6 == 3) {
                  var8[var9 + 1536] = var7;
               }
            }

            if (var4 == 2) {
               if (var6 == 3) {
                  var8[var9] = var7;
                  var8[var9 + 512] = var7;
                  var8[var9 + 1024] = var7;
                  var8[var9 + 1536] = var7;
               } else if (var6 == 0) {
                  var8[var9] = var7;
                  var8[var9 + 1] = var7;
                  var8[var9 + 2] = var7;
                  var8[var9 + 3] = var7;
               } else if (var6 == 1) {
                  var8[var9 + 3] = var7;
                  var8[var9 + 3 + 512] = var7;
                  var8[var9 + 3 + 1024] = var7;
                  var8[var9 + 3 + 1536] = var7;
               } else if (var6 == 2) {
                  var8[var9 + 1536] = var7;
                  var8[var9 + 1536 + 1] = var7;
                  var8[var9 + 1536 + 2] = var7;
                  var8[var9 + 1536 + 3] = var7;
               }
            }
         }
      }

      if ((var2 = this.cO.k(var5, var3, var1)) != 0) {
         var6 = (var4 = this.cO.c(var5, var3, var1, var2)) >> 6 & 3;
         var4 &= 31;
         j var15;
         int var17;
         if ((var15 = uwotm8.j.a(var2 >> 14 & 32767)) != null && var15.j != -1) {
            k var18;
            if ((var18 = this.ez[var15.j]) != null) {
               var2 = ((var15.d << 2) - var18.c) / 2;
               var17 = ((var15.l << 2) - var18.d) / 2;
               var18.a(48 + (var3 << 2) + var2, 48 + (104 - var1 - var15.l << 2) + var17);
            }
         } else if (var4 == 9) {
            var9 = 15658734;
            if (var2 > 0) {
               var9 = 15597568;
            }

            int[] var12 = this.hs.a;
            var17 = 24624 + (var3 << 2) + (103 - var1 << 9 << 2);
            if (var6 != 0 && var6 != 2) {
               var12[var17] = var9;
               var12[var17 + 512 + 1] = var9;
               var12[var17 + 1024 + 2] = var9;
               var12[var17 + 1536 + 3] = var9;
            } else {
               var12[var17 + 1536] = var9;
               var12[var17 + 1024 + 1] = var9;
               var12[var17 + 512 + 2] = var9;
               var12[var17 + 3] = var9;
            }
         }
      }

      k var13;
      j var14;
      if ((var2 = this.cO.l(var5, var3, var1)) != 0 && (var14 = uwotm8.j.a(var2 >> 14 & 32767)) != null && var14.j != -1 && (var13 = this.ez[var14.j]) != null) {
         var7 = ((var14.d << 2) - var13.c) / 2;
         int var16 = ((var14.l << 2) - var13.d) / 2;
         var13.a(48 + (var3 << 2) + var7, 48 + (104 - var1 - var14.l << 2) + var16);
      }

   }

   public static void main(String[] var0) {
      try {
         cZ = 10;
         x = 0;
         uwotm8.W_1.a = false;
         uwotm8.r.a = false;
         dc = false;
         uwotm8.S_1.c = false;
         uwotm8.j.g = false;
         db = true;
         uwotm8.al.a = 32;
         uwotm8.al.a(InetAddress.getLocalHost());
         if (var0.length == 1 && var0[0].equals("mute")) {
            aW = true;
         }

         Client var10000 = k = new Client();
         int var2 = d;
         int var1 = c;
         Client var4 = var10000;
         var10000.aA = false;
         var4.am = var1;
         var4.an = var2;
         var4.aq = new com.runescape.c(var4, var4.am, var4.an, a == com.runescape.a.b, a == com.runescape.a.c);
         var4.aq.setFocusTraversalKeysEnabled(false);
         var4.ao = var4.g().getGraphics();
         var4.ap = new q(var4.am, var4.an);
         var4.a(var4, 1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static Client e() {
      return k;
   }

   public AppletContext getAppletContext() {
      Applet var10000 = uwotm8.al.e;
      return super.getAppletContext();
   }

   private void k(int var1) {
      if (!aW) {
         this.gQ = var1;
         if (this.gS == null) {
            return;
         }

         this.gS.a(0, this.gQ);
      }

   }

   private void B() {
      if (!aW && this.gS != null) {
         this.gS.b();
      }

   }

   private void c(int var1, int var2, int var3) {
      if (!aW && this.bC && this.eA < 50) {
         this.gD[this.eA] = var1;
         this.gZ[this.eA] = var2;
         this.hh[this.eA] = var3 + uwotm8.aq.a[var1];
         ++this.eA;
      }

   }

   private void C() {
      ae var1;
      while((var1 = this.E.d()) != null) {
         if (var1.a == 0) {
            uwotm8.D_1.a(var1.b, var1.c);
            P = true;
            if (this.ai != -1) {
               ab = true;
            }
         }

         if (var1.a == 1 && var1.b != null) {
            uwotm8.e.a(var1.b, var1.c);
         }

         if (var1.a == 2 && var1.c == this.gO && var1.b != null) {
            byte[] var4 = var1.b;
            boolean var3 = this.gP;
            if (!aW && this.gS != null) {
               boolean var5 = this.hp > 0;
               if (var3 && !var5) {
                  this.gS.a(var4, this.gR, this.gQ);
               } else {
                  this.gS.a(var4, false, this.gQ);
               }
            }
         }

         if (var1.a == 3 && this.dX == 1) {
            for(int var2 = 0; var2 < this.gt.length; ++var2) {
               if (this.gW[var2] == var1.c) {
                  this.gt[var2] = var1.b;
                  if (var1.b == null) {
                     this.gW[var2] = -1;
                  }
                  break;
               }

               if (this.gX[var2] == var1.c) {
                  this.hf[var2] = var1.b;
                  if (var1.b == null) {
                     this.gX[var2] = -1;
                  }
                  break;
               }
            }
         }

         if (var1.a == 93 && this.E.b(var1.c)) {
            uwotm8.S_1.a(new I_1(var1.b), this.E);
         }
      }

   }

   private static void l(int var0) {
      m[] var3 = uwotm8.m.a[var0];

      for(int var1 = 0; var1 < var3.length; ++var1) {
         m var2;
         if ((var2 = var3[var1]) != null) {
            var2.al = 0;
            var2.ak = 0;
         }
      }

   }

   private void D() {
      if (a == com.runescape.a.b) {
         if (c != this.aq.a()) {
            aD = c = this.aq.a();
            l();
         }

         if (d != this.aq.b()) {
            aE = d = this.aq.b();
            l();
         }

         if (Q && (c != uwotm8.Settings.d || d != uwotm8.Settings.e)) {
        	 uwotm8.Settings.a();
         }
      }

      if (this.fq > 1) {
         --this.fq;
      }

      if (this.dN > 0) {
         --this.dN;
      }

      int var1;
      for(var1 = 0; var1 < 5 && this.ab(); ++var1) {
         ;
      }

      if (Q) {
         if (this.dR > 0) {
            --this.dR;
         }

         if (super.az[1] == 1 || super.az[2] == 1 || super.az[3] == 1 || super.az[4] == 1) {
            this.dS = true;
         }

         if (this.dS && this.dR <= 0) {
            this.dR = 20;
            this.dS = false;
            this.gy.writeOpCode(86);
            this.gy.c(this.gu);
            this.gy.m(this.V);
         }

         if (super.ar && !this.cU) {
            this.cU = true;
            this.gy.writeOpCode(3);
            this.gy.b(1);
         }

         if (!super.ar && this.cU) {
            this.cU = false;
            this.gy.writeOpCode(3);
            this.gy.b(0);
         }

         int var2;
         int var4;
         int var6;
         int var7;
         if (this.dX == 1) {
            Client var3 = this;

            byte var10000;
            label456: {
               for(var4 = 0; var4 < var3.gt.length; ++var4) {
                  if (var3.gt[var4] == null && var3.gW[var4] != -1) {
                     var10000 = -1;
                     break label456;
                  }

                  if (var3.hf[var4] == null && var3.gX[var4] != -1) {
                     var10000 = -2;
                     break label456;
                  }
               }

               boolean var15 = true;

               for(var2 = 0; var2 < var3.gt.length; ++var2) {
                  byte[] var5;
                  if ((var5 = var3.hf[var2]) != null) {
                     var6 = (var3.gV[var2] >> 8 << 6) - var3.eg;
                     var7 = ((var3.gV[var2] & 255) << 6) - var3.eh;
                     if (var3.gb) {
                        var6 = 10;
                        var7 = 10;
                     }

                     var15 &= uwotm8.S_1.a(var6, var5, var7);
                  }
               }

               if (!var15) {
                  var10000 = -3;
               } else if (var3.eS) {
                  var10000 = -4;
               } else {
                  var3.dX = 2;
                  uwotm8.S_1.a = var3.cu;
                  var3.t();
                  var3.gy.writeOpCode(121);
                  var10000 = 0;
               }
            }

            byte var11 = var10000;
            if (var10000 != 0 && System.currentTimeMillis() - this.bk > 360000L) {
            	uwotm8.al.b(S + " glcfb " + this.gI + "," + var11 + ",false" + "," + this.z[0] + "," + this.E.b() + "," + this.cu + "," + this.eG + "," + this.eH);
               this.bk = System.currentTimeMillis();
            }
         }

         if (this.dX == 2 && this.cu != this.ds) {
            this.ds = this.cu;
            this.h(this.cu);
         }

         this.U();
         this.M_1();
         ++this.dL;
         if (this.dL > 750) {
            this.G();
         }

         this.T();
         this.N();
         this.y();
         ++this.cN;
         if (this.ct != 0) {
            this.cs += 20;
            if (this.cs >= 400) {
               this.ct = 0;
            }
         }

         if (this.he != 0) {
            ++this.hb;
            if (this.hb >= 15) {
               if (this.he == 2) {
                  P = true;
               }

               if (this.he == 3) {
                  ab = true;
               }

               this.he = 0;
            }
         }

         int var13;
         int var17;
         if (this.eX != 0) {
            ++this.dv;
            if (super.au > this.eY + 5 || super.au < this.eY - 5 || super.av > this.eZ + 5 || super.av < this.eZ - 5) {
               this.ha = true;
            }

            if (super.at == 0) {
               if (this.eX == 2) {
                  P = true;
               }

               if (this.eX == 3) {
                  ab = true;
               }

               this.eX = 0;
               if (this.ha && this.dv >= 15) {
                  this.eF = -1;
                  this.L();
                  if (v == 174 && this.eV >= 11403314 && this.eV <= 11403324 && (var2 = this.Q()) >= 0 && var2 <= 10) {
                     this.gy.writeOpCode(213);
                     this.gy.f(this.eV);
                     this.gy.f(11403273 + var2 * 3);
                     this.gy.n(this.eW);
                     this.gy.l(var2);
                  }

                  m var10;
                  if (this.eF == this.eV) {
                     if (this.eE != this.eW) {
                        var10 = uwotm8.m.a(this.eV);
                        byte var14 = 0;
                        if (this.cp == 1 && var10.d == 206) {
                           var14 = 1;
                        }

                        if (var10.w[this.eE] <= 0) {
                           var14 = 0;
                        }

                        if (var10.B) {
                           var13 = this.eW;
                           var4 = this.eE;
                           var10.w[var4] = var10.w[var13];
                           var10.x[var4] = var10.x[var13];
                           var10.w[var13] = -1;
                           var10.x[var13] = 0;
                        } else if (var14 == 1) {
                           var13 = this.eW;
                           var4 = this.eE;

                           while(var13 != var4) {
                              if (var13 > var4) {
                                 var10.b(var13, var13 - 1);
                                 --var13;
                              } else if (var13 < var4) {
                                 var10.b(var13, var13 + 1);
                                 ++var13;
                              }
                           }
                        } else {
                           var10.b(this.eW, this.eE);
                        }

                        this.gy.writeOpCode(214);
                        this.gy.f(this.eV);
                        this.gy.j(var14);
                        this.gy.n(this.eW);
                        this.gy.l(this.eE);
                     }
                  } else {
                     var10 = uwotm8.m.a(this.eV);
                     m var12;
                     if ((var12 = uwotm8.m.a(this.eF)) != null && var10 != null && var10.C && var12.C) {
                        var13 = this.eW;
                        var4 = this.eE;
                        var17 = var10.w[var13];
                        var10.w[var13] = var12.w[var4];
                        var12.w[var4] = var17;
                        var17 = var10.x[var13];
                        var10.x[var13] = var12.x[var4];
                        var12.x[var4] = var17;
                        this.gy.writeOpCode(213);
                        this.gy.f(this.eV);
                        this.gy.f(this.eF);
                        this.gy.n(this.eW);
                        this.gy.l(this.eE);
                     }
                  }
               } else if ((this.hl == 1 || this.f(this.N - 1)) && this.N > 2) {
                  this.V();
               } else if (this.N > 0) {
                  this.m(this.N - 1);
               }

               this.hb = 10;
               super.aw = 0;
            }
         }

         if (uwotm8.W_1.b != -1) {
            var1 = uwotm8.W_1.b;
            var2 = uwotm8.W_1.c;
            boolean var16 = this.a(0, 0, 0, 0, L.b[0], 0, 0, var2, L.a[0], true, var1);
            uwotm8.W_1.b = -1;
            if (var16) {
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 1;
               this.cs = 0;
            }
         }

         if (super.aw == 1 && this.bA != null) {
            this.bA = null;
            ab = true;
            super.aw = 0;
         }

         this.s();
         if (super.at == 1 || super.aw == 1) {
            ++this.gG;
         }

         if (this.hY == 0 && this.hV == 0 && this.hW == 0) {
            if (this.hZ > 0) {
               --this.hZ;
            }
         } else if (this.hZ < 0 && !this.bY) {
            ++this.hZ;
            if (this.hZ == 0 && this.hY != 0) {
               ab = true;
            }
         }

         if (this.dX == 2) {
            this.R();
         }

         if (this.dX == 2 && this.gc) {
            var2 = (this.fl << 7) + 64;
            var13 = (this.fm << 7) + 64;
            var4 = this.b(this.cu, var13, var2) - this.fn;
            if (this.bG < var2) {
               this.bG += this.fo + (var2 - this.bG) * this.fp / 1000;
               if (this.bG > var2) {
                  this.bG = var2;
               }
            }

            if (this.bG > var2) {
               this.bG -= this.fo + (this.bG - var2) * this.fp / 1000;
               if (this.bG < var2) {
                  this.bG = var2;
               }
            }

            if (this.bH < var4) {
               this.bH += this.fo + (var4 - this.bH) * this.fp / 1000;
               if (this.bH > var4) {
                  this.bH = var4;
               }
            }

            if (this.bH > var4) {
               this.bH -= this.fo + (this.bH - var4) * this.fp / 1000;
               if (this.bH < var4) {
                  this.bH = var4;
               }
            }

            if (this.bI < var13) {
               this.bI += this.fo + (var13 - this.bI) * this.fp / 1000;
               if (this.bI > var13) {
                  this.bI = var13;
               }
            }

            if (this.bI > var13) {
               this.bI -= this.fo + (this.bI - var13) * this.fp / 1000;
               if (this.bI < var13) {
                  this.bI = var13;
               }
            }

            var2 = (this.dy << 7) + 64;
            var13 = (this.dz << 7) + 64;
            var4 = this.b(this.cu, var13, var2) - this.dA;
            var2 -= this.bG;
            var17 = var4 - this.bH;
            var6 = var13 - this.bI;
            var7 = (int)Math.sqrt((double)(var2 * var2 + var6 * var6));
            var13 = (int)(Math.atan2((double)var17, (double)var7) * 325.949D) & 2047;
            var2 = (int)(Math.atan2((double)var2, (double)var6) * -325.949D) & 2047;
            if (var13 < 128) {
               var13 = 128;
            }

            if (var13 > 383) {
               var13 = 383;
            }

            if (this.bJ < var13) {
               this.bJ += this.dB + (var13 - this.bJ) * this.dC / 1000;
               if (this.bJ > var13) {
                  this.bJ = var13;
               }
            }

            if (this.bJ > var13) {
               this.bJ -= this.dB + (this.bJ - var13) * this.dC / 1000;
               if (this.bJ < var13) {
                  this.bJ = var13;
               }
            }

            if ((var13 = var2 - this.bK) > 1024) {
               var13 -= 2048;
            }

            if (var13 < -1024) {
               var13 += 2048;
            }

            if (var13 > 0) {
               this.bK += this.dB + var13 * this.dC / 1000;
               this.bK &= 2047;
            }

            if (var13 < 0) {
               this.bK -= this.dB + -var13 * this.dC / 1000;
               this.bK &= 2047;
            }

            if ((var4 = var2 - this.bK) > 1024) {
               var4 -= 2048;
            }

            if (var4 < -1024) {
               var4 += 2048;
            }

            if (var4 < 0 && var13 > 0 || var4 > 0 && var13 < 0) {
               this.bK = var2;
            }
         }

         for(var1 = 0; var1 < 5; ++var1) {
            ++this.ed[var1];
         }

         this.J();
         ++super.as;
         if (super.as > 20000) {
            this.dN = 250;
            super.as -= 2000;
            this.gy.writeOpCode(202);
         }

         ++this.dM;
         if (this.dM > 50) {
            this.gy.writeOpCode(0);
         }

         try {
            if (this.gj != null && this.gy.b > 0) {
               this.gj.a(this.gy.b, this.gy.a);
               this.gy.b = 0;
               this.dM = 0;
               return;
            }
         } catch (IOException var8) {
            this.G();
            return;
         } catch (Exception var9) {
            this.z();
         }

      }
   }

   private void E() {
      if (this.fs == null) {
         super.ap = null;
         gh = null;
         this.gf = null;
         ge = null;
         gg = null;
         this.fH = null;
         this.fv = new q(128, 265);
         uwotm8.p.f();
         this.fw = new q(128, 265);
         uwotm8.p.f();
         this.fs = new q(509, 171);
         uwotm8.p.f();
         this.ft = new q(360, 132);
         uwotm8.p.f();
         this.fu = new q(c, d);
         uwotm8.p.f();
         this.fx = new q(202, 238);
         uwotm8.p.f();
         this.fy = new q(203, 238);
         uwotm8.p.f();
         this.fz = new q(74, 94);
         uwotm8.p.f();
         this.fA = new q(75, 94);
         uwotm8.p.f();
         this.hm = true;
      }
   }

   private void F() {
      if (gh == null) {
         this.bo = false;
         super.ap = null;
         this.fs = null;
         this.ft = null;
         this.fu = null;
         this.fv = null;
         this.fw = null;
         this.fx = null;
         this.fy = null;
         this.fz = null;
         this.fA = null;
         gh = new q(519, 165);
         this.gf = new q(249, 168);
         uwotm8.p.f();
         ge = new q(249, 335);
         gg = new q(512, 334);
         uwotm8.p.f();
         this.fH = new q(249, 45);
         this.hm = true;
      }
   }

   public final void a(int var1, String var2) {
      this.eR = var1;
      this.es = var2;
      this.E();
      if (this.ev == null) {
         super.a(var1, var2);
      } else {
         this.fu.a();
         this.hA.a(16777215, "vscape is loading - please wait...", 54, 180);
         uwotm8.p.c(28, 304, 34, 9179409, 62);
         uwotm8.p.c(29, 302, 32, 0, 63);
         uwotm8.p.b(30, 64, 30, 9179409, var1 * 3);
         uwotm8.p.b(30, 64, 30 + var1 * 3, 0, 300 - var1 * 3);
         this.hA.a(16777215, var2, 85, 180);
         this.fu.a(171, super.ao, 202);
      }
   }

   private void a(int var1, int var2, int var3, int var4, m var5, int var6, boolean var7, int var8) {
      byte var9;
      if (this.dg) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      this.dg = false;
      if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 && var4 < var6 + 16) {
         var5.t -= this.gG << 2;
         if (var7) {
            P = true;
            return;
         }
      } else if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 + var2 - 16 && var4 < var6 + var2) {
         var5.t += this.gG << 2;
         if (var7) {
            P = true;
            return;
         }
      } else if (var3 >= var1 - var9 && var3 < var1 + 16 + var9 && var4 >= var6 + 16 && var4 < var6 + var2 - 16 && this.gG > 0) {
         if ((var1 = (var2 - 32) * var2 / var8) < 8) {
            var1 = 8;
         }

         var3 = var4 - var6 - 16 - var1 / 2;
         var1 = var2 - 32 - var1;
         var5.t = (short)((var8 - var2) * var3 / var1);
         if (var7) {
            P = true;
         }

         this.dg = true;
      }

   }

   private boolean d(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 32767;
      if ((var1 = this.cO.c(this.cu, var3, var2, var1)) == -1) {
         return false;
      } else {
         int var5 = var1 & 31;
         var1 = var1 >> 6 & 3;
         if (var5 != 10 && var5 != 11 && var5 != 22) {
            this.a(2, var1, 0, var5 + 1, L.b[0], 0, 0, var2, L.a[0], false, var3);
         } else {
            j var7;
            if ((var7 = uwotm8.j.a(var4)) != null) {
               int var6;
               if (var1 != 0 && var1 != 2) {
                  var5 = var7.l;
                  var6 = var7.d;
               } else {
                  var5 = var7.d;
                  var6 = var7.l;
               }

               var4 = var7.q;
               if (var1 != 0) {
                  var4 = (var4 << var1 & 15) + (var4 >> 4 - var1);
               }

               this.a(2, 0, var6, 0, L.b[0], var5, var4, var2, L.a[0], false, var3);
            }
         }

         this.cq = super.ax;
         this.cr = super.ay;
         this.ct = 2;
         this.cs = 0;
         return true;
      }
   }

   private G_1 a(int var1, String var2, String var3, int var4, int var5) {
      byte[] var6 = null;
      int var7 = 5;

      try {
         if (this.z[0] != null) {
            var6 = this.z[0].a(var1);
         }
      } catch (Exception var16) {
         ;
      }

      if (var6 != null) {
         return new G_1(var6);
      } else {
         while(var6 == null) {
            String var8 = "Unknown error";
            this.a(var5, "Requesting ".concat(String.valueOf(var2)));

            int var9;
            try {
               var9 = 0;
               DataInputStream var10 = this.f(var3 + var4);
               byte[] var11 = new byte[6];
               var10.readFully(var11, 0, 6);
               I_1 var21;
               (var21 = new I_1(var11)).b = 3;
               int var12 = var21.i() + 6;
               int var13 = 6;
               var6 = new byte[var12];
               System.arraycopy(var11, 0, var6, 0, 6);

               int var22;
               for(; var13 < var12; var9 = var22) {
                  if ((var22 = var12 - var13) > 1000) {
                     var22 = 1000;
                  }

                  if ((var22 = var10.read(var6, var13, var22)) < 0) {
                     (new StringBuilder("Length error: ")).append(var13).append("/").append(var12).toString();
                     throw new IOException("EOF");
                  }

                  if ((var22 = (var13 += var22) * 100 / var12) != var9) {
                     this.a(var5, "Loading " + var2 + " - " + var22 + "%");
                  }
               }

               var10.close();

               try {
                  if (this.z[0] != null) {
                     this.z[0].a(var6.length, var6, var1);
                  }
               } catch (Exception var15) {
                  this.z[0] = null;
               }
            } catch (IOException var17) {
               if (var8.equals("Unknown error")) {
                  var8 = "Connection error";
               }

               var6 = null;
            } catch (NullPointerException var18) {
               var8 = "Null error";
               var6 = null;
               if (!uwotm8.al.h) {
                  return null;
               }
            } catch (ArrayIndexOutOfBoundsException var19) {
               var8 = "Bounds error";
               var6 = null;
               if (!uwotm8.al.h) {
                  return null;
               }
            } catch (Exception var20) {
               var8 = "Unexpected error";
               var6 = null;
               if (!uwotm8.al.h) {
                  return null;
               }
            }

            if (var6 == null) {
               for(var9 = var7; var9 > 0; --var9) {
                  this.a(var5, var8 + " - Retrying in " + var9);

                  try {
                     Thread.sleep(1000L);
                  } catch (Exception var14) {
                     ;
                  }
               }

               if ((var7 <<= 1) > 60) {
                  var7 = 60;
               }

               this.bP = !this.bP;
            }
         }

         return new G_1(var6);
      }
   }

   private void G() {
      if (this.dN > 0) {
         this.z();
      } else {
         gg.a();
         this.hz.a(0, "Connection lost", 144, 257);
         this.hz.a(16777215, "Connection lost", 143, 256);
         this.hz.a(0, "Please wait - attempting to reestablish", 159, 257);
         this.hz.a(16777215, "Please wait - attempting to reestablish", 158, 256);
         gg.a(4, super.ao, 4);
         this.dW = 0;
         this.hq = 0;
         ai var1 = this.gj;
         Q = false;
         this.ek = 0;
         this.a(S, T, true);
         if (!Q) {
            this.z();
         }

         try {
            var1.a();
         } catch (Exception var2) {
            ;
         }
      }
   }

   private void H() {
      this.hK = 0;
      this.fL = 0;
      this.cj = 0;
      this.V = 0;
      this.gE = 0;
      this.gk = 0;
   }

   private void m(int var1) {
      if (var1 >= 0) {
         if (this.ac != 0 && this.ac != 3 && this.ac != 4 && this.ac != 5) {
            this.ac = 0;
            ab = true;
         }

         int var2 = this.fd[var1];
         int var3 = this.fe[var1];
         int var4 = this.J[var1];
         int var5 = this.ff[var1];
         if (var4 >= 2000) {
            var4 -= 2000;
         }

         if (var4 == 696) {
            this.H();
         }

         Npc var6;
         if (var4 == 582 && (var6 = this.bs[var5]) != null) {
            this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
            this.cq = super.ax;
            this.cr = super.ay;
            this.ct = 2;
            this.cs = 0;
            this.gy.writeOpCode(57);
            this.gy.m(this.hQ);
            this.gy.m(var5);
            this.gy.l(this.hO);
            this.gy.f(this.hP);
         }

         if (var4 == 234) {
            if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
            }

            this.cq = super.ax;
            this.cr = super.ay;
            this.ct = 2;
            this.cs = 0;
            this.gy.writeOpCode(236);
            this.gy.l(var3 + this.eh);
            this.gy.c(var5);
            System.out.println(this.hL.length);
            System.out.println(hL.length);
            this.gy.l(var2 + this.eg);
         }

         if (var4 == 62 && this.d(var5, var3, var2)) {
            this.gy.writeOpCode(192);
            this.gy.f(this.hP);
            this.gy.l(var5 >> 14 & 32767);
            this.gy.n(var3 + this.eh);
            this.gy.l(this.hO);
            this.gy.n(var2 + this.eg);
            this.gy.c(this.hQ);
         }

         if (var4 == 511) {
            if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
            }

            this.cq = super.ax;
            this.cr = super.ay;
            this.ct = 2;
            this.cs = 0;
            this.gy.writeOpCode(25);
            this.gy.f(this.hP);
            this.gy.m(this.hQ);
            this.gy.c(var5);
            this.gy.m(var3 + this.eh);
            this.gy.n(this.hO);
            this.gy.c(var2 + this.eg);
         }

         m var10;
         if (var4 == 74) {
            this.gy.writeOpCode(122);
            this.gy.f(var3);
            this.gy.m(var2);
            this.gy.l(var5);
            this.hb = 0;
            this.hc = var3;
            this.hd = var2;
            this.he = 2;
            if ((var10 = uwotm8.m.a(var3)) != null) {
               if (var10.l == v) {
                  this.he = 1;
               }

               if (var10.l == this.ai) {
                  this.he = 3;
               }
            }
         }

         if (var4 == 315) {
            var10 = uwotm8.m.a(var3);
            boolean var7 = true;
            if (var10.d > 0) {
               var7 = this.a(var10);
            }

            if (var7) {
               switch(var3) {
               case 2097179:
                  G = 600;
                  break;
               default:
                  this.gy.writeOpCode(185);
                  this.gy.f(var3);
               }
            }
         }

         y var11;
         if (var4 == 561 && (var11 = this.cd[var5]) != null) {
            this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
            this.cq = super.ax;
            this.cr = super.ay;
            this.ct = 2;
            this.cs = 0;
            if ((gx += var5) >= 90) {
               this.gy.writeOpCode(136);
               gx = 0;
            }

            this.gy.writeOpCode(128);
            this.gy.c(var5);
         }

         if (var4 == 20 && (var6 = this.bs[var5]) != null) {
        	 //NPC First Click
            this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
            this.cq = super.ax;
            this.cr = super.ay;
            this.ct = 2;
            this.cs = 0;
            this.gy.writeOpCode(155);
            System.out.println(var5);
            this.gy.l(var5);
         }

         if (var4 == 779 && (var11 = this.cd[var5]) != null) {
            this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
            this.cq = super.ax;
            this.cr = super.ay;
            this.ct = 2;
            this.cs = 0;
            this.gy.writeOpCode(153);
            this.gy.l(var5);
         }

         if (var4 == 519) {
            if (!this.bY) {
               uwotm8.W_1.b(super.ay - 4, super.ax - 4);
            } else {
               uwotm8.W_1.b(var3 - 4, var2 - 4);
            }
         }

         if (var4 == 1062) {
            if ((cw += this.eg) >= 113) {
               this.gy.writeOpCode(183);
               this.gy.e(15086193);
               cw = 0;
            }

            this.d(var5, var3, var2);
            this.gy.writeOpCode(228);
            this.gy.m(var5 >> 14 & 32767);
            this.gy.m(var3 + this.eh);
            this.gy.c(var2 + this.eg);
         }

         if (var4 == 679 && !this.fU) {
            this.gy.writeOpCode(40);
            this.gy.c(var3);
            this.fU = true;
         }

         if (var4 == 431) {
            this.gy.writeOpCode(129);
            this.gy.m(var2);
            this.gy.f(var3);
            this.gy.m(var5);
            this.hb = 0;
            this.hc = var3;
            this.hd = var2;
            this.he = 2;
            if ((var10 = uwotm8.m.a(var3)) != null) {
               if (var10.l == v) {
                  this.he = 1;
               }

               if (var10.l == this.ai) {
                  this.he = 3;
               }
            }
         }

         long var8;
         int var12;
         String var13;
         if ((var4 == 337 || var4 == 42 || var4 == 792 || var4 == 322) && (var12 = (var13 = this.X[var1]).indexOf("@whi@")) != -1) {
            var8 = uwotm8.StringUtils.a(var13.substring(var12 + 5).trim());
            if (var4 == 337) {
               this.b(var8);
            }

            if (var4 == 42) {
               this.c(var8);
            }

            if (var4 == 792) {
               this.a(var8);
            }

            if (var4 == 322) {
               this.d(var8);
            }
         }

         if ((var4 == 1500 || var4 == 1501 || var4 == 1502) && (var12 = (var13 = this.X[var1]).indexOf("@whi@")) != -1) {
            var8 = uwotm8.StringUtils.a(var13.substring(var12 + 5).trim());
            if (var4 == 1500) {
               this.a(var8, 0);
            }

            if (var4 == 1501) {
               this.a(var8, 1);
            }

            if (var4 == 1502) {
               this.a(var8, 2);
            }
         }

         if (var4 == 53) {
            this.gy.writeOpCode(135);
            this.gy.l(var2);
            this.gy.f(var3);
            this.gy.l(var5);
            this.hb = 0;
            this.hc = var3;
            this.hd = var2;
            this.he = 2;
            if ((var10 = uwotm8.m.a(var3)) != null) {
               if (var10.l == v) {
                  this.he = 1;
               }

               if (var10.l == this.ai) {
                  this.he = 3;
               }
            }
         }

         if (var4 == 539) {
            this.gy.writeOpCode(16);
            this.gy.m(var5);
            this.gy.n(var2);
            this.gy.f(var3);
            this.hb = 0;
            this.hc = var3;
            this.hd = var2;
            this.he = 2;
            if ((var10 = uwotm8.m.a(var3)) != null) {
               if (var10.l == v) {
                  this.he = 1;
               }

               if (var10.l == this.ai) {
                  this.he = 3;
               }
            }
         }

         if (var4 == 927) {
            var12 = (var13 = this.X[var1]).indexOf("@lre@");
            var13 = var13.substring(var12 + 5).trim();
            this.g(var13);
            System.out.println("Opening page: ".concat(String.valueOf(var13)));
         }

         String var14;
         int var18;
         if ((var4 == 484 || var4 == 6) && (var12 = (var13 = this.X[var1]).indexOf("@whi@")) != -1) {
            var14 = uwotm8.StringUtils.c(uwotm8.StringUtils.a(uwotm8.StringUtils.a(var13.substring(var12 + 5).trim())));
            boolean var9 = false;

            for(var18 = 0; var18 < this.ce; ++var18) {
               y var15;
               if ((var15 = this.cd[this.cf[var18]]) != null && var15.ai != null && var15.ai.equalsIgnoreCase(var14)) {
                  this.a(2, 0, 1, 0, L.b[0], 1, 0, var15.b[0], L.a[0], false, var15.a[0]);
                  if (var4 == 484) {
                     this.gy.writeOpCode(139);
                     this.gy.l(this.cf[var18]);
                  }

                  if (var4 == 6) {
                     if ((gx += var5) >= 90) {
                        this.gy.writeOpCode(136);
                        gx = 0;
                     }

                     this.gy.writeOpCode(128);
                     this.gy.c(this.cf[var18]);
                  }

                  var9 = true;
                  break;
               }
            }

            if (!var9) {
               this.a("Unable to find ".concat(String.valueOf(var14)), 0, "", true);
            }
         }

         if (var4 == 870) {
            this.gy.writeOpCode(53);
            this.gy.c(var2);
            this.gy.m(this.hO);
            this.gy.n(var5);
            this.gy.c(this.hP);
            this.gy.l(this.hQ);
            this.gy.f(var3);
            this.hb = 0;
            this.hc = var3;
            this.hd = var2;
            this.he = 2;
            if ((var10 = uwotm8.m.a(var3)) != null) {
               if (var10.l == v) {
                  this.he = 1;
               }

               if (var10.l == this.ai) {
                  this.he = 3;
               }
            }
         }

         if (var4 == 847) {
            this.gy.writeOpCode(87);
            this.gy.m(var5);
            this.gy.f(var3);
            this.gy.m(var2);
            this.hb = 0;
            this.hc = var3;
            this.hd = var2;
            this.he = 2;
            if ((var10 = uwotm8.m.a(var3)) != null) {
               if (var10.l == v) {
                  this.he = 1;
               }

               if (var10.l == this.ai) {
                  this.he = 3;
               }
            }
         }

         String var20;
         if (var4 == 626) {
            var10 = uwotm8.m.a(var3);
            this.fN = 1;
            fa = var10.o;
            this.fO = var3;
            this.fP = var10.ai;
            this.hN = 0;
            P = true;
            var20 = var10.ag;
            if (var10.ag.indexOf(" ") != -1) {
               var20 = var20.substring(0, var20.indexOf(" "));
            }

            var14 = var10.ag;
            if (var10.ag.indexOf(" ") != -1) {
               var14 = var14.substring(var14.indexOf(" ") + 1);
            }

            this.fQ = var20 + " " + var10.ah + " " + var14;
            if (this.fP == 16) {
               P = true;
               aa = 3;
               K = true;
            }

         } else {
            if (var4 == 78) {
               this.gy.writeOpCode(117);
               this.gy.f(var3);
               this.gy.n(var5);
               this.gy.l(var2);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var10 = uwotm8.m.a(var3)) != null) {
                  if (var10.l == v) {
                     this.he = 1;
                  }

                  if (var10.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            if (var4 == 27 && (var11 = this.cd[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               if ((dt += var5) >= 54) {
                  this.gy.writeOpCode(189);
                  this.gy.b(234);
                  dt = 0;
               }

               this.gy.writeOpCode(73);
               this.gy.l(var5);
            }

            if (var4 == 213) {
               if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
               }

               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(79);
               this.gy.l(var3 + this.eh);
               this.gy.c(var5);
               this.gy.m(var2 + this.eg);
            }

            if (var4 == 632) {
               this.gy.writeOpCode(145);
               this.gy.f(var3);
               this.gy.m(var2);
               this.gy.m(var5);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var10 = uwotm8.m.a(var3)) != null) {
                  if (var10.l == v) {
                     this.he = 1;
                  }

                  if (var10.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            m var16;
            if (var4 >= 700 && var4 <= 705) {
               var18 = 110 + (var4 - 700);
               this.gy.writeOpCode(var18);
               this.gy.f(var3);
               this.gy.n(var5);
               this.gy.l(var2);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var16 = uwotm8.m.a(var3)) != null) {
                  if (var16.l == v) {
                     this.he = 1;
                  }

                  if (var16.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            if (var4 == 1010) {
               this.V = 0;
            }

            if (var4 >= 1011 && var4 <= 1014) {
               switch(var4) {
               case 1011:
                  uwotm8.aH_1.c();
                  break;
               case 1012:
               case 1013:
               case 1014:
                  uwotm8.aH_1.a(var4 - 1012);
               }

               uwotm8.Settings.a();
            }

            if (var4 == 1050 && (var18 = this.cv[3]) > 0) {
               this.aT = !this.aT;
               this.j(429, this.aT ? 1 : 0);
               this.gy.writeOpCode(185);
               this.gy.f(2097164);
            }

            if (var4 == 1051) {
               uwotm8.Settings.k = !uwotm8.Settings.k;
            }

            if (var4 == 1008) {
               this.n = 2;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 1007) {
               this.n = 1;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 1006) {
               this.n = 0;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 1005) {
               this.d(6, 9);
            }

            if (var4 == 1004 && M[10] != -1) {
               P = true;
               aa = 10;
               K = true;
            }

            if (var4 == 1002) {
               this.o = 2;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 1001) {
               this.o = 1;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 1000) {
               this.o = 0;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 999) {
               this.d(0, 0);
            }

            if (var4 == 998) {
               this.d(1, 5);
            }

            if (var4 >= 994 && var4 <= 997) {
               if (var4 == 997) {
                  this.aj = 3;
               }

               if (var4 == 996) {
                  this.aj = 2;
               }

               if (var4 == 995) {
                  this.aj = 1;
               }

               if (var4 == 994) {
                  this.aj = 0;
               }

               ab = true;
               this.gy.writeOpCode(95);
               this.gy.b(this.aj);
               this.gy.b(this.u);
               this.gy.b(this.ae);
            }

            if (var4 == 993) {
               this.d(2, 1);
            }

            if (var4 >= 990 && var4 <= 992) {
               if (var4 == 992) {
                  this.u = 2;
               }

               if (var4 == 991) {
                  this.u = 1;
               }

               if (var4 == 990) {
                  this.u = 0;
               }

               ab = true;
               this.gy.writeOpCode(95);
               this.gy.b(this.aj);
               this.gy.b(this.u);
               this.gy.b(this.ae);
            }

            if (var4 == 989) {
               this.d(3, 2);
            }

            if (var4 >= 985 && var4 <= 987) {
               if (var4 == 987) {
                  this.ae = 2;
               }

               if (var4 == 986) {
                  this.ae = 1;
               }

               if (var4 == 985) {
                  this.ae = 0;
               }

               ab = true;
               this.gy.writeOpCode(95);
               this.gy.b(this.aj);
               this.gy.b(this.u);
               this.gy.b(this.ae);
            }

            if (var4 == 984) {
               this.d(5, 3);
            }

            if (var4 == 983) {
               this.m = 2;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 982) {
               this.m = 1;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 981) {
               this.m = 0;
               ab = true;
               uwotm8.Settings.a();
            }

            if (var4 == 980) {
               this.d(4, 16);
            }

            if (var4 == 493) {
               this.gy.writeOpCode(75);
               this.gy.f(var3);
               this.gy.l(var2);
               this.gy.m(var5);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var10 = uwotm8.m.a(var3)) != null) {
                  if (var10.l == v) {
                     this.he = 1;
                  }

                  if (var10.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            if (var4 == 652) {
               if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
               }

               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(156);
               this.gy.m(var2 + this.eg);
               this.gy.l(var3 + this.eh);
               this.gy.n(var5);
            }

            if (var4 == 94) {
               if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
               }

               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(181);
               this.gy.l(var3 + this.eh);
               this.gy.c(var5);
               this.gy.l(var2 + this.eg);
               this.gy.f(this.fO);
            }

            if (var4 == 646) {
               this.gy.writeOpCode(185);
               this.gy.f(var3);
               if ((var10 = uwotm8.m.a(var3)) != null && var10.r != null && var10.r[0][0] == 5) {
                  var12 = var10.r[0][1];
                  if (this.A[var12] != var10.q[0]) {
                     this.A[var12] = var10.q[0];
                     this.i(var12);
                     P = true;
                  }
               }
            }

            if (var4 == 225 && (var6 = this.bs[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               if ((gN += var5) >= 85) {
                  this.gy.writeOpCode(230);
                  this.gy.b(239);
                  gN = 0;
               }

               this.gy.writeOpCode(17);
               this.gy.n(var5);
            }

            if (var4 == 965 && (var6 = this.bs[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               if (++fM >= 96) {
                  this.gy.writeOpCode(152);
                  this.gy.b(88);
                  fM = 0;
               }

               this.gy.writeOpCode(21);
               this.gy.c(var5);
            }

            if (var4 == 413 && (var6 = this.bs[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(131);
               this.gy.n(var5);
               this.gy.f(this.fO);
            }

            if (var4 == 200) {
               this.ac();
            }

            if (var4 == 1025 && (var6 = this.bs[var5]) != null) {
               ActorDefinition var17 = var6.ad;
               if (var6.ad.r != null) {
                  var17 = var17.b();
               }

               if (var17 != null) {
                  this.gy.writeOpCode(222);
                  this.gy.c(var17.b);
               }
            }

            if (var4 == 900) {
               this.d(var5, var3, var2);
               this.gy.writeOpCode(252);
               this.gy.n(var5 >> 14 & 32767);
               this.gy.l(var3 + this.eh);
               this.gy.m(var2 + this.eg);
            }

            if (var4 == 412 && (var6 = this.bs[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(72);
               this.gy.m(var5);
            }

            if (var4 == 365 && (var11 = this.cd[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(249);
               this.gy.m(var5);
               this.gy.f(this.fO);
            }

            if (var4 == 729 && (var11 = this.cd[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(39);
               this.gy.l(var5);
            }

            if (var4 == 577 && (var11 = this.cd[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(139);
               this.gy.l(var5);
            }

            if (var4 == 956 && this.d(var5, var3, var2)) {
               this.gy.writeOpCode(35);
               this.gy.l(var2 + this.eg);
               this.gy.f(this.fO);
               this.gy.m(var3 + this.eh);
               this.gy.l(var5 >> 14 & 32767);
            }

            if (var4 == 567) {
               if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
               }

               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(23);
               this.gy.l(var3 + this.eh);
               this.gy.l(var5);
               this.gy.l(var2 + this.eg);
            }

            if (var4 == 867) {
               if ((var5 & 3) == 0) {
                  ++gl;
               }

               if (gl >= 59) {
                  this.gy.writeOpCode(200);
                  this.gy.c(25501);
                  gl = 0;
               }

               this.gy.writeOpCode(43);
               this.gy.f(var3);
               this.gy.m(var5);
               this.gy.m(var2);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var10 = uwotm8.m.a(var3)) != null) {
                  if (var10.l == v) {
                     this.he = 1;
                  }

                  if (var10.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            if (var4 == 543) {
               this.gy.writeOpCode(237);
               this.gy.c(var2);
               this.gy.m(var5);
               this.gy.f(this.fO);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var10 = uwotm8.m.a(var3)) != null) {
                  if (var10.l == v) {
                     this.he = 1;
                  }

                  if (var10.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            if (var4 == 606 && (var12 = (var13 = this.X[var1]).indexOf("@whi@")) != -1) {
               if (v == -1) {
                  this.ac();
                  this.bW = var13.substring(var12 + 5).trim();
                  this.ga = false;
                  v = 201;
                  this.go = 201;
               } else {
                  this.a("Please close the interface you have open before using 'report abuse'", 0, "");
               }
            }

            if (var4 == 491 && (var11 = this.cd[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var11.b[0], L.a[0], false, var11.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               this.gy.writeOpCode(14);
               this.gy.c(var5);
               this.gy.l(this.hO);
            }

            if (var4 == 639 && (var12 = (var13 = this.X[var1]).indexOf("@whi@")) != -1) {
               var8 = uwotm8.StringUtils.a(var13.substring(var12 + 5).trim());
               var18 = -1;

               for(var12 = 0; var12 < this.ck; ++var12) {
                  if (this.cV[var12] == var8) {
                     var18 = var12;
                     break;
                  }
               }

               if (var18 != -1 && this.bm[var18] > 0) {
                  ab = true;
                  this.ac = 0;
                  this.hn = true;
                  this.gF = "";
                  this.eC = 3;
                  this.cT = this.cV[var18];
                  this.fD = "Enter message to send to " + this.eT[var18];
               }
            }

            if (var4 == 454) {
               this.gy.writeOpCode(41);
               this.gy.c(var5);
               this.gy.m(var2);
               this.gy.f(var3);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if ((var10 = uwotm8.m.a(var3)) != null) {
                  if (var10.l == v) {
                     this.he = 1;
                  }

                  if (var10.l == this.ai) {
                     this.he = 3;
                  }
               }
            }

            if (var4 == 478 && (var6 = this.bs[var5]) != null) {
               this.a(2, 0, 1, 0, L.b[0], 1, 0, var6.b[0], L.a[0], false, var6.a[0]);
               this.cq = super.ax;
               this.cr = super.ay;
               this.ct = 2;
               this.cs = 0;
               if ((var5 & 3) == 0) {
                  ++fY;
               }

               if (fY >= 53) {
                  this.gy.writeOpCode(85);
                  this.gy.b(66);
                  fY = 0;
               }

               this.gy.writeOpCode(18);
               this.gy.l(var5);
            }

            if (var4 == 113) {
               this.d(var5, var3, var2);
               this.gy.writeOpCode(70);
               this.gy.l(var2 + this.eg);
               this.gy.c(var3 + this.eh);
               this.gy.n(var5 >> 14 & 32767);
            }

            if (var4 == 872) {
               this.d(var5, var3, var2);
               this.gy.writeOpCode(234);
               this.gy.n(var2 + this.eg);
               this.gy.m(var5 >> 14 & 32767);
               this.gy.n(var3 + this.eh);
            }

            if (var4 == 502) {
               this.d(var5, var3, var2);
               this.gy.writeOpCode(132);
               this.gy.n(var2 + this.eg);
               this.gy.c(var5 >> 14 & 32767);
               this.gy.m(var3 + this.eh);
            }

            i var21;
            if (var4 == 1125) {
               var21 = uwotm8.i.c(var5);
               if ((var16 = uwotm8.m.a(var3)) != null && var16.x[var2] >= 100000) {
                  var14 = var16.x[var2] + " x " + var21.k;
               } else if (var21.o != null) {
                  var14 = new String(var21.o);
               } else {
                  var14 = "It's a " + var21.k + ".";
               }

               this.a(var14, 0, "", true);
            }

            if (var4 == 169) {
               this.gy.writeOpCode(185);
               this.gy.f(var3);
               if ((var10 = uwotm8.m.a(var3)).r != null && var10.r[0][0] == 5) {
                  var12 = var10.r[0][1];
                  this.A[var12] = 1 - this.A[var12];
                  this.i(var12);
                  P = true;
               }
            }

            if (var4 == 447) {
               this.hN = 1;
               this.hO = var2;
               this.hP = var3;
               this.hQ = var5;
               this.hR = uwotm8.i.c(var5).k;
               this.fN = 0;
               P = true;
            } else {
               if (var4 == 1226) {
                  j var19;
                  if ((var19 = uwotm8.j.a(var18 = var5 >> 14 & 32767)) != null) {
                     if (var19.v != null) {
                        var14 = new String(var19.v);
                     } else {
                        var14 = "It's a " + var19.c + ".";
                     }
                  } else {
                     var14 = "Something went horribly wrong with this object! ID: " + var18 + " Contact an admin.";
                  }

                  this.a(var14, 0, "", true);
               }

               if (var4 == 244) {
                  if (!this.a(2, 0, 0, 0, L.b[0], 0, 0, var3, L.a[0], false, var2)) {
                     this.a(2, 0, 1, 0, L.b[0], 1, 0, var3, L.a[0], false, var2);
                  }

                  this.cq = super.ax;
                  this.cr = super.ay;
                  this.ct = 2;
                  this.cs = 0;
                  this.gy.writeOpCode(253);
                  this.gy.l(var2 + this.eg);
                  this.gy.n(var3 + this.eh);
                  this.gy.m(var5);
               }

               if (var4 == 1448) {
                  if ((var21 = uwotm8.i.c(var5)).o != null) {
                     var20 = new String(var21.o);
                  } else {
                     var20 = "It's a " + var21.k + ".";
                  }

                  this.a(var20, 0, "", true);
               }

               this.hN = 0;
               this.fN = 0;
               P = true;
            }
         }
      }
   }

   public void run() {
      super.run();
   }

   private void I() {
      if (this.hN == 0 && this.fN == 0) {
         this.X[this.N] = "Walk here";
         this.J[this.N] = 519;
         this.fd[this.N] = super.au;
         this.fe[this.N] = super.av;
         ++this.N;
      }

      int var1 = -1;

      for(int var2 = 0; var2 < uwotm8.D_1.B; ++var2) {
         int var3;
         int var4 = (var3 = uwotm8.D_1.C[var2]) & 127;
         int var5 = var3 >> 7 & 127;
         int var6 = var3 >> 29 & 3;
         int var7 = var3 >> 14 & 32767;
         if (var3 != var1) {
            var1 = var3;
            int var9;
            if (var6 == 2 && this.cO.c(this.cu, var4, var5, var3) >= 0) {
               j var8;
               if ((var8 = uwotm8.j.a(var7)) == null) {
                  continue;
               }

               if (var8.k != null) {
                  var9 = -1;
                  if (var8.s != -1) {
                     VariableBits var17;
                     int var10 = (var17 = uwotm8.VariableBits.a[var8.s]).b;
                     int var11 = var17.c;
                     var9 = var17.d;
                     var9 = ad[var9 - var11];
                     var9 &= uwotm8.j.o.A[var10] >> var11;
                  } else if (var8.f != -1) {
                     var9 = uwotm8.j.o.A[var8.f];
                  }

                  var8 = var9 >= 0 && var9 < var8.k.length && var8.k[var9] != -1 ? uwotm8.j.a(var8.k[var9]) : null;
               }

               if (this.hN == 1) {
                  this.X[this.N] = "Use " + this.hR + " with @cya@" + var8.c;
                  this.J[this.N] = 62;
                  this.ff[this.N] = var3;
                  this.fd[this.N] = var4;
                  this.fe[this.N] = var5;
                  ++this.N;
               } else if (this.fN == 1) {
                  if ((this.fP & 4) == 4) {
                     this.X[this.N] = this.fQ + " @cya@" + var8.c;
                     this.J[this.N] = 956;
                     this.ff[this.N] = var3;
                     this.fd[this.N] = var4;
                     this.fe[this.N] = var5;
                     ++this.N;
                  }
               } else {
                  if (var8.B != null) {
                     for(var9 = 4; var9 >= 0; --var9) {
                        if (var8.B[var9] != null) {
                           this.X[this.N] = var8.B[var9] + " @cya@" + var8.c;
                           if (var9 == 0) {
                              this.J[this.N] = 502;
                           }

                           if (var9 == 1) {
                              this.J[this.N] = 900;
                           }

                           if (var9 == 2) {
                              this.J[this.N] = 113;
                           }

                           if (var9 == 3) {
                              this.J[this.N] = 872;
                           }

                           if (var9 == 4) {
                              this.J[this.N] = 1062;
                           }

                           this.ff[this.N] = var3;
                           this.fd[this.N] = var4;
                           this.fe[this.N] = var5;
                           ++this.N;
                        }
                     }
                  }

                  this.X[this.N] = this.bL < 2 ? "Examine @cya@" + var8.c : "Examine @cya@" + var8.c + " @gre@(@whi@" + var7 + "@gre@) (@whi@" + (var4 + this.eg) + "," + (var5 + this.eh) + "@gre@)";
                  this.J[this.N] = 1226;
                  this.ff[this.N] = var8.h << 14;
                  this.fd[this.N] = var4;
                  this.fe[this.N] = var5;
                  ++this.N;
               }
            }

            Npc var14;
            y var15;
            if (var6 == 1) {
               Npc var18 = this.bs[var7];

               try {
                  if (var18.ad.i == 1 && (var18.V & 127) == 64 && (var18.W & 127) == 64) {
                     for(var9 = 0; var9 < this.bt; ++var9) {
                        if ((var14 = this.bs[this.bu[var9]]) != null && var14 != var18 && var14.ad.i == 1 && var14.V == var18.V && var14.W == var18.W) {
                           this.a(var14.ad, this.bu[var9], var5, var4);
                        }
                     }

                     for(var9 = 0; var9 < this.ce; ++var9) {
                        if ((var15 = this.cd[this.cf[var9]]) != null && var15.V == var18.V && var15.W == var18.W) {
                           this.a(var4, this.cf[var9], var15, var5);
                        }
                     }
                  }

                  this.a(var18.ad, var7, var5, var4);
               } catch (Exception var13) {
                  ;
               }
            }

            if (var6 == 0) {
               y var19 = this.cd[var7];

               try {
                  if ((var19.V & 127) == 64 && (var19.W & 127) == 64) {
                     for(var9 = 0; var9 < this.bt; ++var9) {
                        if ((var14 = this.bs[this.bu[var9]]) != null && var14.ad.i == 1 && var14.V == var19.V && var14.W == var19.W) {
                           this.a(var14.ad, this.bu[var9], var5, var4);
                        }
                     }

                     for(var9 = 0; var9 < this.ce; ++var9) {
                        if ((var15 = this.cd[this.cf[var9]]) != null && var15 != var19 && var15.V == var19.V && var15.W == var19.W) {
                           this.a(var4, this.cf[var9], var15, var5);
                        }
                     }
                  }

                  this.a(var4, var7, var19, var5);
               } catch (Exception var12) {
                  ;
               }
            }

            M_1 var20;
            if (var6 == 3 && (var20 = this.bn[this.cu][var4][var5]) != null) {
               for(w var21 = (w)var20.c(); var21 != null; var21 = (w)var20.e()) {
                  i var16 = uwotm8.i.c(var21.a);
                  if (this.hN == 1) {
                     this.X[this.N] = "Use " + this.hR + " with @lre@" + var16.k;
                     this.J[this.N] = 511;
                     this.ff[this.N] = var21.a;
                     this.fd[this.N] = var4;
                     this.fe[this.N] = var5;
                     ++this.N;
                  } else if (this.fN == 1) {
                     if ((this.fP & 1) == 1) {
                        this.X[this.N] = this.fQ + " @lre@" + var16.k;
                        this.J[this.N] = 94;
                        this.ff[this.N] = var21.a;
                        this.fd[this.N] = var4;
                        this.fe[this.N] = var5;
                        ++this.N;
                     }
                  } else {
                     for(var6 = 4; var6 >= 0; --var6) {
                        if (var16.j != null && var16.j[var6] != null) {
                           this.X[this.N] = var16.j[var6] + " @lre@" + var16.k;
                           if (var6 == 0) {
                              this.J[this.N] = 652;
                           }

                           if (var6 == 1) {
                              this.J[this.N] = 567;
                           }

                           if (var6 == 2) {
                              this.J[this.N] = 234;
                           }

                           if (var6 == 3) {
                              this.J[this.N] = 244;
                           }

                           if (var6 == 4) {
                              this.J[this.N] = 213;
                           }

                           this.ff[this.N] = var21.a;
                        } else {
                           if (var6 != 2) {
                              continue;
                           }

                           this.X[this.N] = "Take @lre@" + var16.k;
                           this.J[this.N] = 234;
                           this.ff[this.N] = var21.a;
                           if (var21.a == 1971) {
                              this.X[this.N] = "Remove @lre@" + var16.k;
                           }
                        }

                        this.fd[this.N] = var4;
                        this.fe[this.N] = var5;
                        ++this.N;
                     }

                     this.X[this.N] = this.bL < 2 ? "Examine @lre@" + var16.k : "Examine @lre@" + var16.k + " @gre@(@whi@" + var21.a + "@gre@)";
                     this.J[this.N] = 1448;
                     this.ff[this.N] = var21.a;
                     this.fd[this.N] = var4;
                     this.fe[this.N] = var5;
                     ++this.N;
                  }
               }
            }
         }
      }

   }

   public final void f() {
	   uwotm8.al.h = false;

      try {
         if (this.gj != null) {
            this.gj.a();
         }
      } catch (Exception var2) {
         ;
      }

      this.gj = null;
      this.B();
      this.S();
      this.h(0, 0);
      if (this.bV != null) {
         this.bV.a = false;
      }

      this.bV = null;
      if (this.gS != null) {
         this.gS = null;
      }

      this.E.c();
      this.E = null;
      this.br = null;
      this.gy = null;
      this.bB = null;
      this.eU = null;
      this.gV = null;
      this.gt = null;
      this.hf = null;
      this.gW = null;
      this.gX = null;
      this.gH = null;
      this.ho = null;
      this.cO = null;
      this.gU = null;
      this.cn = null;
      this.bl = null;
      this.hL = null;
      this.hM = null;
      this.co = null;
      ge = null;
      this.bh = null;
      this.bi = null;
      this.gf = null;
      gg = null;
      gh = null;
      this.fF = null;
      this.fG = null;
      this.fH = null;
      t = null;
      this.bg = null;
      this.r = null;
      this.s = null;
      this.gB = null;
      this.w = null;
      this.fE = null;
      this.du = null;
      this.fh = null;
      this.fi = null;
      this.fj = null;
      this.fV = null;
      this.eL = null;
      this.eM = null;
      this.eN = null;
      this.eO = null;
      this.eP = null;
      this.ez = null;
      this.ef = null;
      this.cA = null;
      this.cd = null;
      this.cf = null;
      this.ch = null;
      this.ci = null;
      this.bw = null;
      this.bs = null;
      this.bu = null;
      this.bn = null;
      this.gp = null;
      this.dO = null;
      this.ex = null;
      this.fd = null;
      this.fe = null;
      this.J = null;
      this.ff = null;
      this.X = null;
      this.A = null;
      this.eJ = null;
      this.eK = null;
      this.fR = null;
      this.hs = null;
      this.eT = null;
      this.cV = null;
      this.bm = null;
      this.cx = null;
      this.cW = null;
      this.cX = null;
      this.fv = null;
      this.fw = null;
      this.fs = null;
      this.ft = null;
      this.fu = null;
      this.fx = null;
      this.fy = null;
      this.fz = null;
      this.fA = null;
      this.dF = null;
      this.bo = false;
      uwotm8.j.a();
      uwotm8.ActorDefinition.c();
      uwotm8.i.a();
      uwotm8.X_1.a = null;
      uwotm8.C_1.b = null;
      uwotm8.m.a = null;
      uwotm8.Animation.a = null;
      uwotm8.g.a = null;
      uwotm8.g.h = null;
      uwotm8.VariableParameter.a = null;
      super.ap = null;
      uwotm8.y.aj = null;
      uwotm8.r.a();
      uwotm8.W_1.a();
      uwotm8.D_1.b();
      uwotm8.e.a();
      System.gc();
   }

   final Component g() {
      Applet var10000 = uwotm8.al.e;
      return (Component)(super.aq != null ? super.aq : this);
   }

   private void J() {
      int var1;
      while((var1 = this.d(-796)) != -1) {
         if (v != -1 && v == this.go) {
            if (var1 == 8 && this.bW.length() > 0) {
               this.bW = this.bW.substring(0, this.bW.length() - 1);
            }

            if ((var1 >= 97 && var1 <= 126 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32 || var1 == 95) && this.bW.length() < 12) {
               this.bW = this.bW + (char)var1;
            }
         } else {
            int var12;
            if (this.hn) {
               if (var1 >= 32 && var1 <= 126 && this.gF.length() < 80) {
                  this.gF = this.gF + (char)var1;
                  ab = true;
               }

               if (var1 == 8 && this.gF.length() > 0) {
                  this.gF = this.gF.substring(0, this.gF.length() - 1);
                  ab = true;
               }

               if (var1 == 13 || var1 == 10) {
                  this.hn = false;
                  ab = true;
                  long var14;
                  if (this.eC == 1) {
                     var14 = uwotm8.StringUtils.a(this.gF);
                     this.b(var14);
                  }

                  if (this.eC == 2 && this.ck > 0) {
                     var14 = uwotm8.StringUtils.a(this.gF);
                     this.a(var14);
                  }

                  if (this.eC == 3 && this.gF.length() > 0) {
                     this.gy.writeOpCode(126);
                     this.gy.b(0);
                     var12 = this.gy.b;
                     this.gy.a(this.cT);
                     uwotm8.av.a(this.gF, this.gy);
                     this.gy.h(this.gy.b - var12);
                     this.gF = uwotm8.av.a(this.gF);
                     this.a(this.gF, 6, uwotm8.StringUtils.c(uwotm8.StringUtils.a(this.cT)));
                     if (this.u == 2) {
                        this.u = 1;
                        this.gy.writeOpCode(95);
                        this.gy.b(this.aj);
                        this.gy.b(this.u);
                        this.gy.b(this.ae);
                     }
                  }

                  if (this.eC == 4 && this.bj < 100) {
                     var14 = uwotm8.StringUtils.a(this.gF);
                     this.c(var14);
                  }

                  if (this.eC == 5 && this.bj > 0) {
                     var14 = uwotm8.StringUtils.a(this.gF);
                     this.d(var14);
                  }

                  if (this.eC == 6) {
                     var14 = uwotm8.StringUtils.a(this.gF);
                     long var7 = var14;
                     Client var13 = this;
                     if (var14 != 0L) {
                        try {
                           var13.gy.writeOpCode(61);
                           var13.gy.a(var7);
                        } catch (RuntimeException var9) {
                        	uwotm8.al.b("47229, 3, " + var14 + ", " + var9.toString());
                           throw new RuntimeException();
                        }
                     }
                  }
               }
            } else if (this.ac == 1) {
               if (var1 >= 48 && var1 <= 57 && this.dG.length() < 10) {
                  this.dG = this.dG + (char)var1;
                  ab = true;
               }

               if (!this.dG.toLowerCase().contains("k") && !this.dG.toLowerCase().contains("m") && !this.dG.toLowerCase().contains("b") && (var1 == 107 || var1 == 109) || var1 == 98) {
                  this.dG = this.dG + (char)var1;
                  ab = true;
               }

               if (var1 == 8 && this.dG.length() > 0) {
                  this.dG = this.dG.substring(0, this.dG.length() - 1);
                  ab = true;
               }

               if (var1 == 13 || var1 == 10) {
                  if (this.dG.length() > 0) {
                     if (this.dG.toLowerCase().contains("k")) {
                        this.dG = this.dG.replaceAll("k", "000");
                     } else if (this.dG.toLowerCase().contains("m")) {
                        this.dG = this.dG.replaceAll("m", "000000");
                     } else if (this.dG.toLowerCase().contains("b")) {
                        this.dG = this.dG.replaceAll("b", "000000000");
                     }

                     try {
                        var12 = Integer.parseInt(this.dG);
                     } catch (NumberFormatException var10) {
                        var12 = Integer.MAX_VALUE;
                     }

                     this.gy.writeOpCode(208);
                     this.gy.f(var12);
                  }

                  this.ac = 0;
                  ab = true;
               }
            } else if (this.ac == 2) {
               if (uwotm8.av.a((char)var1) && this.dG.length() < 12) {
                  this.dG = this.dG + (char)var1;
                  ab = true;
               }

               if (var1 == 8 && this.dG.length() > 0) {
                  this.dG = this.dG.substring(0, this.dG.length() - 1);
                  ab = true;
               }

               if (var1 == 13 || var1 == 10) {
                  if (this.dG.length() > 0) {
                     this.gy.writeOpCode(60);
                     this.gy.a(uwotm8.StringUtils.a(this.dG));
                  }

                  this.ac = 0;
                  ab = true;
               }
            } else if (this.ac >= 3 && this.ac <= 5) {
               if (uwotm8.av.a((char)var1) && this.dG.length() < 40) {
                  this.dG = this.dG + (char)var1;
                  ab = true;
               }

               if (var1 == 8 && this.dG.length() > 0) {
                  this.dG = this.dG.substring(0, this.dG.length() - 1);
                  ab = true;
               }

               if (var1 == 13 || var1 == 10) {
                  this.ac = 0;
                  ab = true;
               }

               if (uwotm8.av.a((char)var1) && this.dG.length() < 40 || var1 == 8 && this.dG.length() > 0) {
                  this.a(this.dG);
                  ab = true;
               }
            } else if (this.ai == -1) {
               if (uwotm8.av.a((char)var1) && this.ca.length() < 80) {
                  this.ca = this.ca + (char)var1;
                  ab = true;
               }

               if (var1 == 8 && this.ca.length() > 0) {
                  this.ca = this.ca.substring(0, this.ca.length() - 1);
                  ab = true;
               }

               if (var1 == 9) {
                  this.p();
               }

               if ((var1 == 13 || var1 == 10) && this.ca.length() > 0) {
                  if (this.ca.equalsIgnoreCase("::fps")) {
                     fZ = !fZ;
                  }

                  if (this.bL >= 2) {
                     if (this.ca.equalsIgnoreCase("::dumpclip")) {
                        this.E.a();
                     }

                     if (this.ca.equalsIgnoreCase("::data")) {
                        da = !da;
                     }

                     if (this.ca.equalsIgnoreCase("::itemsearch")) {
                        this.ac = 3;
                        this.a(this.dG);
                        ab = true;
                     } else if (this.ca.equalsIgnoreCase("::npcsearch")) {
                        this.ac = 4;
                        this.a(this.dG);
                        ab = true;
                     } else if (this.ca.equalsIgnoreCase("::objectsearch")) {
                        this.ac = 5;
                        this.a(this.dG);
                        ab = true;
                     }
                  }

                  if (this.ca.startsWith("/")) {
                     this.ca = "::" + this.ca;
                  }

                  if (this.ca.startsWith("::")) {
                     this.gy.writeOpCode(103);
                     this.gy.b(this.ca.length() - 1);
                     this.gy.a(this.ca.substring(2));
                  } else {
                     String var2 = this.ca.toLowerCase();
                     byte var3 = 0;
                     if (var2.startsWith("yellow:")) {
                        var3 = 0;
                        this.ca = this.ca.substring(7);
                     } else if (var2.startsWith("red:")) {
                        var3 = 1;
                        this.ca = this.ca.substring(4);
                     } else if (var2.startsWith("green:")) {
                        var3 = 2;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith("cyan:")) {
                        var3 = 3;
                        this.ca = this.ca.substring(5);
                     } else if (var2.startsWith("purple:")) {
                        var3 = 4;
                        this.ca = this.ca.substring(7);
                     } else if (var2.startsWith("white:")) {
                        var3 = 5;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith("flash1:")) {
                        var3 = 6;
                        this.ca = this.ca.substring(7);
                     } else if (var2.startsWith("flash2:")) {
                        var3 = 7;
                        this.ca = this.ca.substring(7);
                     } else if (var2.startsWith("flash3:")) {
                        var3 = 8;
                        this.ca = this.ca.substring(7);
                     } else if (var2.startsWith("glow1:")) {
                        var3 = 9;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith("glow2:")) {
                        var3 = 10;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith("glow3:")) {
                        var3 = 11;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith(">")) {
                        var3 = 2;
                     }

                     var2 = this.ca.toLowerCase();
                     byte var11 = 0;
                     if (var2.startsWith("wave:")) {
                        var11 = 1;
                        this.ca = this.ca.substring(5);
                     } else if (var2.startsWith("wave2:")) {
                        var11 = 2;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith("shake:")) {
                        var11 = 3;
                        this.ca = this.ca.substring(6);
                     } else if (var2.startsWith("scroll:")) {
                        var11 = 4;
                        this.ca = this.ca.substring(7);
                     } else if (var2.startsWith("slide:")) {
                        var11 = 5;
                        this.ca = this.ca.substring(6);
                     }

                     this.gy.writeOpCode(4);
                     this.gy.b(0);
                     var12 = this.gy.b;
                     this.gy.k(var11);
                     this.gy.k(var3);
                     this.br.b = 0;
                     uwotm8.av.a(this.ca, this.br);
                     this.gy.a(0, this.br.a, this.br.b);
                     this.gy.h(this.gy.b - var12);
                     this.ca = uwotm8.av.a(this.ca);
                     L.g = this.ca;
                     L.l = var3;
                     L.D = var11;
                     L.H = 150;
                     if (L.aB) {
                        this.a(L.g, 2, "@irn@" + L.ai, this.bL);
                     } else {
                        this.a(L.g, 2, L.ai, this.bL);
                     }

                     if (this.aj == 2) {
                        this.aj = 3;
                        this.gy.writeOpCode(95);
                        this.gy.b(this.aj);
                        this.gy.b(this.u);
                        this.gy.b(this.ae);
                     }
                  }

                  this.ca = "";
                  ab = true;
               }
            }
         }
      }

   }

   private static String K() {
      m var0;
      int var1;
      return (var0 = uwotm8.m.a(489, 2)) != null && var0.R != null && (var1 = var0.R.indexOf(58)) != -1 ? var0.R.substring(var1 + 2) : "";
   }

   private void c(String var1) {
      if (this.bL >= 0) {
         this.X[this.N] = "Report abuse @whi@".concat(String.valueOf(var1));
         this.J[this.N] = 606;
         ++this.N;
      }

      this.X[this.N] = "Add ignore @whi@".concat(String.valueOf(var1));
      this.J[this.N] = 42;
      ++this.N;
      this.X[this.N] = "Add friend @whi@".concat(String.valueOf(var1));
      this.J[this.N] = 337;
      ++this.N;
   }

   private void n(int var1) {
      if (!this.hn && this.ac == 0 && this.bA == null && this.ai == -1 && this.em == -1) {
         Rectangle var2;
         (var2 = t.b()).getX();
         int var3 = (int)var2.getY();
         o var4 = this.hz;
         var4 = this.hz;
         int var11 = this.hz.a;
         int var5 = 0;

         for(int var6 = 0; var6 < 500; ++var6) {
            if (this.cL[var6] != null) {
               String var7 = this.cK[var6];
               int var8 = this.cJ[var6];
               boolean var9 = this.bd[var6];
               int var10 = var3 + (int)var2.getHeight() - var5 * (var11 + 3) - 6 + F;
               if (var7 != null && var7.startsWith("@irn@")) {
                  var7 = var7.substring(5);
               }

               switch(var8) {
               case 0:
                  if ((this.be == 5 || this.be == 0) && (this.o == 0 || this.o == 1 && var9)) {
                     ++var5;
                  }
                  break;
               case 1:
               case 2:
                  if (this.be != 1 && this.be != 0 || var8 != 1 && this.aj != 0 && (this.aj != 1 || !this.e(var7))) {
                     break;
                  }

                  ++var5;
                  if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                     this.c(var7);
                  }
                  break;
               case 3:
               case 7:
                  if ((this.gA == 0 && this.be == 0 || this.be == 2) && (var8 == 7 || this.u == 0 || this.u == 1 && this.e(var7))) {
                     ++var5;
                     if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                        this.c(var7);
                     }
                  }
                  break;
               case 4:
                  if (this.be != 3 && this.be != 0 || var8 != 4 || this.ae != 0 && (this.ae != 1 || !this.e(var7))) {
                     break;
                  }

                  ++var5;
                  if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                     this.X[this.N] = "Accept trade @whi@".concat(String.valueOf(var7));
                     this.J[this.N] = 484;
                     ++this.N;
                  }
                  break;
               case 5:
                  if ((this.gA == 0 && this.be == 0 || this.be == 2) && this.u < 2) {
                     ++var5;
                  }
                  break;
               case 6:
                  if ((this.gA == 0 && this.be == 0 || this.be == 2) && this.u < 2) {
                     ++var5;
                  }
                  break;
               case 8:
                  if (this.be != 3 && this.be != 0) {
                     break;
                  }

                  ++var5;
                  if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                     this.X[this.N] = "Accept challenge @whi@".concat(String.valueOf(var7));
                     this.J[this.N] = 6;
                     ++this.N;
                  }
                  break;
               case 9:
                  if ((this.be == 0 && this.n == 0 || this.be == 9) && (this.n == 0 || this.n == 1)) {
                     ++var5;
                     if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                        this.c(var7);
                     }
                  }
               case 10:
               case 11:
               case 13:
               case 14:
               case 15:
               default:
                  break;
               case 12:
                  if (this.be != 5 && this.be != 0 || this.o != 0 && (this.o != 1 || !var9)) {
                     break;
                  }

                  ++var5;
                  if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                     this.X[this.N] = "Go-to @lre@".concat(String.valueOf(var7));
                     this.J[this.N] = 927;
                     ++this.N;
                  }
                  break;
               case 16:
                  if ((this.be == 16 || this.be == 0 && this.m == 0) && (this.m == 0 || this.m == 1)) {
                     ++var5;
                     if (!var7.equalsIgnoreCase(L.ai) && var1 > var10 - var11 && var1 <= var10) {
                        this.c(var7);
                     }
                  }
               }
            }
         }

      }
   }

   private static int o(int var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 1; var3 <= var0; ++var3) {
         var1 = (int)((double)var1 + Math.floor((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D)));
         if (var3 >= var0) {
            return var2;
         }

         var2 = var1 / 4;
      }

      return 0;
   }

   private void a(String var1, int var2, String var3) {
      this.a(var2, "", var3, var1, 0, false);
   }

   private void a(String var1, int var2, String var3, boolean var4) {
      this.a(0, "", var3, var1, 0, var4);
   }

   private void a(String var1, int var2, String var3, int var4) {
      this.a(var2, "", var3, var1, var4, false);
   }

   private void a(int var1, String var2, String var3, String var4, int var5) {
      this.a(var1, var2, var3, var4, var5, false);
   }

   private void a(int var1, String var2, String var3, String var4, int var5, boolean var6) {
      if (var1 == 0 && this.em != -1) {
         this.bA = var4;
         super.aw = 0;
      }

      if (this.ai == -1) {
         ab = true;
      }

      for(int var7 = 499; var7 > 0; --var7) {
         this.cJ[var7] = this.cJ[var7 - 1];
         this.cK[var7] = this.cK[var7 - 1];
         this.cL[var7] = this.cL[var7 - 1];
         this.bc[var7] = this.bc[var7 - 1];
         this.bd[var7] = this.bd[var7 - 1];
         this.cM[var7] = this.cM[var7 - 1];
      }

      this.cJ[0] = var1;
      this.cK[0] = var3;
      this.cL[0] = var4;
      this.bc[0] = var5;
      this.bd[0] = var6;
      this.cM[0] = var2;
   }

   public static void b(int var0) {
      if (M[var0] != -1) {
         P = true;
         aa = var0;
         K = true;
      }

   }

   private void L() {
      if (this.eX == 0) {
         this.X[0] = "Cancel";
         this.J[0] = 1107;
         this.N = 1;
         if (this.hU != -1) {
            this.bZ = 0;
            this.hX = 0;
            this.a(8, uwotm8.m.a[this.hU], super.au, 8, super.av, 0, -1);
            if (this.bZ != this.ec) {
               this.ec = this.bZ;
            }

            if (this.hX != this.hW) {
               this.hW = this.hX;
            }

         } else {
            Client var1 = this;
            int var2;
            if (this.gA != 0) {
               var2 = 0;
               if (!this.fr.isEmpty()) {
                  ++var2;
               }

               if (this.fq != 0) {
                  ++var2;
               }

               for(int var3 = 0; var3 < 100; ++var3) {
                  if (var1.cL[var3] != null) {
                     int var4 = var1.cJ[var3];
                     String var5;
                     if ((var5 = var1.cK[var3]) != null && var5.startsWith("@irn@")) {
                        var5 = var5.substring(5);
                     }

                     if ((var4 == 3 || var4 == 7) && (var4 == 7 || var1.u == 0 || var1.u == 1 && var1.e(var5))) {
                        int var6 = 329 - var2 * 13;
                        if (a != com.runescape.a.a) {
                           var6 = d - 176 - var2 * 13;
                        }

                        if (var1.au > 4 && var1.av - 4 > var6 - 10 && var1.av - 4 <= var6 + 3) {
                           int var7;
                           if ((var7 = var1.hz.a("From:  " + var5 + var1.cL[var3]) + 25) > 450) {
                              var7 = 450;
                           }

                           if (var1.au < var7 + 4) {
                              if (var1.bL > 0) {
                                 var1.X[var1.N] = "Report abuse @whi@".concat(String.valueOf(var5));
                                 var1.J[var1.N] = 2606;
                                 ++var1.N;
                              }

                              var1.X[var1.N] = "Add ignore @whi@".concat(String.valueOf(var5));
                              var1.J[var1.N] = 2042;
                              ++var1.N;
                              var1.X[var1.N] = "Add friend @whi@".concat(String.valueOf(var5));
                              var1.J[var1.N] = 2337;
                              ++var1.N;
                           }
                        }

                        ++var2;
                        if (var2 >= 5) {
                           break;
                        }
                     }

                     if ((var4 == 5 || var4 == 6) && var1.u < 2) {
                        ++var2;
                        if (var2 >= 5) {
                           break;
                        }
                     }
                  }
               }
            }

            this.bZ = 0;
            this.hX = 0;
            int var8;
            if (a == com.runescape.a.a) {
               if (super.au > 4 && super.av > 4 && super.au < 516 && super.av < 338) {
                  if (v != -1) {
                     this.a(4, uwotm8.m.a[v], super.au, 4, super.av, 0, -1);
                  } else {
                     this.I();
                  }
               }
            } else if (a != com.runescape.a.a && this.c()) {
               var8 = c / 2 - 356;
               var2 = d / 2 - 230;
               if (this.a(var8, var2, var8 + 516, var2 + 338) && v != -1) {
                  this.a(var8, uwotm8.m.a[v], super.au, var2, super.av, 0, -1);
               } else {
                  this.I();
               }
            }

            if (this.bZ != this.ec) {
               this.ec = this.bZ;
            }

            if (this.hX != this.hW) {
               this.hW = this.hX;
            }

            this.bZ = 0;
            this.hX = 0;
            if (a == com.runescape.a.a) {
               if (super.au > c - 218 && super.av > d - 298 && super.au < c - 25 && super.av < d - 35) {
                  if (this.W != -1) {
                     this.a(c - 218, uwotm8.m.a[this.W], super.au, d - 298, super.av, 0, -1);
                  } else if (M[aa] != -1) {
                     this.a(c - 218, uwotm8.m.a[M[aa]], super.au, d - 298, super.av, 0, -1);
                  }
               }
            } else if (a != com.runescape.a.a) {
               var8 = c > h ? 37 : 74;
               if (c > h && super.au > c - 197 && super.av > d - var8 - 267 && super.au < c - 7 && super.av < d - var8 - 7 && f) {
                  if (this.W != -1) {
                     this.a(c - 197, uwotm8.m.a[this.W], super.au, d - 304, super.av, 0, -1);
                  } else if (M[aa] != -1) {
                     this.a(c - 197, uwotm8.m.a[M[aa]], super.au, d - 304, super.av, 0, -1);
                  }
               }

               if (c <= h && super.au > c - 211 && super.av > d - var8 - 267 && super.au < c - 7 && super.av < d - var8 - 7 && f) {
                  if (this.W != -1) {
                     this.a(c - 211, uwotm8.m.a[this.W], super.au, d - var8 - 267, super.av, 0, -1);
                  } else if (M[aa] != -1) {
                     this.a(c - 211, uwotm8.m.a[M[aa]], super.au, d - var8 - 267, super.av, 0, -1);
                  }
               }
            }

            if (this.bZ != this.er) {
               P = true;
               K = true;
               this.er = this.bZ;
            }

            if (this.hX != this.hV) {
               P = true;
               K = true;
               this.hV = this.hX;
            }

            this.bZ = 0;
            this.hX = 0;
            if (e) {
               var8 = t.a(true);
               Rectangle var13 = t.b();
               if (super.au > 0 && super.au < (int)var13.getWidth() && super.av > var8 && super.av < var8 + (int)var13.getMaxY() + 11) {
                  if (this.ai != -1) {
                     var8 = var8 + var13.y + 11;
                     this.a((int)var13.getX(), uwotm8.m.a[this.ai], super.au, var8, super.av, 0, -1);
                  } else {
                     this.n(super.av - var8);
                  }
               }
            }

            if (this.ai != -1 && this.bZ != this.el) {
               ab = true;
               this.el = this.bZ;
            }

            if (this.ai != -1 && this.hX != this.hY) {
               ab = true;
               this.hY = this.hX;
            }

            if (super.au > 0 && super.av > d - 165 && super.au < 459 && super.av < d) {
               t.e(this);
            } else if (super.au > c - 249 && super.av < 168) {
               boolean var14 = a == com.runescape.a.a;
               if (super.au >= c - (var14 ? 225 : 215) && super.au <= c - (var14 ? 185 : 172) && super.av > 0 && super.av < 38) {
                  this.X[1] = "Face north";
                  this.J[1] = 1010;
                  this.N = 2;
               }

               if (uwotm8.Settings.j) {
                  boolean var11 = uwotm8.Settings.k;
                  Point var12 = new Point(248, 18);
                  Point var15 = new Point(240, 22);
                  Point var16 = new Point(!var11 ? 230 : 75, 122);
                  Point var17 = new Point(!var11 ? 224 : 57, 126);
                  if (super.au >= c - (var14 ? var12.x : var15.x) && super.au <= c - ((var14 ? var12.x : var15.x) - 22) && super.av >= (var14 ? var12.y : var15.y) && super.av <= (var14 ? var12.y : var15.y) + 28) {
                     if (uwotm8.aH_1.d()) {
                        this.X[4] = "Disable @lre@XP Drops";
                        this.J[4] = 1011;
                        this.X[3] = "Position: @lre@Left";
                        this.J[3] = 1012;
                        this.X[2] = "Position: @lre@Center";
                        this.J[2] = 1013;
                        this.X[1] = "Position: @lre@Right";
                        this.J[1] = 1014;
                        this.N = 5;
                     } else {
                        this.X[1] = "Enable @lre@XP Drops";
                        this.J[1] = 1011;
                        this.N = 2;
                     }
                  } else if (super.au >= c - (var14 ? var16.x : var17.x) && super.au <= c - ((var14 ? var16.x : var17.x) - 56) && super.av >= (var14 ? var16.y : var17.y) && super.av <= (var14 ? var16.y : var17.y) + 28) {
                     this.X[2] = "Toggle @lre@Run";
                     this.J[2] = 1050;
                     this.X[1] = "Toggle @lre@" + (var11 ? "Left" : "Right");
                     this.J[1] = 1051;
                     this.N = 3;
                  }
               }
            }

            boolean var9 = false;

            while(!var9) {
               var9 = true;

               for(var2 = 0; var2 < this.N - 1; ++var2) {
                  if (this.J[var2] < 1000 && this.J[var2 + 1] > 1000) {
                     String var10 = this.X[var2];
                     this.X[var2] = this.X[var2 + 1];
                     this.X[var2 + 1] = var10;
                     var8 = this.J[var2];
                     this.J[var2] = this.J[var2 + 1];
                     this.J[var2 + 1] = var8;
                     var8 = this.fd[var2];
                     this.fd[var2] = this.fd[var2 + 1];
                     this.fd[var2 + 1] = var8;
                     var8 = this.fe[var2];
                     this.fe[var2] = this.fe[var2 + 1];
                     this.fe[var2 + 1] = var8;
                     var8 = this.ff[var2];
                     this.ff[var2] = this.ff[var2 + 1];
                     this.ff[var2 + 1] = var8;
                     var9 = false;
                  }
               }
            }

         }
      }
   }

   private void a(String var1, String var2, boolean var3) {
      uwotm8.al.i = var1;

      try {
         if (!var3) {
            this.hw = "";
            this.hv = "Connecting to server...";
         }

         File var4 = new File(uwotm8.al.a() + "cacheVersion.dat");
         new CacheUpdater(this);
         int var5 = uwotm8.CacheUpdater.a();
         int var6;
         if (var4.exists()) {
            var6 = uwotm8.CacheUpdater.b();
            if (var5 != var6) {
               this.hv = "Vscape has been updated!";
               this.hw = "Please restart your client.";
               return;
            }
         }

         this.gj = new ai(this, a(43594));
         int var12 = (int)(uwotm8.StringUtils.a(var1) >> 16 & 31L);
         this.gy.b = 0;
         this.gy.b(14);
         this.gy.b(var12);
         this.gj.a(2, this.gy.a);

         for(var12 = 0; var12 < 8; ++var12) {
            this.gj.b();
         }

         var5 = var12 = this.gj.b();
         int var7;
         if (var12 == 0) {
            this.gj.a(this.eU.a, 8);
            this.eU.b = 0;
            this.gI = this.eU.k();
            int[] var13;
            (var13 = new int[4])[0] = (int)(Math.random() * 9.9999999E7D);
            var13[1] = (int)(Math.random() * 9.9999999E7D);
            var13[2] = (int)(this.gI >> 32);
            var13[3] = (int)this.gI;
            this.gy.b = 0;
            this.gy.b(10);
            this.gy.f(var13[0]);
            this.gy.f(var13[1]);
            this.gy.f(var13[2]);
            this.gy.f(var13[3]);
            this.gy.f(1092);
            this.gy.a(var1);
            this.gy.a(var2);
            this.gy.r();
            this.bB.b = 0;
            if (var3) {
               this.bB.b(18);
            } else {
               this.bB.b(16);
            }

            this.bB.b(this.gy.b + 36 + 1 + 1 + 2);
            this.bB.b(255);
            this.bB.c(344);
            this.bB.b(0);
            String var14;
            if ((var14 = o()).equals("00-00-00-00-00-00-00-E0") || var14.equals("00:00:00:00:00:00")) {
               var14 = System.getenv("USERNAME") + "@" + System.getenv("COMPUTERNAME");
            }

            this.bB.a(var14);

            for(var7 = 0; var7 < 9; ++var7) {
               this.bB.f(this.fc[var7]);
            }

            this.bB.a(this.gy.a, this.gy.b, 0);
            this.gy.d = new ad(var13);

            for(var7 = 0; var7 < 4; ++var7) {
               var13[var7] += 50;
            }

            this.dD = new ad(var13);
            this.gj.a(this.bB.b, this.bB.a);
            var12 = this.gj.b();
         }

         if (var12 == 1) {
            try {
               Thread.sleep(2000L);
            } catch (Exception var8) {
               ;
            }

            this.a(var1, var2, var3);
         } else if (var12 == 2) {
            this.bL = this.gj.b();
            this.gj.b();
            this.gL = 0L;
            this.bV.b = 0;
            super.ar = true;
            this.cU = true;
            Q = true;
            this.gy.b = 0;
            this.eU.b = 0;
            this.dK = -1;
            this.bx = -1;
            this.by = -1;
            this.bz = -1;
            this.dJ = 0;
            this.dL = 0;
            this.fq = 0;
            this.fr = "";
            this.dN = 0;
            this.bF = 0;
            this.N = 0;
            this.bY = false;
            super.as = 0;

            for(var12 = 0; var12 < 100; ++var12) {
               this.cL[var12] = null;
            }

            this.hN = 0;
            this.fN = 0;
            this.dX = 0;
            this.eA = 0;
            this.H();
            this.dW = 0;
            this.ds = -1;
            this.hq = 0;
            this.hr = 0;
            this.ce = 0;
            this.bt = 0;

            for(var12 = 0; var12 < 2048; ++var12) {
               this.cd[var12] = null;
               this.ci[var12] = null;
            }

            for(var12 = 0; var12 < 16384; ++var12) {
               this.bs[var12] = null;
            }

            L = this.cd[2047] = new y();
            this.dO.f();
            this.ex.f();

            for(var12 = 0; var12 < 4; ++var12) {
               for(var6 = 0; var6 < 104; ++var6) {
                  for(var7 = 0; var7 < 104; ++var7) {
                     this.bn[var12][var6][var7] = null;
                  }
               }
            }

            this.gp = new M_1();
            this.cm = 0;
            this.ck = 0;
            this.bj = 0;
            this.cl = 0;
            this.em = -1;
            this.ai = -1;
            v = -1;
            this.W = -1;
            this.dT = -1;
            this.fU = false;
            aa = 3;
            this.ac = 0;
            this.bY = false;
            this.hn = false;
            this.bA = null;
            this.ew = 0;
            this.C = -1;
            this.eq = true;
            this.A();

            for(var12 = 0; var12 < 5; ++var12) {
               this.dw[var12] = 0;
            }

            for(var12 = 0; var12 < 5; ++var12) {
               this.fI[var12] = null;
               this.fJ[var12] = false;
            }

            gl = 0;
            fM = 0;
            dt = 0;
            hS = 0;
            cw = 0;
            gx = 0;
            fY = 0;
            gN = 0;
            this.E();
            this.F();
            this.a(uwotm8.Settings.c);
         } else if (var12 == 3) {
            this.hw = "";
            this.hv = "Invalid username or password.";
         } else if (var12 == 4) {
            this.hv = "Your account has been disabled.";
            this.hw = "Thank you, come again.";
         } else if (var12 == 5) {
            this.hv = "Your account is already logged in.";
            this.hw = "Try again in 60 seconds...";
         } else if (var12 == 6) {
            this.hv = "Vscape has been updated!";
            this.hw = "Download the new client.";
         } else if (var12 == 7) {
            this.hv = "This world is full.";
            this.hw = "Please use a different world.";
         } else if (var12 == 8) {
            this.hv = "Unable to connect.";
            this.hw = "Login server offline.";
         } else if (var12 == 9) {
            this.hv = "Login limit exceeded.";
            this.hw = "Too many connections.";
         } else if (var12 == 10) {
            this.hv = "Unable to connect.";
            this.hw = "Bad session id.";
         } else if (var12 == 11) {
            this.hw = "Login server rejected session.";
            this.hw = "Please try again.";
         } else if (var12 == 12) {
            this.hv = "You need a members account to login to this world.";
            this.hw = "Please subscribe, or use a different world.";
         } else if (var12 == 13) {
            this.hv = "Could not complete login.";
            this.hw = "Please try again.";
         } else if (var12 == 14) {
            this.hv = "The server is being updated.";
            this.hw = "Please wait and try again.";
         } else if (var12 == 15) {
            Q = true;
            this.gy.b = 0;
            this.eU.b = 0;
            this.dK = -1;
            this.bx = -1;
            this.by = -1;
            this.bz = -1;
            this.dJ = 0;
            this.dL = 0;
            this.fq = 0;
            this.fr = "";
            this.N = 0;
            this.bY = false;
            this.bk = System.currentTimeMillis();
         } else if (var12 == 16) {
            this.hv = "Login attempts exceeded.";
            this.hw = "Please wait 1 minute and try again.";
         } else if (var12 == 17) {
            this.hv = "You are standing in a members-only area.";
            this.hw = "To play on this world move to a free area first";
         } else if (var12 == 20) {
            this.hv = "Invalid loginserver requested";
            this.hw = "Please try again.";
         } else if (var12 != 21) {
            if (var12 == -1) {
               if (var5 == 0) {
                  if (this.ek < 2) {
                     try {
                        Thread.sleep(2000L);
                     } catch (Exception var10) {
                        ;
                     }

                     ++this.ek;
                     this.a(var1, var2, var3);
                  } else {
                     this.hv = "No response from loginserver.";
                     this.hw = "Please wait and try again.";
                  }
               } else {
                  this.hv = "No response from server.";
                  this.hw = "Please try again.";
               }
            } else {
               System.out.println("response:".concat(String.valueOf(var12)));
               this.hv = "Unexpected server response.";
               this.hw = "Please try again.";
            }
         } else {
            for(var12 = this.gj.b(); var12 >= 0; --var12) {
               this.hv = "You have only just left another world";
               this.hw = "Your profile will be transferred in: " + var12 + " seconds";

               try {
                  Thread.sleep(1000L);
               } catch (Exception var9) {
                  ;
               }
            }

            this.a(var1, var2, var3);
         }
      } catch (IOException var11) {
         this.hv = "";
         this.hv = "Invalid login or server offline.";
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      int var12;
      int var13;
      for(var12 = 0; var12 < 104; ++var12) {
         for(var13 = 0; var13 < 104; ++var13) {
            this.cn[var12][var13] = 0;
            this.bl[var12][var13] = 99999999;
         }
      }

      var12 = var9;
      var13 = var5;
      this.cn[var9][var5] = 99;
      this.bl[var9][var5] = 0;
      byte var14 = 0;
      int var15 = 0;
      this.hL[0] = var9;
      int var20 = var14 + 1;
      this.hM[0] = var5;
      boolean var16 = false;
      int var17 = this.hL.length;
      int[][] var18 = this.gU[this.cu].a;

      int var19;
      while(var15 != var20) {
         var12 = this.hL[var15];
         var13 = this.hM[var15];
         var15 = (var15 + 1) % var17;
         if (var12 == var11 && var13 == var8) {
            var16 = true;
            break;
         }

         if (var4 != 0) {
            if ((var4 < 5 || var4 == 10) && this.gU[this.cu].a(var11, var12, var13, var2, var4 - 1, var8)) {
               var16 = true;
               break;
            }

            if (var4 < 10 && this.gU[this.cu].b(var11, var8, var13, var4 - 1, var2, var12)) {
               var16 = true;
               break;
            }
         }

         if (var6 != 0 && var3 != 0 && this.gU[this.cu].a(var8, var11, var12, var3, var7, var6, var13)) {
            var16 = true;
            break;
         }

         var19 = this.bl[var12][var13] + 1;
         if (var12 > 0 && this.cn[var12 - 1][var13] == 0 && (var18[var12 - 1][var13] & 19398920) == 0) {
            this.hL[var20] = var12 - 1;
            this.hM[var20] = var13;
            var20 = (var20 + 1) % var17;
            this.cn[var12 - 1][var13] = 2;
            this.bl[var12 - 1][var13] = var19;
         }

         if (var12 < 103 && this.cn[var12 + 1][var13] == 0 && (var18[var12 + 1][var13] & 19399040) == 0) {
            this.hL[var20] = var12 + 1;
            this.hM[var20] = var13;
            var20 = (var20 + 1) % var17;
            this.cn[var12 + 1][var13] = 8;
            this.bl[var12 + 1][var13] = var19;
         }

         if (var13 > 0 && this.cn[var12][var13 - 1] == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
            this.hL[var20] = var12;
            this.hM[var20] = var13 - 1;
            var20 = (var20 + 1) % var17;
            this.cn[var12][var13 - 1] = 1;
            this.bl[var12][var13 - 1] = var19;
         }

         if (var13 < 103 && this.cn[var12][var13 + 1] == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
            this.hL[var20] = var12;
            this.hM[var20] = var13 + 1;
            var20 = (var20 + 1) % var17;
            this.cn[var12][var13 + 1] = 4;
            this.bl[var12][var13 + 1] = var19;
         }

         if (var12 > 0 && var13 > 0 && this.cn[var12 - 1][var13 - 1] == 0 && (var18[var12 - 1][var13 - 1] & 19398926) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
            this.hL[var20] = var12 - 1;
            this.hM[var20] = var13 - 1;
            var20 = (var20 + 1) % var17;
            this.cn[var12 - 1][var13 - 1] = 3;
            this.bl[var12 - 1][var13 - 1] = var19;
         }

         if (var12 < 103 && var13 > 0 && this.cn[var12 + 1][var13 - 1] == 0 && (var18[var12 + 1][var13 - 1] & 19399043) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
            this.hL[var20] = var12 + 1;
            this.hM[var20] = var13 - 1;
            var20 = (var20 + 1) % var17;
            this.cn[var12 + 1][var13 - 1] = 9;
            this.bl[var12 + 1][var13 - 1] = var19;
         }

         if (var12 > 0 && var13 < 103 && this.cn[var12 - 1][var13 + 1] == 0 && (var18[var12 - 1][var13 + 1] & 19398968) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
            this.hL[var20] = var12 - 1;
            this.hM[var20] = var13 + 1;
            var20 = (var20 + 1) % var17;
            this.cn[var12 - 1][var13 + 1] = 6;
            this.bl[var12 - 1][var13 + 1] = var19;
         }

         if (var12 < 103 && var13 < 103 && this.cn[var12 + 1][var13 + 1] == 0 && (var18[var12 + 1][var13 + 1] & 19399136) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
            this.hL[var20] = var12 + 1;
            this.hM[var20] = var13 + 1;
            var20 = (var20 + 1) % var17;
            this.cn[var12 + 1][var13 + 1] = 12;
            this.bl[var12 + 1][var13 + 1] = var19;
         }
      }

      this.ht = 0;
      if (!var16) {
         if (var10) {
            var19 = 100;

            for(var2 = 1; var2 < 2; ++var2) {
               for(var3 = var11 - var2; var3 <= var11 + var2; ++var3) {
                  for(var4 = var8 - var2; var4 <= var8 + var2; ++var4) {
                     if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && this.bl[var3][var4] < var19) {
                        var19 = this.bl[var3][var4];
                        var12 = var3;
                        var13 = var4;
                        this.ht = 1;
                        var16 = true;
                     }
                  }
               }

               if (var16) {
                  break;
               }
            }
         }

         if (!var16) {
            return false;
         }
      }

      byte var21 = 0;
      this.hL[0] = var12;
      var15 = var21 + 1;
      this.hM[0] = var13;

      for(var2 = var19 = this.cn[var12][var13]; var12 != var9 || var13 != var5; var2 = this.cn[var12][var13]) {
         if (var2 != var19) {
            var19 = var2;
            this.hL[var15] = var12;
            this.hM[var15++] = var13;
         }

         if ((var2 & 2) != 0) {
            ++var12;
         } else if ((var2 & 8) != 0) {
            --var12;
         }

         if ((var2 & 1) != 0) {
            ++var13;
         } else if ((var2 & 4) != 0) {
            --var13;
         }
      }

      if (var15 <= 0) {
         if (var1 != 1) {
            return true;
         } else {
            return false;
         }
      } else {
         var2 = var15;
         if (var15 > 25) {
            var2 = 25;
         }

         --var15;
         var3 = this.hL[var15];
         var4 = this.hM[var15];
         if ((hS += var2) >= 92) {
            this.gy.writeOpCode(36);
            this.gy.f(0);
            hS = 0;
         }

         if (var1 == 0) {
        	 //Main walk
            this.gy.writeOpCode(164);
            System.out.println(var2 + var2 + 3);
            this.gy.b(var2 + var2 + 3);
         }

         if (var1 == 1) {
        	 //Minimap walk
            this.gy.writeOpCode(248);
            this.gy.b(var2 + var2 + 3 + 14);
         }

         if (var1 == 2) {
        	 //Other walk
            this.gy.writeOpCode(98);
            this.gy.b(var2 + var2 + 3);
         }

         this.gy.n(var3 + this.eg);
         this.hq = this.hL[0];
         this.hr = this.hM[0];

         for(var1 = 1; var1 < var2; ++var1) {
            --var15;
            this.gy.b(this.hL[var15] - var3);
            this.gy.b(this.hM[var15] - var4);
         }

         this.gy.l(var4 + this.eh);
         this.gy.j(super.az[5] != 1 ? 0 : 1);
         return true;
      }
   }

   private void b(I_1 var1) {
      for(int var2 = 0; var2 < this.cg; ++var2) {
         int var3 = this.ch[var2];
         Npc var7 = this.bs[var3];
         int var4;
         int var5;
         int var6;
         if (((var4 = var1.e()) & 16) != 0) {
            if ((var5 = var1.w()) == 65535) {
               var5 = -1;
            }

            var6 = var1.e();
            if (var5 == var7.y && var5 != -1) {
               if ((var5 = uwotm8.Animation.a[var5].n) == 1) {
                  var7.z = 0;
                  var7.A = 0;
                  var7.B = var6;
                  var7.C = 0;
               }

               if (var5 == 2) {
                  var7.C = 0;
               }
            } else if (var5 == -1 || var7.y == -1 || uwotm8.Animation.a[var5].h >= uwotm8.Animation.a[var7.y].h) {
               var7.y = var5;
               var7.z = 0;
               var7.A = 0;
               var7.B = var6;
               var7.C = 0;
               var7.N = var7.x;
            }
         }

         if ((var4 & 8) != 0) {
            var5 = var1.s();
            var6 = var1.t();
            var7.a(var6, var5, R);
            var7.E = R + 300;
            var7.F = var1.s();
            var7.G = var1.e();
         }

         if ((var4 & 128) != 0) {
            var7.s = var1.g();
            var5 = var1.j();
            var7.w = var5 >> 16;
            var7.v = R + (var5 & '\uffff');
            var7.t = 0;
            var7.u = 0;
            if (var7.v > R) {
               var7.t = -1;
            }

            if (var7.s == 65535) {
               var7.s = -1;
            }
         }

         if ((var4 & 32) != 0) {
            var7.c = var1.g();
            if (var7.c == 65535) {
               var7.c = -1;
            }
         }

         if ((var4 & 1) != 0) {
            var7.g = var1.l();
            var7.H = 100;
         }

         if ((var4 & 64) != 0) {
            var5 = var1.t();
            var6 = var1.u();
            var7.a(var6, var5, R);
            var7.E = R + 300;
            var7.F = var1.u();
            var7.G = var1.t();
         }

         if ((var4 & 2) != 0) {
            var7.ad = uwotm8.ActorDefinition.a(var1.y());
            var7.L = var7.ad.i;
            var7.e = var7.ad.m;
            var7.Z = var7.ad.h;
            var7.aa = var7.ad.d;
            var7.ab = var7.ad.o;
            var7.ac = var7.ad.c;
            var7.j = var7.ad.k;
         }

         if ((var4 & 4) != 0) {
            var7.J = var1.w();
            var7.K = var1.w();
         }
      }

   }

   private void a(ActorDefinition var1, int var2, int var3, int var4) {
      if (this.N < 400) {
         if (var1.r != null) {
            var1 = var1.b();
         }

         if (var1 != null) {
            if (var1.p) {
               String var5 = var1.f;
               if (var1.e != 0) {
                  var5 = var5 + g(L.ak, var1.e) + " (level-" + var1.e + ")";
               }

               if (this.hN == 1) {
                  this.X[this.N] = "Use " + this.hR + " with @yel@" + var5;
                  this.J[this.N] = 582;
                  this.ff[this.N] = var2;
                  this.fd[this.N] = var4;
                  this.fe[this.N] = var3;
                  ++this.N;
               } else {
                  if (this.fN == 1) {
                     if ((this.fP & 2) == 2) {
                        this.X[this.N] = this.fQ + " @yel@" + var5;
                        this.J[this.N] = 413;
                        this.ff[this.N] = var2;
                        this.fd[this.N] = var4;
                        this.fe[this.N] = var3;
                        ++this.N;
                        return;
                     }
                  } else {
                     int var6;
                     if (var1.g != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if (var1.g[var6] != null && !var1.g[var6].equalsIgnoreCase("attack")) {
                              this.X[this.N] = var1.g[var6] + " @yel@" + var5;
                              if (var6 == 0) {
                                 this.J[this.N] = 20;
                              }

                              if (var6 == 1) {
                                 this.J[this.N] = 412;
                              }

                              if (var6 == 2) {
                                 this.J[this.N] = 225;
                              }

                              if (var6 == 3) {
                                 this.J[this.N] = 965;
                              }

                              if (var6 == 4) {
                                 this.J[this.N] = 478;
                              }

                              this.ff[this.N] = var2;
                              this.fd[this.N] = var4;
                              this.fe[this.N] = var3;
                              ++this.N;
                           }
                        }
                     }

                     if (var1.g != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if (var1.g[var6] != null && var1.g[var6].equalsIgnoreCase("attack")) {
                              short var7 = 0;
                              if (var1.e > L.ak) {
                                 var7 = 2000;
                              }

                              this.X[this.N] = var1.g[var6] + " @yel@" + var5;
                              if (var6 == 0) {
                                 this.J[this.N] = var7 + 20;
                              }

                              if (var6 == 1) {
                                 this.J[this.N] = var7 + 412;
                              }

                              if (var6 == 2) {
                                 this.J[this.N] = var7 + 225;
                              }

                              if (var6 == 3) {
                                 this.J[this.N] = var7 + 965;
                              }

                              if (var6 == 4) {
                                 this.J[this.N] = var7 + 478;
                              }

                              this.ff[this.N] = var2;
                              this.fd[this.N] = var4;
                              this.fe[this.N] = var3;
                              ++this.N;
                           }
                        }
                     }

                     this.X[this.N] = this.bL < 2 ? "Examine @yel@".concat(String.valueOf(var5)) : "Examine @yel@" + var5 + " @gre@(@whi@" + var1.l + "@gre@)";
                     this.J[this.N] = 1025;
                     this.ff[this.N] = var2;
                     this.fd[this.N] = var4;
                     this.fe[this.N] = var3;
                     ++this.N;
                  }

               }
            }
         }
      }
   }

   private void a(int var1, int var2, y var3, int var4) {
      if (var3 != L) {
         if (this.N < 400) {
            String var5;
            if (var3.aA == 0) {
               var5 = var3.ai + g(L.ak, var3.ak) + " (level-" + var3.ak + ")";
            } else {
               var5 = var3.ai + " (skill-" + var3.aA + ")";
            }

            int var6;
            if (this.hN == 1) {
               this.X[this.N] = "Use " + this.hR + " with @whi@" + var5;
               this.J[this.N] = 491;
               this.ff[this.N] = var2;
               this.fd[this.N] = var1;
               this.fe[this.N] = var4;
               ++this.N;
            } else if (this.fN == 1) {
               if ((this.fP & 8) == 8) {
                  this.X[this.N] = this.fQ + " @whi@" + var5;
                  this.J[this.N] = 365;
                  this.ff[this.N] = var2;
                  this.fd[this.N] = var1;
                  this.fe[this.N] = var4;
                  ++this.N;
               }
            } else {
               for(var6 = 4; var6 >= 0; --var6) {
                  if (this.fI[var6] != null) {
                     this.X[this.N] = this.fI[var6] + " @whi@" + var5;
                     short var7 = 0;
                     if (this.fI[var6].equalsIgnoreCase("attack")) {
                        if (var3.ak > L.ak) {
                           var7 = 2000;
                        }

                        if (L.ah != 0 && var3.ah != 0) {
                           if (L.ah == var3.ah) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        }
                     } else if (this.fJ[var6]) {
                        var7 = 2000;
                     }

                     if (var6 == 0) {
                        this.J[this.N] = var7 + 561;
                     }

                     if (var6 == 1) {
                        this.J[this.N] = var7 + 779;
                     }

                     if (var6 == 2) {
                        this.J[this.N] = var7 + 27;
                     }

                     if (var6 == 3) {
                        this.J[this.N] = var7 + 577;
                     }

                     if (var6 == 4) {
                        this.J[this.N] = var7 + 729;
                     }

                     this.ff[this.N] = var2;
                     this.fd[this.N] = var1;
                     this.fe[this.N] = var4;
                     ++this.N;
                  }
               }
            }

            for(var6 = 0; var6 < this.N; ++var6) {
               if (this.J[var6] == 519) {
                  this.X[var6] = "Walk here @whi@".concat(String.valueOf(var5));
                  return;
               }
            }

         }
      }
   }

   private void a(aa var1) {
      int var2 = 0;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var1.f == 0) {
         var2 = this.cO.i(var1.e, var1.g, var1.h);
      }

      if (var1.f == 1) {
         var2 = this.cO.j(var1.e, var1.g, var1.h);
      }

      if (var1.f == 2) {
         var2 = this.cO.k(var1.e, var1.g, var1.h);
      }

      if (var1.f == 3) {
         var2 = this.cO.l(var1.e, var1.g, var1.h);
      }

      if (var2 != 0) {
         var5 = this.cO.c(var1.e, var1.g, var1.h, var2);
         var3 = var2 >> 14 & 32767;
         var4 = var5 & 31;
         var5 >>= 6;
      }

      var1.i = var3;
      var1.k = var4;
      var1.j = var5;
   }

   private void M_1() {
      if (!aW) {
         while(this.eA > 0) {
            try {
               I_1 var1 = uwotm8.aq.a(this.gZ[0], this.gD[0]);
               new ap(new ByteArrayInputStream(var1.a, 0, var1.b), this.hh[0]);
               if (System.currentTimeMillis() + (long)(var1.b / 22) > this.bS + (long)(this.bT / 22)) {
                  this.bT = var1.b;
                  this.bS = System.currentTimeMillis();
               }
            } catch (Exception var2) {
               var2.printStackTrace();
            }

            --this.eA;

            for(int var3 = 0; var3 < this.eA; ++var3) {
               this.gD[var3] = this.gD[var3 + 1];
               this.gZ[var3] = this.gZ[var3 + 1];
               this.hh[var3] = this.hh[var3 + 1];
               this.hi[var3] = this.hi[var3 + 1];
            }
         }

         if (this.hp > 0) {
            this.hp -= 20;
            if (this.hp < 0) {
               this.hp = 0;
            }

            if (this.hp == 0 && fW) {
               this.gO = this.cY;
               this.gP = true;
               this.E.a(2, this.gO);
            }
         }

      }
   }

   public final void h() {
      this.a(20, (String)"Starting up");

      try {
         (new CacheUpdater(this)).c();
         Client var1 = this;
         String var2 = "http://vidyascape.org/files/client/clientVersion.dat";
         BufferedReader var25 = new BufferedReader(new InputStreamReader((new URL(var2)).openStream()));

         try {
            String var3;
            if ((var3 = var25.readLine()) != null) {
               var1.aV = !var3.equalsIgnoreCase("7.2.0");
            }

            var25.close();
         } catch (IOException var15) {
            System.out.println("problem reading remote client version");
            var25.close();
         }

         uwotm8.Settings.b();
         G = uwotm8.Settings.h;
      } catch (Exception var16) {
         ;
      }

      boolean var10000 = uwotm8.al.d;
      int var23;
      if (uwotm8.al.b != null) {
         for(var23 = 0; var23 < 6; ++var23) {
            this.z[var23] = new c(uwotm8.al.b, uwotm8.al.c[var23], var23 + 1);
         }
      }

      try {
         this.ev = this.a(1, "title screen", "title", this.fc[1], 25);
         this.af = new o(false, "p11_full", this.ev);
         this.hz = new o(false, "p12_full", this.ev);
         this.hA = new o(false, "b12_full", this.ev);
         this.hB = new o(true, "q8_full", this.ev);
         this.hC = new o(true, "fancy_m", this.ev);
         this.hD = new o(true, "fancy_l", this.ev);
         this.hE = new o(true, "gravestone", this.ev);
         this.ag = new l(false, "p11_full", this.ev);
         this.ah = new l(false, "p12_full", this.ev);
         this.hF = new l(false, "b12_full", this.ev);
         this.hG = new l(true, "q8_full", this.ev);
         this.hH = new l(true, "fancy_m", this.ev);
         this.hI = new l(true, "fancy_l", this.ev);
         this.hJ = new l(true, "gravestone", this.ev);
         G_1 var24 = this.a(2, "config", "config", this.fc[2], 30);
         G_1 var27 = this.a(3, "interface", "interface", this.fc[3], 35);
         G_1 var29 = this.a(4, "2d graphics", "media", this.fc[4], 40);
         G_1 var4 = this.a(6, "textures", "textures", this.fc[6], 45);
         G_1 var5 = this.a(7, "chat system", "wordenc", this.fc[7], 50);
         G_1 var6 = this.a(8, "sound effects", "sounds", this.fc[8], 55);
         this.ho = new byte[4][104][104];
         this.gH = new int[4][105][105];
         this.cO = new W_1(this.gH);

         int var7;
         for(var7 = 0; var7 < 4; ++var7) {
            this.gU[var7] = new CollisionMap();
         }

         this.hs = new Sprite(512, 512);
         G_1 var33 = this.a(5, "update list", "versionlist", this.fc[5], 60);
         this.a(60, (String)"Connecting to update server");
         this.E = new af_1();
         this.E.a(var33, this);
         uwotm8.D_1.a(40000, this.E);
         if (O && !aW) {
            this.gO = 0;

            try {
               this.gO = Integer.parseInt(this.getParameter("music"));
            } catch (Exception var14) {
               ;
            }

            this.gP = true;
            this.E.a(2, this.gO);

            while(this.E.b() > 0) {
               this.C();

               try {
                  Thread.sleep(100L);
               } catch (Exception var13) {
                  ;
               }

               if (this.E.a > 3) {
                  return;
               }
            }
         }

         this.a(80, (String)"Unpacking media");

         try {
            aB_1.a();
         } catch (Exception var12) {
            System.out.println("Unable to load sprite cache.");
         }

         this.bf = aB_1.a("login", 0);
         this.bg = new Sprite("background");
         this.r = new Sprite("mascot_inv");
         this.s = new Sprite("mascot_chat");
         this.dF = new Sprite(var29, "overlay_multiway", 0);
         this.gB = new k(var29, "mapback", 0);

         for(var7 = 0; var7 <= 17; ++var7) {
            this.w[var7] = new Sprite(var29, "staticons", var7);
         }

         for(var7 = 0; var7 <= 5; ++var7) {
            this.w[var7 + 18] = new Sprite(var29, "staticons2", var7);
         }

         this.fE = new Sprite(var29, "compass", 0);
         this.dE = new Sprite(var29, "mapedge", 0);
         this.dE.a();

         try {
            for(var7 = 0; var7 < 100; ++var7) {
               this.ez[var7] = new k(var29, "mapscene", var7);
            }
         } catch (Exception var21) {
            ;
         }

         try {
            for(var7 = 0; var7 < 100; ++var7) {
               this.ef[var7] = new Sprite(var29, "mapfunction", var7);
            }
         } catch (Exception var20) {
            ;
         }

         try {
            for(var7 = 0; var7 < 20; ++var7) {
               this.du[var7] = new Sprite(var29, "hitmarks", var7);
            }
         } catch (Exception var19) {
            ;
         }

         try {
            for(var7 = 0; var7 < 6; ++var7) {
               this.fj[var7] = new Sprite(var29, "headicons_hint", var7);
            }
         } catch (Exception var18) {
            ;
         }

         try {
            for(var7 = 0; var7 < 8; ++var7) {
               this.fh[var7] = new Sprite(var29, "headicons_prayer", var7);
            }

            for(var7 = 0; var7 < 3; ++var7) {
               this.fi[var7] = new Sprite(var29, "headicons_pk", var7);
            }
         } catch (Exception var17) {
            ;
         }

         this.bN = new Sprite(var29, "mapmarker", 0);
         this.bO = new Sprite(var29, "mapmarker", 1);

         for(var7 = 0; var7 < 8; ++var7) {
            this.fV[var7] = new Sprite(var29, "cross", var7);
         }

         this.eL = new Sprite(var29, "mapdots", 0);
         this.fg = new Sprite(var29, "Overlay_multiway", 0);
         this.eM = new Sprite(var29, "mapdots", 1);
         this.eN = new Sprite(var29, "mapdots", 2);
         this.eO = new Sprite(var29, "mapdots", 3);
         this.eP = new Sprite(var29, "mapdots", 4);
         this.eQ = aB_1.a("clanchat", 7);
         this.dY = new Sprite(var29, "scrollbar", 2);
         this.dZ = new Sprite(var29, "scrollbar", 3);
         this.ea = new k(var29, "scrollbar", 0);
         this.eb = new k(var29, "scrollbar", 1);

         for(var7 = 0; var7 < 2; ++var7) {
            this.gK[var7] = new k(var29, "mod_icons", var7);
         }

         Sprite var36 = new Sprite(var29, "screenframe", 0);
         this.bh = new q(var36.b, var36.c);
         var36.b(0, 0);
         var36 = new Sprite(var29, "screenframe", 1);
         this.bi = new q(var36.b, var36.c);
         var36.b(0, 0);
         var7 = (int)(Math.random() * 21.0D) - 10;
         int var8 = (int)(Math.random() * 21.0D) - 10;
         int var9 = (int)(Math.random() * 21.0D) - 10;
         int var10 = (int)(Math.random() * 41.0D) - 20;

         for(int var11 = 0; var11 < 100; ++var11) {
            if (this.ef[var11] != null) {
               this.ef[var11].b(var7 + var10, var8 + var10, var9 + var10);
            }

            if (this.ez[var11] != null) {
               this.ez[var11].a(var7 + var10, var8 + var10, var9 + var10);
            }
         }

         this.a(83, (String)"Unpacking textures");
         uwotm8.r.a(var4);
         uwotm8.r.a(0.8D);
         uwotm8.r.d();
         this.a(86, (String)"Unpacking config");
         uwotm8.Animation.a(var24);
         uwotm8.j.a(var24);
         uwotm8.X_1.a(var24);
         uwotm8.Y_1.a(var24);
         uwotm8.i.a(var24);
         uwotm8.ActorDefinition.a(var24);
         uwotm8.C_1.a(var24);
         uwotm8.g.a(var24);
         uwotm8.VariableParameter.a(var24);
         uwotm8.VariableBits.a(var24);
         uwotm8.i.q = db;
         this.a(90, (String)"Unpacking sounds");
         byte[] var34 = var6.b("sounds.dat");
         uwotm8.aq.a(new I_1(var34));
         this.a(95, (String)"Unpacking interfaces");
         o[] var35 = new o[]{this.af, this.hz, this.hA, this.hB, this.hC, this.hD, this.hE};
         l[] var26 = new l[]{this.ag, this.ah, this.hF, this.hG, this.hH, this.hI, this.hJ};
         uwotm8.m.a(var27, this.z[5], var29, var35, var26);
         this.a(100, (String)"Preparing game engine");

         int var28;
         int var30;
         int var32;
         for(var23 = 0; var23 < 33; ++var23) {
            var28 = 999;
            var30 = 0;

            for(var32 = 0; var32 < 34; ++var32) {
               if (this.gB.a[var32 + var23 * this.gB.c] == 0) {
                  if (var28 == 999) {
                     var28 = var32;
                  }
               } else if (var28 != 999) {
                  var30 = var32;
                  break;
               }
            }

            this.y[var23] = var28;
            this.D[var23] = var30 - var28;
         }

         for(var23 = 5; var23 < 156; ++var23) {
            var28 = 999;
            var30 = 0;

            for(var32 = 25; var32 < 172; ++var32) {
               if (this.gB.a[var32 + var23 * this.gB.c] != 0 || var32 <= 34 && var23 <= 34) {
                  if (var28 != 999) {
                     var30 = var32;
                     break;
                  }
               } else if (var28 == 999) {
                  var28 = var32;
               }
            }

            this.eu[var23 - 5] = var28 - 25;
            this.gT[var23 - 5] = var30 - var28;
         }

         uwotm8.r.a(765, 503);
         int[] var37 = uwotm8.r.t;
         uwotm8.r.a(516, 165);
         gq = uwotm8.r.t;
         uwotm8.r.a(250, 335);
         gr = uwotm8.r.t;
         uwotm8.r.a(512, 334);
         gs = uwotm8.r.t;
         int[] var31 = new int[9];

         for(var28 = 0; var28 < 9; ++var28) {
            var30 = 128 + (var28 << 5) + 15;
            var32 = 600 + var30 * 3;
            var30 = uwotm8.r.r[var30];
            var31[var28] = var32 * var30 >> 16;
         }

         l();
         uwotm8.as.a(var5);
         this.bV = new at(this);
         this.a((Runnable)this.bV, 10);
         uwotm8.B_1.a = this;
         uwotm8.j.o = this;
         uwotm8.ActorDefinition.n = this;
         uwotm8.aF.a();
         t = uwotm8.aF.c();
      } catch (Exception var22) {
         var22.printStackTrace();
         uwotm8.al.b("loaderror " + this.es + " " + this.eR);
         this.cy = true;
      }
   }

   private void b(I_1 var1, int var2) {
      int var3;
      y var4;
      int var5;
      int var6;
      for(; var1.c + 10 < var2 << 3 && (var3 = var1.i(11)) != 2047; var4.a(L.a[0] + var6, L.b[0] + var5, var3 == 1)) {
         if (this.cd[var3] == null) {
            this.cd[var3] = new y();
            if (this.ci[var3] != null) {
               this.cd[var3].a(this.ci[var3]);
            }
         }

         this.cf[this.ce++] = var3;
         (var4 = this.cd[var3]).I = R;
         if (var1.i(1) == 1) {
            this.ch[this.cg++] = var3;
         }

         var3 = var1.i(1);
         if ((var5 = var1.i(5)) > 15) {
            var5 -= 32;
         }

         if ((var6 = var1.i(5)) > 15) {
            var6 -= 32;
         }
      }

      var1.o();
   }

   private static String p(int var0) {
      return var0 < 999999999 ? String.valueOf(var0) : "*";
   }

   private String a(m var1, String var2) {
      if (var2.indexOf("%") != -1) {
         int var3;
         while((var3 = var2.indexOf("%1")) != -1) {
            var2 = var2.substring(0, var3) + p(this.a((m)var1, 0)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%2")) != -1) {
            var2 = var2.substring(0, var3) + p(this.a((m)var1, 1)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%3")) != -1) {
            var2 = var2.substring(0, var3) + p(this.a((m)var1, 2)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%4")) != -1) {
            var2 = var2.substring(0, var3) + p(this.a((m)var1, 3)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%5")) != -1) {
            var2 = var2.substring(0, var3) + p(this.a((m)var1, 4)) + var2.substring(var3 + 2);
         }

         return var2;
      } else {
         return var2;
      }
   }

   public URL getCodeBase() {
      try {
         return new URL(hT + ":80");
      } catch (Exception var1) {
         return null;
      }
   }

   private void N() {
      for(int var1 = 0; var1 < this.bt; ++var1) {
         int var2 = this.bu[var1];
         Npc var3;
         if ((var3 = this.bs[var2]) != null) {
            this.a((u)var3);
         }
      }

   }

   private void a(u var1) {
      if (var1.V < 128 || var1.W < 128 || var1.V >= 13184 || var1.W >= 13184) {
         var1.y = -1;
         var1.s = -1;
         var1.S = 0;
         var1.T = 0;
         var1.V = (var1.a[0] << 7) + (var1.L << 6);
         var1.W = (var1.b[0] << 7) + (var1.L << 6);
         var1.b();
      }

      if (var1 == L && (var1.V < 1536 || var1.W < 1536 || var1.V >= 11776 || var1.W >= 11776)) {
         var1.y = -1;
         var1.s = -1;
         var1.S = 0;
         var1.T = 0;
         var1.V = (var1.a[0] << 7) + (var1.L << 6);
         var1.W = (var1.b[0] << 7) + (var1.L << 6);
         var1.b();
      }

      if (var1.S > R) {
         b(var1);
      } else if (var1.T >= R) {
         c(var1);
      } else {
         d(var1);
      }
      try
      {
    	  this.e(var1); 
      }
      catch (Exception ex)
      {
    	  
      }
      f(var1);
   }

   private static void b(u var0) {
      int var1 = var0.S - R;
      int var2 = (var0.O << 7) + (var0.L << 6);
      int var3 = (var0.Q << 7) + (var0.L << 6);
      var0.V += (var2 - var0.V) / var1;
      var0.W += (var3 - var0.W) / var1;
      var0.d = 0;
      if (var0.U == 0) {
         var0.i = 1024;
      }

      if (var0.U == 1) {
         var0.i = 1536;
      }

      if (var0.U == 2) {
         var0.i = 0;
      }

      if (var0.U == 3) {
         var0.i = 512;
      }

   }

   private static void c(u var0) {
      if (var0.T == R || var0.y == -1 || var0.B != 0 || var0.A + 1 > uwotm8.Animation.a[var0.y].a(var0.z)) {
         int var1 = var0.T - var0.S;
         int var2 = R - var0.S;
         int var3 = (var0.O << 7) + (var0.L << 6);
         int var4 = (var0.Q << 7) + (var0.L << 6);
         int var5 = (var0.P << 7) + (var0.L << 6);
         int var6 = (var0.R << 7) + (var0.L << 6);
         var0.V = (var3 * (var1 - var2) + var5 * var2) / var1;
         var0.W = (var4 * (var1 - var2) + var6 * var2) / var1;
      }

      var0.d = 0;
      if (var0.U == 0) {
         var0.i = 1024;
      }

      if (var0.U == 1) {
         var0.i = 1536;
      }

      if (var0.U == 2) {
         var0.i = 0;
      }

      if (var0.U == 3) {
         var0.i = 512;
      }

      var0.X = var0.i;
   }

   private static void d(u var0) {
      var0.p = var0.j;
      if (var0.x == 0) {
         var0.d = 0;
      } else {
         if (var0.y != -1 && var0.B == 0) {
            Animation var1 = uwotm8.Animation.a[var0.y];
            if (var0.N > 0 && var1.l == 0) {
               ++var0.d;
               return;
            }

            if (var0.N <= 0 && var1.m == 0) {
               ++var0.d;
               return;
            }
         }

         int var7 = var0.V;
         int var2 = var0.W;
         int var3 = (var0.a[var0.x - 1] << 7) + (var0.L << 6);
         int var4 = (var0.b[var0.x - 1] << 7) + (var0.L << 6);
         if (var3 - var7 <= 256 && var3 - var7 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
            if (var7 < var3) {
               if (var2 < var4) {
                  var0.i = 1280;
               } else if (var2 > var4) {
                  var0.i = 1792;
               } else {
                  var0.i = 1536;
               }
            } else if (var7 > var3) {
               if (var2 < var4) {
                  var0.i = 768;
               } else if (var2 > var4) {
                  var0.i = 256;
               } else {
                  var0.i = 512;
               }
            } else if (var2 < var4) {
               var0.i = 1024;
            } else {
               var0.i = 0;
            }

            int var5;
            if ((var5 = var0.i - var0.X & 2047) > 1024) {
               var5 -= 2048;
            }

            int var6 = var0.aa;
            if (var5 >= -256 && var5 <= 256) {
               var6 = var0.Z;
            } else if (var5 >= 256 && var5 < 768) {
               var6 = var0.ac;
            } else if (var5 >= -768 && var5 <= -256) {
               var6 = var0.ab;
            }

            if (var6 == -1) {
               var6 = var0.Z;
            }

            var0.p = var6;
            var5 = 4;
            if (var0.X != var0.i && var0.c == -1 && var0.e != 0) {
               var5 = 2;
            }

            if (var0.x > 2) {
               var5 = 6;
            }

            if (var0.x > 3) {
               var5 = 8;
            }

            if (var0.d > 0 && var0.x > 1) {
               var5 = 8;
               --var0.d;
            }

            if (var0.Y[var0.x - 1]) {
               var5 <<= 1;
            }

            if (var5 >= 8 && var0.p == var0.Z && var0.f != -1) {
               var0.p = var0.f;
            }

            if (var7 < var3) {
               var0.V += var5;
               if (var0.V > var3) {
                  var0.V = var3;
               }
            } else if (var7 > var3) {
               var0.V -= var5;
               if (var0.V < var3) {
                  var0.V = var3;
               }
            }

            if (var2 < var4) {
               var0.W += var5;
               if (var0.W > var4) {
                  var0.W = var4;
               }
            } else if (var2 > var4) {
               var0.W -= var5;
               if (var0.W < var4) {
                  var0.W = var4;
               }
            }

            if (var0.V == var3 && var0.W == var4) {
               --var0.x;
               if (var0.N > 0) {
                  --var0.N;
               }
            }

         } else {
            var0.V = var3;
            var0.W = var4;
         }
      }
   }

   private void e(u var1) {
      if (var1.e != 0) {
         Npc var2;
         int var3;
         int var4;
         if (var1.c != -1 && var1.c < 32768 && (var2 = this.bs[var1.c]) != null) {
            var3 = var1.V - var2.V;
            var4 = var1.W - var2.W;
            if (var3 != 0 || var4 != 0) {
               var1.i = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
            }
         }

         if (var1.c >= 32768) {
            if ((var4 = var1.c - 'è') == this.bX) {
               var4 = 2047;
            }

            y var5;
            if ((var5 = this.cd[var4]) != null) {
            	try
            	{
            		var4 = var1.V - var5.V;
                    var3 = var1.W - var5.W;
                    if (var4 != 0 || var3 != 0) {
                       var1.i = (int)(Math.atan2((double)var4, (double)var3) * 325.949D) & 2047;
                    }
            	}
               catch (Exception ex)
            	{
            	   
            	}
            }
         }

         if ((var1.J != 0 || var1.K != 0) && (var1.x == 0 || var1.d > 0)) {
            var4 = var1.V - (var1.J - this.eg - this.eg << 6);
            var3 = var1.W - (var1.K - this.eh - this.eh << 6);
            if (var4 != 0 || var3 != 0) {
               var1.i = (int)(Math.atan2((double)var4, (double)var3) * 325.949D) & 2047;
            }

            var1.J = 0;
            var1.K = 0;
         }

         if ((var4 = var1.i - var1.X & 2047) != 0) {
            if (var4 >= var1.e && var4 <= 2048 - var1.e) {
               if (var4 > 1024) {
                  var1.X -= var1.e;
               } else {
                  var1.X += var1.e;
               }
            } else {
               var1.X = var1.i;
            }

            var1.X &= 2047;
            if (var1.p == var1.j && var1.X != var1.i) {
               if (var1.k != -1) {
                  var1.p = var1.k;
                  return;
               }

               var1.p = var1.Z;
            }
         }

      }
   }

   private static void f(u var0) {
      var0.M = false;
      Animation var1;
      if (var0.p != -1) {
         var1 = uwotm8.Animation.a[var0.p];
         ++var0.r;
         if (var0.q < var1.b && var0.r > var1.a(var0.q)) {
            var0.r = 0;
            ++var0.q;
         }

         if (var0.q >= var1.b) {
            var0.r = 0;
            var0.q = 0;
         }
      }

      if (var0.s != -1 && R >= var0.v) {
         if (var0.t < 0) {
            var0.t = 0;
         }

         var1 = uwotm8.g.a[var0.s].b;
         ++var0.u;

         while(var0.t < var1.b && var0.u > var1.a(var0.t)) {
            var0.u -= var1.a(var0.t);
            ++var0.t;
         }

         if (var0.t >= var1.b && (var0.t < 0 || var0.t >= var1.b)) {
            var0.s = -1;
         }
      }

      if (var0.y != -1 && var0.B <= 1 && uwotm8.Animation.a[var0.y].l == 1 && var0.N > 0 && var0.S <= R && var0.T < R) {
         var0.B = 1;
      } else {
         if (var0.y != -1 && var0.B == 0) {
            var1 = uwotm8.Animation.a[var0.y];
            ++var0.A;

            while(var0.z < var1.b && var0.A > var1.a(var0.z)) {
               var0.A -= var1.a(var0.z);
               ++var0.z;
            }

            if (var0.z >= var1.b) {
               var0.z -= var1.e;
               ++var0.C;
               if (var0.C >= var1.k) {
                  var0.y = -1;
               }

               if (var0.z < 0 || var0.z >= var1.b) {
                  var0.y = -1;
               }
            }

            var0.M = var1.g;
         }

         if (var0.B > 0) {
            --var0.B;
         }

      }
   }

   private void O() {
      if (this.hm) {
         this.hm = false;
         if (a == com.runescape.a.a) {
            this.bi.a(0, super.ao, 0);
            this.bh.a(4, super.ao, 0);
         }

         ab = true;
         P = true;
         K = true;
         if (this.dX != 2 && a == com.runescape.a.a) {
            gg.a(a == com.runescape.a.a ? 4 : 0, super.ao, a == com.runescape.a.a ? 4 : 0);
            this.gf.a(0, super.ao, 516);
         }
      }

      int var3;
      int var4;
      int var5;
      if (this.dX == 2) {
         Client var1 = this;

         try {
            ++var1.hu;
            var1.b(true);
            var1.a(true);
            var1.b(false);
            var1.a(false);
            Client var2 = var1;

            int var26;
            for(z var8 = (z)var1.dO.b(); var8 != null; var8 = (z)var2.dO.d()) {
               if (var8.i == var2.cu && R <= var8.b) {
                  if (R >= var8.a) {
                     Npc var9;
                     if (var8.g > 0 && (var9 = var2.bs[var8.g - 1]) != null && var9.V >= 0 && var9.V < 13312 && var9.W >= 0 && var9.W < 13312) {
                        var8.a(R, var9.W, var2.b(var8.i, var9.W, var9.V) - var8.c, var9.V);
                     }

                     if (var8.g < 0) {
                        y var10;
                        if ((var26 = -var8.g - 1) == var2.bX) {
                           var10 = L;
                        } else {
                           var10 = var2.cd[var26];
                        }

                        if (var10 != null && var10.V >= 0 && var10.V < 13312 && var10.W >= 0 && var10.W < 13312) {
                           var8.a(R, var10.W, var2.b(var8.i, var10.W, var10.V) - var8.c, var10.V);
                        }
                     }

                     var8.a(var2.cN);
                     var2.cO.a(var2.cu, var8.h, (int)var8.f, -1, (int)var8.e, 60, (int)var8.d, var8, false);
                  }
               } else {
                  var8.D();
               }
            }

            var2 = var1;

            for(t var24 = (t)var1.ex.b(); var24 != null; var24 = (t)var2.ex.d()) {
               if (var24.a == var2.cu && !var24.f) {
                  if (R >= var24.e) {
                     var24.a(var2.cN);
                     if (var24.f) {
                        var24.D();
                     } else {
                        var2.cO.a(var24.a, 0, var24.d, -1, var24.c, 60, var24.b, var24, false);
                     }
                  }
               } else {
                  var24.D();
               }
            }

            int var11;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            int var22;
            int var25;
            int var27;
            if (!var1.gc) {
               var22 = var1.gu;
               if (var1.dq / 256 > var22) {
                  var22 = var1.dq / 256;
               }

               if (var1.bR[4] && var1.gC[4] + 128 > var22) {
                  var22 = var1.gC[4] + 128;
               }

               var3 = var1.V & 2047;
               int var10001 = G + var22 * (a == com.runescape.a.a ? var1.fb : 5);
               int var10003 = var1.dP;
               int var10004 = var1.b(var1.cu, L.W, L.V) - 50;
               var13 = var1.dQ;
               var11 = var10004;
               var27 = var10003;
               var25 = var10001;
               var14 = 2048 - var22 & 2047;
               var15 = 2048 - var3 & 2047;
               var16 = 0;
               int var17 = 0;
               var25 = var25;
               if (var14 != 0) {
                  var18 = uwotm8.D_1.D[var14];
                  var14 = uwotm8.D_1.E[var14];
                  var19 = 0 * var14 - var25 * var18 >> 16;
                  var25 = 0 * var18 + var25 * var14 >> 16;
                  var17 = var19;
               }

               if (var15 != 0) {
                  var18 = uwotm8.D_1.D[var15];
                  var14 = uwotm8.D_1.E[var15];
                  var19 = var25 * var18 + 0 * var14 >> 16;
                  var25 = var25 * var14 - 0 * var18 >> 16;
                  var16 = var19;
               }

               var1.bG = var27 - var16;
               var1.bH = var11 - var17;
               var1.bI = var13 - var25;
               var1.bJ = var22;
               var1.bK = var3;
            }

            int var12;
            int var10000;
            if (!var1.gc) {
               var2 = var1;
               if (!uwotm8.Settings.i) {
                  var10000 = var1.cu;
               } else {
                  var25 = 3;
                  if (var1.bJ < 310) {
                     var26 = var1.bG >> 7;
                     var27 = var1.bI >> 7;
                     var11 = L.V >> 7;
                     var12 = L.W >> 7;
                     if ((var1.ho[var1.cu][var26][var27] & 4) != 0) {
                        var25 = var1.cu;
                     }

                     if (var11 > var26) {
                        var13 = var11 - var26;
                     } else {
                        var13 = var26 - var11;
                     }

                     if (var12 > var27) {
                        var14 = var12 - var27;
                     } else {
                        var14 = var27 - var12;
                     }

                     if (var13 > var14) {
                        var15 = (var14 << 16) / var13;
                        var16 = 32768;

                        while(var26 != var11) {
                           if (var26 < var11) {
                              ++var26;
                           } else if (var26 > var11) {
                              --var26;
                           }

                           if ((var2.ho[var2.cu][var26][var27] & 4) != 0) {
                              var25 = var2.cu;
                           }

                           if ((var16 += var15) >= 65536) {
                              var16 -= 65536;
                              if (var27 < var12) {
                                 ++var27;
                              } else if (var27 > var12) {
                                 --var27;
                              }

                              if ((var2.ho[var2.cu][var26][var27] & 4) != 0) {
                                 var25 = var2.cu;
                              }
                           }
                        }
                     } else {
                        var15 = (var13 << 16) / var14;
                        var16 = 32768;

                        while(var27 != var12) {
                           if (var27 < var12) {
                              ++var27;
                           } else if (var27 > var12) {
                              --var27;
                           }

                           if ((var2.ho[var2.cu][var26][var27] & 4) != 0) {
                              var25 = var2.cu;
                           }

                           if ((var16 += var15) >= 65536) {
                              var16 -= 65536;
                              if (var26 < var11) {
                                 ++var26;
                              } else if (var26 > var11) {
                                 --var26;
                              }

                              if ((var2.ho[var2.cu][var26][var27] & 4) != 0) {
                                 var25 = var2.cu;
                              }
                           }
                        }
                     }
                  }

                  if ((var2.ho[var2.cu][L.V >> 7][L.W >> 7] & 4) != 0) {
                     var25 = var2.cu;
                  }

                  var10000 = var25;
               }

               var22 = var10000;
            } else {
               var22 = var1.gd ? var1.cu : (var1.b(var1.cu, var1.bI, var1.bG) - var1.bH < 800 && (var1.ho[var1.cu][var1.bG >> 7][var1.bI >> 7] & 4) != 0 ? var1.cu : 3);
            }

            var3 = var1.bG;
            var4 = var1.bH;
            var5 = var1.bI;
            int var6 = var1.bJ;
            int var7 = var1.bK;

            for(var25 = 0; var25 < 5; ++var25) {
               if (var1.bR[var25]) {
                  var26 = (int)(Math.random() * (double)((var1.bQ[var25] << 1) + 1) - (double)var1.bQ[var25] + Math.sin((double)var1.ed[var25] * ((double)var1.cz[var25] / 100.0D)) * (double)var1.gC[var25]);
                  if (var25 == 0) {
                     var1.bG += var26;
                  }

                  if (var25 == 1) {
                     var1.bH += var26;
                  }

                  if (var25 == 2) {
                     var1.bI += var26;
                  }

                  if (var25 == 3) {
                     var1.bK = var1.bK + var26 & 2047;
                  }

                  if (var25 == 4) {
                     var1.bJ += var26;
                     if (var1.bJ < 128) {
                        var1.bJ = 128;
                     }

                     if (var1.bJ > 383) {
                        var1.bJ = 383;
                     }
                  }
               }
            }

            var25 = uwotm8.r.w;
            uwotm8.D_1.y = true;
            uwotm8.D_1.B = 0;
            uwotm8.D_1.z = var1.au - 4;
            uwotm8.D_1.A = var1.av - 4;
            uwotm8.p.f();
            var1.cO.a(var1.bG, var1.bI, var1.bK, var1.bH, var22, var1.bJ);
            var1.cO.c();
            var1.v();
            if (var1.bF == 2) {
               var1.e((var1.cE - var1.eg << 7) + var1.cH, var1.cG << 1, (var1.cF - var1.eh << 7) + var1.cI);
               if (var1.dd >= 0 && R % 20 < 10) {
                  var1.fj[0].d(var1.dd - 12, var1.de - 28);
               }
            }

            k var28;
            byte[] var29;
            byte[] var32;
            if (uwotm8.r.v[17] >= var25) {
               var27 = (var28 = uwotm8.r.u[17]).c * var28.d - 1;
               var11 = var28.c * var1.cN << 1;
               var29 = var28.a;
               var32 = var1.co;

               for(var14 = 0; var14 <= var27; ++var14) {
                  var32[var14] = var29[var14 - var11 & var27];
               }

               var28.a = var32;
               var1.co = var29;
               uwotm8.r.b(17);
               if (++bE > 1235) {
                  bE = 0;
                  var1.gy.writeOpCode(226);
                  var1.gy.b(0);
                  var14 = var1.gy.b;
                  var1.gy.c(58722);
                  var1.gy.b(240);
                  var1.gy.c((int)(Math.random() * 65536.0D));
                  var1.gy.b((int)(Math.random() * 256.0D));
                  if ((int)(Math.random() * 2.0D) == 0) {
                     var1.gy.c(51825);
                  }

                  var1.gy.b((int)(Math.random() * 256.0D));
                  var1.gy.c((int)(Math.random() * 65536.0D));
                  var1.gy.c(7130);
                  var1.gy.c((int)(Math.random() * 65536.0D));
                  var1.gy.c(61657);
                  var1.gy.h(var1.gy.b - var14);
               }
            }

            if (uwotm8.r.v[24] >= var25) {
               var27 = (var28 = uwotm8.r.u[24]).c * var28.d - 1;
               var11 = var28.c * var1.cN << 1;
               var29 = var28.a;
               var32 = var1.co;

               for(var14 = 0; var14 <= var27; ++var14) {
                  var32[var14] = var29[var14 - var11 & var27];
               }

               var28.a = var32;
               var1.co = var29;
               uwotm8.r.b(24);
            }

            if (uwotm8.r.v[34] >= var25) {
               var27 = (var28 = uwotm8.r.u[34]).c * var28.d - 1;
               var11 = var28.c * var1.cN << 1;
               var29 = var28.a;
               var32 = var1.co;

               for(var14 = 0; var14 <= var27; ++var14) {
                  var32[var14] = var29[var14 - var11 & var27];
               }

               var28.a = var32;
               var1.co = var29;
               uwotm8.r.b(34);
            }

            int[] var39 = uwotm8.r.v;
            var27 = (var28 = uwotm8.r.u[40]).c * var28.d - 1;
            var11 = var28.c * var1.cN << 1;
            var29 = var28.a;
            var32 = var1.co;

            for(var14 = 0; var14 <= var27; ++var14) {
               var32[var14] = var29[var14 - var11 & var27];
            }

            var28.a = var32;
            var1.co = var29;
            uwotm8.r.b(40);
            if (var1.aO > 0 && a != com.runescape.a.a) {
               uwotm8.p.a(var1.aP, 0, c, d, var1.aO, 0);
            }

            if (var1.aK && var1.aL != -10) {
               if (!var1.aJ) {
                  if (var1.aN) {
                     var1.aL += 5;
                     if (var1.aL >= 255) {
                        var1.aL = 255;
                        var1.aJ = true;
                     }
                  } else {
                     var1.aL -= 5;
                     if (var1.aL <= 0) {
                        var1.aL = 0;
                        var1.aJ = true;
                     }
                  }
               }

               if (var1.aL > 0) {
                  uwotm8.p.a(var1.aM, 0, c, d, var1.aL, 0);
               }
            }

            uwotm8.aH_1.a();
            if (e) {
               Client var38 = var1;
               if (var1.gA != 0) {
                  o var34 = var1.hz;
                  var18 = 0;
                  if (!var1.fr.isEmpty()) {
                     ++var18;
                  }

                  if (var1.fq != 0) {
                     ++var18;
                  }

                  for(var14 = 0; var14 < 100; ++var14) {
                     if (var38.cL[var14] != null) {
                        var19 = var38.cJ[var14];
                        String var31 = var38.cK[var14];
                        var27 = var38.bc[var14];
                        byte var30 = 0;
                        if (var31 != null && var31.startsWith("@irn@")) {
                           var31 = var31.substring(5);
                           var30 = 4;
                        }

                        if ((var19 == 3 || var19 == 7) && (var19 == 7 || var38.u == 0 || var38.u == 1 && var38.e(var31))) {
                           var12 = 329 - var18 * 13;
                           if (a != com.runescape.a.a) {
                              var12 = d - 170 - var18 * 13;
                           }

                           var34.b(0, "From", var12, 4);
                           var34.b(65535, "From", var12 - 1, 4);
                           var13 = 4 + var34.a("From ");
                           if (var27 > 0) {
                              var13 += var38.a(var27, var13 + 1, var12 - 12);
                           }

                           if (var30 > 0) {
                              var13 += var38.a(var30, var13 + 1, var12 - 12);
                           }

                           var34.b(0, var31 + ": " + var38.cL[var14], var12, var13);
                           var34.b(65535, var31 + ": " + var38.cL[var14], var12 - 1, var13);
                           ++var18;
                           if (var18 >= 5) {
                              break;
                           }
                        }

                        if (var19 == 5 && var38.u < 2) {
                           var12 = 329 - var18 * 13;
                           if (a != com.runescape.a.a) {
                              var12 = d - 170 - var18 * 13;
                           }

                           var34.b(0, var38.cL[var14], var12, 4);
                           var34.b(65535, var38.cL[var14], var12 - 1, 4);
                           ++var18;
                           if (var18 >= 5) {
                              break;
                           }
                        }

                        if (var19 == 6 && var38.u < 2) {
                           var12 = 329 - var18 * 13;
                           if (a != com.runescape.a.a) {
                              var12 = d - 170 - var18 * 13;
                           }

                           var34.b(0, "To " + var31 + ": " + var38.cL[var14], var12, 4);
                           var34.b(65535, "To " + var31 + ": " + var38.cL[var14], var12 - 1, 4);
                           ++var18;
                           if (var18 >= 5) {
                              break;
                           }
                        }
                     }
                  }
               }
            }

            if (var1.ct == 1) {
               var25 = a == com.runescape.a.a ? 4 : 0;
               var1.fV[var1.cs / 100].d(var1.cq - 8 - var25, var1.cr - 8 - var25);
            }

            if (var1.ct == 2) {
               var25 = a == com.runescape.a.a ? 4 : 0;
               var1.fV[4 + var1.cs / 100].d(var1.cq - 8 - var25, var1.cr - 8 - var25);
            }

            if (var1.ew == 1) {
               var25 = var1.dT == 4 ? c - 90 : c - 120;
               var1.dF.d(a == com.runescape.a.a ? 472 : var25, a == com.runescape.a.a ? 296 : 174);
            }

            if (var1.dT != -1) {
               var1.i(var1.cN, var1.dT);
               if (var1.dT == 4 && a != com.runescape.a.a) {
                  var1.a(c - 512 - 80, -80, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if (var1.dT == 5 && a != com.runescape.a.a) {
                  var1.a(c - 512 - 80, -120, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if ((var1.dT == 293 || var1.dT == 484 || var1.dT == 485) && a != com.runescape.a.a) {
                  var1.a(0, 0, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if ((var1.dT == 119 || var1.dT == 300) && a != com.runescape.a.a) {
                  var1.a(c / 2 - 256 - 10, 150, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if (var1.dT == 156 && a != com.runescape.a.a) {
                  var1.a(c / 2 - 256 - 40, d / 2 - 167 - 50, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if ((var1.dT == 423 || var1.dT == 424 || var1.dT == 425 || var1.dT == 427) && a != com.runescape.a.a) {
                  var1.a(var1.dT == 423 ? -312 : -342, 25, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if (var1.dT == 260 && a != com.runescape.a.a) {
                  var1.a(0, d - 334 - 165, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               } else if (var1.dT == 259) {
                  var1.a(true, 0);
               } else if (var1.dT == 421) {
                  var1.a(false, 0);
               } else if (var1.dT == 464) {
                  var1.a(true, 8881798);
               } else if (var1.dT == 468) {
                  var1.a(false, 8881798);
               } else if ((var1.dT == 328 || var1.dT == 329 || var1.dT == 330) && a != com.runescape.a.a) {
                  if (var1.dT == 329) {
                     var1.h(50, 0);
                  }

                  if (var1.dT == 330) {
                     var1.h(100, 0);
                  }

                  if (var1.dT == 328) {
                     var1.h(200, 0);
                  }
               } else if (var1.dT == 467 && a != com.runescape.a.a) {
                  var1.h(75, 5082768);
               } else {
                  if (var1.dT == 495 && a != com.runescape.a.a) {
                     var1.h(255, 0);
                     var27 = c / 2 - 256;
                     var10000 = d / 2 - 167 - 40;
                  } else {
                     var27 = a == com.runescape.a.a ? 0 : c / 2 + 80;
                     var10000 = a == com.runescape.a.a ? 0 : d / 2 - 550;
                  }

                  var11 = var10000;
                  var1.a(var27, var11, 512, 334, uwotm8.m.a[var1.dT], -1, 0);
               }
            }

            if (v != -1) {
               var1.i(var1.cN, v);
               if (v == 259) {
                  var1.a(true, 0);
               } else if (v == 421) {
                  var1.a(false, 0);
               } else if (v == 464) {
                  var1.a(true, 8881798);
               } else if (v == 468) {
                  var1.a(false, 8881798);
               } else if ((v == 328 || v == 329 || v == 330) && a != com.runescape.a.a) {
                  if (v == 329) {
                     var1.h(50, 0);
                  }

                  if (v == 330) {
                     var1.h(100, 0);
                  }

                  if (v == 328) {
                     var1.h(200, 0);
                  }
               } else if (v == 467 && a != com.runescape.a.a) {
                  var1.h(75, 5082768);
               } else {
                  var27 = a == com.runescape.a.a ? 0 : c / 2 - 356;
                  var11 = a == com.runescape.a.a ? 0 : d / 2 - 230;
                  var1.a(var27, var11, 512, 334, uwotm8.m.a[v], -1, 0);
               }
            }

            var1.hj = 0;
            var25 = (L.V >> 7) + var1.eg;
            var18 = (L.W >> 7) + var1.eh;
            if (var25 >= 3053 && var25 <= 3156 && var18 >= 3056 && var18 <= 3136) {
               var1.hj = 1;
            }

            if (var25 >= 3072 && var25 <= 3118 && var18 >= 9492 && var18 <= 9535) {
               var1.hj = 1;
            }

            if (var1.hj == 1 && var25 >= 3135 && var25 <= 3199 && var18 >= 3008 && var18 <= 3062) {
               var1.hj = 0;
            }

            if (!var1.fr.isEmpty()) {
               var25 = a == com.runescape.a.a ? 329 : d - 171;
               if (e) {
                  var1.hz.a(true, 4, 16776960, var1.fr, var25);
               } else {
                  var1.hz.a(true, 4, 16776960, var1.fr, d - 30);
               }
            }

            if (!var1.bY) {
               var1.L();
               if (var1.N >= 2 || var1.hN != 0 || var1.fN != 0) {
                  String var37;
                  if (var1.hN == 1 && var1.N < 2) {
                     var37 = "Use " + var1.hR + " with...";
                  } else if (var1.fN == 1 && var1.N < 2) {
                     var37 = var1.fQ + "...";
                  } else {
                     var37 = var1.X[var1.N - 1];
                  }

                  if (var1.N > 2) {
                     var37 = var37 + "@whi@ / " + (var1.N - 2) + " more options";
                  }

                  var1.hF.a(b(var37), 4, 15, 16777215, 0);
               }
            } else {
               var1.e(a == com.runescape.a.a ? 4 : 0, a == com.runescape.a.a ? 4 : 0);
            }

            if (fZ) {
               var27 = 16776960;
               if (var1.al < 15) {
                  var27 = 16711680;
               }

               var1.hz.a("Fps:" + var1.al, 507, var27, 20);
               Runtime var33;
               var12 = (int)(((var33 = Runtime.getRuntime()).totalMemory() - var33.freeMemory()) / 1024L);
               var1.hz.a("Mem:" + var12 + "k", 507, 16776960, 35);
            }

            var25 = var1.eg + (L.V - 6 >> 7);
            var26 = var1.eh + (L.W - 6 >> 7);
            if (da) {
               var27 = e ? d - 173 : d - 34;
               l var35 = var1.hF;
               var12 = var1.hF.a + 3;
               var14 = 16776960;
               if (var1.al < 15) {
                  var14 = 16711680;
               }

               Runtime var36;
               var16 = (int)(((var36 = Runtime.getRuntime()).totalMemory() - var36.freeMemory()) / 1024L);
               var35.a("Fps: " + var1.al, 5, var27, var14, 0);
               var27 -= var12;
               var35.a("Memory Usage: " + var16 + "k", 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Screen Mode: " + a, 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Client Resolution: " + c + "x" + d, 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Client Zoom: " + G, 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("frameWidth: " + (var1.au - c) + ", frameHeight: " + (var1.av - d), 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Mouse X: " + var1.au + ", Mouse Y: " + var1.av, 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Coords: " + var25 + ", " + var26, 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Floor Map Array: " + Arrays.toString(var1.gW), 5, var27, 16776960, 0);
               var27 -= var12;
               var35.a("Object Map Array: " + Arrays.toString(var1.gX), 5, var27, 16776960, 0);
            }

            if (var1.fq != 0) {
               if (a == com.runescape.a.a) {
                  var27 = 329;
               } else {
                  var27 = d - 170;
               }

               if (!var1.fr.isEmpty()) {
                  var27 -= 14;
               }

               var12 = (var11 = var1.fq / 50) / 60;
               if ((var11 %= 60) < 10) {
                  var1.hz.b(16776960, "System update in: " + var12 + ":0" + var11, var27, 4);
               } else {
                  var1.hz.b(16776960, "System update in: " + var12 + ":" + var11, var27, 4);
               }

               if (++bD > 75) {
                  bD = 0;
                  var1.gy.writeOpCode(148);
               }
            }

            if (a != com.runescape.a.a) {
               var1.n();
            }

            gg.a(a == com.runescape.a.a ? 4 : 0, var1.ao, a == com.runescape.a.a ? 4 : 0);
            var1.bG = var3;
            var1.bH = var4;
            var1.bI = var5;
            var1.bJ = var6;
            var1.bK = var7;
         } catch (RuntimeException var20) {
            uwotm8.al.b("97263, " + var20.toString());
            throw new RuntimeException();
         }
      }

      if (this.W != -1 && this.i(this.cN, this.W)) {
         P = true;
      }

      if (this.he == 2 || this.eX == 2) {
         P = true;
      }

      int var21;
      Rectangle var23;
      if (this.ai == -1) {
         var21 = t.a(true);
         var3 = (int)(var23 = t.b()).getHeight() + 1;
         this.ey.t = Z - F - var3;
         var5 = (var4 = (int)var23.getWidth()) + 16;
         if (super.au >= var4 && super.au <= var5 && super.av > var21) {
            this.a(var4, var3, super.au, super.av, this.ey, var21 + (int)var23.getY(), false, Z);
         }

         if ((var21 = Z - var3 - this.ey.t) > Z - var3) {
            var21 = Z - var3;
         }

         if (var21 < 0) {
            var21 = 0;
         }

         if (F != var21) {
            F = var21;
            ab = true;
         }
      }

      if (this.ai == -1 && this.ac >= 3 && this.ac <= 5) {
         var21 = t.a(true) + 14;
         var3 = (int)(var23 = t.b()).getHeight() + 1;
         this.ey.t = i;
         var5 = (var4 = (int)var23.getWidth()) + 16;
         if (super.au >= var4 && super.au <= var5 && super.av > var21) {
            this.a(var4, var3, super.au, super.av, this.ey, var21 + (int)var23.getY(), false, j);
         }

         var21 = this.ey.t;
         if (this.ey.t > j - var3) {
            var21 = j - var3;
         }

         if (var21 < 0) {
            var21 = 0;
         }

         if (i != var21) {
            i = var21;
            ab = true;
         }

         if (this.b()) {
            ab = true;
         }
      }

      if (this.ai != -1 && this.i(this.cN, this.ai)) {
         ab = true;
      }

      if (this.he != 3 && this.eX != 3 && this.bA == null) {
         if (this.bY) {
            ;
         }
      } else {
         ab = true;
      }

      if (this.dX == 2 && this.dr) {
         this.dr = false;
         this.h(this.cu);
      }

      if (this.C != -1) {
         K = true;
      }

      if (K && this.C != -1 && this.C == aa) {
         this.C = -1;
         this.gy.writeOpCode(120);
         this.gy.b(aa);
      }

      if (a == com.runescape.a.a) {
         this.n();
      }

      this.cN = 0;
   }

   private int d(String var1) {
      for(int var2 = 0; var2 < this.cl; ++var2) {
         String var3;
         if (this.cW[var2] > 0L && !(var3 = uwotm8.StringUtils.a(this.cW[var2])).isEmpty() && var3.equalsIgnoreCase(var1)) {
            return this.cX[var2];
         }
      }

      return 0;
   }

   private void f(int var1, int var2) {
      try {
         m[] var3;
         m var4;
         (var4 = (var3 = uwotm8.m.a[174])[78]).w[0] = 0;
         var4.x[0] = 0;

         int var5;
         m var7;
         m var11;
         for(var5 = 0; var5 < 10; ++var5) {
            int var6 = 9 + (var5 << 2);
            var7 = var3[var6];
            m var8 = var3[var6 + 2];
            var11 = var3[var6 + 3];
            m var9 = var3[var5 + 50];
            var7.X = aB_1.a("bank", 0);
            var8.X = aB_1.a("bank", 1);
            if (var5 > 0) {
               var7.aj = "";
               var7.u = true;
               var11.u = true;
               if (var5 >= var2) {
                  if (var5 == var2) {
                     var7.aj = "New tab";
                     var7.u = false;
                     var11.u = false;
                  }
               } else {
                  var7.aj = "View Tab @lre@".concat(String.valueOf(var5));
                  var7.u = false;
                  var11.u = true;
               }

               var4.w[var5] = var9.w[0];
               var4.x[var5] = var9.x[0];
            }

            if (var5 <= 8) {
               var11 = var3[var5 + 60];
               var3[var5 + 69].u = true;
               var11.u = true;
            }

            if (var5 != this.aY) {
               var9.u = true;
            } else {
               var9.u = false;
            }
         }

         if (var1 >= 0 && var1 <= 9) {
            var5 = 9 + (var1 << 2);
            var11 = var3[var5];
            var7 = var3[var5 + 2];
            var11.X = aB_1.a("bank", 2);
            var7.X = aB_1.a("bank", 2);
            return;
         }
      } catch (Exception var10) {
         ;
      }

   }

   private int b(m var1) {
      return this.c(var1) * (32 + var1.F);
   }

   private int c(m var1) {
      return (int)Math.ceil((double)d(var1) / (double)var1.g);
   }

   private static int d(m var0) {
      int var1 = 0;
      if (var0 != null && var0.b == 2 && var0.w != null) {
         for(int var2 = 0; var2 < var0.w.length; ++var2) {
            if (var0.w[var2] > 0) {
               ++var1;
            }
         }
      }

      return var1;
   }

   private void P() {
      if (v == 174) {
         try {
            m[] var1;
            m var2 = (var1 = uwotm8.m.a[174])[49];
            m var3;
            (var3 = var1[50]).h = this.c(var3);
            int var4;
            if (this.aY <= 0) {
               var4 = this.b(var3) + 14;
               int var5 = var3.f + var4;

               for(int var12 = 0; var12 < 9; ++var12) {
                  m var6 = var1[var12 + 51];
                  m var7 = var1[var12 + 60];
                  m var8 = var1[var12 + 69];
                  int var9 = d(var6);
                  int var10 = this.b(var6) + 14;
                  boolean var14 = var9 <= 0;
                  var8.u = var14;
                  var6.u = var14;
                  var7.u = var14;
                  if (!var14) {
                     var8.f = var5 - 22;
                     var7.f = var5 - 8;
                     var6.f = var5;
                     var6.h = this.c(var6);
                     var5 += var10;
                     var4 += var10;
                  }
               }

               if (var2.s != var4) {
                  var2.s = var4;
                  return;
               }
            } else {
               var4 = 0;
               m var13;
               if ((var13 = var1[50 + this.aY]) != null) {
                  var13.f = var3.f;
                  var13.h = this.c(var13);
                  var4 = this.b(var13);
               }

               if (var2.s != var4) {
                  var2.s = var4;
                  return;
               }
            }
         } catch (Exception var11) {
            ;
         }

      }
   }

   private int Q() {
      int var1 = a == com.runescape.a.a ? 0 : c / 2 - 356;
      int var2 = a == com.runescape.a.a ? 0 : d / 2 - 230;
      if (super.av >= var2 + 40 && super.av <= var2 + 80) {
         for(var2 = 0; var2 < 10; ++var2) {
            int var3;
            int var4 = (var3 = 54 + var2 * 40) + 40;
            if (super.au >= var1 + var3 && super.au <= var1 + var4) {
               return var2;
            }
         }
      }

      return -1;
   }

   public final void a(int var1, int var2, int var3, int var4, m[] var5, int var6, int var7) {
      int var8 = uwotm8.p.k;
      int var9 = uwotm8.p.i;
      int var10 = uwotm8.p.l;
      int var11 = uwotm8.p.j;
      if (var5 != null) {
         uwotm8.p.b(var2 + var4, var1, var1 + var3, var2);

         for(int var12 = 0; var12 < var5.length; ++var12) {
            m var13;
            if ((var13 = var5[var12]) != null && var13.m == var6) {
               m var14 = null;
               if (var6 >= 0) {
                  var14 = uwotm8.m.a(var6);
               }

               if (var13.v) {
                  if (var13.b == 0 && !this.e(var13)) {
                     continue;
                  }
               } else if (var13.u && this.ec != var13.o && this.er != var13.o && this.el != var13.o) {
                  continue;
               }

               int var15 = var13.e + var13.i + var1;
               int var16 = var13.f + var13.j + var2 - var7;
               int var17;
               int var18;
               int var21;
               int var22;
               int var23;
               int var27;
               D_1 var40;
               String var43;
               if (var13.d > 0) {
                  Client var24 = this;
                  var27 = var13.d;
                  if ((var13.d <= 0 || var27 > 100) && (var27 < 701 || var27 > 800)) {
                     if ((var27 < 101 || var27 > 200) && (var27 < 801 || var27 > 900)) {
                        if (var27 == 203) {
                           var21 = this.ck;
                           if (this.cm != 2) {
                              var21 = 0;
                           }

                           var13.s = var21 * 15 + 20;
                           if (var13.s <= var13.h) {
                              var13.s = var13.h + 1;
                           }
                        } else if (var27 >= 401 && var27 <= 500) {
                           var27 -= 401;
                           if (var27 == 0 && this.cm == 0) {
                              var13.R = "Loading ignore list";
                              var13.c = 0;
                           } else if (var27 == 1 && this.cm == 0) {
                              var13.R = "Please wait...";
                              var13.c = 0;
                           } else {
                              var21 = this.bj;
                              if (this.cm == 0) {
                                 var21 = 0;
                              }

                              if (var27 >= var21) {
                                 var13.R = "";
                                 var13.c = 0;
                              } else {
                                 var13.R = uwotm8.StringUtils.c(uwotm8.StringUtils.a(this.cx[var27]));
                                 var13.c = 1;
                              }
                           }
                        } else if (var27 == 503) {
                           var13.s = this.bj * 15 + 20;
                           if (var13.s <= var13.h) {
                              var13.s = var13.h + 1;
                           }
                        } else if (var27 == 327) {
                           var13.ae = 150;
                           var13.af = (int)(Math.sin((double)R / 40.0D) * 256.0D) & 2047;
                           if (this.ee) {
                              var21 = 0;

                              while(true) {
                                 if (var21 >= 7) {
                                    var24.ee = false;
                                    D_1[] var42 = new D_1[7];
                                    var22 = 0;

                                    for(var23 = 0; var23 < 7; ++var23) {
                                       if ((var17 = var24.eD[var23]) >= 0) {
                                          var42[var22++] = uwotm8.C_1.b[var17].b();
                                       }
                                    }

                                    var40 = new D_1(var22, var42);

                                    for(var17 = 0; var17 < 5; ++var17) {
                                       if (var24.dw[var17] != 0) {
                                          var40.a(B[var17][0], B[var17][var24.dw[var17]]);
                                          if (var17 == 1) {
                                             var40.a(Y[0], Y[var24.dw[var17]]);
                                          }
                                       }
                                    }

                                    var40.d();
                                    var40.c(uwotm8.Animation.a[L.j].c[0]);
                                    var40.a(64, 850, -30, -50, -30, true);
                                    var13.Z = 5;
                                    var13.aa = 0;
                                    uwotm8.m.a(false, var40);
                                    break;
                                 }

                                 if ((var22 = var24.eD[var21]) >= 0 && !uwotm8.C_1.b[var22].a()) {
                                    break;
                                 }

                                 ++var21;
                              }
                           }
                        } else if (var27 == 328) {
                           var23 = (int)(Math.sin((double)R / 40.0D) * 256.0D) & 2047;
                           var13.ae = 150;
                           var13.af = var23;
                           if (this.ee) {
                              D_1 var29 = L.d();

                              for(var18 = 0; var18 < 5; ++var18) {
                                 if (var24.dw[var18] != 0) {
                                    var29.a(B[var18][0], B[var18][var24.dw[var18]]);
                                    if (var18 == 1) {
                                       var29.a(Y[0], Y[var24.dw[var18]]);
                                    }
                                 }
                              }

                              var18 = L.j;
                              var29.d();
                              var29.c(uwotm8.Animation.a[var18].c[0]);
                              var13.Z = 5;
                              var13.aa = 0;
                              uwotm8.m.a(false, var29);
                           }
                        } else if (var27 == 324) {
                           if (this.cB == null) {
                              this.cB = var13.X;
                              this.cC = var13.Y;
                           }

                           if (this.eq) {
                              var13.X = this.cC;
                           } else {
                              var13.X = this.cB;
                           }
                        } else if (var27 == 325) {
                           if (this.cB == null) {
                              this.cB = var13.X;
                              this.cC = var13.Y;
                           }

                           if (this.eq) {
                              var13.X = this.cB;
                           } else {
                              var13.X = this.cC;
                           }
                        } else if (var27 == 600) {
                           var13.R = this.bW;
                           if (R % 20 < 10) {
                              var13.R = var13.R + "|";
                           } else {
                              var13.R = var13.R + " ";
                           }
                        } else {
                           label1079: {
                              if (var27 == 620) {
                                 if (this.bL > 0) {
                                    if (this.ga) {
                                       var13.T = 16711680;
                                       var13.R = "Moderator option: Mute player for 48 hours: <ON>";
                                    } else {
                                       var13.T = 16777215;
                                       var13.R = "Moderator option: Mute player for 48 hours: <OFF>";
                                    }
                                 } else {
                                    var13.R = "";
                                 }
                              }

                              if (var27 == 650 || var27 == 655) {
                                 if (this.gz != 0) {
                                    if (this.dI == 0) {
                                       var43 = "earlier today";
                                    } else if (this.dI == 1) {
                                       var43 = "yesterday";
                                    } else {
                                       var43 = this.dI + " days ago";
                                    }

                                    var13.R = "You last logged in " + var43 + " from: " + uwotm8.al.f;
                                 } else {
                                    var13.R = "";
                                 }
                              }

                              if (var27 == 651) {
                                 if (this.fX == 0) {
                                    var13.R = "0 unread messages";
                                    var13.T = 16776960;
                                 }

                                 if (this.fX == 1) {
                                    var13.R = "1 unread message";
                                    var13.T = 65280;
                                 }

                                 if (this.fX > 1) {
                                    var13.R = this.fX + " unread messages";
                                    var13.T = 65280;
                                 }
                              }

                              if (var27 == 652) {
                                 if (this.gi == 201) {
                                    if (this.fC == 1) {
                                       var13.R = "@yel@This is a non-members world: @whi@Since you are a member we";
                                    } else {
                                       var13.R = "";
                                    }
                                 } else if (this.gi == 200) {
                                    var13.R = "You have not yet set any password recovery questions.";
                                 } else {
                                    if (this.gi == 0) {
                                       var43 = "Earlier today";
                                    } else if (this.gi == 1) {
                                       var43 = "Yesterday";
                                    } else {
                                       var43 = this.gi + " days ago";
                                    }

                                    var13.R = var43 + " you changed your recovery questions";
                                 }
                              }

                              if (var27 == 653) {
                                 if (this.gi == 201) {
                                    if (this.fC == 1) {
                                       var13.R = "@whi@recommend you use a members world instead. You may use";
                                    } else {
                                       var13.R = "";
                                    }
                                 } else if (this.gi == 200) {
                                    var13.R = "We strongly recommend you do so now to secure your account.";
                                 } else {
                                    var13.R = "If you do not remember making this change then cancel it immediately";
                                 }
                              }

                              if (var27 == 654) {
                                 if (this.gi == 201) {
                                    if (this.fC == 1) {
                                       var13.R = "@whi@this world but member benefits are unavailable whilst here.";
                                    } else {
                                       var13.R = "";
                                    }
                                    break label1079;
                                 }

                                 if (this.gi == 200) {
                                    var13.R = "Do this from the 'account management' area on our front webpage";
                                    break label1079;
                                 }

                                 var13.R = "Do this from the 'account management' area on our front webpage";
                              }

                              if (var27 >= 10000 && var27 <= 10022) {
                                 var27 -= 10000;
                                 String var19 = "";
                                 var19 = var19 + uwotm8.StringUtils.c(uwotm8.au.a[aI[var27]]) + ": " + this.cv[aI[var27]] + "/" + this.en[aI[var27]] + "\\n";
                                 var19 = var19 + "Current XP: " + NumberFormat.getIntegerInstance().format((long)this.bM[aI[var27]]) + "\\n";
                                 if (this.en[aI[var27]] < 99) {
                                    var19 = var19 + "Next level: " + NumberFormat.getIntegerInstance().format((long)o(this.en[aI[var27]] + 1)) + "\\n";
                                    var19 = var19 + "Remainder: " + NumberFormat.getIntegerInstance().format((long)(o(this.en[aI[var27]] + 1) - this.bM[aI[var27]]));
                                 } else {
                                    if (this.bM[aI[var27]] < 200000000) {
                                       var19 = var19 + "Remainder: " + NumberFormat.getIntegerInstance().format((long)(200000000 - this.bM[aI[var27]])) + "\\n";
                                    } else {
                                       var19 = var19 + "Max EXP Reached\\n";
                                    }

                                    var19 = var19 + "Max Level Reached";
                                 }

                                 var13.R = var19;
                              } else if (var27 == 20000) {
                                 var13.s = this.cl * 15 + 20;
                                 if (var13.s <= var13.h) {
                                    var13.s = var13.h + 1;
                                 }
                              } else if (var27 >= 20001 && var27 <= 20101) {
                                 var21 = this.cl;
                                 var27 -= 20001;
                                 m var38 = uwotm8.m.a(var13.l, var27 + 21);
                                 if (var27 >= var21) {
                                    var38.X = var38.Y = null;
                                    var13.R = "";
                                    var13.g = 0;
                                    var13.c = 0;
                                 } else {
                                    var23 = this.cX[var27];
                                    String var30 = uwotm8.StringUtils.a(this.cW[var27]);
                                    switch(var23) {
                                    case 0:
                                       if (this.e(var30) && !var30.equalsIgnoreCase(L.ai)) {
                                          var38.X = var38.Y = aB_1.a("clanchat", 0);
                                          break;
                                       }

                                       var38.X = var38.Y = null;
                                       break;
                                    case 1:
                                       var38.X = var38.Y = aB_1.a("clanchat", 1);
                                       break;
                                    case 2:
                                       var38.X = var38.Y = aB_1.a("clanchat", 3);
                                       break;
                                    case 3:
                                       var38.X = var38.Y = aB_1.a("clanchat", 2);
                                    }

                                    var13.R = uwotm8.StringUtils.c(var30);
                                    var18 = 0;
                                    if (var13.a() instanceof o) {
                                       var18 = ((o)var13.a()).a(var13.R);
                                    } else if (var13.a() instanceof l) {
                                       var18 = ((l)var13.a()).a(var13.R);
                                    }

                                    var13.g = var18;
                                    var13.c = 1;
                                 }
                              }
                           }
                        }
                     } else {
                        var21 = this.ck;
                        if (this.cm != 2) {
                           var21 = 0;
                        }

                        if (var27 > 800) {
                           var27 -= 701;
                        } else {
                           var27 -= 101;
                        }

                        if (var27 >= var21) {
                           var13.R = "";
                           var13.c = 0;
                        } else {
                           if (this.bm[var27] != 0 && this.bm[var27] == cZ) {
                              var13.R = "@gre@Online";
                           } else {
                              var13.R = "@red@Offline";
                           }

                           var13.c = 1;
                        }
                     }
                  } else if (var27 == 1 && this.cm == 0) {
                     var13.R = "Loading friend list";
                     var13.c = 0;
                  } else if (var27 == 1 && this.cm == 1) {
                     var13.R = "Connecting to friendserver";
                     var13.c = 0;
                  } else if (var27 == 2 && this.cm != 2) {
                     var13.R = "Please wait...";
                     var13.c = 0;
                  } else {
                     var21 = this.ck;
                     if (this.cm != 2) {
                        var21 = 0;
                     }

                     if (var27 > 700) {
                        var27 -= 601;
                     } else {
                        --var27;
                     }

                     if (var27 >= var21) {
                        var13.R = "";
                        var13.c = 0;
                     } else {
                        var13.R = this.eT[var27];
                        var13.c = 1;
                     }
                  }
               }

               if (var13.b == 0) {
                  if (var13.l == 174) {
                     this.P();
                  }

                  if (var13.t > var13.s - var13.h) {
                     var13.t = var13.s - var13.h;
                  }

                  if (var13.t < 0) {
                     var13.t = 0;
                  }

                  this.a(var15, var16, var13.g, var13.h, var5, var13.o, var13.t);
                  if (var13.s > var13.h) {
                     this.a(var13.h, var13.t, var16, var15 + var13.g, var13.s);
                  }
               } else if (var13.b != 1) {
                  int var25;
                  int var34;
                  int var37;
                  int var45;
                  if (var13.b == 2) {
                     var17 = 0;

                     for(var18 = 0; var18 < var13.h; ++var18) {
                        for(var37 = 0; var37 < var13.g; ++var37) {
                           var34 = var15 + var37 * (32 + var13.E);
                           var21 = var16 + var18 * (32 + var13.F);
                           if (var17 < 20) {
                              var34 += var13.G[var17];
                              var21 += var13.H[var17];
                           }

                           if (var13.w[var17] <= 0) {
                              Sprite var57;
                              if (var13.I != null && var17 < 20 && (var57 = var13.I[var17]) != null) {
                                 var57.d(var34, var21);
                              }
                           } else {
                              var22 = 0;
                              var23 = 0;
                              var45 = var13.w[var17] - 1;
                              if (var34 > uwotm8.p.k - 32 && var34 < uwotm8.p.l && var21 > uwotm8.p.i - 32 && var21 < uwotm8.p.j || this.eX != 0 && this.eW == var17) {
                                 var25 = 0;
                                 if (this.hN == 1 && this.hO == var17 && this.hP == var13.o) {
                                    var25 = 16777215;
                                 }

                                 Sprite var48;
                                 if ((var48 = uwotm8.i.a(var45, var13.x[var17], var25)) != null) {
                                    if (var14 != null && this.eX != 0 && this.eW == var17 && this.eV == var13.o) {
                                       var22 = super.au - this.eY;
                                       var23 = super.av - this.eZ;
                                       if (var22 < 5 && var22 > -5) {
                                          var22 = 0;
                                       }

                                       if (var23 < 5 && var23 > -5) {
                                          var23 = 0;
                                       }

                                       if (this.dv < 5) {
                                          var22 = 0;
                                          var23 = 0;
                                       }

                                       boolean var58;
                                       label769: {
                                          if (var13.l == 174) {
                                             var25 = a == com.runescape.a.a ? 0 : c / 2 - 356;
                                             var27 = a == com.runescape.a.a ? 0 : d / 2 - 230;
                                             if (super.av >= var27 + 40 && super.av <= var27 + 80 && super.au >= var25 + 54 && super.au <= var25 + 464) {
                                                var58 = true;
                                                break label769;
                                             }
                                          }

                                          var58 = false;
                                       }

                                       if (!var58) {
                                          if (var21 + var23 < uwotm8.p.i && var14.t > 0) {
                                             if ((var25 = this.cN * (uwotm8.p.i - var21 - var23) / 3) > this.cN * 10) {
                                                var25 = this.cN * 10;
                                             }

                                             if (var25 > var14.t) {
                                                var25 = var14.t;
                                             }

                                             var14.t -= var25;
                                             this.eZ += var25;
                                          }

                                          if (var21 + var23 + 32 > uwotm8.p.j && var14.t < var14.s - var14.h) {
                                             if ((var25 = this.cN * (var21 + var23 + 32 - uwotm8.p.j) / 3) > this.cN * 10) {
                                                var25 = this.cN * 10;
                                             }

                                             if (var25 > var14.s - var14.h - var14.t) {
                                                var25 = var14.s - var14.h - var14.t;
                                             }

                                             var14.t += var25;
                                             this.eZ -= var25;
                                          }
                                       }

                                       uwotm8.p.b(var11, var8, var10, var9);
                                       var48.c(var34 + var22, var21 + var23);
                                       uwotm8.p.b(var2 + var4, var1, var1 + var3, var2);
                                    } else if (this.he != 0 && this.hd == var17 && this.hc == var13.o) {
                                       var48.c(var34, var21);
                                    } else {
                                       var48.d(var34, var21);
                                    }

                                    if (var13.D && (var48.d == 33 || var13.x[var17] != 1)) {
                                       var27 = var13.x[var17];
                                       this.af.b(0, j(var27), var21 + 10 + var23, var34 + 1 + var22);
                                       this.af.b(16776960, j(var27), var21 + 9 + var23, var34 + var22);
                                    }
                                 }
                              }
                           }

                           ++var17;
                        }
                     }
                  } else if (var13.b == 3) {
                     boolean var33 = false;
                     if (this.el == var13.o || this.er == var13.o || this.ec == var13.o) {
                        var33 = true;
                     }

                     if (this.e(var13)) {
                        var18 = var13.U;
                        if (var33 && var13.W != 0) {
                           var18 = var13.W;
                        }
                     } else {
                        var18 = var13.T;
                        if (var33 && var13.V != 0) {
                           var18 = var13.V;
                        }
                     }

                     if (var13.k == 0) {
                        if (var13.K) {
                           uwotm8.p.b(var13.h, var16, var15, var18, var13.g);
                        } else {
                           uwotm8.p.c(var15, var13.g, var13.h, var18, var16);
                        }
                     } else if (var13.K) {
                        uwotm8.p.a(var18, var16, var13.g, var13.h, 256 - (var13.k & 255), var15);
                     } else {
                        uwotm8.p.b(var16, var13.h, 256 - (var13.k & 255), var18, var13.g, var15);
                     }
                  } else {
                     p var31;
                     String var46;
                     if (var13.b == 4) {
                        var31 = var13.a();
                        String var35 = var13.R;
                        boolean var39 = false;
                        if (this.el == var13.o || this.er == var13.o || this.ec == var13.o) {
                           var39 = true;
                        }

                        if (this.e(var13)) {
                           var34 = var13.U;
                           if (var39 && var13.W != 0) {
                              var34 = var13.W;
                           }

                           if (var13.S.length() > 0) {
                              var35 = var13.S;
                           }
                        } else {
                           var34 = var13.T;
                           if (var39 && var13.V != 0) {
                              var34 = var13.V;
                           }
                        }

                        if (var13.c == 6 && this.fU) {
                           var35 = "Please wait...";
                           var34 = var13.T;
                        }

                        if ((this.ai != -1 || this.em != -1 || var13.R.contains("Click here to continue")) && (var13.l == this.ai || var13.l == this.em)) {
                           if (var34 == 16776960) {
                              var34 = 255;
                           }

                           if (var34 == 49152) {
                              var34 = 16777215;
                           }
                        }

                        var35 = this.a(var13, var35);
                        if (var13.L == 1) {
                           if (var31 instanceof l) {
                              ((l)var31).a(var35, var15, var16, var13.g, var13.h, var34, var13.N ? 0 : -1, var13.O, var13.P, var13.Q);
                           }
                        } else {
                           var21 = 0;
                           if (var31 instanceof o) {
                              var21 = ((o)var31).a;
                           } else if (var31 instanceof l) {
                              var21 = ((l)var31).a;
                           }

                           for(var22 = var16 + var21; var35.length() > 0; var22 += var21) {
                              var23 = var35.indexOf("\\n");
                              var45 = var35.indexOf("<br>");
                              if (var23 != -1) {
                                 var46 = var35.substring(0, var23);
                                 var35 = var35.substring(var23 + 2);
                              } else if (var45 != -1) {
                                 var46 = var35.substring(0, var45);
                                 var35 = var35.substring(var45 + 4);
                              } else {
                                 var46 = var35;
                                 var35 = "";
                              }

                              if (var13.M) {
                                 if (var31 instanceof o) {
                                    ((o)var31).a(var34, var15 + var13.g / 2, var46, var22, var13.N);
                                 } else if (var31 instanceof l) {
                                    ((l)var31).b(var46, var15 + var13.g / 2, var22, var34, var13.N ? 0 : -1);
                                 }
                              } else if (var31 instanceof o) {
                                 ((o)var31).a(var13.N, var15, var34, var46, var22);
                              } else if (var31 instanceof l) {
                                 ((l)var31).a(var46, var15, var22, var34, var13.N ? 0 : -1);
                              }
                           }
                        }
                     } else if (var13.b == 5) {
                        boolean var49 = this.e(var13);
                        Sprite var55;
                        if (var49) {
                           var55 = var13.Y;
                        } else {
                           var55 = var13.X;
                        }

                        Sprite var32;
                        if ((var32 = var55 == null ? null : var55) != null) {
                           if (this.fN == 1 && var13.o == fa && fa != 0) {
                              var32.c(var15, var16, 16777215);
                           } else {
                              var32.d(var15, var16);
                           }
                        }
                     } else if (var13.b == 6) {
                        var17 = uwotm8.r.e;
                        var18 = uwotm8.r.p;
                        uwotm8.r.e = var15 + var13.g / 2;
                        uwotm8.r.p = var16 + var13.h / 2;
                        var37 = uwotm8.r.r[var13.ae] * var13.ad >> 16;
                        var34 = uwotm8.r.s[var13.ae] * var13.ad >> 16;
                        boolean var56;
                        if (var56 = this.e(var13)) {
                           var22 = var13.ac;
                        } else {
                           var22 = var13.ab;
                        }

                        if (var22 == -1) {
                           var40 = var13.a(-1, -1, var56);
                        } else {
                           Animation var51 = uwotm8.Animation.a[var22];
                           var40 = var13.a(var51.d[var13.al], var51.c[var13.al], var56);
                        }

                        if (var40 != null) {
                           var40.a(var13.af, 0, var13.ae, 0, var37, var34);
                        }

                        uwotm8.r.e = var17;
                        uwotm8.r.p = var18;
                     } else if (var13.b == 7) {
                        var31 = var13.a();
                        var18 = 0;

                        for(var37 = 0; var37 < var13.g; ++var37) {
                           for(var34 = 0; var34 < var13.h; ++var34) {
                              if (var13.w[var18] > 0) {
                                 i var54;
                                 String var52 = (var54 = uwotm8.i.c(var13.w[var18] - 1)).k;
                                 if (var54.n || var13.x[var18] != 1) {
                                    var52 = var52 + " x" + e(var13.x[var18]);
                                 }

                                 var23 = var15 + var37 * (115 + var13.E);
                                 var45 = var16 + var34 * (12 + var13.F);
                                 if (var13.L == 1) {
                                    if (var31 instanceof l) {
                                       l var47 = (l)var31;
                                       if (var13.O == 0) {
                                          var47.a(var52, var23, var45, var13.T, var13.N ? 0 : -1);
                                       } else if (var13.O == 1) {
                                          var47.b(var52, var23 + var13.g / 2, var45, var13.T, var13.N ? 0 : -1);
                                       } else {
                                          int var10002 = var23 + var13.g - 1;
                                          var23 = var13.N ? 0 : -1;
                                          var22 = var13.T;
                                          var27 = var10002;
                                          if (var52 != null) {
                                             uwotm8.l.a(var22, var23);
                                             var47.a(var52, var27 - var47.a(var52), var45);
                                          }
                                       }
                                    }
                                 } else if (var13.M) {
                                    if (var31 instanceof o) {
                                       ((o)var31).a(var13.T, var23 + var13.g / 2, var52, var45, var13.N);
                                    } else if (var31 instanceof l) {
                                       ((l)var31).b(var52, var23 + var13.g / 2, var45, var13.T, var13.N ? 0 : -1);
                                    }
                                 } else if (var31 instanceof o) {
                                    ((o)var31).a(var13.N, var23, var13.T, var52, var45);
                                 } else if (var31 instanceof l) {
                                    ((l)var31).a(var52, var23, var45, var13.T, var13.N ? 0 : -1);
                                 }
                              }

                              ++var18;
                           }
                        }
                     } else if (var13.b == 8 && (this.hY == var13.o || this.hV == var13.o || this.hW == var13.o) && this.hZ == 0 && !this.bY) {
                        var17 = 0;
                        var18 = 0;
                        o var36 = this.hz;
                        String var20 = var13.R;
                        if (this.e(var13) && var13.S.length() > 0) {
                           var20 = var13.S;
                        }

                        for(var43 = var20 = this.a(var13, var20); var43.length() > 0; var18 += var36.a + 1) {
                           var22 = var43.indexOf("\\n");
                           var23 = var43.indexOf("<br>");
                           String var41;
                           if (var22 != -1) {
                              var41 = var43.substring(0, var22);
                              var43 = var43.substring(var22 + 2);
                           } else if (var23 != -1) {
                              var41 = var43.substring(0, var23);
                              var43 = var43.substring(var23 + 4);
                           } else {
                              var41 = var43;
                              var43 = "";
                           }

                           if ((var25 = var36.a(var41)) > var17) {
                              var17 = var25;
                           }
                        }

                        var17 += 6;
                        var18 += 7;
                        var21 = var15;
                        var22 = var16 + var13.h + 2;
                        if (var15 + var17 > var1 + var3) {
                           var21 = var1 + var3 - var17;
                        }

                        if (var21 < var1) {
                           var21 = var1;
                        }

                        if (var22 + var18 > var2 + var4) {
                           var22 = var2 + var4 - var18;
                        }

                        if (var22 < var16 && var22 + var18 > var16) {
                           var22 = var16 - var18 - 2;
                        }

                        if (var22 > var16 && var22 < var16 + var13.h) {
                           var22 = var16 - var18 - 2;
                        }

                        if (var22 < var2) {
                           var22 = var2;
                        }

                        if (var22 + var18 >= d) {
                           var22 = d - var18;
                        }

                        uwotm8.p.b(var18, var22, var21, 16777120, var17);
                        uwotm8.p.c(var21, var17, var18, 0, var22);
                        String var44 = this.a(var13, var20);

                        for(var45 = var22 + var36.a + 2; var44.length() > 0; var45 += var36.a + 1) {
                           var25 = var44.indexOf("\\n");
                           int var26 = var44.indexOf("<br>");
                           String var53;
                           if (var25 != -1) {
                              var53 = var44.substring(0, var25);
                              var44 = var44.substring(var25 + 2);
                           } else if (var26 != -1) {
                              var53 = var44.substring(0, var26);
                              var44 = var44.substring(var26 + 4);
                           } else {
                              var53 = var44;
                              var44 = "";
                           }

                           if (var13.M) {
                              var36.a(0, var21 + var13.g / 2, var53, var45, false);
                           } else if (var53.contains("\\r")) {
                              var46 = var53.substring(0, var53.indexOf("\\r"));
                              String var28 = var53.substring(var53.indexOf("\\r") + 2);
                              var36.a(false, var21 + 3, 0, var46, var45);
                              var15 = var17 + var21 - var36.a(var28) - 2;
                              var36.a(false, var15, 0, var28, var45);
                           } else {
                              var36.a(false, var21 + 3, 0, var53, var45);
                           }
                        }
                     }
                  }
               }
            }
         }

         uwotm8.p.b(var11, var8, var10, var9);
      }
   }

   public final void a(int var1, int var2) {
      if (uwotm8.Settings.l && (super.aB == 5 || super.aC && super.aB == 5) && Q) {
         int var3 = uwotm8.Settings.f;
         if (uwotm8.Settings.f <= 0) {
            var3 = 1;
         }

         if (var3 > 10) {
            var3 = 10;
         }

         this.gv += var1 * var3;
         this.gw += var2 << 1;
      }
   }

   private void R() {
      try {
         int var1 = L.V;
         int var2 = L.W;
         if (this.dP - var1 < -500 || this.dP - var1 > 500 || this.dQ - var2 < -500 || this.dQ - var2 > 500) {
            this.dP = var1;
            this.dQ = var2;
         }

         if (this.dP != var1) {
            this.dP += (var1 - this.dP) / 16;
         }

         if (this.dQ != var2) {
            this.dQ += (var2 - this.dQ) / 16;
         }

         if (super.az[1] == 1) {
            this.gv += (-24 - this.gv) / 2;
         } else if (super.az[2] == 1) {
            this.gv += (24 - this.gv) / 2;
         } else {
            this.gv /= 2;
         }

         if (super.az[3] == 1) {
            this.gw += (12 - this.gw) / 2;
         } else if (super.az[4] == 1) {
            this.gw += (-12 - this.gw) / 2;
         } else {
            this.gw /= 2;
         }

         this.V = this.V + this.gv / 2 & 2047;
         this.gu += this.gw / 2;
         if (this.gu < 128) {
            this.gu = 128;
         }

         if (this.gu > 383) {
            this.gu = 383;
         }

         var1 = this.dP >> 7;
         var2 = this.dQ >> 7;
         int var3 = this.b(this.cu, this.dQ, this.dP);
         int var4 = 0;
         int var5;
         if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for(var5 = var1 - 4; var5 <= var1 + 4; ++var5) {
               for(int var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
                  int var7 = this.cu;
                  if (this.cu < 3 && (this.ho[1][var5][var6] & 2) == 2) {
                     ++var7;
                  }

                  if ((var7 = var3 - this.gH[var7][var5][var6]) > var4) {
                     var4 = var7;
                  }
               }
            }
         }

         if (++dH > 1512) {
            dH = 0;
            this.gy.writeOpCode(77);
            this.gy.b(0);
            var5 = this.gy.b;
            this.gy.b((int)(Math.random() * 256.0D));
            this.gy.b(101);
            this.gy.b(233);
            this.gy.c(45092);
            if ((int)(Math.random() * 2.0D) == 0) {
               this.gy.c(35784);
            }

            this.gy.b((int)(Math.random() * 256.0D));
            this.gy.b(64);
            this.gy.b(38);
            this.gy.c((int)(Math.random() * 65536.0D));
            this.gy.c((int)(Math.random() * 65536.0D));
            this.gy.h(this.gy.b - var5);
         }

         if ((var5 = var4 * 192) > 98048) {
            var5 = 98048;
         }

         if (var5 < 32768) {
            var5 = 32768;
         }

         if (var5 > this.dq) {
            this.dq += (var5 - this.dq) / 24;
         } else if (var5 < this.dq) {
            this.dq += (var5 - this.dq) / 80;
         }
      } catch (Exception var8) {
         uwotm8.al.b("glfc_ex " + L.V + "," + L.W + "," + this.dP + "," + this.dQ + "," + this.eG + "," + this.eH + "," + this.eg + "," + this.eh);
         throw new RuntimeException("eek");
      }
   }

   public final void i() {
      if (this.cy) {
         Graphics var11;
         (var11 = this.g().getGraphics()).setColor(Color.black);
         var11.fillRect(0, 0, 765, 503);
         this.c(1);
         if (this.cy) {
            this.bo = false;
            var11.setFont(new Font("Helvetica", 1, 16));
            var11.setColor(Color.yellow);
            var11.drawString("Sorry, an error has occured whilst loading /v/scape", 30, 35);
            var11.setColor(Color.white);
            var11.drawString("To fix this try the following (in order):", 30, 85);
            var11.setColor(Color.white);
            var11.setFont(new Font("Helvetica", 1, 12));
            var11.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
            var11.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
            var11.drawString("3: Try using a different game-world", 30, 195);
            var11.drawString("4: Try rebooting your computer", 30, 225);
            var11.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
         }

      } else {
         if (!Q) {
            this.E();
            this.fu.a();
            int var2 = c / 2;
            int var3 = d / 2;
            if (this.bg != null) {
               this.bg.d(0, 0);
            }

            boolean var4 = this.b(c - 52, 10, 42, 42);
            aB_1.a("login", "settings", var4 ? (this.bq == 1 ? 2 : 1) : (this.bq == 1 ? 1 : 0)).d(c - 52, 10);
            if (!aW) {
               if (O) {
                  aB_1.a("login", 4).d(c - 104, 10);
               } else {
                  aB_1.a("login", 5).d(c - 104, 10);
               }
            }

            int var10;
            if (this.bq == 0) {
               this.bf.d(var2 - this.bf.b / 2, 24);
               var10 = var2 - 145;
               var3 -= 135;
               aB_1.a("login", "login_box", 0).a(var10, var3, 256);
               if (this.b(var10 + 35, var3 + 71, 218, 27)) {
                  aB_1.a("login", "login_box", 1).d(var10 + 35, var3 + 71);
               } else if (this.b(var10 + 35, var3 + 117, 218, 27)) {
                  aB_1.a("login", "login_box", 1).d(var10 + 35, var3 + 117);
               } else if (this.b(var10 + 55, var3 + 174, 179, 25)) {
                  aB_1.a("login", "login_box", 2).d(var10 + 55, var3 + 174);
               }

               this.hF.a(S + (this.gJ == 0 & R % 40 < 20 ? "|" : ""), var10 + 40, var3 + 90, 15970623, 0);
               this.hF.a(uwotm8.StringUtils.d(T) + (this.gJ == 1 & R % 40 < 20 ? "|" : ""), var10 + 40, var3 + 138, 15970623, 0);
               String var10000;
               int var10001;
               if (U) {
                  var10000 = "login";
                  var10001 = 2;
               } else {
                  boolean var12 = this.b(var10 + 35, var3 + 147, 106, 13);
                  var10000 = "login";
                  var10001 = var12 ? 3 : 1;
               }

               aB_1.a(var10000, var10001).d(var10 + 35, var3 + 147);
               this.hF.a("Remember Me", var10 + 52, var3 + 159, 15970623, 0);
               this.hF.b(this.hv, var2, var3 + 226, 15970623, 0);
               this.hF.b(this.hw, var2, var3 + 247, 15970623, 0);
               if (this.aV) {
                  this.hF.b("New Client Available", var2, var3 + 42, 16711680, 0);
               }
            } else if (this.bq == 1) {
               var10 = var2 - 145;
               this.hI.b("SETTINGS", var2, 64, 16777215, 0);
               Rectangle var5 = new Rectangle(var2 - 138, 88, 276, 200);
               uwotm8.p.a(0, var5.y, var5.width, var5.height, 100, var5.x);
               this.hI.b("UI", (int)var5.getCenterX(), var5.y + 26, 16777215, 0);
               var2 = var5.y + 30;
               boolean var9 = uwotm8.aF.b(uwotm8.aG_1.a);
               aB_1.a("login", "settings", !var9 && !this.b((int)var5.getCenterX() - 132, var2, 128, 96) ? 3 : 4).d((int)var5.getCenterX() - 132, var2);
               this.hH.b("2007", (int)var5.getCenterX() - 68, var2 + 112, var9 ? 16776960 : 16777215, 0);
               var9 = uwotm8.aF.b(uwotm8.aG_1.b);
               aB_1.a("login", "settings", !var9 && !this.b((int)var5.getCenterX() + 4, var2, 128, 96) ? 5 : 6).d((int)var5.getCenterX() + 4, var2);
               this.hH.b("Pre-2007", (int)var5.getCenterX() + 68, var2 + 112, var9 ? 16776960 : 16777215, 0);
               if (b == 1) {
                  boolean var8 = this.b(var10 + 85, 244, 106, 13);
                  aB_1.a("login", var8 ? 3 : 1).d(var10 + 85, 244);
               } else if (b == 2) {
                  aB_1.a("login", 2).d(var10 + 85, 244);
               }

               this.hF.a("Pixel doubling", var10 + 102, 256, 15970623, 0);
               this.hF.a("(only works in fixed client mode for now)", var10 + 12, 274, 15970623, 0);
            }

            int var7 = super.av;
            int var6 = super.au;
            if (this.aU != null && !this.aU.isEmpty()) {
               var2 = var6;
               var3 = var7;
               var10 = this.hF.a(this.aU) + 8;
               var6 = this.hF.a + 8 + 2;
               if (var2 + var10 > c) {
                  var2 = c - var10;
               }

               if (var2 < 0) {
                  var2 = 0;
               }

               if (var7 > d) {
                  var3 = d;
               }

               if (var3 < var6) {
                  var3 = var6;
               }

               uwotm8.p.a(0, var3 - var6, var10, var6, 200, var2);
               this.hF.a(this.aU, var2 + 4, var3 - 4 - 2, 16777215, 0);
            }

            this.fu.a(0, super.ao, 0);
         } else {
            this.O();
         }

         this.gG = 0;
      }
   }

   private boolean e(String var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.ck; ++var2) {
            if (var1.equalsIgnoreCase(this.eT[var2])) {
               return true;
            }
         }

         return var1.equalsIgnoreCase(L.ai);
      }
   }

   private static String g(int var0, int var1) {
      if ((var0 -= var1) < -9) {
         return "@red@";
      } else if (var0 < -6) {
         return "@or3@";
      } else if (var0 < -3) {
         return "@or2@";
      } else if (var0 < 0) {
         return "@or1@";
      } else if (var0 > 9) {
         return "@gre@";
      } else if (var0 > 6) {
         return "@gr3@";
      } else if (var0 > 3) {
         return "@gr2@";
      } else {
         return var0 > 0 ? "@gr1@" : "@yel@";
      }
   }

   private void a(boolean var1, int var2) {
      if (!this.aJ && this.aL == -10) {
         this.aN = var1;
         this.aM = var2;
         this.aK = true;
         if (this.aN) {
            this.aL = 0;
            return;
         }

         this.aL = 255;
      }

   }

   private void S() {
      this.aK = false;
      this.aJ = false;
      this.aN = false;
      this.aL = -10;
   }

   private void h(int var1, int var2) {
      this.aO = var1;
      this.aP = var2;
   }

   public final long j() {
      long var1 = 0L;

      for(int var3 = 0; var3 < 25; ++var3) {
         var1 += (long)this.bM[var3];
      }

      return var1;
   }

   private void c(long var1) {
      if (var1 != 0L) {
         try {
            if (this.bj >= 100) {
               this.a("Your ignore list is full. Max of 100 hit", 0, "", true);
            } else {
               String var3 = uwotm8.StringUtils.c(uwotm8.StringUtils.a(var1));

               int var4;
               for(var4 = 0; var4 < this.bj; ++var4) {
                  if (this.cx[var4] == var1) {
                     this.a(var3 + " is already on your ignore list", 0, "", true);
                     return;
                  }
               }

               for(var4 = 0; var4 < this.ck; ++var4) {
                  if (this.cV[var4] == var1) {
                     this.a("Please remove " + var3 + " from your friend list first", 0, "", true);
                     return;
                  }
               }

               if (!var3.equals(L.ai)) {
                  this.cx[this.bj++] = var1;
                  P = true;
                  this.gy.writeOpCode(133);
                  this.gy.a(var1);
               }
            }
         } catch (RuntimeException var5) {
            uwotm8.al.b("45688, " + var1 + ", 4" + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private void T() {
      for(int var1 = -1; var1 < this.ce; ++var1) {
         int var2;
         if (var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.cf[var1];
         }

         y var3;
         if ((var3 = this.cd[var2]) != null) {
            this.a((u)var3);
         }
      }

   }

   private void U() {
      if (this.dX == 2) {
         for(aa var1 = (aa)this.gp.b(); var1 != null; var1 = (aa)this.gp.d()) {
            if (var1.d > 0) {
               --var1.d;
            }

            if (var1.d == 0) {
               if (var1.i < 0 || uwotm8.S_1.a(var1.i, var1.k)) {
                  this.a(var1.h, var1.e, var1.j, var1.k, var1.g, var1.f, var1.i);
                  var1.D();
               }
            } else {
               if (var1.l > 0) {
                  --var1.l;
               }

               if (var1.l == 0 && var1.g > 0 && var1.h > 0 && var1.g <= 102 && var1.h <= 102 && (var1.a < 0 || uwotm8.S_1.a(var1.a, var1.c))) {
                  this.a(var1.h, var1.e, var1.b, var1.c, var1.g, var1.f, var1.a);
                  var1.l = -1;
                  if (var1.a == var1.i && var1.i == -1) {
                     var1.D();
                  } else if (var1.a == var1.i && var1.b == var1.j && var1.c == var1.k) {
                     var1.D();
                  }
               }
            }
         }
      }

   }

   private void V() {
      int var1 = this.hA.a("Choose option");

      int var2;
      int var3;
      for(var2 = 0; var2 < this.N; ++var2) {
         if ((var3 = this.hF.a(b(this.X[var2]))) > var1) {
            var1 = var3;
         }
      }

      var1 += 8;
      var2 = 15 * this.N + 21;
      if (super.ax > 0 && super.ay > 0 && super.ax < c && super.ay < d) {
         if ((var3 = super.ax - var1 / 2) + var1 > c - 4) {
            var3 = c - 4 - var1;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         int var4 = super.ay;
         if (super.ay + var2 > d - 6) {
            var4 = d - 6 - var2;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         this.bY = true;
         this.cP = var3;
         this.cQ = var4;
         this.cR = var1;
         this.cS = 15 * this.N + 22;
      }

   }

   private boolean i(int var1, int var2) {
      boolean var3 = false;
      m[] var7 = uwotm8.m.a[var2];

      for(int var4 = 0; var4 < var7.length; ++var4) {
         m var5;
         if ((var5 = var7[var4]) != null && var5.b == 6 && (var5.ab != -1 || var5.ac != -1)) {
            int var6;
            if (this.e(var5)) {
               var6 = var5.ac;
            } else {
               var6 = var5.ab;
            }

            if (var6 != -1) {
               Animation var8 = uwotm8.Animation.a[var6];

               for(var5.ak += var1; var5.ak > var8.a(var5.al); var3 = true) {
                  var5.ak -= var8.a(var5.al) + 1;
                  ++var5.al;
                  if (var5.al >= var8.b) {
                     var5.al -= var8.e;
                     if (var5.al < 0 || var5.al >= var8.b) {
                        var5.al = 0;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private void d(long var1) {
      if (var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.bj; ++var3) {
               if (this.cx[var3] == var1) {
                  --this.bj;
                  P = true;
                  System.arraycopy(this.cx, var3 + 1, this.cx, var3, this.bj - var3);
                  this.gy.writeOpCode(74);
                  this.gy.a(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            uwotm8.al.b("47229, 3, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private void a(long var1, int var3) {
      if (var1 != 0L) {
         if (var3 >= 0) {
            try {
               this.gy.writeOpCode(62);
               this.gy.a(var1);
               this.gy.c(var3);
            } catch (RuntimeException var4) {
               uwotm8.al.b("47229, 3, " + var1 + ", " + var4.toString());
               throw new RuntimeException();
            }
         }
      }
   }

   public String getParameter(String var1) {
      Applet var10000 = uwotm8.al.e;
      return super.getParameter(var1);
   }

   private int a(m var1, int var2) {
      if (var1.r != null && var2 < var1.r.length) {
         try {
            int[] var12 = var1.r[var2];
            var2 = 0;
            int var3 = 0;
            byte var4 = 0;

            while(true) {
               int var5 = var12[var3++];
               int var6 = 0;
               byte var7 = 0;
               if (var5 == 0) {
                  return var2;
               }

               if (var5 == 1) {
                  var6 = this.cv[var12[var3++]];
               }

               if (var5 == 2) {
                  var6 = this.en[var12[var3++]];
               }

               if (var5 == 3) {
                  var6 = this.bM[var12[var3++]];
               }

               int var8;
               int var9;
               int var10;
               if (var5 == 4) {
                  var8 = var12[var3++];
                  var9 = var12[var3++];
                  m var13 = uwotm8.m.a(var8);
                  if (var9 >= 0 && var9 < uwotm8.i.x && (!uwotm8.i.c(var9).g || db)) {
                     for(var10 = 0; var10 < var13.w.length; ++var10) {
                        if (var13.w[var10] == var9 + 1) {
                           var6 += var13.x[var10];
                        }
                     }
                  }
               }

               if (var5 == 5) {
                  var6 = this.A[var12[var3++]];
               }

               if (var5 == 6) {
                  var6 = dV[this.en[var12[var3++]] - 1];
               }

               if (var5 == 7) {
                  var6 = this.A[var12[var3++]] * 100 / 'ë';
               }

               if (var5 == 8) {
                  var6 = L.ak;
               }

               if (var5 == 9) {
                  for(var8 = 0; var8 < 25; ++var8) {
                     if (uwotm8.au.b[var8]) {
                        var6 += this.en[var8];
                     }
                  }
               }

               if (var5 == 10) {
                  int var10001 = var3++;
                  int var10000 = var12[var10001];
                  var10001 = var12[var10001];
                  m var14 = uwotm8.m.a(var10000);
                  if ((var8 = var12[var3++] + 1) >= 0 && var8 < uwotm8.i.x && db) {
                     for(var10 = 0; var10 < var14.w.length; ++var10) {
                        if (var14.w[var10] == var8) {
                           var6 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var5 == 11) {
                  var6 = this.fT;
               }

               if (var5 == 12) {
                  var6 = this.bU;
               }

               if (var5 == 13) {
                  var8 = this.A[var12[var3++]];
                  var9 = var12[var3++];
                  var6 = (var8 & 1 << var9) == 0 ? 0 : 1;
               }

               if (var5 == 14) {
                  var8 = var12[var3++];
                  VariableBits var15;
                  var8 = (var15 = uwotm8.VariableBits.a[var8]).b;
                  var10 = var15.c;
                  var6 = var15.d;
                  var6 = ad[var6 - var10];
                  var6 &= this.A[var8] >> var10;
               }

               if (var5 == 15) {
                  var7 = 1;
               }

               if (var5 == 16) {
                  var7 = 2;
               }

               if (var5 == 17) {
                  var7 = 3;
               }

               if (var5 == 18) {
                  var6 = (L.V >> 7) + this.eg;
               }

               if (var5 == 19) {
                  var6 = (L.W >> 7) + this.eh;
               }

               if (var5 == 20) {
                  var6 = var12[var3++];
               }

               if (var7 == 0) {
                  if (var4 == 0) {
                     var2 += var6;
                  }

                  if (var4 == 1) {
                     var2 -= var6;
                  }

                  if (var4 == 2 && var6 != 0) {
                     var2 /= var6;
                  }

                  if (var4 == 3) {
                     var2 *= var6;
                  }

                  var4 = 0;
               } else {
                  var4 = var7;
               }
            }
         } catch (Exception var11) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   private void a(Sprite var1, int var2, int var3) {
      int var4;
      if ((var4 = var3 * var3 + var2 * var2) > 4225 && var4 < 90000) {
         int var12 = this.V & 2047;
         var4 = uwotm8.D_1.D[var12];
         var12 = uwotm8.D_1.E[var12];
         var4 = (var4 << 8) / 256;
         var12 = (var12 << 8) / 256;
         int var5 = var2 * var4 + var3 * var12 >> 16;
         var12 = var2 * var12 - var3 * var4 >> 16;
         double var10;
         var12 = (int)(Math.sin(var10 = Math.atan2((double)var5, (double)var12)) * 58.0D);
         var2 = (int)(Math.cos(var10) * 52.0D);
         Point var13;
         var4 = (var13 = t.b(false)).x + t.c().x + 68;
         var3 = var13.y + t.c().y + 83;
         this.dE.a(var3 - var2 - 20, var10, var4 + var12 + 4 - 10);
      } else {
         this.b(var1, var3, var2);
      }
   }

   private void b(Sprite var1, int var2, int var3) {
      if (var1 != null) {
         int var4 = this.V & 2047;
         if (var1.b + var1.c + var2 * var2 + var3 * var3 <= 6400) {
            int var5 = uwotm8.D_1.D[var4];
            var4 = uwotm8.D_1.E[var4];
            var5 = (var5 << 8) / 256;
            var4 = (var4 << 8) / 256;
            int var6 = var3 * var5 + var2 * var4 >> 16;
            var2 = var3 * var4 - var2 * var5 >> 16;
            Point var7;
            var4 = (var7 = t.b(false)).x + t.c().x + 69;
            var3 = var7.y + t.c().y + 78;
            var1.d(var4 + var6 - var1.d / 2 + 4, var3 - var2 - var1.e / 2 - 4);
         }
      }
   }

   private void a(u var1, int var2) {
      this.e(var1.V, var2, var1.W);
   }

   private void e(int var1, int var2, int var3) {
      if (var1 >= 128 && var3 >= 128 && var1 <= 13056 && var3 <= 13056) {
         var2 = this.b(this.cu, var3, var1) - var2;
         var1 -= this.bG;
         var2 -= this.bH;
         var3 -= this.bI;
         int var4 = uwotm8.D_1.D[this.bJ];
         int var5 = uwotm8.D_1.E[this.bJ];
         int var6 = uwotm8.D_1.D[this.bK];
         int var7 = uwotm8.D_1.E[this.bK];
         int var8 = var3 * var6 + var1 * var7 >> 16;
         var3 = var3 * var7 - var1 * var6 >> 16;
         var1 = var8;
         var8 = var2 * var5 - var3 * var4 >> 16;
         var3 = var2 * var4 + var3 * var5 >> 16;
         if (var3 >= 50) {
            this.dd = uwotm8.r.e + (var1 << l) / var3;
            this.de = uwotm8.r.p + (var8 << l) / var3;
         } else {
            this.dd = -1;
            this.de = -1;
         }
      } else {
         this.dd = -1;
         this.de = -1;
      }
   }

   private void W() {
      try {
         if (uwotm8.Settings.j) {
            this.X();
            this.Y();
            this.Z();
            this.aa();
            return;
         }
      } catch (Exception var1) {
         ;
      }

   }

   private void X() {
      boolean var1;
      int var2 = (var1 = a == com.runescape.a.a) ? 0 : c - 240;
      int var4 = var1 ? 18 : 22;
      int var3 = uwotm8.aH_1.d() ? 2 : 0;
      aB_1.a("xpdrop", this.aS == 0 ? var3 + 1 : var3).d(var2, var4);
   }

   private void Y() {
      boolean var1 = a == com.runescape.a.a;
      int var2 = this.cv[3];
      int var3 = this.en[3];
      double var5 = (double)(var3 = (int)((double)var2 / (double)var3 * 100.0D)) / 100.0D;
      int var4 = 26 - (int)(var5 * 26.0D);
      boolean var10 = uwotm8.Settings.k;
      Point var6 = new Point(!var10 ? 0 : 192, 40);
      Point var7 = new Point(!var10 ? c - 240 : c - 57, 44);
      int var8 = var1 ? var6.x : var7.x;
      int var9 = var1 ? var6.y : var7.y;
      aB_1.a("orbs", this.aS == 1 ? (!var10 ? 1 : 3) : (!var10 ? 0 : 2)).d(var8, var9);
      aB_1.a("orbs", 9).d(var8 + (!var10 ? 27 : 4), var9 + 4);
      Sprite var11;
      (var11 = aB_1.a("orbs", 4)).c = var4 < 0 ? 0 : var4;
      var11.d(var8 + (!var10 ? 27 : 4), var9 + 4);
      aB_1.a("orbs", 5).d(var8 + (!var10 ? 33 : 9), var9 + 10);
      this.af.a(q(var3), var8 + (!var10 ? 15 : 45), String.valueOf(var2), var9 + 26, true);
   }

   private void Z() {
      boolean var1 = a == com.runescape.a.a;
      int var2 = this.cv[5];
      int var3 = this.en[5];
      double var5 = (double)(var3 = (int)((double)var2 / (double)var3 * 100.0D)) / 100.0D;
      int var4 = 26 - (int)(var5 * 26.0D);
      boolean var10 = uwotm8.Settings.k;
      Point var6 = new Point(!var10 ? 2 : 190, 80);
      Point var7 = new Point(!var10 ? c - 238 : c - 57, 84);
      int var8 = var1 ? var6.x : var7.x;
      int var9 = var1 ? var6.y : var7.y;
      aB_1.a("orbs", this.aS == 2 ? (!var10 ? 1 : 3) : (!var10 ? 0 : 2)).d(var8, var9);
      aB_1.a("orbs", 12).d(var8 + (!var10 ? 27 : 4), var9 + 4);
      Sprite var11;
      (var11 = aB_1.a("orbs", 4)).c = var4 < 0 ? 0 : var4;
      var11.d(var8 + (!var10 ? 27 : 4), var9 + 4);
      aB_1.a("orbs", 6).d(var8 + (!var10 ? 30 : 7), var9 + 7);
      this.af.a(q(var3), var8 + (!var10 ? 15 : 45), String.valueOf(var2), var9 + 26, true);
   }

   private void aa() {
      boolean var1 = a == com.runescape.a.a;
      int var2 = this.fT;
      int var3;
      double var4 = (double)(var3 = (int)((double)this.fT / 100.0D * 100.0D)) / 100.0D;
      int var10 = 26 - (int)(var4 * 26.0D);
      boolean var5 = uwotm8.Settings.k;
      Point var6 = new Point(!var5 ? 18 : 174, 120);
      Point var7 = new Point(!var5 ? c - 222 : c - 57, 124);
      int var8 = var1 ? var6.x : var7.x;
      int var9 = var1 ? var6.y : var7.y;
      aB_1.a("orbs", this.aS == 3 ? (!var5 ? 1 : 3) : (!var5 ? 0 : 2)).d(var8, var9);
      aB_1.a("orbs", this.aT ? 15 : 14).d(var8 + (!var5 ? 27 : 4), var9 + 4);
      Sprite var11;
      (var11 = aB_1.a("orbs", 4)).c = var10 < 0 ? 0 : var10;
      var11.d(var8 + (!var5 ? 27 : 4), var9 + 4);
      aB_1.a("orbs", this.aT ? 8 : 7).d(var8 + (!var5 ? 33 : 10), var9 + 8);
      this.af.a(q(var3), var8 + (!var5 ? 15 : 45), String.valueOf(var2), var9 + 26, true);
   }

   private static int q(int var0) {
      if (var0 >= 75) {
         return 65280;
      } else if (var0 >= 50 && var0 <= 74) {
         return 16776960;
      } else {
         return var0 >= 25 && var0 <= 49 ? 16750623 : 16711680;
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      aa var10 = null;

      for(aa var11 = (aa)this.gp.b(); var11 != null; var11 = (aa)this.gp.d()) {
         if (var11.e == var7 && var11.g == var8 && var11.h == var5 && var11.f == var4) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         (var10 = new aa()).e = var7;
         var10.f = var4;
         var10.g = var8;
         var10.h = var5;
         this.a(var10);
         this.gp.a(var10);
      }

      var10.a = var2;
      var10.c = var6;
      var10.b = var3;
      var10.l = var9;
      var10.d = var1;
   }

   private boolean e(m var1) {
      if (var1.p == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.p.length; ++var2) {
            int var3 = this.a(var1, var2);
            int var4 = var1.q[var2];
            if (var1.p[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var1.p[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.p[var2] == 4) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private DataInputStream f(String var1) throws UnknownHostException, IOException {
      if (this.bp != null) {
         try {
            this.bp.close();
         } catch (Exception var4) {
            ;
         }

         this.bp = null;
      }

      this.bp = a(43595);
      this.bp.setSoTimeout(10000);
      InputStream var2 = this.bp.getInputStream();
      this.bp.getOutputStream().write(("JAGGRAB /" + var1 + "\n\n").getBytes());
      return new DataInputStream(var2);
   }

   public final void k() {
      this.hm = true;
   }

   private void c(I_1 var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (var2 == 84) {
         var3 = var1.e();
         var4 = this.hx + (var3 >> 4 & 7);
         var5 = this.hy + (var3 & 7);
         var6 = var1.g();
         var7 = var1.g();
         var8 = var1.g();
         M_1 var31;
         if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && (var31 = this.bn[this.cu][var4][var5]) != null) {
            for(w var24 = (w)var31.b(); var24 != null; var24 = (w)var31.d()) {
               if (var24.a == (var6 & 32767) && var24.b == var7) {
                  var24.b = var8;
                  break;
               }
            }

            this.c(var4, var5);
         }

      } else {
         int var9;
         if (var2 == 105) {
            var3 = var1.e();
            var4 = this.hx + (var3 >> 4 & 7);
            var5 = this.hy + (var3 & 7);
            var6 = var1.g();
            var8 = (var7 = var1.e()) >> 4 & 15;
            var9 = var7 & 7;
            if (L.a[0] >= var4 - var8 && L.a[0] <= var4 + var8 && L.b[0] >= var5 - var8 && L.b[0] <= var5 + var8 && this.bC && this.eA < 50) {
               this.c(var6, var9, 0);
            }
         }

         if (var2 == 215) {
            var3 = var1.x();
            var4 = var1.u();
            var5 = this.hx + (var4 >> 4 & 7);
            var6 = this.hy + (var4 & 7);
            var7 = var1.x();
            var8 = var1.g();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 != this.bX) {
               w var30;
               (var30 = new w()).a = var3;
               var30.b = var8;
               if (this.bn[this.cu][var5][var6] == null) {
                  this.bn[this.cu][var5][var6] = new M_1();
               }

               this.bn[this.cu][var5][var6].a(var30);
               this.c(var5, var6);
            }

         } else {
            w var26;
            if (var2 == 156) {
               var3 = var1.s();
               var4 = this.hx + (var3 >> 4 & 7);
               var5 = this.hy + (var3 & 7);
               var6 = var1.g();
               M_1 var28;
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && (var28 = this.bn[this.cu][var4][var5]) != null) {
                  for(var26 = (w)var28.b(); var26 != null; var26 = (w)var28.d()) {
                     if (var26.a == (var6 & 32767)) {
                        var26.D();
                        break;
                     }
                  }

                  if (var28.b() == null) {
                     this.bn[this.cu][var4][var5] = null;
                  }

                  this.c(var4, var5);
               }

            } else {
               int var10;
               int var11;
               int var12;
               int var13;
               int var15;
               if (var2 == 160) {
                  var3 = var1.u();
                  var4 = this.hx + (var3 >> 4 & 7);
                  var5 = this.hy + (var3 & 7);
                  var7 = (var6 = var1.u()) >> 2;
                  var8 = var6 & 3;
                  var9 = this.gn[var7];
                  var3 = var1.x();
                  if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                     var10 = this.gH[this.cu][var4][var5];
                     var11 = this.gH[this.cu][var4 + 1][var5];
                     var12 = this.gH[this.cu][var4 + 1][var5 + 1];
                     var13 = this.gH[this.cu][var4][var5 + 1];
                     ab var33;
                     if (var9 == 0 && (var33 = this.cO.e(this.cu, var4, var5)) != null) {
                        var15 = var33.h >> 14 & 32767;
                        if (var7 == 2) {
                           var33.f = new B_1(var15, var8 + 4, 2, var11, var12, var10, var13, var3, false);
                           var33.g = new B_1(var15, var8 + 1 & 3, 2, var11, var12, var10, var13, var3, false);
                        } else {
                           var33.f = new B_1(var15, var8, var7, var11, var12, var10, var13, var3, false);
                        }
                     }

                     ac var35;
                     if (var9 == 1 && (var35 = this.cO.f(var4, var5, this.cu)) != null) {
                        var35.f = new B_1(var35.g >> 14 & 32767, 0, 4, var11, var12, var10, var13, var3, false);
                     }

                     if (var9 == 2) {
                        v var37 = this.cO.g(var4, var5, this.cu);
                        if (var7 == 11) {
                           var7 = 10;
                        }

                        if (var37 != null) {
                           var37.e = new B_1(var37.m >> 14 & 32767, var8, var7, var11, var12, var10, var13, var3, false);
                        }
                     }

                     Z_1 var38;
                     if (var9 == 3 && (var38 = this.cO.h(var5, var4, this.cu)) != null) {
                        var38.d = new B_1(var38.e >> 14 & 32767, var8, 22, var11, var12, var10, var13, var3, false);
                     }
                  }

               } else {
                  if (var2 == 147) {
                     var3 = var1.u();
                     var4 = this.hx + (var3 >> 4 & 7);
                     var5 = this.hy + (var3 & 7);
                     var6 = var1.g();
                     byte var22 = (byte)(128 - var1.a[var1.b++]);
                     var8 = var1.w();
                     byte var23 = var1.v();
                     var3 = var1.g();
                     var11 = (var10 = var1.u()) >> 2;
                     var12 = var10 & 3;
                     var13 = this.gn[var11];
                     byte var14 = var1.f();
                     var15 = var1.g();
                     byte var25 = var1.v();
                     y var21;
                     if (var6 == this.bX) {
                        var21 = L;
                     } else {
                        var21 = this.cd[var6];
                     }

                     j var34;
                     if (var21 != null && (var34 = uwotm8.j.a(var15)) != null) {
                        int var16 = this.gH[this.cu][var4][var5];
                        int var17 = this.gH[this.cu][var4 + 1][var5];
                        int var18 = this.gH[this.cu][var4 + 1][var5 + 1];
                        int var19 = this.gH[this.cu][var4][var5 + 1];
                        D_1 var29;
                        if ((var29 = var34.a(var11, var12, var16, var17, var18, var19, -1)) != null) {
                           this.a(var3 + 1, -1, 0, var13, var5, 0, this.cu, var4, var8 + 1);
                           var21.an = var8 + R;
                           var21.ao = var3 + R;
                           var21.au = var29;
                           var3 = var34.d;
                           var8 = var34.l;
                           if (var12 == 1 || var12 == 3) {
                              var3 = var34.l;
                              var8 = var34.d;
                           }

                           var21.ar = (var4 << 7) + (var3 << 6);
                           var21.at = (var5 << 7) + (var8 << 6);
                           var21.as = this.b(this.cu, var21.at, var21.ar);
                           byte var20;
                           if (var14 > var22) {
                              var20 = var14;
                              var14 = var22;
                              var22 = var20;
                           }

                           if (var25 > var23) {
                              var20 = var25;
                              var25 = var23;
                              var23 = var20;
                           }

                           var21.aw = var4 + var14;
                           var21.ay = var4 + var22;
                           var21.ax = var5 + var25;
                           var21.az = var5 + var23;
                        }
                     }
                  }

                  if (var2 == 151) {
                     var3 = var1.s();
                     var4 = this.hx + (var3 >> 4 & 7);
                     var5 = this.hy + (var3 & 7);
                     var6 = var1.w();
                     var8 = (var7 = var1.u()) >> 2;
                     var9 = var7 & 3;
                     var3 = this.gn[var8];
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        this.a(-1, var6, var9, var3, var5, var8, this.cu, var4, 0);
                        this.dr = true;
                     }

                  } else if (var2 == 4) {
                     var3 = var1.e();
                     var4 = this.hx + (var3 >> 4 & 7);
                     var5 = this.hy + (var3 & 7);
                     var6 = var1.g();
                     var7 = var1.e();
                     var8 = var1.g();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var4 = (var4 << 7) + 64;
                        var5 = (var5 << 7) + 64;
                        t var27 = new t(this.cu, R, var8, var6, this.b(this.cu, var5, var4) - var7, var5, var4);
                        this.ex.a(var27);
                     }

                  } else if (var2 == 44) {
                     var3 = var1.y();
                     var4 = var1.g();
                     var5 = var1.e();
                     var6 = this.hx + (var5 >> 4 & 7);
                     var7 = this.hy + (var5 & 7);
                     if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                        (var26 = new w()).a = var3;
                        var26.b = var4;
                        if (this.bn[this.cu][var6][var7] == null) {
                           this.bn[this.cu][var6][var7] = new M_1();
                        }

                        this.bn[this.cu][var6][var7].a(var26);
                        this.c(var6, var7);
                     }

                  } else if (var2 == 101) {
                     var4 = (var3 = var1.t()) >> 2;
                     var5 = var3 & 3;
                     var6 = this.gn[var4];
                     var7 = var1.e();
                     var8 = this.hx + (var7 >> 4 & 7);
                     var9 = this.hy + (var7 & 7);
                     if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        this.a(-1, -1, var5, var6, var9, var4, this.cu, var8, 0);
                     }

                  } else {
                     if (var2 == 117) {
                        var3 = var1.e();
                        var4 = this.hx + (var3 >> 4 & 7);
                        var5 = this.hy + (var3 & 7);
                        var6 = var4 + var1.f();
                        var7 = var5 + var1.f();
                        var8 = var1.h();
                        var9 = var1.g();
                        var3 = var1.e() << 2;
                        var10 = var1.e() << 2;
                        var11 = var1.g();
                        var12 = var1.g();
                        var13 = var1.e();
                        int var32 = var1.e();
                        if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != 65535) {
                           var4 = (var4 << 7) + 64;
                           var5 = (var5 << 7) + 64;
                           var6 = (var6 << 7) + 64;
                           var7 = (var7 << 7) + 64;
                           z var36;
                           (var36 = new z(var13, var10, var11 + R, var12 + R, var32, this.cu, this.b(this.cu, var5, var4) - var3, var5, var4, var8, var9)).a(var11 + R, var7, this.b(this.cu, var7, var6) - var10, var6);
                           this.dO.a(var36);
                        }
                     }

                  }
               }
            }
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var5 > 0 && var1 > 0 && var5 <= 102 && var1 <= 102) {
         int var8 = 0;
         if (var6 == 0) {
            var8 = this.cO.i(var2, var5, var1);
         }

         if (var6 == 1) {
            var8 = this.cO.j(var2, var5, var1);
         }

         if (var6 == 2) {
            var8 = this.cO.k(var2, var5, var1);
         }

         if (var6 == 3) {
            var8 = this.cO.l(var2, var5, var1);
         }

         int var9;
         if (var8 != 0) {
            var9 = this.cO.c(var2, var5, var1, var8);
            var8 = var8 >> 14 & 32767;
            int var10 = var9 & 31;
            var9 >>= 6;
            j var11;
            if (var6 == 0) {
               this.cO.a(var5, var2, var1, (byte)-119);
               if ((var11 = uwotm8.j.a(var8)) != null && var11.p) {
                  this.gU[var2].a(var9, var10, var11.i, var5, var1);
               }
            }

            if (var6 == 1) {
               this.cO.a(var1, var2, var5);
            }

            if (var6 == 2) {
               this.cO.b(var2, var5, var1);
               if ((var11 = uwotm8.j.a(var8)) == null) {
                  return;
               }

               if (var5 + var11.d > 103 || var1 + var11.d > 103 || var5 + var11.l > 103 || var1 + var11.l > 103) {
                  return;
               }

               if (var11.p) {
                  this.gU[var2].a(var9, var11.d, var5, var1, var11.l, var11.i);
               }
            }

            if (var6 == 3) {
               this.cO.c(var2, var1, var5);
               if ((var11 = uwotm8.j.a(var8)) == null) {
                  return;
               }

               if (var11.p && var11.w) {
                  this.gU[var2].b(var1, var5);
               }
            }
         }

         if (var7 >= 0) {
            var9 = var2;
            if (var2 < 3 && (this.ho[1][var5][var1] & 2) == 2) {
               var9 = var2 + 1;
            }

            uwotm8.S_1.a(this.cO, var3, var1, var4, var9, this.gU[var2], this.gH, var5, var7, var2);
         }
      }

   }

   private void b(int var1, I_1 var2) {
      this.bv = 0;
      this.cg = 0;
      var2.n();
      int var6;
      int var7;
      int var9;
      int var10;
      if (var2.i(1) != 0) {
         if ((var6 = var2.i(2)) == 0) {
            this.ch[this.cg++] = 2047;
         } else if (var6 == 1) {
            var7 = var2.i(3);
            L.a(false, var7);
            if (var2.i(1) == 1) {
               this.ch[this.cg++] = 2047;
            }
         } else if (var6 == 2) {
            var7 = var2.i(3);
            L.a(true, var7);
            int var8 = var2.i(3);
            L.a(true, var8);
            if (var2.i(1) == 1) {
               this.ch[this.cg++] = 2047;
            }
         } else if (var6 == 3) {
            this.cu = var2.i(2);
            var7 = var2.i(1);
            if (var2.i(1) == 1) {
               this.ch[this.cg++] = 2047;
            }

            var9 = var2.i(7);
            var10 = var2.i(7);
            L.a(var10, var9, var7 == 1);
         }
      }

      I_1 var4 = var2;
      Client var3 = this;
      int var5;
      if ((var5 = var2.i(8)) < this.ce) {
         for(var6 = var5; var6 < var3.ce; ++var6) {
            var3.bw[var3.bv++] = var3.cf[var6];
         }
      }

      if (var5 > var3.ce) {
    	  uwotm8.al.b(S + " Too many players");
         throw new RuntimeException("eek");
      } else {
         var3.ce = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = var3.cf[var6];
            y var13 = var3.cd[var7];
            if (var4.i(1) == 0) {
               var3.cf[var3.ce++] = var7;
               var13.I = R;
            } else if ((var10 = var4.i(2)) == 0) {
               var3.cf[var3.ce++] = var7;
               var13.I = R;
               var3.ch[var3.cg++] = var7;
            } else if (var10 == 1) {
               var3.cf[var3.ce++] = var7;
               var13.I = R;
               var9 = var4.i(3);
               var13.a(false, var9);
               if (var4.i(1) == 1) {
                  var3.ch[var3.cg++] = var7;
               }
            } else if (var10 == 2) {
               var3.cf[var3.ce++] = var7;
               var13.I = R;
               var9 = var4.i(3);
               var13.a(true, var9);
               var9 = var4.i(3);
               var13.a(true, var9);
               if (var4.i(1) == 1) {
                  var3.ch[var3.cg++] = var7;
               }
            } else if (var10 == 3) {
               var3.bw[var3.bv++] = var7;
            }
         }

         this.b(var2, var1);
         this.a(var2);

         int var11;
         for(var11 = 0; var11 < this.bv; ++var11) {
            int var12 = this.bw[var11];
            if (this.cd[var12].I != R) {
               this.cd[var12] = null;
            }
         }

         if (var2.b != var1) {
            uwotm8.al.b("Error packet size mismatch in getplayer pos:" + var2.b + " psize:" + var1);
            throw new RuntimeException("eek");
         } else {
            for(var11 = 0; var11 < this.ce; ++var11) {
               if (this.cd[this.cf[var11]] == null) {
                  uwotm8.al.b(S + " null entry in pl list - pos:" + var11 + " size:" + this.ce);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private static void a(String var0, int var1, int var2) {
      m var3;
      if ((var3 = uwotm8.m.a(var1, var2)) != null) {
         var3.R = var0;
         if (var3.l == M[aa]) {
            P = true;
         }
      }

   }

   private void j(int var1, int var2) {
      this.eo[429] = var2;
      if (this.A[429] != var2) {
         this.A[429] = var2;
         this.i(429);
         P = true;
         if (this.em != -1) {
            ab = true;
         }
      }

   }

   public final void b(int var1, int var2) {
      this.eo[var1] = var2;
      if (this.A[var1] != var2) {
         this.A[var1] = var2;
         P = true;
         if (this.em != -1) {
            ab = true;
         }
      }

   }

   private boolean ab() {
      if (this.gj == null) {
         return false;
      } else {
         String var1;
         int var2;
         try {
            int var119;
            if ((var119 = this.gj.c()) == 0) {
               return false;
            }

            if (this.dK == -1) {
               this.gj.a(this.eU.a, 1);
               this.dK = this.eU.a[0] & 255;
               if (this.dD != null) {
                  this.dK = this.dK - this.dD.a() & 255;
               }

               this.dJ = uwotm8.ah.a[this.dK];
               --var119;
            }

            if (this.dJ == -1) {
               if (var119 <= 0) {
                  return false;
               }

               this.gj.a(this.eU.a, 1);
               this.dJ = this.eU.a[0] & 255;
               --var119;
            }

            if (this.dJ == -2) {
               if (var119 <= 1) {
                  return false;
               }

               this.gj.a(this.eU.a, 2);
               this.eU.b = 0;
               this.dJ = this.eU.g();
               var119 -= 2;
            }

            if (var119 < this.dJ) {
               return false;
            }

            this.eU.b = 0;
            this.gj.a(this.eU.a, this.dJ);
            this.dL = 0;
            this.bz = this.by;
            this.by = this.bx;
            this.bx = this.dK;
            int var3;
            int var4;
            boolean var5;
            int var6;
            int var9;
            long var10;
            int var11;
            int var66;
            int var76;
            int var77;
            int var90;
            int var91;
            int var92;
            int var96;
            int var97;
            int var98;
            int var99;
            int var100;
            int var102;
            int var109;
            String var121;
            String var122;
            int var123;
            m var124;
            int var130;
            switch(this.dK) {
            case 1:
               int var141;
               for(var141 = 0; var141 < this.cd.length; ++var141) {
                  if (this.cd[var141] != null) {
                     this.cd[var141].y = -1;
                  }
               }

               for(var141 = 0; var141 < this.bs.length; ++var141) {
                  if (this.bs[var141] != null) {
                     this.bs[var141].y = -1;
                  }
               }

               this.dK = -1;
               return true;
            case 4:
            case 44:
            case 84:
            case 101:
            case 105:
            case 117:
            case 147:
            case 151:
            case 156:
            case 160:
            case 215:
               this.c(this.eU, this.dK);
               this.dK = -1;
               return true;
            case 8:
               var76 = this.eU.y();
               var77 = this.eU.y();
               int var78 = this.eU.g();
               m var79;
               if ((var79 = uwotm8.m.a(var76, var77)) != null) {
                  var79.Z = 1;
                  var79.aa = var78;
               }

               this.dK = -1;
               return true;
            case 24:
               this.C = this.eU.u();
               if (this.C == aa) {
                  if (this.C == 3) {
                     aa = 1;
                  } else {
                     aa = 3;
                  }

                  P = true;
               }

               this.dK = -1;
               return true;
            case 27:
               this.hn = false;
               this.ac = 1;
               this.dG = "";
               ab = true;
               this.dK = -1;
               return true;
            case 34:
               P = true;
               int var106 = this.eU.w();
               int var107 = this.eU.w();
               m var108;
               if ((var108 = uwotm8.m.a(var106, var107)) != null) {
                  while(this.eU.b < this.dJ) {
                     var109 = this.eU.g();
                     int var110 = this.eU.g();
                     int var111;
                     if ((var111 = this.eU.e()) == 255) {
                        var111 = this.eU.j();
                     }

                     if (var109 >= 0 && var109 < var108.w.length) {
                        var108.w[var109] = var110;
                        var108.x[var109] = var111;
                     }
                  }
               }

               this.dK = -1;
               return true;
            case 35:
               var119 = this.eU.e();
               var2 = this.eU.e();
               var3 = this.eU.e();
               var4 = this.eU.e();
               this.bR[var119] = true;
               this.bQ[var119] = var2;
               this.gC[var119] = var3;
               this.cz[var119] = var4;
               this.ed[var119] = 0;
               this.dK = -1;
               return true;
            case 36:
               var100 = this.eU.w();
               byte var148 = this.eU.f();
               this.eo[var100] = var148;
               if (this.A[var100] != var148) {
                  this.A[var100] = var148;
                  this.i(var100);
                  P = true;
                  if (this.em != -1) {
                     ab = true;
                  }
               }

               this.dK = -1;
               return true;
            case 50:
               long var140 = this.eU.k();
               int var53 = this.eU.e();
               var122 = uwotm8.StringUtils.c(uwotm8.StringUtils.a(var140));

               for(var3 = 0; var3 < this.ck; ++var3) {
                  if (var140 == this.cV[var3]) {
                     if (this.bm[var3] != var53) {
                        this.bm[var3] = var53;
                        P = true;
                        if (var53 >= 2) {
                           this.a(var122 + " has logged in.", 5, "");
                        }

                        if (var53 <= 1) {
                           this.a(var122 + " has logged out.", 5, "");
                        }
                     }

                     var122 = null;
                  }
               }

               if (var122 != null && this.ck < 200) {
                  this.cV[this.ck] = var140;
                  this.eT[this.ck] = var122;
                  this.bm[this.ck] = var53;
                  ++this.ck;
                  P = true;
               }

               boolean var137 = false;

               while(!var137) {
                  var137 = true;

                  for(var119 = 0; var119 < this.ck - 1; ++var119) {
                     if (this.bm[var119] != cZ && this.bm[var119 + 1] == cZ || this.bm[var119] == 0 && this.bm[var119 + 1] != 0) {
                        var2 = this.bm[var119];
                        this.bm[var119] = this.bm[var119 + 1];
                        this.bm[var119 + 1] = var2;
                        var121 = this.eT[var119];
                        this.eT[var119] = this.eT[var119 + 1];
                        this.eT[var119 + 1] = var121;
                        long var143 = this.cV[var119];
                        this.cV[var119] = this.cV[var119 + 1];
                        this.cV[var119 + 1] = var143;
                        P = true;
                        var137 = false;
                     }
                  }
               }

               this.dK = -1;
               return true;
            case 53:
               P = true;
               int var87 = this.eU.w();
               int var88 = this.eU.w();
               m var89;
               if ((var89 = uwotm8.m.a(var87, var88)) != null) {
                  var90 = this.eU.g();

                  for(var91 = 0; var91 < var90; ++var91) {
                     if ((var92 = this.eU.e()) == 255) {
                        var92 = this.eU.C();
                     }

                     var89.w[var91] = this.eU.y();
                     var89.x[var91] = var92;
                  }

                  for(var91 = var90; var91 < var89.w.length; ++var91) {
                     var89.w[var91] = 0;
                     var89.x[var91] = 0;
                  }
               }

               this.dK = -1;
               return true;
            case 60:
               this.hy = this.eU.e();
               this.hx = this.eU.t();

               while(this.eU.b < this.dJ) {
                  var119 = this.eU.e();
                  this.c(this.eU, var119);
               }

               this.dK = -1;
               return true;
            case 61:
               this.ew = this.eU.e();
               this.dK = -1;
               return true;
            case 64:
               this.hx = this.eU.t();
               this.hy = this.eU.u();

               for(var119 = this.hx; var119 < this.hx + 8; ++var119) {
                  for(var2 = this.hy; var2 < this.hy + 8; ++var2) {
                     if (this.bn[this.cu][var119][var2] != null) {
                        this.bn[this.cu][var119][var2] = null;
                        this.c(var119, var2);
                     }
                  }
               }

               for(aa var139 = (aa)this.gp.b(); var139 != null; var139 = (aa)this.gp.d()) {
                  if (var139.g >= this.hx && var139.g < this.hx + 8 && var139.h >= this.hy && var139.h < this.hy + 8 && var139.e == this.cu) {
                     var139.d = 0;
                  }
               }

               this.dK = -1;
               return true;
            case 65:
               this.a(this.eU, this.dJ);
               this.dK = -1;
               return true;
            case 68:
               for(int var144 = 0; var144 < this.A.length; ++var144) {
                  if (this.A[var144] != this.eo[var144]) {
                     this.A[var144] = this.eo[var144];
                     this.i(var144);
                     P = true;
                  }
               }

               this.dK = -1;
               return true;
            case 70:
               var119 = this.eU.w();
               var2 = this.eU.w();
               var3 = this.eU.h();
               var4 = this.eU.h();
               if ((var124 = uwotm8.m.a(var119, var2)) != null) {
                  var124.i = var3;
                  var124.j = var4;
               }

               this.dK = -1;
               return true;
            case 71:
               var11 = this.eU.g();
               var6 = this.eU.s();
               if (var11 == 65535) {
                  var11 = -1;
               }

               M[var6] = var11;
               P = true;
               K = true;
               this.dK = -1;
               return true;
            case 72:
               var119 = this.eU.w();
               var2 = this.eU.w();
               m var136;
               if ((var136 = uwotm8.m.a(var119, var2)) != null) {
                  for(var4 = 0; var4 < var136.w.length; ++var4) {
                     var136.w[var4] = 0;
                     var136.x[var4] = 0;
                  }
               }

               this.dK = -1;
               return true;
            case 73:
            case 241:
               var119 = this.eG;
               var2 = this.eH;
               if (this.dK == 73) {
                  var119 = this.eU.x();
                  var2 = this.eU.g();
                  this.gb = false;
               }

               if (this.dK == 241) {
                  var2 = this.eU.x();
                  this.eU.n();
                  var119 = 0;

                  while(true) {
                     if (var119 >= 4) {
                        this.eU.o();
                        var119 = this.eU.g();
                        this.gb = true;
                        break;
                     }

                     for(var3 = 0; var3 < 13; ++var3) {
                        for(var4 = 0; var4 < 13; ++var4) {
                           if (this.eU.i(1) == 1) {
                              this.fK[var119][var3][var4] = this.eU.i(26);
                           } else {
                              this.fK[var119][var3][var4] = -1;
                           }
                        }
                     }

                     ++var119;
                  }
               }

               if (this.eG == var119 && this.eH == var2 && this.dX == 2) {
                  this.dK = -1;
                  return true;
               }

               this.eG = var119;
               this.eH = var2;
               this.eg = this.eG - 6 << 3;
               this.eh = this.eH - 6 << 3;
               this.fS = (this.eG / 8 == 48 || this.eG / 8 == 49) && this.eH / 8 == 48;
               if (this.eG / 8 == 48 && this.eH / 8 == 148) {
                  this.fS = true;
               }

               this.dX = 1;
               this.bk = System.currentTimeMillis();
               gg.a();
               var119 = a == com.runescape.a.a ? 200 : c / 2 - 55;
               var3 = a == com.runescape.a.a ? 150 : d / 2 - 45;
               uwotm8.p.c(var119, 130, 22, 16777215, var3);
               uwotm8.p.b(20, var3 + 1, var119 + 1, 0, 128);
               this.hz.a(0, "Loading - please wait.", var3 + 18, var119 + 68);
               this.hz.a(16777215, "Loading - please wait.", var3 + 17, var119 + 67);
               gg.a(a == com.runescape.a.a ? 4 : 0, super.ao, a == com.runescape.a.a ? 4 : 0);
               if (this.dK == 73) {
                  var4 = 0;
                  var123 = (this.eG - 6) / 8;

                  label1265:
                  while(true) {
                     if (var123 > (this.eG + 6) / 8) {
                        this.gt = new byte[var4][];
                        this.hf = new byte[var4][];
                        this.gV = new int[var4];
                        this.gW = new int[var4];
                        this.gX = new int[var4];
                        var4 = 0;
                        var123 = (this.eG - 6) / 8;

                        while(true) {
                           if (var123 > (this.eG + 6) / 8) {
                              break label1265;
                           }

                           for(var119 = (this.eH - 6) / 8; var119 <= (this.eH + 6) / 8; ++var119) {
                              this.gV[var4] = (var123 << 8) + var119;
                              if (this.fS && (var119 == 49 || var119 == 149 || var119 == 147 || var123 == 50 || var123 == 49 && var119 == 47)) {
                                 this.gW[var4] = -1;
                                 this.gX[var4] = -1;
                              } else {
                                 if ((var2 = this.gW[var4] = this.E.a(0, var119, var123)) != -1) {
                                    this.E.a(3, var2);
                                 }

                                 if ((var3 = this.gX[var4] = this.E.a(1, var119, var123)) != -1) {
                                    this.E.a(3, var3);
                                 }
                              }

                              ++var4;
                           }

                           ++var123;
                        }
                     }

                     for(var119 = (this.eH - 6) / 8; var119 <= (this.eH + 6) / 8; ++var119) {
                        ++var4;
                     }

                     ++var123;
                  }
               }

               if (this.dK == 241) {
                  var4 = 0;
                  int[] var126 = new int[676];
                  var119 = 0;

                  label1226:
                  while(true) {
                     int var7;
                     int var8;
                     if (var119 >= 4) {
                        this.gt = new byte[var4][];
                        this.hf = new byte[var4][];
                        this.gV = new int[var4];
                        this.gW = new int[var4];
                        this.gX = new int[var4];
                        var119 = 0;

                        while(true) {
                           if (var119 >= var4) {
                              break label1226;
                           }

                           var3 = (var2 = this.gV[var119] = var126[var119]) >> 8 & 255;
                           var6 = var2 & 255;
                           if ((var7 = this.gW[var119] = this.E.a(0, var6, var3)) != -1) {
                              this.E.a(3, var7);
                           }

                           if ((var8 = this.gX[var119] = this.E.a(1, var6, var3)) != -1) {
                              this.E.a(3, var8);
                           }

                           ++var119;
                        }
                     }

                     for(var2 = 0; var2 < 13; ++var2) {
                        for(var3 = 0; var3 < 13; ++var3) {
                           if ((var6 = this.fK[var119][var2][var3]) != -1) {
                              var7 = var6 >> 14 & 1023;
                              var8 = var6 >> 3 & 2047;
                              var9 = (var7 / 8 << 8) + var8 / 8;

                              for(var130 = 0; var130 < var4; ++var130) {
                                 if (var126[var130] == var9) {
                                    var9 = -1;
                                 }
                              }

                              if (var9 != -1) {
                                 var126[var4++] = var9;
                              }
                           }
                        }
                     }

                     ++var119;
                  }
               }

               var4 = this.eg - this.ei;
               var123 = this.eh - this.ej;
               this.ei = this.eg;
               this.ej = this.eh;

               for(var119 = 0; var119 < 16384; ++var119) {
                  Npc var129;
                  if ((var129 = this.bs[var119]) != null) {
                     for(var3 = 0; var3 < 10; ++var3) {
                        var129.a[var3] -= var4;
                        var129.b[var3] -= var123;
                     }

                     var129.V -= var4 << 7;
                     var129.W -= var123 << 7;
                  }
               }

               for(var119 = 0; var119 < 2048; ++var119) {
                  y var131;
                  if ((var131 = this.cd[var119]) != null) {
                     for(var3 = 0; var3 < 10; ++var3) {
                        var131.a[var3] -= var4;
                        var131.b[var3] -= var123;
                     }

                     var131.V -= var4 << 7;
                     var131.W -= var123 << 7;
                  }
               }

               this.eS = true;
               byte var138 = 0;
               byte var133 = 104;
               byte var134 = 1;
               if (var4 < 0) {
                  var138 = 103;
                  var133 = -1;
                  var134 = -1;
               }

               byte var127 = 0;
               byte var125 = 104;
               byte var128 = 1;
               if (var123 < 0) {
                  var127 = 103;
                  var125 = -1;
                  var128 = -1;
               }

               for(var9 = var138; var9 != var133; var9 += var134) {
                  for(var130 = var127; var130 != var125; var130 += var128) {
                     var119 = var9 + var4;
                     var11 = var130 + var123;

                     for(int var135 = 0; var135 < 4; ++var135) {
                        if (var119 >= 0 && var11 >= 0 && var119 < 104 && var11 < 104) {
                           this.bn[var135][var9][var130] = this.bn[var135][var119][var11];
                        } else {
                           this.bn[var135][var9][var130] = null;
                        }
                     }
                  }
               }

               for(aa var132 = (aa)this.gp.b(); var132 != null; var132 = (aa)this.gp.d()) {
                  var132.g -= var4;
                  var132.h -= var123;
                  if (var132.g < 0 || var132.h < 0 || var132.g >= 104 || var132.h >= 104) {
                     var132.D();
                  }
               }

               if (this.hq != 0) {
                  this.hq -= var4;
                  this.hr -= var123;
               }

               this.gc = false;
               this.gd = false;
               this.dK = -1;
               return true;
            case 74:
               if ((var119 = this.eU.w()) == 65535) {
                  var119 = -1;
               }

               if (!aW) {
                  if (var119 != this.cY && fW && this.hp == 0) {
                     this.gO = var119;
                     this.gP = true;
                     this.E.a(2, this.gO);
                  }

                  this.cY = var119;
               }

               this.dK = -1;
               return true;
            case 75:
               var130 = this.eU.y();
               var119 = this.eU.y();
               var11 = this.eU.y();
               m var12;
               if ((var12 = uwotm8.m.a(var130, var119)) != null) {
                  var12.Z = 2;
                  var12.aa = var11;
               }

               this.dK = -1;
               return true;
            case 78:
               this.hq = 0;
               this.dK = -1;
               return true;
            case 79:
               var2 = this.eU.w();
               var3 = this.eU.w();
               int var59 = this.eU.x();
               m var60;
               if ((var60 = uwotm8.m.a(var2, var3)) != null && var60.b == 0) {
                  if (var59 < 0) {
                     var59 = 0;
                  }

                  if (var59 > var60.s - var60.h) {
                     var59 = var60.s - var60.h;
                  }

                  var60.t = var59;
               }

               this.dK = -1;
               return true;
            case 81:
               this.b(this.dJ, this.eU);
               this.eS = false;
               this.dK = -1;
               return true;
            case 85:
               this.hy = this.eU.t();
               this.hx = this.eU.t();
               this.dK = -1;
               return true;
            case 87:
               var98 = this.eU.w();
               var99 = this.eU.B();
               this.eo[var98] = var99;
               if (this.A[var98] != var99) {
                  this.A[var98] = var99;
                  this.i(var98);
                  P = true;
                  if (this.em != -1) {
                     ab = true;
                  }
               }

               this.dK = -1;
               return true;
            case 97:
               l(var96 = this.eU.g());
               if (this.W != -1) {
                  P = true;
                  this.W = -1;
                  K = true;
               }

               if (this.ai != -1) {
                  this.ai = -1;
                  ab = true;
               }

               if (this.ac != 0) {
                  this.ac = 0;
                  ab = true;
               }

               v = var96;
               this.fU = false;
               this.S();
               this.h(0, 0);
               this.dK = -1;
               return true;
            case 99:
               this.dW = this.eU.e();
               this.dK = -1;
               return true;
            case 104:
               var119 = this.eU.t();
               var2 = this.eU.s();
               var121 = this.eU.l();
               if (var119 > 0 && var119 <= 5) {
                  if (var121.equalsIgnoreCase("null")) {
                     var121 = null;
                  }

                  this.fI[var119 - 1] = var121;
                  this.fJ[var119 - 1] = var2 == 0;
               }

               this.dK = -1;
               return true;
            case 106:
               aa = this.eU.t();
               P = true;
               K = true;
               this.dK = -1;
               return true;
            case 107:
               this.gc = false;
               this.gd = false;

               for(var119 = 0; var119 < 5; ++var119) {
                  this.bR[var119] = false;
               }

               this.dK = -1;
               return true;
            case 108:
               this.gd = this.eU.e() == 1;
               this.dK = -1;
               return true;
            case 109:
               this.z();
               this.dK = -1;
               return false;
            case 110:
               if (aa == 12) {
                  P = true;
               }

               this.fT = this.eU.e();
               this.dK = -1;
               return true;
            case 114:
               this.fq = this.eU.w() * 30;
               this.dK = -1;
               return true;
            case 115:
               if (this.eU.g() > 0) {
                  try {
                     this.fr = this.eU.l();
                  } catch (Exception var113) {
                     uwotm8.al.b("cde1");
                  }
               } else {
                  this.fr = "";
               }

               this.dK = -1;
               return true;
            case 121:
               var119 = this.eU.y();
               var2 = this.eU.x();
               if (!aW && fW) {
                  this.gO = var119;
                  this.gP = false;
                  this.E.a(2, this.gO);
                  this.hp = var2;
               }

               this.dK = -1;
               return true;
            case 122:
               int var80 = this.eU.y();
               int var81 = this.eU.y();
               int var82;
               int var83 = (var82 = this.eU.y()) >> 10 & 31;
               int var84 = var82 >> 5 & 31;
               int var85 = var82 & 31;
               m var86;
               if ((var86 = uwotm8.m.a(var80, var81)) != null) {
                  var86.T = (var83 << 19) + (var84 << 11) + (var85 << 3);
               }

               this.dK = -1;
               return true;
            case 126:
               try {
                  var76 = this.eU.x();
                  var77 = this.eU.x();
                  a(this.eU.l(), var76, var77);
               } catch (Exception var112) {
                  ;
               }

               this.dK = -1;
               return true;
            case 134:
               P = true;
               var4 = this.eU.e();
               var123 = this.eU.B();
               var130 = this.eU.e();
               if (this.dX == 2 && (var11 = var123 - this.bM[var4]) > 0 && this.bM[var4] >= 0) {
                  uwotm8.aH_1.a(var4, var11);
               }

               this.bM[var4] = var123;
               this.cv[var4] = var130;
               this.en[var4] = 1;

               for(var11 = 0; var11 < 98; ++var11) {
                  if (var123 >= dV[var11]) {
                     this.en[var4] = var11 + 2;
                  }
               }

               this.dK = -1;
               return true;
            case 142:
               int var75;
               l(var75 = this.eU.w());
               if (this.ai != -1) {
                  this.ai = -1;
                  ab = true;
               }

               if (this.ac != 0) {
                  this.ac = 0;
                  ab = true;
               }

               this.W = var75;
               K = true;
               P = true;
               v = -1;
               this.fU = false;
               this.dK = -1;
               return true;
            case 164:
               l(var109 = this.eU.w());
               if (this.W != -1) {
                  P = true;
                  this.W = -1;
                  K = true;
               }

               this.ai = var109;
               ab = true;
               v = -1;
               this.fU = false;
               this.dK = -1;
               return true;
            case 166:
               this.gc = true;
               this.fl = this.eU.e();
               this.fm = this.eU.e();
               this.fn = this.eU.g();
               this.fo = this.eU.e();
               this.fp = this.eU.e();
               if (this.fp >= 100) {
                  this.bG = (this.fl << 7) + 64;
                  this.bI = (this.fm << 7) + 64;
                  this.bH = this.b(this.cu, this.bI, this.bG) - this.fn;
               }

               this.dK = -1;
               return true;
            case 171:
               int var147 = this.eU.g();
               int var72 = this.eU.g();
               boolean var73 = this.eU.e() == 1;
               m var74;
               if ((var74 = uwotm8.m.a(var147, var72)) != null) {
                  var74.u = var73;
               }

               this.dK = -1;
               return true;
            case 174:
               var119 = this.eU.g();
               var2 = this.eU.e();
               var3 = this.eU.g();
               if (this.bC && this.eA < 50) {
                  this.c(var119, var2, var3);
               }

               this.dK = -1;
               return true;
            case 176:
               this.gi = this.eU.t();
               this.fX = this.eU.x();
               this.fC = this.eU.e();
               this.gz = this.eU.C();
               this.dI = this.eU.g();
               if (this.gz != 0 && v == -1) {
                  uwotm8.al.a(uwotm8.StringUtils.a(this.gz));
                  this.ac();
                  this.bW = "";
                  this.ga = false;
               }

               this.dK = -1;
               return true;
            case 177:
               this.gc = true;
               this.dy = this.eU.e();
               this.dz = this.eU.e();
               this.dA = this.eU.g();
               this.dB = this.eU.e();
               this.dC = this.eU.e();
               if (this.dC >= 100) {
                  var96 = (this.dy << 7) + 64;
                  var97 = (this.dz << 7) + 64;
                  var98 = this.b(this.cu, var97, var96) - this.dA;
                  var99 = var96 - this.bG;
                  var100 = var98 - this.bH;
                  int var101 = var97 - this.bI;
                  var102 = (int)Math.sqrt((double)(var99 * var99 + var101 * var101));
                  this.bJ = (int)(Math.atan2((double)var100, (double)var102) * 325.949D) & 2047;
                  this.bK = (int)(Math.atan2((double)var99, (double)var101) * -325.949D) & 2047;
                  if (this.bJ < 128) {
                     this.bJ = 128;
                  }

                  if (this.bJ > 383) {
                     this.bJ = 383;
                  }
               }

               this.dK = -1;
               return true;
            case 180:
               this.aY = this.eU.g();
               this.aZ = this.eU.g();
               this.f(this.aY, this.aZ);
               this.dK = -1;
               return true;
            case 185:
               var119 = this.eU.y();
               var2 = this.eU.y();
               if ((var124 = uwotm8.m.a(var119, var2)) != null) {
                  var124.Z = 3;
                  if (L.ae == null) {
                     var124.aa = (L.ag[0] << 25) + (L.ag[4] << 20) + (L.av[0] << 15) + (L.av[8] << 10) + (L.av[11] << 5) + L.av[1];
                  } else {
                     var124.aa = (int)(305419896L + L.ae.l);
                  }
               }

               this.dK = -1;
               return true;
            case 187:
               this.hn = false;
               this.ac = 2;
               this.dG = "";
               ab = true;
               this.dK = -1;
               return true;
            case 196:
               long var61 = this.eU.k();
               this.eU.j();
               var119 = this.eU.e();
               int var64 = this.eU.e();
               boolean var65 = false;

               for(var66 = 0; var66 < this.bj; ++var66) {
                  if (this.cx[var66] == var61) {
                     var65 = true;
                  }
               }

               if (!var65 && this.hj == 0) {
                  try {
                     String var145 = uwotm8.av.a(this.dJ - 14, this.eU);
                     String var146 = var64 > 0 ? g(var64) : "";
                     if (var119 > 0 && var119 <= 3) {
                        this.a(var145, 7, var146 + uwotm8.StringUtils.c(uwotm8.StringUtils.a(var61)), var119);
                     } else {
                        this.a(var145, 3, var146 + uwotm8.StringUtils.c(uwotm8.StringUtils.a(var61)), var119);
                     }
                  } catch (Exception var114) {
                     uwotm8.al.b("cde1");
                  }
               }

               this.dK = -1;
               return true;
            case 200:
               var102 = this.eU.g();
               int var103 = this.eU.g();
               int var104 = this.eU.h();
               m var105;
               if ((var105 = uwotm8.m.a(var102, var103)) != null) {
                  var105.ab = var104;
                  var105.al = 0;
                  var105.ak = 0;
               }

               this.dK = -1;
               return true;
            case 206:
               this.aj = this.eU.e();
               this.u = this.eU.e();
               this.ae = this.eU.e();
               ab = true;
               this.dK = -1;
               return true;
            case 208:
               if ((var9 = this.eU.z()) >= 0) {
                  l(var9);
                  this.dU = true;
               } else {
                  this.dU = false;
               }

               this.dT = var9;
               this.S();
               this.h(0, 0);
               this.dK = -1;
               return true;
            case 212:
               this.ba = this.eU.l();
               this.dK = -1;
               return true;
            case 213:
               this.cl = this.eU.e();
               if (this.cl > 0) {
                  for(var4 = 0; var4 < this.cl; ++var4) {
                     this.cW[var4] = this.eU.k();
                     this.cX[var4] = this.eU.e();
                  }
               }

               this.dK = -1;
               return true;
            case 214:
               this.bj = this.dJ / 8;
               if (this.bj > 0) {
                  for(var4 = 0; var4 < this.bj; ++var4) {
                     this.cx[var4] = this.eU.k();
                  }
               }

               this.dK = -1;
               return true;
            case 216:
               try {
                  var1 = this.eU.l();
                  var122 = this.eU.l();
                  var3 = this.eU.e();
                  var4 = this.eU.e();
                  var5 = false;
                  var10 = uwotm8.StringUtils.a(var1);

                  for(var6 = 0; var6 < this.bj; ++var6) {
                     if (this.cx[var6] == var10) {
                        var5 = true;
                     }
                  }

                  if (!var5) {
                     this.a(16, K(), (var4 > 0 ? g(var4) : "") + uwotm8.StringUtils.c(var1), var122, var3);
                  }
               } catch (Exception var116) {
                  var116.printStackTrace();
               }

               this.dK = -1;
               return true;
            case 217:
               try {
                  var1 = this.eU.l();
                  var122 = this.eU.l();
                  var3 = this.eU.e();
                  var4 = this.eU.e();
                  var5 = false;
                  var10 = uwotm8.StringUtils.a(var1);

                  for(var6 = 0; var6 < this.bj; ++var6) {
                     if (this.cx[var6] == var10) {
                        var5 = true;
                     }
                  }

                  if (!var5) {
                     this.a(9, this.ba, (var4 > 0 ? g(var4) : "") + uwotm8.StringUtils.c(var1), var122, var3);
                  }
               } catch (Exception var115) {
                  var115.printStackTrace();
               }

               this.dK = -1;
               return true;
            case 218:
               var97 = this.eU.A();
               this.em = var97;
               ab = true;
               this.dK = -1;
               return true;
            case 219:
               if (this.W != -1) {
                  this.W = -1;
                  P = true;
                  K = true;
               }

               if (this.ai != -1) {
                  this.ai = -1;
                  ab = true;
               }

               if (this.ac != 0) {
                  this.ac = 0;
                  ab = true;
               }

               if (this.aK) {
                  this.S();
               }

               v = -1;
               this.fU = false;
               this.dK = -1;
               return true;
            case 221:
               this.cm = this.eU.e();
               P = true;
               this.dK = -1;
               return true;
            case 230:
               var90 = this.eU.w();
               var91 = this.eU.w();
               var92 = this.eU.g();
               int var93 = this.eU.g();
               int var94 = this.eU.g();
               m var95;
               if ((var95 = uwotm8.m.a(var90, var91)) != null) {
                  var95.ae = var92;
                  var95.af = var93;
                  var95.ad = var94;
               }

               this.dK = -1;
               return true;
            case 240:
               if (aa == 12) {
                  P = true;
               }

               this.bU = this.eU.h();
               this.dK = -1;
               return true;
            case 246:
               var66 = this.eU.w();
               int var67 = this.eU.w();
               int var68 = this.eU.g();
               int var69 = this.eU.g();
               m var70;
               if ((var70 = uwotm8.m.a(var66, var67)) != null) {
                  if (var68 == 65535) {
                     var70.Z = 0;
                  } else {
                     i var71 = uwotm8.i.c(var68);
                     var70.Z = 4;
                     var70.aa = var68;
                     var70.ae = var71.t;
                     var70.af = var71.v;
                     var70.ad = var71.p * 100 / var69;
                  }
               }

               this.dK = -1;
               return true;
            case 248:
               var3 = this.eU.x();
               var119 = this.eU.g();
               if (this.ai != -1) {
                  this.ai = -1;
                  ab = true;
               }

               if (this.ac != 0) {
                  this.ac = 0;
                  ab = true;
               }

               if (!f) {
                  f = true;
               }

               v = var3;
               this.S();
               this.h(0, 0);
               this.W = var119;
               P = true;
               K = true;
               this.fU = false;
               this.dK = -1;
               return true;
            case 249:
               this.ep = this.eU.s();
               this.bX = this.eU.y();
               this.dK = -1;
               return true;
            case 253:
               var1 = this.eU.l();
               boolean var120 = this.eU.e() == 1;
               String var51;
               long var52;
               if (var1.endsWith(":tradereq:")) {
                  var52 = uwotm8.StringUtils.a(var51 = var1.substring(0, var1.indexOf(":")));
                  var120 = false;

                  for(var3 = 0; var3 < this.bj; ++var3) {
                     if (this.cx[var3] == var52) {
                        var120 = true;
                     }
                  }

                  if (!var120 && this.hj == 0) {
                     this.a("wishes to trade with you.", 4, var51);
                  }
               } else if (var1.endsWith("$link$") && var1.contains("+")) {
                  var51 = var1.substring(0, var1.indexOf("+"));
                  String var142 = (var1 = var1.substring(var51.length() + 1).trim()).substring(0, var1.indexOf("$"));
                  this.a(var51, 12, var142);
               } else if (var1.endsWith(":duelreq:")) {
                  var52 = uwotm8.StringUtils.a(var51 = var1.substring(0, var1.indexOf(":")));
                  var120 = false;

                  for(var3 = 0; var3 < this.bj; ++var3) {
                     if (this.cx[var3] == var52) {
                        var120 = true;
                     }
                  }

                  if (!var120 && this.hj == 0) {
                     this.a("wishes to duel with you.", 8, var51);
                  }
               } else if (!var1.endsWith(":chalreq:")) {
                  this.a(var1, 0, "", var120);
               } else {
                  var52 = uwotm8.StringUtils.a(var51 = var1.substring(0, var1.indexOf(":")));
                  var120 = false;

                  for(var3 = 0; var3 < this.bj; ++var3) {
                     if (this.cx[var3] == var52) {
                        var120 = true;
                     }
                  }

                  if (!var120 && this.hj == 0) {
                     var121 = var1.substring(var1.indexOf(":") + 1, var1.length() - 9);
                     this.a(var121, 8, var51);
                  }
               }

               this.dK = -1;
               return true;
            case 254:
               this.bF = this.eU.e();
               if (this.bF == 1) {
                  this.gM = this.eU.g();
               }

               if (this.bF >= 2 && this.bF <= 6) {
                  if (this.bF == 2) {
                     this.cH = 64;
                     this.cI = 64;
                  }

                  if (this.bF == 3) {
                     this.cH = 0;
                     this.cI = 64;
                  }

                  if (this.bF == 4) {
                     this.cH = 128;
                     this.cI = 64;
                  }

                  if (this.bF == 5) {
                     this.cH = 64;
                     this.cI = 0;
                  }

                  if (this.bF == 6) {
                     this.cH = 64;
                     this.cI = 128;
                  }

                  this.bF = 2;
                  this.cE = this.eU.g();
                  this.cF = this.eU.g();
                  this.cG = this.eU.e();
               }

               if (this.bF == 10) {
                  this.cD = this.eU.g();
               }

               this.dK = -1;
               return true;
            default:
               uwotm8.al.b("T1 - " + this.dK + "," + this.dJ + " - " + this.by + "," + this.bz);
            }
         } catch (IOException var117) {
            this.G();
         } catch (Exception var118) {
            var1 = "T2 - " + this.dK + "," + this.by + "," + this.bz + " - " + this.dJ + "," + (this.eg + L.a[0]) + "," + (this.eh + L.b[0]) + " - ";

            for(var2 = 0; var2 < this.dJ && var2 < 50; ++var2) {
               var1 = var1 + this.eU.a[var2] + ",";
            }

            uwotm8.al.b(var1);
         }

         this.dK = -1;
         return true;
      }
   }

   private void ac() {
      this.gy.writeOpCode(130);
      if (this.W != -1) {
         this.W = -1;
         P = true;
         this.fU = false;
         K = true;
      }

      if (this.ai != -1) {
         this.ai = -1;
         ab = true;
         this.fU = false;
      }

      v = -1;
      this.hU = -1;
   }

   private void g(String var1) {
      try {
         if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(var1));
         } else {
            System.out.println("This OS does not support Java desktop browse, Attempting to launch legacy browsing");
            String var2;
            if ((var2 = System.getProperty("os.name")).startsWith("Mac OS")) {
               Runtime var8 = Runtime.getRuntime();
               String[] var9 = new String[]{"osascript", "-e", "open location \"" + var1 + "\""};

               try {
                  var8.exec(var9);
               } catch (IOException var5) {
                  ;
               }
            } else if (var2.startsWith("Windows")) {
               Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler ".concat(String.valueOf(var1)));
            } else {
               String[] var7 = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
               String var3 = null;

               for(int var4 = 0; var4 < 7; ++var4) {
                  if (Runtime.getRuntime().exec(new String[]{"which", var7[var4]}).waitFor() == 0) {
                     var3 = var7[var4];
                     break;
                  }
               }

               if (var3 == null) {
                  throw new Exception("Could not find web browser");
               } else {
                  Runtime.getRuntime().exec(new String[]{var3, var1});
               }
            }
         }
      } catch (Exception var6) {
         if (Q) {
            this.a("Failed to open URL.", 0, "");
         } else {
            System.out.println("Failed to open URL.");
         }
      }
   }

   public Client() {
      this.aQ = c / 2;
      this.aR = d / 2;
      this.aS = -1;
      this.aT = false;
      this.aU = "";
      this.aV = true;
      this.aX = 0.8D;
      this.aY = 0;
      this.aZ = 1;
      this.bb = 500;
      this.bq = 0;
      this.df = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      this.fb = 3;
      this.fr = "";
      this.gn = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      this.gQ = 256;
      this.gR = true;
      this.gY = 100;
      if (!aW) {
         try {
            this.gS = new ao();
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

      this.a(com.runescape.a.a);
      hT = "vidyascape.org";
      this.hU = -1;
      this.bc = new int[500];
      this.bd = new boolean[500];
      this.be = 0;
      this.m = 0;
      this.n = 0;
      this.o = 0;
      this.p = -1;
      this.q = 0;
      this.bl = new int[104][104];
      this.bm = new int[200];
      this.bn = new M_1[4][104][104];
      this.bo = false;
      this.br = new I_1(new byte[5000]);
      this.bs = new Npc[16384];
      this.bu = new int[16384];
      this.bw = new int[1000];
      this.bB = uwotm8.I_1.a();
      this.bC = true;
      v = -1;
      this.bM = new int[25];
      this.bP = false;
      this.bQ = new int[5];
      this.bR = new boolean[5];
      this.bW = "";
      this.bX = -1;
      this.bY = false;
      this.ca = "";
      this.cb = 2048;
      this.cc = 2047;
      this.cd = new y[2048];
      this.cf = new int[2048];
      this.ch = new int[2048];
      this.ci = new I_1[2048];
      this.cn = new int[104][104];
      this.co = new byte[16384];
      this.cv = new int[25];
      this.cW = new long[100];
      this.cX = new int[100];
      this.cx = new long[100];
      this.cy = false;
      this.cz = new int[5];
      this.cA = new int[104][104];
      this.cJ = new int[500];
      this.cK = new String[500];
      this.cL = new String[500];
      this.cM = new String[500];
      this.w = new Sprite[24];
      this.cU = true;
      this.cV = new long[200];
      this.cY = -1;
      this.dd = -1;
      this.de = -1;
      this.y = new int[33];
      this.z = new c[6];
      this.A = new int[2000];
      this.dg = false;
      this.dh = 50;
      this.di = new int[50];
      this.dj = new int[50];
      this.dk = new int[50];
      this.dl = new int[50];
      this.dm = new int[50];
      this.dn = new int[50];
      this.xD = new int[50];
      this.dp = new String[50];
      this.ds = -1;
      this.dr = false;
      this.du = new Sprite[20];
      this.dw = new int[5];
      this.dx = false;
      this.dG = "";
      this.dO = new M_1();
      this.dS = false;
      this.dT = -1;
      this.ed = new int[5];
      this.ee = false;
      this.ef = new Sprite[100];
      this.em = -1;
      this.en = new int[25];
      this.eo = new int[2000];
      this.eq = true;
      this.eu = new int[152];
      this.gT = new int[152];
      this.C = -1;
      this.ex = new M_1();
      this.D = new int[33];
      this.ey = new m();
      this.ez = new k[100];
      this.eB = 5063219;
      this.eD = new int[7];
      this.eJ = new int[1000];
      this.eK = new int[1000];
      this.eS = false;
      this.eT = new String[200];
      this.eU = uwotm8.I_1.a();
      this.fc = new int[9];
      this.fd = new int[500];
      this.fe = new int[500];
      this.J = new int[500];
      this.ff = new int[500];
      this.fh = new Sprite[20];
      this.fi = new Sprite[20];
      this.fj = new Sprite[20];
      K = false;
      this.fD = "";
      this.fI = new String[5];
      this.fJ = new boolean[5];
      this.fK = new int[4][13][13];
      this.fR = new Sprite[1000];
      this.fS = false;
      this.fU = false;
      this.fV = new Sprite[8];
      fW = true;
      P = false;
      Q = false;
      this.ga = false;
      this.gb = false;
      this.gc = false;
      this.gd = false;
      this.gm = false;
      this.go = 201;
      this.gp = new M_1();
      this.gu = 128;
      this.W = -1;
      this.gy = uwotm8.I_1.a();
      this.X = new String[500];
      this.gC = new int[5];
      this.gD = new int[50];
      Z = 100;
      this.gF = "";
      this.gK = new k[2];
      aa = 3;
      ab = false;
      this.gP = true;
      this.gU = new CollisionMap[4];
      this.gZ = new int[50];
      this.ha = false;
      this.hh = new int[50];
      this.hi = new int[50];
      this.hk = false;
      this.hm = false;
      this.hn = false;
      this.hv = "";
      this.hw = "";
      this.ai = -1;
      this.hL = new int[4000];
      this.hM = new int[4000];
   }
}

package uwotm8;

import java.awt.*;
import com.runescape.*;

public final class aD_1 extends aE_1
{
    private static Sprite a;
    private static final Point b;
    private Sprite[] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;
    private static final int[][] o;
    private static final String[][] p;
    private static final int[] q;
    private static final String[] r;
    private static final Rectangle s;
    private static final Rectangle t;
    
    static {
        b = new Point(54, 9);
        d = new int[] { 0, 1, 1, 1, 1, 1, 2, 3, 1, 1, 1, 1, 1, 4 };
        e = new int[] { 6, 44, 77, 110, 143, 176, 209 };
        f = new int[] { 0, 0, 0, 0, 0, 0, 0, 298, 298, 298, 298, 298, 298, 298 };
        g = new int[] { 11, 5, 6, 4, 4, 4, 5, 8, 5, 5, 6, 5, 8, 9 };
        h = new int[] { 9, 7, 7, 5, 2, 3, 7, 5, 8, 8, 4, 6, 4, 5 };
        i = new int[] { 7, 5, 6, 3, 4, 4, 3, 6, 5, 5, 6, 5, 8, 7 };
        j = new int[] { 7, 6, 6, 4, 1, 2, 5, 5, 6, 6, 2, 5, 4, 4 };
        k = new int[] { 5, 71, 137, 203, 269, 335, 401 };
        l = new int[] { 26, 86, 150, 212, 286, 349, 411 };
        m = new int[] { 158, 153, 153, 153, 153, 153, 153 };
        n = new int[] { 100, 164, 230, 296, 362, 428 };
        o = new int[][] { { 65280, 16776960, 16711680, 65535 }, { 65280, 16776960, 16711680 }, { 65280, 65535, 16711680 } };
        p = new String[][] { { "On", "Friends", "Off", "Hide" }, { "On", "Filtered", "Off" }, { "On", "Hidden", "Off" } };
        q = new int[] { 1, 0, 0, 2, 0, 2 };
        r = new String[] { "All", "Game", "Public", "Private", "Clan", "Trade", "Global" };
        s = new Rectangle(10, 8, 497, 112);
        t = new Rectangle(0, 0, 204, 275);
    }
    
    public aD_1() {
        this.c = new Sprite[10];
    }
    
    @Override
    public final void a() {
        final Sprite a = SpriteGroupLoader.a("frame_default", "redstones", 0);
        final Sprite a2 = SpriteGroupLoader.a("frame_default", "redstones", 1);
        final Sprite d;
        (d = a.d()).b();
        final Sprite d2;
        (d2 = a.d()).c();
        final Sprite d3;
        (d3 = d2.d()).b();
        this.c = new Sprite[] { a, a2, d, d2, d3 };
        aD_1.a = SpriteGroupLoader.a("frame_default", "map", 4);
    }
    
    @Override
    public final void a(final Client client, final boolean b) {
        Point b2 = null;
        final int x = (b2 = this.b(0 != 0)).x;
        final int y = b2.y;
        final int n = b2.x + 125;
        final int y2 = b2.y;
        final a a = Client.a;
        final a a2 = com.runescape.a.a;
        final int n2 = y2 + 82;
        aD_1.a.a(33, client.V, client.D, 256, client.y, 25, b2.y + ((Client.a == com.runescape.a.a) ? 3 : 4), b2.x + ((Client.a == com.runescape.a.a) ? 28 : 29), 33, 25);
        if (b) {
        	SpriteGroupLoader.a("frame_default", "map", (Client.a == com.runescape.a.a) ? 1 : 3).d(x, y);
            return;
        }
        uwotm8.Rasterizer2D.b(3, n2, n, 16777215, 3);
        SpriteGroupLoader.a("frame_default", "map", (Client.a == com.runescape.a.a) ? 0 : 2).d(x, y);
    }
    
    @Override
    public final void a(final Client client) {
        final Rectangle t = aD_1.t;
        final boolean b = Client.c >= Client.h;
        if (Client.a == com.runescape.a.a) {
        	SpriteGroupLoader.a("frame_default", "tabs", 0).d(0, 0);
            client.r.a(30, 37);
        }
        else {
            final int n = b ? (Client.c - 461) : (Client.c - 231);
            final int n2 = b ? (Client.d - 36) : (Client.d - 73);
            SpriteGroupLoader.a("frame_default", "tabs", b ? 3 : 2).d(n, n2);
            if (Client.f) {
                final int n3 = Client.c - ((int)t.getWidth() + (b ? 0 : 14));
                final int n4 = (int)t.getHeight();
                final int n5 = n3 + 7;
                final int n6 = n2 - (n4 - 7);
                uwotm8.Rasterizer2D.a(5260860, n2 - n4, t.width - 1, t.height - 1, 200, n3);
                client.r.a(n5, n6);
                SpriteGroupLoader.a("frame_default", "tabs", 1).d(n3, n2 - n4);
            }
        }
        if (client.W == -1) {
            if (Client.f && Client.aa >= 0 && Client.aa < 14) {
                if (Client.M[Client.aa] >= 0) {
                    if (Client.a == com.runescape.a.a) {
                        final Sprite n7;
                        if ((n7 = this.c[aD_1.d[Client.aa]]) != null) {
                            n7.d(aD_1.e[Client.aa % 7], aD_1.f[Client.aa]);
                        }
                    }
                    else {
                        final boolean b2 = Client.c >= Client.h;
                        final Sprite n8;
                        if ((n8 = this.c[1]) != null) {
                            final int n9 = b2 ? (Client.c - 461) : (Client.c - 231);
                            int n10 = b2 ? (Client.d - 36) : (Client.d - 73);
                            if (!b2 && Client.aa > 6) {
                                n10 += 36;
                            }
                            n8.d(n9 + 33 * (b2 ? Client.aa : (Client.aa % 7)), n10);
                        }
                    }
                }
            }
            int n11 = 0;
            int n12 = 0;
            final boolean b3 = Client.c >= Client.h;
            if (Client.a != com.runescape.a.a) {
                n11 = (b3 ? (Client.c - 462) : (Client.c - 231));
                n12 = (b3 ? (Client.d - 36) : (Client.d - 72));
            }
            for (int i = 0; i < 14; ++i) {
                int n13 = n11 + aD_1.e[i % 7] + aD_1.g[i];
                int n14 = n12 + aD_1.f[i] + aD_1.h[i];
                if (Client.a != com.runescape.a.a) {
                    n13 = n11 + 33 * (b3 ? i : (i % 7)) + aD_1.i[i];
                    n14 = n12 + aD_1.j[i];
                    if (!b3 && i > 6) {
                        n14 += 36;
                    }
                }
                boolean b4 = Client.M[i] != -1 && client.C != i;
                if (client.C == i) {
                    b4 = (Client.R % 20 < 10);
                }
                if (b4) {
                	SpriteGroupLoader.a("frame_default", "sideicons", i).d(n13, n14);
                }
            }
        }
        if (Client.f) {
            int n15 = (Client.a == com.runescape.a.a) ? 31 : (Client.c - 211);
            int n16 = (Client.a == com.runescape.a.a) ? 36 : (Client.d - 340);
            if (Client.a != com.runescape.a.a && b) {
                n15 += 16;
                n16 += 37;
            }
            if (client.W != -1) {
                client.a(n15, n16, 190, 260, uwotm8.m.a[client.W], -1, 0);
                return;
            }
            if (Client.M[Client.aa] != -1) {
                client.a(n15, n16, 190, 260, uwotm8.m.a[Client.M[Client.aa]], -1, 0);
            }
        }
    }
    
    @Override
    public final void b(final Client client) {
        if (client.aw != 1) {
            return;
        }
        if (Client.a == com.runescape.a.a) {
            if (client.au >= 516 && client.au <= 765 && client.av >= 168 && client.av <= 503) {
                for (int i = 0; i < 14; ++i) {
                    final Sprite n;
                    if (Client.M[i] != -1 && (n = this.c[aD_1.d[i]]) != null) {
                        final int n3;
                        final int n2 = (n3 = 516 + aD_1.e[i % 7]) + n.b;
                        final int n5;
                        final int n4 = (n5 = 168 + aD_1.f[i]) + n.c;
                        if (client.au >= n3 && client.au < n2 && client.av >= n5 && client.av < n4) {
                            Client.aa = i;
                            Client.K = true;
                            Client.P = true;
                            return;
                        }
                    }
                }
            }
        }
        else {
            final boolean b;
            final int n6 = (b = (((Client.c >= Client.h) ? 1 : 0) != 0)) ? (Client.c - 461) : (Client.c - 231);
            final int n7 = b ? (Client.d - 36) : (Client.d - 73);
            if (client.au >= n6 && client.au <= Client.c && client.av >= n7 && client.av <= Client.d) {
                for (int j = 0; j < 14; ++j) {
                    if (Client.M[j] != -1) {
                        final int n9;
                        final int n8 = (n9 = n6 + 33 * (b ? j : (j % 7))) + 33;
                        int n10 = aD_1.f[j];
                        if (!b && j > 6) {
                            n10 += 36;
                        }
                        final int n11 = n7 + n10 + 36;
                        if (client.au >= n9 && client.au < n8 && client.av >= n10 && client.av < n11) {
                            if (Client.aa == j) {
                                Client.f = !Client.f;
                            }
                            else {
                                Client.f = true;
                            }
                            Client.aa = j;
                            Client.P = true;
                            Client.K = true;
                            return;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final void c(final Client client) {
        final int a = this.a(false);
        if (Client.e) {
            if (Client.g) {
                uwotm8.Rasterizer2D.a(13417370, a, 520, 143, 200, 0);
                SpriteGroupLoader.a("frame_default", "chat", 1).d(0, a);
                client.s.a(7, a + 6);
            }
            else {
            	SpriteGroupLoader.a("frame_default", "chat", 0).d(0, a);
                client.s.a(7, a + 6);
            }
        }
        if (Client.g) {
        	SpriteGroupLoader.a("frame_default", "chat", 2).d(0, Client.d - 23);
        }
        final int a2 = this.a(false);
        if (client.q >= 0 & client.q <= 6) {
        	SpriteGroupLoader.a("frame_default", "chat", 4).d(aD_1.k[client.q], a2 + 142);
        }
        if (client.p >= 0 & client.p <= 6) {
        	SpriteGroupLoader.a("frame_default", "chat", (client.p == client.q) ? 5 : 3).d(aD_1.k[client.p], a2 + 142);
        }
        final int[] array = { client.o, client.aj, client.u, client.m, client.ae, client.n };
        for (int i = 0; i < 7; ++i) {
            client.af.a(true, aD_1.l[i], 16777215, aD_1.r[i], aD_1.m[i] + a2);
        }
        for (int j = 0; j < 6; ++j) {
            client.af.a(aD_1.o[aD_1.q[j]][array[j]], aD_1.n[j], aD_1.p[aD_1.q[j]][array[j]], a2 + 163, true);
        }
    }
    
    @Override
    public final void d(final Client client) {
        final int n = (Client.a != com.runescape.a.a) ? (Client.d - 21) : 482;
        if (client.au >= 5 && client.au <= 61 && client.av >= n && client.av <= Client.d) {
            client.p = 0;
            Client.ab = true;
            return;
        }
        if (client.au >= 71 && client.au <= 127 && client.av >= n && client.av <= Client.d) {
            client.p = 1;
            Client.ab = true;
            return;
        }
        if (client.au >= 137 && client.au <= 193 && client.av >= n && client.av <= Client.d) {
            client.p = 2;
            Client.ab = true;
            return;
        }
        if (client.au >= 203 && client.au <= 259 && client.av >= n && client.av <= Client.d) {
            client.p = 3;
            Client.ab = true;
            return;
        }
        if (client.au >= 269 && client.au <= 325 && client.av >= n && client.av <= Client.d) {
            client.p = 4;
            Client.ab = true;
            return;
        }
        if (client.au >= 335 && client.au <= 391 && client.av >= n && client.av <= Client.d) {
            client.p = 5;
            Client.ab = true;
            return;
        }
        if (client.au >= 401 && client.au <= 457 && client.av >= n && client.av <= Client.d) {
            client.p = 6;
            Client.ab = true;
            return;
        }
        if (client.p != -1) {
            client.p = -1;
            Client.ab = true;
        }
    }
    
    @Override
    public final void e(final Client client) {
        final int n = (Client.a != com.runescape.a.a) ? (Client.d - 21) : 482;
        if (client.au >= 5 && client.au <= 61 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "View All";
            client.J[1] = 999;
            client.N = 2;
            return;
        }
        if (client.au >= 71 && client.au <= 127 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "Off Game";
            client.J[1] = 1002;
            client.X[2] = "Filtered Game";
            client.J[2] = 1001;
            client.X[3] = "On Game";
            client.J[3] = 1000;
            client.X[4] = "View Game";
            client.J[4] = 998;
            client.N = 5;
            return;
        }
        if (client.au >= 137 && client.au <= 193 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "Hide public";
            client.J[1] = 997;
            client.X[2] = "Off public";
            client.J[2] = 996;
            client.X[3] = "Friends public";
            client.J[3] = 995;
            client.X[4] = "On public";
            client.J[4] = 994;
            client.X[5] = "View public";
            client.J[5] = 993;
            client.N = 6;
            return;
        }
        if (client.au >= 203 && client.au <= 259 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "Off private";
            client.J[1] = 992;
            client.X[2] = "Friends private";
            client.J[2] = 991;
            client.X[3] = "On private";
            client.J[3] = 990;
            client.X[4] = "View private";
            client.J[4] = 989;
            client.N = 5;
            return;
        }
        if (client.au >= 269 && client.au <= 325 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "Off clan";
            client.J[1] = 983;
            client.X[2] = "Hidden clan";
            client.J[2] = 982;
            client.X[3] = "On clan";
            client.J[3] = 981;
            client.X[4] = "View clan";
            client.J[4] = 980;
            client.N = 5;
            return;
        }
        if (client.au >= 335 && client.au <= 391 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "Off trade";
            client.J[1] = 987;
            client.X[2] = "Friends trade";
            client.J[2] = 986;
            client.X[3] = "On trade";
            client.J[3] = 985;
            client.X[4] = "View trade";
            client.J[4] = 984;
            client.N = 5;
            return;
        }
        if (client.au >= 401 && client.au <= 457 && client.av >= n && client.av <= Client.d) {
            client.X[1] = "Off global";
            client.J[1] = 1008;
            client.X[2] = "Hidden global";
            client.J[2] = 1007;
            client.X[3] = "On global";
            client.J[3] = 1006;
            client.X[4] = "View global";
            client.J[4] = 1005;
            client.N = 5;
        }
    }
    
    @Override
    public final int a(final boolean b) {
        if (b) {
            if (Client.a == com.runescape.a.a) {
                return 338;
            }
            return Client.d - 165;
        }
        else {
            if (Client.a == com.runescape.a.a) {
                return 0;
            }
            return Client.d - 165;
        }
    }
    
    @Override
    public final Rectangle b() {
        return aD_1.s;
    }
    
    @Override
    public final Point b(final boolean b) {
        return new Point((Client.a == com.runescape.a.a) ? (b ? 516 : 0) : (Client.c - 238), b ? 0 : ((Client.a == com.runescape.a.a) ? 0 : 3));
    }
    
    @Override
    public final Point c() {
        return aD_1.b;
    }
    
    @Override
    public final boolean d() {
        return false;
    }
    
    @Override
    public final Sprite a(final int n) {
        return SpriteGroupLoader.a("frame_default", "sideicons", 1);
    }
}

package uwotm8;

import java.awt.*;
import com.runescape.*;

public final class aC_1 extends aE_1
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
    private static final Rectangle u;
    
    static {
        b = new Point(54, 9);
        d = new int[] { 0, 1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8, 9 };
        e = new int[] { 17, 48, 76, 105, 148, 177, 204 };
        f = new int[] { 1, 1, 1, 1, 1, 1, 1, 297, 297, 297, 300, 297, 297, 297 };
        g = new int[] { 10, 4, 5, 6, 2, 2, 3, 8, 3, 3, 9, 2, 5, 4 };
        h = new int[] { 9, 7, 7, 4, 6, 6, 7, 2, 7, 7, 6, 5, 6, 6 };
        i = new int[] { 7, 4, 5, 1, 4, 4, 4, 5, 5, 5, 3, 3, 7, 6 };
        j = new int[] { 9, 7, 7, 4, 5, 5, 6, 4, 6, 6, 6, 4, 5, 5 };
        k = new int[] { 5, 71, 137, 203, 269, 335, 401 };
        l = new int[] { 26, 86, 150, 212, 286, 349, 411 };
        m = new int[] { 158, 153, 153, 153, 153, 153, 153 };
        n = new int[] { 100, 164, 230, 296, 362, 428 };
        o = new int[][] { { 65280, 16776960, 16711680, 65535 }, { 65280, 16776960, 16711680 }, { 65280, 65535, 16711680 } };
        p = new String[][] { { "On", "Friends", "Off", "Hide" }, { "On", "Filtered", "Off" }, { "On", "Hidden", "Off" } };
        q = new int[] { 1, 0, 0, 2, 0, 2 };
        r = new String[] { "All", "Game", "Public", "Private", "Clan", "Trade", "Global" };
        s = new Rectangle(20, 20, 486, 100);
        t = new Rectangle(10, 6, 497, 114);
        u = new Rectangle(0, 0, 204, 275);
    }
    
    public aC_1() {
        this.c = new Sprite[10];
    }
    
    @Override
    public final void a() {
        final Sprite a = SpriteGroupLoader.a("frame_classic", "redstones", 0);
        final Sprite a2 = SpriteGroupLoader.a("frame_classic", "redstones", 1);
        final Sprite a3 = SpriteGroupLoader.a("frame_classic", "redstones", 2);
        final Sprite d;
        (d = a2.d()).b();
        final Sprite d2;
        (d2 = a.d()).b();
        final Sprite d3;
        (d3 = a.d()).c();
        final Sprite d4;
        (d4 = a2.d()).c();
        final Sprite d5;
        (d5 = a3.d()).c();
        final Sprite d6;
        (d6 = d.d()).c();
        final Sprite d7;
        (d7 = d2.d()).c();
        this.c = new Sprite[] { a, a2, a3, d, d2, d3, d4, d5, d6, d7 };
        aC_1.a = SpriteGroupLoader.a("frame_classic", "map", 4);
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
        aC_1.a.drawSpriteRotated(33, client.V, client.D, 256, client.y, 25, b2.y + ((Client.a == com.runescape.a.a) ? 3 : 4), b2.x + ((Client.a == com.runescape.a.a) ? 28 : 29), 33, 25);
        if (b) {
        	SpriteGroupLoader.a("frame_classic", "map", (Client.a == com.runescape.a.a) ? 1 : 3).drawSprite(x, y);
            return;
        }
        uwotm8.Rasterizer2D.fillRectangle(3, n2, n, 16777215, 3);
        SpriteGroupLoader.a("frame_classic", "map", (Client.a == com.runescape.a.a) ? 0 : 2).drawSprite(x, y);
    }
    
    @Override
    public final void a(final Client client) {
        final Rectangle u = aC_1.u;
        final boolean b = Client.c >= Client.h;
        if (Client.a == com.runescape.a.a) {
        	SpriteGroupLoader.a("frame_classic", "tabs", 0).drawSprite(0, 0);
            client.r.a(30, 37);
        }
        else {
            final int n = b ? (Client.c - 462) : (Client.c - 231);
            final int n2 = b ? (Client.d - 36) : (Client.d - 72);
            SpriteGroupLoader.a("frame_classic", "tabs", b ? 4 : 3).drawSprite(n, n2);
            if (Client.f) {
                final int n3 = (int)u.getWidth() + (b ? 0 : 14);
                final int n4 = (int)u.getHeight();
                final int n5 = n3 - 7;
                final int n6 = n4 - 7;
                SpriteGroupLoader.a("frame_classic", "tabs", 1).a(Client.c - n3, n2 - n4, 200);
                client.r.a(Client.c - (n5 - 1), n2 - n6);
                SpriteGroupLoader.a("frame_classic", "tabs", 2).drawSprite(Client.c - n3, n2 - n4);
            }
        }
        if (client.W == -1) {
            if (Client.f && Client.aa >= 0 && Client.aa < 14) {
                if (Client.M[Client.aa] >= 0) {
                    if (Client.a == com.runescape.a.a) {
                        final Sprite n7;
                        if ((n7 = this.c[aC_1.d[Client.aa]]) != null) {
                            n7.drawSprite(aC_1.e[Client.aa % 7], aC_1.f[Client.aa]);
                        }
                    }
                    else {
                        final boolean b2;
                        final int n8 = (b2 = (((Client.c >= Client.h) ? 1 : 0) != 0)) ? (Client.c - 462) : (Client.c - 231);
                        int n9 = b2 ? (Client.d - 36) : (Client.d - 72);
                        if (!b2 && Client.aa > 6) {
                            n9 += 36;
                        }
                        SpriteGroupLoader.a("frame_classic", "tabs", 5).drawSprite(n8 + 33 * (b2 ? Client.aa : (Client.aa % 7)), n9);
                    }
                }
            }
            int n10 = 0;
            int n11 = 0;
            final boolean b3 = Client.c >= Client.h;
            if (Client.a != com.runescape.a.a) {
                n10 = (b3 ? (Client.c - 462) : (Client.c - 231));
                n11 = (b3 ? (Client.d - 36) : (Client.d - 72));
            }
            for (int i = 0; i < 14; ++i) {
                int n12 = n10 + aC_1.e[i % 7] + aC_1.g[i];
                int n13 = n11 + aC_1.f[i] + aC_1.h[i];
                if (Client.a != com.runescape.a.a) {
                    n12 = n10 + 33 * (b3 ? i : (i % 7)) + aC_1.i[i];
                    n13 = n11 + aC_1.j[i];
                    if (!b3 && i > 6) {
                        n13 += 36;
                    }
                }
                boolean b4 = Client.M[i] != -1 && client.C != i;
                if (client.C == i) {
                    b4 = (Client.R % 20 < 10);
                }
                if (b4) {
                	SpriteGroupLoader.a("frame_classic", "sideicons", i).drawSprite(n12, n13);
                }
            }
        }
        if (Client.f) {
            int n14 = (Client.a == com.runescape.a.a) ? 31 : (Client.c - 211);
            int n15 = (Client.a == com.runescape.a.a) ? 36 : (Client.d - 340);
            if (Client.a != com.runescape.a.a && b) {
                n14 += 16;
                n15 += 37;
            }
            if (client.W != -1) {
                client.a(n14, n15, 190, 260, uwotm8.m.a[client.W], -1, 0);
                return;
            }
            if (Client.M[Client.aa] != -1) {
                client.a(n14, n15, 190, 260, uwotm8.m.a[Client.M[Client.aa]], -1, 0);
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
                    if (Client.M[i] != -1 && (n = this.c[aC_1.d[i]]) != null) {
                        final int n3;
                        final int n2 = (n3 = 516 + aC_1.e[i % 7]) + n.b;
                        final int n5;
                        final int n4 = (n5 = 168 + aC_1.f[i]) + n.c;
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
            final int n6 = (b = (((Client.c >= Client.h) ? 1 : 0) != 0)) ? (Client.c - 462) : (Client.c - 231);
            final int n7 = b ? (Client.d - 36) : (Client.d - 72);
            if (client.au >= n6 && client.au <= Client.c && client.av >= n7 && client.av <= Client.d) {
                for (int j = 0; j < 14; ++j) {
                    if (Client.M[j] != -1) {
                        final int n9;
                        final int n8 = (n9 = n6 + 33 * (b ? j : (j % 7))) + 33;
                        int n10 = aC_1.f[j];
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
            	SpriteGroupLoader.a("frame_classic", "chat", 1).a(0, a - 1, 200);
            	SpriteGroupLoader.a("frame_classic", "chat", 2).drawSprite(0, a - 1);
                client.s.a(7, a + 6);
            }
            else {
            	SpriteGroupLoader.a("frame_classic", "chat", 0).drawSprite(0, a);
                client.s.a(7, a + 6);
            }
        }
        if (Client.g) {
        	SpriteGroupLoader.a("frame_classic", "chat", 3).drawSprite(5, Client.d - 23);
        }
        final int a2 = this.a(false);
        if (client.q >= 0 & client.q <= 6) {
        	SpriteGroupLoader.a("frame_classic", "chat", 5).drawSprite(aC_1.k[client.q], a2 + 142);
        }
        if (client.p >= 0 & client.p <= 6) {
        	SpriteGroupLoader.a("frame_classic", "chat", (client.p == client.q) ? 6 : 4).drawSprite(aC_1.k[client.p], a2 + 142);
        }
        final int[] array = { client.o, client.aj, client.u, client.m, client.ae, client.n };
        for (int i = 0; i < 7; ++i) {
            client.af.a(true, aC_1.l[i], 16777215, aC_1.r[i], aC_1.m[i] + a2);
        }
        for (int j = 0; j < 6; ++j) {
            client.af.a(aC_1.o[aC_1.q[j]][array[j]], aC_1.n[j], aC_1.p[aC_1.q[j]][array[j]], a2 + 163, true);
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
        if (Client.a == com.runescape.a.a) {
            return aC_1.s;
        }
        return aC_1.t;
    }
    
    @Override
    public final Point b(final boolean b) {
        return new Point((Client.a == com.runescape.a.a) ? (b ? 516 : 0) : (Client.c - 238), b ? 0 : ((Client.a == com.runescape.a.a) ? 0 : 3));
    }
    
    @Override
    public final Point c() {
        return aC_1.b;
    }
    
    @Override
    public final boolean d() {
        return true;
    }
    
    @Override
    public final Sprite a(final int n) {
        return SpriteGroupLoader.a("frame_classic", "sideicons", 1);
    }
}

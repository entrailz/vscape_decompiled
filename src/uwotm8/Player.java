package uwotm8;

import com.runescape.*;

public final class Player extends Actor
{
    public int ad;
    private long aJ;
    public ActorDefinition ae;
    public boolean af;
    public final int[] ag;
    public int ah;
    private int aK;
    public String ai;
    public static Cache aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public boolean aq;
    public int ar;
    public int as;
    public int at;
    public Model au;
    public final int[] av;
    private long aL;
    public int aw;
    public int ax;
    public int ay;
    public int az;
    public int aA;
    public boolean aB;
    
    static {
        uwotm8.Player.aj = new Cache(260);
    }
    
    public final Model getRotatedModel() {
        if (!this.aq) {
            return null;
        }
        Model d;
        if ((d = this.getAnimatedModel()) == null) {
            return null;
        }
        super.h = d.aD;
        d.w = true;
        if (this.af) {
            return d;
        }
        if (super.s != -1 && super.t != -1) {
            final SpotAnimation g;
            final Model a;
            if ((a = (g = uwotm8.SpotAnimation.a[super.s]).getModel()) == null) {
                return null;
            }
            final Model d2;
            (d2 = new Model(true, uwotm8.Frame.isValid(super.t), false, a)).a(0, -super.w, 0);
            d2.d();
            d2.c(g.b.c[super.t]);
            d2.v = null;
            d2.u = null;
            if (g.c != 128 || g.d != 128) {
                d2.b(g.c, g.c, g.d);
            }
            d2.a(64 + g.f, 850 + g.g, -30, -50, -30, true);
            d = new Model(new Model[] { d, d2 });
        }
        if (this.au != null) {
            if (Client.R >= this.ao) {
                this.au = null;
            }
            if (Client.R >= this.an && Client.R < this.ao) {
                final Model au;
                (au = this.au).a(this.ar - super.V, this.as - this.ap, this.at - super.W);
                if (super.i == 512) {
                    au.e();
                    au.e();
                    au.e();
                }
                else if (super.i == 1024) {
                    au.e();
                    au.e();
                }
                else if (super.i == 1536) {
                    au.e();
                }
                d = new Model(new Model[] { d, au });
                if (super.i == 512) {
                    au.e();
                }
                else if (super.i == 1024) {
                    au.e();
                    au.e();
                }
                else if (super.i == 1536) {
                    au.e();
                    au.e();
                    au.e();
                }
                au.a(super.V - this.ar, this.ap - this.as, super.W - this.at);
            }
        }
        d.w = true;
        return d;
    }
    
    public final void updatePlayer(final Buffer i) {
        i.b = 0;
        this.aK = i.e();
        this.al = i.e();
        this.am = i.e();
        this.ae = null;
        this.ah = 0;
        for (int j = 0; j < 12; ++j) {
            final int e;
            if ((e = i.e()) == 0) {
                this.av[j] = 0;
            }
            else {
                this.av[j] = (e << 8) + i.e();
                if (j == 0 && this.av[0] == 65535) {
                    this.ae = uwotm8.ActorDefinition.lookup(i.g());
                    break;
                }
                final int w;
                if (this.av[j] >= 512 && this.av[j] - 512 < uwotm8.ItemDefinition.x && (w = uwotm8.ItemDefinition.c(this.av[j] - 512).w) != 0) {
                    this.ah = w;
                }
            }
        }
        for (int k = 0; k < 5; ++k) {
            int e2;
            if ((e2 = i.e()) < 0 || e2 >= Client.B[k].length) {
                e2 = 0;
            }
            this.ag[k] = e2;
        }
        super.j = i.g();
        if (super.j == 65535) {
            super.j = -1;
        }
        super.k = i.g();
        if (super.k == 65535) {
            super.k = -1;
        }
        super.Z = i.g();
        if (super.Z == 65535) {
            super.Z = -1;
        }
        super.aa = i.g();
        if (super.aa == 65535) {
            super.aa = -1;
        }
        super.ab = i.g();
        if (super.ab == 65535) {
            super.ab = -1;
        }
        super.ac = i.g();
        if (super.ac == 65535) {
            super.ac = -1;
        }
        super.f = i.g();
        if (super.f == 65535) {
            super.f = -1;
        }
        this.ai = uwotm8.StringUtils.format(uwotm8.StringUtils.decodeBase37(i.k()));
        this.ak = i.e();
        this.aA = i.g();
        this.aB = (i.e() == 1);
        try {
            final int h;
            if ((h = i.h()) >= 0) {
                final int n = h;
                this.i = n;
                this.X = n;
            }
        }
        catch (Exception ex) {}
        this.aq = true;
        this.aL = 0L;
        for (int l = 0; l < 12; ++l) {
            this.aL <<= 4;
            if (this.av[l] >= 256) {
                this.aL += this.av[l] - 256;
            }
        }
        if (this.av[0] >= 256) {
            this.aL += this.av[0] - 256 >> 4;
        }
        if (this.av[1] >= 256) {
            this.aL += this.av[1] - 256 >> 8;
        }
        for (int n2 = 0; n2 < 5; ++n2) {
            this.aL <<= 3;
            this.aL += this.ag[n2];
        }
        this.aL <<= 1;
        this.aL += this.aK;
    }
    
    public final Model getAnimatedModel() {
        if (this.ae != null) {
            int n = -1;
            if (super.y >= 0 && super.B == 0) {
                n = uwotm8.Animation.a[super.y].c[super.z];
            }
            else if (super.p >= 0) {
                n = uwotm8.Animation.a[super.p].c[super.q];
            }
            return this.ae.getAnimatedModel(-1, n, null);
        }
        long al = this.aL;
        int n2 = -1;
        int n3 = -1;
        int i = -1;
        int j = -1;
        if (super.y >= 0 && super.B == 0) {
            final Animation d;
            n2 = (d = uwotm8.Animation.a[super.y]).c[super.z];
            if (super.p >= 0 && super.p != super.j) {
                n3 = uwotm8.Animation.a[super.p].c[super.q];
            }
            if (d.i >= 0) {
                i = d.i;
                al += i - this.av[5] << 40;
            }
            if (d.j >= 0) {
                j = d.j;
                al += j - this.av[3] << 48;
            }
        }
        else if (super.p >= 0) {
            n2 = uwotm8.Animation.a[super.p].c[super.q];
        }
        Model d2;
        if ((d2 = (Model)uwotm8.Player.aj.get(al)) == null) {
            boolean b = false;
            for (int k = 0; k < 12; ++k) {
                int n4 = this.av[k];
                if (j >= 0 && k == 3) {
                    n4 = j;
                }
                if (i >= 0 && k == 5) {
                    n4 = i;
                }
                if (n4 >= 256 && n4 < 512 && !uwotm8.IdentityKit.b[n4 - 256].bodyLoaded()) {
                    b = true;
                }
                if (n4 >= 512 && !uwotm8.ItemDefinition.c(n4 - 512).a(this.aK)) {
                    b = true;
                }
            }
            if (b) {
                if (this.aJ != -1L) {
                    d2 = (Model)uwotm8.Player.aj.get(this.aJ);
                }
                if (d2 == null) {
                    return null;
                }
            }
        }
        if (d2 == null) {
            final Model[] array = new Model[12];
            int n5 = 0;
            for (int l = 0; l < 12; ++l) {
                int n6 = this.av[l];
                if (j >= 0 && l == 3) {
                    n6 = j;
                }
                if (i >= 0 && l == 5) {
                    n6 = i;
                }
                final Model b2;
                if (n6 >= 256 && n6 < 512 && (b2 = uwotm8.IdentityKit.b[n6 - 256].bodyModel()) != null) {
                    array[n5++] = b2;
                }
                final Model b3;
                if (n6 >= 512 && (b3 = uwotm8.ItemDefinition.c(n6 - 512).b(this.aK)) != null) {
                    array[n5++] = b3;
                }
            }
            d2 = new Model(n5, array);
            for (int n7 = 0; n7 < 5; ++n7) {
                if (this.ag[n7] != 0) {
                    d2.a(Client.B[n7][0], Client.B[n7][this.ag[n7]]);
                    if (n7 == 1) {
                        d2.a(Client.Y[0], Client.Y[this.ag[n7]]);
                    }
                }
            }
            d2.d();
            d2.a(84, 1000, -90, -580, -90, true);
            uwotm8.Player.aj.put(d2, al);
            this.aJ = al;
        }
        if (this.af) {
            return d2;
        }
        final Model a;
        (a = uwotm8.Model.a).a(d2, uwotm8.Frame.isValid(n2) & uwotm8.Frame.isValid(n3));
        if (n2 != -1 && n3 != -1) {
            a.a(uwotm8.Animation.a[super.y].f, n3, n2);
        }
        else if (n2 != -1) {
            a.c(n2);
        }
        a.c();
        a.v = null;
        a.u = null;
        return a;
    }
    
    @Override
    public final boolean isVisible() {
        return this.aq;
    }
    
    public final Model getHeadModel() {
        if (!this.aq) {
            return null;
        }
        if (this.ae != null) {
            return this.ae.model();
        }
        boolean b = false;
        for (int i = 0; i < 12; ++i) {
            final int n;
            if ((n = this.av[i]) >= 256 && n < 512 && !uwotm8.IdentityKit.b[n - 256].loaded()) {
                b = true;
            }
            if (n >= 512) {
                final ItemDefinition c = uwotm8.ItemDefinition.c(n - 512);
                final int ak = this.aK;
                final ItemDefinition j = c;
                int n2 = c.m;
                int n3 = j.i;
                if (ak == 1) {
                    n2 = j.u;
                    n3 = j.l;
                }
                boolean b2;
                if (n2 == -1) {
                    b2 = true;
                }
                else {
                    boolean b3 = true;
                    if (!uwotm8.Model.b(n2)) {
                        b3 = false;
                    }
                    if (n3 != -1 && !uwotm8.Model.b(n3)) {
                        b3 = false;
                    }
                    b2 = b3;
                }
                if (!b2) {
                    b = true;
                }
            }
        }
        if (b) {
            return null;
        }
        final Model[] array = new Model[12];
        int n4 = 0;
        for (int k = 0; k < 12; ++k) {
            final int n5;
            if ((n5 = this.av[k]) >= 256 && n5 < 512) {
                array[n4++] = uwotm8.IdentityKit.b[n5 - 256].headModel();
            }
            if (n5 >= 512) {
                final ItemDefinition c2 = uwotm8.ItemDefinition.c(n5 - 512);
                final int ak2 = this.aK;
                final ItemDefinition l = c2;
                int n6 = c2.m;
                int n7 = l.i;
                if (ak2 == 1) {
                    n6 = l.u;
                    n7 = l.l;
                }
                Model d2;
                Model d;
                if (n6 == -1) {
                    d = (d2 = null);
                }
                else {
                    Model a = uwotm8.Model.a(n6);
                    if (n7 != -1) {
                        a = new Model(2, new Model[] { a, uwotm8.Model.a(n7) });
                    }
                    if (l.f != null) {
                        for (int n8 = 0; n8 < l.f.length; ++n8) {
                            a.a(l.f[n8], l.b[n8]);
                        }
                    }
                    d = (d2 = a);
                }
                final Model d3 = d2;
                if (d != null) {
                    array[n4++] = d3;
                }
            }
        }
        final Model d4 = new Model(n4, array);
        for (int n9 = 0; n9 < 5; ++n9) {
            if (this.ag[n9] != 0) {
                d4.a(Client.B[n9][0], Client.B[n9][this.ag[n9]]);
                if (n9 == 1) {
                    d4.a(Client.Y[0], Client.Y[this.ag[n9]]);
                }
            }
        }
        return d4;
    }
    
    public Player() {
        this.aB = false;
        this.aJ = -1L;
        this.af = false;
        this.ag = new int[5];
        this.aq = false;
        this.av = new int[12];
    }
}

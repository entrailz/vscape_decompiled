package uwotm8;

public final class Npc extends Actor
{
    public ActorDefinition ad;
    
    public final Model a() {
        if (this.ad == null) {
            return null;
        }
        Model d2;
        Model d;
        if (super.y >= 0 && super.B == 0) {
            final int n = uwotm8.Animation.a[super.y].c[super.z];
            int n2 = -1;
            if (super.p >= 0 && super.p != super.j) {
                n2 = uwotm8.Animation.a[super.p].c[super.q];
            }
            d = (d2 = this.ad.a(n2, n, uwotm8.Animation.a[super.y].f));
        }
        else {
            int n3 = -1;
            if (super.p >= 0) {
                n3 = uwotm8.Animation.a[super.p].c[super.q];
            }
            d = (d2 = this.ad.a(-1, n3, null));
        }
        Model d3 = d2;
        if (d == null) {
            return null;
        }
        super.h = d3.aD;
        final SpotAnimation g;
        final Model a;
        if (super.s != -1 && super.t != -1 && (a = (g = uwotm8.SpotAnimation.a[super.s]).a()) != null) {
            final int n4 = g.b.c[super.t];
            final Model d4;
            (d4 = new Model(true, uwotm8.Frame.b(n4), false, a)).a(0, -super.w, 0);
            d4.d();
            d4.c(n4);
            d4.v = null;
            d4.u = null;
            if (g.c != 128 || g.d != 128) {
                d4.b(g.c, g.c, g.d);
            }
            d4.a(64 + g.f, 850 + g.g, -30, -50, -30, true);
            d3 = new Model(new Model[] { d3, d4 });
        }
        if (this.ad.i == 1) {
            d3.w = true;
        }
        return d3;
    }
    
    @Override
    public final boolean isVisible() {
        return this.ad != null;
    }
}

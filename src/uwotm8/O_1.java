package uwotm8;

public final class O_1
{
    private final N_1 a;
    private N_1 b;
    
    public O_1() {
        this.a = new N_1();
        this.a.aH = this.a;
        this.a.aI = this.a;
    }
    
    public final void a(final N_1 n) {
        if (n.aI != null) {
            n.E();
        }
        n.aI = this.a.aI;
        n.aH = this.a;
        n.aI.aH = n;
        n.aH.aI = n;
    }
    
    public final N_1 a() {
        final N_1 ah;
        if ((ah = this.a.aH) == this.a) {
            return null;
        }
        ah.E();
        return ah;
    }
    
    public final N_1 b() {
        final N_1 ah;
        if ((ah = this.a.aH) == this.a) {
            return this.b = null;
        }
        this.b = ah.aH;
        return ah;
    }
    
    public final N_1 c() {
        final N_1 b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aH;
        return b;
    }
    
    public final int d() {
        int n = 0;
        for (N_1 n2 = this.a.aH; n2 != this.a; n2 = n2.aH) {
            ++n;
        }
        return n;
    }
}

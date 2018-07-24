package uwotm8;

public final class Queue
{
    private final CacheableNode a;
    private CacheableNode b;
    
    public Queue() {
        this.a = new CacheableNode();
        this.a.aH = this.a;
        this.a.aI = this.a;
    }
    
    public final void a(final CacheableNode n) {
        if (n.aI != null) {
            n.E();
        }
        n.aI = this.a.aI;
        n.aH = this.a;
        n.aI.aH = n;
        n.aH.aI = n;
    }
    
    public final CacheableNode a() {
        final CacheableNode ah;
        if ((ah = this.a.aH) == this.a) {
            return null;
        }
        ah.E();
        return ah;
    }
    
    public final CacheableNode b() {
        final CacheableNode ah;
        if ((ah = this.a.aH) == this.a) {
            return this.b = null;
        }
        this.b = ah.aH;
        return ah;
    }
    
    public final CacheableNode c() {
        final CacheableNode b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aH;
        return b;
    }
    
    public final int d() {
        int n = 0;
        for (CacheableNode n2 = this.a.aH; n2 != this.a; n2 = n2.aH) {
            ++n;
        }
        return n;
    }
}

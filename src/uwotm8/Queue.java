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
    
    public final void insertHead(final CacheableNode n) {
        if (n.aI != null) {
            n.clear();
        }
        n.aI = this.a.aI;
        n.aH = this.a;
        n.aI.aH = n;
        n.aH.aI = n;
    }
    
    public final CacheableNode popTail() {
        final CacheableNode ah;
        if ((ah = this.a.aH) == this.a) {
            return null;
        }
        ah.clear();
        return ah;
    }
    
    public final CacheableNode reverseGetFirst() {
        final CacheableNode ah;
        if ((ah = this.a.aH) == this.a) {
            return this.b = null;
        }
        this.b = ah.aH;
        return ah;
    }
    
    public final CacheableNode reverseGetNext() {
        final CacheableNode b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aH;
        return b;
    }
    
    public final int getNodeCount() {
        int n = 0;
        for (CacheableNode n2 = this.a.aH; n2 != this.a; n2 = n2.aH) {
            ++n;
        }
        return n;
    }
}

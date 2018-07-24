package uwotm8;

public final class Cache
{
    private final CacheableNode a;
    private final int b;
    private int c;
    private final HashTable d;
    private final Queue e;
    
    public Cache(final int n) {
        this.a = new CacheableNode();
        this.e = new Queue();
        this.b = n;
        this.c = n;
        this.d = new HashTable();
    }
    
    public final CacheableNode get(final long n) {
        final CacheableNode n2;
        if ((n2 = (CacheableNode)this.d.get(n)) != null) {
            this.e.insertHead(n2);
        }
        return n2;
    }
    
    public final void put(final CacheableNode n, final long n2) {
        try {
            if (this.c == 0) {
                final CacheableNode a;
                (a = this.e.popTail()).unlink();
                a.clear();
                if (a == this.a) {
                    final CacheableNode a2;
                    (a2 = this.e.popTail()).unlink();
                    a2.clear();
                }
            }
            else {
                --this.c;
            }
            this.d.remove(n, n2);
            this.e.insertHead(n);
        }
        catch (RuntimeException ex) {
            SignLink.b("47547, " + n + ", " + n2 + ", 2" + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
    
    public final void removeAll() {
        CacheableNode a;
        while ((a = this.e.popTail()) != null) {
            a.unlink();
            a.clear();
        }
        this.c = this.b;
    }
}

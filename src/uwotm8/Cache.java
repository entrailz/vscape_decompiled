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
    
    public final CacheableNode a(final long n) {
        final CacheableNode n2;
        if ((n2 = (CacheableNode)this.d.a(n)) != null) {
            this.e.a(n2);
        }
        return n2;
    }
    
    public final void a(final CacheableNode n, final long n2) {
        try {
            if (this.c == 0) {
                final CacheableNode a;
                (a = this.e.a()).D();
                a.E();
                if (a == this.a) {
                    final CacheableNode a2;
                    (a2 = this.e.a()).D();
                    a2.E();
                }
            }
            else {
                --this.c;
            }
            this.d.a(n, n2);
            this.e.a(n);
        }
        catch (RuntimeException ex) {
            SignLink.b("47547, " + n + ", " + n2 + ", 2" + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
    
    public final void a() {
        CacheableNode a;
        while ((a = this.e.a()) != null) {
            a.D();
            a.E();
        }
        this.c = this.b;
    }
}

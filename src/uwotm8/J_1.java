package uwotm8;

public final class J_1
{
    private final N_1 a;
    private final int b;
    private int c;
    private final L_1 d;
    private final O_1 e;
    
    public J_1(final int n) {
        this.a = new N_1();
        this.e = new O_1();
        this.b = n;
        this.c = n;
        this.d = new L_1();
    }
    
    public final N_1 a(final long n) {
        final N_1 n2;
        if ((n2 = (N_1)this.d.a(n)) != null) {
            this.e.a(n2);
        }
        return n2;
    }
    
    public final void a(final N_1 n, final long n2) {
        try {
            if (this.c == 0) {
                final N_1 a;
                (a = this.e.a()).D();
                a.E();
                if (a == this.a) {
                    final N_1 a2;
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
            al.b("47547, " + n + ", " + n2 + ", 2" + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
    
    public final void a() {
        N_1 a;
        while ((a = this.e.a()) != null) {
            a.D();
            a.E();
        }
        this.c = this.b;
    }
}

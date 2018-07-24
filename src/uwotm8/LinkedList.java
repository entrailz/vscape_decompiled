package uwotm8;

public final class LinkedList
{
    private final Node a;
    private Node b;
    
    public LinkedList() {
        this.a = new Node();
        this.a.aF = this.a;
        this.a.aG = this.a;
    }
    
    public final void a(final Node k) {
        if (k.aG != null) {
            k.D();
        }
        k.aG = this.a.aG;
        k.aF = this.a;
        k.aG.aF = k;
        k.aF.aG = k;
    }
    
    public final void b(final Node k) {
        if (k.aG != null) {
            k.D();
        }
        k.aG = this.a;
        k.aF = this.a.aF;
        k.aG.aF = k;
        k.aF.aG = k;
    }
    
    public final Node a() {
        final Node af;
        if ((af = this.a.aF) == this.a) {
            return null;
        }
        af.D();
        return af;
    }
    
    public final Node b() {
        final Node af;
        if ((af = this.a.aF) == this.a) {
            return this.b = null;
        }
        this.b = af.aF;
        return af;
    }
    
    public final Node c() {
        final Node ag;
        if ((ag = this.a.aG) == this.a) {
            return this.b = null;
        }
        this.b = ag.aG;
        return ag;
    }
    
    public final Node d() {
        final Node b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aF;
        return b;
    }
    
    public final Node e() {
        final Node b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aG;
        return b;
    }
    
    public final void f() {
        if (this.a.aF == this.a) {
            return;
        }
        Node af;
        while ((af = this.a.aF) != this.a) {
            af.D();
        }
    }
}

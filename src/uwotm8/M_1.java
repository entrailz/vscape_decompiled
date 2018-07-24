package uwotm8;

public final class M_1
{
    private final K_1 a;
    private K_1 b;
    
    public M_1() {
        this.a = new K_1();
        this.a.aF = this.a;
        this.a.aG = this.a;
    }
    
    public final void a(final K_1 k) {
        if (k.aG != null) {
            k.D();
        }
        k.aG = this.a.aG;
        k.aF = this.a;
        k.aG.aF = k;
        k.aF.aG = k;
    }
    
    public final void b(final K_1 k) {
        if (k.aG != null) {
            k.D();
        }
        k.aG = this.a;
        k.aF = this.a.aF;
        k.aG.aF = k;
        k.aF.aG = k;
    }
    
    public final K_1 a() {
        final K_1 af;
        if ((af = this.a.aF) == this.a) {
            return null;
        }
        af.D();
        return af;
    }
    
    public final K_1 b() {
        final K_1 af;
        if ((af = this.a.aF) == this.a) {
            return this.b = null;
        }
        this.b = af.aF;
        return af;
    }
    
    public final K_1 c() {
        final K_1 ag;
        if ((ag = this.a.aG) == this.a) {
            return this.b = null;
        }
        this.b = ag.aG;
        return ag;
    }
    
    public final K_1 d() {
        final K_1 b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aF;
        return b;
    }
    
    public final K_1 e() {
        final K_1 b;
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
        K_1 af;
        while ((af = this.a.aF) != this.a) {
            af.D();
        }
    }
}

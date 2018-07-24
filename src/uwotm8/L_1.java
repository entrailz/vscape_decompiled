package uwotm8;

final class L_1
{
    private final int a;
    private final K_1[] b;
    
    public L_1() {
        this.a = 1024;
        this.b = new K_1[1024];
        for (int i = 0; i < 1024; ++i) {
            final K_1[] b = this.b;
            final int n = i;
            final K_1 k = new K_1();
            b[n] = k;
            final K_1 af = k;
            k.aF = af;
            final K_1 ag = af;
            ag.aG = ag;
        }
    }
    
    public final K_1 a(final long n) {
    	K_1 i;
        for (K_1 k = (i = this.b[(int)(n & 0x3FFL)]).aF; k != i; k = k.aF) {
            if (k.aE == n) {
                return k;
            }
        }
        return null;
    }
    
    public final void a(final K_1 k, final long ae) {
        try {
            if (k.aG != null) {
                k.D();
            }
            final K_1 af = this.b[(int)(ae & 0x3FFL)];
            k.aG = af.aG;
            k.aF = af;
            k.aG.aF = k;
            k.aF.aG = k;
            k.aE = ae;
        }
        catch (RuntimeException ex) {
            al.b("91499, " + k + ", " + ae + ", 7" + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
}

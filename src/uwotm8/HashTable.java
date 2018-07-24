package uwotm8;

final class HashTable
{
    private final int a;
    private final Node[] b;
    
    public HashTable() {
        this.a = 1024;
        this.b = new Node[1024];
        for (int i = 0; i < 1024; ++i) {
            final Node[] b = this.b;
            final int n = i;
            final Node k = new Node();
            b[n] = k;
            final Node af = k;
            k.aF = af;
            final Node ag = af;
            ag.aG = ag;
        }
    }
    
    public final Node get(final long n) {
    	Node i;
        for (Node k = (i = this.b[(int)(n & 0x3FFL)]).aF; k != i; k = k.aF) {
            if (k.aE == n) {
                return k;
            }
        }
        return null;
    }
    
    public final void remove(final Node k, final long ae) {
        try {
            if (k.aG != null) {
                k.unlink();
            }
            final Node af = this.b[(int)(ae & 0x3FFL)];
            k.aG = af.aG;
            k.aF = af;
            k.aG.aF = k;
            k.aF.aG = k;
            k.aE = ae;
        }
        catch (RuntimeException ex) {
            SignLink.b("91499, " + k + ", " + ae + ", 7" + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
}

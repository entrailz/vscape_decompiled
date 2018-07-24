package uwotm8;

public class K_1
{
    public long aE;
    public K_1 aF;
    public K_1 aG;
    
    public final void D() {
        if (this.aG != null) {
            this.aG.aF = this.aF;
            this.aF.aG = this.aG;
            this.aF = null;
            this.aG = null;
        }
    }
}

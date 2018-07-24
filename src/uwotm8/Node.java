package uwotm8;

public class Node
{
    public long aE;
    public Node aF;
    public Node aG;
    
    public final void D() {
        if (this.aG != null) {
            this.aG.aF = this.aF;
            this.aF.aG = this.aG;
            this.aF = null;
            this.aG = null;
        }
    }
}

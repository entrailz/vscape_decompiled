package uwotm8;

public class CacheableNode extends Node
{
    public CacheableNode aH;
    CacheableNode aI;
    
    public final void E() {
        if (this.aI != null) {
            this.aI.aH = this.aH;
            this.aH.aI = this.aI;
            this.aH = null;
            this.aI = null;
        }
    }
}

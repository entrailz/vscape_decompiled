package uwotm8;

public class N_1 extends K_1
{
    public N_1 aH;
    N_1 aI;
    
    public final void E() {
        if (this.aI != null) {
            this.aI.aH = this.aH;
            this.aH.aI = this.aI;
            this.aH = null;
            this.aI = null;
        }
    }
}

package uwotm8;

public class Renderable extends CacheableNode
{
    public VertexNormal[] aC;
    public int aD;
    
    public void renderAtPoint(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final Model a;
        if ((a = this.getRotatedModel()) != null) {
            this.aD = a.aD;
            a.renderAtPoint(n, n2, n3, n4, n5, n6, n7, n8, n9);
        }
    }
    
    Model getRotatedModel() {
        return null;
    }
    
    public Renderable() {
        this.aD = 1000;
    }
}

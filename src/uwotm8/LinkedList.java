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
    
    public final void insertBack(final Node k) {
        if (k.aG != null) {
            k.unlink();
        }
        k.aG = this.a.aG;
        k.aF = this.a;
        k.aG.aF = k;
        k.aF.aG = k;
    }
    
    public final void insertFront(final Node k) {
        if (k.aG != null) {
            k.unlink();
        }
        k.aG = this.a;
        k.aF = this.a.aF;
        k.aG.aF = k;
        k.aF.aG = k;
    }
    
    public final Node popTail() {
        final Node af;
        if ((af = this.a.aF) == this.a) {
            return null;
        }
        af.unlink();
        return af;
    }
    
    public final Node getBack() {
        final Node af;
        if ((af = this.a.aF) == this.a) {
            return this.b = null;
        }
        this.b = af.aF;
        return af;
    }
    
    public final Node getFront() {
        final Node ag;
        if ((ag = this.a.aG) == this.a) {
            return this.b = null;
        }
        this.b = ag.aG;
        return ag;
    }
    
    public final Node getPrevious() {
        final Node b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aF;
        return b;
    }
    
    public final Node getNext() {
        final Node b;
        if ((b = this.b) == this.a) {
            return this.b = null;
        }
        this.b = b.aG;
        return b;
    }
    
    public final void clear() {
        if (this.a.aF == this.a) {
            return;
        }
        Node af;
        while ((af = this.a.aF) != this.a) {
            af.unlink();
        }
    }
}

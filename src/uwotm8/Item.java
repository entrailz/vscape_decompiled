package uwotm8;

public final class Item extends Renderable
{
    public int a;
    public int b;
    
    public final Model getRotatedModel() {
        return ItemDefinition.c(this.a).getAmountModel(this.b);
    }
}

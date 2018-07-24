package uwotm8;

public final class Item extends Renderable
{
    public int a;
    public int b;
    
    public final Model a() {
        return ItemDefinition.c(this.a).d(this.b);
    }
}

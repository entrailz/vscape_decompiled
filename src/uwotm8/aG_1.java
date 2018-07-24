package uwotm8;

public enum aG_1
{
    a("DEFAULT", 0, (aE_1)new aD_1()), 
    b("CLASSIC", 1, (aE_1)new aC_1());
    
    private aE_1 c;
    
    static {
        aG_1[] d = new aG_1[] { aG_1.a, aG_1.b };
    }
    
    private aG_1(final String s, final int n, final aE_1 c) {
        this.c = c;
    }
    
    public final aE_1 a() {
        return this.c;
    }
}

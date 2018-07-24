package uwotm8;

public final class aF
{
    private static aG_1 a;
    
    static {
        aF.a = aG_1.a;
    }
    
    public static void a() {
    	aG_1[] values;
        for (int length = (values = aG_1.values()).length, i = 0; i < length; ++i) {
            final aG_1 ag;
            if ((ag = values[i]).a() != null) {
                ag.a().a();
            }
        }
    }
    
    public static void a(final aG_1 a) {
        aF.a = a;
    }
    
    public static aG_1 b() {
        return aF.a;
    }
    
    public static aE_1 c() {
        return aF.a.a();
    }
    
    public static boolean b(final aG_1 ag) {
        return aF.a.equals(ag);
    }
}

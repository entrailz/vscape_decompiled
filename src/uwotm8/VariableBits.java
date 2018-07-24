package uwotm8;

public final class VariableBits
{
    public static VariableBits[] a;
    public int b;
    public int c;
    public int d;
    
    public static void a(final Archive g) {
        final Buffer i;
        final int g2 = (i = new Buffer(g.b("varbit.dat"))).g();
        if (VariableBits.a == null) {
            VariableBits.a = new VariableBits[g2];
        }
        for (int j = 0; j < g2; ++j) {
            if (VariableBits.a[j] == null) {
                VariableBits.a[j] = new VariableBits();
            }
            final VariableBits aj = uwotm8.VariableBits.a[j];
            final Buffer k = i;
            final VariableBits aj2 = aj;
            aj.b = k.g();
            aj2.c = k.e();
            aj2.d = k.e();
        }
        if (i.b != i.a.length) {
            System.out.println("varbit load mismatch");
        }
    }
}

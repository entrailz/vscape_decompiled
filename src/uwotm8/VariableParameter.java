package uwotm8;

public final class VariableParameter
{
    public static VariableParameter[] a;
    private static int c;
    private static int[] d;
    public int b;
    private boolean e;
    
    public static void init(final Archive g) {
        final Buffer i = new Buffer(g.getEntry("varp.dat"));
        VariableParameter.c = 0;
        final int g2 = i.g();
        if (VariableParameter.a == null) {
            VariableParameter.a = new VariableParameter[g2];
        }
        if (VariableParameter.d == null) {
            VariableParameter.d = new int[g2];
        }
        for (int j = 0; j < g2; ++j) {
            if (VariableParameter.a[j] == null) {
                VariableParameter.a[j] = new VariableParameter();
            }
            final VariableParameter ak = uwotm8.VariableParameter.a[j];
            final Buffer k = i;
            final int n = j;
            final Buffer l = k;
            final VariableParameter ak2 = ak;
            int e;
            while ((e = l.e()) != 0) {
                if (e == 1) {
                    l.e();
                }
                else if (e == 2) {
                    l.e();
                }
                else if (e == 3) {
                    uwotm8.VariableParameter.d[uwotm8.VariableParameter.c++] = n;
                }
                else {
                    if (e == 4) {
                        continue;
                    }
                    if (e == 5) {
                        ak2.b = l.g();
                    }
                    else {
                        if (e == 6) {
                            continue;
                        }
                        if (e == 7) {
                            l.j();
                        }
                        else if (e == 8) {
                            ak2.e = true;
                        }
                        else if (e == 10) {
                            l.l();
                        }
                        else if (e == 11) {
                            ak2.e = true;
                        }
                        else if (e == 12) {
                            l.j();
                        }
                        else {
                            if (e == 13) {
                                continue;
                            }
                            System.out.println("Error unrecognised config code: ".concat(String.valueOf(e)));
                        }
                    }
                }
            }
        }
        if (i.b != i.a.length) {
            System.out.println("varptype load mismatch");
        }
    }
    
    private VariableParameter() {
        this.e = false;
    }
}

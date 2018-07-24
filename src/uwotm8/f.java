package uwotm8;

public final class f
{
    public final int[] a;
    public final int[][] b;
    
    public f(final I_1 i) {
        final int e = i.e();
        this.a = new int[e];
        this.b = new int[e][];
        for (int j = 0; j < e; ++j) {
            this.a[j] = i.e();
        }
        for (int k = 0; k < e; ++k) {
            this.b[k] = new int[i.e()];
        }
        for (int l = 0; l < e; ++l) {
            for (int n = 0; n < this.b[l].length; ++n) {
                this.b[l][n] = i.e();
            }
        }
    }
}

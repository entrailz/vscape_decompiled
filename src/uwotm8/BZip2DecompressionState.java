package uwotm8;

public final class BZip2DecompressionState
{
    byte[] a;
    int b;
    int c;
    int d;
    int e;
    byte[] f;
    int g;
    int h;
    int i;
    int j;
    byte k;
    int l;
    boolean m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    final int[] u;
    int v;
    final int[] w;
    public static int[] x;
    int y;
    final boolean[] z;
    final boolean[] A;
    final byte[] B;
    final byte[] C;
    final int[] D;
    final byte[] E;
    final byte[] F;
    final byte[][] G;
    final int[][] H;
    final int[][] I;
    final int[][] J;
    final int[] K;
    int L;
    
    public BZip2DecompressionState() {
        this.u = new int[256];
        this.w = new int[257];
        this.z = new boolean[256];
        this.A = new boolean[16];
        this.B = new byte[256];
        this.C = new byte[4096];
        this.D = new int[16];
        this.E = new byte[18002];
        this.F = new byte[18002];
        this.G = new byte[6][258];
        this.H = new int[6][258];
        this.I = new int[6][258];
        this.J = new int[6][258];
        this.K = new int[6];
    }
}

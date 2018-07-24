package uwotm8;

public final class U_1
{
    final int[] a;
    final int[] b;
    final int[] c;
    final int[] d;
    final int[] e;
    final int[] f;
    final int[] g;
    final int[] h;
    final int[] i;
    int[] j;
    final boolean k;
    final int l;
    final int m;
    final int n;
    final int o;
    static final int[] p;
    static final int[] q;
    static final int[] r;
    static final int[] s;
    static final int[] t;
    private static final int[][] u;
    private static final int[][] v;
    
    static {
        p = new int[6];
        q = new int[6];
        r = new int[6];
        s = new int[6];
        t = new int[6];
        (new int[2])[0] = 1;
        u = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
        v = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
    }
    
    public U_1(int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int m, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int l, final int n13, final int n14, final int n15, int n16, int length) {
        this.k = (n12 == n11 && n12 == n4 && n12 == n10);
        this.l = l;
        this.m = m;
        this.n = n8;
        this.o = length;
        final int[] array;
        length = (array = U_1.u[l]).length;
        this.a = new int[length];
        this.b = new int[length];
        this.c = new int[length];
        final int[] array2 = new int[length];
        final int[] array3 = new int[length];
        n16 <<= 7;
        n <<= 7;
        for (int i = 0; i < length; ++i) {
            int n17;
            if (((n17 = array[i]) & 0x1) == 0x0 && n17 <= 8) {
                n17 = (n17 - m - m - 1 & 0x7) + 1;
            }
            if (n17 > 8 && n17 <= 12) {
                n17 = (n17 - 9 - m & 0x3) + 9;
            }
            if (n17 > 12 && n17 <= 16) {
                n17 = (n17 - 13 - m & 0x3) + 13;
            }
            int n18;
            int n19;
            int n20;
            int n21;
            int n22;
            if (n17 == 1) {
                n18 = n16;
                n19 = n;
                n20 = n12;
                n21 = n7;
                n22 = n2;
            }
            else if (n17 == 2) {
                n18 = n16 + 64;
                n19 = n;
                n20 = n12 + n11 >> 1;
                n21 = n7 + n15 >> 1;
                n22 = n2 + n14 >> 1;
            }
            else if (n17 == 3) {
                n18 = n16 + 128;
                n19 = n;
                n20 = n11;
                n21 = n15;
                n22 = n14;
            }
            else if (n17 == 4) {
                n18 = n16 + 128;
                n19 = n + 64;
                n20 = n11 + n4 >> 1;
                n21 = n15 + n9 >> 1;
                n22 = n14 + n6 >> 1;
            }
            else if (n17 == 5) {
                n18 = n16 + 128;
                n19 = n + 128;
                n20 = n4;
                n21 = n9;
                n22 = n6;
            }
            else if (n17 == 6) {
                n18 = n16 + 64;
                n19 = n + 128;
                n20 = n4 + n10 >> 1;
                n21 = n9 + n3 >> 1;
                n22 = n6 + n13 >> 1;
            }
            else if (n17 == 7) {
                n18 = n16;
                n19 = n + 128;
                n20 = n10;
                n21 = n3;
                n22 = n13;
            }
            else if (n17 == 8) {
                n18 = n16;
                n19 = n + 64;
                n20 = n10 + n12 >> 1;
                n21 = n3 + n7 >> 1;
                n22 = n13 + n2 >> 1;
            }
            else if (n17 == 9) {
                n18 = n16 + 64;
                n19 = n + 32;
                n20 = n12 + n11 >> 1;
                n21 = n7 + n15 >> 1;
                n22 = n2 + n14 >> 1;
            }
            else if (n17 == 10) {
                n18 = n16 + 96;
                n19 = n + 64;
                n20 = n11 + n4 >> 1;
                n21 = n15 + n9 >> 1;
                n22 = n14 + n6 >> 1;
            }
            else if (n17 == 11) {
                n18 = n16 + 64;
                n19 = n + 96;
                n20 = n4 + n10 >> 1;
                n21 = n9 + n3 >> 1;
                n22 = n6 + n13 >> 1;
            }
            else if (n17 == 12) {
                n18 = n16 + 32;
                n19 = n + 64;
                n20 = n10 + n12 >> 1;
                n21 = n3 + n7 >> 1;
                n22 = n13 + n2 >> 1;
            }
            else if (n17 == 13) {
                n18 = n16 + 32;
                n19 = n + 32;
                n20 = n12;
                n21 = n7;
                n22 = n2;
            }
            else if (n17 == 14) {
                n18 = n16 + 96;
                n19 = n + 32;
                n20 = n11;
                n21 = n15;
                n22 = n14;
            }
            else if (n17 == 15) {
                n18 = n16 + 96;
                n19 = n + 96;
                n20 = n4;
                n21 = n9;
                n22 = n6;
            }
            else {
                n18 = n16 + 32;
                n19 = n + 96;
                n20 = n10;
                n21 = n3;
                n22 = n13;
            }
            this.a[i] = n18;
            this.b[i] = n20;
            this.c[i] = n19;
            array2[i] = n21;
            array3[i] = n22;
        }
        final int[] array4;
        final int n23 = (array4 = U_1.v[l]).length / 4;
        this.g = new int[n23];
        this.h = new int[n23];
        this.i = new int[n23];
        this.d = new int[n23];
        this.e = new int[n23];
        this.f = new int[n23];
        if (n5 != -1) {
            this.j = new int[n23];
        }
        int n24 = 0;
        for (int j = 0; j < n23; ++j) {
            final int n25 = array4[n24];
            int n26 = array4[n24 + 1];
            int n27 = array4[n24 + 2];
            n = array4[n24 + 3];
            n24 += 4;
            if (n26 < 4) {
                n26 = (n26 - m & 0x3);
            }
            if (n27 < 4) {
                n27 = (n27 - m & 0x3);
            }
            if (n < 4) {
                n = (n - m & 0x3);
            }
            this.g[j] = n26;
            this.h[j] = n27;
            this.i[j] = n;
            if (n25 == 0) {
                this.d[j] = array2[n26];
                this.e[j] = array2[n27];
                this.f[j] = array2[n];
                if (this.j != null) {
                    this.j[j] = -1;
                }
            }
            else {
                this.d[j] = array3[n26];
                this.e[j] = array3[n27];
                this.f[j] = array3[n];
                if (this.j != null) {
                    this.j[j] = n5;
                }
            }
        }
    }
}

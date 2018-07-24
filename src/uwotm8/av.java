package uwotm8;

public final class av
{
    private static final char[] a;
    private static final I_1 b;
    private static final char[] c;
    
    static {
        a = new char[100];
        b = new I_1(new byte[100]);
        c = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '$', '%', '\"', '[', ']', '_', '<', '>', '^', '/', '{', '|', '}', '~', '`', '£', '\u20ac', '\u00e1', '\u00e9', '\u00fa', '\u00ed', '\u00f3' };
    }
    
    public static String a(int n, final I_1 i) {
        int n2 = 0;
        for (int j = 0; j < n; ++j) {
            av.a[n2++] = av.c[i.e()];
        }
        int n3 = 1;
        for (int k = 0; k < n2; ++k) {
            n = av.a[k];
            if (n3 != 0 && n >= 97 && n <= 122) {
                final char[] a = av.a;
                final int n4 = k;
                a[n4] += '\uffe0';
                n3 = 0;
            }
            if (n == 46 || n == 33 || n == 63) {
                n3 = 1;
            }
        }
        return new String(av.a, 0, n2);
    }
    
    public static void a(String s, final I_1 i) {
        if (s.length() > 80) {
            s = s.substring(0, 80);
        }
        s = s.toLowerCase();
        for (int j = 0; j < s.length(); ++j) {
            final char char1 = s.charAt(j);
            int n = 0;
            for (int k = 0; k < 76; ++k) {
                if (char1 == av.c[k]) {
                    n = k;
                    break;
                }
            }
            i.b(n);
        }
    }
    
    public static String a(String a) {
        av.b.b = 0;
        a(a, av.b);
        final int b = av.b.b;
        av.b.b = 0;
        return a = a(b, av.b);
    }
    
    public static boolean a(final char c) {
        for (int i = 0; i < 76; ++i) {
            char c2 = av.c[i];
            if (c >= 'A' && c <= 'Z') {
                c2 += '\uffe0';
            }
            if (c == c2) {
                return true;
            }
        }
        return false;
    }
}

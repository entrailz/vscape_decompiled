package uwotm8;

public final class StringUtils
{
    private static final char[] a;
    private static final char[] b;
    
    static {
        a = new char[] { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' };
        b = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '$', '%', '\"', '[', ']', '_', '<', '>', '^', '/', '{', '|', '}', '~', '`', '£' };
    }
    
    public static long encodeBase37(final String s) {
        long n = 0L;
        for (int i = 0; i < s.length(); ++i) {
            if (i >= 12) {
                break;
            }
            final char char1 = s.charAt(i);
            n *= 38L;
            if (char1 >= 'A' && char1 <= 'Z') {
                n += char1 + '\u0001' - 'A';
            }
            else if (char1 >= 'a' && char1 <= 'z') {
                n += char1 + '\u0001' - 'a';
            }
            else if (char1 >= '0' && char1 <= '9') {
                n += char1 + '\u001b' - '0';
            }
            else if (char1 == '_') {
                n += 37L;
            }
        }
        while (n % 38L == 0L && n != 0L) {
            n /= 38L;
        }
        return n;
    }
    
    public static String decodeBase37(long n) {
        if (n <= 0L || n >= 9065737908494995456L) {
            return "invalid_name";
        }
        try {
            if (n % 38L == 0L) {
                return "invalid_name";
            }
            int n2;
            char[] array;
            long n3;
            for (n2 = 0, array = new char[12]; n != 0L; n /= 38L, array[11 - n2++] = StringUtils.a[(int)(n3 - n * 38L)]) {
                n3 = n;
            }
            return new String(array, 12 - n2, n2);
        }
        catch (RuntimeException ex) {
            SignLink.b("81570, " + n + ", -99" + ", " + ex.toString());
            throw new RuntimeException();
        }
    }
    
    public static long hashSpriteName(String upperCase) {
        upperCase = upperCase.toUpperCase();
        long n = 0L;
        for (int i = 0; i < upperCase.length(); ++i) {
            final long n2 = n * 61L + upperCase.charAt(i) - 32L;
            n = (n2 + (n2 >> 56) & 0xFFFFFFFFFFFFFFL);
        }
        return n;
    }
    
    public static String decodeIp(final int n) {
        return String.valueOf(n >>> 24) + "." + (n >> 16 & 0xFF) + "." + (n >> 8 & 0xFF) + "." + (n & 0xFF);
    }
    
    public static String format(final String s) {
        if (s.length() > 0) {
            final char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; ++i) {
                if ((charArray[i] == '_' || charArray[i] == ' ') && i + 1 < charArray.length && charArray[i + 1] >= 'a' && charArray[i + 1] <= 'z') {
                    charArray[i + 1] = (char)(charArray[i + 1] + 'A' - 'a');
                }
            }
            if (charArray[0] >= 'a' && charArray[0] <= 'z') {
                charArray[0] = (char)(charArray[0] + 'A' - 'a');
            }
            return new String(charArray);
        }
        return s;
    }
    
    public static String getAsterisks(final String s) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            sb.append("*");
        }
        return sb.toString();
    }
    
    public static boolean e(final String s) {
        if (s == null || s.length() <= 3 || s.length() > 12) {
            return false;
        }
        final char char1 = s.charAt(0);
        final char char2 = s.charAt(s.length() - 1);
        if (char1 == ' ' || char1 == '_' || char2 == ' ' || char2 == '_') {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (!a(s.charAt(i), false)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean f(final String s) {
        if (s == null || s.length() <= 3 || s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (!a(s.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean a(final char c, final boolean b) {
        final char[] array = b ? StringUtils.b : StringUtils.a;
        for (int i = 0; i < array.length; ++i) {
            char c2 = array[i];
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

package uwotm8;

import com.runescape.*;
import java.text.*;
import java.util.*;

public final class aH_1
{
    private static boolean a;
    private static int b;
    private static int c;
    private static final int[] d;
    private static int e;
    private static int f;
    private static int g;
    private static final List h;
    
    static {
    	aH_1.a = false;
    	aH_1.b = 3;
    	aH_1.c = 1;
        d = new int[] { 0, 2, 1, 6, 3, 4, 5, 15, 17, 11, 14, 16, 10, 13, 12, 8, 7, 9, 19, 20, 18, 22, 23 };
        aH_1.e = Client.c / 2;
        aH_1.f = Client.d / 2;
        aH_1.g = 0;
        h = new ArrayList();
    }
    
    public static void a() {
        if (!aH_1.a) {
            return;
        }
        try {
            int e = 0;
            switch (aH_1.c) {
                case 0: {
                    e = 66;
                    break;
                }
                default: {
                    e = ((Client.a == com.runescape.a.a) ? ((Client.c - 252) / 2) : (Client.c / 2));
                    break;
                }
                case 2: {
                    e = Client.c - 252 - 66;
                    break;
                }
            }
            aH_1.e = e;
            aH_1.f = ((Client.a == com.runescape.a.a) ? ((Client.d - 166) / 2) : (Client.d / 2));
//            if (aH_1.h.size() > 0) {
//                final Iterator iterator = aH_1.h.iterator();
//                while (iterator.hasNext()) {
//                    final int[] array;
//                    if ((array = iterator.next()) != null) {
//                        final int n = aH_1.f - ++array[2];
//                        final String format = NumberFormat.getIntegerInstance().format(array[1]);
//                        final int n2 = aH_1.e - 16 - Client.e().ah.a(format) / 2;
//                        Client.e().w[aH_1].d(n2, n);
//                        Client.e().ah.a(format, n2 + 26, n + 16, 16777215, 0);
//                        if (n >= 10) {
//                            continue;
//                        }
//                        iterator.remove();
//                    }
//                }
//            }
            if (h.size() > 0) {
                Iterator var0 = h.iterator();

                while(var0.hasNext()) {
                   int[] var1;
                   if ((var1 = (int[])var0.next()) != null) {
                      int var2 = ++var1[2];
                      var2 = f - var2;
                      String var3 = NumberFormat.getIntegerInstance().format((long)var1[1]);
                      int var4 = e - 16 - Client.e().ah.a(var3) / 2;
                      int var10001 = d[var1[0]];
                      Client.e().w[var10001].d(var4, var2);
                      Client.e().ah.a(var3, var4 + 26, var2 + 16, 16777215, 0);
                      if (var2 < 10) {
                         var0.remove();
                      }
                   }
                }
             }
            if (aH_1.b == 0 || (aH_1.b > 0 && aH_1.g > 0)) {
                Rasterizer2D.a(5919301, 4, 120, 30, 230, aH_1.e - 60);
                final String format2 = NumberFormat.getIntegerInstance().format(Client.e().j());
                final int a = Client.e().ag.a(format2);
                Client.t.a(1).d(aH_1.e - 60, 4);
                Client.e().ag.a(format2, aH_1.e + 58 - a, 24, 16777215, 0);
                if (aH_1.b > 0 && aH_1.h.size() <= 0) {
                    --aH_1.g;
                }
            }
        }
        catch (Exception ex) {
            System.out.println("XP Drop draw error");
        }
    }
    
    public static void a(final int n, final int n2) {
    	if (n < 23) {
            try {
               if (!SkillsConstants.b[n]) {
                  return;
               }

               int var10000;
               boolean var2;
               int var3;
               label68: {
                  var2 = true;
                  var3 = n;
                  if (h.size() > 0) {
                     for(int var4 = 0; var4 < h.size(); ++var4) {
                        int[] var5;
                        if ((var5 = (int[])h.get(var4)) != null && var5[0] == var3) {
                           var10000 = var4;
                           break label68;
                        }
                     }
                  }

                  var10000 = -1;
               }

               var3 = var10000;
               int[] var10;
               if (var10000 >= 0 && (var10 = (int[])h.get(var3))[2] <= 40) {
                  var10[1] += n2;
                  var2 = false;
               }

               if (var2) {
                  h.add(new int[]{n, n2, 0});

                  for(var3 = h.size() - 1; var3 > 0; --var3) {
                     int[] var7;
                     int[] var8;
                     if ((var7 = (int[])h.get(var3)) != null && var3 > 0 && (var8 = (int[])h.get(var3 - 1)) != null) {
                        int var9 = var7[2] - var8[2];
                        if (var7[2] < var8[2]) {
                           var9 = var8[2] - var7[2];
                        }

                        if (var9 <= 32) {
                           var8[2] += 32 - var9;
                        }
                     }
                  }
               }

               if (b > 0) {
                  g = b * 50;
                  return;
               }
            } catch (Exception var6) {
               System.out.println("XP Drop error");
            }

         }
    }
    
    public static void b() {
    	aH_1.h.clear();
    	aH_1.g = 0;
    }
    
    public static void a(final int c) {
    	aH_1.c = c;
    }
    
    public static void c() {
    	aH_1.a = !aH_1.a;
        b();
        if (aH_1.a && aH_1.b > 0) {
        	aH_1.g = aH_1.b * 50;
        }
    }
    
    public static boolean d() {
        return aH_1.a;
    }
    
    public static String e() {
        final StringBuilder sb;
        (sb = new StringBuilder()).append("enabled = " + aH_1.a).append(System.lineSeparator());
        sb.append("hideAfter = " + aH_1.b).append(System.lineSeparator());
        sb.append("dropPosition = " + aH_1.c);
        return sb.toString();
    }
    
    public static void a(String s, final String s2) {
        switch (s = s) {
            case "enabled": {
            	aH_1.a = Boolean.parseBoolean(s2);
            }
            case "hideAfter": {
                if ((aH_1.b = Integer.parseInt(s2)) < 0) {
                	aH_1.b = 0;
                    return;
                }
                if (aH_1.b > 10) {
                	aH_1.b = 10;
                    return;
                }
                break;
            }
            case "dropPosition": {
                if ((aH_1.c = Integer.parseInt(s2)) < 0) {
                	aH_1.c = 0;
                    return;
                }
                if (aH_1.c > 2) {
                	aH_1.c = 2;
                    break;
                }
                break;
            }
        }
    }
}

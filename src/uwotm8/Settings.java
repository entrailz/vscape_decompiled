package uwotm8;

import com.runescape.*;
import java.io.*;

public final class Settings
{
    private static String n;
    public static String a;
    public static String b;
    public static a c;
    public static int d;
    public static int e;
    public static int f;
    public static boolean g;
    public static int h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static int[] m;
    
    static {
        Settings.n = String.valueOf(al.a()) + "settings.ini";
        Settings.a = "";
        Settings.b = "";
        Settings.c = com.runescape.a.a;
        Settings.d = 766;
        Settings.e = 529;
        Settings.f = 4;
        Settings.g = false;
        Settings.h = 600;
        Settings.i = true;
        Settings.j = true;
        Settings.k = false;
        Settings.l = true;
        Settings.m = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12 };
    }
    
    public static void a() {
        final File file = new File(Settings.n);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        }
        catch (IOException ex) {
            System.out.println("error writing settings file.");
        }
        if (file.exists()) {
            try {
                Throwable t = null;
                try {
                    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Settings.n));
                    try {
                        bufferedWriter.write("[CHARACTER]");
                        bufferedWriter.newLine();
                        bufferedWriter.write("remember = " + Client.U);
                        bufferedWriter.newLine();
                        bufferedWriter.write("username = " + (Client.U ? Client.S : ""));
                        bufferedWriter.newLine();
                        bufferedWriter.write("password = " + (Client.U ? Client.T : ""));
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("[CHAT]");
                        bufferedWriter.newLine();
                        bufferedWriter.write("game = " + Client.k.o);
                        bufferedWriter.newLine();
                        bufferedWriter.write("clan = " + Client.k.m);
                        bufferedWriter.newLine();
                        bufferedWriter.write("global = " + Client.k.n);
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("[GRAPHICAL]");
                        bufferedWriter.newLine();
                        bufferedWriter.write("sizeMode = " + Client.a.toString());
                        bufferedWriter.newLine();
                        bufferedWriter.write("resizableW = " + Client.c);
                        bufferedWriter.newLine();
                        bufferedWriter.write("resizableH = " + Client.d);
                        bufferedWriter.newLine();
                        bufferedWriter.write("pixelScaling = " + Client.b);
                        bufferedWriter.newLine();
                        bufferedWriter.write("gameFrame = " + aF.b().toString());
                        bufferedWriter.newLine();
                        bufferedWriter.write("zoomControl = " + Settings.g);
                        bufferedWriter.newLine();
                        bufferedWriter.write("showRoofs = " + Settings.i);
                        bufferedWriter.newLine();
                        bufferedWriter.write("orbsEnabled = " + Settings.j);
                        bufferedWriter.newLine();
                        bufferedWriter.write("orbsOnRight = " + Settings.k);
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("[MISC]");
                        bufferedWriter.newLine();
                        bufferedWriter.write("loginMusic = " + Client.O);
                        bufferedWriter.newLine();
                        bufferedWriter.write("camDragSensitivity = " + Settings.f);
                        bufferedWriter.newLine();
                        bufferedWriter.write("middleMouseCamera = " + Settings.l);
                        bufferedWriter.newLine();
                        if ((Settings.h = Client.G) < Client.H) {
                            Settings.h = Client.H;
                        }
                        if (Settings.h > Client.I) {
                            Settings.h = Client.I;
                        }
                        bufferedWriter.write("cameraZoom = " + Settings.h);
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("[XPDROP]");
                        bufferedWriter.newLine();
                        bufferedWriter.write(aH_1.e());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("[HOTKEYS]");
                        bufferedWriter.newLine();
                        for (int i = 0; i < 12; ++i) {
                            bufferedWriter.write("f" + (i + 1) + " = " + Settings.m[i]);
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.flush();
                    }
                    finally {
                        bufferedWriter.close();
                    }
                }
                finally {
                    if (t == null) {
                        final Throwable t2 = null;
                        t = t2;
                    }
                    else {
                        final Throwable t2 = null;
                        if (t != t2) {
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
            catch (IOException ex2) {
                System.out.println("error writing settings file.");
            }
        }
        Settings.a = (Client.U ? Client.S : "");
        Settings.b = (Client.U ? Client.T : "");
        Settings.c = Client.a;
        Settings.d = Client.c;
        Settings.e = Client.d;
    }
    
    public static void b() {
        if (new File(Settings.n).exists()) {
            String s = "";
            try {
                Throwable t = null;
                try {
                    final BufferedReader bufferedReader = new BufferedReader(new FileReader(Settings.n));
                    try {
                        for (String s2 = bufferedReader.readLine(); s2 != null; s2 = bufferedReader.readLine()) {
                            final String trim;
                            if ((trim = s2.trim()).startsWith("[") && trim.endsWith("]")) {
                                s = trim;
                            }
                            final int index;
                            if ((index = trim.indexOf("=")) >= 0) {
                                final String trim2 = trim.substring(0, index).trim();
                                final String trim3;
                                if (!(trim3 = trim.substring(index + 1).trim()).isEmpty() && trim3.length() > 0) {
                                    final String s3;
                                    switch ((s3 = s).hashCode()) {
                                        case -1833601947: {
                                            if (!s3.equals("[GRAPHICAL]")) {
                                                break;
                                            }
                                            final String s4;
                                            switch (s4 = trim2) {
                                                case "showRoofs": {
                                                    Settings.i = Boolean.parseBoolean(trim3);
                                                    Client.e().b(163, Settings.i ? 0 : 1);
                                                    break;
                                                }
                                                case "orbsEnabled": {
                                                    Settings.j = Boolean.parseBoolean(trim3);
                                                    Client.e().b(164, Settings.j ? 0 : 1);
                                                    break;
                                                }
                                                case "orbsOnRight": {
                                                    Settings.k = Boolean.parseBoolean(trim3);
                                                    break;
                                                }
                                                case "zoomControl": {
                                                    Settings.g = Boolean.parseBoolean(trim3);
                                                    Client.e().b(162, Settings.g ? 1 : 0);
                                                    break;
                                                }
                                                case "pixelScaling": {
                                                    if ((Client.b = Integer.parseInt(trim3)) != 1) {
                                                        Client.a(Settings.c, Client.c, Client.d);
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case "sizeMode": {
                                                    try {
                                                        Settings.c = com.runescape.a.valueOf(trim3);
                                                    }
                                                    catch (Exception ex) {
                                                        Settings.c = com.runescape.a.a;
                                                    }
                                                    break;
                                                }
                                                case "gameFrame": {
                                                    try {
                                                        aF.a(aG_1.valueOf(trim3));
                                                    }
                                                    catch (Exception ex2) {
                                                        aF.a(aG_1.a);
                                                    }
                                                    break;
                                                }
                                                case "resizableH": {
                                                    Settings.e = Integer.parseInt(trim3);
                                                    break;
                                                }
                                                case "resizableW": {
                                                    Settings.d = Integer.parseInt(trim3);
                                                    break;
                                                }
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                        case -1625628534: {
                                            if (!s3.equals("[CHAT]")) {
                                                break;
                                            }
                                            final String s5;
                                            switch ((s5 = trim2).hashCode()) {
                                                case -1243020381: {
                                                    if (!s5.equals("global")) {
                                                        break;
                                                    }
                                                    Client.k.n = Integer.parseInt(trim3);
                                                    break;
                                                }
                                                case 3056214: {
                                                    if (!s5.equals("clan")) {
                                                        break;
                                                    }
                                                    Client.k.m = Integer.parseInt(trim3);
                                                    break;
                                                }
                                                case 3165170: {
                                                    if (s5.equals("game")) {
                                                        Client.k.o = Integer.parseInt(trim3);
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        case -1616346762: {
                                            if (!s3.equals("[MISC]")) {
                                                break;
                                            }
                                            final String s6;
                                            switch (s6 = trim2) {
                                                case "cameraZoom": {
                                                    if ((Settings.h = Integer.parseInt(trim3)) < Client.H) {
                                                        Settings.h = Client.H;
                                                    }
                                                    if (Settings.h > Client.I) {
                                                        Settings.h = Client.I;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case "loginMusic": {
                                                    Client.O = Boolean.parseBoolean(trim3);
                                                    break;
                                                }
                                                case "camDragSensitivity": {
                                                    if ((Settings.f = Integer.parseInt(trim3)) <= 0) {
                                                        Settings.f = 1;
                                                    }
                                                    if (Settings.f > 10) {
                                                        Settings.f = 10;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case "middleMouseCamera": {
                                                    Settings.l = Boolean.parseBoolean(trim3);
                                                    Client.e().b(165, Settings.l ? 0 : 1);
                                                    break;
                                                }
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                        case -1466451301: {
                                            if (!s3.equals("[XPDROP]")) {
                                                break;
                                            }
                                            aH_1.a(trim2, trim3);
                                            break;
                                        }
                                        case -766703049: {
                                            if (!s3.equals("[HOTKEYS]")) {
                                                break;
                                            }
                                            for (int i = 0; i < Settings.m.length; ++i) {
                                                if (trim2.equals("f" + (i + 1))) {
                                                    Settings.m[i] = Integer.parseInt(trim3);
                                                    if (Settings.m[i] > 13 || Settings.m[i] < 0) {
                                                        Settings.m[i] = 0;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 1416700175: {
                                            if (s3.equals("[CHARACTER]")) {
                                                final String s7;
                                                switch (s7 = trim2) {
                                                    case "remember": {
                                                        Client.U = Boolean.parseBoolean(trim3);
                                                        break;
                                                    }
                                                    case "username": {
                                                        Client.S = (Settings.a = trim3);
                                                        break;
                                                    }
                                                    case "password": {
                                                        Client.T = (Settings.b = trim3);
                                                        break;
                                                    }
                                                    default:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        bufferedReader.close();
                    }
                }
                finally {
                    if (t == null) {
                        final Throwable t2 = null;
                        t = t2;
                    }
                    else {
                        final Throwable t2 = null;
                        if (t != t2) {
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
            catch (IOException ex3) {
                System.out.println("error writing settings file.");
            }
        }
    }
}

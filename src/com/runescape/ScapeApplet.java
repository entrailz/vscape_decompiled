package com.runescape;

import java.applet.*;
import uwotm8.*;
import java.awt.event.*;
import java.awt.*;

public class ScapeApplet extends Applet implements FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener, Runnable
{
    private int a;
    private int b;
    int ak;
    private final long[] c;
    int al;
    private boolean d;
    int am;
    int an;
    Graphics ao;
    q ap;
    ScapeFrame aq;
    private boolean e;
    boolean ar;
    int as;
    int at;
    public int au;
    public int av;
    private int f;
    private int g;
    private int h;
    private long i;
    public int aw;
    public int ax;
    public int ay;
    private long j;
    final int[] az;
    private final int[] k;
    private int l;
    private int m;
    public boolean aA;
    public int aB;
    private int n = 0;
    private int o = 1;
    private int p = 2;
    private int q = 3;
    private int r = 4;
    private int s = 5;
    private int t;
    private int u;
    private int v;
    private int w;
    public boolean aC;
    
    public final void a(final boolean b, final int am, final int an, final boolean b2, final boolean b3) {
        this.am = am;
        this.an = an;
        if (this.aq != null) {
            this.aq.dispose();
        }
        (this.aq = new ScapeFrame(this, am, an, b2, b)).addWindowListener(this);
        this.ao = this.aq.getGraphics();
        this.g().addMouseWheelListener(this);
        this.g().addMouseListener(this);
        this.g().addMouseMotionListener(this);
        this.g().addKeyListener(this);
        this.g().addFocusListener(this);
    }
    
    @Override
    public void run() {
        this.g().addMouseListener(this);
        this.g().addMouseMotionListener(this);
        this.g().addKeyListener(this);
        this.g().addFocusListener(this);
        this.g().addMouseWheelListener(this);
        if (this.aq != null) {
            this.aq.addWindowListener(this);
        }
        this.a(0, "Loading...");
        this.h();
        int n = 0;
        int n2 = 256;
        int n3 = 1;
        int i = 0;
        for (int j = 0; j < 10; ++j) {
            this.c[j] = System.currentTimeMillis();
        }
        while (this.a >= 0) {
            if (this.a > 0) {
                --this.a;
                if (this.a == 0) {
                    this.a();
                    return;
                }
            }
            final int n4 = n2;
            final int n5 = n3;
            n2 = 300;
            n3 = 1;
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.c[n] == 0L) {
                n2 = n4;
                n3 = n5;
            }
            else if (currentTimeMillis > this.c[n]) {
                n2 = (int)(2560 * this.b / (currentTimeMillis - this.c[n]));
            }
            if (n2 < 25) {
                n2 = 25;
            }
            if (n2 > 256) {
                n2 = 256;
                n3 = (int)(this.b - (currentTimeMillis - this.c[n]) / 10L);
            }
            if (n3 > this.b) {
                n3 = this.b;
            }
            this.c[n] = currentTimeMillis;
            n = (n + 1) % 10;
            if (n3 > 1) {
                for (int k = 0; k < 10; ++k) {
                    if (this.c[k] != 0L) {
                        final long[] c = this.c;
                        final int n6 = k;
                        c[n6] += n3;
                    }
                }
            }
            if (n3 < this.ak) {
                n3 = this.ak;
            }
            try {
                Thread.sleep(n3);
            }
            catch (InterruptedException ex) {}
            while (i < 256) {
                this.aw = this.f;
                if (Client.b > 1 && Client.a == com.runescape.a.a) {
                    this.ax = this.g / Client.b;
                    this.ay = this.h / Client.b;
                }
                else {
                    this.ax = this.g;
                    this.ay = this.h;
                }
                this.j = this.i;
                this.f = 0;
                this.d();
                this.l = this.m;
                i += n2;
            }
            i &= 0xFF;
            if (this.b > 0) {
                this.al = n2 * 1000 / (this.b << 8);
            }
            this.i();
        }
        if (this.a == -1) {
            this.a();
        }
    }
    
    private void a() {
        this.a = -2;
        this.f();
        if (this.aq != null) {
            try {
                Thread.sleep(1000L);
            }
            catch (Exception ex) {}
            try {
                System.exit(0);
            }
            catch (Throwable t) {}
        }
    }
    
    final void c(final int n) {
        this.b = 1000;
    }
    
    @Override
    public final void start() {
        if (this.a >= 0) {
            this.a = 0;
        }
    }
    
    @Override
    public final void stop() {
        if (this.a >= 0) {
            this.a = 4000 / this.b;
        }
    }
    
    @Override
    public final void destroy() {
        uwotm8.Settings.a();
        this.a = -1;
        try {
            Thread.sleep(5000L);
        }
        catch (Exception ex) {}
        if (this.a == -1) {
            this.a();
        }
    }
    
    @Override
    public final void update(final Graphics ao) {
        if (this.ao == null) {
            this.ao = ao;
        }
        this.e = true;
        this.k();
    }
    
    @Override
    public final void paint(final Graphics ao) {
        if (this.ao == null) {
            this.ao = ao;
        }
        this.e = true;
        this.k();
    }
    
    @Override
    public void mouseWheelMoved(final MouseWheelEvent mouseWheelEvent) {
        final int wheelRotation = mouseWheelEvent.getWheelRotation();
        final int wheelRotation2 = mouseWheelEvent.getWheelRotation();
        boolean b = false;
        Label_0479: {
            final int n;
            if ((n = Client.M[Client.aa]) != -1 || Client.v != -1) {
                if (n != -1) {
                    final m[] array = uwotm8.m.a[n];
                    final int n2 = (Client.a == com.runescape.a.a) ? (Client.c - 218) : ((Client.a == com.runescape.a.a) ? 28 : (Client.c - 197));
                    final int n3 = (Client.a == com.runescape.a.a) ? (Client.d - 298) : ((Client.a == com.runescape.a.a) ? 37 : (Client.d - ((Client.c >= 900) ? 37 : 74) - 267));
                    for (int i = 0; i < array.length; ++i) {
                        final m m;
                        if ((m = array[i]) != null && m.b == 0 && m.s > 0) {
                            final int n4 = m.e + n2;
                            final int n5 = m.f + n3;
                            if (this.au > n4 && this.av > n5 && this.au < n4 + m.g && this.av < n5 + m.h) {
                                final m j = m;
                                j.t += wheelRotation2 * 30;
                                Client.P = true;
                                final boolean b2;
                                b = (b2 = true);
                                break Label_0479;
                            }
                        }
                    }
                }
                if (Client.v != -1) {
                    final m[] array2 = uwotm8.m.a[Client.v];
                    final int n6 = (Client.a == com.runescape.a.a) ? 4 : (Client.c / 2 - 356);
                    final int n7 = (Client.a == com.runescape.a.a) ? 4 : (Client.d / 2 - 230);
                    for (int k = 0; k < array2.length; ++k) {
                        final m l;
                        if ((l = array2[k]) != null && l.b == 0 && l.s > 0) {
                            final int n8 = l.e + n6;
                            final int n9 = l.f + n7;
                            if (this.au > n8 && this.av > n9 && this.au < n8 + l.g && this.av < n9 + l.h) {
                                final m m2 = l;
                                m2.t += wheelRotation2 * 30;
                                final boolean b2;
                                b = (b2 = true);
                                break Label_0479;
                            }
                        }
                    }
                }
            }
            boolean b2;
            b = (b2 = false);
        }
        if (b) {
            return;
        }
        if (Client.k.ai == -1 && Client.k.b()) {
            final int n10 = (int)Client.t.b().getHeight();
            if (Client.k.ac >= 3 && Client.k.ac <= 5) {
                int j2;
                if ((j2 = Client.i + wheelRotation * 30) > Client.j) {
                    j2 = Client.j;
                }
                if (j2 < 0) {
                    j2 = 0;
                }
                if (Client.i != j2) {
                    Client.i = j2;
                    Client.ab = true;
                }
            }
            else {
                int f;
                if ((f = Client.F - wheelRotation * 30) > Client.Z - n10) {
                    f = Client.Z - n10;
                }
                if (f < 0) {
                    f = 0;
                }
                if (Client.F != f) {
                    Client.F = f;
                    Client.ab = true;
                }
            }
        }
        else if (uwotm8.Settings.g && Client.e().c()) {
            if (Client.v != -1 || (Client.G <= Client.H && wheelRotation < 0) || (Client.G >= Client.I && wheelRotation > 0)) {
                return;
            }
            Client.G += wheelRotation * 25;
        }
    }
    
    @Override
    public final void mousePressed(final MouseEvent mouseEvent) {
        final int button = mouseEvent.getButton();
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        if (this.aq != null) {
            final Insets insets = this.aq.getInsets();
            x -= insets.left;
            y -= insets.top;
        }
        this.as = 0;
        this.g = x;
        this.h = y;
        this.i = System.currentTimeMillis();
        if (button == 2 || (this.aC && (button == 1 || button == 3))) {
            this.aB = 5;
            this.v = x;
            this.w = y;
            return;
        }
        if ((mouseEvent.getModifiersEx() & 0x1000) != 0x0) {
            this.aB = 1;
            this.f = 2;
            this.at = 2;
            return;
        }
        this.aB = 0;
        this.f = 1;
        this.at = 1;
    }
    
    @Override
    public final void mouseReleased(final MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        if (this.aq != null) {
            final Insets insets = this.aq.getInsets();
            x -= insets.left;
            y -= insets.top;
        }
        this.t = x;
        this.u = y;
        this.as = 0;
        this.at = 0;
        this.aB = 3;
    }
    
    @Override
    public final void mouseClicked(final MouseEvent mouseEvent) {
    }
    
    @Override
    public final void mouseEntered(final MouseEvent mouseEvent) {
    }
    
    @Override
    public final void mouseExited(final MouseEvent mouseEvent) {
        this.as = 0;
        this.au = -1;
        this.av = -1;
    }
    
    @Override
    public final void mouseDragged(final MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        if (Client.b > 1 && Client.a == com.runescape.a.a) {
            x /= Client.b;
            y /= Client.b;
        }
        if (this.aq != null) {
            final Insets insets = this.aq.getInsets();
            x -= insets.left;
            y -= insets.top;
        }
        if (this.aB == 5) {
            final int n = this.v - mouseEvent.getX();
            final int n2 = this.w - mouseEvent.getY();
            if (Client.e() != null) {
                Client.e().a(n, -n2);
            }
            this.v = mouseEvent.getX();
            this.w = mouseEvent.getY();
            return;
        }
        this.as = 0;
        this.au = x;
        this.av = y;
        this.aB = 2;
    }
    
    @Override
    public final void mouseMoved(final MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        if (Client.b > 1 && Client.a == com.runescape.a.a) {
            x /= Client.b;
            y /= Client.b;
        }
        if (this.aq != null) {
            final Insets insets = this.aq.getInsets();
            x -= insets.left;
            if (Client.b > 1 && Client.a == com.runescape.a.a) {
                y -= insets.top + ((Client.b - 1) * -4 - 9);
            }
            else {
                y -= insets.top;
            }
        }
        this.as = 0;
        this.au = x;
        this.av = y;
        this.aB = 4;
    }
    
    @Override
    public final void keyPressed(final KeyEvent keyEvent) {
        this.as = 0;
        final int keyCode = keyEvent.getKeyCode();
        int keyChar;
        if ((keyChar = keyEvent.getKeyChar()) < 30) {
            keyChar = 0;
        }
        if (keyCode == 37) {
            keyChar = 1;
        }
        if (keyCode == 39) {
            keyChar = 2;
        }
        if (keyCode == 38) {
            keyChar = 3;
        }
        if (keyCode == 40) {
            keyChar = 4;
        }
        if (keyCode == 17) {
            keyChar = 5;
        }
        if (keyCode == 8) {
            keyChar = 8;
        }
        if (keyCode == 127) {
            keyChar = 8;
        }
        if (keyCode == 9) {
            keyChar = 9;
        }
        if (keyCode == 10) {
            keyChar = 10;
        }
        if (keyCode >= 112 && keyCode <= 123) {
            keyChar = keyCode + 1008 - 112;
        }
        if (keyCode == 36) {
            keyChar = 1000;
        }
        if (keyCode == 35) {
            keyChar = 1001;
        }
        if (keyCode == 33) {
            keyChar = 1002;
        }
        if (keyCode == 34) {
            keyChar = 1003;
        }
        if (keyCode == 112) {
            Client.b(uwotm8.Settings.m[0]);
        }
        else if (keyCode == 113) {
            Client.b(uwotm8.Settings.m[1]);
        }
        else if (keyCode == 114) {
            Client.b(uwotm8.Settings.m[2]);
        }
        else if (keyCode == 115) {
            Client.b(uwotm8.Settings.m[3]);
        }
        else if (keyCode == 116) {
            Client.b(uwotm8.Settings.m[4]);
        }
        else if (keyCode == 117) {
            Client.b(uwotm8.Settings.m[5]);
        }
        else if (keyCode == 118) {
            Client.b(uwotm8.Settings.m[6]);
        }
        else if (keyCode == 119) {
            Client.b(uwotm8.Settings.m[7]);
        }
        else if (keyCode == 120) {
            Client.b(uwotm8.Settings.m[8]);
        }
        else if (keyCode == 121) {
            Client.b(uwotm8.Settings.m[9]);
        }
        else if (keyCode == 122) {
            Client.b(uwotm8.Settings.m[10]);
        }
        else if (keyCode == 123) {
            Client.b(uwotm8.Settings.m[11]);
        }
        else if (keyCode == 18) {
            this.aC = true;
        }
        if (keyChar > 0 && keyChar < 128) {
            this.az[keyChar] = 1;
        }
        if (keyChar > 4) {
            this.k[this.m] = keyChar;
            this.m = (this.m + 1 & 0x7F);
        }
    }
    
    @Override
    public final void keyReleased(final KeyEvent keyEvent) {
        this.as = 0;
        final int keyCode = keyEvent.getKeyCode();
        int keyChar;
        if ((keyChar = keyEvent.getKeyChar()) < 30) {
            keyChar = 0;
        }
        if (keyCode == 37) {
            keyChar = 1;
        }
        if (keyCode == 39) {
            keyChar = 2;
        }
        if (keyCode == 38) {
            keyChar = 3;
        }
        if (keyCode == 40) {
            keyChar = 4;
        }
        if (keyCode == 17) {
            keyChar = 5;
        }
        if (keyCode == 8) {
            keyChar = 8;
        }
        if (keyCode == 127) {
            keyChar = 8;
        }
        if (keyCode == 9) {
            keyChar = 9;
        }
        if (keyCode == 10) {
            keyChar = 10;
        }
        if (keyCode == 18) {
            this.aC = false;
        }
        if (keyChar > 0 && keyChar < 128) {
            this.az[keyChar] = 0;
        }
    }
    
    @Override
    public final void keyTyped(final KeyEvent keyEvent) {
    }
    
    public final int d(int n) {
        n = -1;
        if (this.m != this.l) {
            n = this.k[this.l];
            this.l = (this.l + 1 & 0x7F);
        }
        return n;
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
        this.ar = true;
        this.e = true;
        this.k();
    }
    
    @Override
    public final void focusLost(final FocusEvent focusEvent) {
        this.ar = false;
        for (int i = 0; i < 128; ++i) {
            this.az[i] = 0;
        }
        this.aC = false;
    }
    
    @Override
    public final void windowActivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowClosed(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowClosing(final WindowEvent windowEvent) {
        this.destroy();
    }
    
    @Override
    public final void windowDeactivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowDeiconified(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowIconified(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowOpened(final WindowEvent windowEvent) {
    }
    
    public void h() {
    }
    
    public void f() {
    }
    
    public void d() {
    }
    
    public void i() {
    }
    
    public void k() {
    }
    
    Component g() {
        if (this.aq != null) {
            return this.aq;
        }
        return this;
    }
    
    public void a(final Runnable runnable, final int priority) {
        final Thread thread;
        (thread = new Thread(runnable)).start();
        thread.setPriority(priority);
    }
    
    void a(final int n, final String s) {
        while (this.ao == null) {
            this.ao = this.aq.getGraphics();
            try {
                this.g().repaint();
            }
            catch (Exception ex) {}
            try {
                Thread.sleep(1000L);
            }
            catch (Exception ex2) {}
        }
        final Font font = new Font("Helvetica", 1, 13);
        final FontMetrics fontMetrics = this.g().getFontMetrics(font);
        final FontMetrics fontMetrics2 = this.g().getFontMetrics(new Font("Helvetica", 0, 13));
        if (this.e) {
            this.ao.setColor(Color.black);
            this.ao.fillRect(0, 0, Client.c, Client.d);
            this.e = false;
        }
        final Color color = new Color(140, 17, 17);
        final int n2 = Client.d * Client.b / 2 - 18;
        this.ao.setColor(color);
        this.ao.drawRect(Client.c * Client.b / 2 - 152, n2, 304, 34);
        this.ao.fillRect(Client.c * Client.b / 2 - 150, n2 + 2, n * 3, 30);
        this.ao.setColor(Color.black);
        this.ao.fillRect(Client.c * Client.b / 2 - 150 + n * 3, n2 + 2, 300 - n * 3, 30);
        this.ao.setFont(font);
        this.ao.setColor(Color.white);
        this.ao.drawString(s, (Client.c * Client.b - fontMetrics.stringWidth(s)) / 2, n2 + 22);
        this.ao.drawString("", (Client.c * Client.b - fontMetrics2.stringWidth("")) / 2, n2 - 8);
    }
    
    ScapeApplet() {
        this.c = new long[10];
        this.az = new int[128];
        this.k = new int[128];
        this.aC = false;
        this.b = 20;
        this.ak = 1;
        this.d = false;
        this.e = true;
        this.ar = true;
    }
}

package com.runescape;

import javax.swing.*;
import java.awt.*;

public final class ScapeFrame extends Frame
{
    private final ScapeApplet a;
    private Toolkit b;
    private Dimension c;
    private int d;
    private int e;
    private Insets f;
    
    public ScapeFrame(final ScapeApplet a, final int n, final int n2, final boolean resizable, final boolean undecorated) {
        this.b = Toolkit.getDefaultToolkit();
        this.c = this.b.getScreenSize();
        this.d = (int)this.c.getWidth();
        this.e = (int)this.c.getHeight();
        this.f = this.getInsets();
        this.a = a;
        this.c = this.b.getScreenSize();
        this.d = (int)this.c.getWidth();
        this.e = (int)this.c.getHeight();
        //this.setIconImage(new ImageIcon(c.class.getResource("icon.png")).getImage());
        this.setTitle("/v/scape 7.2.0");
        this.setResizable(resizable);
        this.setUndecorated(undecorated);
        this.setBackground(Color.BLACK);
        this.setLocationByPlatform(true);
        this.setVisible(true);
        this.f = this.getInsets();
        if (resizable) {
            this.setMinimumSize(new Dimension(766 + this.f.left + this.f.right, 536 + this.f.top + this.f.bottom));
        }
        final String lowerCase = System.getProperty("os.name").toLowerCase();
        if (resizable && lowerCase.indexOf("mac") >= 0) {
            this.setSize(this.d, this.e);
        }
        else {
            this.setSize(n + this.f.left + this.f.right, n2 + this.f.top + this.f.bottom);
        }
        this.setVisible(true);
        this.setFocusTraversalKeysEnabled(false);
        this.requestFocus();
        this.toFront();
    }
    
    @Override
    public final Graphics getGraphics() {
        final Graphics graphics = super.getGraphics();
        final Insets insets = this.getInsets();
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.translate((insets != null) ? insets.left : 0, (insets != null) ? insets.top : 0);
        return graphics;
    }
    
    public final int a() {
        final Insets insets = this.getInsets();
        return this.getWidth() - (insets.left + insets.right);
    }
    
    public final int b() {
        final Insets insets = this.getInsets();
        return this.getHeight() - (insets.top + insets.bottom);
    }
    
    @Override
    public final void update(final Graphics graphics) {
        this.a.update(graphics);
    }
    
    @Override
    public final void paint(final Graphics graphics) {
        this.a.paint(graphics);
    }
}

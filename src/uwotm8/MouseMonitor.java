package uwotm8;

import com.runescape.*;

public final class MouseMonitor implements Runnable
{
    private Client c;
    private Object d;
    private int[] e;
    public boolean a;
    private int[] f;
    public int b;
    
    @Override
    public final void run() {
        while (this.a) {
            synchronized (this.d) {
                if (this.b < 500) {
                    this.f[this.b] = this.c.au;
                    this.e[this.b] = this.c.av;
                    ++this.b;
                }
            }
            // monitorexit(this.d)
            try {
                Thread.sleep(50L);
            }
            catch (Exception ex) {}
        }
    }
    
    public MouseMonitor(final Client c) {
        this.d = new Object();
        this.e = new int[500];
        this.a = true;
        this.f = new int[500];
        this.c = c;
    }
}

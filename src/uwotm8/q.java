package uwotm8;

import com.runescape.*;
import java.awt.*;
import java.awt.image.*;

public final class q
{
    private int[] c;
    public final int a;
    public final int b;
    private final BufferedImage d;
    
    public q(final int a, final int b) {
        this.a = a;
        this.b = b;
        this.d = new BufferedImage(a, b, 1);
        this.c = ((DataBufferInt)this.d.getRaster().getDataBuffer()).getData();
        this.a();
    }
    
    public final void a(final int n, final Graphics graphics, final int n2) {
        if (Client.b > 1 && Client.a() == com.runescape.a.a) {
            graphics.drawImage(this.d, n2 * Client.b, n * Client.b, this.a * Client.b, this.b * Client.b, null);
            return;
        }
        graphics.drawImage(this.d, n2, n, null);
    }
    
    public final void a() {
        p.a(this.b, this.a, this.c);
    }
}

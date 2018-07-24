package uwotm8;

import java.net.*;
import com.runescape.*;
import java.io.*;

public final class ai implements Runnable
{
    private InputStream a;
    private OutputStream b;
    private final Socket c;
    private boolean d;
    private final com.runescape.b e;
    private byte[] f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    
    public ai(final com.runescape.b e, final Socket c) throws IOException {
        this.d = false;
        this.i = false;
        this.j = false;
        this.e = e;
        (this.c = c).setSoTimeout(30000);
        this.c.setTcpNoDelay(true);
        this.a = this.c.getInputStream();
        this.b = this.c.getOutputStream();
    }
    
    public final void a() {
        this.d = true;
        try {
            if (this.a != null) {
                this.a.close();
            }
            if (this.b != null) {
                this.b.close();
            }
            if (this.c != null) {
                this.c.close();
            }
        }
        catch (IOException ex) {
            System.out.println("Error closing stream");
        }
        this.i = false;
        synchronized (this) {
            this.notify();
        }
        this.f = null;
    }
    
    public final int b() throws IOException {
        if (this.d) {
            return 0;
        }
        return this.a.read();
    }
    
    public final int c() throws IOException {
        if (this.d) {
            return 0;
        }
        return this.a.available();
    }
    
    public final void a(final byte[] array, int i) throws IOException {
        int n = 0;
        if (this.d) {
            return;
        }
        while (i > 0) {
            final int read;
            if ((read = this.a.read(array, n, i)) <= 0) {
                throw new IOException("EOF");
            }
            n += read;
            i -= read;
        }
    }
    
    public final void a(int var1, byte[] var2) throws IOException {
        if (!this.d) {
           if (this.j) {
              this.j = false;
              throw new IOException("Error in writer thread");
           } else {
              if (this.f == null) {
                 this.f = new byte[5000];
              }

              synchronized(this) {
                 for(int var4 = 0; var4 < var1; ++var4) {
                    this.f[this.h] = var2[var4];
                    this.h = (this.h + 1) % 5000;
                    if (this.h == (this.g + 4900) % 5000) {
                       throw new IOException("buffer overflow");
                    }
                 }

                 if (!this.i) {
                    this.i = true;
                    this.e.a(this, 3);
                 }

                 this.notify();
              }
           }
        }
     }
    
    @Override
    public final void run() {
        while (this.i) {
            final int g;
            int n;
            synchronized (this) {
                if (this.h == this.g) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException ex) {}
                }
                if (!this.i) {
                    // monitorexit(this)
                    return;
                }
                g = this.g;
                if (this.h >= this.g) {
                    n = this.h - this.g;
                }
                else {
                    n = 5000 - this.g;
                }
            }
            if (n > 0) {
                try {
                    this.b.write(this.f, g, n);
                }
                catch (IOException ex2) {
                    this.j = true;
                }
                this.g = (this.g + n) % 5000;
                try {
                    if (this.h != this.g) {
                        continue;
                    }
                    this.b.flush();
                }
                catch (IOException ex3) {
                    this.j = true;
                }
            }
        }
    }
}

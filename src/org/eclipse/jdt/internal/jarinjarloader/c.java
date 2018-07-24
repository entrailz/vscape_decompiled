package org.eclipse.jdt.internal.jarinjarloader;

import java.net.*;

public final class c extends URLStreamHandler
{
    private ClassLoader a;
    
    public c(final ClassLoader a) {
        this.a = a;
    }
    
    protected final URLConnection openConnection(final URL url) {
        return new b(url, this.a);
    }
    
    protected final void parseURL(final URL url, String s, final int n, final int n2) {
        Label_0086: {
            if (s.startsWith("rsrc:")) {
                s = s.substring(5);
            }
            else {
                if (!url.getFile().equals("./")) {
                    if (url.getFile().endsWith("/")) {
                        s = String.valueOf(url.getFile()) + s;
                        break Label_0086;
                    }
                    if ("#runtime".equals(s)) {
                        s = url.getFile();
                        break Label_0086;
                    }
                }
                s = s;
            }
        }
        this.setURL(url, "rsrc", "", -1, null, null, s, null, null);
    }
}

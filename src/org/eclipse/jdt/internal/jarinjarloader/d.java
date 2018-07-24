package org.eclipse.jdt.internal.jarinjarloader;

import java.net.*;

public final class d implements URLStreamHandlerFactory
{
    private ClassLoader a;
    
    public d(final ClassLoader a) {
        this.a = a;
    }
    
    public final URLStreamHandler createURLStreamHandler(final String s) {
        if ("rsrc".equals(s)) {
            return new c(this.a);
        }
        return null;
    }
}

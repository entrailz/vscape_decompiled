package org.eclipse.jdt.internal.jarinjarloader;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

public final class b extends URLConnection {
   private ClassLoader a;

   public b(URL var1, ClassLoader var2) {
      super(var1);
      this.a = var2;
   }

   public final void connect() {
   }

   public final InputStream getInputStream() throws UnsupportedEncodingException, MalformedURLException {
      String var1 = URLDecoder.decode(super.url.getFile(), "UTF-8");
      InputStream var2;
      if ((var2 = this.a.getResourceAsStream(var1)) == null) {
         throw new MalformedURLException("Could not open InputStream for URL '" + super.url + "'");
      } else {
         return var2;
      }
   }
}

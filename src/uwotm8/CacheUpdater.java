package uwotm8;

import com.runescape.*;
import java.net.*;
import java.io.*;
import java.util.zip.*;

public final class CacheUpdater
{
    private Client a;
    private final int b = 1024;
    private int c;
    private String d;
    
    public CacheUpdater(final Client a) {
        this.c = 0;
        this.d = String.valueOf(SignLink.getLocalCacheDirectory()) + d();
        this.a = a;
    }
    
    public static int a() throws MalformedURLException, IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("http://vidyascape.org/files/cache/versionLive.dat").openStream()));
        try {
            final String line;
            if ((line = bufferedReader.readLine()) != null) {
                bufferedReader.close();
                return Integer.parseInt(line);
            }
            bufferedReader.close();
            return 0;
        }
        catch (IOException ex) {
            System.out.println("problem reading remote cache version");
            bufferedReader.close();
            return 0;
        }
    }
    
    public static int b() throws IOException {
        final File file = new File(String.valueOf(SignLink.getLocalCacheDirectory()) + "cacheVersion.dat");
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        if (!file.exists()) {
            bufferedReader.close();
            return 0;
        }
        try {
            final String line;
            if ((line = bufferedReader.readLine()) != null) {
                bufferedReader.close();
                return Integer.parseInt(line);
            }
            bufferedReader.close();
            return 0;
        }
        catch (IOException ex) {
            bufferedReader.close();
            return 0;
        }
    }
    
    public final CacheUpdater c() {
        try {
            final File file = new File(String.valueOf(SignLink.getLocalCacheDirectory()) + "cacheVersion.dat");
            final int a = a();
            if (!file.exists()) {
                this.a("http://vidyascape.org/files/cache/live.zip", d());
                this.e();
                this.c = a();
                final BufferedWriter bufferedWriter;
                (bufferedWriter = new BufferedWriter(new FileWriter(file))).write(new StringBuilder(String.valueOf(this.c)).toString());
                bufferedWriter.flush();
                bufferedWriter.close();
            }
            else {
                this.c = b();
                if (a == this.c) {
                    return null;
                }
                this.a("http://vidyascape.org/files/cache/live.zip", d());
                this.e();
                this.c = a();
                final BufferedWriter bufferedWriter2;
                (bufferedWriter2 = new BufferedWriter(new FileWriter(file))).write(new StringBuilder(String.valueOf(this.c)).toString());
                bufferedWriter2.flush();
                bufferedWriter2.close();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    private void a(final String s, final String s2) {
        OutputStream outputStream = null;
        InputStream inputStream = null;
        int n = 0;
        try {
            final URL url = new URL(s);
            outputStream = new BufferedOutputStream(new FileOutputStream(String.valueOf(SignLink.getLocalCacheDirectory()) + s2));
            final URLConnection openConnection;
            inputStream = (openConnection = url.openConnection()).getInputStream();
            final byte[] array = new byte[1024];
            long n2 = 0L;
            final int contentLength = openConnection.getContentLength();
            int read;
            while ((read = inputStream.read(array)) != -1) {
                outputStream.write(array, 0, read);
                final int n3;
                if ((n3 = (int)((n2 += read) / contentLength * 100.0)) > n) {
                    final int n4 = n3;
                    final String string = "Downloading Cache " + n3 + "%";
                    this.a.a(n4, string);
                    System.out.println(string);
                    n = n3;
                }
            }
            final String s3 = "Finished downloading cache!";
            this.a.a(35, s3);
            System.out.println(s3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                return;
            }
            catch (IOException ex2) {
                return;
            }
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            catch (IOException ex3) {}
        }
        try {
            if (inputStream != null) {
                inputStream.close();
            }
            outputStream.close();
        }
        catch (IOException ex4) {}
    }
    
    private static String d() {
        final int lastIndex;
        if ((lastIndex = "http://vidyascape.org/files/cache/live.zip".lastIndexOf(47)) >= 0 && lastIndex < 42 - 1) {
            return "http://vidyascape.org/files/cache/live.zip".substring(lastIndex + 1);
        }
        System.err.println("error retreiving archivaed name.");
        return "";
    }
    
    private void e() {
        try {
            final ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(this.d)));
            ZipEntry nextEntry;
            while ((nextEntry = zipInputStream.getNextEntry()) != null) {
                if (nextEntry.isDirectory()) {
                    new File(String.valueOf(SignLink.getLocalCacheDirectory()) + nextEntry.getName()).mkdir();
                }
                else {
                    if (nextEntry.getName().equals(this.d)) {
                        a(zipInputStream, this.d);
                        break;
                    }
                    a(zipInputStream, String.valueOf(SignLink.getLocalCacheDirectory()) + nextEntry.getName());
                }
            }
            zipInputStream.close();
            final File file;
            final String name = (file = new File(this.d)).getName();
            if (!file.exists()) {
                throw new IllegalArgumentException("Cache Delete: no such file or directory: ".concat(String.valueOf(name)));
            }
            if (!file.canWrite()) {
                throw new IllegalArgumentException("Cache Delete: write protected: ".concat(String.valueOf(name)));
            }
            if (file.isDirectory() && file.list().length > 0) {
                throw new IllegalArgumentException("Cache Delete: directory not empty: ".concat(String.valueOf(name)));
            }
            final boolean delete;
            if (!(delete = file.delete())) {
                throw new IllegalArgumentException("Cache Delete: deletion failed");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void a(final ZipInputStream zipInputStream, final String s) throws IOException {
        final FileOutputStream fileOutputStream = new FileOutputStream(s);
        final byte[] array = new byte[1024];
        int read;
        while ((read = zipInputStream.read(array)) != -1) {
            fileOutputStream.write(array, 0, read);
        }
        fileOutputStream.close();
    }
}

package uwotm8;

import java.util.*;
import java.io.*;
import uwotm8.Sprite;

public final class aA_1
{
    private String b;
    private int c;
    private Sprite[] d;
    private aA_1 e;
    public final Map a;
    
    public aA_1(final String s) {
        this.d = null;
        this.a = new HashMap();
        this.b = s.toLowerCase();
    }
    
    public aA_1(final String s, final aA_1 e) {
        this(s);
        this.e = e;
    }
    
    public final void a(final DataInputStream dataInputStream, final DataInputStream dataInputStream2) throws IOException {
        this.c = dataInputStream.readInt();
        this.d = new Sprite[this.c];
        for (int i = 0; i < this.c; ++i) {
            final byte[] array = new byte[dataInputStream2.readInt()];
            dataInputStream2.readFully(array);
            this.d[i] = new Sprite(array);
        }
    }
    
    public final Sprite a(final int n) {
        if (n >= 0 && n <= this.c) {
            return this.d[n];
        }
        return null;
    }
    
    public final boolean a() {
        return this.e != null;
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}

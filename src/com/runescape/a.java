package com.runescape;

public enum a
{
    a("FIXED", 0), 
    b("RESIZABLE", 1), 
    c("FULLSCREEN", 2);
    
    static {
        a[] d = new a[] { a.a, a.b, a.c };
    }
    
    private a(final String s, final int n) {
    }
}

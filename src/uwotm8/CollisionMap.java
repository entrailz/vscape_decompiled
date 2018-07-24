package uwotm8;

public final class CollisionMap
{
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    public final int[][] a;
    
    public CollisionMap() {
        this.b = 0;
        this.c = 0;
        this.d = 104;
        this.e = 104;
        this.a = new int[104][104];
        this.a();
    }
    
    public final void a() {
        for (int i = 0; i < 104; ++i) {
            for (int j = 0; j < 104; ++j) {
                if (i == 0 || j == 0 || i == 103 || j == 103) {
                    this.a[i][j] = 16777215;
                }
                else {
                    this.a[i][j] = 16777216;
                }
            }
        }
    }
    
    public final void a(int n, final int n2, int n3, final int n4, final boolean b) {
        n3 = n3;
        n = n;
        if (n4 == 0) {
            if (n2 == 0) {
                this.a(n3, n, 128);
                this.a(n3 - 1, n, 8);
            }
            if (n2 == 1) {
                this.a(n3, n, 2);
                this.a(n3, n + 1, 32);
            }
            if (n2 == 2) {
                this.a(n3, n, 8);
                this.a(n3 + 1, n, 128);
            }
            if (n2 == 3) {
                this.a(n3, n, 32);
                this.a(n3, n - 1, 2);
            }
        }
        if (n4 == 1 || n4 == 3) {
            if (n2 == 0) {
                this.a(n3, n, 1);
                this.a(n3 - 1, n + 1, 16);
            }
            if (n2 == 1) {
                this.a(n3, n, 4);
                this.a(n3 + 1, n + 1, 64);
            }
            if (n2 == 2) {
                this.a(n3, n, 16);
                this.a(n3 + 1, n - 1, 1);
            }
            if (n2 == 3) {
                this.a(n3, n, 64);
                this.a(n3 - 1, n - 1, 4);
            }
        }
        if (n4 == 2) {
            if (n2 == 0) {
                this.a(n3, n, 130);
                this.a(n3 - 1, n, 8);
                this.a(n3, n + 1, 32);
            }
            if (n2 == 1) {
                this.a(n3, n, 10);
                this.a(n3, n + 1, 32);
                this.a(n3 + 1, n, 128);
            }
            if (n2 == 2) {
                this.a(n3, n, 40);
                this.a(n3 + 1, n, 128);
                this.a(n3, n - 1, 2);
            }
            if (n2 == 3) {
                this.a(n3, n, 160);
                this.a(n3, n - 1, 2);
                this.a(n3 - 1, n, 8);
            }
        }
        if (b) {
            if (n4 == 0) {
                if (n2 == 0) {
                    this.a(n3, n, 65536);
                    this.a(n3 - 1, n, 4096);
                }
                if (n2 == 1) {
                    this.a(n3, n, 1024);
                    this.a(n3, n + 1, 16384);
                }
                if (n2 == 2) {
                    this.a(n3, n, 4096);
                    this.a(n3 + 1, n, 65536);
                }
                if (n2 == 3) {
                    this.a(n3, n, 16384);
                    this.a(n3, n - 1, 1024);
                }
            }
            if (n4 == 1 || n4 == 3) {
                if (n2 == 0) {
                    this.a(n3, n, 512);
                    this.a(n3 - 1, n + 1, 8192);
                }
                if (n2 == 1) {
                    this.a(n3, n, 2048);
                    this.a(n3 + 1, n + 1, 32768);
                }
                if (n2 == 2) {
                    this.a(n3, n, 8192);
                    this.a(n3 + 1, n - 1, 512);
                }
                if (n2 == 3) {
                    this.a(n3, n, 32768);
                    this.a(n3 - 1, n - 1, 2048);
                }
            }
            if (n4 == 2) {
                if (n2 == 0) {
                    this.a(n3, n, 66560);
                    this.a(n3 - 1, n, 4096);
                    this.a(n3, n + 1, 16384);
                }
                if (n2 == 1) {
                    this.a(n3, n, 5120);
                    this.a(n3, n + 1, 16384);
                    this.a(n3 + 1, n, 65536);
                }
                if (n2 == 2) {
                    this.a(n3, n, 20480);
                    this.a(n3 + 1, n, 65536);
                    this.a(n3, n - 1, 1024);
                }
                if (n2 == 3) {
                    this.a(n3, n, 81920);
                    this.a(n3, n - 1, 1024);
                    this.a(n3 - 1, n, 4096);
                }
            }
        }
    }
    
    public final void a(final boolean b, int n, int n2, int n3, int n4, int i) {
        int n5 = 256;
        if (b) {
            n5 = 131328;
        }
        n3 = n3;
        n4 = n4;
        if (i == 1 || i == 3) {
            final int n6 = n;
            n = n2;
            n2 = n6;
        }
        for (int j = n3; j < n3 + n; ++j) {
            if (j >= 0 && j < 104) {
                for (i = n4; i < n4 + n2; ++i) {
                    if (i >= 0 && i < 104) {
                        this.a(j, i, n5);
                    }
                }
            }
        }
    }
    
    public final void a(int n, int n2) {
        n2 = n2;
        n = n;
        final int[] array = this.a[n2];
        final int n3 = n;
        array[n3] |= 0x200000;
    }
    
    private void a(final int n, final int n2, final int n3) {
        final int[] array = this.a[n];
        array[n2] |= n3;
    }
    
    public final void a(final int n, final int n2, final boolean b, int n3, int n4) {
        n3 = n3;
        n4 = n4;
        if (n2 == 0) {
            if (n == 0) {
                this.b(128, n3, n4);
                this.b(8, n3 - 1, n4);
            }
            if (n == 1) {
                this.b(2, n3, n4);
                this.b(32, n3, n4 + 1);
            }
            if (n == 2) {
                this.b(8, n3, n4);
                this.b(128, n3 + 1, n4);
            }
            if (n == 3) {
                this.b(32, n3, n4);
                this.b(2, n3, n4 - 1);
            }
        }
        if (n2 == 1 || n2 == 3) {
            if (n == 0) {
                this.b(1, n3, n4);
                this.b(16, n3 - 1, n4 + 1);
            }
            if (n == 1) {
                this.b(4, n3, n4);
                this.b(64, n3 + 1, n4 + 1);
            }
            if (n == 2) {
                this.b(16, n3, n4);
                this.b(1, n3 + 1, n4 - 1);
            }
            if (n == 3) {
                this.b(64, n3, n4);
                this.b(4, n3 - 1, n4 - 1);
            }
        }
        if (n2 == 2) {
            if (n == 0) {
                this.b(130, n3, n4);
                this.b(8, n3 - 1, n4);
                this.b(32, n3, n4 + 1);
            }
            if (n == 1) {
                this.b(10, n3, n4);
                this.b(32, n3, n4 + 1);
                this.b(128, n3 + 1, n4);
            }
            if (n == 2) {
                this.b(40, n3, n4);
                this.b(128, n3 + 1, n4);
                this.b(2, n3, n4 - 1);
            }
            if (n == 3) {
                this.b(160, n3, n4);
                this.b(2, n3, n4 - 1);
                this.b(8, n3 - 1, n4);
            }
        }
        if (b) {
            if (n2 == 0) {
                if (n == 0) {
                    this.b(65536, n3, n4);
                    this.b(4096, n3 - 1, n4);
                }
                if (n == 1) {
                    this.b(1024, n3, n4);
                    this.b(16384, n3, n4 + 1);
                }
                if (n == 2) {
                    this.b(4096, n3, n4);
                    this.b(65536, n3 + 1, n4);
                }
                if (n == 3) {
                    this.b(16384, n3, n4);
                    this.b(1024, n3, n4 - 1);
                }
            }
            if (n2 == 1 || n2 == 3) {
                if (n == 0) {
                    this.b(512, n3, n4);
                    this.b(8192, n3 - 1, n4 + 1);
                }
                if (n == 1) {
                    this.b(2048, n3, n4);
                    this.b(32768, n3 + 1, n4 + 1);
                }
                if (n == 2) {
                    this.b(8192, n3, n4);
                    this.b(512, n3 + 1, n4 - 1);
                }
                if (n == 3) {
                    this.b(32768, n3, n4);
                    this.b(2048, n3 - 1, n4 - 1);
                }
            }
            if (n2 == 2) {
                if (n == 0) {
                    this.b(66560, n3, n4);
                    this.b(4096, n3 - 1, n4);
                    this.b(16384, n3, n4 + 1);
                }
                if (n == 1) {
                    this.b(5120, n3, n4);
                    this.b(16384, n3, n4 + 1);
                    this.b(65536, n3 + 1, n4);
                }
                if (n == 2) {
                    this.b(20480, n3, n4);
                    this.b(65536, n3 + 1, n4);
                    this.b(1024, n3, n4 - 1);
                }
                if (n == 3) {
                    this.b(81920, n3, n4);
                    this.b(1024, n3, n4 - 1);
                    this.b(4096, n3 - 1, n4);
                }
            }
        }
    }
    
    public final void a(int i, int n, int n2, int n3, int n4, final boolean b) {
        int n5 = 256;
        if (b) {
            n5 = 131328;
        }
        n2 = n2;
        n3 = n3;
        if (i == 1 || i == 3) {
            i = n;
            n = n4;
            n4 = i;
        }
        int j;
        for (i = n2; i < n2 + n; ++i) {
            if (i >= 0 && i < 104) {
                for (j = n3; j < n3 + n4; ++j) {
                    if (j >= 0 && j < 104) {
                        this.b(n5, i, j);
                    }
                }
            }
        }
    }
    
    private void b(final int n, final int n2, final int n3) {
        final int[] array = this.a[n2];
        array[n3] &= 16777215 - n;
    }
    
    public final void b(int n, int n2) {
        n2 = n2;
        n = n;
        final int[] array = this.a[n2];
        final int n3 = n;
        array[n3] &= 0xDFFFFF;
    }
    
    public final boolean a(int n, int n2, int n3, final int n4, final int n5, int n6) {
        if (n2 == n && n3 == n6) {
            return true;
        }
        n2 = n2;
        n3 = n3;
        n = n;
        n6 = n6;
        if (n5 == 0) {
            if (n4 == 0) {
                if (n2 == n - 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0x0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0x0) {
                    return true;
                }
            }
            else if (n4 == 1) {
                if (n2 == n && n3 == n6 + 1) {
                    return true;
                }
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0x0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0x0) {
                    return true;
                }
            }
            else if (n4 == 2) {
                if (n2 == n + 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0x0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0x0) {
                    return true;
                }
            }
            else if (n4 == 3) {
                if (n2 == n && n3 == n6 - 1) {
                    return true;
                }
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0x0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0x0) {
                    return true;
                }
            }
        }
        if (n5 == 2) {
            if (n4 == 0) {
                if (n2 == n - 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0x0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0x0) {
                    return true;
                }
            }
            else if (n4 == 1) {
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0x0) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0x0) {
                    return true;
                }
            }
            else if (n4 == 2) {
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0x0) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0x0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1) {
                    return true;
                }
            }
            else if (n4 == 3) {
                if (n2 == n - 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0x0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0x0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1) {
                    return true;
                }
            }
        }
        if (n5 == 9) {
            if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x20) == 0x0) {
                return true;
            }
            if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x2) == 0x0) {
                return true;
            }
            if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x8) == 0x0) {
                return true;
            }
            if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x80) == 0x0) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b(int n, int n2, int n3, final int n4, int n5, int n6) {
        if (n6 == n && n3 == n2) {
            return true;
        }
        n6 = n6;
        n3 = n3;
        n = n;
        n2 = n2;
        if (n4 == 6 || n4 == 7) {
            if (n4 == 7) {
                n5 = (n5 + 2 & 0x3);
            }
            if (n5 == 0) {
                if (n6 == n + 1 && n3 == n2 && (this.a[n6][n3] & 0x80) == 0x0) {
                    return true;
                }
                if (n6 == n && n3 == n2 - 1 && (this.a[n6][n3] & 0x2) == 0x0) {
                    return true;
                }
            }
            else if (n5 == 1) {
                if (n6 == n - 1 && n3 == n2 && (this.a[n6][n3] & 0x8) == 0x0) {
                    return true;
                }
                if (n6 == n && n3 == n2 - 1 && (this.a[n6][n3] & 0x2) == 0x0) {
                    return true;
                }
            }
            else if (n5 == 2) {
                if (n6 == n - 1 && n3 == n2 && (this.a[n6][n3] & 0x8) == 0x0) {
                    return true;
                }
                if (n6 == n && n3 == n2 + 1 && (this.a[n6][n3] & 0x20) == 0x0) {
                    return true;
                }
            }
            else if (n5 == 3) {
                if (n6 == n + 1 && n3 == n2 && (this.a[n6][n3] & 0x80) == 0x0) {
                    return true;
                }
                if (n6 == n && n3 == n2 + 1 && (this.a[n6][n3] & 0x20) == 0x0) {
                    return true;
                }
            }
        }
        if (n4 == 8) {
            if (n6 == n && n3 == n2 + 1 && (this.a[n6][n3] & 0x20) == 0x0) {
                return true;
            }
            if (n6 == n && n3 == n2 - 1 && (this.a[n6][n3] & 0x2) == 0x0) {
                return true;
            }
            if (n6 == n - 1 && n3 == n2 && (this.a[n6][n3] & 0x8) == 0x0) {
                return true;
            }
            if (n6 == n + 1 && n3 == n2 && (this.a[n6][n3] & 0x80) == 0x0) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean a(final int n, final int n2, final int n3, int n4, final int n5, int n6, final int n7) {
        n6 = n2 + n6 - 1;
        n4 = n + n4 - 1;
        return (n3 >= n2 && n3 <= n6 && n7 >= n && n7 <= n4) || (n3 == n2 - 1 && n7 >= n && n7 <= n4 && (this.a[n3][n7] & 0x8) == 0x0 && (n5 & 0x8) == 0x0) || (n3 == n6 + 1 && n7 >= n && n7 <= n4 && (this.a[n3][n7] & 0x80) == 0x0 && (n5 & 0x2) == 0x0) || (n7 == n - 1 && n3 >= n2 && n3 <= n6 && (this.a[n3][n7] & 0x2) == 0x0 && (n5 & 0x4) == 0x0) || (n7 == n4 + 1 && n3 >= n2 && n3 <= n6 && (this.a[n3][n7] & 0x20) == 0x0 && (n5 & 0x1) == 0x0);
    }
}

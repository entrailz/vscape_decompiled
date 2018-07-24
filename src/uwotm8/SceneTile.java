package uwotm8;

public final class SceneTile extends Node
{
    int a;
    final int b;
    final int c;
    final int d;
    public SimpleTile e;
    public ShapedTile f;
    public Wall g;
    public WallDecoration h;
    public GroundDecoration i;
    public GroundItem j;
    int k;
    public final GameObject[] l;
    final int[] m;
    int n;
    int o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    int t;
    int u;
    int v;
    public SceneTile w;
    
    public SceneTile(final int n, final int b, final int c) {
        this.l = new GameObject[5];
        this.m = new int[5];
        this.a = n;
        this.d = n;
        this.b = b;
        this.c = c;
    }
}

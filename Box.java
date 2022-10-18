package thisdemo;

public class Box {
    private int l,b,h;
    public Box()
    {

        this(0);

    }
    public Box(int s)
    {
        this(s,s,s);
    }
    public Box(int i,int j,int k)
    {
        l=i;
        b=j;
        h=k;
    }
    public void show()
    {
        System.out.println("Length is:"+l);
        System.out.println("breath  is:"+b);
        System.out.println("Higth is:"+h);
        System.out.println();
    }
}

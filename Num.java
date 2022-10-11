package argumentpassingdemo;

public class Num {
    private int a,b;
    public void setNum(int i,int j)
    {
        a=i;
        b=j;
    }
    public void showNum()
    {
        System.out.println("a="+a+",b="+b);
    }
    public void increment(Num P)
    {
        P.a++;
        P.b++;
    }
}

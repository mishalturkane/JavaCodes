package staticdemo;

public class Emp {
    private int age;
    private String name;
    private int id;
    private static int nextId=1;

    public Emp(int a,String n)
    {
        age=a;
        name=n;
        id=nextId++;
    }
    public void show()
    {
        System.out.println("id="+id+",name is="+name+",age is="+age);
    }
    public void showNextId()
    {
        System.out.println("Id of next EMP is="+nextId);
    }
    protected void finalize()
    {
        --nextId;
    }
}

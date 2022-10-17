package staticblock;

public class Emp {
    public static String compname="Google";
    public Emp()
    {
        System.out.println("Emp constructor called:");
    }
    static
    {
        System.out.println("static1 blocked:");
    }
    static
    {
        System.out.println("static2 blocked:");
    }
    static
    {
        System.out.println("static3 blocked:");
    }
    static
    {
        System.out.println("static4 blocked:");
    }
}

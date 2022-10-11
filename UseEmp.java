package staticdemo;

public class UseEmp {
    public static void main(String[] args) {
        Emp e=new Emp(21,"Mishal");
        e.show();
        Emp f=new Emp(19,"Khusboo");
        f.show();
        e.showNextId();
        {
            Emp x=new Emp(15,"vilash");
            Emp y=new Emp(20,"Muskan");

            x.show();
            y.show();
            x.showNextId();

            x=y=null;
            System.gc();
            System.runFinalization();
        }
        e.showNextId();

    }
}

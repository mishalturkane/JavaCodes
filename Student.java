package finaldemo;

public class Student {
    private final int roll;
    private String name;
    private static final int MAX_MARKS;

    static {
             MAX_MARKS=100;
    }


    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

   public void show()
   {
       System.out.println("Roll:"+roll+" Name is:"+name);
   }
}

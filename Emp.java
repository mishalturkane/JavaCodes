package thisdemo;

public class Emp {
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void show()
    {
        System.out.println("id is:"+id);
        System.out.println("Name is:"+name);
        System.out.println("Salary is:"+salary);
    }
}


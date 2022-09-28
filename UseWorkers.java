package Workers.in;

import java.util.Scanner;

public class UseWorkers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Worker hours worked :");
        int h=kb.nextInt();
        System.out.println("Enter payrate  :");
        int r=kb.nextInt();
        Worker obj=new Worker();
        obj.setData(h,r);
        double Salary;
        Salary= obj.getSalary();
        System.out.println("The Salary of the worker is:"+Salary);
    }
}

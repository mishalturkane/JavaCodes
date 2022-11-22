package excepdemo2;

import java.util.*;

public class DivideAndSum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 int:");

        double a=0,b=0;
        try{
            a=kb.nextDouble();
            b=kb.nextDouble();
            double c=a/b;
            System.out.println("The divide is:"+c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Please enter non-zero as denominator");
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Please enter double only");
            System.exit(0);
        }
        double d=a+b;
        System.out.println("Sum is:"+d);
    }
}

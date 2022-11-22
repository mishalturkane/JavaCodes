package excepdemo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddDivide {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter  2 int:");
        double  a=0,b=0;
        try {
             a = kb.nextDouble();
             b = kb.nextDouble();
             double  d = a / b;
            System.out.println("The divide is:" + d);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("please enter non zero denominator");
        }
        catch (InputMismatchException ex)
        {
            System.out.println("please enter  double only");
            System.exit(0);
        }
        double c=a+b;
        System.out.println("The sum is:"+c);
    }

}

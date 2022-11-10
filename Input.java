package exceptdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 int:");
        int i = 0,j=0;

        try
        {
             i=kb.nextInt();
            j=kb.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Pleas enter a integer values");
        }
        if(i!=0 || j!=0) {
            try {
                int k;
                k = i / j;
                System.out.println("Division is" + k);
            } catch (ArithmeticException ex) {
                System.out.println("Please do not enter zero(0) as a denominator in input:");
            }
        }

            int s = i + j;
            System.out.println("The sum is:" + s);

    }
}

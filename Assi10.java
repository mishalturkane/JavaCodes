package mishal;

import java.util.Scanner;

public class Assi10 {
    public static void main(String[] args)
    {
        String c;
        Scanner kb=new Scanner (System.in);
        System.out.println("Choose an Operation : +, -, *, / ");
        System.out.print("Enter input: ");
        c=kb.next();
        int a,b;
        System.out.print("Enter the first number:");
        a=kb.nextInt();
        System.out.print("Enter the second number:");
        b=kb.nextInt();
        if(c.equalsIgnoreCase("+"))
        {
            System.out.println(a+" "+c+" "+b+" = "+(a+b));
        }
        else if(c.equalsIgnoreCase("-"))
        {
            System.out.println(a+" "+c+" "+b+" = "+(a-b));
        }
        else if(c.equalsIgnoreCase("*"))
        {
            System.out.println(a+" "+c+" "+b+" = "+(a*b));
        }
        else if(c.equalsIgnoreCase("/"))
        {

            System.out.println(a+" "+c+" "+b+" = "+(float)(a/b));
        }

    }
}

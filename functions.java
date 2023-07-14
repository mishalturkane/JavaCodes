package basic;

import static basic.UseFunctions.a;
import static basic.UseFunctions.b;

public class functions {
    int add(int x,int y)
    {
        int a=x;
        int b=y;
        return a+b;
    }

    void sub(int x,int y)
    {
        int a=x;
        int b=y;
        int sub=a-b;
        System.out.println("The subtraction is:"+sub);
    }
    int mul()
    {
        return a*b;
    }
    void div()
    {
        int division=a/b;
        System.out.println("Division is:"+division);
    }
}

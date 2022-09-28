package circleexample.in;

import java.util.Scanner;

public class UseCircle {
    public static void main(String [] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter radius:");
        int r=kb.nextInt();
        Circle obj=new Circle();
        obj.setRadius(r);
        double ar,circ;
        ar=obj.getArea();
        System.out.println( "Area is "+ar);
        circ=obj.getCircumference();
        System.out.println( "Circumference is "+circ);

    }
}

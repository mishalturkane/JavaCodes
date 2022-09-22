package mishal;

public class Assi5 {
    public static void main(String[] args) {
        int r,h;
        r=Integer.parseInt(args[0]);
        h=Integer.parseInt(args[1]);
        System.out.println("Enter a radius of cylander: "+r+" And Hight :"+h);
        double area = 2 * Math.PI * r * (r + h);
        System.out.println("The area of the cylender is "+area);

    }
}

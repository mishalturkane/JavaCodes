package mishal;

public class Assi3 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        System.out.println("Output: "+a);
        if(a%4==0){
            System.out.println("Is a leap year:");
        }
        else{
            System.out.println("Is not a leap year:");
        }
    }
}

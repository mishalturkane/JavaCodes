package mishal;

public class Assi4 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int sum=a+b;
        System.out.println("Input:"+a+"  "+b);
        if(sum%2==0){
            System.out.println("Output: Lucky Number:");
        }
        else
            System.out.println("Output: Not a Lucky Number ");


    }
}

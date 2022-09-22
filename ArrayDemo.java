package mishal;
public class ArrayDemo {
    public static void main(String[] args) {
        int a= args.length;
        int b;
        int sum=0;
        if(a==0 || a==1)
        {
            System.out.println("Please enter atlist 2 input");
        }
        else
        {
            for(String x:args)
            {
                b=Integer.parseInt(x);
                sum=sum+b;
            }
            System.out.println("The sum is:"+sum);
            System.out.println("The it's avarge is:"+(float)sum/a);
        }
    }
}

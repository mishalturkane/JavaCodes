package argumentpassingdemo;

public class UseDemo {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        System.out.println("Before doubler:");
        for(int x:arr)
        {
            System.out.println(x);

        }
        Demo obj=new Demo();
        obj.doubler(arr);

        System.out.println("After doubling:");
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
}

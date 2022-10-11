package argumentpassingdemo;

public class UseNum {
    public static void main(String[] args) {
        Num N=new Num();

        N.setNum(10,20);
        System.out.println("Before incremnt:");
        N.showNum();

        Num Temp=new Num();
        Temp.increment(N);
        System.out.println("After increment:");
        N.showNum();
    }
}

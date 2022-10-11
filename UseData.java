package staticdemo;

public class UseData {
    public static void main(String[] args) {
        Data D1=new Data();
        Data D2=new Data();
        Data D3=new Data();

        D1.a=10;
        D2.a=20;
        D3.a=30;
        System.out.println(D1.a);
        System.out.println(D2.a);
        System.out.println(D3.a);

        Data.b=10;
        Data.b=20;
        Data.b=30;
        System.out.println(Data.b);
        System.out.println(Data.b);
        System.out.println(Data.b);
    }
}

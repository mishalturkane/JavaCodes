package excepmethods;

public class StackTrack {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("Div is"+c);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

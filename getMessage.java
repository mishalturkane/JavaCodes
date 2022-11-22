package excepmethods;

public class getMessage {
    public static void main(String[] args) {
        try{
            int x=Integer.parseInt(args [0]);
            int y=Integer.parseInt(args [1]);
            int z=x/y;
            System.out.println("Divide is"+z);
        }
        catch(Exception ex)
        {
            System.out.println("exeption accured:"+ex.getMessage());
        }
    }
}

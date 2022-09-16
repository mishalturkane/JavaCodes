import java.util.Scanner;
class AddNum
{
	public static void main(String [] args)
	{
     		Scanner kb=new Scanner(System.in);
		double a,b;
		System.out.print("Enter 2 Vlaue:");
		a=kb.nextDouble();
		b=kb.nextDouble();
		System.out.print("The Sum is "+(a+b));
	}
}
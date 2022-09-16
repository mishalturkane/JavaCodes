import java.util.Scanner;
class Dowhile
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String choice;
		int a,b;
		do
		{
			System.out.print("Enter 2 int:");
			a=kb.nextInt();
			b=kb.nextInt();
			System.out.println("Your sum is:"+(a+b));
			System.out.print("DO you want counitue (YES/NO):");
			choice=kb.next();
		}while(choice.equalsIgnoreCase("YES"));
		System.out.println("Thank you!");
	}
}
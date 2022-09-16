import java.util.Scanner;
class AddNum
{
	public static void main(String [] args)
	{
     		Scanner kb=new Scanner(System.in);
		double n,f=1;
		System.out.print("Enter Vlaue:");
		n=kb.nextDouble();
		while(n>1)
		{
			f=f*n;
			n--;
		}
		System.out.print("The factorial is "+f);
	}
}
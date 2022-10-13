import java.util.Scanner;
class Unique1
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String name;
		int i;
		System.out.println("Enter your name:");
		name=kb.next();
		System.out.println("Enter a number of belong to rang of the nam end show its single letter:");
		i=kb.nextInt();
		i=i-1;
		System.out.println("Here Latter is :"+name.charAt(i));
	}
}
class CheckNo
{
	public static void main(String [] args)
	{
		int a=Integer.parseInt(args[0]);
			String result;
		result=(a%2==0)?"Even":"Odd";
		System.out.println(result);
	}
}
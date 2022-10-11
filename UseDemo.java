class Demo
{
	private int x;
	public  Demo()
	{
		System.out.println("Constructor called: and x=");
	}

	static
	{
		System.out.println("static blocked called:");
		
	}
}


class UseDemo
{
	public static void main(String [] args)
	{
			Demo d=new Demo();
	}
}
	
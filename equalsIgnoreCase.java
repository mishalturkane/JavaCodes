class Test1
{
	public static void main(String [] args)
	{
		String s=new String("Mishal");
		String s1=new String("Mishal");
		String s2=new String("MISHAL");
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
	}

}

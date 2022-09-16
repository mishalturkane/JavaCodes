class Weather
{
	public static void main(String [] args)
	{
 		int a;
		a=Integer.parseInt(args[0]);
	switch(a)
		{
	 	case 11: case 12: case 1: case 2:
					System.out.println("winter");
					break;
          	case 3: case 4: case 5: case 6:
					System.out.println("Summer");
					break;
  		case 7: case 8: case 9: case 10:
					System.out.println("Rainy");
					break;
		default:
					System.out.println("wrong input");
		}
	}
}
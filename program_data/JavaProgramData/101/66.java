package <missing>;

public class GlobalMembers
{
	/*           ???
	??????           2010.11.17      */

	public static char p(int a,int b,int c,int d)
	{
		if (a == b)
		{
			return 'A';
		}
		if (a == c)
		{
			return 'B';
		}
		if (a == d)
		{
			return 'C';
		}
	} //????

	public static int Main()
	{
		//abc???????ABC???????
		int a = 0;
		int b = 0;
		int c = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				if (b != a)
				{
					c = 3 - a - b; //????????
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if (a + A == 2)
					{
						if (b + B == 2)
						{
							if (c + C == 2)
							{
								System.out.print(p(0, a, b, c));
								System.out.print(p(1, a, b, c));
								System.out.print(p(2, a, b, c));
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
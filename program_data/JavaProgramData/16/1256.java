package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

			if (a > 999)
			{

				c = a / 1000;
				d = (a / 100) - 10 * c;
				e = (a / 10) - 100 * c - 10 * d;
				f = a - 1000 * c - 100 * d - 10 * e;

				System.out.printf("%d%d%d%d",f,e,d,c);
			}
			else
			{
				if (a > 99)
				{

						d = a / 100;
						e = (a / 10) - 10 * d;
						f = a - 100 * d - 10 * e;

						System.out.printf("%d%d%d",f,e,d);
				}
				else
				{
					if (a > 9)
					{

							e = (a / 10);
							f = a - 10 * e;

							System.out.printf("%d%d",f,e);
					}
					else
					{

							System.out.printf("%d",a);
					}
				}
			}


	}
}

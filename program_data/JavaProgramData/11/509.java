package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			if (b == 1)
			{
				System.out.printf("%d\n",c);
			}
			else if (b == 2)
			{
				n = 31 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 3)
			{
				n = 60 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 4)
			{
				n = 91 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 5)
			{
				n = 121 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 6)
			{
				n = 152 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 7)
			{
				n = 182 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 8)
			{
				n = 213 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 9)
			{
				n = 244 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 10)
			{
				n = 274 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 11)
			{
				n = 305 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 12)
			{
				n = 336 + c;
				System.out.printf("%d\n",n);
			}
		}
		else
		{
			if (b == 1)
			{
				System.out.printf("%d\n",c);
			}
			else if (b == 2)
			{
				n = 31 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 3)
			{
				n = 59 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 4)
			{
				n = 90 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 5)
			{
				n = 120 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 6)
			{
				n = 151 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 7)
			{
				n = 181 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 8)
			{
				n = 212 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 9)
			{
				n = 243 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 10)
			{
				n = 273 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 11)
			{
				n = 304 + c;
				System.out.printf("%d\n",n);
			}
			else if (b == 12)
			{
				n = 335 + c;
				System.out.printf("%d\n",n);
			}
		}
		return 0;
	}
}


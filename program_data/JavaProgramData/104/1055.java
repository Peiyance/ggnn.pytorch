package <missing>;

public class GlobalMembers
{
	/*
	 *  ???.cpp
	 *  Created on: 2012-11-19
	 *  Author:???
	 */
	public static int f(int a, int b)
	{ //?????a?b???????�??�???
		if (a == b) //?a??b????a??b?
		{
			return a;
		}
		if (a > b)
		{ //?a??b,???a??????b?�???�
			return f(a % 2 == 0 ? a / 2 : (a - 1) / 2, b);
		}
		else
		{ //?b??a,???b??????b?�???�
			return f(a, b % 2 == 0 ? b / 2 : (b - 1) / 2);
		}
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a, b));
		System.out.print("\n");
		return 0;
	}
}


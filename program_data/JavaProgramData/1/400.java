package <missing>;

public class GlobalMembers
{
	/****************************************
	 * ????								*
	 *										*
	 *  Created on: 2010-12-8				*
	 *      Author:??						*
	 ***************************************/
	public static int factor(int x,int y) //?????????factor
	{
		int i;
		for (i = 2;i < x;i++) //?????x?????
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == x)
		{
			return 1; //??x??????1
		}
		else //????????????
		{
			int sum = 0;
			if (x == y) //?x?y?????y/x+1??????????????????????1???
			{
				for (i = y / x + 1;i <= Math.sqrt(x);i++) //?????????????????
				{
					if (x % i == 0)
					{
						sum = sum + factor(x / i, x);
					}
					else
					{
						continue;
					}
				}
				return sum + 1; //????sum+1?????????a=a???
			}
			else
			{ //?x?y??????y/x?????????
				for (i = y / x;i <= Math.sqrt(x);i++)
				{
					if (x % i == 0)
					{
						sum = sum + factor(x / i, x);
					}
					else
					{
						continue;
					}
				}
				return sum + 1; //????sum+1?????????a=a???
			}
		}
	}
	public static int Main() //?????
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int m = n;
		int[] a = new int[m];
		int j;
		for (j = 0;j < n;j++)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			System.out.print(factor(a[j], a[j]));
			System.out.print("\n");
		}
		return 0;
	}

}

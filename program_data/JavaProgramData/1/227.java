package <missing>;

public class GlobalMembers
{
	public static int sum = 0; //?????????????
	public static void ways(int a, int last)
	{
		int i;
		int j;
		for (i = last;i <= a;i++)
		{
			if (a < i) //????????????????????????
			{
			}
			else if (a == i) //???????????u?????
			{
				sum++;
			}
			else if (a % i == 0) //????????????????????????????????
			{
				ways(a / i, i);
			}
		}
	}
	public static int Main()
	{
		int n;
		int[] num = new int[100];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			ways(num[i], 2); //??????????
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int shirunnian(int d)
	{
		if (d % 4 == 0)
		{
			if (d % 100 == 0)
			{
				if (d % 400 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return 1;
			}
		}
		else
		{
			return 0;
		}
	}

	public static int dijitian(int a,int b,int c)
	{
		int i;
		int sum = 0;
		int days = 0;
		for (i = 0;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				days += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			else if (i == 2)
			{
				if (shirunnian(a) == 1)
				{
					days += 29;
				}
				else if (shirunnian(a) == 0)
				{
					days += 28;
				}
			}
		}
		sum = days + c;
		return sum;
	}

	public static int Main()
	{
		int year;
		int month;
		int day;
		int tianshu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		tianshu = dijitian(year, month, day);
		System.out.printf("%d",tianshu);
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int n;
		int i;
		int j;
		for (j = 1;j <= 5;j++)
		{
		n = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				year = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				month = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				day = Integer.parseInt(tempVar3);
			}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0; i < month - 1; i++)
			{
				n += days[i];
			}
			n += day;
		}
		else
		{
			int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0; i < month - 1; i++)
			{
				n += days[i];
			}
			n += day;
		}
		System.out.printf("%d\n",n);
		}
	}
}


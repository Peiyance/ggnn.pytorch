package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int year;
	int month;
	int day;
	int a;
	int rank;
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
	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
	{
	a = 1;
	}
	else
	{
		a = 0;
	}
	if (month == 1)
	{
		rank = day;
	}
	if (month == 2)
	{
		rank = 31 + day;
	}
	if (month == 3)
	{
		rank = 59 + a + day;
	}
	if (month == 4)
	{
		rank = 90 + a + day;
	}
	if (month == 5)
	{
		rank = 120 + a + day;
	}
	if (month == 6)
	{
		rank = 151 + a + day;
	}
	if (month == 7)
	{
		rank = 181 + a + day;
	}
	if (month == 8)
	{
		rank = 212 + a + day;
	}
	if (month == 9)
	{
		rank = 243 + a + day;
	}
	if (month == 10)
	{
		rank = 273 + a + day;
	}
	if (month == 11)
	{
		rank = 304 + a + day;
	}
	if (month == 12)
	{
		rank = 334 + a + day;
	}
	System.out.printf("%d",rank);
	}

}


package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int year;
		  int month;
		  int[] monthd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int day;
		  int di = 0;
		  int i;
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
		  for (i = 1;i < month;i++)
		  {
			  di = di + monthd[i - 1];
		  }
		  di = di + day;
		  if ((year % 4) != 0 || (year % 400) != 0)
		  {
			  System.out.printf("%d\n",di);
		  }
		  else
		  {
			  System.out.printf("%d",di + 1);
		  }
		  return 0;
	  }
}


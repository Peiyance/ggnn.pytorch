package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int c;
	 int x = 0;
	 int d;
	 int m;
	 int[][] a = new int[500][500];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i][j] = Integer.parseInt(tempVar2);
	  }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   if (a[i][j] == 0)
	   {
		k = i;
		m = j;
		continue;
	   }
	  }
	 }
	 c = 0;
	 d = 0;
	 for (i = k;i > 0;i--)
	 {
	  if (a[i][m] == 0)
	  {
		  c = c + 1;
	  }
	  else
	  {
		  break;
	  }
	 }
	 for (j = m;j > 0;j--)
	 {
	  if (a[k][j] == 0)
	  {
		  d = d + 1;
	  }
	  else
	  {
		  break;
	  }
	 }
	 for (i = k - 1;i >= (k - c + 2);i--)
	 {
	  for (j = m - 1;j >= (m - d + 2);j--)
	  {
	   if (a[i][j] == 255)
	   {
		   x = x + 1;
	   }
	   else if (a[i][j] == 0)
	   {
		   break;
	   }
	  }
	 }
	 System.out.printf("%d",x);
	}
}


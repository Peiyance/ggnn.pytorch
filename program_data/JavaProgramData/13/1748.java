package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int j;
		int n;
		int k;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		n = n - 1;
		for (i = 0;i <= n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}

		for (i = 0;i < n;i++)
		{
		  for (j = i + 1;j <= n;j++)
		  {
			  if (a[j] == a[i])
			  {
				  a[j] = 0;
			  }
		  }
		}

		System.out.printf("%d",a[0]);
			for (i = 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
				   System.out.printf(" %d",a[i]);
				}
			}

		return 0;
	}
}


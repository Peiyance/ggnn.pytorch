package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int n;
		int i;
		int j;
		int k;
		int l;
		int min;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l <= n - 1;++l)
		{
			for (i = 0;i <= n - 1;++i)
			{
			   for (j = 0;j <= n - 1;++j)
			   {
					  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			}
			x = 0;
			for (k = 0;k <= n - 2;++k)
			{
				for (i = 0;i <= n - k - 1;++i)
				{
					   min = a[i][0];
					for (j = 0;j <= n - k - 1;++j)
					{
					   if (a[i][j] < min)
					   {
						  min = a[i][j];
					   }
					}
					for (j = 0;j <= n - k - 1;++j)
					{
						  a[i][j] -= min;
					}
				}
				for (j = 0;j <= n - k - 1;++j)
				{
					min = a[0][j];
					for (i = 0;i <= n - k - 1;++i)
					{
					   if (a[i][j] < min)
					   {
						   min = a[i][j];
					   }
					}
				  for (i = 0;i <= n - k - 1;++i)
				  {
					  a[i][j] -= min;
				  }
				}
				x += a[1][1];
			for (j = 2;j <= n - k - 1;++j)
			{
					a[0][j - 1] = a[0][j];
			}
		   for (i = 2;i <= n - k - 1;++i)
		   {
			a[i - 1][0] = a[i][0];
		   }
		for (i = 2;i <= n - k - 1;++i)
		{
			for (j = 2;j <= n - k - 1;++j)
			{
				a[i - 1][j - 1] = a[i][j];
			}
		}
			}
		System.out.print(x);
		System.out.print("\n");
		}
		return 0;
	}

}


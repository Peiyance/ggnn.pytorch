package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		int z;
		if (x > y)
		{
			z = y;
		}
		else
		{
			z = x;
		}
		return (z);
	}
	public static int Main()
	{
		int n;
		int m;
		int k;
		int i;
		int j;
		int[][] a = new int[101][101];
		int[] s = new int[101];
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= n;m++)
		{
			sum = 0;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (k = 1;k <= n - 1;k++)
			{
				for (i = 1;i <= n - k + 1;i++)
				{
					s[i] = a[i][1];
					for (j = 1;j <= n - k + 1;j++)
					{
						s[i] = min(a[i][j], s[i]);
					}
				}
				for (i = 1;i <= n - k + 1;i++)
				{
					for (j = 1;j <= n - k + 1;j++)
					{
						a[i][j] = a[i][j] - s[i];
					}
				}
				for (j = 1;j <= n - k + 1;j++)
				{
					s[j] = a[1][j];
					for (i = 1;i <= n - k + 1;i++)
					{
						s[j] = min(a[i][j], s[j]);
					}
				}
				for (j = 1;j <= n - k + 1;j++)
				{
					for (i = 1;i <= n - k + 1;i++)
					{
						a[i][j] = a[i][j] - s[j];
					}
				}
				sum = sum + a[2][2];
				for (i = 1;i <= n - k + 1;i++)
				{
					if ((n - k + 1) >= 3)
					{
						for (j = 3;j <= n - k + 1;j++)
						{
							a[i][j - 1] = a[i][j];
						}
					}
					else
					{
						break;
					}
				}
				for (j = 1;j <= n - k + 1;j++)
				{
					if ((n - k + 1) >= 3)
					{
						for (i = 3;i <= n - k + 1;i++)
						{
							a[i - 1][j] = a[i][j];
						}
					}
					else
					{
						break;
					}
				}
			}
			System.out.printf("\n%d",sum);
		}
		return 0;
	}
}


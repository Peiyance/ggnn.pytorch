package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[104][104][104];
		int n;
		int i;
		int j;
		int t;
		int k;
		int m;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= n;t++)
		{
			s = 0;
			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				a[i][j][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			for (k = 1;k < n;k++) //k ci cao zuo
			{
				for (i = 1;i <= n - k + 1;i++)
				{
					m = 100000;
					for (j = 1;j <= n - k + 1;j++)
					{
					if (a[i][j][k - 1] < m)
					{
						m = a[i][j][k - 1];
					}
					}
					for (j = 1;j <= n - k + 1;j++)
					{
						a[i][j][k - 1] -= m;
					}
				}
				for (j = 1;j <= n - k + 1;j++)
				{
					m = 100000;
					for (i = 1;i <= n - k + 1;i++)
					{
					if (a[i][j][k - 1] < m)
					{
						m = a[i][j][k - 1];
					}
					}
					for (i = 1;i <= n - k + 1;i++)
					{
						a[i][j][k - 1] -= m;
					}
				}

				s += a[2][2][k - 1];

				for (i = 1;i <= n - k + 1;i++)
				{
				for (j = 1;j <= n - k + 1;j++)
				{
					if (i == 1 && j == 1)
					{
						a[i][j][k] = a[i][j][k - 1];
					}
					if (i == 2 || j == 2)
					{
						continue;
					}
					if (i == 1 && j >= 3)
					{
						a[i][j - 1][k] = a[i][j][k - 1];
					}
					if (j == 1 && i >= 3)
					{
						a[i - 1][j][k] = a[i][j][k - 1];
					}
					if (i >= 3 && j >= 3)
					{
						a[i - 1][j - 1][k] = a[i][j][k - 1];
					}
				}
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
	}

}


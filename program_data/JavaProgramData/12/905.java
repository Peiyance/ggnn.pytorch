package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] column = new int[100];
		int i = 0;
		int l = 0;
		int j;
		int n;
		int m;
		int s = 0;
			for (l = 0;l <= 15;l++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][l] = Integer.parseInt(tempVar);
			}
			if (a[i][l] == -1)
			{
				break;
			}
			else if (a[i][l] == 0)
			{
				i++;
				l = -1;
			}
			else
			{
				column[i]++;
			}
			}
			i--;
			for (m = 0;m <= i;m++)
			{
				s = 0;
				for (j = 0;j <= column[m] - 1;j++)
				{
				  for (n = j + 1;n <= column[m];n++)
				  {
				  if (a[m][j] * 2 == a[m][n] || a[m][n] * 2 == a[m][j])
				  {
						s = s + 1;
				  }
				  }
				}
					System.out.printf("%d\n",s);
			}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	/*
	 * juzhenxiaojian.cpp
	 *
	 *  Created on: 2011-11-11
	 *      Author: Dai Guangda
	 */
	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int k;
		int n;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		void putin(int a[][101], int n); //???????????
		void xiaojian(int a[][101], int n); //??????n???????
		void guiling(int a[][101], int n); //??????n???????
		for (i = 1; i <= n; i++)
		{
			putin(a, n); //???i?n???
			sum = 0;
			for (k = n; k >= 2; k--) //??????????????????????
			{
				guiling(a, k);
				sum += a[2][2]; //????a[2][2]
				xiaojian(a, k);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
	public static void putin(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	}
	public static void guiling(int[][] a, int n)
	{
		int i;
		int j;
		int[] min = new int[101];
		for (i = 1; i <= n; i++)
		{
			min[i] = a[i][1];
			for (j = 2; j <= n; j++) //??????????
			{
				if (a[i][j] < min[i])
				{
					min[i] = a[i][j];
				}
			}
			for (j = 1; j <= n; j++)
			{
				a[i][j] -= min[i];
			}
		}
		for (j = 1; j <= n; j++)
		{
			min[j] = a[1][j];
			for (i = 2; i <= n; i++)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
			for (i = 1; i <= n; i++)
			{
				a[i][j] -= min[j];
			}
		}
	}

	public static void xiaojian(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 2; i <= n - 1; i++)
		{
			for (j = 1; j <= n; j++) //?????
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (j = 2; j <= n - 1; j++)
		{
			for (i = 1; i <= n - 1; i++) //?????
			{
				a[i][j] = a[i][j + 1];
			}
		}
	}

}

package <missing>;

public class GlobalMembers
{
	public static int func(int[][] a, int rank, int sum)
	{
	if (rank == 1)
	{
	return (sum);
	}
	int i; //i?????j????
	int j;
	int k;
	int min = 1000;
	for (i = 0;i <= rank - 1;i++)
	{
	for (j = 0;j <= rank - 1;j++)
	{
	if (a[i][j] < min)
	{
	min = a[i][j];
	}
	}
	for (j = 0;j <= rank - 1;j++)
	{
	a[i][j] -= min;
	}
	min = 1000;
	} //??????
	for (j = 0;j <= rank - 1;j++)
	{
	for (i = 0;i <= rank - 1;i++)
	{
	if (a[i][j] < min)
	{
	min = a[i][j];
	}
	}
	for (i = 0;i <= rank - 1;i++)
	{
	a[i][j] -= min;
	}
	min = 1000;
	} //??????
	sum += a[1][1];
	for (j = 1;j <= rank - 2;j++)
	{
	a[0][j] = a[0][j + 1];
	}
	for (i = 1;i <= rank - 2;i++)
	{
	a[i][0] = a[i + 1][0];
	}
	for (i = 1;i <= rank - 2;i++)
	{
	for (j = 1;j <= rank - 2;j++)
	{
	a[i][j] = a[i + 1][j + 1];
	}
	}
	func(a, rank - 1, sum);
	}
	public static int Main()
	{
	int n; //i?????j?????k?????
	int i;
	int j;
	int k;
	int[][] matrix = new int[100][100];
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 1;k <= n;k++)
	{
	sum = 0;
	for (i = 0;i <= n - 1;i++)
	{
	for (j = 0;j <= n - 1;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		matrix[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	System.out.printf("%d\n",func(matrix, n, sum));
	}
	}

}


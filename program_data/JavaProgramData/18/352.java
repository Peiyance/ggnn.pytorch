package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int[] c = new int[100];
		  int[][] a = new int[100][100];
		  int sum;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
				  sum = 0;
				  for (j = 0;j < n;j++)
				  {
						  for (k = 0;k < n;k++)
						  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[j][k] = Integer.parseInt(tempVar2);
						  }
						  }
				  }
				  for (l = 1;l <= n - 1;l++)
				  {

						c[0] = a[0][0];
						for (k = l;k < n;k++)
						{
							if (c[0] > a[0][k])
							{
							c[0] = a[0][k];
							}
						}
						for (k = 0;k < n;k++)
						{
							 a[0][k] = a[0][k] - c[0];
						}
						c[0] = a[0][0];
						for (j = l;j < n;j++)
						{
							c[j] = a[j][0];
							for (k = l;k < n;k++)
							{
								if (c[j] > a[j][k])
								{
								c[j] = a[j][k];
								}
							}
							for (k = 0;k < n;k++)
							{
								 a[j][k] = a[j][k] - c[j];
							}
						}
						for (k = l;k < n;k++)
						{
							c[k] = a[0][k];
							for (j = l;j < n;j++)
							{
								if (c[k] > a[j][k])
								{
								c[k] = a[j][k];
								}
							}
							for (j = 0;j < n;j++)
							{
								 a[j][k] = a[j][k] - c[k];
							}
						}
						for (j = l;j < n;j++)
						{
							if (c[0] > a[j][0])
							{
							c[0] = a[j][0];
							}
						}
						for (j = 0;j < n;j++)
						{
							 a[j][0] = a[j][0] - c[0];
						}
						sum = sum + a[l][l];
				  }
				  System.out.printf("%d\n",sum);
		  }
			System.in.read();
			System.in.read();
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int q; //??q
		q = n; //?n????q
		int[][] a = new int[150][150]; //??????a,??sum,????i,j,k,l,m,p,???min
		int sum = 0;
		int i;
		int j;
		int k;
		int l;
		int m;
		int p;
		int min;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   for (k = 0;k < n;k++)
			   {
				   a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			}
			while (n != 1) //?n??1????????
			{
			for (j = 0;j < n;j++)
			{
				   min = a[j][0];
				   for (l = 1;l < n;l++)
				   {
				   if (min > a[j][l])
				   {
				   min = a[j][l]; //???????
				   }
				   }
			   for (m = 0;m < n;m++)
			   {
				   a[j][m] = a[j][m] - min; //????????
			   }
			}
		   for (j = 0;j < n;j++)
		   {
			   min = a[0][j];
			   for (l = 1;l < n;l++)
			   {
				   if (min > a[l][j]) //???????
				   {
				   min = a[l][j];
				   }
			   }
			   for (m = 0;m < n;m++)
			   {
				   a[m][j] = a[m][j] - min; //????????
			   }
		   }
			   sum = sum + a[1][1]; //?sum?????????
			  for (p = 2;p < n;p++)
			  {
			   a[0][p - 1] = a[0][p]; //?????????????
			   a[p - 1][0] = a[p][0]; //?????????????
			  }
				for (j = 2;j < n;j++)
				{
			   for (l = 2;l < n;l++)
			   {
				   a[j - 1][l - 1] = a[j][l]; //??????????-1
			   }
				}
			  n--; //n?1
			}
			System.out.print(sum);
			System.out.print("\n");
		  sum = 0; //sum??
		  n = q; //n?????n?
		}
		return 0;
	}

}


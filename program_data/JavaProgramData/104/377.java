package <missing>;

public class GlobalMembers
{
	/*??
	1000012872
	 */
	public static int f(int x, int y)
	{
		int m;
		int n;
		int p;
		int q;
		int i;
		int j;
		int c;

			m = x;
			n = y;
			int[] a = new int[x]; //????????????????
			int[] b = new int[y];
			a[0] = x;
			for (i = 1;i <= m;i++)
			{
			  if (x >= 2)
			  {
				 a[i] = x / 2;
				   x = x / 2;

			  }
			  else
			  {
				  break;
			  }
			} //?x????????????a????a[0]??????

			  p = i - 1; //?p?????????
				  b[0] = y;
				   for (i = 1;i <= n;i++)
				   {
						 if (y >= 2)
						 {
							 b[i] = y / 2;
							 y = y / 2;
						 }
						 else
						 {
							 break;
						 }
				   } //?y????????????b????b[0]??????
					q = i - 1; //?q?????????

					for (i = p,j = q;i >= 0,j >= 0;i--,j--)
					{
						if (a[i] == b[j])
						{
						c = a[i];
						}
					}
						return c; //????????????



	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x, y));
		return 0;
	}




}

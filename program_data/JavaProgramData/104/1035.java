package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == n)
		{
			System.out.print(m);
			System.out.print("\n");
		}
		else
		{
		int[] a = new int[20];
		int[] b = new int[20];
		for (int i = 0;i < 20;i++)
		{
		   a[i] = 0;
		   b[i] = 0;
		}
		   a[0] = m;
		   b[0] = n;
		   int j = 0;
		   while (m > 1) //??m?????????????
		   {
			 if (m % 2 == 0) //??m?????
			 {
				 a[j + 1] = m / 2;
				 m = m / 2; //?m???????????????
			 }
			 else
			 {
				 a[j + 1] = (m - 1) / 2;
				 m = (m - 1) / 2;
			 }
				 j = j + 1;
		   }
			int k = 0;
		   while (n > 1)
		   {
			 if (n % 2 == 0)
			 {
				 b[k + 1] = n / 2;
				 n = n / 2;
			 }
			 else
			 {
				 b[k + 1] = (n - 1) / 2;
				 n = (n - 1) / 2;
			 }
				 k = k + 1;
		   }
		   while (a[j] == b[k]) //???????????????
		   {
			  j = j - 1;
			  k = k - 1;
		   }
		   System.out.print(a[j + 1]);
		   System.out.print("\n");
		}
		return 0;
	}
}

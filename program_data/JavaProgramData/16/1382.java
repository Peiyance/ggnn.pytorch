package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????a[6]???????100000???????????i???n????????m?q
		int[] a = new int[6];
		int n;
		int m;
		int q;
		int b = 0; //??????b??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; ; i++) //????break???????
		{
			m = n / 10; //????n??n-1?
			q = n - 10 * m; //????n?????
			a[i] = q; //?????a[1]
			n = m; //?n-1???n???
			b++; //????
			if (n == 0) //??????
			{
			break;
			}

		}
		for (i = 1;i <= b;i++) //???????b?????b??????
		{
		System.out.print(a[i]);
		}
		System.out.print("\n");

		return 0;
	}


}

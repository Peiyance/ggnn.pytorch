package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????n?i?j???x[20000]???i,j????
		int i;
		int j;
		int[] x = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????n????????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++) //?????????????
			{
				if (x[i] == x[j] && i != j) //???????????0
				{
					x[j] = 0;
				}
			}
		}

		System.out.print(x[0]);

		for (i = 1;i < n;i++)
		{
			if (x[i] != 0) //?????if??????????????
			{
				System.out.print(" ");
				System.out.print(x[i]);
			}
		}
		System.out.print("\n");

		return 0;
	}


}

package <missing>;

public class GlobalMembers
{
	/**
	 * @file   1.cpp
	 * @author ???
	 * @date   2013-10-30
	 * @description
	 *         ?????????
	 */



	public static int Main()
	{
		int[] a = new int[16]; // ??????????????0
		int sum = 0; // ?????????????sum?????0

		do
		{
			sum = 0;

			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (a[0] == -1)
			{
				break; // ?????????????-1??????
			}

			for (int i = 1; i <= 15; ++i) // ??????????????
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break; // ???????0????????
				}
			}

			for (int m = 0; m <= 13; ++m) // ????????????
			{
				if (a[m + 1] == 0)
				{
					break;
				}
				for (int n = m + 1; n <= 14; ++n)
				{
					if (a[n] == 0)
					{
						break;
					}
					if (a[m] == 2 * a[n] || a[n] == 2 * a[m])
					{
						++sum;
					}
				}
			}

			System.out.print(sum);
			System.out.print("\n");

		} while (1 != 0);

		return 0;
	}
}

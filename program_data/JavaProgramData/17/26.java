package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: angel
	 */

	public static int Main()
	{
		int i = 0;
		int j = 0;

		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int a = 0;
			int b = 0;
		System.out.print(s);
		System.out.print("\n");
		int[] flag = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0; i <= s.length() - 1; i++)
		{
			if (s[i] == '(')
			{
				a++;
			}
			if (s[i] == ')')
			{
				a--;
				if (a < 0)
				{
					a = 0;
					flag[i] = -1;
				}
			}
		}
		for (i = s.length() - 1; i >= 0; i--)
		{
			if (s[i] == ')')
			{
				b++;
			}
			if (s[i] == '(')
			{
				b--;
				if (b < 0)
				{
					b = 0;
					flag[i] = 1;
				}
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (flag[i] != 0)
			{
				break;
			}
		}
		for (j = s.length() - 1; j >= 0; j--)
		{
			if (flag[j] != 0)
			{
				break;
			}
		}
		for (i = i; i <= j; i++)
		{
			if (flag[i] == 1)
			{
				System.out.print("$");
			}
			else if (flag[i] == 0)
			{
				System.out.print(" ");
			}
			else if (flag[i] == -1)
			{
				System.out.print("?");
			}

		}
		System.out.print("\n");
		}
		return 0;

	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t1;
		int t2;
		int flag;
		int len;
		int[] b = new int[101];
		int[] l = new int[101];
		int[] r = new int[101];
		String s = new String(new char[101]);
		while (scanf("%s",s) != EOF)
		{
			len = s.length();
			for (i = 0;i < len;i++)
			{
				if (s.charAt(i) == '(')
				{
					b[i] = -1;
				}
				else if (s.charAt(i) == ')')
				{
					b[i] = 1;
				}
				else
				{
					b[i] = 0;
				}
			}
			t1 = 0;
			t2 = 0;
			for (i = 0;i < len;i++)
			{
				if (b[i] == -1)
				{
					l[t1] = i;
					t1++;
				}
				if (b[i] == 1)
				{
					r[t2] = i;
					t2++;
				}
			}
			for (i = t1 - 1;i >= 0;i--)
			{
				for (j = 0;j < t2;j++)
				{
					if (r[j] > l[i])
					{
						b[r[j]] = 0;
						b[l[i]] = 0;
						r[j] = 0;
						l[i] = 0;
						break;
					}
				}
			}
			System.out.println(s);
			for (i = 0;i < len;i++)
			{
				if (b[i] == -1)
				{
					System.out.print("$");
				}
				else if (b[i] == 1)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

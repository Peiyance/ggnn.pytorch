package <missing>;

public class GlobalMembers
{
	//???????????????????
	//?????11.3
	//????wayne
	public static int Main()
	{
		int n;
		int[] a = new int[16];
		int i;
		int t;
		int m;
		int j;
		int k;
		int sum;
		while ((t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (t != -1) //??????????
			{
				a[1] = t;
				i = 1;
				while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
				{
					if (m != 0) //????????????
					{
						i = i + 1;
						a[i] = m; //??????????????????
					}
					else
					{
						break; //???????
					}
				}
				sum = 0;
				for (j = 1;j <= i;j++)
				{
					 for (k = 1;k <= i;k++)
					 {
						 if (a[k] == 2 * a[j] || a[k] == 0.5 * a[j]) //??????????????
						 {
							 sum = sum + 1; //???????1
						 }
					 }
				}
			   System.out.print(sum / 2);
			   System.out.print("\n");
			}
			else
			{
				System.out.print("\n");
				break;
			} //?-1??????
		}
		return 0;
	}
}

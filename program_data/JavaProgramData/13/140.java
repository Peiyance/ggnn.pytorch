package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int k; //???????i,j,l??????n????????k????????
		int n;
		int[] b = new int[20001];
		int[] c = new int[20001];
		int i = 0;
		int j = 1;
		int l;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l < 20001;l++) //???b????0
		{
			b[l] = 0;
		}
		for (m = 0;m < 20001;m++)
		{
			c[m] = 0;
		}
		while (j <= n) //?????????
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (b[k] == 0) //??k?????
		{
		c[i] = k; //??????c[i]
		}
		b[k]++; //??K????
		i++;
		j++;
		}
		System.out.print(c[0]);
		for (i = 1;i < n;i++) //????????????
		{
			   if (c[i] != 0)
			   {
				   System.out.print(" ");
				   System.out.print(c[i]);
			   }
													   //???????c???????
		}


		return 0;
	} //?????
}


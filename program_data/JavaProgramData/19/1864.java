package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] c = new int[200]; //c???????????
		int lena = 0;
		int lenb = 0;
		int lens = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int count = 0;
		int t = 0;
		cin.get(s,200,'\n');
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lena = a.length();
		lenb = b.length();
		lens = s.length(); //??????????
		if ((s[0] == a[0]) && (s[i + lena] == 32 || s[i + lena] == 0)) //????????????,????????????s[0]==a[0]-32
		{
				for (j = 0;j < lena;j++)
				{
					if (s[i + j] == a[j])
					{
						count++;
					}
				}
				if (count == lena) //??????????????K+1,?c[0]=0,
				{
					k++;
				}
					count = 0;
		}
		for (i = 1;i < lens;i++,count = 0)
		{
			if ((s[i] == a[0]) && (s[i + lena] == 32 || s[i + lena] == 0) && (s[i - 1] == 32)) //??????????
			{
				for (j = 0;j < lena;j++)
				{
					if (s[i + j] == a[j])
					{
						count++;
					}
				}
				if (count == lena)
				{
					c[k] = i;
					k++; //k?????????
				}
			}
		}
		c[k] = 201; //??c[k]??????????????
		if (lena < lenb) //????????????????????
		{
			 t = lenb - lena; //t????????
			 for (i = lens - 1;i >= 0;i--)
			 {
				for (j = k - 1;j >= 0;j--)
				{
					if (i >= c[j] != 0 && i < c[j + 1]) //???s???
					{
						s[i + (j + 1) * t] = s[i];
					}
				}
			 }
				for (i = 0;i < k;i++)
				{
					for (j = 0;j < lenb;j++) //?????
					{
						s[c[i] + i * t + j] = b[j];
					}
				}
		}
		else if (lena >= lenb)
		{
			t = lena - lenb;
			for (i = c[0] + t;i < lens;i++)
			{
				for (j = 0;j < k;j++)
				{
					if (i >= c[j] != 0 && i < c[j + 1])
					{
					s[i] = s[i + (j + 1) * t];
					}
				}
			}
				b[lenb] = 32; //??????
				for (i = 0;i < k;i++)
				{
					for (j = 0;j <= lenb;j++)
					{
						s[c[i] - i * t + j] = b[j];
					}
				}
		}
		int l = s.length(); //??????????
		if (s[l - 1] == 32)
		{
			s[l - 1] = 0;
		}
		System.out.print(s);
			 return 0;
	} //?????
}

package <missing>;

public class GlobalMembers
{
	//**********************************
	//****       ??????      *****
	//****        1200012718       *****
	//**         ??????         **
	//**********************************
	public static int Main()
	{
		int[] x = {0, 0, 0}; //x1x2x3????abc????????012
		for (int a = 0;a < 3;a++)
		{
			for (int b = 0;b < 3;b++)
			{
				for (int c = 0;c < 3;c++) //abc????0~2??
				{
					int o = (b > a);
					int p = (c == a);
					int q = (a > b);
					int r = (a > c);
					int s = (c > b);
					int t = (b > a); //opqrst??6???????
					if (o + p + q + r + s + t == 3 && a + o + p == 2 && b + q + r == 2 && c + s + t == 2) //?? ????????????????????????????2???a???????????0??????2???2???????
					{
						x[0] = a;
						x[1] = b;
						x[2] = c; //?abc??
					}
				}
			}
		}
		for (int i = 0;i < 3;i++) //????????abc
		{
			for (int j = 0;j < 3;j++)
			{
				if (x[j] == i) //x[j]=???????char a=65+j?????abc
				{
					char a = 65 + j;
					System.out.print(a);
				}
			}
		}

			return 0;
	}
}
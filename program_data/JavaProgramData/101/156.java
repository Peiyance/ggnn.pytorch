package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????
		int B;
		int C;
		int i;
		int[] rank = new int[4]; //??????,??????,???
		int[] word = new int[4];
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 6 - A - B; //?????????
				word[1] = (B < A) + (C == A);
				word[2] = (A < B) + (A < C);
				word[3] = (C < B) + (B < A); //???????????
				rank[A] = 1;
				rank[B] = 2;
				rank[C] = 3;
													   //?A,B,C?????????
				if (word[rank[1]] == 0 && word[rank[2]] == 1 && word[rank[3]] == 2)
				{

											  //?????????????????
					for (i = 3;i >= 1;i--)
					{
						System.out.print((char)(rank[i] + 64));
												//?????????????
					}
				}
			}
		}
					return 0;
	}





}
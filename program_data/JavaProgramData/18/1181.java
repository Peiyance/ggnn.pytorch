package <missing>;

public class GlobalMembers
{
	/*
	 *???: matrix_seq.cpp
	 *??: ???
	 *????: 2012-11-19
	 *??: ????????????a[1][1]??
	 */



	public static int[][] a = new int[MAXSIZE][MAXSIZE];
	public static int n;

	public static void sub_to_zero() //????
	{
		int m; //????????
		for (int i = 0;i < n;i++)
		{ //????
			m = a[i][0];
			for (int j = 1;j < n;j++)
			{ //??????
				if (a[i][j] < m)
				{
					m = a[i][j];
				}
			}
			if (m > 0)
			{
				for (int j = 0;j < n;j++) //????
				{
					a[i][j] -= m;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{ //????
			m = a[0][i];
			for (int j = 1;j < n;j++)
			{
				if (a[j][i] < m)
				{
					m = a[j][i];
				}
			}
			if (m > 0)
			{
				for (int j = 0;j < n;j++)
				{
					a[j][i] -= m;
				}
			}
		}
	}

	public static void delimination() //????
	{
		for (int i = 1;i < n - 1;i++)
		{ //???0??0??????
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
		for (int i = 2;i < n;i++)
		{
			for (int j = 2;j < n;j++)
			{
				a[i - 1][j - 1] = a[i][j]; //???????
			}
		}
		--n; //?n??
	}

	public static int calcMatrix() //???????????
	{
		int sum = 0; //????
		while (n > 1)
		{ //???????1?
			sub_to_zero(); //??
			sum += a[1][1]; //??a[1][1]
			delimination(); //??
		}
		return sum;
	}

	public static int Main()
	{
		int nMatrix; //???????
		nMatrix = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < nMatrix;i++)
		{ //??nMatrix???
			n = nMatrix; //??????
			for (int j = 0;j < nMatrix;j++)
			{
				for (int k = 0;k < nMatrix;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(calcMatrix());
			System.out.print("\n");
		}
		return 0;
	}


}

package <missing>;

public class GlobalMembers
{
	//*********************************************
	//????4.cpp
	//???????????
	//?????
	//???2010.10.25
	//*********************************************
	//*********************************************
	//????4.cpp
	//???????????
	//?????
	//???2010.10.25
	//*********************************************
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int k = 0;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //for??????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //for??
		{
			for (j = 0;j < i;j++) //for?????j???j+1??????
			{
			if (a[j] == a[i]) //????
			{
			   a[i] = -1; //??????????-1?????
			   break; //??????????
			}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++) //for??
		{
				if (a[i] > 0) //????????
				{
				System.out.print(" ");
				System.out.print(a[i]);
				}
		}
	return 0;
	}

}

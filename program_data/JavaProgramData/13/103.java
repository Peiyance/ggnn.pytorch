package <missing>;

public class GlobalMembers
{
	//??n????n???????????????10-100??? 
	//???????????????????????????????????????????
	//???2010?10?25
	public static int Main()
	{
		int n; //n:?????????????,temp:?????????b[90],??90???????????????10-100; i k??????;counter???
		int[] b = new int[91];
		int i;
		int k;
		int counter = 0;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //n???????
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (k = 0; k < 91; k++) //????????????
			{
				if (b[k] == temp) //????????
				{
					break;
				}
			}
			if (k >= 91) //????????????,???????????
			{
				b[counter] = temp;
				counter++; //????,??1,?????counter-1??
			}
		}
		for (k = 0; k < counter - 1; k++) //??????
		{
			System.out.print(b[k]);
			System.out.print(" ");
		}
		System.out.print(b[counter - 1]);
		System.out.print("\n");
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] iaX = new int[11];
		int[] iaY = new int[11];
		int x;
		int y;
		int i;
		int j;
		int ilenx = 0;
		int ileny = 0;
		int itemp;
		int imin;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < 11; i++)
		{
			iaX[i] = -1;
			iaY[i] = -1;
		}

		i = 0;
		while (x > 0)
		{
			iaX[i++] = x;
			x /= 2;
			ilenx++;
		}
		i = 0;
		j = ilenx - 1;
		while (i < j)
		{
			itemp = iaX[i];
			iaX[i] = iaX[j];
			iaX[j] = itemp;
			i++;
			j--;
		}

		i = 0;
		while (y > 0)
		{
			iaY[i++] = y;
			y /= 2;
			ileny++;
		}
		i = 0;
		j = ileny - 1;
		while (i < j)
		{
			itemp = iaY[i];
			iaY[i] = iaY[j];
			iaY[j] = itemp;
			i++;
			j--;
		}

		imin = ilenx > ileny != 0? ileny:ilenx;
		for (i = 0;i < imin; i++)
		{
			if (iaX[i] != iaY[i])
			{
				break;
			}
		}
		System.out.printf("%d", iaX[--i]);

	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ma = 'A';
	int[] cnt = new int[128];
	int i;
	int j;
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct s
	//{
	//	int id;
	//char au[27];
	//}
	//bk[1000];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bk[i].id = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			bk[i].au = tempVar3;
		}
	for (j = 0;bk[i].au[j] != '\0';j++)
	{
		cnt[bk[i].au[j]]++;
	if (cnt[bk[i].au[j]] > cnt[ma])
	{
		ma = bk[i].au[j];
	}
	}
	}
	System.out.printf("%c\n%d\n",ma,cnt[ma]);
	for (i = 0;i < n;i++)
	{
		if (tangible.StringFunctions.strChr(bk[i].au,ma))
		{
			System.out.printf("%d\n",bk[i].id);
		}
	}
	return 0;

	}
}


package <missing>;

public class GlobalMembers
{
	public static int[] freq = new int[26]; //????a,b,c��,z??????????????????0

	public static int Main()
	{
	String s = new String(new char[300]); //?????
	int len;
	int num = 0;
	char index;
	char e;
	int mark = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	len = s.length();
	for (int i = 0;i < len;i++)
	{
		 if ((s.charAt(i) <= 'z') && (s.charAt(i) >= 'a'))
		 { //???????a?z??
			index = s.charAt(i) - 'a'; //???????????????a??0?,z??25??????
			freq[index]++; //??????1
		 }
	}

	for (num = 0;num < 26;num++)
	{
		if (freq[num] > 0)
		{
			e = num + 'a'; //???num?????
			System.out.printf("%c=%d\n",e,freq[num]); //????????????
			mark = 1;
		}
	}
	if (mark == 0)
	{
		System.out.print("No");
	}
	return 0;
	}
}

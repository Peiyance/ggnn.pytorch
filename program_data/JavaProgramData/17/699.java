package <missing>;

public class GlobalMembers
{
	/* Name      : ??????????? 
	 * Version   : 2.0
	 * Date      : 2012-11-24
	 * New       : Null
	 * Func&Feat : 
	 * State     : Design
	 */
	public static int pairs(int n, int hemi, String text, String match)
	{
		for (;;)
		{
			char c = text[n];
			if (c == 0)
			{
				return -1;
			}
			if (c == '(')
			{
				int l = n;
				int r = pairs(n + 1, 1, text, match);
	//            cout<<l<<' '<<r<<endl;
				if (r != -1)
				{
					match[l] = match[r] = ' ';
					n = r + 1;
				}
				else
				{
					return -1;
				}
			}
			else if (c == ')' && hemi == 1)
			{
				return n;
			}
			else
			{
				n++;
			}
		}
	}
	public static int Main()
	{
		for (;;)
		{
			char[] text = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //???text????????match??????
			char[] match = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			int lgth = 0; //???lgth??text???brkt[]????????????-1??????1?
			text = new Scanner(System.in).nextLine(); //??gets()??????????????????????
			if (text[0] == 0)
			{
				break; //????????????????????
			}
			for (int i = 0;i < 101;i++) //???????text?????????????
			{
				if (text[i] != 0)
				{
					if (text[i] == '(')
					{
						match[i] = '$'; //??text[]?????brkt[]???-1?match[]????'$'
					}
					else if (text[i] == ')')
					{
						match[i] = '?'; //??text[]?????brkt[]???1?match[]????'?'
					}
					else
					{
						match[i] = ' '; //??text[]?????brkt[]?????0?match[]??????
					}
				}
				else //??text[]?????????text?????
				{
					lgth = i;
					break;
				}
			}
			pairs(0, 0, text, match);
			System.out.print(text);
			System.out.print("\n");
			System.out.print(match);
			System.out.print("\n");
		}
		return 0;
	}

}
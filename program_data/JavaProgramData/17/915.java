package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] line = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] label = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] pos = new int[101];
		int left;
		int right;
		int l;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < n; j++)
		{
			line = ConsoleInput.readToWhiteSpace(true).charAt(0);
			left = 0;
			right = 0;
			l = line.length();
			for (i = 0; i < 101; i++)
			{
				label[i] = ' ';
			}
			for (i = 0; line[i] != '\0'; i++)
			{
				if (line[i] == '(')
				{
					left++;
					pos[left] = i;
				}
				if (line[i] == ')')
				{
					if (left <= right)
					{
						label[i] = '?';
					}
					else
					{
						left--;
					}
				}
			}
			for (i = 1; i <= left; i++)
			{
				label[pos[i]] = '$';
			}
			label[l] = '\0';
			System.out.print(line);
			System.out.print("\n");
			System.out.print(label);
			System.out.print("\n");
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int j;
	   int w;
	   char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	   char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	   char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	   final String d = "";
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   c = new Scanner(System.in).nextLine();
	   String pc;
	   String pa;
	   String pb;
	   (char)(*pd)[100];
	   pa = a[0];
	   pb = b[0];
	   pc = c[0];
	   pd = d;
	   int k = 0;
	   int ll = c.length();
	   for (i = 0;;i++)
	   {
		   for (j = 0; * (pa.Substring(k)) != ' ';j++)
		   {
			   if (*(pa.Substring(k)) == '\0')
			   {
					(*(*(pd + i) + j)) = (*(pa.Substring(k)));
					break;
			   }
			   (*(*(pd + i) + j)) = (*(pa.Substring(k)));
			   k++;
		   }
		   (*(*(pd + i) + j)) = '\0';
			   if ((*(pa.Substring(k))) == '\0')
			   {
				break;
			   }
			k++;
	   }
	   int count = i + 1;
	   for (i = 0;i < count;i++)
	   {
		   int l = String.valueOf(d.charAt(i)).length();
		   for (j = 0;j < l + 1;j++)
		   {
				if ((*(*(pd + i) + j)) == (*(pb.Substring(j))))
				{
					w = 1;
					continue;
				}
				else
				{
					w = 0;
					break;
				}
		   }
			if (w != 0)
			{
				for (k = 0;k < ll;k++)
				{
					(*(*(pd + i) + k)) = (*(pc.Substring(k)));
				}
				(*(*(pd + i) + k)) = '\0';
			}
			else
			{
				continue;
			}
	   }
	   for (i = 0;i < count;i++)
	   {
			if (i > 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%s",d.charAt(i));
	   }
		System.out.print("\n");
	}




}
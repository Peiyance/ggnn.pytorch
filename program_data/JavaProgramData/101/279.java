package <missing>;

public class GlobalMembers
{
	//??????//
	//??????//
	//???1000011029//
	//???2010?11?20?//



	public static int Main()
	{
		int a = 0; //??????a???//
		int b = 0; //??????b???//
		int c = 0; //??????c???//
		String temp = new String(new char[3]); //??????????//

		for (a = 0;a < 3;a++) //??????2????0//
		{
			for (b = 0;b < 3;b++) //?????????//
			{
				for (c = 0;c < 3;c++)
				{
					if ((b > a) + (c == a) == 2 - a && (b < a) + (a > c) == 2 - b && (c > b) + (b > a) == 2 - c) //????????//
					{
						temp = tangible.StringFunctions.changeCharacter(temp, a, 'A'); //??????//
						temp = tangible.StringFunctions.changeCharacter(temp, b, 'B');
						temp = tangible.StringFunctions.changeCharacter(temp, c, 'C');

						System.out.print(temp.charAt(0));
						System.out.print(temp.charAt(1));
						System.out.print(temp.charAt(2));
					}

				}
			}
		}



		return 0;

	}

}

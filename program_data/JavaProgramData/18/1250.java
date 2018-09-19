int n;
int[][] board = new int[100][100];
void Subduction(int);
int sum;
int main()
{
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n - 1;i++)
	{
		sum = 0;
		int j;
		int k;
		for (j = 0;j <= n - 1;j++)
		{
			for (k = 0;k <= n - 1;k++)
			{
				board[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		Subduction(n);
	}

			   return 0;
}

void Subduction(int m)
{
	 if (m == 1)
	 {
		 System.out.print(sum);
		 System.out.print("\n");
	 }
	 else
	 {
	 int[] rowmin = new int[100];
	 int[] colmin = new int[100];
	 int p;
	 int q;
	 for (p = 0;p <= m - 1;p++)
	 {
		 rowmin[p] = board[p][0];
		 for (q = 0;q <= m - 1;q++)
		 {
			 if (board[p][q] < rowmin[p])
			 {
				 rowmin[p] = board[p][q];
			 }
		 }
	 }

	 for (p = 0;p <= m - 1;p++)
	 {
		 for (q = 0;q <= m - 1;q++)
		 {
			 board[p][q] -= rowmin[p];
		 }
	 }
	 for (q = 0;q <= m - 1;q++)
	 {
		 colmin[q] = board[0][q];
		 for (p = 0;p <= m - 1;p++)
		 {
			 if (board[p][q] < colmin[q])
			 {
				 colmin[q] = board[p][q];
			 }
		 }
	 }

	 for (q = 0;q <= m - 1;q++)
	 {
		 for (p = 0;p <= m - 1;p++)
		 {
			 board[p][q] -= colmin[q];
		 }
	 }
	 sum += board[1][1];
	 for (q = 1;q <= m - 2;q++)
	 {
		 board[0][q] = board[0][q + 1];
	 }
	 for (p = 1;p <= m - 2;p++)
	 {
		 board[p][0] = board[p + 1][0];
	 }
	 for (p = 1;p <= m - 2;p++)
	 {
		 for (q = 1;q <= m - 2;q++)
		 {
			 board[p][q] = board[p + 1][q + 1];
		 }
	 }
	 Subduction(m - 1);
	 }
}


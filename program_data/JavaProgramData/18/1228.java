void hang(int[], int);
void xiaojie(int[], int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	int j;
	int k;
	int m;
	int min;
	int sum;
	int[][] a = new int[101][101];
	for (k = 0; k < n; k++)
	{
		sum = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 0; m < n - 1; m++)
		{
			for (i = 0; i < n - m; i++)
			{
				hang(a[i], n - m);
			}
			for (j = 0; j < n - m; j++)
			{
				min = a[0][j];
				for (i = 0; i < n - m ;i++)
				{
					if (min > a[i][j])
					{
						min = a[i][j];
					}
				}
				for (i = 0; i < n - m; i++)
				{
					a[i][j] = a[i][j] - min;
				}
			}
			sum += a[1][1];
			for (i = 0; i < n - m; i++)
			{
				xiaojie(a[i], n - m);
			}
			for (j = 0; j < n - 1 - m; j++)
			{
				for (i = 1; i < n - 1 - m; i++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
void hang(int a[], int leg)
{
	int min = a[0];
	int i;
	for (i = 0; i < leg; i++)
	{
		if (min > a[i])
		{
			min = a[i];
		}
	}
	for (i = 0; i < leg; i++)
	{
		a[i] = a[i] - min;
	}
}
void xiaojie(int a[], int leg)
{
	int i;
	for (i = 1; i < leg; i++)
	{
		a[i] = a[i + 1];
	}
}


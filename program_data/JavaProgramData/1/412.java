int f = new int(int,int); //????
int main() //?????
{ //?????
	int n;
	int i;
	int[] a = new int[50];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a[i],2));
		System.out.print("\n");
	}
	return 0; //???????????????????
} //?????

int f(int n,int p) //????????????=p?????

{
	int sum = 0;
	int m;
	for (m = p;m <= n;m++)
	{
		if (n % m == 0)
		{
			if (m < n)
			{
				sum = sum + f(n / m,m); //n?????m?????=n/i?????=m?????
			}
			if (m == n)
			{
				sum = sum + 1; //n?????n?????=1
			}
		}
	}
		return sum;
}


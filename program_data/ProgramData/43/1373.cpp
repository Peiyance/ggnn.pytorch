//*****************************
//*??:???????? ***
//*??:??? 1300012991 ***
//*??:2013?10?25? ***
//*****************************

int main()
{
	int n, a, b, i, j, k, open;
	cin >> n; //??????6??
	for (k = 3; k <= n / 2; k = a + 2) //???????????????
	{
		for (a = k; a <= n / 2; a += 2) //???????????????????
		{
			for (i = 2; i < a; i++) //??a?????
			{
				if (a % i ==0) //a???????,????,?????????
				break;
			}
			if (i == a) //a??????????,???,?????,???????
			{
				open = 1;
			    break;
			}
		}
     	b = n - a; //b??n?a??
    	for (j = 2; j < b; j++) //????b?????
		{
	    	if (b % j == 0)
			break;
		}
    	if ((j == b) && (open == 1)) //a?b???????
		{
			cout << a << " " ; //??a??b
			cout << b << endl; //?????????
		}
		open = 0; //?????
	}
	return 0;
}
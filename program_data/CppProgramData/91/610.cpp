//* * * * * * * * * * * * * * * * * * * * * * * * 
//*???????????                       *
//*??????????? .cpp                  *
//*?????  1000012839                       *
//*???2010.12.15                             *
//* * * * * * * * * * * * * * * * * * * * * * * * 


int main()
{
	char s[101], s1[101];	//	??????s?s1??????????????
	int i;	//	?????
	int m, l;	//	m??????ASCII??l???????

	cin.getline(s, 101);
	l = strlen(s);	
	for (i = 0; i < l; i++)
	{
		if (i < l - 1)
			m = s[i] + s[i + 1];	
		else
			m = s[i] + s[0];	//	??????????????????s???????ASCII??s???????ASCII??
		s1[i] = m;	//	?ascii???????
		cout << s1[i];
	}
	cout << endl;	//	?????
	return 0;	
}
/*
?? 
???????????????????????????????????
 
???? 
??????????????????????????100?
 
???? 
???????
 
???? 
Hello      world.This is    c language.
 
???? 
Hello world.This is c language.
 
?? 
gets(char [] str)?????????????str 


*/



int main()
{
	char b;
	int i;
	while(1)
	{
		b=getchar();
		if (b=='\n')
		{
			break;
		}
		else if (b==' ')
		{
			cout<<' ';
			while(1)
			{
			    b=getchar();
				if (b!=' ')
				{
					cout<<b;
					break;
				}
			}
		}
		else 
		{
			cout<<b;
		}
	}
	cout<<endl;
	return 0;
}
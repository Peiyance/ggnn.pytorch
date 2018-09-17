int str2bigint(char *str,int *a)
{
	int len=(int)strlen(str);
	int i;
	for(i=0;i<len;i++)
		a[len-i-1]=str[i]-'0';
	return len;
}

void print_bigint(int *a,int len)
{
	int k=len-1;
	int i;
	while(a[k]==0&&k>0)
		k--;
	for(i=k;i>=0;i--)
		printf("%d",a[i]);
}

int add(int *a,int alen,int *b,int blen,int *c)
{
	int i;
	int len=(alen>blen)?alen:blen;
	for(i=0;i<len;i++)
	{
		c[i]=0;
		if(i<alen)
			c[i]+=a[i];
		if(i<blen)
			c[i]+=b[i];
	}
	c[len]=0;
	for(i=0;i<len;i++)
	{
		if(c[i]>=10)
		{
			c[i+1]+=c[i]/10;
			c[i]%=10;
		}
	}
	return c[len]?(len+1):len;
}

void main()
{
	char s1[max],s2[max];
	int a[max],b[max],c[max];
	int alen,blen,clen;
	scanf("%s%s",s1,s2);
	alen=str2bigint(s1,a);
	blen=str2bigint(s2,b);
	clen=add(a,alen,b,blen,c);
	print_bigint(c,clen);
}
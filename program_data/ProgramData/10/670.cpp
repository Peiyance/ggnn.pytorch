int main()
{
	int k,i,j,t,d[25],h[25];//h?????????d????????????????????????
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{scanf("%d",&h[i]);}
	for(i=0;i<k;i++)  //?i=0??
	{
		t=0;
		for(j=0;j<i;j++)//???i?????????????????????+1
		{
			if(h[j]>=h[i])//?????????????????????????t?????
			{
				if(d[j]>t) t=d[j];
			}
		}
		d[i]=t+1;//????i?????1
	}
	for(i=0;i<k;i++)
	{
		if(d[i]>t) t=d[i];//????????
	}
	printf("%d\n",t);
	return 0;
}
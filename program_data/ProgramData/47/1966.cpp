/*
 * ????reverse-rank-of-int.cpp
 * ??????
 * ????:2012-12-14
 * ???????
 */
int main(){
	int n=0,temp=0,A[100]={0};         //????n,temp???A
	cin>>n;                            //???????n
	for(int i=0;i<n;i++)cin>>*(A+i);   //??????n??
	for(int *p=A,*q=A+n-1;p<q;p++,q--) //???????????????
	{
		temp=*p;
		*p=*q;
		*q=temp;
	}
	cout<<*A;                          //??????????????????
	for(int i=1;i<n;i++)cout<<" "<<*(A+i);
	return 0;                          //?????
}
#include<stdio.h>
int main()
{
	
	int a[100],n,i;
	printf("enter size of array=");
	scanf("%d",&n);
	printf("\n enter the element of array=");
	for(i=0;i<n;i++)
	{
		
		scanf("&d",&a[i]);
	}
	printf("\n element of array=");
	printf("\n *****traversing array********\n");
	for(i=0;i<n;i++)
	{
		
		printf("array[%d]element=%d\n ",i,a[i]);
	}
	
	return 0;
}
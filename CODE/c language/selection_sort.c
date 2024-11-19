#include<stdio.h>
int main()
{
	int a[]={1,2,32,34,12,45,3};
	int i,j,temp,n=7;
	int b[n];
	printf("before sorted arry\n");
	for(i=0;i<7;i++)
	{
		printf("array[%d]=%d\n",i,a[i]);
	}
	// for sorting 
	for(i=0;i<n-1;i++)
	{
		int min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
		{
			min=j;
		}
		}
		if(min!=i)
		{
		//	swap(a[i],a[min]);
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		}
	}
	//for printf sorted array
	printf("sorted array\n");
	for(i=0;i<n;i++)
	{
		printf("array[%d]=%d\n",i,a[i]);
	}
	

}

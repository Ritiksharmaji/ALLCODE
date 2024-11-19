// this is for insertion sort algorithem

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
	
/*	b[i]=a[0];
	for(i=1;i<7;i++)
	{
	for(j=0;j<i;j++)
	{
		if(a[i]<b[j])
		{
			b[j]=a[i];
		}
	}
} */
  for(i=1;i<n;i++)
  {
  	temp=a[i];
  	j=i-1;
  	while(j>=0 && a[j]>temp)
  	{
  		a[j+1]=a[j];
  		j--;
	  }
	  a[j+1]=temp;
  }
  printf("sorted array");
  for(i=0;i<n;i++)
  {
  	printf("a[%d]=%d\n",i,a[i]);
  }

	
}

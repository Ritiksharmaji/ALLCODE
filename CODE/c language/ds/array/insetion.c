
//****insert elemnet without overwrite*****/

#include <stdio.h>

int main()
{
    int a[100],size,i,pos,num;
    printf("enter the size of array=");
    scanf("%d",&size);
    printf("\n enter the element of array=");
    for(i=0;i<size;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n enter the possion of element=");
    scanf("%d",&pos);
    printf("enter the value of element");
    scanf("%d",&num);
    for(i=size-1;i>pos-1;i--)
    {
        a[i+1]=a[i];
    }
    a[pos-1]=num;
    size++;
    printf("\n elemnet od array");
    for(i=0;i<size;i++)
    {
        printf("a[%d]=%d\n ",i,a[i]);
    }

    return 0;
}

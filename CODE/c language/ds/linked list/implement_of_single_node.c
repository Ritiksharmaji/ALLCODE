// for creat or implemention of single node
#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *next;
};
struct node *head=NULL,*newnode,*temp;


void createnode()
{
     newnode=(struct node*)malloc(sizeof(struct node));
     int data;
     printf("enter element for node");
     scanf("%d",&data);
     if(head==NULL)
     {
          newnode->data=data;
         newnode->next=NULL;
          head=temp=newnode;
          
     }
     else
     {
          temp->next=newnode;
          newnode->data=data;
          newnode->next=NULL;
          temp=newnode;
          
     }
}
void display()
{
     temp=head;
     while(temp!=NULL)
     {
          printf("%d\t",temp->data);
          temp=temp->next;
     }
     
}

int main()
{
   //  head=NULL;
     temp=head;
     int n;
     do{
    printf("do you want to create a node then press 1 else 0 ");
    scanf("%d",&n);
    if(n==1)
    {
         createnode();
    }
     }
    while(n==1);
    printf("for node disply data=");
    display();
    

    return 0;
}


// for insert a node at begging of linked list.
#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *next;
};
struct node *head=NULL,*newnode,*temp;

void createnode();
void display();
void insertbeg();


int main()
{
   //  head=NULL;
     temp=head;
     int n,choice;
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
    printf("\n do y want to insert another node at begging of linked list then press 1 else 0");
    scanf("%d",&choice);
    if(choice==1)
    {
         insertbeg();
         display();
    }
    
    

    return 0;
}
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
void insertbeg()
{
     int x;
     newnode=(struct node*)malloc(sizeof(struct node));
     printf("enter element for insert at begging ");
     scanf("%d",&x);
     if(head==NULL)
     {
          printf("overflow");
     }
     else{
          newnode->data=x;
          newnode->next=head;
          head=newnode;
     }
     
     
}



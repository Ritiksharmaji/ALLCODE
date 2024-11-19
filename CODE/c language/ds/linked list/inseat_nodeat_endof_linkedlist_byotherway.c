// for insert a node at ending of linked list.
#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *next;
};
struct node *head=NULL,*newnode,*temp,*temp2;

void createnode();
void display();
void insertend();


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
  //  printf("for node disply data=");
  //  display();
    printf("\n do y want to insert another node at end  of linked list then press 1 else 0");
    scanf("%d",&choice);
    if(choice==1)
    {
         insertend();
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
     temp2=head;
     while(temp2!=NULL)
     {
          printf("%d\t",temp2->data);
          temp2=temp2->next;
     }
     
}
void insertend()
{
     int x;
     newnode=(struct node*)malloc(sizeof(struct node));
     printf("enter element for insert at ending ");
     scanf("%d",&x);
     temp=head;
     
     if(newnode == NULL)  
        {  
            printf("\nOVERFLOW");     
        }  
        else  
        {  
            newnode->data =x;  
            if(head == NULL)  
            {  
                newnode-> next = NULL;  
                head =newnode;  
                printf("\nNode inserted");  
            }  
            else  
            {  
                temp = head;  
                while (temp -> next != NULL)  
                {  
                    temp = temp -> next;  
                }  
                temp->next = newnode;  
                newnode->next = NULL; 
                temp=newnode;
                printf("\nNode inserted");  
              
            }  
        }  
    }  
     
    /* while(temp->next!=NULL)
     {
          temp=temp->next;
     }
     if(temp->next==NULL)
     {
          temp->next=newnode;
          newnode->data=x;
          newnode->next=NULL;
          temp=newnode;
     }  */
     
     




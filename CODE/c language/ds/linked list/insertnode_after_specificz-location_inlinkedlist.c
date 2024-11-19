// for Insertion in singly linked list after specified Node
#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *next;
};
struct node *head=NULL,*newnode,*temp,*temp2;

void createnode();
void display();
void insertspecific();


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
         insertspecific();
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
void insertspecific()
{
     int x,y,i;
     newnode=(struct node*)malloc(sizeof(struct node));
     printf("enter element for insert at a specific location ");
     scanf("%d",&x);
     printf("enter location for insert a node ");
     scanf("%d",&y);
     temp=head;
     
      if(temp == NULL)  
        {  
            printf("\nOVERFLOW");  
        }  
        else  
        {  
              
           // printf("Enter the location");  
           // scanf("%d",&loc);             
            newnode->data =x;  
            temp=head;  
            for( i=0;i<y;i++)  
            {  
                temp = temp->next;  
                if(temp == NULL)  
                {  
                    printf("\ncan't insert\n");  
                    return;  
                }  
              
            }  
            newnode ->next = temp ->next;   
            temp ->next = newnode;   
            printf("\nNode inserted");  
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
     
     




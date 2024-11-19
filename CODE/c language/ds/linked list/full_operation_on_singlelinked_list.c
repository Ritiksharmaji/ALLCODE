// for cinsert a node at begging of linked list.
#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *next;
};
struct node *head=NULL,*newnode,*temp,*temp2;
 void create();
 void createlinked();
 void insertbeg();
 void insertend();
 void isertspe();
 void deletebeg();
 void deleteend();
 void deletespe();
 void deletelinked();
 void display();



int main()
{
   //  head=NULL;
     temp=head;
     int n,choice;
     
     	printf("enter number from 1 to 8");
     	printf("\n -----------------------");
     	printf("\n press 1 for implement linked list");
     	printf("\n press 2 for insert a node at begging of linked list");
     	printf("\n press 3 for insert a node at end of linked list");
     	printf("\n press 4 for insert a node after givien location of linked list");
     	printf("\n press 5 for delete  a node at begging of linked list");
     	printf("\n press 6 for delete a node at ending of linked list");
     	printf("\n press 7 for delete  a node after given location of linked list");
     	printf("\n press 8 for delete whole linked list");
     	printf("\n -----------------------\n");
     	
     	
  //  printf("do you want to create a node then press 1 else 0 ");
    scanf("%d",&n);
     switch(n)
    {
         case 1:
           create();
           break;
         case 2:
            insertbeg();
            break;
         case 3:
           insertend();
           break;
         case 4:
         	isertspe();
         	break;
        case 5:
        	deletebeg();
        	break;
        case 6:
        	deleteend();
        	break;
        case 7:
        	deletespe();
        	break;
        case 8:
        	deletelinked();
        	break;
        default:
         printf("invalid press");
         
    }
    printf("\nfor display node=");
    display();
   
    

    return 0;
}
void create()
{
	int x,y;
	do{
	printf("do y want to create node press 1 else 0");
	scanf("%d",&x);
	if(x==1)
	{
		createlinked();
	}
}while(x==1);
}
void createlinked()
{
	int data;
     newnode=(struct node*)malloc(sizeof(struct node));
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
void insertbeg()
{
     
}
void  insertend()
{
     
}
void  isertspe()
{
     
}
void deletebeg()
{
     
}
void deleteend()
{
     
}
 void deletespe()
 {
      
 }
 void deletelinked()
 {
      
 }



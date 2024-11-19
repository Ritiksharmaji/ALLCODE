//insert a node after given node location of double linked list.
#include <stdio.h>
#include<stdlib.h>
struct node
{
    struct node* prev;
    int data;
    struct node* next;
};
struct node* head,*newnode,*temp,*temp2;
void createdublelinked();
void display();
void insertloc();
void display2();
int main()
{
    head=NULL;
    int c,cc;
    do
    {
    	printf("do y want to create node then press 1 else 0");
    	scanf("%d",&c);
    	if(c==1)
    	{
    		createdublelinked();
		}
    }while(c==1);
    printf("double linked list=");
    display();
    printf("do y want to insert element after given location then press 1 else 0");
    scanf("%d",&cc);
    if(cc==1)
    {
    	insertloc();
	}
	printf("\n after insert node at location double linked list=");
	display2();
    
  /*  //for displaying stement
    
    temp=head;
    while(temp!=NULL)
    {
        printf("%d" "->",temp->data);
        temp=temp->next;
    }
       */

    return 0;
}
void createdublelinked()
{
	newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter a element of node");
    scanf("%d",&newnode->data);
    if(head==NULL)
    {
       newnode->prev=NULL;
       newnode->next=NULL;
       head=newnode;
       temp=head;
    }
    else
    {
    	newnode->next=NULL;
        temp->next=newnode;
        newnode->prev=temp;
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
	printf("\n addes=%u\n",temp2);
	
}
void insertloc()
{
     int loc,i;
newnode=(struct node*)malloc(sizeof(struct node));
printf("\n enter the location");
scanf("%d",&loc);
temp2=head;
for(i=0;i<loc;i++)
{
     temp2=temp2->next;
     
}
if(temp2==NULL)
{
     return;
}
else{

    printf("enter a element of node");
    scanf("%d",&newnode->data);
    newnode->next=temp2->next;
		temp2->next=newnode;
		temp2->next=newnode;
		temp2->next->prev=newnode;
		/*   ptr->data = item;  
       ptr->next = temp->next;  
       ptr -> prev = temp;  
       temp->next = ptr;....over  
       temp->next->prev=ptr;  */
       
       
       
	}
}

void display2()
{
	temp2=head;
	while(temp2!=NULL)
	{
		printf("%d\t",temp2->data);
		temp2=temp2->next;
	}
	printf("\n addes=%u\n",temp2);
	
}



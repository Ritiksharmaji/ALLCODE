//implement double linked list.
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
int main()
{
    head=NULL;
    int c;
    do
    {
    	printf("do y want to create node then press 1 else 0");
    	scanf("%d",&c);
    	if(c==1)
    	{
    		createdoublelinked();
		}
    }while(c==1);
    printf("double linked list=");
    display();
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
void createdoublelinked()
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
	printf("\n addes=%u",temp2);
	
}



// creating stack useing linked list
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *pre;
};
struct node* head=0,*newnode,*temp;
void creat_stack(int x)
{
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=x;
    newnode->pre=head;
    head=newnode;
    
}
void display()
{
   /* for(int i=head;i>=0;i--)
    {
        printf("%d\t",newnode->data);
        
    }*/
    temp=head;
    while(temp!=NULL)
    {
        printf("%d\t",temp->data);
        temp=temp->pre;// beause in implemention of stack by using linkrd list newnode is linked with previse node not next node
       // temp--;
    }
    
}
void peek()
{
    if(head==NULL)
    {
        printf("stack in empty");
    }
    else
    {
        printf("\n topest element =%d",head->data);
    }
}
void pop()
{
    if(head==NULL)
    {
        printf("underflow");
    }
    else
    {
        while(head!=NULL)
        {
            int itme=head->data;
         //   newnode=head;
            head=head->pre;
           // free(newnode);
        }
       // printf("\n After deletion element of stack =%d",head->data);
       if(head==NULL)
    {
        printf("empty");
    }
    else{
        printf("element avaliable");
    }
    }
    
}
int main()
{
    int x,y;
    do{
    printf("enter element in stack");
    scanf("%d",&x);
    printf("do y want to continu..press 1 else other");
    scanf("%d",&y);
    creat_stack(x);
    }while(y==1);
    printf("\n for display stack=");
    display();
    peek();
    printf("\n for pop operation=");
    pop();
    
}




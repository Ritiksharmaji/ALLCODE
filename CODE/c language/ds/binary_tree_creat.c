
#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *left,*right;
};
struct node* root,*newnode;
//root=NULL;

struct node* create()
{
     int x,y;
     newnode=(struct node*)malloc(sizeof(struct node));
     printf("press 1 for create node\n");
     scanf("%d",&y);
     if(y==1){
     printf("enter data=\n");
     scanf("%d",&x);
     }
     else
     {
          return 0;
     }
     newnode->data=x;
     printf("enter left node of %d\n",x);
     newnode->left=create();
     printf("enter right node of %d\n",x);
     newnode->right=create();
     
     
     return newnode;
}

  void preorder (struct node* root)
{
	if(root==NULL)
	{
		return;
	}
	printf("%d",root->data);
	preorder(root->left);
	preorder(root->right);
}  

int main()
{
     root=NULL;
     root=create();
     printf("root data=",root->data);
     
    preorder(root);
     
  //  printf("Hello World");

    return 0;
}



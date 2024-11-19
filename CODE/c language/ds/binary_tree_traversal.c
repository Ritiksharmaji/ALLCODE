#include <stdio.h>
#include<stdlib.h>
struct node{
     int data;
     struct node *left,*right;
};
struct node* root,*newnode;

void preorder (struct node* root)
{
	if(root==NULL)
	{
		return 0;
	}
	printf("%d",root->data);
	preorder(root->left);
	preorder(root->right);
}
int main()
{
	struct node* root;
	printf("preorder is");
	preorder(root);
}

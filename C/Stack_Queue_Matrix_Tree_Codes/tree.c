#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *leftnode;
    struct Node *rightnode;
};
typedef struct Node node;
node *root=NULL,*newnode,*current,*parent;
int main()
{
    int i;
    int array[7]={12,24,34,43,1,267,44};
    for(i=0;i<7;i++)
        insert(array[i]);
    i=34;
    node *temp=search(i);
    if(temp!=NULL)
    {
        printf("%d is found",temp->data);
        printf("\n");
    }
     else
    {
        printf("\nElement %d is not found");
    }
    i=99;
    temp=search(i);
    if(temp!=NULL)
    {
        printf("\n%d is found",temp->data);
        printf("\n");
    }
    else
    {
        printf("\nElement %d is not found");
    }
    printf("\nPreorder traversal= ");
    preorder_traversal(root);
    printf("\nInorder traversal= ");
    inorder_traversal(root);
    printf("\npostorder traversal= ");
    postorder_traversal(root);
    return 0;
}
int insert(int data)
{
    newnode=(node*)malloc(sizeof(node));
    newnode->data=data;
    newnode->leftnode=NULL;
    newnode->rightnode=NULL;
    if(root==NULL)
    {
        root=newnode;
    }
    else
    {
        current=root;
        parent=NULL;
        while(1)
        {
            parent=current;
            if(data<current->data)
            {
                current=current->leftnode;
                if(current==NULL)
                {
                    parent->leftnode=newnode;
                    return;
                }
            }
            else
            {
                current=current->rightnode;
                if(current==NULL)
                {
                    parent->rightnode=newnode;
                    return;
                }
            }
        }
    }
}
int search(int data)
{
    current=root;
    printf("\nVisiting elements are=");
    while(current->data!=data)
    {
        if(current->data!=NULL)
        {
            printf("[%d] ",current->data);
        }
        if(current->data>data)
            {
                current=current->leftnode;
                //return current;
            }
        else
            {
                current=current->rightnode;
                //return current;
            }
        if(current==NULL)
            {
                return NULL;
            }
    }
    return current;
}

void preorder_traversal(node *root)
{
    if(root!=NULL)
    {
        printf(" %d->",root->data);
        preorder_traversal(root->leftnode);
        preorder_traversal(root->rightnode);
    }
}
void inorder_traversal(node *root)
{
    if(root!=NULL)
    {
        inorder_traversal(root->leftnode);
        printf(" %d->",root->data);
        inorder_traversal(root->rightnode);
    }
}
void postorder_traversal(node *root)
{
    if(root!=NULL)
    {
        postorder_traversal(root->leftnode);
        postorder_traversal(root->rightnode);
        printf(" %d->",root->data);
    }
}

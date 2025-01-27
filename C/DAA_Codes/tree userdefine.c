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
node *root=NULL,*newnode,*temp,*current,*parent;
int main()
{
    int i;
    int array[50],m,n,choice;
    do
    {
        printf("1.insert\n2.search\n3.preorder_traversal\n4.inorder_traversal\n5,postorder_traversal\n6.exit");
        printf("\nEnter the choice=");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                printf("enter the size of the array=");
                scanf("%d",&n);
                printf("\nenter the elements=");
                for(i=0;i<n;i++)
                    scanf("%d",&array[i]);
                for(i=0;i<n;i++)
                    insert(array[i]);
                break;
            case 2:
                printf("Enter the element you want to search=");
                scanf("%d",&m);
                temp=search(m);
                if(temp!=NULL)
                {
                    printf("%d is found",temp->data);
                    printf("\n");
                }
                else
                {
                    printf("\nElement is not found");
                }

                break;
            case 3:
                printf("\nPREORDER TRAVERSAL=");
                preorder_traversal(root);
                break;
            case 4:
                printf("\nINORDER TRAVERSAL=");
                inorder_traversal(root);
                break;
            case 5:
                printf("\nPOSTORDER TRAVERSAL=");
                postorder_traversal(root);
                break;
            case 6:
                exit(0);
            default:
                printf("\nplease enter the right choice:");
        }
    }
    while(choice!=6);
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
    printf(" \nVisiting elements are=\n");
    while(current->data!=data)
    {
        if(current->data!=NULL)
            printf("[%d]",current->data);
        if(data<current->data)
            current=current->leftnode;
        else
            current=current->rightnode;
        if(current==NULL)
            return NULL;
    }
    return current;
}
void preorder_traversal(node *root)
{
    if(root!=NULL)
    {
        printf("%d-->",root->data);
        preorder_traversal(root->leftnode);
        preorder_traversal(root->rightnode);
    }
}
void inorder_traversal(node *root)
{
    if(root!=NULL)
    {
        preorder_traversal(root->leftnode);
        printf("%d-->",root->data);
        preorder_traversal(root->rightnode);
    }
}
void postorder_traversal(node *root)
{
    if(root!=NULL)
    {
        preorder_traversal(root->leftnode);
        preorder_traversal(root->rightnode);
        printf("%d-->",root->data);
    }
}

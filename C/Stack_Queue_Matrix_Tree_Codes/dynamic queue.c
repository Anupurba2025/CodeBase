#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};
typedef struct Node node;
node *head=NULL,*temp=NULL,*p;
void insert();
int delete();
void display();
void main()
{
    int choice;
    do
    {
        printf("\n1.insert\n2.delete\n3.display\n4.exit");
        printf("\nEnter your choice=");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            insert();
            break;
        case 2:
            delete();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
        default:
            printf("\nplease enter the right choice=");

        }
    }
    while(choice!=4);
        return;
}
void insert()
{
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("\nmemory is full");
        return;
    }
    else
    {
        printf("\nEnter the data=");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            head=temp=p;
            p->next=NULL;
        }
        else
        {
            temp->next=p;
            p->next=NULL;
            temp=p;
        }
    }
}
int delete()
{
    node *t;
    int y;
    if(head==NULL)
    {
        printf("\nll is empty");
        return;
    }
    else
    {
        if(head->next==NULL)
        {
            t=head;
            y=head->data;
            head=NULL;
        }
        else
        {
            t=head;
            y=t->data;
            head=t->next;
        }
    }
    printf("\nThe element which is poped=%d",y);
    return(y);
    free(t);
}
void display()
{
    node *i;
    if(head==NULL)
    {
        printf("\nll is empty");
        return;
    }
    else
    {
        for(i=head;i!=NULL;i=i->next)
        {
            printf("%d->",i->data);
        }
    }
}

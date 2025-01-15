#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};
typedef struct Node node;
node *p,*head=NULL;
void insert_beg();
void insert_spc();
void display();
void main()
{
    int choice;
    do
    {
        printf("\n 1.insert_beg\n2.insert_spc\n3.display\n8.exit");
        printf("\nEnter the choice=");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                insert_beg();
                break;
            case 2:
                insert_spc();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("please enter the right choice:");
        }
    }
    while(choice!=4);
    return;
}
void insert_beg()
{
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("sorry memory is full");
        return;
    }
    else
    {
        printf("\nenter the data:");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            head=p;
            p->next=NULL;
        }
        else
        {
            p->next=head;
            head=p;
        }
    }
}
void insert_spc()
{
    node *m,*n,*u;
    int x;
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
        printf("\nenter the data after which you want to insert=");
        scanf("%d",&x);
        m=head;
        while(m->data!=x)
        {
            n=m;
            m=m->next;
        }
        u=m->next;
        m->next=p;
        p->next=u;
    }
}
void display()
{
    int count=0;
    node *i;
    if(head==NULL)
    {
        printf("ll is empty");
        return;
    }
    else
    {
        for(i=head;i!=NULL;i=i->next)
        {
            count++;
            printf("\n%d is the data at node %d at address %x",i->data,count,i);
        }
    }
}

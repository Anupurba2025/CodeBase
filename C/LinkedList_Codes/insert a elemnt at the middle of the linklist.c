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
void insert_mid();
void display();
void main()
{
    int choice;
    do
    {
        printf("\n 1.insert_beg\n2.insert at mid\n3.display\n4.exit");
        printf("\nEnter the choice=");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                insert_beg();
                break;
            case 2:
                insert_mid();
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
void insert_mid()
{
    int c=0,x,y=2;
    node *m,*n,*u;
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("sorry memory is full");
        return;
    }
    else
    {
        printf("\nEnter the data=");
        scanf("%d",&p->data);
        m=head;
        while(m!=NULL)
        {
            c=c+1;
            m=m->next;
        }
        if(c%2==0)
        {
            x=c/2;
        }
        else
        {
            x=(c+1)/2;
        }
        m=head;
        while(y<=x)
        {
            n=m;
            m=m->next;
            y++;
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

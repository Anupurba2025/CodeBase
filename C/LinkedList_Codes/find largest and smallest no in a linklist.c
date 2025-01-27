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
void find_largest();
void find_largest_and_smallest_no();
void display();
void main()
{
    int choice;
    do
    {
        printf("\n 1.insert_beg\n2.find largest_smallest no\n3.display\n4.exit");
        printf("\nEnter the choice=");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                insert_beg();
                break;
            case 2:
                find_largest_and_smallest_no();
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
void find_largest_and_smallest_no()
{
    int x=0;
    node *m;
    m=head;
    while(m!=NULL)
    {
        if(m->data>x)
        {
            x=m->data;
            m=m->next;
        }
        else
        {
            m=m->next;
        }
    }
    printf("\nthe largest data is=%d",x);
    find_smallest(x);
}
void find_smallest(int x)
{
    node *m;
    m=head;
    while(m!=NULL)
    {
        if(m->data<x)
        {
            x=m->data;
            m=m->next;
        }
        else
        {
            m=m->next;
        }
    }
    printf("\nthe smallest data is=%d",x);
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

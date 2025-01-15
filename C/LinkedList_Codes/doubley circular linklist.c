#include<stdio.h>
#include<stdlib.h>
struct Node
{
    struct Node *prev;
    int data;
    struct Node *next;
};
typedef struct Node node;
node *p,*head=NULL,*tail=NULL;
void insert_beg();
void insert_end();
void insert_spc();
int delete_beg();
int delete_end();
int delete_spc();
void display();

void main()
{
    int choice;
    do
    {
        printf("\n 1.insert_beg\n2insert_endy \n3.insert_spc\n4.delete_beg\n5.delete_end\n6.delete_spc\n7display\n8.exit");
        printf("\nEnter the choice=");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                insert_beg();
                break;
            case 2:
                insert_end();
                break;
            case 3:
                insert_spc();
                break;
            case 4:
                delete_beg;
                break;
            case 5:
                delete_end();
                break;
            case 6:
                delete_spc();
                break;
            case 7:
                display();
                break;
            case 8:
                exit(0);
            default:
                printf("please enter the right choice:");
        }
    }
    while(choice!=8);
    return;
}
void insert_beg()
{
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("memory is full");
    }
    else
    {
        printf("enter the data=");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            head=p;
            p->next=head;
            p->prev=head;
            tail=p;
        }
        else
        {
            p->next=head;
            p->prev=tail;
            head->prev=p;
            head=p;
            tail->next=head;
        }
    }
}
void insert_end()
{
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("memory is full");
    }
    else
    {
        printf("enter the data=");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            head=p;
            p->next=head;
            p->prev=head;
            tail=p;
        }
        else
        {
            tail->next=p;
            p->prev=tail;
            p->next=head;
            tail=p;
        }
    }
}
void insert_spc()
{
    node*m,*n;
    int c=0,pos,x=2;
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("memory is full");
    }
    else
    {

        printf("\nEnter the position:");
        scanf("%d",&pos);
        m=head;
        while(m->next!=head)
        {
            c++;
            m=m->next;
        }
    }
    if(pos==1)
    {
        insert_beg();
    }
    else if(pos==c+2)
    {
        insert_end();
    }
    else if(pos<1 || pos>(c+2))
    {
        printf("\nNot possible");
        return;
    }
    else
    {
            printf("\nenter the data=");
            scanf("%d",&p->data);
            m=head;
            while(x<=pos)
            {
                n=m;
                m=m->next;
                x++;
            }
            p->next=n->next;
            p->prev=m->prev;
            n->next=p;
            m->prev=p;
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
        for(i=head;i->next!=head;i=i->next)
        {
            count++;
            printf("\n%d is the data at node %d at address %x",i->data,count,i);
        }
         printf("\n%d is the data at node %d at address %x",i->data,count,i);
    }
}

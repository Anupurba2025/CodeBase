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
        printf("\n 1.insert_beg\n2insert_endy \n3.insert_spc\n4.delete_beg\n5.delete_end\n6.delete_spc\n7.doisplay\n8.exit");
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
                delete_beg();
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
    node *m;
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
            p->prev=NULL;
            p->next=NULL;
            head=p;
        }
        else
        {
            m=head;
            m->prev=p;
            p->next=head;
            head=p;
        }
    }
}
void insert_end()
{
    node*m;
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
            p->prev=NULL;
            p->next=NULL;
            head=p;
        }
        else
        {
            m=head;
            while(m->next!=NULL)
            {

                m=m->next;
            }
            m->next=p;
            p->prev=m;
            p->next=NULL;
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
        while(m->next!=NULL)
        {
            c++;
            m=m->next;
        }
    }
    if(pos==1)
    {
        insert_beg();
    }
    else if(pos==c+1)
    {
        insert_end();
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
int delete_beg()
{
    node *m,*n;
    int x;
    if(head==NULL)
    {
        printf("ll is empty\n");
        return;
    }
    else
    {
        if(head->next==NULL)
        {
            m=head;
            x=m->data;
            head=NULL;
        }
        else
        {
            m=head;
            n=head->next;
            x=m->data;
            head=m->next;
            n->prev=NULL;
        }
    }
    free(m);
    return(x);
}
int delete_end()
{
    node *m,*n;
    int x;
    if(head==NULL)
    {
        printf("ll is empty\n");
        return;
    }
    else
    {
        if(head->next==NULL)
        {
            m=head;
            x=m->data;
            head=NULL;
        }
        else
        {
            m=head;
            while(m->next!=NULL)
            {
                n=m;
                m=m->next;
            }
            x=m->data;
            n->next=NULL;
        }
    }
    free(m);
    return(x);
}
int delete_spc()
{
    node*m,*n,*t;
    int c=0,pos,x=2;
    if(head==NULL)
    {
        printf("ll is empty");
    }
    else
    {

        printf("\nEnter the position:");
        scanf("%d",&pos);
        m=head;
        while(m->next!=NULL)
        {
            c++;
            m=m->next;
        }
    }
    if(pos==1)
    {
        delete_beg();
    }
    else if(pos==c)
    {
        delete_end();
    }
    else
    {
      m=head;
      while(x<=pos)
      {
         n=m;
         m=m->next;
        x++;
      }
      t=m->next;
      x=m->data;
      n->next=m->next;
      t->prev=n;
    }
    free(m);
    return(x);
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

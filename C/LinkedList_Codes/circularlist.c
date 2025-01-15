#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};
typedef struct Node node;
node *p,*head=NULL,*temp=NULL;
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
        printf("\n1.insert_beg\n2.insert-end\n3.insert-spc\n4.del_beg\n5.del-end\n6.del_spc\n7.display\n8.exit");
        printf("\nEnter your choice=\n");
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
            printf("\nplease enter the right choice");
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
        printf("\nmemory is full");
        return;
    }
    else
    {
        printf("\nplease enter the data=");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            p->next=head;
            head=temp=p;
        }
        else
        {
            p->next=head;
            head=p;
            temp->next=head;
        }
    }
}
void insert_end()
{
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("\nmemory is full");
        return;
    }
    else
    {
        printf("\nplease enter the data=");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            head=p;
            p->next=head;
            temp=p;
        }
        else
        {
            temp->next=p;
            p->next=head;
            temp=p;
        }
    }
}
void insert_spc()
{
    node *m,*n;
    int x=2,pos,c=0;
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("\nmemory is full");
        return;
    }
    else
    {
        printf("\nplease enter the position=");
        scanf("%d",&pos);
        printf("\nplease enter the data=");
        scanf("%d",&p->data);
        m=head;
        while(m->next!=head)
        {
            c++;
            m=m->next;
        }
        if(pos==1)
            insert_beg;
        else if(pos==c+1)
            insert_end;
        else if((pos<1)||(pos>(c+1)))
            printf("\ninvlid position");
        else
        {
            m=head;
            while(x<=pos)
            {
                n=m;
                m=m->next;
                x++;
            }
            n->next=p;
            p->next=m;
        }
    }
}
int delete_beg()
{
    node *t,*m;
    int y;
    if(head==NULL)
    {
        printf("\nno data found");
        return;
    }
    else
    {
        if(head->next==head)
        {
            t=head;
            y=t->data;
            head=temp=NULL;
        }
        else
        {
            t=head;
            y=t->data;
            m=t->next;
            head=m;
            temp->next=head;
        }
    }
    return(y);
    free(t);
}
int delete_end()
{
    int y,c=0;
    node *t,*m;
    if(head==NULL)
    {
        printf("\nno element is present");
        return;
    }
    else
    {
        if(head->next==head)
        {
            t=head;
            y=t->data;
            head=temp=NULL;
        }
        else
        {
            t=head;
            while(t->next!=head)
            {
                m=t;
                t=t->next;
            }
            y=t->data;
            m->next=t->next;
        }
    }
    return(y);
    free(t);
}
int delete_spc()
{
    int y,pos,c=0,x=2;
    node *t,*m;
    if(head==NULL)
    {
        printf("\nno element is found");
        return;
    }
    else
    {
     printf("\nEnter the position=");
     scanf("%d",&pos);
     m=head;
     while(m->next!=head)
     {
         c++;
         m=m->next;
     }
     if(pos==1)
        delete_beg();
     else if(pos==c)
        delete_end();
     else if((pos<1)||(pos>c))
        printf("\ninvlid position");
    else
    {
        t=head;
        while(x<=pos)
        {
            m=t;
            t=t->next;
            x++;
        }
        y=t->data;
        m->next=t->next;
    }
    }
    return(y);
    free(t);
}
void display()
{
    node *i;
    for(i=head;i->next!=head;i=i->next)
        printf("%d-->",i->data);
    printf("%d-->",i->data);
}

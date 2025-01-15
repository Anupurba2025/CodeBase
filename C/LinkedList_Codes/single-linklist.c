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
void insert_end();
void insert_spc();
void display();
int del_beg();
int del_end();
int del_spc();
void main()
{
    int choice;
    do
    {
        printf("\n 1.insert_beg\n2.insert_end\n3.insert_spc\n4.display\n5,del_beg\n6.del_end\n7.del_spc\n8.exit");
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
                display();
                break;
            case 5:
                del_beg();
                break;
            case 6:
                del_end();
                break;
            case 7:
                del_spc();
                break;
            case 8:
                exit(0);
            default:
                printf("please enter the right choice:");
        }
    }
    while(choice!=7);
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
void insert_end()
{
    node *temp;
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("memory is full");
        return;
    }
    else
    {
        printf("\nenter the data=");
        scanf("%d",&p->data);
        if(head==NULL)
        {
            head=p;
            p->next=NULL;
        }
        else
        {
            temp=head;
            while(temp->next!=NULL)
            {
                temp=temp->next;
            }
            temp->next=p;
            p->next=NULL;
        }
    }
}
void insert_spc()
{
    int x=2,pos,c=0;
    node *m,*n;
    p=(node*)malloc(sizeof(node));
    if(p==NULL)
    {
        printf("memory is full");
        return;
    }
    else
    {
        printf("\nenter the positon:");
        scanf("%d",&pos);
        m=head;
        while(m!=NULL)
        {
            c++;
            m=m->next;
        }
        if(pos==c+1)
        {
            insert_end();
        }
        else if(pos==1)
        {
            insert_beg();
        }
        else if(pos>(c+1)||pos<1)
        {
            printf("impossible to insert");
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
            n->next=p;
        }
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
int del_beg()
{
    int y;
    node *t;
    if(head==NULL)
    {
        printf("ll is empty");
    }
    else if(head->next==NULL)
    {
        t=head;
        y=t->data;
        head=NULL;
    }
    else
    {
        t=head;
        y=t->data;
        head=t->next;
    }
    return(y);
    free(t);
}
int del_end()
{
    int z;
    node *s,*u;
    if(head==NULL)
    {
        printf("ll is empty");
    }
    else if(head->next==NULL)
    {
        s=head;
        z=s->data;
        head=NULL;
    }
    else
    {
        s=head;
        while(s->next!=NULL)
        {
            u=s;
            s=s->next;
        }
        z=s->data;
        u->next=NULL;
    }
    return(z);
    free(s);

}
int del_spc()
{
    node *m,*n;
    int pos,c=0,x=2,z;
    if(head==NULL)
    {
        printf("ll is empty");
    }
    else
    {
        printf("enter the positon=");
        scanf("%d",&pos);
        m=head;
        while(m->next!=NULL)
        {
            c++;
            m=m->next;
        }
        if(pos==1)
        {
            del_beg();
        }
        else if(pos==c)
        {
            del_end();
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
            z=m->data;
            n->next=m->next;
        }
        free(m);
        display();
        return(z);


    }
}

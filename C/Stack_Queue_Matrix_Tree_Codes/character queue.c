#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insert();
int delete();
void display();
char arr[50];
int front=-1,rear=-1,n;
void main()
{
    printf("Enter the size of the array=");
    scanf("%d",&n);
    int choice;
    do
    {
        printf("\n1.insert\n2.delete\n3.display\n4.exit");
        printf("\nEnter your choice=");
        scanf("%d",&choice);
        fflush(stdin);
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
            printf("\nEnter the right choice=");
        }
    }
    while(choice !=4);
    return;
}
void insert()
{
    char x;
    if(rear==n-1)
    {
        printf("queue is overflow");
        return;
    }
    else
    {
        printf("\nEnter the data=");
        scanf("%c",&x);
        if(front==-1)
        {
            front=rear=0;
            arr[rear]=x;
        }
        else
        {
            rear++;
            arr[rear]=x;
        }
    }
}
int delete()
{
    if(front==-1)
    {
        printf("queue is underflow");
        return;
    }
    else
    {
        if(front==rear)
        {
            printf("\n The element which is deleted is=%c",arr[front]);
            front=rear=-1;
        }
        else
        {

            printf("\n The element which is deleted is=%c",arr[front]);
            front++;
        }
    }
}
void display()
{
    int i;
    if(front==-1)
    {
        printf("no element");
    }
    else
    {
        for(i=front;i<=rear;i++)
        {
            printf("\nDisplay=%c",arr[i]);
        }
    }
}

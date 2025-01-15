#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insert();
int delete();
void display();
int n,front=-1,rear=-1,arr[89];
void main()
{
    int choice;
    printf("Enter the size of the array=");
    scanf("%d",&n);
    do
    {
        printf("\n1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
        printf("\nPlease enter your choice=");
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
            printf("Please enter the right choice");
        }
    }
    while(choice!=4);
    return;
}
void insert()
{
    int x;
    if(front==(rear+1)%n)
    {
        printf("\noverflow");
        return;
    }
    else
    {
        printf("\nEnter the element=");
        scanf("%d",&x);
        if(front==-1)
        {
            front=0;
            rear=0;
            arr[front]=x;
        }
        else
        {
            rear=(rear+1)%n;
            arr[rear]=x;
        }
    }
}
int delete()
{
    if(front==-1)
    {
        printf("\nUnderflow");
        return;
    }
    else
    {
        if(front==rear)
        {
             printf("\nthe element which was deleted that is=%d",arr[front]);
             front=rear=-1;
        }
        else
        {
          printf("\nthe element which was deleted that is=%d",arr[front]);
            front=(front+1)%n;
        }

    }
}
void display()
{
    int i;
    if(front==-1)
    {
        printf("\nno elements found");
        return;
    }
    else
    {
        for(i=front;i!=rear;i=(i+1)%n)
            printf("%d-->",arr[i]);
    }
            printf("%d-->",arr[i]);
}

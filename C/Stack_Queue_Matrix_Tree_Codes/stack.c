#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void push();
int pop();
void display();
int arr[50],top=-1,n;
void main()
{
    printf("Enter the size of the array=");
    scanf("%d",&n);
    int choice;
    do
    {
        printf("\n1.push\n2.pop\n3.display\n4.exit");
        printf("\nEnter your choice=");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
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
void push()
{
    int x;
    if(top==n-1)
    {
        printf("stack is full");
        return;
    }
    else
    {
        printf("Enter the data=");
        scanf("%d",&x);
        top++;
        arr[top]=x;
    }
}
int pop()
{
    if(top==-1)
    {
        printf("stack is underflow");
        return;
    }
    else
    {
        printf("\nthe element which is popped out is=%d",arr[top]);
        top--;
    }
}
void display()
{
    int i;
    if(top>=0)
    {
        for(i=top;i>=0;i--)
        {
            printf("\ndisplay=%d",arr[i]);
        }
    }
    else
    {
        printf("stack is empty");
    }
}

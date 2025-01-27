#include<stdio.h>
#include<conio.h>
int sum(int a,int b)
{
    int s;
    s=a+b;
}
void main()
{
    int a,b,s;
    printf("Enter the two numbers=");
    scanf("%d%d",&a,&b);
    s=sum(a,b);
    printf("Sum is=%d",s);
}

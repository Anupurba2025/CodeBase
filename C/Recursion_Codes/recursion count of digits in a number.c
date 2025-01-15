#include<stdio.h>
#include<conio.h>
int c=0;
int count(int n)
{
    if (n==0)
        return c;
    else
    {
        c=c+1;
        count(n/10);
    }
}
void main()
{
    int s,n;
    printf("Enter the number=");
    scanf("%d",&n);
    s=count(n);
    printf("No of digits in a number is=%d",s);
}

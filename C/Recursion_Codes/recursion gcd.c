#include<stdio.h>
#include<conio.h>
int i=1;
int gcd(int x,int y,int i)
{
    if(i<=x && i<=y)
    {
        if(x%i==0 && y%i==0)
        {
            printf("\n%d",i);
            gcd(x,y,i+1);
        }
    }
}
void main()
{
    int num1,num2,i,s;
    printf("Enter the two number=");
    scanf("%d%d",&num1,&num2);
    gcd(num1,num2,i=1);
}

#include<stdio.h>
#include<conio.h>
void main()
{
    int a,num;
    printf("Enter a number=");
    scanf("%d",&num);
    a=add_dig(0,num);
    printf("Reversed number of the given number is=%d",a);
}
int add_dig(int a,int num)
{
    if(num!=0)
    {
        a=a+(num%10);
        return(add_dig(a,num/10));
    }
    else
        return a;
}

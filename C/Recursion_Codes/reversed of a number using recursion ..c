#include<stdio.h>
#include<conio.h>
void main()
{
    int a,num;
    printf("Enter a number=");
    scanf("%d",&num);
    a=rev(0,num);
    printf("Reversed number of the given number is=%d",a);
}
int rev(int a,int num)
{
    if(num!=0)
    {
        a=a*10+(num%10);
        return(rev(a,num/10));
    }
    else
        return a;
}

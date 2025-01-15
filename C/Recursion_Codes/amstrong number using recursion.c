#include<stdio.h>
#include<conio.h>
void main()
{
    int a,num,c;
    printf("Enter the number=");
    scanf("%d",&num);
    c=ams(0,num);
    if(c==num)
    {
        printf("Its a amstrong number");
    }
    else
    {
        printf("Its not a amstrong number");
    }
}
int ams(int a,int num)
{
    int b,r;
    if(num!=0)
    {
        r=num%10;
        a=a+(r*r*r);
    return(ams(a,num/10));
    }
    else
        return a;
}

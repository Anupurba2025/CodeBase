#include<stdio.h>
#include<conio.h>
void main()
{
    int a;
    a=max(0,0);
    printf("The maximum number is= %d",a);

}
int max(int n,int a)
{
    int num;
    if(n<=10)
    {
        printf("Enter a number=");
        scanf("%d",&num);
        if(a<num)
            a=num;
        return(max(n+1,a));
    }
    else
        return a;

}

#include<stdio.h>
#include<conio.h>
//int n=50;
int natural_no(int x,int n)
{
    if(x<=n)
        printf("%d-->",x);
        natural_no(x+1,n);
}
void main()
{
    int n;
    printf("enter the range=");
    scanf("%d",&n);
    natural_no(1,n);
}

#include<stdio.h>
#include<conio.h>
void main()
{
    int n;
    printf("Enter the higher range=");
    scanf("%d",&n);
    div(1,n);
}
int div(int a,int n)
{
    if(a<=n)
    {
        if(a%5==0 && a%11==0)
            printf("\nThe numbers are=%d",a);
        return(div(a+1,n));
    }
}

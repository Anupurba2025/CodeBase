#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;
    printf("Enter the three numbers=");
    scanf("%d%d%d",&a,&b,&c);
    max(a,b,c);
}
int max(int a,int b,int c)
{
    if(a>b)
    {
        if(a>c)
        {
            printf("\n%d is greatest value",a);
        }

    }
    if(b>c)
        {
            printf("\n%d is greatest value",b);
        }
        else
        {
            printf("\n%d is greatest value",c);
        }
}

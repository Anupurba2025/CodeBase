#include<stdio.h>
#include<conio.h>
int fibnocci_series(int x)
{
    if(x==0)
        return 0;
    else if(x==1)
        return 1;
    else
        return(fibnocci_series(x-1)+fibnocci_series(x-2));
}
void main()
{
    int i,x;
    printf("Enter the no of terms=");
    scanf("%d",&x);
    printf("\nfibnocci series is-->");
    for(i=1;i<=x;i++)
        printf("%d-->",fibnocci_series(i));
}

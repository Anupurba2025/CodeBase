#include<stdio.h>
#include<conio.h>
int sum(int m)
{
    if(m==5)
        return 5;
    else
        return(m+sum(m+1));


}
void main()
{
    printf("sum is=%d",sum(1));
}

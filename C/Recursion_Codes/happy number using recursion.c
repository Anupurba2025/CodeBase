#include<stdio.h>
#include<conio.h>
void main()
{
    int result,num;
    printf("enter a number=");
    scanf("%d",&num);
    result=num;
    while(result!=1 && result!=4)
    {
        result=happy(result,0);
    }
    if(result==1)
        printf("Its a happy number");
    else if(result==4)
        printf("Its not a happy number");
}
int happy(int result,int sum)
{
    if(result!=0)
    {
        sum=sum+(result%10)*(result%10);
    return(happy((result/10),sum));
    }
    else
        return sum;
}

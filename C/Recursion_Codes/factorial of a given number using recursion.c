#include<stdio.h>
#include<conio.h>
void main()
{
    int num,a;
    printf("Enter a number=");
    scanf("%d",&num);
    printf("Factorial of the given number is=%d",fact(num));

}
int fact(int a)
{
    if(a==1)
        return 1;
    else
        return(a*fact(a-1));
}

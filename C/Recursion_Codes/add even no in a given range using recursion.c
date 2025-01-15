#include<stdio.h>
#include<conio.h>
void main()
{
    int n,a;
    printf("Enter the upper range=");
    scanf("%d",&n);
    a=add_even_no(1,n,0);
    printf("\nSum of the even numbers in the given range=%d",a);
}
int add_even_no(int a,int n,int sum)
{
    if(a<=n)
    {
        if(a%2==0)
        {
            sum=sum+a;
            //printf("\nSum of the even numbers in the given range=%d",sum);
        }
        return (add_even_no(a+1,n,sum));

    }
    else
        return sum;
}

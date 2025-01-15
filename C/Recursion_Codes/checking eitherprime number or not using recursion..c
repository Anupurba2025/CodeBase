#include<stdio.h>
#include<conio.h>
void main()
{
   int num;
   printf("Enter a number=");
   scanf("%d",&num);
   prime(1,num,0);
}
int prime(int a,int num,int c)
{
    if(a<=num)
    {
        if(num%a==0)
            c=c+1;
        return(prime((a+1),num,c));
    }
    if(c==2)
    {
       printf("Its a prime number");
    }
   else
    {
       printf("Its not a prime number");
    }
}

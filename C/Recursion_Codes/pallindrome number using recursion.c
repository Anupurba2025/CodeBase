#include<stdio.h>
#include<conio.h>
void main()
{
    int num,a;
    printf("Enter a number=");
    scanf("%d",&num);
    a=pallindrome(0,num);
    if(a==num)
    {
        printf("Its a pallindrome number");
    }
    else
    {
        printf("Its not a pallindrome number");
    }
}
int pallindrome(int rev,int num)
{
    if(num!=0)
    {
        rev=rev*10+(num%10);
    return(pallindrome(rev,num/10));
    }
    else
        return rev;
}

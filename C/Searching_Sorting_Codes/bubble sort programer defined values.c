#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,temp;
    int arr[5]={1,11,2,33,10};
    printf("\nElements before applying bubble sort=");
    for(i=0;i<5;i++)
        printf("-->%d",arr[i]);
    for(i=0;i<5;i++)
    {
        for(j=0;j<5-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("\nElements after applying bubble sort");
    for(i=0;i<5;i++)
        printf("-->%d",arr[i]);
}

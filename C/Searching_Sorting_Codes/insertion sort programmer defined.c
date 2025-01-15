#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,temp,n,k;
    int arr[5]={2,5,1,9,4};
    printf("\nElements before applying insertion sort");
    for(i=0;i<5;i++)
        printf("-->%d",arr[i]);
    for(i=1;i<5;i++)
    {
        for(j=0;j<i;j++)
        {
            if(arr[j]>arr[i])
            {
                temp=arr[j];
                arr[j]=arr[i];
                for(k=i;k>j;k--)
                    arr[k]=arr[k-1];
                arr[k+1]=temp;
            }
        }
    }
    printf("\nElements after applying insertion sort");
    for(i=0;i<5;i++)
        printf("-->%d",arr[i]);

}

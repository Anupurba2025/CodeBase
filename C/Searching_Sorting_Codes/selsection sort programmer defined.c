#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,temp,n;
    int arr[6]={1,23,21,11,4,2};
    printf("\nElements before applying selection sort");
    for(i=0;i<6;i++)
        printf("-->%d",arr[i]);
    for(i=0;i<6;i++)
    {
        for(j=i+1;j<6;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    printf("\nElements after applying selection sort");
    for(i=0;i<6;i++)
        printf("-->%d",arr[i]);
}

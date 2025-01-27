#include<stdio.h>
#include<conio.h>
void main()
{
    int arr[20],n,i,j,temp;
    printf("Enter the size of the array=");
    scanf("%d",&n);
    printf("\nEnter the elements=");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("\nElements before applying bubble sort");
    for(i=0;i<n;i++)
        printf("-->%d",arr[i]);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i;j++)
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
    for(i=0;i<n;i++)
        printf("-->%d",arr[i]);
}

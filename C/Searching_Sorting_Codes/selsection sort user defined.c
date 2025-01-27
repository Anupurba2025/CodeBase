#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,temp,n,arr[90];
    printf("Enter the size of the array=");
    scanf("%d",&n);
    printf("\nEnter the elements=");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("\nElements before applying selection sort");
    for(i=0;i<n;i++)
        printf("-->%d",arr[i]);
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
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
    for(i=0;i<n;i++)
        printf("-->%d",arr[i]);
}

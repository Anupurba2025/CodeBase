#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,temp,n,k,arr[90];
    printf("Enter the size of the array=");
    scanf("%d",&n);
    printf("\nEnter the elements=");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("\nElements before applying insertion sort");
    for(i=0;i<n;i++)
        printf("-->%d",arr[i]);
    for(i=1;i<n;i++)
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
    for(i=0;i<n;i++)
        printf("-->%d",arr[i]);

}

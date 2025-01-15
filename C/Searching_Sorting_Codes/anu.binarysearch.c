#include<stdio.h>
void main()
{
    int arr[70],n,i,search,c=0;
    printf("Enter the size of the array=");
    scanf("%d",&n);
    int lb=0,ub=n-1,mid;
    printf("\nenter the elements=");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("\nEnter the element you want to search=");
    scanf("%d",&search);
    while(lb<=ub)
    {
        mid=(lb+ub)/2;
        if(search>arr[mid])
        {
            lb=mid+1;
        }
        else if(search==arr[mid])
        {
            printf("%d is found at %d",search,mid);
            if(mid==0)
                printf("\nits a best case");
            else if(mid==n-1)
                printf("\nits a worst case");
            else
                printf("\nits a average case");
            return;
        }
        else
        {
            ub=mid-1;
        }
    }
}

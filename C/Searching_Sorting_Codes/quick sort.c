#include<stdio.h>
#include<conio.h>
void swap(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
    return;
}
int par(int arr[20],int lb,int ub)
{
    int pivot,start,end;
    pivot=arr[lb];
    start=lb;
    end=ub;
    while(start<end)
    {
        while(arr[start]<=pivot)
            start++;
        while(arr[end]>pivot)
            end--;
        if(start<end)
            swap(&arr[start],&arr[end]);
    }
    swap(&arr[lb],&arr[end]);
    return end;
}
quicksort(int arr[20],int lb,int ub)
{
    int p;
    if(lb<ub)
    {
      p=par(arr,lb,ub);
      quicksort(arr,lb,p-1);
      quicksort(arr,p+1,ub);
    }
    return;
}
void main()
{
    int n,i,arr[20];
    printf("Enter the size of the arr=");
    scanf("%d",&n);
    printf("\nEnter the elements=");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    quicksort(arr,0,n-1);
    printf("The sorted array is:\n");
    for(i=0;i<n;i++)
        printf(" %d ",arr[i]);
}


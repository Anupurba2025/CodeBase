#include<stdio.h>
#include<conio.h>
void main()
{
    int m,n,i,j,temp,arr2[40],k,l,o;
    int arr[5]={1,8,5,9,3};
    int arr1[5]={2,7,77,43,33};
    printf("\nElements before applying bubble sort");
    for(i=0;i<5;i++)
        printf("-->%d",arr[i]);
    for(i=0;i<=5;i++)
    {
        for(j=0;j<=5-i;j++)
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
    //.................................................
    //.................................................
    printf("\nElements before applying bubble sort in the second array");
    for(k=0;k<5;k++)
        printf("-->%d",arr1[k]);
    for(k=0;k<5;k++)
    {
        for(l=0;l<5-k;l++)
        {
            if(arr1[l]>arr1[l+1])
            {
                temp=arr1[l];
                arr1[l]=arr1[l+1];
                arr1[l+1]=temp;
            }
        }
    }
    printf("\nElements after applying bubble sort in the second array");
    for(k=0;k<5;k++)
        printf("-->%d",arr1[k]);
    //...............................................
    //...............................................
    for(i=j=k=0;k<m+n;k++)
    {
        if(arr[i]<arr1[j])
            arr2[k]=arr[i++];
        else if(arr1[j]<arr[i])
            arr2[k]=arr1[j++];
        else if(i==n-1)
            for(;j<m;j++)
                arr2[k++]=arr1[j];
        else if(j==m-1)
            for(;i<n;i++)
                arr2[k++]=arr[i];

    }
    printf("\nThe merged sorted array is: ");
    for(k=0;k<10;k++)
    {
        printf("%d-->",arr2[k]);
    }
}

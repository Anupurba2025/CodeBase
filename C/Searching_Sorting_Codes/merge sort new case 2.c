#include<stdio.h>
#include<conio.h>
void main()
{
    int arr1[90],arr2[90],i,j,n1,n2,temp,arr3[89],k;
    printf("Enter the size of the array 1=");
    scanf("%d",&n1);
    printf("\nenter the size of the array 2=");
    scanf("%d",&n2);
    printf("\nenter the elements in a first array=");
    for(i=0;i<n1;i++)
    {
        scanf("%d",&arr1[i]);
    }
    printf("\nEnter the elements in a second array=");
    for(i=0;i<n2;i++)
    {
        scanf("%d",&arr2[i]);
    }
    printf("\nEnter the elements before sorting=");
    for(i=0;i<n1;i++)
    {
        printf("%d->",arr1[i]);
    }
     printf("\nEnter the elements before sorting=");
    for(i=0;i<n2;i++)
    {
        printf("%d->",arr2[i]);
    }
    for(i=0;i<n1,i<n2;i++)
    {
        for(j=i+1;j<n1,j<n2;j++)
        {
            if(arr1[i]>arr1[j])
            {
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }
            if(arr2[i]>arr2[j])
            {
                temp=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]=temp;

            }
        }
    }
    printf("\nAfter sorting the first array=");
    for(i=0;i<n1;i++)
    {
        printf("%d->",arr1[i]);
    }
    printf("\nafter sorting the first array=");
    for(i=0;i<n2;i++)
    {
        printf("%d->",arr2[i]);
    }
    for(i=j=k=0;k<n1+n2;k++)
    {
        if(arr1[i]<arr2[j])
        {
            arr3[k]=arr1[i++];
        }
        else if(arr2[j]<arr1[i])
        {
            arr3[k]=arr2[j++];
        }
        else if(i==n1-1)
        {
            for(;j<n2;j++)
            {
                arr3[k++]=arr2[j];
            }
        }
        else if(j==n2-1)
        {
            for(;i<n1;i++)
            {
                arr3[k++]=arr1[i];
            }
        }
    }
    printf("\nafter merging two array=");
    for(k=0;k<n1+n2;k++)
    {
        printf("%d-->",arr3[k]);
    }
}

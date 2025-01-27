#include<stdio.h>
#include<conio.h>
void main()
{
    int arr1[90],arr2[90],i,j,k,m,n,o,temp;
    printf("Enter the size of the first array=");
    scanf("%d",&m);
    printf("\nEnter the elements in the first array=");
    for(i=0;i<m;i++)
        scanf("%d",&arr1[i]);
    printf("\nEnter the size of the second array=");
    scanf("%d",&n);
    printf("\nEnter the elements in the second array=");
    for(i=0;i<n;i++)
        scanf("%d",&arr1[i]);
    printf("\nenter the size of the third array=");
    scanf("%d",&o);
    printf("\nElements in the first array before sorting is=");
    for(i=0;i<m;i++)
        printf("-->%d",arr1[i]);
    for(i=0;i<m;i++)
    {
        for(j=0;j<m-i;j++)
        {
            if(arr1[j]>arr1[j+1])
            {
                temp=arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
            }
        }
    }
    printf("\nElements in the first array after sorting is=");
    for(i=0;i<m;i++)
        printf("-->%d",arr1[i]);
}

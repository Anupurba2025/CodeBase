#include<stdio.h>
#include<stdlib.h>
void main()
{
    int i,j,sum[10][10],mat1[10][10],mat2[10][10],m,n;
    printf("enter the number of rows and columns=");
    scanf("%d%d",&m,&n);
    printf("\nenter the elements of first matrix=");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat1[i][j]);
        }
    }
    printf("\nenter the elements of second matrix=");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat2[i][j]);
        }
    }
    printf("\nafter addition sum of two matrix is=\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            sum[i][j]=mat1[i][j]+mat2[i][j];
            printf("%d ",sum[i][j]);
        }
        printf("\n");
    }
}

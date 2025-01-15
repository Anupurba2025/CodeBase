#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define N 4
void main()
{
    int i,j,sum[N][N];
    int mat1[N][N]={{1,1,1,1},{2,2,2,2},{2,3,4,5},{8,9,22,34}};
    int mat2[N][N]={{1,1,1,1},{2,3,4,5},{4,5,6,7},{4,4,3,2}};
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            sum[i][j]=mat1[i][j]+mat2[i][j];
            printf("%d ",sum[i][j]);
        }
        printf("\n");
    }
}

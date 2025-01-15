#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define N 4
void main()
{
    int i,j,res[N][N];
    int mat1[N][N]={{1,1,1,1},
              {2,2,2,2},
              {3,3,3,3},
              {4,4,4,4}};
    int mat2[N][N]={{1,1,1,1},
              {2,2,2,2},
              {3,3,3,3},
              {4,4,4,4}};
    multiply(mat1,mat2,res);
    printf("the result is=\n");
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            printf("%d ",res[i][j]);
        }
        printf("\n");
    }
    return 0;
}
int multiply(int mat1[][N],int mat2[][N],int res[][N])
{
    int i,j,k;
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            res[i][j]=0;
            for(k=0;k<N;k++)
            {
                res[i][j]+=mat1[i][k]*mat2[k][j];
            }
        }
    }
}

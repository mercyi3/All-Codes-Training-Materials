#include<stdio.h>
int main()
{
    int array[2][2][3]; //2 matrix 2 row 3 columns 
    printf("\nEnter 6 number:");
    for(int i=0; i<2; i++) //2 row i=0, i=1, i=2
    {
        for(int j=0; j<2; j++) //3 column j=0, j=1, j=, j=3
        {
            for(int k=0; k<3; k++) //3 column k=0, k=1, k=2, k=3
            {
                scanf("%d", &array[i][j][k]); //10, 20, 30, 40, 50, 60
            }
        }
    }
    printf("Array Values are:\n\n");
    for(int i=0; i<2; i++)
    {
        for(int j=0; j<2; j++) 
        {
            for(int k=0; k<3; k++) //3 column k=0, k=1, k=2, k=3
            {
                printf("%d ", array[i][j][k]); 
            }
            printf("\n");
        }
        printf("\n");
    }
}
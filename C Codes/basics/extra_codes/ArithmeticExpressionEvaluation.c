// Program Name: Arithmetic Expression Evaluation
// Purpose: Calculate cricket strike rate

#include<stdio.h>

int main()
{
    float runs,balls;

    printf("Enter runs and balls: ");
    scanf("%f%f",&runs,&balls);

    printf("Strike Rate = %.2f",
            (runs/balls)*100);

    return 0;
}s
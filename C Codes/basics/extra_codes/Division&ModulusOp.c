// Program Name: Division and Modulus Operation
// Purpose: Distribute chocolates equally

#include<stdio.h>

int main()
{
    int chocolates,friends;

    printf("Enter chocolates and friends: ");
    scanf("%d%d",&chocolates,&friends);

    printf("Each Friend Gets = %d\n",
            chocolates/friends);

    printf("Remaining Chocolates = %d",
            chocolates%friends);

    return 0;
}
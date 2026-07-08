#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter 2 numbers:");
    scanf("%d %d", &a, &b); // 5, 7

    // &(and), | (OR), !(NOT) --> bitwise operator
    // && , ||  --> logical operator
                                //0 & 1 = 0
    printf("Bitwise AND: %d", ((a>b) & (a++>b)));
    printf("\na= %d", a); //6
    printf("\nLogical AND: %d", ((a>b) && (a++>b))); //0
    printf("\na= %d", a); //6

    printf("\nBitwise OR: %d", ((a<b) & (a++>b))); //1
    printf("\na= %d", a); //7
    printf("\nLogical OR: %d", ((a<b) && (a++>b))); //1
    printf("\na= %d", a); //7

    printf("\nBitwise NOT: %d", !(a==b));
}5
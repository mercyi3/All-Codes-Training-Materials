#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter 2 numbers:");
    scanf("%d %d", &a, &b); // 5, 7

    //ternary operator (?:)
    // (condition)? true : false;

    int max = (a>b)? a : b;
    printf("\nMaximun: %d", max);

    int min = (a<b)? a : b;
    printf("\nManimun: %d", min);

    char ans = (a==b)? 'Y' : 'N';
    printf("\nAnswer: %c", ans);

}
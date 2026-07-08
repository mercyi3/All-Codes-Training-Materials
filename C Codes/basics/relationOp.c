#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter 2 numbers:");
    scanf("%d %d", &a, &b); // 5, 7

    // ==, !=, >, <, >=, <= , answers = 0-false, 1-true

    printf("Equal? %d", (a==b)); //0
    printf("\nNot Equal? %d", (a!=b)); //1
    printf("\nGreater? %d", (a>b));//0
    printf("\nGreater Equal? %d", (a>=b)); //0
    printf("\nLesser? %d", (a<b)); //1
    printf("\nLesser Equal? %d", (a<=b)); //1

    return 0;
}
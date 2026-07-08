#include<stdio.h>

int main()
{
    int a; //unary operator ++(+1), --(-1)
    printf("Enter a numbers:");
    scanf("%d", &a); // 5

    printf("Post-Increment: %d", a++); //5 => 5+1=6
    printf("\na= %d", a); //6
    printf("\nPre-Increment: %d", ++a); //1+6= 7

    printf("\nPost-Decrement: %d", a--); //7 => 7-1=6
    printf("\na= %d", a); //6
    printf("\nPre-Decrement: %d", --a); //5

}
#include<stdio.h>

void main()
{
    int a,b;
    printf("Enter 2 numbers:");
    scanf("%d %d", &a, &b);

    // int c = (a+b);
    // printf("Add: %d\n", c);
    // printf("Sub: %d\n", (a-b));
    // printf("Mul: %d", (a*b));
    // printf("\nDiv: %d", (a/b));
    // printf("\nMod: %d", (a%b));

    a += b; // a= a+b
    printf("Add: %d\n", a); //a=8
    b -= a; // b= b-a 3-8
    printf("Sub: %d\n", b); //-5
    printf("Mul: %d", (a*=b)); //8*-5 a=-40
    printf("\nDiv: %d", (a/=b)); // -40/-5 a=8
    printf("\nMod: %d", (a%=b)); // 8%-5 a=3
}

// +-*/%
// += , -=, *=, /=, %=, = a=5;
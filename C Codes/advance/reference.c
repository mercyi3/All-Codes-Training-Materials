#include<stdio.h>

void add(int a, int b) //pass by value
{
    printf("add = %d", a+b);
}

void sub(int *ap, int *bp) //pass by reference
{
    printf("\nsub = %d", *ap-*bp);
}
int main()
{
    int a=16, b=8;

    add(a,b);
    sub(&a, &b);
    return 0;
}
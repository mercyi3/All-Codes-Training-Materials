#include<stdio.h>

union demo
{
    int a;
    char c;
}d;

int main()
{
    d.a = 5;
    d.c= 'a';

    printf("a = %d", d.a);
    printf("\nc = %c", d.c);

    return 0;
}
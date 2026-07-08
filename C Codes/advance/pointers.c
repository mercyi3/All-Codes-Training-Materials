#include<stdio.h>

int main()
{
    int a=10;
    int *p= &a;
    int **r = &p;

    printf("*p = %d", *p);
    printf("\np = %d", p);
    printf("\n **r = %d", **r);
    printf("\n r = %d", r);

    //int a=2.5;
    //float f= 4;
    //printf("%d %f", a, f);
    //return 0;
}
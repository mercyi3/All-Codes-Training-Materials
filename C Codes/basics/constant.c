//old code not working 
#include<stdio.h>

int main()
{
    const double pi = 3.145;
    int a=5;

    a=10;
    pi = 2.5;
    printf("\npi=%0.3f, a= %d", pi, a);

    return 0;
}


#include <stdio.h>

int main()
{
    const double pi = 3.145;
    int a = 5;

    a = 10;

    printf("\npi = %.3f, a = %d", pi, a);

    return 0;
}


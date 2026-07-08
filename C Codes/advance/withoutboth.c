#include<stdio.h>

void factorial( int a) //a=3 with arg without return
{
    long int fact = 1;
    for(int i=1; i<=a; i++) //3<=3
    {
        fact *= i; //2*3=6
    }
    printf("Factorial of %d is %ld", a, fact);
}
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n); //3

    factorial(n);
    return 0;
}

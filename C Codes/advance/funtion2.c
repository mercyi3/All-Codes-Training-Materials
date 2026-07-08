#include<stdio.h>

int add(int i, int j) //with arg with return
{ //i=3, j=6
    return i+j;
}
int mul(); //function declaration
int main()
{
    int a,b;
    printf("Enter 2 number:");
    scanf("%d %d", &a, &b); //3 6

    int c= add(a, b);
    printf("Addition: %d", c);
    printf("\nAdd: %d",add(5, 9));
    printf("\nMul: %d",mul());
    return 0;
}
//function definition
int mul() //with return without arg
{
    int a=25, b=8;
    return a*b;
}

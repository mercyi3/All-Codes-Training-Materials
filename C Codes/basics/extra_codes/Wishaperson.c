#include<stdio.h>
//2.With Arguments, No Return
void greet(char name[])
{
    printf("Hello %s, Have a great day!", name);
}

int main()
{
    greet("Mercy");
    return 0;
}
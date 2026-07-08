#include<stdio.h>
//3.No Arguments, Return Value
int luckyNumber()
{
    return 4;
}

int main()
{
    int num;

    num = luckyNumber();

    printf("Your lucky number is %d", num);

    return 0;
}
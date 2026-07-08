#include<stdio.h>
//4.Arguments, Return Value
int pizzaBill(int pizzaPrice, int quantity)
{
    return pizzaPrice * quantity;
}

int main()
{
    int total;

    total = pizzaBill(250, 3);

    printf("Total Bill = %d", total);

    return 0;
}
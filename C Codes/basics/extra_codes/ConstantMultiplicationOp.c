// Program Name: Constant Multiplication Operation
// Purpose: Multiply quantity with a fixed constant price

#include<stdio.h>

int main()
{
    const int PIZZA_PRICE = 199;
    int qty;

    printf("Enter pizza quantity: ");
    scanf("%d",&qty);

    printf("Total Amount = Rs.%d", qty * PIZZA_PRICE);

    return 0;
}
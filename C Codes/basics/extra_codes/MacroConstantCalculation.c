// Program Name: MacroConstantCalculation.c
// Purpose: Calculate ticket amount using #define

#include<stdio.h>

#define TICKET_PRICE 2500

int main()
{
    int tickets;

    printf("Enter number of tickets: ");
    scanf("%d",&tickets);

    printf("Total Cost = Rs.%d",
            tickets * TICKET_PRICE);

    return 0;
}
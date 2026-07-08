//Do-While
#include<stdio.h>

int main()
{
    int balance = 5000;
    int choice, amount;

    do
    {
        printf("\n1.Check Balance");
        printf("\n2.Deposit");
        printf("\n3.Withdraw");
        printf("\n4.Exit");

        printf("\nEnter Choice: ");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:
                printf("Balance = %d", balance);
                break;

            case 2:
                printf("Deposit Amount: ");
                scanf("%d",&amount);
                balance += amount;
                break;

            case 3:
                printf("Withdraw Amount: ");
                scanf("%d",&amount);

                if(amount <= balance)
                    balance -= amount;
                else
                    printf("Insufficient Balance");

                break;
        }

    }while(choice != 4);

    printf("Thank You!");

    return 0;
}
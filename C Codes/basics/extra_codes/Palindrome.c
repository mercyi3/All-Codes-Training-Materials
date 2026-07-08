//While Loop – Reverse a Number and Check Palindrome
#include<stdio.h>

int main()
{
    int num, temp, rev = 0, rem;

    printf("Enter a number: ");
    scanf("%d", &num);

    temp = num;

    while(num > 0)
    {
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }

    printf("Reversed Number = %d\n", rev);

    if(temp == rev)
        printf("Palindrome Number");
    else
        printf("Not a Palindrome");

    return 0;
}
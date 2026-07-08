#include<stdio.h>

int main()
{
    int secret = 77;
    int guess;
    int attempts = 0;

start:

    printf("Guess Number: ");
    scanf("%d", &guess);

    attempts++;

    while(guess != secret)
    {
        if(guess > secret)
            printf("Too High\n");
        else
            printf("Too Low\n");

        goto start;
    }

    printf("Correct!\n");
    printf("Attempts = %d", attempts);

    return 0;
}
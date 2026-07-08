#include<stdio.h>
int main()
{
    int option;
    printf("1. Dosa \n2.Idly \n3.Roti");
    printf("\nEnter your Option:");
    scanf("%d", &option);
    switch(option) {
        case 1:
            printf("Dosa 2pc - 50Rs");
            break;
        case 2:
            printf("Idly 2pc - 30Rs");
            break;
        case 3:
            printf("Roti 2pc - 40Rs");
            break;
        default:
            printf("Invalid Option... Select from menu!");
    }
    return 0;
}
#include<stdio.h>
#include<string.h> //library 

void strfun1(char n1[6], char n2[7])
{
    printf("\nLength = %d", strlen(n1)); //5
    printf("\nUppercase = %s", strupr(n2));//WORLD
    printf("\nLowercase = %s", strlwr(n1)); //hello

    char n3[7];
    printf("\nCopy = %s", strcpy(n3, n2));
    printf("\nCompare = %d", strcmp(n3, n2));
    printf("\n n1 = %s\n n2 = %s\n n3 = %s ", n1, n2, n3);
}

void strfun2(char n1[6], char n2[7])
{
    printf("Reverse = %s", strrev(n1));
    printf("\nConcat = %s\n", strcat(n1, n2));
    puts(n1);
    puts(n2);
}

int main()
{
    char n1[6], n2[7];
    printf("Enter 1st name: ");
    // scanf("%s %s", &n1, &n2); 
    gets(n1);
    printf("Enter 2nd name: ");
    gets(n2);

    // strfun1(n1, n2);
    strfun2(n1, n2);

    return 0;
}
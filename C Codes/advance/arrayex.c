#include<stdio.h>

int main()
{
    int a[] = {1,2,3};
    printf("%d", a[0]);

    int array[5]; 
    printf("\nEnter 5 number:");

    for(int i=0; i<5; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("Array Values are:");
    for(int i=0; i<5; i++)
    {
        printf("%d, ", array[i]);
    }
}
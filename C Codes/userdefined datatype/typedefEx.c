#include<stdio.h>

typedef int array[5];

int main()
{
    array a= {1,2,3,4,5};
    for(int i=0; i<5;i++)
    {
        printf("\nindex = a[%d], value = %d", i, a[i]);
    }

    return 0;
}
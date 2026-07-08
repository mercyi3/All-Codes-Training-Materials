#include<stdio.h>

int main()
{
    for(int i=1; i<=50; i++ )
    {
        if(i%2 ==0)
        {
            printf("\nEven = %d",i);
        }
        else {
            printf("\nOdd = %d",i);
        }
    }
    return 0;
}
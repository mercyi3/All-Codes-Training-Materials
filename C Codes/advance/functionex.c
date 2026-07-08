#include<stdio.h>

void demo() //without return without argument
{
    for(int i=0; i<=10; i++)
    {
        printf(" %d",i);
    }
}

// syntax:
//  returntype func-name(argument){ 
// return 0; }

int main()
{
    demo();
    return 0;
}

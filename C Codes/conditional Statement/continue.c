#include<stdio.h>

int main()
{
    int n=1;
    while(1) //true infinity
    {
        printf("\n%d", n); //1 2 3 4 5 6
        if(n==6) { //6 ==6
            break;
        }
        else {
            n++; //3
            continue;
        }
        printf("After loop");
    }
    return 0;
}
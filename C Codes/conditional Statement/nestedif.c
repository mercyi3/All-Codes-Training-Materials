#include<stdio.h>

int main()
{
    int a,b,c;
    printf("Enter 3 number:");
    scanf("%d %d %d", &a, &b, &c);

    if(a>b)  //100>200
    {
        if(a>c) { 
            printf("%d is Greater", a);
        }
        else {
            printf("%d is Greater", c);
        }
    }
    else if(b>c) { //200>300
        printf("%d is Greater", b);
    }
    else {
        printf("%d is Greater", c);
    }

}
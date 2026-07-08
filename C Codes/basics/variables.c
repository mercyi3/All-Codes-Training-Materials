#include<stdio.h>
extern int ex=10; //external var
static int s=23; //static variable
int g=3; //global var

void main()
{
     int a=10; //local variable
     int c=0; //automatic
    
    printf("%d %d %d %d %d", ex, s, g, a, c);

//     char arr[6] = {'H', 'E', 'L', 'L','O', '\0'};

//     printf("%s", arr);

}
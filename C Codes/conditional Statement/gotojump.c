#include<stdio.h>

int main()
{
    int p=0;
   do
    {
        printf("Hello World\n");
        if(p==10) //1 ==10
        {
            goto end; //goto label
        }
        p++; //2
    } while(1); //true

    end: //label:
        printf("Ending here...");
    return 0;
}
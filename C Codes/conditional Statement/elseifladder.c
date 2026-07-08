#include<stdio.h>

int main()
{
    int mark;
    printf("Enter Mark:");
    scanf("%d", &mark); //20

    if(mark>90) {
        printf("A Grade");
    }
    else if(mark > 80) {
        printf("B Grade");
    }
    else if(mark > 65){
        printf("C Grade");
    }
    else if(mark > 50) {
        printf("D Grade");
    }
    else if(mark > 35){
        printf("E Grade");
    }
    else{
        printf("Fail");
    }
    return 0;
}
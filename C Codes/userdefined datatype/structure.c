#include<stdio.h>
#include<string.h>

struct student
{
    int id;
    char name[10];
    char course[15];
    float fees;
}std;

int main()
{
    // struct student std;
    std.id = 101;
    strcpy(std.name, "Sahana");
    strcpy(std.course, "Java");
    std.fees = 15000;

    printf("ID: %d", std.id);
    printf("\nName: %s", std.name);
    printf("\nCourse: %s", std.course);
    printf("\nfees: %f", std.fees);
    return 0;
}

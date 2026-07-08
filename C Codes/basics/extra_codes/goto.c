#include<stdio.h>
#include<string.h>

int main()
{
    char user[20];
    char pass[20];

login:

    printf("Username: ");
    scanf("%s", user);

    printf("Password: ");
    scanf("%s", pass);

    if(strcmp(user,"admin") == 0 && strcmp(pass,"1234") == 0)
    {
        printf("Login Success");
    }
    else
    {
        printf("Wrong Credentials\n");
        goto login;
    }

    return 0;
}
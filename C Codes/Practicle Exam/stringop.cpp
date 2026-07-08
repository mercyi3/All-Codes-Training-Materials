#include <iostream.h>
#include <conio.h>
#include <string.h>

void main() {
    clrscr();
    char str1[50], str2[50], appendedStr[100];

    cout << "Enter first string: ";
    cin >> str1;

    cout << "Enter second string: ";
    cin >> str2;

    int cmp = strcmp(str1, str2);
    if (cmp == 0)
        cout << "Strings are equal.\n";
    else if (cmp > 0)
        cout << "First string is greater than second string.\n";
    else
        cout << "Second string is greater than first string.\n";

    cout << "Length of first string: " << strlen(str1) << "\n";
    cout << "Length of second string: " << strlen(str2) << "\n";

    strcpy(appendedStr, str1);  
    strcat(appendedStr, str2);  

    cout << "Appended String: " << appendedStr;

    getch(); 
}

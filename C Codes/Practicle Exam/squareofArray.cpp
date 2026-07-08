#include <iostream.h>
#include <conio.h>
// using namespace std;

void main() {
    clrscr(); 
    int arr[10], i;
    int *ptr;  

    cout << "Enter 10 integers: ";
    for (i = 0; i < 10; i++) {
        cin >> arr[i];
    }

    ptr = arr;  

    cout << "Squares of the elements: ";
    for (i = 0; i < 10; i++) {
        cout << (*ptr) * (*ptr) << " ";  
        ptr++;  
    }
    getch(); 
}

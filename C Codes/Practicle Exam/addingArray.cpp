#include <iostream.h>
#include <conio.h>
// using namespace std;
int main() {
    clrscr();
    int arr1[5], arr2[5], merged[10];
    int i, n = 5;  
    cout << "Enter 5 elements for first array: ";
    for (i = 0; i < n; i++) {
        cin >> arr1[i];
    }
    cout << "Enter 5 elements for second array: ";
    for (i = 0; i < n; i++) {
        cin >> arr2[i];
    }
    int j = 0;
    for (i = 0; i < n; i++) {
        merged[j++] = arr1[i];  //m[0]= 1, 2,
        merged[j++] = arr2[i];  //m[1]= 5, 6
    }
    cout << "Merged Array: ";
    for (i = 0; i < 2 * n; i++) {
        cout << merged[i] << " ";
    }

    getch(); 
}

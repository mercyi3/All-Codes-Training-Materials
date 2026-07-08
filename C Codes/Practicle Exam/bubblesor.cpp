#include <iostream>
#include <conio.h>
// using namespace std;

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) //1<7
    {
        for (j = 0; (j < n - i - 1); j++) //0<6
        {
            if (arr[j] > arr[j + 1]) // 10>3
            {
                temp = arr[j]; //14
                arr[j] = arr[j + 1]; //
                arr[j + 1] = temp;// 14
            }
        }
    }
}

int main() {
    // clrscr();
    int arr[9], n = 8, i, newNum;

    // Input 8 numbers
    cout << "Enter 8 numbers: ";
    for (i = 0; i < n; i++) {
        cin >> arr[i];
    }

    bubbleSort(arr, n);

    cout << "Sorted numbers: ";
    for (i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    cout << "\nEnter number to insert: ";
    cin >> newNum;

    arr[n] = newNum;
    cout << "Array after insertion: ";
    for (i = 0; i <= n; i++) {
        cout << arr[i] << " ";
    }

    // getch(); 
}

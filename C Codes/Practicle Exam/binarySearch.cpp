#include <iostream.h>
#include <conio.h>
// using namespace std;

int binarySearch(int arr[], int left, int right, int key) {
    while (left <= right) // 0<=9   6<=9 8<=9
    {
        int mid = (left + right) / 2; //9/2=4   6+9=15/2=7  8+9=17/2=8

        if (arr[mid] == key) //arr[8] == key
            return mid; //8
        if (arr[mid] < key)
            left = mid + 1; 
        else
            right = mid - 1; 
    }
    return -1; 
}

int main() {
    clrscr();
    int arr[10], key, result;

     cout<< "Enter 10 numbers: ";
     for (int i = 0; i < 10; i++) {
         cin>> arr[i];
     }

    cout<< "\nEnter number to search: ";
    cin>> key;

    result = binarySearch(arr, 0, 9, key); //8

    if (result != -1) //8!= -1
        cout<< "Number found at position " << result ;
    else
        cout<< "Number not found.";

    getch(); 
}

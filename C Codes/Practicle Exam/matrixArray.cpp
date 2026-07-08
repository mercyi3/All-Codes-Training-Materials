#include <iostream>
// #include <conio.h>
using namespace std;

int main() {
    // clrscr();
    int matrix[4][4], i, j, sum = 0;

    cout << "Enter elements of 4x4 matrix:\n";
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            cin>> matrix[i][j];
        }
    }
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            if (matrix[i][j] % 2 != 0) {
                sum += matrix[i][j];
            }
        }
    }
    cout<< "Sum of odd numbers in the matrix: " << sum;
    // getch(); 
}

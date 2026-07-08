#include <iostream>
// #include <conio.h>
using namespace std;

void reverseNumber(int *num, int *rev) { //123, 0
    int temp = *num;
    *rev = 0;
    while (temp > 0) { //1>0
        *rev = (*rev * 10) + (temp % 10); // 320+1= 321
        temp /= 10; //1
    }
}
int main() {
    // clrscr();
    int num, reversed;
    cout << "Enter a number: ";
    cin >> num; //123

    reverseNumber(&num, &reversed);
    cout << "Reversed Number: " << reversed;

    // getch(); 
}

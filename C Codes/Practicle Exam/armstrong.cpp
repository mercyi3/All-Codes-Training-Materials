#include <iostream.h>
#include <conio.h>
void main() {
    clrscr();  
    int num, temp, remainder, sum = 0;
    cout << "Enter a number: ";
    cin >> num;
    temp = num;
    for (int i=1;i<=3;i++) {
        remainder = temp % 10;
        sum += (remainder*remainder*remainder);
        temp /= 10;
    }
    if (sum == num) {
        cout << num << " is an Armstrong number.";
    } else {
        cout << num << " is not an Armstrong number.";
    }
    getch();
}

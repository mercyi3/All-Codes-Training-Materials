#include <iostream>
#include <fstream>
#include <conio.h>
#include <string.h>

using namespace std;

class BILL {
private:
    int bill_no;
    char customer_name[50];
    float total_amount;
    float net_amount;

public:
    void accept() {
        cout << "Enter Bill Number: ";
        cin >> bill_no;
        cin.ignore();

        cout << "Enter Customer Name: ";
        cin.getline(customer_name, 50);

        cout << "Enter Total Bill Amount: Rs.";
        cin >> total_amount;

        // Apply 10% discount if bill amount > ₹2000
        if (total_amount > 2000) {
            net_amount = total_amount - (total_amount * 0.10);
            cout << "Discount Applied: Rs." << total_amount * 0.10 << endl;
        } else {
            net_amount = total_amount;
        }
    }

    void display() {
        cout << "\nBill Details:\n";
        cout << "Bill Number: " << bill_no << endl;
        cout << "Customer Name: " << customer_name << endl;
        cout << "Total Amount: ₹" << total_amount << endl;
        cout << "Net Amount After Discount: ₹" << net_amount << endl;
    }

    void write_to_file() {
        ofstream fout("C:\\Roshni Trainer\\BILL.doc", ios::app);
        fout << "Bill Number: " << bill_no << "\n";
        fout << "Customer Name: " << customer_name << "\n";
        fout << "Total Amount: ₹" << total_amount << "\n";
        fout << "Net Amount After Discount: ₹" << net_amount << "\n\n";
        fout.close();
    }

    void read_from_file() {
        ifstream fin("C:\\Roshni Trainer\\BILL.doc");
        if (!fin) {
            cout << "Error! File not found.\n";
            return;
        }

        char ch;
        while (fin.get(ch)) {
            cout << ch;
        }

        fin.close();
    }
};

int main() {
    // clrscr();  // Clear screen for Turbo C++

    BILL bill;
    int choice;

    do {
        cout << "\nDepartmental Store Billing System\n";
        cout << "1. Generate New Bill\n";
        cout << "2. Display All Bills\n";
        cout << "3. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                bill.accept();
                bill.display();
                bill.write_to_file();
                cout << "\nBill saved successfully!\n";
                break;
            case 2:
                cout << "\nDisplaying all bills from file:\n";
                bill.read_from_file();
                break;
            case 3:
                cout << "Exiting program...\n";
                break;
            default:
                cout << "Invalid choice! Try again.\n";
        }
    } while (choice != 3);

    // getch();  // Pause screen for Turbo C++
    return 0;
}

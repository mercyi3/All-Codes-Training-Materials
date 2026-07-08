#include <iostream>
#include <fstream>
// #include <conio.h>
#include <string.h>

using namespace std;

class LIBRARY {
private:
    int book_id;
    char author_name[50];
    char issue_date[20];
    int fine;
    char return_date[20];

public:
    void accept() {
        cout << "Enter Book ID: ";
        cin >> book_id;
        cin.ignore();

        cout << "Enter Author Name: ";
        cin.getline(author_name, 50);

        cout << "Enter Issue Date (DD/MM/YYYY): ";
        cin.getline(issue_date, 20);

        cout << "Enter Fine Amount: ";
        cin >> fine;
        cin.ignore();

        cout << "Enter Return Date (DD/MM/YYYY): ";
        cin.getline(return_date, 20);
    }

    void display() {
        cout << "\nBook Details:\n";
        cout << "Book ID: " << book_id << endl;
        cout << "Author Name: " << author_name << endl;
        cout << "Issue Date: " << issue_date << endl;
        cout << "Fine: $" << fine << endl;
        cout << "Return Date: " << return_date << endl;
    }

    void write_to_file() {
        ofstream fout("LIB.DAT", ios::binary | ios::app);
        fout.write((char*)this, sizeof(*this));
        fout.close();
    }

    void read_from_file() {
        ifstream fin("LIB.DAT", ios::binary);
        if(!fin) {
            cout << "Error! File not found.\n";
            return;
        }
        while (fin.read((char*)this, sizeof(*this))) {
            display();
        }
        fin.close();
    }
};

int main() {
    // clrscr();  

    LIBRARY lib;
    int choice;

    do {
        cout << "\nLibrary Management System\n";
        cout << "1. Add Book Record\n";
        cout << "2. Display All Book Records\n";
        cout << "3. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                lib.accept();
                lib.write_to_file();
                cout << "\nBook record saved successfully!\n";
                break;
            case 2:
                cout << "\nDisplaying all book records:\n";
                lib.read_from_file();
                break;
            case 3:
                cout << "Exiting program...\n";
                break;
            default:
                cout << "Invalid choice! Try again.\n";
        }
    } while (choice != 3);

    // getch();  
    return 0;
}

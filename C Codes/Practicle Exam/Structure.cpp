#include <iostream.h>
#include <conio.h>
// using namespace std;

struct General_Date {
    int day; //01
    char month[20]; //05
    int year; //1995
};
struct Employment_Exchange {
    int application_no;
    char application_name[50];
    General_Date DOB; //01051995
    char Qualification[50];
    float Family_income;
};
int main() {
    Employment_Exchange applicant; 
    clrscr(); 
    cout << "Enter Application Number: ";
    cin >> applicant.application_no;
    cin.ignore();  
    cout << "Enter Applicant Name: ";
    cin.getline(applicant.application_name, 50);
    cout << "Enter Date of Birth (Day Month Year): ";
    cin >> applicant.DOB.day >> applicant.DOB.month >> applicant.DOB.year;
    cin.ignore();  
    cout << "Enter Qualification: ";
    cin.getline(applicant.Qualification, 50);
    cout << "Enter Family Income: ";
    cin >> applicant.Family_income;
    cout << "\nApplication Details:\n";
    cout << "Application No: " << applicant.application_no << endl;
    cout << "Applicant Name: " << applicant.application_name << endl;
    cout << "Date of Birth: " << applicant.DOB.day << " " << applicant.DOB.month << " " << applicant.DOB.year << endl;
    cout << "Qualification: " << applicant.Qualification << endl;
    cout << "Family Income: " << applicant.Family_income << endl;
    if (applicant.Family_income < 1000)
        cout << "\nEligible for Rozgar Yojna\n";
    else
        cout << "\nNot Eligible for Rozgar Yojna\n";

    getch();  
    return 0;
}

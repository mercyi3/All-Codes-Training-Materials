#include <iostream>
// #include <conio.h>
#include <string.h>
using namespace std;
class COURSE {
private:
    int course_id;
    char course_name[50];
    int duration;
    float fee;
public:
    void accept() {
        cout << "Enter Course ID: ";
        cin >> course_id;
        cin.ignore();

        cout << "Enter Course Name: ";
        cin.getline(course_name, 50);

        cout << "Enter Course Duration (in months): ";
        cin >> duration;

        cout << "Enter Course Fee: ";
        cin >> fee;
    }

    void display_course() {
        cout << "\nCourse Details:\n";
        cout << "Course ID: " << course_id << endl;
        cout << "Course Name: " << course_name << endl;
        cout << "Duration: " << duration << " months" << endl;
        cout << "Fee: $" << fee << endl;
    }
};

// Public Inheritance
class SR_SECONDARY : public COURSE {
private:
    char subject1[30], subject2[30], subject3[30];

public:
    void enter() {
        accept(); // Calling base class function

        cout << "Enter Subject 1: ";
        cin.ignore();
        cin.getline(subject1, 30);

        cout << "Enter Subject 2: ";
        cin.getline(subject2, 30);

        cout << "Enter Subject 3: ";
        cin.getline(subject3, 30);
    }

    void display() {
        display_course(); // Calling base class display function

        cout << "\nSenior Secondary Subjects:\n";
        cout << "Subject 1: " << subject1 << endl;
        cout << "Subject 2: " << subject2 << endl;
        cout << "Subject 3: " << subject3 << endl;
    }
};

// Protected Inheritance
class VOCATIONAL : protected SR_SECONDARY {
private:
    char voc_name[50];
    char requirement[100];
    int age;

public:
    void voc_accept() {
        enter(); // Calling SR_SECONDARY's function

        cout << "Enter Vocational Course Name: ";
        cin.ignore();
        cin.getline(voc_name, 50);

        cout << "Enter Requirements: ";
        cin.getline(requirement, 100);

        cout << "Enter Minimum Age Requirement: ";
        cin >> age;
    }

    void voc_display() {
        display(); // Calling SR_SECONDARY's display function

        cout << "\nVocational Course Details:\n";
        cout << "Vocational Course Name: " << voc_name << endl;
        cout << "Requirements: " << requirement << endl;
        cout << "Minimum Age Requirement: " << age << endl;
    }
};

int main() {
    // clrscr(); 

    VOCATIONAL voc_student;
    voc_student.voc_accept();
    voc_student.voc_display();

    // getch(); 
    return 0;
}

#include <iostream>
// #include <conio.h>
#include <string.h>
using namespace std;
class competition { 
private:
    int learner_id;
    char learner_name[50];
    char category;  // 'J' for junior, 'S' for senior
    char competition_name[50];
    int position;
    int points;
    void calculate() { 
        if (position == 1)
            points = 10;
        else if (position == 2)
            points = 7;
        else if (position == 3)
            points = 5;
        else
            points = 0;
    }
public:
    competition() { //same name as class name if we create a function without return typeconstructor  
        learner_id = 0;
        strcpy(learner_name, "WELCOME");
        category = 'J';  
        strcpy(competition_name, "WELCOME");
        position = 0;
        points = 0;
    }
    void Accept() {
        cout << "Enter Learner ID: ";
        cin >> learner_id;
        cin.ignore();
        cout << "Enter Learner Name: ";
        cin.getline(learner_name, 50);
        cout << "Enter Category (J for Junior, S for Senior): ";
        cin >> category;
        cin.ignore();
        cout << "Enter Competition Name: ";
        cin.getline(competition_name, 50);
        cout << "Enter Position: ";
        cin >> position;
        calculate();  
    }
    void Display() {
        cout << "\nCompetition Details:\n";
        cout << "Learner ID: " << learner_id << endl;
        cout << "Learner Name: " << learner_name << endl;
        cout << "Category: " << (category == 'J' ? "Junior" : "Senior") << endl;
        cout << "Competition Name: " << competition_name << endl;
        cout << "Position: " << position << endl;
        cout << "Points Earned: " << points << endl;
    }
};
int main() {
    clrscr();  
    competition comp; //calls the constructor
    comp.Accept();
    comp.Display();
    getch();  
    return 0;
}

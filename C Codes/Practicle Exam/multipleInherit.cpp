#include <iostream>
#include <conio.h>
#include <string.h>

using namespace std;

class FOUR_WHEELER {
private:
    int model_no;
    char colour[30];
    float price;
    float engine_cc;

public:
    void accept() {
        cout << "Enter Four-Wheeler Model No: ";
        cin >> model_no;
        cin.ignore();

        cout << "Enter Colour: ";
        cin.getline(colour, 30);

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Engine CC: ";
        cin >> engine_cc;
    }

    void display() {
        cout << "\nFour-Wheeler Details:\n";
        cout << "Model No: " << model_no << endl;
        cout << "Colour: " << colour << endl;
        cout << "Price: $" << price << endl;
        cout << "Engine CC: " << engine_cc << endl;
    }
};

class TWO_WHEELER {
private:
    char type[30];
    int HP;

public:
    void two_accept() {
        cout << "Enter Two-Wheeler Type (Bike/Scooter): ";
        cin.ignore();
        cin.getline(type, 30);
        cout << "Enter Horsepower (HP): ";
        cin >> HP;
    }
    void two_display() {
        cout << "\nTwo-Wheeler Details:\n";
        cout << "Type: " << type << endl;
        cout << "Horsepower: " << HP << " HP" << endl;
    }
};
class MOTOR_VEHICLE : protected FOUR_WHEELER, public TWO_WHEELER {
private:
    char HP[30];  
protected:
    char category[30]; 

public:
    void motor_accept() {
        accept();      
        two_accept();   

        cout << "Enter Vehicle Category (Luxury/Sports/Utility): ";
        cin.ignore();
        cin.getline(category, 30);

        cout << "Enter HP Category (Low/Medium/High): ";
        cin.getline(HP, 30);
    }

    void motor_display() {
        display();     
        two_display();  

        cout << "\nMotor Vehicle Category: " << category << endl;
        cout << "HP Category: " << HP << endl;
    }
};

int main() {
    // clrscr(); 

    MOTOR_VEHICLE mv;
    mv.motor_accept();
    mv.motor_display();

    // getch(); 
    return 0;
}

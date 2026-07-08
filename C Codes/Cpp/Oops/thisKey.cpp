#include<iostream>
using namespace std;

class abc {
    int id;

    public:
        void value(int id) {
            this->id = id;
        }
        void print() {
            cout<<"id = "<<id;
        }
};
int main() {
    abc a;
    a.value(101);
    a.print();
}
#include <iostream>
using namespace std;

class Animals
{
    public:
    void Animal()
    {
        cout << "Animals Class" << endl;
    }
};
class Dog
{
    public:
    void print()
    {
        cout << "Barking..." << endl;
    }
};
class Cat: public Animals, public Dog
{
    public:
    void printing()
    {
        cout << "Meowww..." << endl;
    }
};
int main()
{
    Cat c;
    c.Animal();
    c.print();
    c.printing();
}
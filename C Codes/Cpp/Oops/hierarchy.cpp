#include<iostream>
using namespace std;

class Livewire
{
    public:
    void programs()
        {
            cout<<"Development"<<endl;

        }
};
class Salem : public Livewire
{
    public:
    void branch1()
        {
            cout<<"Salem Branch Development"<<endl;

        }
};
class Bangalore : public Livewire
{
    public:
    void branch2()
        {
            cout<<"Bangalore Branch Development"<<endl;

        }
};
int main()
{
    Bangalore b;
    b.branch2();
    b.programs();

    Salem s;
    s.branch1();
    s.programs();
    return 0;
}
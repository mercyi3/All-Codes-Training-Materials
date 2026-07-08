#include<iostream>
using namespace std;

class Farm
{
    public:
    void fruits()
    {
        cout<<"Apple and Banana"<<endl;
    }
    void Vegtables()
    {
        cout<<"Carrot and potatoes"<<endl;
    }
};
class Fruit: public Farm
{
    public:
    void fruit()
    {
        cout<<"Apple 1kg - 100Rs"<<endl;
        cout<<"Banana 1seep - 60Rs"<<endl;
    }
};
class Veggies: public Farm
{
    public:
    void Potato()
    {
        cout<<"Potato 1kg - 30Rs"<<endl;
        cout<<"Carrot 1kg - 30Rs"<<endl;
    }
};
class Store: public Fruit , public Veggies
{
    public:
    void storage()
    {
        cout<<"Potato 10kg"<<"Carrot 10kg"<<endl;
        cout<<"Apple 10kg"<<"Banana 10seep"<<endl;
    }
};

int main()
{
    Store s;
    s.fruit();
    s.Potato();
    s.storage();
   
   Veggies v;
   v.fruits();
   v.Vegtables();

}
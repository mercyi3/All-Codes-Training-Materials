#include<iostream>
using namespace std;
int a=10;
int b=25;
void add()
{
    int c=a+b;
    cout<<"Addition: "<<c<<endl;
}
void sub(int a, short b)
{
    float c=a-b;
    cout<<"Subtraction: "<<c<<endl;
}
double mul()
{
   double c=a*b;
    return c;
}
double add(int a, int b)
{
    double c=a/b;
    return c;
}
int main()
{
    add();
    sub(5,8);
    cout<<"Multiplication: "<<mul()<<endl;
    // int z=div(5.84862, 2.54);
    //  cout<<"Division: "<<z<<endl;
    return 0;
}
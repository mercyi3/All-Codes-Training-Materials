#include<iostream>
using namespace std;

void CALCULATE(int &x, int &y)
{
    int sub= x-y;
    cout<<"Subtract: "<<sub<<endl;
    cout<<"Value of x = "<<x<<endl;
    cout<<"Address of x ="<<&x;
}

int main()
{   
    int a=10, b=5; 
    CALCULATE(a, b);
}
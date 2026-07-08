#include<iostream>
using namespace std;
int main()
{
    int mark;
    cout<<"Enter mark: ";
    cin>>mark;

    if(mark>90)
        cout<<"A Grade";
    else if(mark>80)
        cout<<"B Grade";
    else if(mark>60)
        cout<<"C Grade";
    else if(mark>40)
        cout<<"D Grade";
    else if(mark>30)
        cout<<"E Grade";
    else
        cout<<"Fail";
}
#include<iostream>
using namespace std;
 
int main()
{
    int a=5;
    cout<<"Post-Increment: "<< a++ <<endl; //5+1=6
    cout<<"a : "<< a <<endl;//6
    cout<<"Pre-Increment: "<< ++a <<endl;//1+6=7

    cout<<"Post-Decrement: "<< a-- <<endl;
    cout<<"a : "<< a <<endl;
    cout<<"Pre-Decrement: "<< --a <<endl;

}
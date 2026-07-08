#include<iostream>
using namespace std;
 
int main()
{
    int a=10, b=7;

    cout<< "Logical : "<< ((a>b) || (a<b++)) <<endl; //1
    cout<< "b = "<<b<<endl;
    cout<< "Bitwise : "<< ((a>b) | (a<b++)) <<endl; //1
    cout<< "b = "<<b<<endl;

    cout<<"Not : " <<!(a>b);

    cout<< "Left shift :" <<(a<<5) <<endl;
    cout<< "Right shift :" <<(b<<1) <<endl;


    // && --> any one is false answer false
    // || --> any one is true answer true
}
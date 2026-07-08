#include<iostream>
using namespace std;
 
int main()
{
    int a, b;
    cout<<"Enter 2 values:";
    cin>>a>>b;

    cout<<"Equal? " << (a==b) <<endl;
    cout<<"NotEqual? " << (a!=b) <<endl;
    cout<<"Greater? " << (a>b) <<endl;
    cout<<"Greater Equal? " << (a>=b) <<endl;
    cout<<"Lesser? " << (a<b) <<endl;
    cout<<"LesserEqual? " << (a<=b) <<endl;
}
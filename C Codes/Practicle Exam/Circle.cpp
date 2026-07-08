#include<iostream>
using namespace std;
int main()
{
    int r;
    const float pi=3.14;
    cout<<"Enter radius: ";
    cin>>r;

    float area = pi*r*r;
    cout<<"Area of Circle: "<<area<<endl;

    float pm = 2*pi*r;
    cout<<"Permeter of Circle: "<<pm;

}
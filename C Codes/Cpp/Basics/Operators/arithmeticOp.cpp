#include<iostream>
using namespace std;
 
int main()
{
    int a, b;
    cout<<"Enter 2 values:";
    cin>>a>>b;

    a+=b; //a = a+b; a=12
    cout<<"Additon: "<<a<<endl;
    a-=b;
    cout<<"Subtract: "<< a <<endl; // 12-7
    b*=a;
    cout<<"Multiply: "<< b <<endl; //7*5=35
    b/=a;
    cout<<"Divide: "<< b <<endl; // 35/5
    a%=b;
    cout<<"Modulus: "<<a <<endl; // 5 %7
}

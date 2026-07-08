#include<iostream>
using namespace std;
int main()
{
    int a=25,b=80,c=160;
    if(a>b) {
        if(a>c)  {
            cout<<"A is greater: "<<a<<endl;
        }
        else{
            cout<<"C is greater: "<<c<<endl;
        }
    }
    else if(b>c) {
        cout<<"B is Greater:"<<b<<endl;
    }
    else  {
        cout<<"C is Greater: "<<c<<endl;
    }
}
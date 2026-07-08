#include<iostream>
using namespace std;

union demo {
    int a;
    char c;
}d;

int main() {
    
    d.c= 'a';
    d.a = 15;

    cout<<"a = "<<d.a<<endl;
    cout<<"c = "<<d.c<<endl;

    return 0;
}
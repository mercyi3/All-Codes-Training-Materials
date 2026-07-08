#include<iostream>
using namespace std;

int main()
{
    string s1 = "hello";
    cout<<s1.length()<<endl;

    char ch[]={'c','+','+','\0'};
    // string s2 = string(ch);
    cout<<string(ch)<<endl;
}
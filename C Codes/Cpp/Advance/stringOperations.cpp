#include<iostream>
using namespace std;

int main()
{
    string s1="Hello", s2;
    cout<<"Enter a string: ";
    cin>>s2;

    cout<<"Length: "<<s1.length()<<endl;
    cout<<"Size: "<<s2.size()<<endl;
    cout<<"char at 4: "<<s1.at(4)<<endl;
    cout<<"Append: "<<s1.append(s2)<<endl;
    cout<<"Find o: "<<s1.find("o")<<endl;
    cout<<"Erase ell: "<<s1.erase(1,4)<<endl;
    cout<<"Replace H as Hello: "<<s1.replace(0,1,"Hello")<<endl;
    cout<<"Sub string: "<<s1.substr(3,4)<<endl;
    cout<<"Insert C++: "<<s1.insert(5," C++ ")<<endl;
    cout<<"Compare: "<<s1.compare(s2)<<endl;
}
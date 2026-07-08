#include<iostream>
using namespace std;
 
int main()
{
    int a, b;
    cout<<"Enter 2 values:";
    cin>>a>>b;

    int max = (a>b)?a:b;
    cout<<"Maximun : " << max <<endl;

    int min = (a<b)?a:b;
    cout<<"Minimun : " << min <<endl;

    string answer = (a>b)?"True":"False";
    cout<<"Answer : " << answer <<endl;
}
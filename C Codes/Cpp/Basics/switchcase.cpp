#include<iostream>
using namespace std;
int main()
{
    int n;
    do{
    cout<<"1.Idly \n 2.Dosa \n 3.Chapathi \n 4.finished"<<endl;
    cout<<"Enter your choice:"<<endl;
    cin>>n;
    switch(n)
    {
        case 1:
            cout<<"Idly - 10Rs";
            break;
        case 2:
            cout<<"Dosa - 25Rs";
            break;
        case 3:
            cout<<"Chapathi - 15Rs";
            break;
        case 4:
            cout<<"Thank you";
            exit(0);
        default:
         cout<<"Wrong choice";
    }
    }
    while(true);
}
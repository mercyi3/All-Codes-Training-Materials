#include<iostream>
using namespace std;
int main()
{
        for(int i = 10; i>=1;i--)
        {
        if(i==7)
        {
            goto sum;
        }
        cout<<i<<endl;
        }
        sum:
        cout<<"Its 7"<<endl;
    
    // int i=10;
    // do{
    //     cout<<i<<endl;
    //     i--;
    // }
    // while(i>=1);
}
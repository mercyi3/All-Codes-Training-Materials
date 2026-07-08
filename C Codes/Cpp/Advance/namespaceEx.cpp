#include<iostream>
using namespace std;
namespace print {
    void fun() {
        cout<<"This is namespace one"<<endl;
    }
}
namespace display {
    void fun() {
        cout<<"This is namespace two"<<endl;
    }
}

using namespace display;
int main() {
    print::fun();
    fun();
}
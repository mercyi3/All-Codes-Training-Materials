#include <iostream>
using namespace std;

int main () {
   int x = 50;
   int y = 4;
   double z = 0;
  cout<<"Before Error...."<<endl;
   try {
      if( y == 0 ) {
         throw "Division by zero condition!";
      }
      cout<< x/y <<endl;
    } 
    catch (const char* msg)  {
      cerr << msg << endl;
    }
    cout<<"After the Exception";
   return 0;
}

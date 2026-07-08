#include <iostream>
using namespace std;

int main () {
   
   double *p  = new double[3];  
   p[0] = 29494.99;
   p[1] = 4294.23;
   p[2] = 49124.19;  
   
   for(int i=0; i<3; i++) {
      cout << "Value of P["<<i<<"] : " << p[i] << endl;
   }
   delete p;     
   return 0;
}

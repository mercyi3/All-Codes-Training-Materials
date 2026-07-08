#include <iostream>
using namespace std;

// first name space
namespace a {
   void func() {
      cout << "Inside first_space" << endl;
   }
}
// second name space
namespace second_space {
   void func() {
      cout << "Inside second_space" << endl;
   }
}
using namespace second_space;
int main () {
   // Calls function from first name space.
   a::func();
   // Calls function from second name space.
   func();
   return 0;
}
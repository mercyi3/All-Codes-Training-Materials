#include <iostream>
using namespace std;

class Shape {
   protected:
      int width, height;

   public:
      Shape( int a, int b){
         width = a;
         height = b;
      }
      virtual void area() {
         cout << "Parent class area :" << width * height << endl;
      }
};
class Rectangle: public Shape {
   public:
      Rectangle( int a , int b):Shape(a, b) { }

      void area () {
         cout << "Rectangle class area :" << width * height << endl;
      }
};

class Triangle {
   int width;
   int height;
   public:
      Triangle( int a , int b )
      {
         width = a;
         height = b;
      }
      void area () {
         cout << "Triangle class area :" << (width * height)/2 << endl;
      }
};

int main() {
  
   Rectangle rec(10,7);
   rec.area();

   Triangle  tri(10,5);
   tri.area();

   Shape s(12,5);
   s.area();

   return 0;
}
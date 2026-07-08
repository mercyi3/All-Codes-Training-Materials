#include <iostream>
using namespace std;
typedef struct Books {
   string title;
   string author;
   string subject;
   int   book_id;
};
int main() {
   //struct Books Book1;
   Books Book1;  
   Book1.title = "Learn C++ Programming";
   Book1.author = "Chand Miyan";
   Book1.subject = "C++ Programming";
   Book1.book_id = 6495407;
   cout << "Book  title : " << Book1.title <<endl;
   cout << "Book  author : " << Book1.author <<endl;
   cout << "Book  subject : " << Book1.subject <<endl;
   cout << "Book  id : " << Book1.book_id <<endl;
   return 0;
}
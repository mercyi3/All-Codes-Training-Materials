#include <stdio.h>

#define message_for(a, b)  \
   printf(#a " is " #b " of all Languages!\n")

int main() {
   message_for(C, Mother);
}

#define MESSAGE "hi"
#if !defined (MESSAGE)
   #define MESSAGE "Have a Good Day!"
#endif

int main() {
   printf("Here is the message: %s\n", MESSAGE);  
   return 0;
}
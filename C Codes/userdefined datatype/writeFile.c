#include<stdio.h>

void main()
{
    FILE *fp;  
   fp = fopen("C:\\Roshni Trainer\\PPT\\PPT\\file.txt", "w");//opening file  
   fprintf(fp, "This is C program.\n");//writing data into file  
   fclose(fp);//closing file  

   fp = fopen("file.docx", "a");//opening file  
   fprintf(fp, "We are seeing file handling in C.\n");//writing data into file  
   fclose(fp);//closing file  
}
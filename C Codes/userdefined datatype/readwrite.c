#include<stdio.h>

void main()
{
    FILE *fp;
    char read[255], write[10];  
   fp = fopen("file.txt", "a+");//opening file  
   
   printf("Enter data to write in file: ");
   scanf("%s", &write);
   fprintf(fp, write);
   
//    while(fscanf(fp, "%s" , read) != EOF)
//    {
//         printf("%s", read);
//    }
   fclose(fp);//closing file  
 
}
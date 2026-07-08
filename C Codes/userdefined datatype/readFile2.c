#include<stdio.h>

void main()
{
    FILE *fp;  
    char buff[255];//creating char array to store data of file  
    fp = fopen("file.docx", "r");  
    while(fscanf(fp, "%s", buff)!=EOF){  
        printf("\n%s ", buff );  
    }  
    fclose(fp);  
}
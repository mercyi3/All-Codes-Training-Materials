#include<stdio.h>  
void main( )  
{  
    FILE *fp ;  
    char ch ;  
    fp = fopen("readFile2.c","r") ;  
    while ( 1 )  //always true
    {  
        ch = fgetc ( fp ) ;  
        if ( ch == EOF )  //End Of FIle
        break ;  
        printf("%c",ch) ;  
    }  
}
#include<stdio.h>  
#include<stdlib.h>  
int main()
{  
  int n,i,*ptr,sum=0;    
    printf("Enter number of elements: ");    
    scanf("%d",&n);    //5
    ptr=(int*)malloc(n*sizeof(int));  // 5*int(4 byte) 
    printf("Enter elements of array: ");    
    for(i=0;i<n;++i)    
    {    
        scanf("%d",ptr+i);  //1 2 3 4 5
        sum += *(ptr+i);    
    }    
    printf("Sum=%d",sum);    
    free(ptr);     
    return 0; 
}    So
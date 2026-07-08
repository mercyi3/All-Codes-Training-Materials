#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *p1, *p2, size;
    
    size = 4*sizeof(*p1);
    p1 = malloc(size);

    printf("%d bytes allocated for %p\n", size, p1);

    size = 7*sizeof(*p1);
    p2 = realloc(p1, size);

    printf("%d bytes allocated for %p\n", size, p2);

    return 0;
}
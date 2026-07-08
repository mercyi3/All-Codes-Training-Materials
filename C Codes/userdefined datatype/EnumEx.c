#include<stdio.h>

enum fruitshop
{
    mango = 100,
    apple = 200,
    orange = 150,
    berries
};
int main()
{
    enum fruitshop price;
    price = apple;
    printf("Price of Apple 1KG = %d", price);
    printf("\nPrice of Orange 1KG = %d", orange);
    printf("\nPrice of Mango 1KG = %d", mango);
    printf("\nPrice of Berries 1KG = %d", berries);

    return 0;
}
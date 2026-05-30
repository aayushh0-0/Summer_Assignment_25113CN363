#include<stdio.h>

int main()
{
    int n;
    int rev = 0;

    printf("Enter a Number to Reverse\n");
    scanf("%d", &n);

    while(n > 0)
    {
        int temp = n % 10;
        rev = rev * 10 + temp;
        n = n / 10;
    }

    printf("The Reverse is ~ %d", rev);

    return 0;
}
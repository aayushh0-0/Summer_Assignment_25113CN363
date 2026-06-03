#include<stdio.h>

int main()
{
    int a, b, temp;
    printf("Enter Two Numbers\n");
    scanf("%d%d", &a, &b);

    while(b != 0)
    {
        temp = b;
        b = a % b;
        a = temp;
    }

    printf("GCD = %d", a);

    return 0;
}
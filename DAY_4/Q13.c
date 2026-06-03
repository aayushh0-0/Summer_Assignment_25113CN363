#include <stdio.h>
int main()
{
    int n;
    printf("Enter the term till where you want the Fibonacci Series\n");
    scanf("%d", &n);
    int a = 0;
    int b = 1;
    int c = 0;
    printf("Fibonacci Series is ~ \n");
    for (int i = 1; i <= n; i++)
    {

        if (c <= 1)
        {
            printf("%d ", c);
        }
        else
        {
            printf("%d ", c);
        }
        a = b;
        b = c;
        c = a + b;
    }
}
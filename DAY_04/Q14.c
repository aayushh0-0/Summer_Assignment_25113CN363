#include <stdio.h>
int main()
{
    int n;
    printf("Enter the N'th term you want from Fibonacci Series\n");
    scanf("%d", &n);
    int a = 0;
    int b = 1;
    int c;
    for (int i = 1; i < n; i++)
    {
        a = b;
        b = c;
        c = a + b;
    }
    printf("The %d'th term from the Fibonacci Series is ~ %d",n, c);
}
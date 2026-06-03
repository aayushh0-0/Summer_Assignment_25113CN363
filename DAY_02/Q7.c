#include<stdio.h>
int main()
{
    int n;
    int prod=1;
    printf("Enter the Number to Find the Product of Digits\n");
    scanf("%d",&n);
    while(n>0)
    {
        prod*=(n%10);
        n/=10;
    }
    printf("The Product of Digits is ~ %d",prod);
}
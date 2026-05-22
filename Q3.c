#include<stdio.h>
int main()
{
    int n;
    int fact=1;
    printf("Enter the Number For Factorial\n");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        fact*=i;
    }
    printf("The Factorial of %d is ~ %d",n,fact);
}
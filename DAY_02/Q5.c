#include<stdio.h>
int main()
{
    int n;
    int sum=0;
    printf("Enter the Number to Find the Sum of Digits\n");
    scanf("%d",&n);                 //input
    while(n>0)
    {
        sum+=(n%10);
        n/=10;
    }
    printf("The sum of Digits is ~ %d",sum);
}
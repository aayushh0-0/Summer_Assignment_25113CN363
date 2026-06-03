#include<stdio.h>
int main()
{
    int n;
    int count=0;
    printf("Enter the Number to count Digits\n");
    scanf("%d",&n);
    while(n>0)
    {
        n/=10;
        count++;
    }
    printf("Number Of Digits is ~ %d ",count);
}
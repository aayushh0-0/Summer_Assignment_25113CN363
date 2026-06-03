#include<stdio.h>

int main()
{
    int n;
    int rev = 0;
    printf("Enter a Number to Reverse\n");
    scanf("%d", &n);
    int check=n;
    while(n > 0)
    {
        int temp = n % 10;
        rev = rev * 10 + temp;
        n = n / 10;
    }
    if(check==rev)
    {
        printf("The Number is a Palindrome Number");
    }
    else
    {
        printf("The Number is Not Palindrome Number");
    }
    return 0;
}
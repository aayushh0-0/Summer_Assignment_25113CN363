#include <stdio.h>
#include <math.h>
int main()
{
    int n;
    printf("Enter the number to check for Armstrong Number\n");
    scanf("%d", &n);
    int check = n;
    int dig = 0;
    int sum;
    while (n > 0)
    {
        n = n / 10;
        dig++;
    }
    n = check;
    while (n > 0)
    {
        int temp = n % 10;
        sum += pow(temp, dig);
        n = n / 10;
    }
    if (sum == check)
    {
        printf("%d is an Armstrong Number",check);
    }
    else
    {
        printf("%d is not an Armstrong Number",check);
    }
}
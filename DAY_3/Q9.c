#include <stdio.h>
int main()
{
    int flag=0;
    int n;
    printf("Enter the Number\n");
    scanf("%d", &n);
    if(n <= 1)
    {
        printf("Number is Not Prime Number");
        return 0;
    }
    for (int i = 2; i < (n / 2); i++)
    {
        if (n % i == 0)
        {
            flag = 1;
            break;
        }
    }
    if (flag == 1)
    {
        printf("Number is Not Prime Number");
    }
    else
    {
        printf("Number is Prime Number");
    }
}

#include <stdio.h>
#include <math.h>
int main()
{
    int n1, n2;
    printf("Enter the Starting Range to Check the Armstrong Number\n");
    scanf("%d", &n1);
    printf("Enter the Ending Range to Check the Armstrong Number\n");
    scanf("%d", &n2);
    for (int i = n1; i <= n2; i++)
    {
        int dig = 0;
        int sum = 0;
        int j = i, check = i;

        while (j > 0)
        {
            j = j / 10;
            dig++;
        }
        j = check;
        while (j > 0)
        {
            int temp = j % 10;
            sum += pow(temp, dig);
            j = j / 10;
        }
        if (sum == check)
        {
            printf("%d ", check);
        }
    }
}
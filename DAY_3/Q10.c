#include <stdio.h>
int main()
{
    int flag = 0;
    int r1, r2;
    printf("Enter the Starting Range\n");
    scanf("%d", &r1);
    printf("Enter the Ending Range\n");
    scanf("%d", &r2);
    while(r1<=r2)
    {
        flag=0;
        if(r1<=1)
        {
            r1++;
            continue;
        }
        for (int i = 2; i <=(r1/2); i++)
        {
            if ((r1 % i) == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag != 1)
        {
            printf("%d ", r1);
        }
        r1++;
    }
}
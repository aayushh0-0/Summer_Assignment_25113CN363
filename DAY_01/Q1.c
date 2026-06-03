#include <stdio.h>
int main()
{
    int n;
    int sum=0;
    printf("Enter the n'th Term till you want the Sum of Natural Number\n");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        sum+=i;
    }
    printf("Sum is ~ %d ",sum);
}
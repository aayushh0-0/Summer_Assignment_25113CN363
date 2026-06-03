#include <stdio.h>
int main()
{
    int a,b,x,y,temp;
    printf("Enter the Numbers\n");
    scanf("%d%d",&x,&y);
    a=x;
    b=y;
    while(b!=0)
    {
        temp=b;
        b=a%b;
        a=temp;
    }
    int gcd =a;
    int lcm=(x*y)/gcd;
    printf("LCM is ~ %d",lcm);
}
#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int n;
    int dec=0;
    cout<<"Enter a Binary Number\n";
    cin>>n;
    int i=0;
    while(n>0)
    {
        int temp=n%10;
        dec+=(temp*pow(2,i));
        n=n/10;
        i++;
    }
    cout<<"The Decimal Number is ~ "<<dec;
}
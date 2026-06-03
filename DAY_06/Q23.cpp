#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int n;
    int count=0;
    int bin=0;
    cout<<"Enter a Number to Count Set bits ~\n";
    cin>>n;
    int i=0;
    while(n>0)
    {
        int temp=n%2;

        if(temp==1)
        {
            count++;
        }
        bin=bin +(temp*pow(10,i));
        i++;
        n=n/2;
    }
    cout<<"The Binary Equivalent is ~ "<<bin<<"\n";
    cout<<"The Set bit Count is ~ "<<count;

}
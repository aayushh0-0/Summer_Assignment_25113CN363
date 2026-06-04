#include<iostream>
using namespace std;
int checkPrime(int n);
int main()
{
    int n;
    cout<<"Enter the Number to be Checked for Prime\n";
    cin>>n;
    if(checkPrime(n))   
    {
        cout<<"The Number is Prime";
    }
    else
    {
        cout<<"The Number is Not Prime";
    }
}
int checkPrime(int n)
{
    int flag=0;
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
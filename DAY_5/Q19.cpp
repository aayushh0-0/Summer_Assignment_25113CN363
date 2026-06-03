#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter a Number\n";
    cin>>n;
    cout<<"Factors of the Number are ~ \n";
    for(int i=1;i<=(n/2);i++)
    {
        if(n%i==0)
        {
            cout<<i<<" ";
        }
    }
    cout<<n;
}
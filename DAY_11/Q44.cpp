#include<iostream>
using namespace std;
int fact(int n);
int main()
{
    int n;
    cout<<"Enter the Number to Find the Factorial\n";
    cin>>n;
    cout<<"The Factorial of "<<n<<" is "<<fact(n);
}

int fact(int n)
{
    int mult=1;
    for(int i=1;i<=n;i++)
    {
        mult*=i;
    }
    return mult;
}
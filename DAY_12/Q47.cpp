#include <iostream>
using namespace std;
void fibo(int n);
int main()
{
    int n;
    cout << "Enter the Nth Term\n";
    cin >> n;
    fibo(n);
}

void fibo(int n)
{
    cout<<"The fibonacci Series is ~ \n";
    int a = 0;
    int b = 1;
    cout<<"0 1 ";
    for(int i=3;i<=n;i++)
    {
        int c=a+b;
        cout<<c<<" ";
        a=b;
        b=c;
    }
}
#include<iostream>
using namespace std;
int perf(int n);
int main()
{
    int n;
    cout<<"Enter a Number\n";
    cin>>n;
    perf(n);
}

int perf(int n)
{
    int mult=1;
    for(int i=1;i<=(n/2);i++)
    {
        if(n%i==0)
        {
            mult*=i;
        }
    }
    if(n==mult)
    {
        cout<<n<<" ~ is a Perfect Number\n ";
    }
    else
    {
        cout<<n<<" ~ is not a Perfect Number\n";
    }
    return 0;
}


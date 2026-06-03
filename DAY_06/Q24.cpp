#include<iostream>
using namespace std;
int main()
{
    int x,n;
    int pow=1;
    cout<<"Enter the Number\n";
    cin>>x;
    cout<<"Enter the Power\n";
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        pow*=x;
    }
    cout<<"The "<<x<<" to the power "<<n<<" is ~ "<< pow;
}
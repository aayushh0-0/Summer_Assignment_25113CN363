#include<iostream>
#include<math.h>
using namespace std;
bool armstrong(int n);
int main()
{
    int n;
    cout<<"Enter a Number\n";
    cin>>n;
    if(armstrong(n))
    {
        cout<<n<<" ~ is an Armstrong Number\n";
    }
    else
    {
        cout<<n<<" ~ is not an Armstrong Number\n";
    }

}

bool armstrong(int n)
{
    int check=n;
    int count=0;
    int sum=0;
    bool isarm=false;
    while(n>0)
    {
        count++;
        n/=10;
    }
    n=check;
    while(n>0)
    {
        int temp=n%10;
        sum+=pow(temp,count);
        n/=10;
    }
    if(sum==check)
    {
        isarm=true;
    }
    return isarm;
}

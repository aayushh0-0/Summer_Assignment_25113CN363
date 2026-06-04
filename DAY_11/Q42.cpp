#include<iostream>
using namespace std;
int max(int a,int b);
int main()
{
    int a,b;
    cout<<"Enter Two Numbers\n";
    cin>>a>>b;
    cout<<"The Maximum Value is ~ "<<max(a,b);
}

int max(int a,int b)
{
    if(a>b)
    {
        return a;
    }
    else 
    {
        return b;
    }
}
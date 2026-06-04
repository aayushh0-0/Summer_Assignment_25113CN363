#include<iostream>
using namespace std;
void sum(int a,int b);
int main()
{
    int a,b;
    cout<<"Enter Two Numbers\n";
    cin>>a>>b;
    sum(a,b);
}

void sum(int a,int b)
{
    int sum=a+b;
    cout<<"The Sum is ~ "<<sum;
}
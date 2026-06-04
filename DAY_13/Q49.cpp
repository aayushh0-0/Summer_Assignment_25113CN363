#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the Size of Array\n";
    cin>>n;
    int a[n];
    cout<<"Enter the Elements in Array\n";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"The Array is ~ \n";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}
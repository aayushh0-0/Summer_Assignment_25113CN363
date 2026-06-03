#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the Number of Rows";
    cin>>n;
    for(int i=65;i<(65+n);i++)
    {
        for(int j=65;j<=i;j++)
        {
            cout<<(char)j<<" ";
        }
        cout<<endl;
    }
}
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the Number of Rows\n";
    cin>>n;
    int k=1;
    for(int i=1;i<=n;i++)
    {
        k=1;
        for(int j=n;j>=i;j--)
        {
            cout<<k<<" ";
            k++;
        }
        cout<<endl;
    }
}
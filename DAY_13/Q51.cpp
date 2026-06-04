#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the Size of Array\n";
    cin>>n;
    int a[n];
    int max=0;
    int min=a[0];
    cout<<"Enter the Elements in Array\n";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"The Array is ~ \n";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
        if(a[i]>max)
        {
            max=a[i];
        }
        if(a[i]<min)
        {
            min=a[i];
        }
    }

    cout<<endl<<"The Maximum Element of Array is ~ "<<max<<endl;
    cout<<"The Minimum Element of Array is ~ "<<min;
    

}
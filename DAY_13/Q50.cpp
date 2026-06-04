#include <iostream>
using namespace std;
int main()
{
    int n;
    int sum = 0;
    cout << "Enter the Size of Array\n";
    cin >> n;
    int a[n];
    cout << "Enter the Elements in Array\n";
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        sum += a[i];
    }
    cout << "The Sum of Array is ~ "<<sum<<endl;
    cout<<"The Average of Array is ~ "<<(sum/n);
}
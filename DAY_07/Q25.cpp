#include <iostream>
using namespace std;
int fact(int n);
int main()
{
    int n;
    cout << "Enter the Number\n";
    cin >> n;
    cout<<"The Factorial is ~ "<<fact(n);
}
int fact(int n)
{
    if (n == 0)
    {
        return 1;
    }
    else
    {
        return n*fact(n-1);
    }
}
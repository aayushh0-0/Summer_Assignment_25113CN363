#include <iostream>
using namespace std;
int main()
{
    int n;
    int sum = 0;
    cout << "Enter a Number to Check\n";
    cin >> n;
    for (int i = 1; i <= (n / 2); i++)
    {
        if (n % i == 0)
        {
            sum += i;
        }
    }
    if (sum == n)
    {
        cout << n << " is Perfect Number";
    }
    else
    {
        cout << n << " is not Perfect Number";
    }
}

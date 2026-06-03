#include <iostream>
using namespace std;

int sod(int n)
{
    if (n == 0)
    {
        return 0;
    }

    return (n % 10) + sod(n / 10);
}

int main()
{
    int n;

    cout << "Enter a Number to Get the Sum of Digits\n";
    cin >> n;

    cout << "Sum of Digits = " << sod(n);

    return 0;
}
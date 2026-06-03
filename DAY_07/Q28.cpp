#include <iostream>
using namespace std;

int rev(int n, int r)
{
    if (n == 0)
    {
        return r;
    }

    return rev(n / 10, r * 10 + n % 10);
}

int main()
{
    int n;

    cout << "Enter a Number to Reverse\n";
    cin >> n;

    cout << "Reversed Number is ~ " << rev(n, 0);

    return 0;
}
#include <iostream>
using namespace std;

int main()
{
    int n;

    cout << "Enter the Size of Pyramid\n";
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        for (int s = 0; s < n - i - 1; s++)
        {
            cout << " ";
        }

        for (char ch = 'A'; ch <= 'A' + i; ch++)
        {
            cout << ch;
        }

        for (char ch = 'A' + i - 1; ch >= 'A'; ch--)
        {
            cout << ch;
        }

        cout << endl;
    }

    return 0;
}
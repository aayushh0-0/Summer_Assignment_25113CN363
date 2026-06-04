#include <iostream>
using namespace std;
bool palin(int n);
int main()
{
    int n;
    cout << "Enter the Number to be Checked\n";
    cin >> n;
    if (palin(n))
    {
        cout << n << " ~ is a Palindrome Number ";
    }
    else
    {
        cout << n << " ~ is a not Palindrome Number ";
    }
}
bool palin(int n)
{
    int check = n;
    int rev = 0;
    bool ispalin = false;
    while (n > 0)
    {
        int temp = n % 10;
        rev = temp + rev * 10;
        n = n / 10;
    }
    if (check == rev)
    {
        ispalin = true;
    }
    return ispalin;
}
#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int n;
    int bin = 0;
    int i = 0;
    cout << "Enter a Number for the Conversion\n";
    cin >> n;
    while (n > 0)
    {
        int temp = n % 2;
        bin = bin + temp * pow(10, i);
        i++;
        n = n / 2;
    }
    cout << "The Decimal to Binary Conversion is ~ " << bin;
}
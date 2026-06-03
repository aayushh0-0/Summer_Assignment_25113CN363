#include <iostream>
using namespace std;
int main()
{
    int n;
    int sum = 0;
    int fact = 1;
    cout << "Enter a Number\n";
    cin >> n;
    int check = n;
    while (n > 0)
    {
        fact = 1;
        int temp = n % 10;
        for (int i = 1; i <= temp; i++)
        {
            fact *= i;
        }
        sum += fact;
        n=n/10;
    }
    if (check == sum)
    {
        cout << check << " is a Strong Number";
    }
    else
    {
        cout << check << " is not a Strong Number";
    }
}
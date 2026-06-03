#include <iostream>
using namespace std;

int main()
{
    int n;
    int maxfact = 0;
    cout << "Enter a Number to find Largest Prime Factor\n";
    cin >> n;
    for (int i = 2; i <= n; i++)
    {
        if (n % i == 0) // checking for the factor
        {
            bool prime = true;

            for (int j = 2; j < i; j++)
            {
                if (i % j == 0) // checking for the prime factor here
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                maxfact = i;
            }
        }
    }
    cout << "Max Prime Factor is ~ " << maxfact;
}
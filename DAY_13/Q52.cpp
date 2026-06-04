#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter the Size of Array\n";
    cin >> n;
    int a[n];
    int counteve = 0;
    int countodd = 0;
    cout << "Enter the Elements in Array\n";
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] % 2 == 0)
        {
            counteve++;
        }
        else
        {
            countodd++;
        }
    }
    cout << endl << "The Number of Even Elements Are ~ " << counteve << endl;
    cout << "The Number of Odd Elements are ~ " << countodd;
}
#include <stdio.h>
#include "BinarySearch.h"

int main () {
    int a[] = {0,1,2,3,4,5,6,7,8,9};
    int index = binarySearch(a, 0, 9, 7);
    printf("%i", index);

    return 0;
}

int binarySearch (int* A, int first, int last, int key) {
    if (last < first)
        return -1;
    else {
        int mid = (last + first) / 2;

        if (A[mid] == key)
            return mid;

        int x, y;
        x = binarySearch(A, first, mid - 1, key);
        y = binarySearch(A, mid + 1, last, key);

        if (x == -1 && y == -1)
            return -1;
        else if (x == -1 && y != -1)
            return y;
        else
            return x;
    }
}

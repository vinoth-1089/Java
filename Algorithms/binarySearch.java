package Algorithms;


class binarySearch{
    public static void main(String[] args) {
    int[] a = {1, 3, 5, 7, 8, 11};
    int e = 11;
    int left = 0, right = a.length - 1;
    int result = -1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (a[mid] == e) {
            result = mid;
            break;
        } else if (a[mid] < e) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    if (result == -1) {
        System.out.println("not found");
    } else {
        System.out.println("Element found at: " + result);
    }
}
}



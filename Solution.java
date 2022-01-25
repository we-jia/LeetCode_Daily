public class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                break;
            }
        }

        int j = arr.length - 1;
        for (; j > 0; j--) {
            if (arr[j] >= arr[j - 1]) {
                break;
            }
        }

        return i != 0 && j != arr.length - 1 && i == j;
    }
}

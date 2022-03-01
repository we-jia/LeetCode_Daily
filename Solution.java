class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i < arr.length; ++i) {
            arr[i] = arr[i / 2] + i % 2;
        }
        return arr;
    }
}

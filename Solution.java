class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        if (sum % 2 == 1) {
            return false;
        }

        int half = sum / 2;
        boolean[] arr = new boolean[half + 1];
        arr[0] = true;
        for (int i : nums) {
            for (int j = half; j >= i; --j) {
                arr[j] = arr[j] || arr[j - i];
            }
        }
        return arr[half];
    }
}

class Solution {
    public static void main(String[] args) {
        new Solution().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});
    }


    public int singleNonDuplicate(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int mid = (right + left) / 2;

        while (mid != 0 && mid != nums.length - 1) {
            if (nums[mid - 1] == nums[mid]) {
                if ((mid - 1 - left) % 2 == 0) {
                    left = mid + 1;
                } else {
                    right = mid - 2;
                }
            } else if (nums[mid + 1] == nums[mid]) {
                if ((right - mid - 1) % 2 == 0) {
                    right = mid - 1;
                } else {
                    left = mid + 2;
                }
            } else {
                return nums[mid];
            }
            mid = (right + left) / 2;
        }
        return nums[mid];
    }
}

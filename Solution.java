class Solution {
    public int maxProductDifference(int[] nums) {
        int largest = 0;
        int scdLargest = 0;
        int smallest = Integer.MAX_VALUE;
        int scdSmallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > scdLargest) {
                scdLargest = i;
                if (scdLargest > largest) {
                    int tmp = largest;
                    largest = scdLargest;
                    scdLargest = tmp;
                }
            }

            if (i < scdSmallest) {
                scdSmallest = i;
                if (scdSmallest < smallest) {
                    int tmp = smallest;
                    smallest = scdSmallest;
                    scdSmallest = tmp;
                }
            }
        }

        return largest * scdLargest - smallest * scdSmallest;
    }
}

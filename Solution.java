class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] > arr2[0] ? 1 : -1);
        int val = intervals[0][1];
        int count = 0;

        for (int[] arr : intervals) {
            if (arr[1] <= val) {
                count++;
            } else {
                val = arr[1];
            }
        }

        return intervals.length - count + 1;
    }
}

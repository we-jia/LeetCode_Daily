class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    count++;
                }
                int tmp = Math.abs(anInt);
                min = Math.min(min, tmp);
                sum += tmp;
            }
        }

        return count % 2 == 1 ? sum - min - min : sum;
    }
}

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] miles = this.findMaxAndMin(trips);
        int westest = miles[0];
        int eastest = miles[1];

        int[] arr = new int[eastest - westest + 1];
        for (int[] trip : trips) {
            arr[trip[1] - westest] += trip[0];
            arr[trip[2] - westest] -= trip[0];
        }

        int sum = 0;
        for(int i : arr){
            sum += i;
            if(sum > capacity){
                return false;
            }
        }

        return true;
    }

    private int[] findMaxAndMin(int[][] trips) {
        int[] miles = new int[2];
        miles[0] = Integer.MAX_VALUE;
        miles[1] = Integer.MIN_VALUE;

        for (int[] trip : trips) {
            miles[0] = Math.min(miles[0], trip[1]);
            miles[1] = Math.max(miles[1], trip[2]);
        }

        return miles;
    }
}

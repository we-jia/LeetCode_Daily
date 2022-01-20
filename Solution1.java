public class Solution1 {
    public int minEatingSpeed(int[] piles, int h) {
        int costHour = 0;

        int left = 1;
        int right = 0;
        long sum = 0;
        for (int i : piles) {
            right = Math.max(right, i);
            sum += i;
        }
        if(h > sum){
            return 1;
        }

        int mid = left + (right - left) / 2;

        while (right - left > 1) {
            costHour = 0;
            for (int i : piles) {
                costHour += Math.ceil((double) i / mid);
                if (costHour > h) {
                    left = mid;
                    mid = left + (right - left) / 2;
                    break;
                }
            }
            if (costHour <= h) {
                right = mid;
                mid = left + (right - left) / 2;
            }
        }

        return right;
    }
}

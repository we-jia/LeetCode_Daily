public class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxDist = 0;
        int beforeIsFilled = 0;

        // 開頭的距離
        int index = 0;
        for (; index < seats.length; index++) {
            if (seats[index] == 1) {
                maxDist = index * 2;
                beforeIsFilled = index;
                index++;
                break;
            }
        }

        // 中間的距離
        for (; index < seats.length; index++) {
            if (seats[index] == 1) {
                maxDist = Math.max(maxDist, index - beforeIsFilled);
                beforeIsFilled = index;
            }
        }

        // 尾巴的距離
        maxDist = Math.max(maxDist, (seats.length - beforeIsFilled - 1) * 2);

        return maxDist / 2;
    }
}

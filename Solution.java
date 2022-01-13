public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[1] > o2[1] ? 1 : -1);

        int count = 1;
        int currentIndex = points[0][1];
        for (int[] point : points) {
            if (point[0] <= currentIndex) {
                continue;
            }
            currentIndex = point[1];
            count++;
        }

        return count;
    }
}

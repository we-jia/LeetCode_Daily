public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i += 2) {
            if (flowerbed[i] == 0) {
                if (i - 1 >= 0 && flowerbed[i - 1] == 1) {
                    i--;
                    continue;
                }
                if (i + 1 < flowerbed.length && flowerbed[i + 1] == 1) {
                    continue;
                }
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return n <= 0;
    }
}

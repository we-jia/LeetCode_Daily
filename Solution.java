class Solution {
    public int maxPower(String s) {
        char[] arr = s.toCharArray();

        char tmp = 0;
        int count = 0;
        int max = 0;
        for (char c : arr) {
            if (tmp == c) {
                count++;
            } else {
                tmp = c;
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}

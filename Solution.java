class Solution {
    public int[] diStringMatch(String s) {
        int countD = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'D') {
                countD++;
            }
        }
        int countI = countD;
        int[] result = new int[s.length() + 1];
        result[0] = countD;

        for (int i = 1; i < result.length; ++i) {
            if (arr[i - 1] == 'D') {
                result[i] = --countD;
            } else {
                result[i] = ++countI;
            }
        }

        return result;
    }
}

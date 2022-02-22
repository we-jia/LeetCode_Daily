class Solution {
    public int minOperations(String s) {
        int odd0 = 0;
        int even0 = 0;
        int odd1 = 0;
        int even1 = 0;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == '0') {
                if (i % 2 == 0) {
                    even0++;
                } else {
                    odd0++;
                }
            } else {
                if (i % 2 == 0) {
                    even1++;
                } else {
                    odd1++;
                }
            }
        }

        return Math.min(odd0 + even1, odd1 + even0);
    }
}

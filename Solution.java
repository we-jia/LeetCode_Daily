class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        for (char c : s1.toCharArray()) {
            arr[c - 'a']++;
        }

        char[] s2Arr = s2.toCharArray();
        int index = 0;
        for (int i = 0; i < s2Arr.length; ++i) {
            int checkResult = this.checkArr(arr);
            if (checkResult == 0) {
                return true;
            } else if (checkResult == 1) {
                arr[s2Arr[i] - 'a']--;
            } else {
                arr[s2Arr[index] - 'a']++;
                index++;
                i--;
            }
        }

        if (this.checkArr(arr) == 0) {
            return true;
        }
        return false;
    }

    public int checkArr(int[] arr) {
        boolean allZero = true;
        for (int i : arr) {
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                allZero = false;
            }
        }
        return allZero ? 0 : 1;
    }
}

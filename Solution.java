class Solution {
    public int[] plusOne(int[] digits) {
        boolean addOne = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (addOne) {
                digits[i]++;
                addOne = false;
            } else {
                break;
            }

            if (digits[i] == 10) {
                digits[i] = 0;
                addOne = true;
            }
        }

        if (addOne) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            arr[1] = 0;
            System.arraycopy(digits, 1, arr, 2, arr.length - 2);
            return arr;
        } else {
            return digits;
        }
    }
}

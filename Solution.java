public class Solution {
    private int boundedValue = Integer.MAX_VALUE / 10;

    public int myAtoi(String s) {
        char[] arr = s.toCharArray();
        int index = this.findIndexIgnoreWhiteSpace(arr);
        if (index == -1)
            return 0;

        char operator = this.findOperator(arr, index);

        if (operator == '+') {
            return this.transferToInteger(arr, index + 1, '+');
        } else if (operator == '-') {
            return -1 * this.transferToInteger(arr, index + 1, '-');
        } else {
            return this.transferToInteger(arr, index, '+');
        }
    }

    private int findIndexIgnoreWhiteSpace(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    private char findOperator(char[] arr, int index) {
        if (arr[index] == '+') {
            return '+';
        }
        if (arr[index] == '-') {
            return '-';
        }
        return ' ';
    }

    private int transferToInteger(char[] arr, int index, char operator) {
        int sum = 0;
        for (int i = index; i < arr.length; i++) {
            char c = arr[i];
            if (c < 48 || c > 57) {
                break;
            }
            if (sum > this.boundedValue) {
                if (operator == '+') {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            if (sum == this.boundedValue) {
                if (operator == '+' && c > 55) {
                    return Integer.MAX_VALUE;
                }
                if (operator == '-' && c > 56) {
                    return Integer.MIN_VALUE;
                }
            }
            sum = sum * 10 + (c - 48);
        }
        return sum;
    }
}

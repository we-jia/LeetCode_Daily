class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();

        String result = "";

        char[] arr = s.toCharArray();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                int currentInt = 0;
                while (arr[i] >= '0' && arr[i] <= '9') {
                    currentInt = 10 * currentInt + arr[i] - '0';
                    i++;
                }
                intStack.add(currentInt);
            } else if (arr[i] == '[') {
                strStack.add(result);
                result = "";
                i++;
            } else if (arr[i] == ']') {
                int repeatTimes = intStack.pop();
                String sb = result.repeat(repeatTimes);
                result = strStack.pop() + sb;
                i++;
            } else {
                result += arr[i];
                i++;
            }
        }

        return result;
    }
}

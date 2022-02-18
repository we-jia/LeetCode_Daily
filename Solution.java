class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] arr1 = this.toArray(num1);
        int[] arr2 = this.toArray(num2);

        return String.valueOf(arr1[0] * arr2[0] - arr1[1] * arr2[1]) + "+" + (arr1[0] * arr2[1] + arr1[1] * arr2[0]) + "i";
    }

    private int[] toArray(String num) {
        String[] arr = num.split("\\+");
        int[] result = new int[2];

        if (arr.length == 2) {
            result[0] = Integer.parseInt(arr[0]);
            result[1] = Integer.parseInt(arr[1].replace("i", ""));
        } else {
            if (arr[0].indexOf("i") < 0) {
                result[0] = Integer.parseInt(arr[0]);
            } else {
                result[1] = Integer.parseInt(arr[1].replace("i", ""));
            }
        }
        return result;
    }
}

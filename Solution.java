public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().detectCapitalUse("KJHKJ"));
    }

    public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();

        if (this.isCapital(arr[0])) {
            if (arr.length == 1) {
                return true;
            }
            if (this.isCapital(arr[1])) {
                for (int i = 2; i < arr.length; i++) {
                    if(!this.isCapital(arr[i])){
                        return false;
                    }
                }
            } else {
                for (int i = 2;i < arr.length; i++) {
                    if (this.isCapital(arr[i])) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < arr.length; i++) {
                if(this.isCapital(arr[i])){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCapital(char c){
        return c >= 65 && c <= 90;
    }
}

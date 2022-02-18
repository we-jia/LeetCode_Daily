class Solution {
    public boolean judgeSquareSum(int c) {
        if(c == 0){
            return true;
        }
        
        int sqrt = (int) Math.sqrt(c);
        int[] arr = new int[sqrt + 1];

        for (int i = 1; i <= sqrt; ++i) {
            if(arr[i] == 0){
                arr[i] = i * i;
            }

            int calResult = c - arr[i];
            int sqr = (int) Math.sqrt(calResult);
            if(sqr * sqr == calResult){
                return true;
            }
        }
        
        return false; 
    }
}

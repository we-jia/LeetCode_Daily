public class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] record = new boolean[n];
        record[0] = true;

        for(int i = 1;i <= n;i++){
            this.getResultAfterOneMove(record, i);
        }
        return record[n - 1];
    }

    private void getResultAfterOneMove(boolean[] record, int n) {
        int k = (int) Math.sqrt(n);
        if (k * k == n) {
            record[n - 1] = true;
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (!record[n - 1 - i * i]) {
                record[n] = true;
                return;
            }
        }
    }
}

class Solution {
    private long[] dpArrA;
    private long[] dpArrB;

    public int numTilings(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        this.dpArrA = new long[n];
        this.dpArrB = new long[n];
        this.dpArrA[0] = 1;
        this.dpArrA[1] = 2;
        this.dpArrB[1] = 1;
        for (int i = 2; i < n; i++) {
            this.dpArrA[i] = (this.dpArrA[i - 2] + this.dpArrA[i - 1] + this.dpArrB[i - 1] * 2) % 1000000007;
            this.dpArrB[i] = (this.dpArrB[i - 1] + this.dpArrA[i - 2]) % 1000000007;
        }
        return (int)this.dpArrA[n - 1] % 1000000007;
    }
}

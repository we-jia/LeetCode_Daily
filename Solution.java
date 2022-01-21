public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int tank = 0;
        int totalGas = 0;

        for (int i = 0; i < gas.length; i++) {
            int cur = gas[i] - cost[i];
            tank += cur;
            totalGas += cur;
            if (tank < 0) {
                tank = 0;
                index = i + 1;
            }
        }

        return totalGas < 0 ? -1 : index;
    }
}

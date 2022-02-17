class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>[] list = new ArrayList[target + 1];
        list[0] = new ArrayList<>();
        list[0].add(new ArrayList<>());
        for (int i : candidates) {
            if (i > target) {
                continue;
            }
            for (int j = 0; j <= target; ++j) {
                if (list[j] != null && j + i <= target) {
                    if (list[j + i] == null) {
                        list[j + i] = new ArrayList<>();
                    }
                    for (List<Integer> ele : list[j]) {
                        List<Integer> tmpList = new ArrayList<>(ele);
                        tmpList.add(i);
                        list[j + i].add(tmpList);
                    }
                }
            }
        }
        
        return list[target] == null ? Collections.emptyList() : list[target];
    }
}

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return List.of(0);
        }

        List<Integer> rtnList = new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            list.add(new ArrayList<>());
        }

        for (int[] ele : edges) {
            arr[ele[0]]++;
            arr[ele[1]]++;
            list.get(ele[0]).add(ele[1]);
            list.get(ele[1]).add(ele[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 1) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            rtnList.clear();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int j = queue.poll();
                for (int k : list.get(j)) {
                    arr[k]--;
                    if (arr[k] == 1) {
                        queue.add(k);
                    }
                }
                rtnList.add(j);
            }
        }

        return rtnList;
    }
}

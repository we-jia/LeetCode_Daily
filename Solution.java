// 可以查一下counting sort
// 速度上會更快
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> rtnList = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; ++i) {
            min = Math.min(arr[i + 1] - arr[i], min);
        }
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i + 1] - arr[i] == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                rtnList.add(list);
            }
        }

        return rtnList;
    }
}

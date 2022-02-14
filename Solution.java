// 可以只用一行解決
class Solution {
    public boolean canReach(int[] arr, int start) {
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        int before = 0;
        int after = 0;

        while(!queue.isEmpty()){
            int ele = queue.poll();
            if(arr[ele] == 0){
                return true;
            }

            before = ele - arr[ele];
            after = ele + arr[ele];
            if (!set.contains(before) && before >= 0) {
                set.add(before);
                queue.add(before);
            }
            if (!set.contains(after) && after < arr.length) {
                set.add(after);
                queue.add(after);
            }
        }

        return false;
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums2) {
            while (!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            }
            stack.add(i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}

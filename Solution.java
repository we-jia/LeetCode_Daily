class Solution {
    public int rob(TreeNode root) {
        int[] result = this.findMaxVal(root);
        return Math.max(result[0], result[1]);
    }

    public int[] findMaxVal(TreeNode root) {
        int[] arr = new int[2];
        if (root == null) {
            return arr;
        }

        int[] left = findMaxVal(root.left);
        int[] right = findMaxVal(root.right);
        arr[0] = root.val + left[1] + right[1];
        arr[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return arr;
    }
}

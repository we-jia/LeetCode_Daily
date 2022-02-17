class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return this.getVal(root, 0);
    }

    private int getVal(TreeNode root, int result) {
        result = result * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            return result;
        }
        if (root.left == null) {
            return this.getVal(root.right, result);
        }
        if (root.right == null) {
            return this.getVal(root.left, result);
        }
        return this.getVal(root.left, result) + this.getVal(root.right, result);
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null) {
            return this.myHasPathSum(root.right, targetSum - root.val);
        } else if (root.right == null) {
            return this.myHasPathSum(root.left, targetSum - root.val);
        } else {
            return this.myHasPathSum(root.left, targetSum - root.val) || this.myHasPathSum(root.right, targetSum - root.val);
        }
    }

    private boolean myHasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return targetSum == 0;
        }

        if (root.left == null) {
            return this.myHasPathSum(root.right, targetSum - root.val);
        } else if (root.right == null) {
            return this.myHasPathSum(root.left, targetSum - root.val);
        } else {
            return this.myHasPathSum(root.left, targetSum - root.val) || this.myHasPathSum(root.right, targetSum - root.val);
        }
    }
}

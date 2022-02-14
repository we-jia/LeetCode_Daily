class Solution {
    int val;

    public int maxDepth(TreeNode root) {
        this.calcDepth(root, 1);
        return this.val;
    }

    private void calcDepth(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level > this.val) {
            this.val = level;
        }

        this.calcDepth(root.left, level + 1);
        this.calcDepth(root.right, level + 1);
    }
}

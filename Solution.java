class Solution {
    private boolean first = true;
    private int prev;
    private int diff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        this.cal(root);
        return this.diff;
    }

    private void cal(TreeNode root) {
        if (root == null) {
            return;
        }
        this.cal(root.left);
        if (!first) {
            this.diff = Math.min(diff, Math.abs(root.val - prev));
        }
        this.prev = root.val;
        this.first = false;
        this.cal(root.right);
    }
}

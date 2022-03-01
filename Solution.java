class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        } else {
            return this.isSameTree(p.left, q.left) && this.isSameTree(p.right, q.right);
        }
    }
}

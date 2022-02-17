class Solution {
    private int maxDiff = 0;
    
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }

        this.maxAncestorDiff(root, root.val, root.val);
        return this.maxDiff;
    }

    public void maxAncestorDiff(TreeNode root, int max, int min) {
        if (root == null) {
            this.maxDiff = Math.max(this.maxDiff, Math.abs(max - min));
            return;
        }

        if (root.val < min) {
            this.maxAncestorDiff(root.left, max, root.val);
            this.maxAncestorDiff(root.right, max, root.val);
        } else if (root.val > max) {
            this.maxAncestorDiff(root.left, root.val, min);
            this.maxAncestorDiff(root.right, root.val, min);
        } else {
            this.maxAncestorDiff(root.left, max, min);
            this.maxAncestorDiff(root.right, max, min);
        }
    }
}

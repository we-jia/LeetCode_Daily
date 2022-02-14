class Solution {
    private int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return this.sum;
        }

        if (root.val < low) {
            this.rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            this.rangeSumBST(root.left, low, high);
        } else {
            this.sum += root.val;
            this.rangeSumBST(root.left, low, high);
            this.rangeSumBST(root.right, low, high);
        }

        return this.sum;
    }
}

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = this.getSecondMin(root.left, root.val);
        int right = this.getSecondMin(root.right, root.val);
        if (left == root.val) {
            return right == root.val ? -1 : right;
        }
        if (right == root.val) {
            return left;
        }
        return Math.min(left, right);
    }

    private int getSecondMin(TreeNode root, int val) {
        if (root == null) {
            return val;
        }

        if (root.val > val) {
            return root.val;
        } else {
            int left = this.getSecondMin(root.left, val);
            int right = this.getSecondMin(root.right, val);
            if (left == val) {
                return right;
            }
            if (right == val) {
                return left;
            }
            return Math.min(left, right);
        }
    }
}

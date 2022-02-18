class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null || root.val == x || root.val == y) {
            return false;
        }

        int[] xArr1 = this.getLevelAndParent(root.left, x, 2, root.val);
        int[] xArr2 = this.getLevelAndParent(root.right, x, 2, root.val);
        int[] xArr = xArr1 == null ? xArr2 : xArr1;

        int[] yArr1 = this.getLevelAndParent(root.left, y, 2, root.val);
        int[] yArr2 = this.getLevelAndParent(root.right, y, 2, root.val);
        int[] yArr = yArr1 == null ? yArr2 : yArr1;

        return xArr[0] == yArr[0] && xArr[1] != yArr[1];
    }

    private int[] getLevelAndParent(TreeNode root, int searchingVal, int currentLevel, int parentVal) {
        if (root == null) {
            return null;
        }

        if (root.val == searchingVal) {
            return new int[]{currentLevel, parentVal};
        }

        int[] result = this.getLevelAndParent(root.right, searchingVal, currentLevel + 1, root.val);
        if (result == null) {
            return this.getLevelAndParent(root.left, searchingVal, currentLevel + 1, root.val);
        } else {
            return result;
        }
    }
}

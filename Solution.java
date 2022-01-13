class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return this.calculate(root, 0);
    }

    private int calculate(TreeNode node, int parentVal) {
        if(node == null){
            return 0;
        }

        int currentVal =  (parentVal << 1) + node.val;
        if(node.left == null && node.right == null){
            return currentVal;
        }

        return this.calculate(node.left, currentVal) + this.calculate(node.right, currentVal);
    }
}

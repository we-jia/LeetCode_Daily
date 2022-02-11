class Solution {
    int sum;

    public int findTilt(TreeNode root) {
        this.calculate(root);
        return this.sum;
    }

    public int calculate(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = this.calculate(root.left);
        int rightSum = this.calculate(root.right);
        sum += Math.abs(leftSum - rightSum);
        
        return root.val + leftSum + rightSum;
    }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> list = new ArrayList<>();
        this.generateList(list, root, 0);
        Collections.reverse(list);
        return list;
    }

    private void generateList(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (list.size() - 1 < level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        this.generateList(list, root.left, level + 1);
        this.generateList(list, root.right, level + 1);
    }
}

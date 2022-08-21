public class BalancedBinaryTree110 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(3, node1, node2);
        TreeNode node6 = new TreeNode(2, node3, node5);
        TreeNode node7 = new TreeNode(1, node4, node6);
        System.out.println(isBalanced(node7));
    }

    public static boolean isBalanced(TreeNode root) {
        return parse(root) >= 0;
    }

    private static int parse(TreeNode root) {
        if (root != null) {
            int count1 = parse(root.left);
            int count2 = parse(root.right);
            if (Math.abs(count1 - count2) > 1 || count1 < 0 || count2 < 0) {
                return -1;
            }
            return Math.max(count1, count2) + 1;
        }
        return 0;
    }
}

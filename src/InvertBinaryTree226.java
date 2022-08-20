public class InvertBinaryTree226 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2, node1, node2);
        System.out.println(invertTree(node3));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}


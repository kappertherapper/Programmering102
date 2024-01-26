import javax.swing.tree.TreeNode;

public class BinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int index = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "null,";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

 // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        index = 0;
        return buildTree(arr);
    }

    private TreeNode buildTree(String[] arr) {

            String value = arr[index++];

            if(value.equals("null")) return null;
            TreeNode root = new TreeNode(Integer.parseInt(value));
            root.left = buildTree(arr);
            root.right = buildTree(arr);
            return root;
}

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
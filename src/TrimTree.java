
public class TrimTree {
	public TreeNode trim(TreeNode root, int low, int high) {
	   if (root == null) return null;
       
       if (root.info < low) return trim(root.right,low,high);
       if (root.info > high) return trim(root.left,low,high);
       root.left = trim(root.left,low,high);
       root.right = trim(root.right,low,high);
       return root;
	}
}

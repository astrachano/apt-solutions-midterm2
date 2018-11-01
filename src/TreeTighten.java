
public class TreeTighten {
	 public TreeNode tighten(TreeNode t) {
		 if (t == null) return null;
		 if (t.left == null && t.right == null) {
			 return t;
		 }
		 if (t.left != null && t.right != null) {
			 t.left = tighten(t.left);
			 t.right = tighten(t.right);
			 return t;
		 }
		 // one child is null
		 if (t.left != null) return tighten(t.left);
		 return tighten(t.right);
	 }
}

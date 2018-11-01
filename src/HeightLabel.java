
public class HeightLabel {
	public TreeNode rewire(TreeNode t) {
		if (t == null) return null;
		
		if (t.left == null && t.right == null) {
			return new TreeNode(1,null,null);
		}
		
		TreeNode left = rewire(t.left);
		TreeNode right = rewire(t.right);
		
		// find max of left/right for height
		// use ternary operator instead of if/else
		
		int lc = left == null ? 0 : left.info;
		int rc = right == null ? 0 : right.info;
		
		return new TreeNode(Math.max(rc, lc)+1,left,right);
	}
}

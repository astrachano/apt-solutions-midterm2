
public class TreeCount {
	public int count(TreeNode t) {
		if (t == null) return 0;
		return 1 + count(t.left) + count(t.right);
	}
}


public class PathSum {
	public int hasPath(int target, TreeNode tree) {
		if (tree == null) return 0;
		if (tree.left == null && tree.right == null) {
			if (target == tree.info) return 1;
			return 0;
		}
		int left = hasPath(target-tree.info,tree.left);
		int right = hasPath(target-tree.info,tree.right);
		if (left == 1 || right == 1) return 1;
		return 0;
	}
}

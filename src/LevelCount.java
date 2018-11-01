public class LevelCount {
	public int count(TreeNode t, int level) {
        if (t == null) return 0;
        if (level == 0) return 1;
        return count(t.left,level-1) + count(t.right,level-1);
    }
}

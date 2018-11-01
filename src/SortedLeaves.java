import java.util.*;

public class SortedLeaves {
	public String[] values(TreeNode t) {
		ArrayList<Integer> list = new ArrayList<>();
		doWork(t,list);
		String[] ret = new String[list.size()];
		for(int k=0; k < ret.length; k++) {
			ret[k] = ""+(char) (int) list.get(k);
		}
		Arrays.sort(ret);
		return ret;
	}
	
	private void doWork(TreeNode t, ArrayList<Integer> list) {
		if (t == null) return;
		if (t.left == null && t.right == null) {
			list.add(t.info);
			return;
		}
		doWork(t.left,list);
		doWork(t.right,list);
	}
}


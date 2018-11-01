public class QuasiIsomorphic {
	public String sameShape(TreeNode s, TreeNode t){
		if (s == null && t == null) return "same";
		if (s == null || t == null) return "different";
		
		boolean ll = "same".equals(sameShape(s.left,t.left));
		boolean lr = "same".equals(sameShape(s.left,t.right));
		boolean rr = "same".equals(sameShape(s.right,t.right));
		boolean rl = "same".equals(sameShape(s.right,t.left));

		if (ll && rr) return "same";
		if (lr && rl) return "same";
		return "different";
	}
}


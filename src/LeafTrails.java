import java.util.TreeMap;

public class LeafTrails {
	TreeMap<Integer,String> myMap = new TreeMap<>();
	
	public String[] trails(TreeNode t) {
		doWork(t,"");
		String[] ret = new String[myMap.size()];
		int index = 0;
		for(int s : myMap.keySet()) {
			ret[index] = myMap.get(s);
			index += 1;
		}
		return ret;
	}
	
	private void doWork(TreeNode t, String path) {
		if (t == null) return;
		
		if (t.left == null && t.right == null) {
			myMap.put(t.info, path);
			return;
		}
		doWork(t.left,path+"0");
		doWork(t.right,path+"1");
	}
}

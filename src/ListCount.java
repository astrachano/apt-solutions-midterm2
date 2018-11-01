
public class ListCount {
	public int countOld(ListNode list) {
		int t = 0;
		while (list != null) {
			//list = list.next;
			t += 1;
		}
		return t;
	}
	public int count(ListNode list) {
		if (list == null) return 0;
		return 1 + count(list.next);
	}
}

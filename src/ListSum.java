
public class ListSum {

	public int sum(ListNode list, int thresh) {
		int t = 0;
		while (list != null) {
			if (list.info > thresh) {
				t += list.info;
			}
			list = list.next;
		}
		return t;
	}
}

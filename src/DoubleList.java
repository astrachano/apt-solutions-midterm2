
public class DoubleList {
	public ListNode bigify(ListNode list) {
		ListNode first = list;
		while (list != null) {
			list.next = new ListNode(list.info, list.next);
			list = list.next.next;
		}
		return first;
	}
}

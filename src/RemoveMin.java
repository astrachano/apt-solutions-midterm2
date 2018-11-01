
public class RemoveMin {
	public ListNode remove(ListNode list) {
		ListNode min = list;
		ListNode first = list;
		// we know list != null
		
		while (list != null) {
			if (list.info < min.info) {
				min = list;
			}
			list = list.next;
		}
		
		// we found min, now remove
		if (min == first) return first.next;
		
		list = first;
		while (list.next != min) {
			list = list.next;
		}
		// list is node before min, link around
		list.next = list.next.next;
		return first;
	}
}


public class ListStretch {
	ListNode myLast;
	
	public ListNode stretch(ListNode list, int amount) {
		if (list == null) return null;
		ListNode first = nlist(list.info,amount);
		ListNode last = myLast;
	
		last.next = stretch(list.next,amount);
		return first;
	}
	private ListNode nlist(int val, int n) {
		ListNode first = new ListNode(val);
		ListNode last = first;
		for(int k=0; k < n-1; k++) {
			last.next = new ListNode(val);
			last = last.next;
		}
		myLast = last;
		return first;
	}
	
	public ListNode nlist2(int n) {
		ListNode first = null;
		for(int k=0; k < n; k+=1) {
			first = new ListNode(n,null);
		}
		return first;
	}
	
}

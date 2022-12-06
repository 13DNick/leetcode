package leetcode.easy;

public class ReverseLinkedList {
	
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	// O(n)
	public ListNode reverseList(ListNode head) {
		
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		
		while(curr != null) {
			//pointer to next node 
			next = curr.next;
			
			//redirect link
			curr.next = prev;
			
			//move to next node
			prev = curr;
			curr = next;
		}
		//set new head
		head = prev;
		return head;
	}
	
}

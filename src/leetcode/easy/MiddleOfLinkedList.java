package leetcode.easy;

public class MiddleOfLinkedList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode middleNode(ListNode head) {
        
        ListNode node = head;
        ListNode middle = head;
        int size = 1;
        
        //find size of list
        while(node.next != null){
            node = node.next;
            size++;
        }

        //iterate until the middle node is found
        //if even return second middle
        //if odd return middle
        int count = 1;
        while(count != (size/2)+1){
            middle = middle.next;
            count++;
        }

        return middle;
    }
}

package leetcode.medium;

public class RemoveNthNodeFromList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode node = head;
        ListNode prev = null; ListNode next = null;

        //get list size
        int size = 1;
        while(node.next != null){
            node = node.next;
            size++;
        }

        //get target node location
        int target = size - n;

        //return everything but the first node
        if(target == 0){
           return head.next;
        }

        //reset head
        node = head;

        //get target node
        int count = 1;
        while(count <= target){
            prev = node;
            node = node.next;
            next = node.next;
            count++;            
        }

        
        //remove node and re-link the list
        prev.next = next;
        return head;
        
    }
}

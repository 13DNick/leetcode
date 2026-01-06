package leetcode.medium;

public class OddEvenLinkedList {
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
		  
	  public ListNode oddEvenList(ListNode head) {
	        
	        if(head == null) return head;

	        ListNode even = null;
	        ListNode evenFirst = null;
	        ListNode odd = null;
	        ListNode oddFirst = null;
	        
	        ListNode node = head;
	        int counter = 1;

	        while(node != null){
	            if(counter % 2 == 1){
	                //build odd list
	                if(counter == 1){
	                    //set new odd head
	                    oddFirst = new ListNode(node.val);
	                    //pointer to odd list
	                    odd = oddFirst;
	                } else {
	                    //set next odd node
	                    odd.next = new ListNode(node.val);
	                    //keep pointer to latest odd node
	                    odd = odd.next;
	                }

	                //iterate through original list
	                node = node.next;
	                counter++;
	            } else {
	                //build even list
	                if(counter == 2){
	                    //set new even head
	                    evenFirst = new ListNode(node.val);
	                    even = evenFirst;
	                } else {
	                    //set next even node
	                    even.next = new ListNode(node.val);
	                    //keep pointer to latest even node
	                    even = even.next;
	                }

	                node = node.next;
	                counter++;
	            }
	        }

	        //connect last odd node and first even node
	        if(evenFirst != null){
	            odd.next = evenFirst;
	        }

	        return oddFirst;
	    }
	
}

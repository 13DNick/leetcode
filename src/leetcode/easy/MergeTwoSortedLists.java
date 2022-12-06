package leetcode.easy;

public class MergeTwoSortedLists {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //dummy node
        ListNode node = new ListNode(0);
        //build new list
        ListNode head = node;

        //keep looping until both lists are traversed
        while(list1 != null || list2 != null){
            //take smaller value
            if(list2 == null || (list1 != null && list1.val < list2.val)){
                node.next = list1;
                //move to next value
                list1 = list1.next; 
            } else {
                node.next = list2;
                //move to next value
                list2 = list2.next;
            }
            //keep pointer to latest link in new list
            node = node.next;
        }

        //return everything after the dummy node
        return head.next;
    }
}

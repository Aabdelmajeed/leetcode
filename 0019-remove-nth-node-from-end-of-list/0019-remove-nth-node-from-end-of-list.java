/**
 * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       	int listCount = count(head);
		int fs = listCount - n  ;
		ListNode p1 = head;
		if(fs == 0){
			return p1.next;
		}
		while(fs > 1 && p1 != null){
			p1 = p1.next;
			fs--;

		}
		if(p1 != null && p1.next != null)
			p1.next = p1.next.next;
		return head;
    }
    
    private int count(ListNode head){
        ListNode p1 = head;
        int c = 0;
        while(p1 != null){
            c++;
            p1 = p1.next;
        }
        return c;
    }
}
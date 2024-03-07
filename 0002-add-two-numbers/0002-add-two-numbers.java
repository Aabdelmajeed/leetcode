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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode result = new ListNode(0);
        ListNode temp = result;
         while(l1 != null || l2 != null || c != 0){
            int v1 = l1 != null? l1.val:0;
            int v2 = l2 != null? l2.val:0;
            int sum =(c + v1 + v2)%10;
            c = (c + v1+v2)/10;
            temp.next = new ListNode(sum);
             temp = temp.next;
             if(l1 != null){
                  l1 = l1.next;
             }
             if(l2 != null){
                l2 = l2.next;
             }
         }
        return result.next;
    }
}
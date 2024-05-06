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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
       Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        int maximum = 0;
        while(current != null){
           stack.push(current);
            current = current.next;
        
        }
        
        current = stack.pop();
          maximum = current.val;
        ListNode resultList = new ListNode(maximum);   
        
        while(!stack.isEmpty()){
             current = stack.pop();
            if(current.val < maximum) continue;
            
            ListNode newNode = new ListNode(current.val);
            newNode.next = resultList;
            resultList = newNode;
            maximum = current.val;
        }
        
        return resultList;
    }
}
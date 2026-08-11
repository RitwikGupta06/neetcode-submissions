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
    public ListNode reverseList(ListNode head) {
        ListNode prev, current, next;
        
        if(head == null) return null;

        prev = null;
        current = head;
        next = head.next;
        
        while(current.next != null){
            current.next = prev;
            
            prev = current;
            current = next;
            next = next.next;   
        }
        current.next = prev;
        head = current;
        return head;
    }
}

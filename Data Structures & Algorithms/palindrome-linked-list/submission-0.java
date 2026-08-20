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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        
        if(head == null || head.next == null){
            return true;
        }
        //find the mid node using fast and slow pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //reverse the 2nd part
        ListNode prev = null;
        while(slow != null){
            ListNode tmp = slow.next;
            slow.next = prev;
            prev = slow; 
            slow = tmp;
        }
        ListNode left = head, right = prev;
        while(left != null && right!= null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}

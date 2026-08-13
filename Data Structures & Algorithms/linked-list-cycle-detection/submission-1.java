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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode temp = head;
        if(temp == null) return false;
        while(temp.next != null){
            if(seen.contains(temp)) return true;
            else{ 
                seen.add(temp);
                temp = temp.next;
            }
        }
        return false;
    }
}

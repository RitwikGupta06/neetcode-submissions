class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> num1 = new Stack<>();
        Stack<Integer> num2 = new Stack<>();

        ListNode trav1 = l1;
        ListNode trav2 = l2;

        while (trav1 != null || trav2 != null) {
            if (trav1 != null) {
                num1.push(trav1.val);
                trav1 = trav1.next;
            }
            if (trav2 != null) {
                num2.push(trav2.val);
                trav2 = trav2.next;
            }
        }

        int carry = 0;
        ListNode head = null;

        while (!num1.isEmpty() || !num2.isEmpty() || carry != 0) {
            int v1 = num1.isEmpty() ? 0 : num1.pop();
            int v2 = num2.isEmpty() ? 0 : num2.pop();

            int sum = v1 + v2 + carry;
            carry = sum / 10;

            head = new ListNode(sum % 10, head);
        }

        return head;
    }
}
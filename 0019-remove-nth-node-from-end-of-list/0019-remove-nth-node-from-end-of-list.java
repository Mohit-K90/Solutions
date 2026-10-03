class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode back = dummy;
        ListNode forward = dummy;

        // Move forward n times
        for (int i = 0; i < n; i++) {
            forward = forward.next;
        }

        // Move both pointers together
        while (forward.next != null) {
            forward = forward.next;
            back = back.next;
        }

        // Remove the nth node from the end
        back.next = back.next.next;

        return dummy.next;
    }
}
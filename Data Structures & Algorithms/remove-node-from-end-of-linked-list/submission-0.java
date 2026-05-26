class Solution {

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }
        return prev; // ✅ new head
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1) reverse
        ListNode rev = reverse(head);

        // 2) remove nth node from START of reversed list
        ListNode dummy = new ListNode(0);
        dummy.next = rev;

        ListNode prev = dummy;
        int i = 1;

        while (prev.next != null) {
            if (i == n) {
                prev.next = prev.next.next; // ✅ delete by changing link
                break;
            }
            prev = prev.next;
            i++;
        }

        // 3) reverse back and return
        return reverse(dummy.next);
    }
}

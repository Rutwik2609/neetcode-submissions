class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1) Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2) Reverse second half (start from slow.next)
        ListNode sec = slow.next;
        slow.next = null; // cut first half

        ListNode prev = null;
        while (sec != null) {
            ListNode nextTemp = sec.next;
            sec.next = prev;
            prev = sec;
            sec = nextTemp;
        }

        // 3) Merge two halves
        ListNode l1 = head;
        ListNode l2 = prev;

        while (l1 != null && l2 != null) {
            ListNode n1 = l1.next;
            ListNode n2 = l2.next;

            l1.next = l2;
            l2.next = n1;

            l1 = n1;
            l2 = n2;
        }
    }
}
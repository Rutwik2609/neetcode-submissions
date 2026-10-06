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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second =slow.next;
        slow.next = null;

        ListNode prev = null;

        while(second!=null){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        ListNode curr = head;

        while(prev!=null){
            ListNode n1 = curr.next;
            ListNode n2 = prev.next;

            curr.next = prev;
            prev.next = n1;

            curr = n1;
            prev = n2;
        }

    }
}

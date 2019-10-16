package algorithms.firecode.delete_At_Tail_Circular;

public class Solution {

    public ListNode deleteAtTail(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = null, fast = head;
        while (fast.next != head) {
            slow = fast;
            fast = fast.next;
        }
        slow.next = fast.next;
        return head;


    }
}
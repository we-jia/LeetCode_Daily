class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        ListNode tmp;
        ListNode tmp2;
        while (fast != null && fast.next != null) {
            tmp = fast.next;
            fast.next = fast.next.next;

            tmp2 = slow.next;
            slow.next = tmp;
            tmp.next = tmp2;

            slow = slow.next;
            fast = fast.next;
        }

        return head;
    }
}

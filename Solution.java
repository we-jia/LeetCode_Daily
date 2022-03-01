class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            int val = tmp.val;
            while (tmp.next != null && tmp.next.val == val) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
        return head;
    }
}

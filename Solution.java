class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode helper = new ListNode(Integer.MIN_VALUE);
        while (head != null) {
            ListNode tmp = helper;
            while (tmp.val < head.val && tmp.next != null && tmp.next.val < head.val) {
                tmp = tmp.next;
            }
            ListNode currentHead = head;
            head = head.next;
            
            ListNode tmp2 = tmp.next;
            tmp.next = currentHead;
            currentHead.next = tmp2;
        }

        return helper.next;
    }
}

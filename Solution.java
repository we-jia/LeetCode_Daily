class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode result = head.next;
        ListNode zero = new ListNode();
        zero.next = head;

        while (zero.next != null && zero.next.next != null) {
            ListNode tmp1 = zero.next;
            ListNode tmp2 = tmp1.next;

            zero.next = tmp2;
            tmp1.next = tmp2.next;
            tmp2.next = tmp1;

            zero = tmp1;
        }


        return result;
    }
}

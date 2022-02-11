class Solution {
    public int getDecimalValue(ListNode head) {
        int i = 0;
        while (head != null) {
            i = i << 1;
            i += head.val;
            head = head.next;
        }
        return i;
    }
}

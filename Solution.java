class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (slowNode != null && fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode) {
                ListNode node = head;
                while(node != slowNode){
                    node = node.next;
                    slowNode = slowNode.next;
                }
                return node;
            }
        }
        return null;
    }
}

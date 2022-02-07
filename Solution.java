class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode node = head;
        while (node != null) {
            deque.add(node);
            node = node.next;
        }

        node = head;
        deque.removeFirst();
        boolean getFromFirst = false;

        while (!deque.isEmpty()) {
            ListNode tmp;
            if (getFromFirst) {
                tmp = deque.pollFirst();
            } else {
                tmp = deque.pollLast();
            }
            node.next = tmp;
            node = node.next;
            getFromFirst = !getFromFirst;
        }

        node.next = null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

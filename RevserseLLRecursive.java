public class RevserseLLRecursive {

    public ListNode revserseLLRecursive(ListNode node) {

        if (node == null) {
            return null;
        }
        if (node != null && node.next == null) {
            return node;
        }
        ListNode nextNode = revserseLLRecursive(node.next);
        node.next.next = node;
        node.next = null;

        return nextNode;
    }

    public class ListNode {
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
}

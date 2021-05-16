public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode() {

    }

    ListNode getSampleNodeTwo() {
        //1
        ListNode root = new ListNode(1);
        ListNode node2 = new ListNode(2);
        root.next = node2;
        return root;
    }

    ListNode getSampleNode() {
        // 3,2,0,-4,5,2
        ListNode root = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNegative4 = new ListNode(-4);
        ListNode node5 = new ListNode(5);

        root.next = node2;
        node2.next = node0;
        node0.next = nodeNegative4;
        nodeNegative4.next = node5;
        node5.next = node2;
        return root;
    }

    ListNode getSampleNodeThree() {
        // 3,2,0,-4,5
        ListNode root = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNegative4 = new ListNode(-4);
        ListNode node5 = new ListNode(5);

        root.next = node2;
        node2.next = node0;
        node0.next = nodeNegative4;
        nodeNegative4.next = node5;
        return root;
    }


    ListNode getSampleNodeOne() {
        // 1,2
        ListNode root = new ListNode(3);
        ListNode node2 = new ListNode(2);
        root.next = node2;
        return root;
    }

}
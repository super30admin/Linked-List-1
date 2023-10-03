public class Main {
    public static void main(String[] args) {
        // Create a sample linked list with a cycle
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // Create a cycle by connecting the last node to the second node
        node5.next = node2;

        // Create an instance of the linkedListCycle class
        linkedListCycle solution = new linkedListCycle();

        // Detect and print the start of the cycle (if it exists)
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}


//Time - O(n)
//space - O(1)
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) { // cycle detected
                while (head != fast) {
                    fast = fast.next;
                    head = head.next;
                }
                return head; // start of the cycle
            }
        }

        return null; // no cycle
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Link nodes: 3 -> 2 -> 0 -> -4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create a cycle: -4 -> 2
        node4.next = node2;

        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        ListNode cycleStart = linkedListCycleII.detectCycle(node1);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}

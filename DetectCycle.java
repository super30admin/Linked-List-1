// Time Complexity : O(n), where n is the number of nodes in the linked list.
// Space Complexity : O(1), using only a few pointers.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach :
// 1) Use two pointers: slow (moves 1 step) and fast (moves 2 steps).
// 2) If they ever meet, a cycle exists. If fast reaches null, no cycle.
// 3) To find the cycle start: set p1 at head and p2 at the meeting point,
//    move both one step at a time; the node where they meet is the start
//    of the cycle.
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect if a cycle exists by using two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;           // move by 1
            fast = fast.next.next;      // move by 2

            if (slow == fast) {         // cycle detected
                // Phase 2: Find the entry point of the cycle
                ListNode p1 = head;
                ListNode p2 = slow;
                while (p1 != p2) {      // move both by 1
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;              // start of the cycle
            }
        }

        return null; // no cycle
    }

    // --- Main method for basic testing ---
    public static void main(String[] args) {
        // Build list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create a cycle: tail (-4) points back to node with value 2 (pos = 1)
        createCycle(head, 1);

        DetectCycle sol = new DetectCycle();
        ListNode start = sol.detectCycle(head);

        if (start != null) {
            System.out.println("Cycle starts at node with value: " + start.val);
        } else {
            System.out.println("No cycle detected.");
        }

        // Optional: test a list without a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("Second list:");
        ListNode start2 = sol.detectCycle(head2);
        System.out.println(start2 == null ? "No cycle detected." :
                "Cycle starts at node with value: " + start2.val);
    }

    // Helper: create a cycle where tail connects to the node at position 'pos'
    // pos is 0-indexed; use pos = -1 for no cycle.
    private static void createCycle(ListNode head, int pos) {
        if (pos < 0) return;
        ListNode tail = head, join = null;
        int idx = 0;
        while (tail.next != null) {
            if (idx == pos) join = tail;
            tail = tail.next;
            idx++;
        }
        // Check last node for join position if pos points to the last node
        if (idx == pos) join = tail;
        if (join != null) tail.next = join;
    }
}


/*
* Time Complexity: O(N)
* Space Complexity: O(1)
* */
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        boolean hasCycle = false;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) return null;
        slowPointer = head;
        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

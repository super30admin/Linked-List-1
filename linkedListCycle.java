//detect the starting node of a cycle in a linked list.
//First check if a cycle exists by moving slow one step and fast two steps until they meet. Once a cycle is detected, it resets fast to the head and moves both pointers one step at a time — the point they meet is the cycle's start.
//Time complexity: O(n)
//Space complexity: O(1)
public class linkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;        
    }
}
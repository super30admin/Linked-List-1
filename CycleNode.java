import java.util.HashSet;
import java.util.Set;

public class CycleNode {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        Set<ListNode> result = new HashSet<>();

        ListNode current = head;

        while(current != null) {
            if(result.contains(current)){
                break;
            }else {
                result.add(current);
            }
            current = current.next;
        }
        return current;
    }

    // TC: O(n)
    // SC: O(1)
    // Algorithm used: Floyd Warshall's algorithm
    // 2( a + b ) = a + b + c + b => a = c
    // LHS represents slow pointer whereas RHS represents fast pointer
    // a -> distance from the head of the list to the start of the cycle
    // b -> distance from the start of the cycle to the pojnt where slow & fast meet
    // c -> distance from the meeting point to the start of the cycle
    public ListNode detectCycle2(ListNode head) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        boolean hasCycle = false;
        // With this condition, two things can happen
        // Either there is no cycle or fast reached the end
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Once slow and fast meet, break the loop
            // We will slow down the fast pointer from here onwards
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle) return null;

        // reset the slow pointer to the head
        slow = head;

        // slow and fast will now proceed with the equals speed
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

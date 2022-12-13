/**
 * LeetCode142
 */
public class LeetCode142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // this is to check if there exist a cycle in the given LL
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // Now if there is no cycle in the given LL then retrun null as mentioned in the
        // question
        if (!hasCycle) {
            return null;
        }

        // if there is a cycle in the given LL then we have to find the start node of
        // the cycle
        // and for this we have applied the mathematical formula that is from the point
        // where
        // slow and fast meets the distacne is same as moving from start to start of
        // cycle and
        // point of intersection to start of cycle hence we keep our fast at head and
        // slow at the
        // point of intersection and move both by one and the point where they will meet
        // will the
        // the starting node of LL

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;// here we can retrun either slow or fast as both points to node where cycle
        // starts.
    }
}
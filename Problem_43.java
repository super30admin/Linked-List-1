//Problem - 43

// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode :
//Yes

// Your code here along with comments explaining your approach 
// We will use an algorithm here, which inherits the slow and fast pointer technique
// A fast pointer which is the hare here will loop around a cycle and meet the
// slow which is coined as a tortoise
// if they both meet then it signifies that a cycle/loop/intersection has been made and hence we will return that intersecting node

public class Solution {
    private ListNode findLinkedListCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        // A fast pointer which is the hare here will loop around a cycle and meet the
        // slow which is coined as a tortoise
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare)
                return tortoise;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        // If there is a cycle, the fast/slow pointers will intersect at some intersect
        // condition
        ListNode intersect = findLinkedListCycle(head);
        if (intersect == null)
            return null;

        // reset hare to head
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}

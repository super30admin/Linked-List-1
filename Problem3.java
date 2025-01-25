import java.util.HashSet;


/*
Time Complexity -> O(N)
Space Complexity -> O(N) becasue of Hashset
*/
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        HashSet<ListNode> hashset = new HashSet<>();
        while (head.next != null) {
            if (hashset.contains(head)) {
                return head;
            }
            hashset.add(head);
            head = head.next;
        }
        return null;
    }
}

/*
TimeComplexity -> O(N)
Space Complexity -> O(1)
*/

class Solution2{
    public ListNode detectCycle(ListNode head) {
        boolean isCycle = false;
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }

        }
        fast = head;
        if (!isCycle) {
            return null;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
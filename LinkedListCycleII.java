// Brute force O(n) time, O(n) space
// public class Solution {
//     public boolean detectCycle(ListNode head) {
//         Set<ListNode> set = new HashSet<>();

//         while (head != null) {
//             if (set.contains(head)) {
//                 return head;
//             }   
//             set.add(head);
//             head = head.next;
//         }
//         return null;
//     }
// }

// Slow and fast O(n) time, O(1) space
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // fast != null needed for even length, fast.next != null needed for odd length
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return null;

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

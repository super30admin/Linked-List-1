//Brute force 
//Time = O(n)
//Space = O(n)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Create a hash set to store visited nodes
        Set<ListNode> visited = new HashSet<>();

        // Traverse the linked list
        while (head != null) {
            // If the current node has been visited before, then it's the start of the cycle
            if (visited.contains(head)) {
                return head;
            }
            // Otherwise, add the current node to the set and move to the next node
            visited.add(head);
            head = head.next;
        }

        // If we reach the end of the list and haven't found a cycle, then there is no cycle
        return null;
    }
}


//Floyd's cycle detection algorithm
//Time = O(n)
//Space = O(1)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Find the intersection point of the two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If there's no intersection point, then there's no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Move one of the pointers to the head of the list
        slow = head;

        // Move both pointers at the same pace until they meet at the start of the cycle
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Return the start of the cycle
        return slow;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        return helper(head);
        // return helperBruteForce(head);
    }

    private ListNode helper(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null;
        }

        fast = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    // private ListNode helperBruteForce(ListNode head) {
    //     Set<ListNode> nodeSet = new HashSet<>();
    //     ListNode temp = head;
    //     while (temp != null) {
    //         if (nodeSet.contains(temp)) {
    //             return temp;
    //         } else {
    //             nodeSet.add(temp);
    //         }

    //         temp = temp.next;
    //     }

    //     return null;
    // }
}
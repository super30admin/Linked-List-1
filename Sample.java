// Problem 1: (https://leetcode.com/problems/reverse-linked-list/)
// Time Complexity : O(n) where n is the number of nodes in the linked list
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach : We start by setting prev to null and curr to the head of the linked list. Then, we enter a loop where we update the next pointer of the current node to point to the previous node (prev), move prev to curr, and move curr to the next node (nextTemp). We repeat this process until curr becomes null, at which point prev will be the new head of the reversed linked list.

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

// Problem 2: (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Time Complexity : O(n) where n is the number of nodes in the linked list
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach : We start by
// creating a dummy node and setting both slow and fast pointers to the dummy
// node. We move the fast pointer n steps ahead of the slow pointer. Then, we
// move both pointers until the fast pointer reaches the end of the linked list.
// At this point, the slow pointer will be pointing to the node before the node
// to be removed. We update the next pointer of the slow pointer to skip the
// node to be removed and return the next pointer of the dummy node.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        while (count <= n) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp = null;
        return dummy.next;
    }
}

// Problem 3: (https://leetcode.com/problems/linked-list-cycle-ii/)
// Time Complexity : O(n) where n is the number of nodes in the linked list
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach : We start by
// setting both slow and fast pointers to the head of the linked list. We then
// move the slow pointer by one step and the fast pointer by two steps. If there
// is a cycle, the slow and fast pointers will meet at some point. If there is
// no cycle, the fast pointer will reach the end of the linked list. In the case
// of a cycle, we reset the slow pointer to the head of the linked list and move
// both pointers by one step until they meet at the start of the cycle. We
// return the slow pointer as the start of the cycle.
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
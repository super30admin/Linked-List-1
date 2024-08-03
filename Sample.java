// Time Complexity : O(n) where n is number of nodes in the linked list as we need to visit each node at least once. 
// Space Complexity : O(n) as recursion stack can go as deep as the number of nodes in the list
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : followed course tutorial


// Your code here along with comments explaining your approach
// Here in this approach the base case would be if list is empty or contains only one node then we will return head. We will call the recursive reverse the rest 
// of the list starting from the second node. To re-link the nodes we can set the node's next pointer to the current node to reverse the link then set the current
// node's next pointer to null to avoid any cycles. We can solve same problem with iterative solution as well. Here we can start with two pointers prev initialized 
// to null and curr pointer initialized to head to keep track of the previous node and the current node. Then we will iterate through the list at each step  we 
// will store the next node in a temporary variable and reverse the current node's pointer to point to the previous node and then move the prev and curr pointers 
// one step forward. Once list is done then prev will point to the new head of reversed list.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        // if(head == null || head.next == null) {
        //     return head;
        // }

        // ListNode prev = null;
        // ListNode curr = head;
        // // ListNode fast = curr.next;

        // // while(fast != null) {
        // while(curr != null) {
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     // curr = fast;
        //     curr = temp;
        //     // fast = fast.next;
        // }

        // // curr.next = prev;
        // // return curr;
        // return prev;

        if(head == null || head.next == null) {
            return head;
        }

        ListNode reversed = reverseList(head.next);

        // System.out.println(head.val);

        head.next.next = head;
        head.next = null;

        return reversed;
    }
}



// Time Complexity : O(n) where n is the length of the linked list. It will be traversed twice once to advance the fast pointer and once to move both pointers to the end.
// Space Complexity : O(1) as we are not using any extra space.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : followed course tutorial


// Your code here along with comments explaining your approach
// In this approach first we will create a dummy node that points to the head of the list. Then we will initialize two pointers slow and fast both pointing to the
// dummy node. Then we will move fast pointer to n+1 steps ahead maintaining a gap of n nodes between slow and fast. Then we will move both slow and fast pointers
// one step at a time until fast pointer reaches the end of the list. At this time slow pointer will be just before the node to be removed. Then we will adjust 
// next pointer of the slow to skip the target node which will remove it from the list.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;

        while(count <= n) {
            fast = fast.next;
            count++;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;

        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
    }
}


// Time Complexity : O(n) where n is number of nodes in the list for both cycle detection and finding the cycle start.
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : followed course tutorial


// Your code here along with comments explaining your approach
// In this approach we will use slow and fast pointers. We will move the slow pointer one step at a time and fast pointer by two steps at a time. If they meet, a
// cycle exists. If a cycle is detected we will reset the fast pointer to the head and move both slow and fast pointers by one step at a time. The point where 
// they'll meet is the start of the cycle. We will return the node where slow and fast meet which will be the entry point of the cycle.

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
        boolean hasCycle = false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle) {
            return null;
        }

        fast = head;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
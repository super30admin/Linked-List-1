// # Linked-List-1

// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didnt face any problem while coding this.
// Iterative approach
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
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = head.next;

        while(temp != null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;
        return curr;

    }
}

// Recursive
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didnt face any problem while coding this.

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
        if(head == null || head.next == null) return head;
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}
// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didnt face any problem while coding this.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didnt face any problem while coding this.

// Your code here along with comments explaining your approach

// ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

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
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}



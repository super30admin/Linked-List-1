https://leetcode.com/problems/reverse-linked-list/
Reverse a Linked List:
// Time Complexity : O(n)
// Space Complexity : (1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
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
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode fast = curr.next;
            curr.next=prev;
            prev = curr;
            curr = fast;
        }
        return prev; 
    }
}


https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
Remove nth element Linked List:

// Time Complexity : O(n)
// Space Complexity : (1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


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
        ListNode dummy=new ListNode(1);
        dummy.next=head; ListNode slow=dummy; ListNode fast=dummy;
        int c=0;
        while(c<=n){
            fast=fast.next;
            c++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;                
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
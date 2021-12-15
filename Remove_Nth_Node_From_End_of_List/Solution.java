// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * We will use two pointers slow and fast so that our slow pointer will be pointing previous node of the one which is to be removed.
 * We use a dummy node which is poiting to head, so if we want to remove 1st node itself, dummy will help us
 * Initially, we will let fast pointer go ahead upto (n-1) nodesso that both slow and fast are at right positions as we want
 * Then we will push forward both slow and fast, till fast reaches last node.
 * At this time, our slow pointer is pointing to a node, which is just behind the one which we want to remove
 * So we simply remove it by slow.next = slow.next.next;
 * Now we return dummy.next as our ans
*/


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
        if(head == null || head.next == null)return null;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        while(count < n){
            fast = fast.next;
            count++;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next; 
        
    }
}
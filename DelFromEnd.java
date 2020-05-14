// Time Complexity : O(n) going over the Linked List
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Initially did a two pass algorithm.
/* Your code here along with comments explaining your approach: Keep a Gap of K+1 between the slow and fast pointer. Move the fast pointer till it
reaches the end of the list. Move the slow pointer one by one so when the fast pointer reaches the end, slow pointer would exactly K-1 steps
behind and just one step behind the node it needs to delete. Now slow knows that the next node is need to be deleted and hence it proceeds.
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;                      // Create a dummy node pointing to head so to maitain a gap of K+1 between fast and slow ptr
        ListNode fast = dummy;
        for(int i = 1; i <= n+1; i++){
            fast = fast.next;                       // Fast moves K+1 steps ahead of slow
        }
        while(fast != null){
            fast = fast.next;                       // Till fast reaches the end , move slow and fast pointers
            slow = slow.next;
        }
        slow.next = slow.next.next;             // Slow is exactly behind the node that needs to be deleted. Hence, it proceeds.
    return dummy.next;
    }
}
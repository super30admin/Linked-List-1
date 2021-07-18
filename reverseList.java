
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {

        //base case if the head is null or head is the only node then we just return it
        if(head == null || head.next == null)
            return head;
        

        ListNode prev = null;        
        ListNode curr = head;
        ListNode fast = head.next;
        
        //we keep disconnecting the link of the curr node and pointing to prev node until there are no more nodes 
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        
        return curr;
    }
}
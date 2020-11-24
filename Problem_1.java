// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public ListNode reverseList(ListNode head) {    
        
        if(head == null || head.next==null) return head;
        
        ListNode curr = head;
        ListNode fast = head.next;
        ListNode prev = null;
        
        while(fast!= null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        
        return curr;
        
        
    }
}
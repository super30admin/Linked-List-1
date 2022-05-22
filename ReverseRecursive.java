// Time Complexity : O(n)
// Space Complexity : O(n) //recurisve stack
// Did this code successfully run on Leetcode : yes
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        ListNode reversed = reverseList(head.next);
        head.next.next= head;
        head.next = null;
        
        return reversed;
        
    }
 
}
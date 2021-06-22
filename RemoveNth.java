// Time Complexity :  O(N) 
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return new ListNode();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        for(int i = 0 ; i<= n ;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
    
        slow.next = slow.next.next;
        return dummy.next;  
    } 
}
// Time Complexity : O(n)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        dummy.next = head;
        
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
         return dummy.next;
    }
    
   
}
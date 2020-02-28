// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve before class


// Your code here along with comments explaining your approach
//initialize dummyHead pointing to head.next
//keep first pointer at head and increment until n>0
//keep second pointer at dummyHead so that the difference between first and second pointer is n
//increment both first and second until first reaches null
//after that delete the node and increment second by 2
//return dummy node . next

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first = head, second = dummy;
        
        int count = n;
        while(count > 0){
            first = first.next;
            count--;
        }
        
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        return dummy.next;
        
    }
}
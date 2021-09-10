// Time Complexity : O(n) n is length of linkedlist
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
1. take two pointers first and second
2. move first by one till count < n
3. now move both points by one untill first point reaches at end 
4. in this way your second pointer will be just a index ahead the Nth element(deleted) 
5. just set the next of this element to next.next

class Solution {
    // one pass solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        if(head == null)
            return dummy.next;
        
        int count =0;
        while(count<=n)
        {
            first = first.next;
            count++;
        }
        
        while(first != null)
        {
           first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        
        return dummy.next;
    }
}
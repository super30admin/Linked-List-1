// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution { 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy, fast = dummy;
        dummy.next = head;
        
        int counter = 0;
        
        //create the distance
        while(counter <= n){
            fast = fast.next;
            counter++;
        }
        
        //iterate both pointers till fast reached end
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}



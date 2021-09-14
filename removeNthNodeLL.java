// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Reducing n at the right place

public class removeNthNodeLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //slow and fast ptrs
        ListNode slow, fast;
        slow = fast = head;
        while(slow != null && slow.next != null) {
            if(n<=0) {
                fast = fast.next;
            }
            slow = slow.next;
            //reduce n by 1
            n--;
            
        }
        if(n > 0 )
            head = head.next;
        else
            fast.next = fast.next.next;
        
        return head;
    } 
}

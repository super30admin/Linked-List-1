// Time Complexity: O(n)
// Space complexity: O(1)

// Approach: 
// The intuition is that to be able to locate the n th node to be removed from the end of the LL,
// we need to have the slow and fast pointer in such a way that there is a gap of 'n' nodes between them.
// We add a dummy node to handle edge case, and connect it to the head of the LL
// Start count at 0 and slow and fast pointers at dummy, but only move fast pointer until count<=n
// When fast pointer is at count<=n th node, we move the slow pointer and fast pointer one by one
// till the fast pointer reached the end of the LL
// The slow pointer will be one node before the nth node to be removed, so we do slow.next=slow.next.next
// Finally, return dummy.next because that is the original head of the LL

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy=new ListNode(-1); //dummy to handle edge case of the removal of the actual head
        dummy.next=head; //connect dummy to head
    
        //start slow and fast at the dummy
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        int count=0;
        
        // move fast until count<=n
        while(count<=n){
            count++;
            fast=fast.next;
        }
        //when fast is at count<=n, start slow from dummy and move slow and fast one by one
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        // slow is 1step behind element to be removed, remove the connection
        slow.next=slow.next.next;
        
        // return head of LL
        return dummy.next;
        
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Calculate length of the list in one iteration
// go to (size-n) and remove node 

class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next==null){
            return null;
        }
        
        int size=0;
        ListNode curr= head;

        while(curr!=null){
            curr=curr.next;
            size++;
        }

        if(size==n){
            return head.next;
        }

        int targetIndex=size-n;

        ListNode prev= head;

        for(int i=1; i<targetIndex; i++){
            prev=prev.next;
        }

        prev.next=prev.next.next;

        return head;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Place 2 pointer at head. Create a gap of n between the 2 pointers.
// now iterate both the pointers at same speed until 2nd pointer is at last node.
// now 2st pointer is exactly at size-n poisition so remove it.
// if 2nd pointer reaches null before creating gap then it means n=length so remove first node.


class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow=head, fast=head;

        
        for(int i=0; i<n; i++){
            fast=fast.next;
        }

        if(fast==null){
            return head.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return head;
    }
}


// We want to handle the edge case of removing head without doing head.next
// We maintain a dummy node for this purpose.
// place fast on dummy move it n+1 times.
// place slow on dummy. move slow and fast a same pace.
// if fast becomes null just after creation of gap it will be directly taken care of by slow.
// remove the next of slow at last.



class Solution3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy= new ListNode();
        
        ListNode slow=dummy, fast=dummy;

        dummy.next=head;

        for(int i=0; i<=n; i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
    }
}
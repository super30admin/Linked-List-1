// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//In this approach we take a dummy node and start the slow and fast pointer from that dummy node
//we also maintain a count and move the fast pointer till count reaches n. They we move both slow and fast till fast is null and we will get 
//slow exactly one node before the node that we want to delete. we make slow's next as next of its next and we return the dummy.next
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        int count = 0;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while(count<=n){
            count++;
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

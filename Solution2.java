// Time Complexity :O(n) traverse the whole list
// Space Complexity :O(1) no extra space needed
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution2{
     // Definition for singly-linked list.
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        
        int count=0;
        // using a dummy node to maintain code consistency when 1st node is to be deleted.
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        // move the fast pointer to keep a distance of n between slow and fast pointer
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

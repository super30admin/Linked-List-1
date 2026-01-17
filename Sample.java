// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Problem https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

// Your code here along with comments explaining your approach
// Time complexity : O(2n)
// Space complexity :O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        // First we go through the list once to count the nodes.
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        // move count - n steps, stopping right before the node we need to remove.
        count = count - n;
        curr = head;
        if(count==0) return head.next;
        // run the loop to stop right before the node we need to remove.
        while(count>1){ 
            count--; 
            curr = curr.next; 
        }
        // Lastly we skip that node by relinking pointers, and the list is neatly fixed.
        ListNode temp = curr.next;
        curr.next = curr.next.next;
        temp.next = null;
        return head;
    }
}
// Time complexity : O(n)
// Space complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Approach : Maintaining a gap of n nodes when fast is move to n+1 steps
// then between slow and fast there is a gap of n nodes so to maintain that gap fast and slow are moved together 
// and where slow is stopped is one node before the node which should be removed.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        // move the fast till gap is n nodes
        while(count<=n){
            count++;
            fast = fast.next;
        }
        // then move both slow and fast till fast is not null so that slow stop one node before node to delete
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        // reconnect the pointers to remove the node
        ListNode temp = slow.next;
        if(temp!=null){
            slow.next = temp.next;
            temp.next = null;
        }
        
        return dummy.next;
    }
}
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
// approach: we use a dummy element before the head so as to handle the case where we remove the head.we start fast and slow fromt the
//summy node.we iterate the fast first so that the diff between slow and fast is equal to n. then we move slow,fast simultaneously until
//fast is null.then slow will be at the position where the next element needs to be removed, so we remove that.

// Your code here along with comments explaining your approach
public class removenelement {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        int count=0;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=new ListNode();
        temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        return dummy.next;
        
    }
}
    
}

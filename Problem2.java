// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach

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
        ListNode dummy= new ListNode(-1);//dummy node in case of n> size of the list
        dummy.next=head;
        
        ListNode slow= dummy;
        ListNode fast=dummy;
        
        for(int i=0;i<n;i++)
        {
          fast=fast.next;  //fast pointer will be n steps ahead
        }
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;//slow will reach at n+1 from the end.
        }
        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        
        return dummy.next;
        
        
    }
}
        
    }
}
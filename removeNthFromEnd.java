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
// Time Complexity: O(n)
// Space Complexity: O(1)
//19. Remove Nth Node From End of List
// Two pass solution
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || (head.next==null && n==1))
            return null;
        
        int len=0;
        ListNode node=head;
        while(node!=null)
        {
            len++;
            node=node.next;   
        }
        int index=len-n;
        node=head;
        if(index==0)
            return head.next;
            
            
        for(int i=1;i<index;i++)
        {
            node=node.next;
        }
        node.next=node.next.next;
        
        return head;
    }
}*/
// One pass solution
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || (head.next==null && n==1))
            return null;
        
        int len=0;
        ListNode slow=head;
        ListNode fast=head;
        // maintain 'n' gap between fast and sloe pointers
       for(int i=1;i<=n;i++)
        {
            fast=fast.next;   
        }
        if(fast==null)
            return head.next;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;    
        return head;
    }
}
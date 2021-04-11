/*
Run time complexity - O(N) where N is the number of elements in the list
Space complexity - O(1) No extra space is used and no recusive function is used.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null || fast.next==null)
            return null;
        fast=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    
    private ListNode getcycle(ListNode head)
    {    
        // Option - 2 (Use additional space)
        
        HashSet<ListNode> set1= new HashSet<ListNode>();
        if(head==null)
            return null;
        while(head!=null)
        {
            if(set1.contains(head))
            {
                return head;
            }
            else
            {
                set1.add(head);
            }
            head=head.next;
        }
        return null;  
    }
}

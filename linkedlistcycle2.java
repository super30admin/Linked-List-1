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
    public ListNode detectCycle(ListNode head)
    {
     
        if(head==null) return null;
        
        ListNode s =head;
        ListNode f =head;
        
        
        while(s!=null && f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f) 
                break;
        }
        
        if(f==null || f.next==null) return null;
        s = head;
        while(f!=s)
        {
            f=f.next;
            s=s.next;
            
        }
        return s;
    }
}
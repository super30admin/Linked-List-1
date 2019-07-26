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
        if(head==null) return null;
       if(head.next == null) return null; 
        ListNode s = head.next;
        ListNode f = head.next.next;
        
        while(f!=null && f.next!=null)
        {
            if(s==f)
                break;
             s = s.next;
             f = f.next.next;
        }
        
        if(s==null ||s!=f)
            return null;
        
        ListNode ptr1 =head;
        
            while(s!=ptr1){
                ptr1 = ptr1.next;
                s = s.next;
            }
            return ptr1;
     
    }
    
   
}

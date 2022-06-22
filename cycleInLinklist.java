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
      //TC: O(n) sc O(1)
        ListNode slow=head;
        ListNode fast=head;
       
        if(head==null || head.next==null)
            return null;
        while(slow!=null &&fast!=null){
            if(fast.next==null)return null;
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                break;}
        }
        ListNode temp=head;
                while(slow!=temp){
                    slow=slow.next;
                temp=temp.next;
            }
             return temp;
    }
        
        return null; 
    }
        
}

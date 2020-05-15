Leetcode: 19. Remove Nth Node From End of List

//Time Complexity : O(n) // n is number of nodes n LinkedList
//Space Complexity: O(1) 


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        ListNode dummy= new ListNode(-1);
        dummy.next = head;
        ListNode slow= dummy;
        ListNode fast= dummy;
        
        int count =0;
        while(fast!=null){
            if(count<=n){
                fast=fast.next;
                count++;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        if(slow==dummy) return head.next;
         slow.next= slow.next.next;
        return head;
        
        
    }
}

=================================================
//Time Complexity : O(n) // n is number of nodes n LinkedList
//Space Complexity: O(1) 
Without using Dummy Node:

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
              
        ListNode slow= null;
        ListNode fast= head;        
        int count =1;
        while(fast!=null){
            if(count<=n){
                fast=fast.next;
                count++;
            }
            else{
                if(slow==null){
                    slow = head;
                }else{
                    slow=slow.next;
                }
                
                fast=fast.next;
            }
        }
        if(slow==null) return head.next;
         slow.next= slow.next.next;
        return head;
        
        
    }
}

==============================================

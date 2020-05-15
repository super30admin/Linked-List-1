// 142. Linked List Cycle II
// Using HashSet:
//space Complexity: O(n) 
//Time Complexity : O(n) 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }
        HashSet<ListNode> hs= new HashSet<>();
        
        while(head!=null){
            if(hs.contains(head)){
                return head;
            }
            else{
                hs.add(head);
            }
            head=head.next;
        }
        return null;
    }
}

==============================================

//Using slow and fast pointer, floyd's Algo:
//space Complexity: O(1) 
//Time Complexity : O(2n) // where n is the no of nodes in Linkedlist.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }     
        ListNode fast= head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null  ){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
            
        }
     
       if(fast==null || fast.next==null){
            return null;
        }
        if(fast==slow){
            slow= head;
        }
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
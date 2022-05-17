/**
 * 
 o(n) time || o(n) space
 * 
 */
public class Solution {
    
    private ListNode getIntersect(ListNode head){
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        while(slowPointer!=null && fastPointer.next!=null){
                    slowPointer= slowPointer.next;
                    fastPointer=fastPointer.next.next;
            if(slowPointer==fastPointer){
                    return slowPointer;
            }
            
        }
        return null;
        
    }
    public ListNode detectCycle(ListNode head) {
         
        
          if(head==null){
                return null;
        }
    ListNode intersect=getIntersect(head);
        if(intersect ==null){
            return null;
        }
        
        
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        
        while(ptr1!=ptr2){
            ptr1= ptr1.next;
            ptr2 = ptr2.next;
            
        }
        return ptr1;
    
    
    
    }
    
    
}

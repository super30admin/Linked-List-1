//TC O(n)
//SC o(1)
public class Problem2 {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        Boolean hasCycle=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                hasCycle=true;
                break;
            }   
        }
        
        if(!hasCycle){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
      return slow;
    } 
}

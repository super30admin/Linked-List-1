//T.C = O(N)
// S.C = O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                hasCycle=true;
                slow=head;
                break;
            }
        }   
        if(hasCycle){
               while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        }else return null; 
        
    }
}

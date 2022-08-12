//TC:O(n)
//SC:O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow ==fast){
                flag = true;
                //since its a cycle **dont forget** if you dont break it will still be in loop
                break;
            }
       
        }
        //check if the cycle exist , if not return null
        if(flag==false){
            return null;
        }
        //reset the slow to head , since distance from head to cycle entrance == distance from intersection to cycle entrance
        slow = head;
    
        //move slow and fast by 1 node each and when both meet again return the index of any of the pointer
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
         
        }
        
        return slow;
    }
}
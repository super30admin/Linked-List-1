//  TC : O(n)
//  SC : O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;

        boolean flag = false;

        while(fast!= null && fast.next != null){ //checking for even and odd length lists
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(!flag) return null;


        //cycle  head is equidistant from the point of contact of slow & fast AND list head 
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
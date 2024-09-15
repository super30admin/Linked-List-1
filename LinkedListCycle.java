/*
Time Complexity- O(n)
Space Complexity - O(1)
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //edge case
        if(head ==null || head.next == null)
            return head;
        
        ListNode fast = head, slow= head;
        boolean isCycle = false;
        while(true){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isCycle= true;
                break;
            }
        }
        if(!isCycle)
            return null;
        if(isCycle){
            slow = head;
            while(slow != fast){
                fast= fast.next;
                slow = slow.next;
            }   
        }
       return slow;
    }
}

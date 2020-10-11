public class Solution {//class Floyd's algorithm time of O(n) space constant
    public ListNode detectCycle(ListNode head) {
        //Base case
        if(head== null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        //finding the cycle
        while(fast!=null &&fast.next !=null){
            
            slow = slow.next;
            fast = fast.next.next ;
            //finding the exact node for the cycle
            if(slow == fast){
                ListNode start = head;
                while(start!=slow){
                    slow = slow.next;
                    start = start.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
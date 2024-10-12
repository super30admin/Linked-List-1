// Time Complexity : The time complexity for this problem would be O(n).
// Space Complexity : Since except for the node no other data structures were used. hence the space Complexity would be O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : N/A




public class LLCycle {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return null;
        
        ListNode slow = head;
        ListNode fast = slow;
        boolean flag = false;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }

        if(!flag) return null;
        
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
        
    }
}
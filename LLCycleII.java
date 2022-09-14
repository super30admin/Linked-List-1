public class LLCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        
        // To find the cycle
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                flag = true;
                break;
            }
        }
        
        if(!flag) return null;
        slow = head;
        
        // To find the start of the cycle
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        
        

        boolean flag= false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        return null;
        fast = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

//Time Complexity (TC): O(n) 
//Space Complexity (SC): O(1) 
public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                flag=true;
                break;
            }
        }

        if(!flag) return null;
        
        slow=head;

        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
    return slow;
    }
}

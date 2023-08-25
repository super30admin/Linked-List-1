public class LinkedListCycleII {
    //Time Complexity = O(n)
    // Space Complexity = O(1)
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null || fast.next==null)
            return null;

        ListNode list1=head;
        ListNode list2=slow;

        while(list1!=list2){
            list1=list1.next;
            list2=list2.next;
        }
        return list2;

    }
}

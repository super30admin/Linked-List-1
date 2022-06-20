//Time Complexity=O(n)
//Space Complexity=O(1)
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        if(head==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }

        if(!flag) return null;
        slow=head;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
}

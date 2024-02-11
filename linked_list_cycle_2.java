//Time - O(N)
//Space - O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(!cycle){
            return null;
        }
        ListNode curr = head;
        while(curr!=slow){
            curr = curr.next;
            slow=slow.next;
        }
        return curr;

    }
}

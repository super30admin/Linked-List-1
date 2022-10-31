package s30.linkedList.linkedList1;

import s30.linkedList.ListNode;


// Time Complexity O(n)
// Space Complexity O(1)
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow== fast) break;
        }

        if(fast == null || fast.next == null) return null;

        while(slow != head){
            slow = slow.next;
            head = head.next;
        }

        return slow;
    }
    public static void main(String[] args) {

    }
}

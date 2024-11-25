// Time Complexity :O(n) (n amount and c is umber of coins )
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag =true;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                flag = false;
                break;
            }
        }
        if(flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast= fast.next;
        }

        return slow;
    }
}

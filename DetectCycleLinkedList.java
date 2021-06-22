// Time Complexity : O(n)), 
// Space Complexity : O(1),
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package linkedList1;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycleLinkedList {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            System.out.println("slow node" + slow);
            fast = fast.next;
            System.out.println("fast node" + fast);
        }
        return fast;
    }
}

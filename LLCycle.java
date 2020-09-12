// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//1.Keep track of slow and fast pointer until you reach the intersection point.
//2. Keep moving those until they reach a loop in a Linked List.
public class LLCycle {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int ele) {
            data = ele;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        ListNode intersect = getIntersect(head);

        if (intersect == null) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = intersect;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;

    }

    private ListNode getIntersect(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return slow;
        }

        return null;
    }

    public static void main(String args[]) {
        LLCycle obj = new LLCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next = head.next;

        System.out.println(obj.detectCycle(head).data);

    }
}
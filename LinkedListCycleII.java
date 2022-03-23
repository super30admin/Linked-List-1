// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH:
1. To detect cycle: take slow and fast pointers starting from head, move slow as slow.next and fast as fast.next.next, if they meet the list contains cycle.
2. To find the start of the clycle, take the fast pointer to the head. now increment both fast and slow simultaneously, wherever they meet is the head of the cycle.
Intuition is = distance travelled by fast(a+b+c+b) = 2(distance travelled by slow(a+b)) => a=c
a= distance from head to start of the cycle
b= distance from start of the cycle to pointer where noth fast and slow meet
c= distance from pointer where noth fast and slow meet to start of the cycle
 */
public class LinkedListCycleII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static String listToString(ListNode head){
        String retStr = "Contents:\n";
        ListNode current = head;
        while(current != null){
            retStr += current.val + "\n";
            current = current.next;
        }
        return retStr;
    }


    public static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        boolean flag = false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) { // that means cycle is not there, we need to check both fast and fast.next to be not null because we are moving it by 2 spaces
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true; //there is a cycle
                break;
            }
        }
        if (!flag) return new ListNode(-1); //returning null and not -1 as return type is ListNode
        fast = head; //resetting one pointer at the head
        while (slow != fast) {
            //moving both poiters at 1x speed till they meet
            slow = slow.next;
            fast = fast.next;
        }
        return slow; //return either fast or slow
    }

    public static void main(String[] args){
        ListNode head = new ListNode(3);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(0);
        ListNode next3 = new ListNode(-4);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next1;
        System.out.println(detectCycle(head).val);

        ListNode head1 = new ListNode(1);
        ListNode next11 = new ListNode(2);
        head1.next = next11;
        next11.next = head1;
        System.out.println(detectCycle(head1).val);

        ListNode head2 = new ListNode(1);
        System.out.println(detectCycle(head2).val);

    }
}

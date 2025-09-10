//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode :Yes
//Approach: Let's take two pointers, slow (moves at 1X speed) and fast (moves at 2X speed), think of a cycle as a circle
//if there's a cycle, the two pointers will coincide. At which point we will move either of the two pointers back to the head
//and move both pointers at 1X speed, when these two pointers are at the same node, that's where the cycle will start
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head, fast = head;

        //think of a linked list as a circle, slow and fast will coincide if there's a cycle
        //fast != null for even length linked list, fast.next != null for odd length linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag) return null;

        //reset one of the pointers back to the head
        fast = head;

        //run the loop until they become the same
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        //return slow or fast, doesn't matter
        return slow;
    }

    public static void main(String[] args) {
        final LinkedListCycleII cycle = new LinkedListCycleII();
        ListNode last = new ListNode(6);
        ListNode second = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, last))));
        last.next = second;
        ListNode head = new ListNode(1, second);

        ListNode output = cycle.detectCycle(head);
        System.out.println(output.val);
    }
}

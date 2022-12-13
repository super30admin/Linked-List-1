public class Leetcode19 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode t1 = dummy;
        ListNode t2 = dummy;
        int count = 0;

        // moving the t2 to create a gap between t1 and t2 eqivalent to n
        while (count <= n) {
            t2 = t2.next;
            count++;
        }

        // this is to move t1 to postion, after which the node we need to remove lies
        // here we are moving both t1 and t2 with 1x speed.
        while (t2 != null) {
            t1 = t1.next;
            t2 = t2.next;
        }

        t1.next = t1.next.next;

        return dummy.next;

    }
}

// tc-->O(n)
// sc--->O(1)
// One pass solution
// here in this solution we are takinhg the dummy node hence we do not have to
// deal with deletion of node when there is only one node in the list, and this
// is because we are returning the dummu.next at the end and this will take of
// this case also.

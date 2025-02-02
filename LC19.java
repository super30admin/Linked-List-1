// Approach 1
// TC: O(N)
// SC: O(N)

// Approach 2
// TC: O(N)
// SC: O(1)

import java.util.ArrayList;

// Approach 1
public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
            size++;
        }
        if (n == size)
            return head.next;
        list.get(size - n - 1).next = list.get(size - n - 1).next.next;
        return head;
    }
}

// Approach 2
class LC19_1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode slow = dummyNode, fast = head;
        int len = n;
        while (len > 0) {
            fast = fast.next;
            len--;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
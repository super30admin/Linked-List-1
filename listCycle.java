// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Main {
    public static ListNode detectCycle(ListNode head) {
        // null case
        if (head == null)
            return null;

        // fast pointer slow pointer
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        // make fast pointer take two steps at a time and slow pointer one step at a
        // time
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            // if fast and slow collide we break the loop
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        // if there is no loop we return null;
        if (!flag)
            return null;
        // to find the intersection one pointer at the start and another at collision of
        // the list
        slow = head;
        // when both pointer collide we found our index of collision
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode result = detectCycle(head);
        System.out.print(result.val);
    }
}
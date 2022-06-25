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
    public static ListNode reverseList(ListNode head) {
        // to store already reversed elements
        ListNode prev = null;
        // current head
        ListNode curr = head;
        // while current is null that means traverse till end
        while (curr != null) {
            // to preseve curr node
            ListNode dummy = curr;
            // curr = curr.next
            curr = curr.next;
            // point dummy node to prev reversed list
            dummy.next = prev;
            prev = dummy;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseList(head);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.print("null");

    }
}
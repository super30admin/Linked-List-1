// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach



/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head);
        // return helperBruteForce(head);
        // return helperRecursion(null, head);
        // return helperPureRecursion(head);
    }

    private ListNode helperPureRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
       

        ListNode result = helperPureRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }

    private void print(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }

    }

    private ListNode helper(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = null;

        while (curr != null) {
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        return prev;
    }

    private ListNode helperRecursion(ListNode prev, ListNode curr) {

        if (curr == null) {
            return prev;
        }

        ListNode fast = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fast;

        return helperRecursion(prev, curr);
    }

    private ListNode helperBruteForce(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> s1 = new Stack<>();
        while (head != null) {
            s1.add(head);
        }

        ListNode temp = null;
        while (!s1.isEmpty()) {
            temp = s1.pop();
            temp = temp.next;
        }

        return temp;
    }

}
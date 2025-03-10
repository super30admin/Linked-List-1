// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }
        boolean hasCycle = false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return null;
        }
        fast = head;
        while (fast != null) {
            System.out.println("loop2");
            if (fast == slow){
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode resultHead = null;
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        reverseList(head, null);
        return resultHead;
    }

    private void reverseList(ListNode curr, ListNode prev) {

        if (curr.next == null) {
            resultHead = curr;
            curr.next = prev;
            return;
        }
        ListNode temp = curr.next;
        curr.next = prev;
        prev=curr;
        curr=temp;
        reverseList(curr, prev);
        return;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr= curr.next;
        }
        int diff = count-n;
        int i=0;
        curr = head;
        if (diff == 0) {
            head=head.next;
            return head;
        }
        while (i<diff-1) {
            curr=curr.next;
            i++;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }
}

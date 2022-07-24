// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
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
class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if (head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        //make current next point to the prev node to reverse the list
        curr.next = prev;

        return curr;

// recursive approach, time complexity - O(n), space complexity - O(n)
//         if(head == null || head.next == null) return head;

//         ListNode reversed = reverseList(head.next);

//         //stack pop happens
//         head.next.next = head;
//         head.next = null;

//         return reversed;
    }
}
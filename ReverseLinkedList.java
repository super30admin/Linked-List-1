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
    ListNode reversed;

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        reversed = reverseList(head.next);
        // head will be on second last node.
        head.next.next = head;
        head.next = null;
        return reversed;


//         if(head ==null) return null;
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode fast = curr.next;

//         while(fast!=null){
//             curr.next = prev;
//             prev = curr;
//             curr=fast;
//             fast = fast.next;
//         }
//         curr.next = prev;
//         return curr;

    }
}